/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/

package org.jpf.logs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.appender.FileAppender;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.LoggerConfig;

public class Log4j2Mgr {
	private static final Logger logger = LogManager.getLogger();

	/**
	 * 
	 * @category 修改日志等级
	 * @param level
	 * @return
	 * @throws Exception
	 * @since 2020年3月5日 
	 */
	public boolean updateLogbackLevelj(String level) throws Exception {
		boolean bResult = true;
		level = level.toLowerCase();
		org.apache.logging.log4j.core.LoggerContext ctx = (org.apache.logging.log4j.core.LoggerContext) LogManager
				.getContext(false);
		Configuration config = ctx.getConfiguration();
		LoggerConfig loggerConfig = config.getLoggerConfig(LogManager.ROOT_LOGGER_NAME);
		switch (level) {
		case "trace":
			loggerConfig.setLevel(org.apache.logging.log4j.Level.TRACE);
			break;
		case "debug":
			loggerConfig.setLevel(org.apache.logging.log4j.Level.DEBUG);
			break;
		case "info":
			loggerConfig.setLevel(org.apache.logging.log4j.Level.INFO);
			break;
		case "warn":
			loggerConfig.setLevel(org.apache.logging.log4j.Level.WARN);
			break;
		case "error":
			loggerConfig.setLevel(org.apache.logging.log4j.Level.ERROR);
			break;
		default:
			logger.warn("日志级别修改失败！");
			bResult = false;
			break;
		}
		ctx.updateLoggers();
		return bResult;
	}
	/**
	 * 
	 * @category 修改日志名称
	 * @param name
	 * @author wupf
	 * @Date :2022年1月12日下午2:38:24
	 */
	public void setLogFile(String name){
		LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
		org.apache.logging.log4j.core.config.Configuration config = ctx.getConfiguration();

		if (config.getAppender("appFile") != null) {
			FileAppender rollingFileAppender = (FileAppender)config.getAppender("appFile");
			config.getLoggerConfig("").removeAppender("appFile");
			rollingFileAppender.stop();
			Appender appender = FileAppender.newBuilder()
					.setName("appFile2")
					.withFileName(name)
					.withAppend(false)
					//.withFilePattern(rollingFileAppender.getFilePattern())
					.setLayout(rollingFileAppender.getLayout())
					//.withPolicy(rollingFileAppender.getTriggeringPolicy())
					.build();
			appender.start();
			config.getLoggerConfig("").addAppender(appender, config.getRootLogger().getLevel(), null);
			ctx.updateLoggers(config);
		}
	}

}
