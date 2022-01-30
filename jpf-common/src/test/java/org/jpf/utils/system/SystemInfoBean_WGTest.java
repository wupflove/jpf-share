package org.jpf.utils.system;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.management.MemoryUsage;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>SystemInfoBean_WGTest</code> contains tests for the class
 * <code>{@link SystemInfoBean}</code>.
 *
 * @generatedBy wupf at 20-5-7 上午10:15
 * @author wupf
 * @version $Revision: 1.0 $
 */
public class SystemInfoBean_WGTest {

	/**
	 * Run the setLoadClazzCount method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 20:17:03
	 * @see public void setLoadClazzCount(int loadClazzCount)
	 */
	@Test(timeout = 1000)
	public void test_setLoadClazzCount_R2() throws Throwable {

		int loadClazzCount = Integer.MAX_VALUE;

		SystemInfoBean wupf_fixture = new SystemInfoBean();
		wupf_fixture.setLoadClazzCount(loadClazzCount);

		// add check point here, sample: assertEquals(true, wupf_result);

	}

	/**
	 * Run the setHasloadClazzCount method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 20:17:03
	 * @see public void setHasloadClazzCount(long hasloadClazzCount)
	 */
	@Test(timeout = 1000)
	public void test_setHasloadClazzCount_R8() throws Throwable {

		long hasloadClazzCount = Long.MAX_VALUE;

		SystemInfoBean wupf_fixture = new SystemInfoBean();
		wupf_fixture.setHasloadClazzCount(hasloadClazzCount);

		// add check point here, sample: assertEquals(true, wupf_result);

	}

	/**
	 * Run the setHasUnloadClazzCount method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 20:17:03
	 * @see public void setHasUnloadClazzCount(long hasUnloadClazzCount)
	 */
	@Test(timeout = 1000)
	public void test_setHasUnloadClazzCount_R13() throws Throwable {

		long hasUnloadClazzCount = Long.MAX_VALUE;

		SystemInfoBean wupf_fixture = new SystemInfoBean();
		wupf_fixture.setHasUnloadClazzCount(hasUnloadClazzCount);

		// add check point here, sample: assertEquals(true, wupf_result);

	}

	/**
	 * Run the setHeapMemoryUsage method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 20:17:03
	 * @see public void setHeapMemoryUsage(MemoryUsage heapMemoryUsage)
	 */
	@Test(timeout = 1000)
	public void test_setHeapMemoryUsage_R18() throws Throwable {

		MemoryUsage heapMemoryUsage = null;

		SystemInfoBean wupf_fixture = new SystemInfoBean();
		wupf_fixture.setHeapMemoryUsage(heapMemoryUsage);

		// add check point here, sample: assertEquals(true, wupf_result);

	}

	/**
	 * Run the setNonHeapMemoryUsage method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 20:17:03
	 * @see public void setNonHeapMemoryUsage(MemoryUsage nonHeapMemoryUsage)
	 */
	@Test(timeout = 1000)
	public void test_setNonHeapMemoryUsage_R22() throws Throwable {

		MemoryUsage nonHeapMemoryUsage = null;

		SystemInfoBean wupf_fixture = new SystemInfoBean();
		wupf_fixture.setNonHeapMemoryUsage(nonHeapMemoryUsage);

		// add check point here, sample: assertEquals(true, wupf_result);

	}

	/**
	 * Run the setOperateName method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 20:17:03
	 * @see public void setOperateName(String operateName)
	 */
	@Test(timeout = 1000)
	public void test_setOperateName_R26() throws Throwable {

		String operateName = "abc123";

		SystemInfoBean wupf_fixture = new SystemInfoBean();
		wupf_fixture.setOperateName(operateName);

		// add check point here, sample: assertEquals(true, wupf_result);

	}

	/**
	 * Run the setProcessListCount method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 20:17:03
	 * @see public void setProcessListCount(int processListCount)
	 */
	@Test(timeout = 1000)
	public void test_setProcessListCount_R34() throws Throwable {

		int processListCount = Integer.MAX_VALUE;

		SystemInfoBean wupf_fixture = new SystemInfoBean();
		wupf_fixture.setProcessListCount(processListCount);

		// add check point here, sample: assertEquals(true, wupf_result);

	}

	/**
	 * Run the setArchName method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 20:17:03
	 * @see public void setArchName(String archName)
	 */
	@Test(timeout = 1000)
	public void test_setArchName_R40() throws Throwable {

		String archName = "abc123";

		SystemInfoBean wupf_fixture = new SystemInfoBean();
		wupf_fixture.setArchName(archName);

		// add check point here, sample: assertEquals(true, wupf_result);

	}

	/**
	 * Run the setVersionName method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 20:17:03
	 * @see public void setVersionName(String versionName)
	 */
	@Test(timeout = 1000)
	public void test_setVersionName_R48() throws Throwable {

		String versionName = "abc123";

		SystemInfoBean wupf_fixture = new SystemInfoBean();
		wupf_fixture.setVersionName(versionName);

		// add check point here, sample: assertEquals(true, wupf_result);

	}

	/**
	 * Run the setVmName method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 20:17:03
	 * @see public void setVmName(String vmName)
	 */
	@Test(timeout = 1000)
	public void test_setVmName_R56() throws Throwable {

		String vmName = "abc123";

		SystemInfoBean wupf_fixture = new SystemInfoBean();
		wupf_fixture.setVmName(vmName);

		// add check point here, sample: assertEquals(true, wupf_result);

	}

	/**
	 * Run the setVmVersion method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 20:17:03
	 * @see public void setVmVersion(String vmVersion)
	 */
	@Test(timeout = 1000)
	public void test_setVmVersion_R64() throws Throwable {

		String vmVersion = "abc123";

		SystemInfoBean wupf_fixture = new SystemInfoBean();
		wupf_fixture.setVmVersion(vmVersion);

		// add check point here, sample: assertEquals(true, wupf_result);

	}

	/**
	 * Run the setVmVendor method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 20:17:03
	 * @see public void setVmVendor(String vmVendor)
	 */
	@Test(timeout = 1000)
	public void test_setVmVendor_R72() throws Throwable {

		String vmVendor = "abc123";

		SystemInfoBean wupf_fixture = new SystemInfoBean();
		wupf_fixture.setVmVendor(vmVendor);

		// add check point here, sample: assertEquals(true, wupf_result);

	}

	/**
	 * Run the setStartTime method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 20:17:03
	 * @see public void setStartTime(Date startTime)
	 */
	@Test(timeout = 1000)
	public void test_setStartTime_R80() throws Throwable {

		Date startTime = new java.util.Date();
		SystemInfoBean wupf_fixture = new SystemInfoBean();
		wupf_fixture.setStartTime(startTime);

		// add check point here, sample: assertEquals(true, wupf_result);

	}

	/**
	 * Run the setArguments method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 20:17:03
	 * @see public void setArguments(List<String> arguments)
	 */
	@Test(timeout = 1000)
	public void test_setArguments_R84() throws Throwable {

		List<String> arguments = null;
		SystemInfoBean wupf_fixture = new SystemInfoBean();
		wupf_fixture.setArguments(arguments);

		// add check point here, sample: assertEquals(true, wupf_result);

	}

	/**
	 * Run the setSystemProperties method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 20:17:03
	 * @see public void setSystemProperties(Map<String,String> systemProperties)
	 */
	@Test(timeout = 1000)
	public void test_setSystemProperties_R87() throws Throwable {

		Map<String, String> systemProperties = new HashMap<String, String>();

		SystemInfoBean wupf_fixture = new SystemInfoBean();
		wupf_fixture.setSystemProperties(systemProperties);

		// add check point here, sample: assertEquals(true, wupf_result);

	}

	@Test(timeout = 1000)
	public void testGetVmVersionReturningNull() throws Throwable {
		SystemInfoBean systemInfoBean0 = new SystemInfoBean();
		String string0 = systemInfoBean0.getVmVersion();
		assertNull(string0);
	}

	@Test(timeout = 1000)
	public void testGetLoadClazzCountReturningZero() throws Throwable {
		SystemInfoBean systemInfoBean0 = new SystemInfoBean();
		int int0 = systemInfoBean0.getLoadClazzCount();
		assertEquals(0, int0);
	}

	@Test(timeout = 1000)
	public void testGetHasloadClazzCountReturningZero() throws Throwable {
		SystemInfoBean systemInfoBean0 = new SystemInfoBean();
		long long0 = systemInfoBean0.getHasloadClazzCount();
		assertEquals(0L, long0);
	}

	@Test(timeout = 1000)
	public void testGetStartTimeReturningNull() throws Throwable {
		SystemInfoBean systemInfoBean0 = new SystemInfoBean();
		Date date0 = systemInfoBean0.getStartTime();
		assertNull(date0);
	}

	@Test(timeout = 1000)
	public void testGetArgumentsReturningNull() throws Throwable {
		SystemInfoBean systemInfoBean0 = new SystemInfoBean();
		List<String> list0 = systemInfoBean0.getArguments();
		assertNull(list0);
	}

	@Test(timeout = 1000)
	public void testGetHeapMemoryUsageReturningNull() throws Throwable {
		SystemInfoBean systemInfoBean0 = new SystemInfoBean();
		MemoryUsage memoryUsage0 = systemInfoBean0.getHeapMemoryUsage();
		assertNull(memoryUsage0);
	}

	@Test(timeout = 1000)
	public void testGetVmVendorReturningNull() throws Throwable {
		SystemInfoBean systemInfoBean0 = new SystemInfoBean();
		String string0 = systemInfoBean0.getVmVendor();
		assertNull(string0);
	}

	@Test(timeout = 1000)
	public void testGetVmNameReturningNull() throws Throwable {
		SystemInfoBean systemInfoBean0 = new SystemInfoBean();
		String string0 = systemInfoBean0.getVmName();
		assertNull(string0);
	}

	@Test(timeout = 1000)
	public void testGetArgumentsReturningListWhereIsEmptyIsTrueAndListWhereSizeIsZero() throws Throwable {
		SystemInfoBean systemInfoBean0 = new SystemInfoBean();
		Stack<String> stack0 = new Stack<String>();
		systemInfoBean0.setArguments(stack0);
		List<String> list0 = systemInfoBean0.getArguments();
		assertTrue(list0.isEmpty());
	}

	@Test(timeout = 1000)
	public void testGetArchNameReturningNull() throws Throwable {
		SystemInfoBean systemInfoBean0 = new SystemInfoBean();
		String string0 = systemInfoBean0.getArchName();
		assertNull(string0);
	}

	@Test(timeout = 1000)
	public void testGetProcessListCountReturningZero() throws Throwable {
		SystemInfoBean systemInfoBean0 = new SystemInfoBean();
		int int0 = systemInfoBean0.getProcessListCount();
		assertEquals(0, int0);
	}

	@Test(timeout = 1000)
	public void testGetNonHeapMemoryUsageReturningNull() throws Throwable {
		SystemInfoBean systemInfoBean0 = new SystemInfoBean();
		MemoryUsage memoryUsage0 = systemInfoBean0.getNonHeapMemoryUsage();
		assertNull(memoryUsage0);
	}

	@Test(timeout = 1000)
	public void testGetVersionNameReturningNull() throws Throwable {
		SystemInfoBean systemInfoBean0 = new SystemInfoBean();
		String string0 = systemInfoBean0.getVersionName();
		assertNull(string0);
	}

	@Test(timeout = 1000)
	public void testGetOperateNameReturningNull() throws Throwable {
		SystemInfoBean systemInfoBean0 = new SystemInfoBean();
		String string0 = systemInfoBean0.getOperateName();
		assertNull(string0);
	}

	@Test(timeout = 1000)
	public void testGetSystemPropertiesReturningNull() throws Throwable {
		SystemInfoBean systemInfoBean0 = new SystemInfoBean();
		Map<String, String> map0 = systemInfoBean0.getSystemProperties();
		assertNull(map0);
	}

	@Test(timeout = 1000)
	public void testGetHasUnloadClazzCountReturningZero() throws Throwable {
		SystemInfoBean systemInfoBean0 = new SystemInfoBean();
		long long0 = systemInfoBean0.getHasUnloadClazzCount();
		assertEquals(0L, long0);
	}

	@Test(timeout = 1000)
	public void testGetArchNameReturningNonEmptyString() throws Throwable {
		SystemInfoBean systemInfoBean0 = new SystemInfoBean();
		systemInfoBean0.setArchName("&");
		String string0 = systemInfoBean0.getArchName();
		assertEquals("&", string0);
	}

	@Test(timeout = 1000)
	public void testGetHasUnloadClazzCountReturningPositive() throws Throwable {
		SystemInfoBean systemInfoBean0 = new SystemInfoBean();
		systemInfoBean0.setHasUnloadClazzCount(2499L);
		long long0 = systemInfoBean0.getHasUnloadClazzCount();
		assertEquals(2499L, long0);
	}

	@Test(timeout = 1000)
	public void testGetHasloadClazzCountReturningPositive() throws Throwable {
		SystemInfoBean systemInfoBean0 = new SystemInfoBean();
		systemInfoBean0.setHasloadClazzCount(2498L);
		long long0 = systemInfoBean0.getHasloadClazzCount();
		assertEquals(2498L, long0);
	}

	@Test(timeout = 1000)
	public void testSetHeapMemoryUsage() throws Throwable {
		SystemInfoBean systemInfoBean0 = new SystemInfoBean();
		MemoryUsage memoryUsage0 = new MemoryUsage(492, 0L, 492, 31622776601L);
		systemInfoBean0.setHeapMemoryUsage(memoryUsage0);
		MemoryUsage memoryUsage1 = systemInfoBean0.getHeapMemoryUsage();
		assertSame(memoryUsage1, memoryUsage0);
	}

	@Test(timeout = 1000)
	public void testGetLoadClazzCountReturningPositive() throws Throwable {
		SystemInfoBean systemInfoBean0 = new SystemInfoBean();
		systemInfoBean0.setLoadClazzCount(492);
		int int0 = systemInfoBean0.getLoadClazzCount();
		assertEquals(492, int0);
	}

	@Test(timeout = 1000)
	public void testSetNonHeapMemoryUsage() throws Throwable {
		SystemInfoBean systemInfoBean0 = new SystemInfoBean();
		MemoryUsage memoryUsage0 = new MemoryUsage(0, 0, 0, 0);
		systemInfoBean0.setNonHeapMemoryUsage(memoryUsage0);
		MemoryUsage memoryUsage1 = systemInfoBean0.getNonHeapMemoryUsage();
		assertSame(memoryUsage1, memoryUsage0);
	}

	@Test(timeout = 1000)
	public void testGetOperateNameReturningNonEmptyString() throws Throwable {
		SystemInfoBean systemInfoBean0 = new SystemInfoBean();
		systemInfoBean0.setOperateName("$d:h;D<gK5UN80kvU");
		String string0 = systemInfoBean0.getOperateName();
		assertEquals("$d:h;D<gK5UN80kvU", string0);
	}

	@Test(timeout = 1000)
	public void testGetProcessListCountReturningPositive() throws Throwable {
		SystemInfoBean systemInfoBean0 = new SystemInfoBean();
		systemInfoBean0.setProcessListCount(1073741823);
		int int0 = systemInfoBean0.getProcessListCount();
		assertEquals(1073741823, int0);
	}

	@Test(timeout = 1000)
	public void testGetSystemPropertiesReturningMapWhereIsEmptyIsFalse() throws Throwable {
		SystemInfoBean systemInfoBean0 = new SystemInfoBean();
		HashMap<String, String> hashMap0 = new HashMap<String, String>();
		hashMap0.put("OW^~^PguWP}ewet", (String) null);
		systemInfoBean0.setSystemProperties(hashMap0);
		Map<String, String> map0 = systemInfoBean0.getSystemProperties();
		assertEquals(1, map0.size());
	}

	@Test(timeout = 1000)
	public void testGetVersionNameReturningNonEmptyString() throws Throwable {
		SystemInfoBean systemInfoBean0 = new SystemInfoBean();
		systemInfoBean0.setVersionName("/gjl&:a");
		String string0 = systemInfoBean0.getVersionName();
		assertEquals("/gjl&:a", string0);
	}

	@Test(timeout = 1000)
	public void testGetVmNameReturningEmptyString() throws Throwable {
		SystemInfoBean systemInfoBean0 = new SystemInfoBean();
		systemInfoBean0.setVmName("");
		String string0 = systemInfoBean0.getVmName();
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testGetVmVendorReturningNonEmptyString() throws Throwable {
		SystemInfoBean systemInfoBean0 = new SystemInfoBean();
		systemInfoBean0.setVmVendor("N@MC;<xRpg2");
		String string0 = systemInfoBean0.getVmVendor();
		assertEquals("N@MC;<xRpg2", string0);
	}

	@Test(timeout = 1000)
	public void testGetVmVersionReturningEmptyString() throws Throwable {
		SystemInfoBean systemInfoBean0 = new SystemInfoBean();
		systemInfoBean0.setVmVersion("");
		String string0 = systemInfoBean0.getVmVersion();
		assertEquals("", string0);
	}

	/**
	 * Run the String getArchName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	@Test
	public void testGetArchName_1() throws Exception {
		SystemInfoBean fixture = new SystemInfoBean();
		fixture.setArchName("");
		fixture.setSystemProperties(EasyMock.createNiceMock(Map.class));
		fixture.setVmVendor("");
		fixture.setHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setOperateName("");
		fixture.setStartTime(new Date());
		fixture.setVmName("");
		fixture.setNonHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setVmVersion("");
		fixture.setHasUnloadClazzCount(1L);
		fixture.setHasloadClazzCount(1L);
		fixture.setProcessListCount(1);
		fixture.setArguments(EasyMock.createNiceMock(List.class));
		fixture.setVersionName("");
		fixture.setLoadClazzCount(1);

		String result = fixture.getArchName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the List<String> getArguments() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	@Test
	public void testGetArguments_1() throws Exception {
		SystemInfoBean fixture = new SystemInfoBean();
		fixture.setArchName("");
		fixture.setSystemProperties(EasyMock.createNiceMock(Map.class));
		fixture.setVmVendor("");
		fixture.setHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setOperateName("");
		fixture.setStartTime(new Date());
		fixture.setVmName("");
		fixture.setNonHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setVmVersion("");
		fixture.setHasUnloadClazzCount(1L);
		fixture.setHasloadClazzCount(1L);
		fixture.setProcessListCount(1);
		fixture.setArguments(EasyMock.createNiceMock(List.class));
		fixture.setVersionName("");
		fixture.setLoadClazzCount(1);

		List<String> result = fixture.getArguments();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the long getHasUnloadClazzCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	@Test
	public void testGetHasUnloadClazzCount_1() throws Exception {
		SystemInfoBean fixture = new SystemInfoBean();
		fixture.setArchName("");
		fixture.setSystemProperties(EasyMock.createNiceMock(Map.class));
		fixture.setVmVendor("");
		fixture.setHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setOperateName("");
		fixture.setStartTime(new Date());
		fixture.setVmName("");
		fixture.setNonHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setVmVersion("");
		fixture.setHasUnloadClazzCount(1L);
		fixture.setHasloadClazzCount(1L);
		fixture.setProcessListCount(1);
		fixture.setArguments(EasyMock.createNiceMock(List.class));
		fixture.setVersionName("");
		fixture.setLoadClazzCount(1);

		long result = fixture.getHasUnloadClazzCount();

		// add additional test code here
		assertEquals(1L, result);
	}

	/**
	 * Run the long getHasloadClazzCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	@Test
	public void testGetHasloadClazzCount_1() throws Exception {
		SystemInfoBean fixture = new SystemInfoBean();
		fixture.setArchName("");
		fixture.setSystemProperties(EasyMock.createNiceMock(Map.class));
		fixture.setVmVendor("");
		fixture.setHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setOperateName("");
		fixture.setStartTime(new Date());
		fixture.setVmName("");
		fixture.setNonHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setVmVersion("");
		fixture.setHasUnloadClazzCount(1L);
		fixture.setHasloadClazzCount(1L);
		fixture.setProcessListCount(1);
		fixture.setArguments(EasyMock.createNiceMock(List.class));
		fixture.setVersionName("");
		fixture.setLoadClazzCount(1);

		long result = fixture.getHasloadClazzCount();

		// add additional test code here
		assertEquals(1L, result);
	}

	/**
	 * Run the MemoryUsage getHeapMemoryUsage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	@Test
	public void testGetHeapMemoryUsage_1() throws Exception {
		SystemInfoBean fixture = new SystemInfoBean();
		fixture.setArchName("");
		fixture.setSystemProperties(EasyMock.createNiceMock(Map.class));
		fixture.setVmVendor("");
		fixture.setHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setOperateName("");
		fixture.setStartTime(new Date());
		fixture.setVmName("");
		fixture.setNonHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setVmVersion("");
		fixture.setHasUnloadClazzCount(1L);
		fixture.setHasloadClazzCount(1L);
		fixture.setProcessListCount(1);
		fixture.setArguments(EasyMock.createNiceMock(List.class));
		fixture.setVersionName("");
		fixture.setLoadClazzCount(1);

		MemoryUsage result = fixture.getHeapMemoryUsage();

		// add additional test code here
		assertNotNull(result);
		assertEquals("init = 1(0K) used = 1(0K) committed = 1(0K) max = 1(0K)", result.toString());
		assertEquals(1L, result.getInit());
		assertEquals(1L, result.getCommitted());
		assertEquals(1L, result.getUsed());
		assertEquals(1L, result.getMax());
	}

	/**
	 * Run the int getLoadClazzCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	@Test
	public void testGetLoadClazzCount_1() throws Exception {
		SystemInfoBean fixture = new SystemInfoBean();
		fixture.setArchName("");
		fixture.setSystemProperties(EasyMock.createNiceMock(Map.class));
		fixture.setVmVendor("");
		fixture.setHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setOperateName("");
		fixture.setStartTime(new Date());
		fixture.setVmName("");
		fixture.setNonHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setVmVersion("");
		fixture.setHasUnloadClazzCount(1L);
		fixture.setHasloadClazzCount(1L);
		fixture.setProcessListCount(1);
		fixture.setArguments(EasyMock.createNiceMock(List.class));
		fixture.setVersionName("");
		fixture.setLoadClazzCount(1);

		int result = fixture.getLoadClazzCount();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the MemoryUsage getNonHeapMemoryUsage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	@Test
	public void testGetNonHeapMemoryUsage_1() throws Exception {
		SystemInfoBean fixture = new SystemInfoBean();
		fixture.setArchName("");
		fixture.setSystemProperties(EasyMock.createNiceMock(Map.class));
		fixture.setVmVendor("");
		fixture.setHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setOperateName("");
		fixture.setStartTime(new Date());
		fixture.setVmName("");
		fixture.setNonHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setVmVersion("");
		fixture.setHasUnloadClazzCount(1L);
		fixture.setHasloadClazzCount(1L);
		fixture.setProcessListCount(1);
		fixture.setArguments(EasyMock.createNiceMock(List.class));
		fixture.setVersionName("");
		fixture.setLoadClazzCount(1);

		MemoryUsage result = fixture.getNonHeapMemoryUsage();

		// add additional test code here
		assertNotNull(result);
		assertEquals("init = 1(0K) used = 1(0K) committed = 1(0K) max = 1(0K)", result.toString());
		assertEquals(1L, result.getInit());
		assertEquals(1L, result.getCommitted());
		assertEquals(1L, result.getUsed());
		assertEquals(1L, result.getMax());
	}

	/**
	 * Run the String getOperateName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	@Test
	public void testGetOperateName_1() throws Exception {
		SystemInfoBean fixture = new SystemInfoBean();
		fixture.setArchName("");
		fixture.setSystemProperties(EasyMock.createNiceMock(Map.class));
		fixture.setVmVendor("");
		fixture.setHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setOperateName("");
		fixture.setStartTime(new Date());
		fixture.setVmName("");
		fixture.setNonHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setVmVersion("");
		fixture.setHasUnloadClazzCount(1L);
		fixture.setHasloadClazzCount(1L);
		fixture.setProcessListCount(1);
		fixture.setArguments(EasyMock.createNiceMock(List.class));
		fixture.setVersionName("");
		fixture.setLoadClazzCount(1);

		String result = fixture.getOperateName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getProcessListCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	@Test
	public void testGetProcessListCount_1() throws Exception {
		SystemInfoBean fixture = new SystemInfoBean();
		fixture.setArchName("");
		fixture.setSystemProperties(EasyMock.createNiceMock(Map.class));
		fixture.setVmVendor("");
		fixture.setHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setOperateName("");
		fixture.setStartTime(new Date());
		fixture.setVmName("");
		fixture.setNonHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setVmVersion("");
		fixture.setHasUnloadClazzCount(1L);
		fixture.setHasloadClazzCount(1L);
		fixture.setProcessListCount(1);
		fixture.setArguments(EasyMock.createNiceMock(List.class));
		fixture.setVersionName("");
		fixture.setLoadClazzCount(1);

		int result = fixture.getProcessListCount();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Map<String, String> getSystemProperties() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	@Test
	public void testGetSystemProperties_1() throws Exception {
		SystemInfoBean fixture = new SystemInfoBean();
		fixture.setArchName("");
		fixture.setSystemProperties(EasyMock.createNiceMock(Map.class));
		fixture.setVmVendor("");
		fixture.setHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setOperateName("");
		fixture.setStartTime(new Date());
		fixture.setVmName("");
		fixture.setNonHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setVmVersion("");
		fixture.setHasUnloadClazzCount(1L);
		fixture.setHasloadClazzCount(1L);
		fixture.setProcessListCount(1);
		fixture.setArguments(EasyMock.createNiceMock(List.class));
		fixture.setVersionName("");
		fixture.setLoadClazzCount(1);

		Map<String, String> result = fixture.getSystemProperties();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getVersionName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	@Test
	public void testGetVersionName_1() throws Exception {
		SystemInfoBean fixture = new SystemInfoBean();
		fixture.setArchName("");
		fixture.setSystemProperties(EasyMock.createNiceMock(Map.class));
		fixture.setVmVendor("");
		fixture.setHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setOperateName("");
		fixture.setStartTime(new Date());
		fixture.setVmName("");
		fixture.setNonHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setVmVersion("");
		fixture.setHasUnloadClazzCount(1L);
		fixture.setHasloadClazzCount(1L);
		fixture.setProcessListCount(1);
		fixture.setArguments(EasyMock.createNiceMock(List.class));
		fixture.setVersionName("");
		fixture.setLoadClazzCount(1);

		String result = fixture.getVersionName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getVmName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	@Test
	public void testGetVmName_1() throws Exception {
		SystemInfoBean fixture = new SystemInfoBean();
		fixture.setArchName("");
		fixture.setSystemProperties(EasyMock.createNiceMock(Map.class));
		fixture.setVmVendor("");
		fixture.setHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setOperateName("");
		fixture.setStartTime(new Date());
		fixture.setVmName("");
		fixture.setNonHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setVmVersion("");
		fixture.setHasUnloadClazzCount(1L);
		fixture.setHasloadClazzCount(1L);
		fixture.setProcessListCount(1);
		fixture.setArguments(EasyMock.createNiceMock(List.class));
		fixture.setVersionName("");
		fixture.setLoadClazzCount(1);

		String result = fixture.getVmName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getVmVendor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	@Test
	public void testGetVmVendor_1() throws Exception {
		SystemInfoBean fixture = new SystemInfoBean();
		fixture.setArchName("");
		fixture.setSystemProperties(EasyMock.createNiceMock(Map.class));
		fixture.setVmVendor("");
		fixture.setHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setOperateName("");
		fixture.setStartTime(new Date());
		fixture.setVmName("");
		fixture.setNonHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setVmVersion("");
		fixture.setHasUnloadClazzCount(1L);
		fixture.setHasloadClazzCount(1L);
		fixture.setProcessListCount(1);
		fixture.setArguments(EasyMock.createNiceMock(List.class));
		fixture.setVersionName("");
		fixture.setLoadClazzCount(1);

		String result = fixture.getVmVendor();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getVmVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	@Test
	public void testGetVmVersion_1() throws Exception {
		SystemInfoBean fixture = new SystemInfoBean();
		fixture.setArchName("");
		fixture.setSystemProperties(EasyMock.createNiceMock(Map.class));
		fixture.setVmVendor("");
		fixture.setHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setOperateName("");
		fixture.setStartTime(new Date());
		fixture.setVmName("");
		fixture.setNonHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setVmVersion("");
		fixture.setHasUnloadClazzCount(1L);
		fixture.setHasloadClazzCount(1L);
		fixture.setProcessListCount(1);
		fixture.setArguments(EasyMock.createNiceMock(List.class));
		fixture.setVersionName("");
		fixture.setLoadClazzCount(1);

		String result = fixture.getVmVersion();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setProcessListCount(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	@Test
	public void testSetProcessListCount_1() throws Exception {
		SystemInfoBean fixture = new SystemInfoBean();
		fixture.setArchName("");
		fixture.setSystemProperties(EasyMock.createNiceMock(Map.class));
		fixture.setVmVendor("");
		fixture.setHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setOperateName("");
		fixture.setStartTime(new Date());
		fixture.setVmName("");
		fixture.setNonHeapMemoryUsage(new MemoryUsage(1L, 1L, 1L, 1L));
		fixture.setVmVersion("");
		fixture.setHasUnloadClazzCount(1L);
		fixture.setHasloadClazzCount(1L);
		fixture.setProcessListCount(1);
		fixture.setArguments(EasyMock.createNiceMock(List.class));
		fixture.setVersionName("");
		fixture.setLoadClazzCount(1);
		int processListCount = 1;

		fixture.setProcessListCount(processListCount);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception if the initialization fails for some reason
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
		new org.junit.runner.JUnitCore().run(SystemInfoBean_WGTest.class);
	}
}
