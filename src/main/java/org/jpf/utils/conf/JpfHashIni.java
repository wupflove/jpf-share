/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.conf;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.jpf.common.abstractUtil;
import org.jpf.utils.JpfCloseUtil;

/**
 * 
 * @author wupf
 *
 */

public final class JpfHashIni extends abstractUtil {

	private final static Map<String, Map<String, Object>> iniFile = new HashMap<String, Map<String, Object>>();

	private JpfHashIni() {

	}

	public final static synchronized void setValue(String section, String key, Object value) {
		Map<String, Object> sectionMap = iniFile.get(section);

		if (sectionMap == null) {
			sectionMap = new HashMap<String, Object>();
			iniFile.put(section, sectionMap);
		}
		sectionMap.put(key, value);
	}

	public final static synchronized Object getValue(String section, String key) {
		Object obj = null;
		Map<String, Object> item = iniFile.get(section);
		if (item != null) {
			obj = item.get(key);
		}
		return obj;
	}

	public final static synchronized void load(String path) throws IOException {
		DataInputStream ds = null;
		try {
			ds = new DataInputStream(new FileInputStream(path));
			String str = ds.readLine();
			String section = null;
			while (str != null) {
				// System.out.println(str);
				if (str.startsWith("[")) {
					Map<String, Object> itemMap = new HashMap<String, Object>();
					section = str.substring(1, str.length() - 1);
					// System.out.println(section);
					iniFile.put(section, itemMap);
				} else {
					Map<String, Object> itemMap = iniFile.get(section);
					String key = str.substring(0, str.indexOf("="));
					String value = str.substring(str.indexOf("=") + 1);
					itemMap.put(key, value);
				}

				str = ds.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(path, e);
		} finally {
			JpfCloseUtil.close(ds);
		}

	}

	/**
	 * 
	 * @param name
	 * @throws IOException
	 */
	public final static synchronized void writeIni(String name) throws IOException {
		if (null == name || 0 == name.trim().length()) {
			throw new IOException("no file name given");
		}
		StringBuilder sb = new StringBuilder("");
		for (String section : iniFile.keySet()) {
			sb.append("[").append(section).append("]").append("\n");
			Map<String, Object> map = iniFile.get(section);
			Set<String> keySet = map.keySet();
			for (String key : keySet) {
				sb.append(key).append("=").append(map.get(key)).append("\n");
			}

		}

		File file = new File(name);
		if (!file.exists()) {
			file.createNewFile();
		}
		OutputStream os = null;
		try {

			os = new FileOutputStream(file);
			os.write(sb.toString().getBytes());
			os.flush();
		} catch (IOException e) {
			logger.error(name, e);
			e.printStackTrace();
		} finally {
			JpfCloseUtil.close(os);
		}

	}
}
