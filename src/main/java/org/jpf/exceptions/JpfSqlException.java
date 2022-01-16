/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.exceptions;

import java.sql.SQLException;

/**
 * 
 * @author wupf
 *
 */
public class JpfSqlException extends Exception implements java.io.Serializable
{

	private static final long serialVersionUID = -1422889706965924713L;
	int iCode=0;
	String strDesc="";
	
	public void HandleSqlEx(SQLException ex)
	{
		if (ex.getErrorCode() == 1)
		{
			iCode=10000+ex.getErrorCode();
			strDesc="主键冲突";
		}		
		if (ex.getErrorCode() == 904)
		{
			iCode=10000+ex.getErrorCode();
			strDesc="列不存在";
		}
		if (ex.getErrorCode() == 942)
		{
			iCode=10000+ex.getErrorCode();
			strDesc="表不存在";
		}		
	}
    /**
     * 异常类型的构造函数
     * */
    public JpfSqlException() {
        super("");
        this.iCode = 0;
    }

    /**
     * 异常类型根据错误信息的构造函数
     * @param errMsg (int)错误信息
     * */
    public JpfSqlException(String errMsg) {
        super(errMsg);
        this.iCode = 0;
    }

    /**
     * 异常类型根据错误代码的构造函数
     * @param errCode (int)错误代码
     * */
    public JpfSqlException(int errCode) {
        this.iCode = errCode;
    }

    /**
     * 异常类型根据错误代码和错误信息的构造函数
     * @param errCode (int)错误代码
     * @param errMsg (int)错误信息
     * */
    public JpfSqlException(int errCode,String errMsg) {
        super(errMsg);
        this.iCode = errCode;
    }

    /**
     * 得到错误代码
     * @return 错误代码
     * */
    public int getErrCode() {
        return this.iCode;
    }

    /**
     * 得到错误信息
     * @return 错误信息
     * */
    public String getErrMsg() {
        return super.getMessage();
    }

    /**
     * 得到错误信息
     * @return 错误信息
     * */
    @Override
	public String toString() {
        return super.toString();
    }	
}
