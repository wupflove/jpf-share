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
import java.io.InputStream;
import java.io.InputStreamReader;

import org.jpf.utils.ios.JpfOsUtil;

/**
 * @author wupf
 *
 */
public class JpfMvnUtil {

	/**
	 * 
	 */
	private JpfMvnUtil() {
	}

	private static JpfMvnUtil singleton;

	public static synchronized JpfMvnUtil getInstance() {
		if (singleton == null) {
			singleton = new JpfMvnUtil();
		}
		return singleton;
	}

	/**
	 * 
	 * @category 获取mvn repository
	 * @return
	 * @throws Exception
	 * @since 2020年1月17日
	 * @author wpf
	 */
	public String getMvnRepositoryCmd() throws Exception {

		String strKey = "[DEBUG] Using local repository at";
		String strCmd = "mvn -X ";
		StringBuilder sbMsg = new StringBuilder();
		runexecWithResult(null, strCmd, sbMsg);

		String[] sbMsgs = sbMsg.toString().split(System.getProperty("line.separator"));
		for (String str : sbMsgs) {

			if (str.indexOf(strKey) >= 0) {
				str = str.substring(strKey.length() + 1, str.length()).trim();
				// System.out.println("MavenHome:" + str);
				return str;
			}
		}
		throw new Exception("通过MVN -X 无法获取本地仓库路径");

	}

	/**
	 * 
	 * @param strStartPath
	 * @param strCmd
	 * @param sbMsg
	 * @throws Exception Author:wupf 2020年3月29日
	 *
	 */
	protected void runexecWithResult(String strStartPath, String strCmd, StringBuilder sbMsg) throws Exception {
		if (JpfOsUtil.isWindows()) {
			runCmdWithResult(strStartPath, strCmd, sbMsg);
		} else {
			runShellWithResult(strStartPath, strCmd, sbMsg);
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
	protected void runCmdWithResult(String strStartPath, String strCmd, final StringBuilder sb) throws Exception {

		try {
			final String lineSeparator = System.getProperty("line.separator");
			sb.setLength(0);
			// logger.debug(strStartPath);
			if (strStartPath == null || strStartPath.trim().length() == 0) {
				strCmd = "cmd /c " + strCmd;
			} else {
				strCmd = "cmd /c " + strStartPath.substring(0, 2) + " && cd " + strStartPath + "  && " + strCmd;
			}
			// System.out.println(strCmd);
			Process process = Runtime.getRuntime().exec(strCmd);

			final InputStream is1 = process.getInputStream();
			// 启动单独的线程来清空p.getInputStream()的缓冲区
			new Thread(new Runnable() {
				@Override
				public void run() {
					BufferedReader br = new BufferedReader(new InputStreamReader(is1));
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
			BufferedReader br2 = new BufferedReader(new InputStreamReader(is2));

			String line = null;
			while ((line = br2.readLine()) != null) {
				sb.append(line).append(lineSeparator);
			}

			process.waitFor();
			JpfCloseUtil.destroyProcess(process);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}

	/**
	 * 
	 * @param strPomFilePath
	 * @param strCmd
	 * @param sb
	 * @throws Exception
	 */
	protected void runShellWithResult(String strPomFilePath, String strCmd, final StringBuilder sb) throws Exception {
		try {
			final String lineSeparator = System.getProperty("line.separator");
			sb.setLength(0);
			String[] cmd = null;
			if (strPomFilePath == null) {
				cmd = new String[] { "/bin/sh", "-c", strCmd };
			} else {
				cmd = new String[] { "/bin/sh", "-c", "cd " + strPomFilePath + "  && " + strCmd };
			}
			Process process = Runtime.getRuntime().exec(cmd);

			final InputStream is1 = process.getInputStream();
			// 启动单独的线程来清空p.getInputStream()的缓冲区
			new Thread(new Runnable() {
				@Override
				public void run() {
					BufferedReader br = new BufferedReader(new InputStreamReader(is1));
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
			BufferedReader br2 = new BufferedReader(new InputStreamReader(is2));

			String line = null;
			while ((line = br2.readLine()) != null) {
				sb.append(line).append(lineSeparator);
			}

			process.waitFor();
			if (process.exitValue() != 0) {
				System.out.println(" Failed to check test, exit value is " + process.exitValue());
			}
			JpfCloseUtil.destroyProcess(process);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

}
