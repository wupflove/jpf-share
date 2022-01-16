/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.ios;

import net.sf.jftp.net.BasicConnection;
import net.sf.jftp.net.ConnectionHandler;
import net.sf.jftp.net.ConnectionListener;
import net.sf.jftp.net.FtpConnection;

/** 
* See FtpDownload.java for comments. 
* @author wupf
*/
public class FtpUpload implements ConnectionListener {

	private boolean isThere = false;

	private ConnectionHandler handler = new ConnectionHandler();

	private String host;
	private int port = 21;
	private String user;
	private String passwd;

	public FtpUpload(String host, String user, String passwd) {
		this.host = host;
		this.user = user;
		this.passwd = passwd;
	}

	public FtpUpload(String host, int port, String user, String passwd) {
		this.host = host;
		this.port = port;
		this.user = user;
		this.passwd = passwd;
	}

	public int upload(String dir, String file) {
		FtpConnection con = new FtpConnection(host, port, "/");

		con.addConnectionListener(this);

		con.setConnectionHandler(handler);

		con.login(user, passwd);

		while (!isThere) {
			try {
				Thread.sleep(10);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

		// make dirs
		String path = "";
		// String[] paths = StringUtils.split(dir, "/");
		String[] paths = dir.split("/");
		for (int i = 0; i < paths.length; i++) {
			path += "/" + paths[i];
			if (!con.chdir(path)) {
				con.mkdir(path);
			}
		}
		con.chdir(dir);
		return con.upload(file);
	}

	public void updateRemoteDirectory(BasicConnection con) {
		System.out.println("new path is: " + con.getPWD());
	}

	public void connectionInitialized(BasicConnection con) {
		isThere = true;
	}

	public void updateProgress(String file, String type, long bytes) {
	}

	public void connectionFailed(BasicConnection con, String why) {
		System.out.println("connection failed!");
	}

	public void actionFinished(BasicConnection con) {
	}
}