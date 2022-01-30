/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.nio.charset.Charset;
import java.util.List;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteWatchdog;
import org.apache.commons.exec.PumpStreamHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * 
 * @author wupf
 *
 */
public class JpfProcssWork  {
	private final  Logger logger = LoggerFactory.getLogger(JpfOsUtil.class);
	/**
	 * 
	 * @category:
	 * @Title: runexec
	 * @Author:wupf@
	 * @date:2020年3月17日
	 * @param strStartPath
	 * @param strCmd
	 * @throws Exception
	 */
	public void runexec(String strStartPath, String strCmd) throws Exception {
		if (JpfOsUtil.isWindows()) {
			runCmd(strStartPath, strCmd, "");
		} else {
			runShellWith(strStartPath, strCmd);
		}
	}

	/**
	 * 
	 * @category:
	 * @Title: runexec
	 * @Author:wupf@
	 * @date:2020年3月17日
	 * @param strStartPath
	 * @param strCmd
	 * @param sbError
	 * @throws Exception
	 */
	public void runexec(String strStartPath, String strCmd, StringBuilder sbError) throws Exception {
		if (JpfOsUtil.isWindows()) {
			runCmd(strStartPath, strCmd, sbError);
		} else {
			runShell(strStartPath, strCmd, sbError);
		}
	}

	/**
	 * 
	 * @category 功能
	 * @param strStartPath
	 * @param strCmd
	 * @param listMsg
	 * @return
	 * @throws Exception
	 * @author wupf
	 * @Date :2020年11月24日上午8:51:39
	 */
	public boolean runexec(String strStartPath, String strCmd, List<String> listMsg) throws Exception {
		if (JpfOsUtil.isWindows()) {
			return runCmd(strStartPath, strCmd, listMsg);
		} else {
			return runShell(strStartPath, strCmd, listMsg);
		}
	}

	/**
	 * @category
	 * @param strStartPath
	 * @param strCmd
	 * @param listMsg
	 * @since 2020年1月6日 
	 * @author wupf
	 */
	private boolean runShell(String strStartPath, String strCmd, List<String> listMsg) throws Exception {
		boolean bResult = false;
		Process process = null;
		try {
			String[] cmd = null;
			if (strStartPath == null) {
				cmd = new String[] { "/bin/sh", "-c", strCmd };
			} else {
				cmd = new String[] { "/bin/sh", "-c", "cd " + strStartPath + "  && " + strCmd };
			}
			process = Runtime.getRuntime().exec(cmd);
			bResult = getInfo(process, listMsg);
			process.waitFor();
			if (process.exitValue() != 0) {
				logger.error(" Failed to run cmd, exit value is " + process.exitValue());
			}
		} catch (Exception e) {
			logger.error("runShell",e);
		} finally {
			JpfCloseUtil.destroyProcess(process);
		}
		return bResult;

	}

	/**
	 * @category
	 * @param strStartPath
	 * @param strCmd
	 * @param listMsg
	 * @since 2020年1月6日 
	 * @author wupf
	 */
	private boolean runCmd(String strStartPath, String strCmd, List<String> listMsg) {
		Process process = null;
		boolean bResult = false;

		try {
			if (strStartPath == null) {
				strCmd = "cmd /c " + strCmd;
			} else {
				strCmd = "cmd /c " + strStartPath.substring(0, 2) + " && cd " + strStartPath + "  && " + strCmd;
			}
			logger.debug(strCmd);

			process = Runtime.getRuntime().exec(strCmd);
			bResult = getInfo(process, listMsg);
			process.waitFor();
			if (process.exitValue() != 0) {
				logger.error(" Failed to run cmd, exit value is " + process.exitValue());
			}
		} catch (Exception e) {
			logger.error("runCmd",e);
		} finally {
			JpfCloseUtil.destroyProcess(process);
		}
		return bResult;
	}

	/**
	 * @category
	 * @param process
	 * @param listMsg
	 * @since 2020年1月6日 
	 * @author wupf
	 */
	private boolean getInfo(Process process, List<String> listMsg) throws Exception {
		BufferedReader br2 = null;
		InputStream is2 = null;
		boolean bResult = false;
		StringBuilder sb = new StringBuilder();
		String linesep = System.getProperty("line.separator");
		try {
			final InputStream is1 = process.getInputStream();
			// 启动单独的线程来清空p.getInputStream()的缓冲区
			new Thread(new Runnable() {
				@Override
				public void run() {
					BufferedReader br = new BufferedReader(new InputStreamReader(is1));
					try {
						String line = null;
						while ((line = br.readLine()) != null) {
							// System.out.println(line);
							JpfMatchUtil.showCmdMsg(line, listMsg);
							sb.append(line).append(linesep);
						}
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						JpfCloseUtil.close(br);
						JpfCloseUtil.close(is1);
					}
				}
			}).start();
			is2 = process.getErrorStream();
			br2 = new BufferedReader(new InputStreamReader(is2));

			String line = null;
			while ((line = br2.readLine()) != null) {
				JpfMatchUtil.showCmdMsg(line, listMsg);
				sb.append(line).append(linesep);
			}
			if (sb.indexOf("[INFO] BUILD SUCCESS") > 0) {
				bResult = true;
			}
			sb.setLength(0);
		} catch (Exception e) {
			logger.error("getInfo",e);
			throw e;
		} finally {
			JpfCloseUtil.close(br2);
			JpfCloseUtil.close(is2);
		}
		return bResult;
	}

	/**
	 * 
	 * @param strStartPath
	 * @param strCmd
	 * @param sbError
	 * @throws Exception Author:wupf 2020年3月29日
	 *
	 */
	public void runexecWithResult(String strStartPath, String strCmd, StringBuilder sbMsg) throws Exception {
		if (JpfOsUtil.isWindows()) {
			runCmdWithResult(strStartPath, strCmd, sbMsg);
		} else {
			runShellWithResult(strStartPath, strCmd, sbMsg);
		}
	}

	/**
	 * 
	 * @author wupf@aliyun.com
	 * @param strCmd 2020年3月1日
	 */
	private void runCmd(String strStartPath, String strCmd, String strKey) throws Exception {
		Process process = null;

		try {
			String strNewCmd = "";
			strStartPath = strStartPath.trim();
			logger.debug("strStartPath:" + strStartPath);
			logger.debug("strCmd:" + strCmd);
			if (strStartPath == null) {
				strNewCmd = "cmd /c " + strCmd;
			} else {
				strNewCmd = "cmd /c " + strStartPath.substring(0, 2) + " && cd " + strStartPath + "  && " + strCmd;
			}
			logger.debug(strNewCmd);
			process = Runtime.getRuntime().exec(strNewCmd);
			process.getOutputStream().close();
			final InputStream is1 = process.getInputStream();

			// 启动单独的线程来清空p.getInputStream()的缓冲区
			new Thread(new Runnable() {
				@Override
				public void run() {
					BufferedReader br = new BufferedReader(new InputStreamReader(is1, Charset.forName("GBK")));
					try {
						String line = null;
						while ((line = br.readLine()) != null) {
							if (strKey != null && strKey.trim().length() > 0) {
								if (line.indexOf(strKey) < 0) {
									System.out.println("1:" + line);
								}
							} else {
								System.out.println("1:" + line);
							}
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}).start();

			InputStream is2 = process.getErrorStream();
			BufferedReader br2 = new BufferedReader(new InputStreamReader(is2, Charset.forName("GBK")));

			try {

				String line = null;
				while ((line = br2.readLine()) != null) {
					if (strKey != null && strKey.trim().length() > 0) {
						if (line.indexOf(strKey) < 0) {
							System.out.println("2:" + line);
						}
					} else {
						System.out.println("2:" + line);
					}
				}
			} finally {
				JpfCloseUtil.close(is2);
			}

			process.waitFor();

		} catch (Exception e) {
			logger.error("runCmd",e);
			throw e;

		} finally {
			JpfCloseUtil.destroyProcess(process);
		}
	}

	/**
	 * 
	 * @author wupf@aliyun.com
	 * @param strCmd 2020年3月1日
	 */
	private void runCmd(String strStartPath, String strCmd, StringBuilder sb) throws Exception {

		Process process = null;
		try {
			sb.setLength(0);
			// logger.debug(strStartPath);
			if (strStartPath == null) {
				strCmd = "cmd /c " + strCmd;
			} else {
				strCmd = "cmd /c " + strStartPath.substring(0, 2) + " && cd " + strStartPath + "  && " + strCmd;
			}
			logger.debug(strCmd);

			process = Runtime.getRuntime().exec(strCmd);
			getInfo(process, sb);
			process.waitFor();
			if (process.exitValue() != 0) {
				logger.error(" Failed to run cmd, exit value is " + process.exitValue());
			}
		} catch (Exception e) {
			logger.error("runCmd",e);
		} finally {
			JpfCloseUtil.destroyProcess(process);
		}
	}

	/**
	 * 
	 * @param process
	 * @param sb
	 * @throws Exception
	 */
	private void getInfo(Process process, StringBuilder sb) throws Exception {
		BufferedReader br2 = null;
		InputStream is2 = null;

		try {
			final InputStream is1 = process.getInputStream();
			// 启动单独的线程来清空p.getInputStream()的缓冲区
			new Thread(new Runnable() {
				@Override
				public void run() {
					BufferedReader br = new BufferedReader(new InputStreamReader(is1));
					try {
						String line = null;
						while ((line = br.readLine()) != null) {

							System.out.println("1:" + line);
							// TextAreaLogAppender.info(line);
							sb.append(line).append(SysInfoUtils.LINE_SEPARATOR);

						}
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						JpfCloseUtil.close(br);
						JpfCloseUtil.close(is1);
					}
				}
			}).start();
			is2 = process.getErrorStream();
			br2 = new BufferedReader(new InputStreamReader(is2));

			String line = null;
			while ((line = br2.readLine()) != null) {
				System.out.println("2:" + line);
				// TextAreaLogAppender.info(line);
				sb.append(line).append(SysInfoUtils.LINE_SEPARATOR);
			}

		} catch (Exception e) {
			logger.error("getInfo",e);
			throw e;
		} finally {
			JpfCloseUtil.close(br2);
			JpfCloseUtil.close(is2);
		}
	}

	/**
	 * 
	 * @param strStartPath
	 * @param strCmd
	 * @param sb
	 * @throws Exception Author:wupf 2020年3月29日
	 *
	 */
	private void runCmdWithResult(String strStartPath, String strCmd, StringBuilder sb) throws Exception {

		try {
			String lineSeparator = System.getProperty("line.separator");
			sb.setLength(0);
			// logger.debug(strStartPath);
			if (strStartPath == null || strStartPath.trim().length() == 0) {
				strCmd = "cmd /c " + strCmd;
			} else {
				strCmd = "cmd /c " + strStartPath.substring(0, 2) + " && cd " + strStartPath + "  && " + strCmd;
			}
			logger.debug(strCmd);
			Process process = Runtime.getRuntime().exec(strCmd);
		
			final InputStream is1 = process.getInputStream();
			// 启动单独的线程来清空p.getInputStream()的缓冲区
			new Thread(new Runnable() {
				@Override
				public void run() {
					BufferedReader br = new BufferedReader(new InputStreamReader(is1, Charset.forName("GBK")));
					try {
						String line = null;
						while ((line = br.readLine()) != null) {
							sb.append(line).append(lineSeparator);

						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}).start();
			InputStream is2 = process.getErrorStream();
			BufferedReader br2 = new BufferedReader(new InputStreamReader(is2, Charset.forName("GBK")));

			String line = null;
			while ((line = br2.readLine()) != null) {
				sb.append(line).append(lineSeparator);
			}

			process.waitFor();
			JpfCloseUtil.destroyProcess(process);
		} catch (Exception e) {
			logger.error("runCmdWithResult",e);
			throw e;

		}
	}

	/**
	 * 
	 * @author wupf@aliyun.com
	 * @param strPomFilePath
	 * @param strCmd
	 * @throws Exception 2020年3月26日
	 */
	private void runShell(String strPomFilePath, String strCmd, StringBuilder sbError) throws Exception {
		try {
			sbError.setLength(0);
			String[] cmd = null;
			if (strPomFilePath == null) {
				cmd = new String[] { "/bin/sh", "-c", strCmd };
			} else {
				cmd = new String[] { "/bin/sh", "-c", "cd " + strPomFilePath + "  && " + strCmd };
			}
			Process process = Runtime.getRuntime().exec(cmd);
			getInfo(process, sbError);
		} catch (Exception e) {
			logger.error(strCmd, e);
			e.printStackTrace();
			throw e;
		}

	}

	/**
	 * 
	 * @param strPomFilePath
	 * @param strCmd
	 * @param sbError
	 * @throws Exception
	 */
	private void runShellWithResult(String strPomFilePath, String strCmd, StringBuilder sbError) throws Exception {
		try {
			sbError.setLength(0);
			String[] cmd = null;
			if (strPomFilePath == null) {
				cmd = new String[] { "/bin/sh", "-c", strCmd };
			} else {
				cmd = new String[] { "/bin/sh", "-c", "cd " + strPomFilePath + "  && " + strCmd };
			}
			Process process = Runtime.getRuntime().exec(cmd);
			InputStreamReader ir = new InputStreamReader(process.getInputStream());
			LineNumberReader input = new LineNumberReader(ir);

			String line = null;
			while ((line = input.readLine()) != null) {
				System.out.println(line);
				sbError.append(line.trim()).append("\n");

			}
			process.waitFor();
			if (process.exitValue() != 0) {
				logger.error(" Failed to check test, exit value is " + process.exitValue());
			}

		} catch (Exception e) {
			logger.error(strCmd, e);
			throw e;
		}

	}

	/**
	 * 
	 * @category:
	 * @Title: runexec
	 * @Author:wupf@
	 * @date:2020年3月17日
	 * @param strCmd
	 * @param iTimeOutSecond
	 */
	public void runexec(String strCmd, int iTimeOutSecond) {
		long start = System.currentTimeMillis();
		ByteArrayOutputStream outputStream = null;
		ByteArrayOutputStream errorStream = null;
		try {
			if (logger.isDebugEnabled()) {
				logger.debug("strCmd:" + strCmd);
			}

			outputStream = new ByteArrayOutputStream();

			errorStream = new ByteArrayOutputStream();

			// 命令行处理

			CommandLine commandline = CommandLine.parse(strCmd);

			// 进行执行体

			DefaultExecutor exec = new DefaultExecutor();

			exec.setExitValues(null);

			// 利用监视狗来设置超时

			ExecuteWatchdog watchdog = new ExecuteWatchdog(iTimeOutSecond * 1000);

			exec.setWatchdog(watchdog);

			PumpStreamHandler streamHandler = new PumpStreamHandler(outputStream, errorStream);

			exec.setStreamHandler(streamHandler);

			exec.execute(commandline);// 执行

			System.out.println(outputStream.toString("gbk"));

			System.out.println(errorStream.toString("gbk"));

		} catch (Exception e) {
			logger.error(strCmd, e);

		} finally {
			JpfCloseUtil.close(outputStream);
			JpfCloseUtil.close(errorStream);
		}
		logger.info(" finish ExcuteTime " + (System.currentTimeMillis() - start) + "ms");

	}

	/**
	 * 
	 * @param strCmd
	 * @param iTimeOutSecond
	 * @param OutMsg
	 * @param ErrMsg
	 * @author wupf 2020年3月29日
	 *
	 */
	public void runexec(String strCmd, int iTimeOutSecond, StringBuilder OutMsg, StringBuffer ErrMsg) {
		long start = System.currentTimeMillis();
		ByteArrayOutputStream outputStream = null;
		ByteArrayOutputStream errorStream = null;
		try {
			if (logger.isDebugEnabled()) {
				logger.debug("strCmd:" + strCmd);
			}

			outputStream = new ByteArrayOutputStream();

			errorStream = new ByteArrayOutputStream();

			// 命令行处理

			CommandLine commandline = CommandLine.parse(strCmd);

			// 进行执行体

			DefaultExecutor exec = new DefaultExecutor();

			exec.setExitValues(null);

			// 利用监视狗来设置超时

			ExecuteWatchdog watchdog = new ExecuteWatchdog(iTimeOutSecond * 1000);

			exec.setWatchdog(watchdog);

			PumpStreamHandler streamHandler = new PumpStreamHandler(outputStream, errorStream);

			exec.setStreamHandler(streamHandler);

			exec.execute(commandline);// 执行

			// System.out.println(outputStream.toString("gbk"));
			OutMsg.append(outputStream.toString("gbk"));
			// System.out.println(errorStream.toString("gbk"));
			ErrMsg.append(errorStream.toString("gbk"));
		} catch (Exception e) {
			logger.error(strCmd, e);
			e.printStackTrace();

		} finally {
			JpfCloseUtil.close(outputStream);
			JpfCloseUtil.close(errorStream);
		}
		logger.info(" finish ExcuteTime " + (System.currentTimeMillis() - start) + "ms");

	}

	/**
	 * 
	 * @author wupf@aliyun.com
	 * @param strCmd 2020年3月1日
	 */
	private void runShellWith(String strStartPath, String strCmd) throws Exception {
		Process process=null;
		try {

			logger.debug(strCmd);
			logger.debug(strStartPath);
			String[] cmd = null;
			if (strStartPath == null) {
				cmd = new String[] { "/bin/sh", "-c", strCmd };
			} else {
				cmd = new String[] { "/bin/sh", "-c", "cd " + strStartPath + "  && " + strCmd };
			}

			process = Runtime.getRuntime().exec(cmd);

			final InputStream is1 = process.getInputStream();
			// 启动单独的线程来清空p.getInputStream()的缓冲区
			new Thread(new Runnable() {
				@Override
				public void run() {
					BufferedReader br = new BufferedReader(new InputStreamReader(is1));
					try {
						String line = null;
						while ((line = br.readLine()) != null) {
							System.out.println("1:" + line);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}).start();
			InputStream is2 = process.getErrorStream();
			BufferedReader br2 = new BufferedReader(new InputStreamReader(is2));

			String line = null;
			while ((line = br2.readLine()) != null) {
				System.out.println("2:" + line);
			}

			process.waitFor();
			
		} catch (Exception e) {
			logger.error(strCmd, e);
			e.printStackTrace();
			throw e;
		}finally {
			JpfCloseUtil.destroyProcess(process);
		}
	}

	/**
	 * 
	 * @category:
	 * @Title: runexec
	 * @author wupf
	 * @date:2020年3月17日
	 * @param strCmd
	 * @param iTimeOutSecond
	 */
	public boolean runexec(String strCmd, int iTimeOutSecond, String strJavaFileName) {
		long start = System.currentTimeMillis();
		ByteArrayOutputStream outputStream = null;
		ByteArrayOutputStream errorStream = null;
		try {
			if (logger.isDebugEnabled()) {
				logger.debug("strCmd:" + strCmd);
			}

			outputStream = new ByteArrayOutputStream();
			errorStream = new ByteArrayOutputStream();

			// 命令行处理

			CommandLine commandline = CommandLine.parse(strCmd);

			// 进行执行体

			DefaultExecutor exec = new DefaultExecutor();

			exec.setExitValues(null);

			// 利用监视狗来设置超时

			ExecuteWatchdog watchdog = new ExecuteWatchdog(iTimeOutSecond * 1000);

			exec.setWatchdog(watchdog);

			PumpStreamHandler streamHandler = new PumpStreamHandler(outputStream, errorStream);

			exec.setStreamHandler(streamHandler);

			exec.execute(commandline);// 执行
			String outputStr = outputStream.toString("gbk");

			System.out.println(outputStr);
			String errorStr = errorStream.toString("gbk");
			System.out.println(errorStr);
			logger.info(" finish ExcuteTime " + (System.currentTimeMillis() - start) + "ms");
			return true;
		} catch (Exception e) {
			logger.error(strCmd, e);
			e.printStackTrace();
		} finally {
			JpfCloseUtil.close(outputStream);
			JpfCloseUtil.close(errorStream);
		}

		return false;
	}

}
