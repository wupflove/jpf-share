/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.classes;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.jpf.utils.JpfConst;
import org.jpf.utils.classes.JpfClassUtil;
import org.jpf.utils.ios.JpfFileUtil;

/**
 * @author wupf
 *
 */
public class RcUtil {

	/**
	 * 
	 */
	private RcUtil() {
	}
	private static RcUtil singleton;

	public static synchronized RcUtil getInstance() {
		if (singleton == null) {
			singleton = new RcUtil();
		}
		return singleton;
	}

	/**
	 * 
	 * @category 功能
	 * @param strPomPath
	 * @return
	 * @author wupf
	 * @Date :2021年10月12日上午11:16:50
	 */
    public String getRc(final String strPomPath)throws Exception
    {
        if (strPomPath==null)
        {
        	return null;
        }

        String strSrcPath=JpfFileUtil.joinPath(strPomPath, JpfConst.SRC_MAIN_JAVA_PATH);
       
        File f=new File(strSrcPath);
        if (!f.isDirectory())
        {
        	return null;
        }
        
        String strResult=null;
        List<String> list=new ArrayList<String>();
        
        Vector<String> vFile=new Vector<String>();
        JpfFileUtil.getFiles(strSrcPath, vFile, ".java");
        System.out.println("FindJavaFileCount:"+vFile.size());
        for(String strFile:vFile)
        {
        	//System.out.println(strFile);
            strFile=JpfClassUtil.getPackageNameBySrcFileName(strFile);
            //System.out.println(strFile);
            
            boolean bFind=false;
            Iterator<String> iterator=list.iterator();
            while (iterator.hasNext()) {
				String strData = (String)iterator.next();
				
				if (strFile.startsWith(strData))
				{				
					bFind=true;
					break;
				}
				if (strData.startsWith(strFile))
				{
					iterator.remove();
					bFind=false;
					//break;
				}
			}
            if (!bFind)
            {
            	 list.add(strFile);
            }
        }

        
        strResult=String.join(".*||",list)+".*";
        System.out.println("getRc:"+strResult);
        return strResult;
    }
    
}
