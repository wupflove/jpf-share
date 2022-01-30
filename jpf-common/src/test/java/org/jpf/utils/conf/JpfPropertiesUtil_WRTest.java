/*
 this file is write by wupf
 */
package org.jpf.utils.conf;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.Map;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

/**
* The class <code>JpfPropertiesUtilTest</code> contains tests for the class <code>{@link JpfPropertiesUtil}</code>.
* <p>
* Copyright (c) 2019
* 
* @generatedBy wupf at 2019-11-28 19:13:02
* @author Administrator
* @version $Revision: 1.3.0
*/

public class JpfPropertiesUtil_WRTest {

	/**
	* Run the GetAllProperties method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:13:02
	* @see public static  Map<String,String> GetAllProperties(String strFileName) throws IOException  
	*/
	@Test(timeout = 1000)
	public void test_GetAllProperties_R22() throws Throwable {

		try {

			String strFileName = "涓枃";

			Map<String, String> wupf_result = JpfPropertiesUtil.GetAllProperties(strFileName);

			System.out.println("jpf_check:GetAllProperties:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}


}
