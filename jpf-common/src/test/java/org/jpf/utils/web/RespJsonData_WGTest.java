package org.jpf.utils.web;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>RespJsonData_WGTest</code> contains tests for the class <code>{@link RespJsonData}</code>.
 *
 * @generatedBy wupf at 20-5-7 上午10:15
 * @author wupf
 * @version $Revision: 1.0 $
 */
public class RespJsonData_WGTest {
	
	@Test(timeout = 1000)
	public void testGetMsgReturningNull() throws Throwable {
		RespJsonData respJsonData0 = new RespJsonData();
		String string0 = respJsonData0.getMsg();
		assertNull(string0);
	}

	@Test(timeout = 1000)
	public void testGetStrClientInfoReturningNull() throws Throwable {
		RespJsonData respJsonData0 = new RespJsonData();
		String string0 = respJsonData0.getStrClientInfo();
		assertNull(string0);
	}

	@Test(timeout = 1000)
	public void testGetResultCodeReturningZero() throws Throwable {
		RespJsonData respJsonData0 = new RespJsonData();
		int int0 = respJsonData0.getResultCode();
		assertEquals(0, int0);
	}

	@Test(timeout = 1000)
	public void testGetMsgReturningEmptyString() throws Throwable {
		RespJsonData respJsonData0 = new RespJsonData();
		respJsonData0.setMsg("");
		String string0 = respJsonData0.getMsg();
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testGetResultCodeReturningPositive() throws Throwable {
		RespJsonData respJsonData0 = new RespJsonData();
		respJsonData0.setResultCode(3156);
		int int0 = respJsonData0.getResultCode();
		assertEquals(3156, int0);
	}

	@Test(timeout = 1000)
	public void testGetStrClientInfoReturningNonEmptyString() throws Throwable {
		RespJsonData respJsonData0 = new RespJsonData();
		respJsonData0.setStrClientInfo("8M@{.XN 8`njx");
		String string0 = respJsonData0.getStrClientInfo();
		assertEquals("8M@{.XN 8`njx", string0);
	}
	

	/**
	* Run the setStrClientInfo method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 20:29:11
	* @see public  void setStrClientInfo(String strClientInfo)   
	*/
	@Test(timeout = 1000)
	public void test_setStrClientInfo_R1() throws Throwable {

		String strClientInfo = "abc123";

		RespJsonData wupf_fixture = new RespJsonData();
		wupf_fixture.setStrClientInfo(strClientInfo);

		//add check point here, sample: assertEquals(true,          wupf_result);

	}

	/**
	* Run the setResultCode method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 20:29:11
	* @see public  void setResultCode(int resultCode)   
	*/
	@Test(timeout = 1000)
	public void test_setResultCode_R9() throws Throwable {

		int resultCode = Integer.MAX_VALUE;

		RespJsonData wupf_fixture = new RespJsonData();
		wupf_fixture.setResultCode(resultCode);

		//add check point here, sample: assertEquals(true,          wupf_result);

	}

	/**
	* Run the setMsg method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 20:29:11
	* @see public  void setMsg(String msg)   
	*/
	@Test(timeout = 1000)
	public void test_setMsg_R15() throws Throwable {

		String msg = "abc123";

		RespJsonData wupf_fixture = new RespJsonData();
		wupf_fixture.setMsg(msg);

		//add check point here, sample: assertEquals(true,          wupf_result);

	}
	/**
	 * Run the String getMsg() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	@Test
	public void testGetMsg_1() throws Exception {
		RespJsonData fixture = new RespJsonData();
		fixture.setStrClientInfo("");
		fixture.setResultCode(1);
		fixture.setMsg("");

		String result = fixture.getMsg();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getResultCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	@Test
	public void testGetResultCode_1() throws Exception {
		RespJsonData fixture = new RespJsonData();
		fixture.setStrClientInfo("");
		fixture.setResultCode(1);
		fixture.setMsg("");

		int result = fixture.getResultCode();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getStrClientInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	@Test
	public void testGetStrClientInfo_1() throws Exception {
		RespJsonData fixture = new RespJsonData();
		fixture.setStrClientInfo("");
		fixture.setResultCode(1);
		fixture.setMsg("");

		String result = fixture.getStrClientInfo();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setStrClientInfo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	@Test
	public void testSetStrClientInfo_1() throws Exception {
		RespJsonData fixture = new RespJsonData();
		fixture.setStrClientInfo("");
		fixture.setResultCode(1);
		fixture.setMsg("");
		String strClientInfo = "";

		fixture.setStrClientInfo(strClientInfo);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	@Before
	public void setUp() throws Exception {
		// add additional set up code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RespJsonData_WGTest.class);
	}
}
