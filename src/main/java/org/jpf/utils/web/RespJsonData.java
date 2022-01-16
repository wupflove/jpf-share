/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.web;

/**
 * @author wupf 
 */
public class RespJsonData {

	private int ResultCode;

	private String Msg;
	private String strClientInfo;

	public String getStrClientInfo() {
		return strClientInfo;
	}

	public void setStrClientInfo(String strClientInfo) {
		this.strClientInfo = strClientInfo;
	}

	/**
	 * @return the resultCode
	 */
	public int getResultCode() {
		return ResultCode;
	}

	/**
	 * @param resultCode the resultCode to set
	 */
	public void setResultCode(int resultCode) {
		ResultCode = resultCode;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() throws Exception {
		// return AiZipUtil.uncompressByGZIP(Msg);
		return Msg;

	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		try {
			// Msg = AiZipUtil.compress(msg);
			Msg = msg;
		} catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}

	}

}
