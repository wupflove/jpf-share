/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils;

import java.io.Closeable;
import java.io.IOException;

/**
 * @author wupf
 *
 */
public class JpfCloseUtil {
	/**
	 * 
	 */
	private JpfCloseUtil() {
	}

	public static void close(Closeable c) {
		try {
			if (c != null) {
				c.close();
			}
		} catch (IOException e) {

		}
	}



	/**
	 * @category 关闭进程
	 * @param p
	 */
	public static  void destroyProcess(Process p) {
		try {
			if (p == null)
				return;
			close(p.getInputStream());
			close(p.getErrorStream());
			close(p.getOutputStream());

			p.destroy();
		} catch (Exception e) {
		
		}

	}
}
