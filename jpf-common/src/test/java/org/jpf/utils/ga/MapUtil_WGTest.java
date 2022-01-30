package org.jpf.utils.ga;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.time.ZoneId;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.alibaba.fastjson.JSON;

/**
 * The class <code>MapUtil_WGTest</code> contains tests for the class
 * <code>{@link MapUtil}</code>.
 *
 * @generatedBy wupf at 20-5-7 上午10:14
 * @author wupf
 * @version $Revision: 1.0 $
 */
public class MapUtil_WGTest {

	@Test(timeout = 1000)
	public void test_sortMapByValue_R4() throws Throwable {

		Map<String, String> oriMap = new HashMap<String, String>();

		Map<String, String> wupf_result = MapUtil.getInstance().sortMapByValue(oriMap);

		System.out.println("jpf_check:sortMapByValue:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	@Test(timeout = 1000)
	public void testCycle1WithEmptyMap() throws Throwable {
		HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
		Map map0 = MapUtil.getInstance().sort(hashMap0);
		MapUtil.getInstance().cycle1(map0);
		assertTrue(map0.isEmpty());
	}

	@Test(timeout = 1000)
	public void testSortMapByValueReturningMapWhereIsEmptyIsFalse() throws Throwable {
		Map<String, String> map0 = ZoneId.SHORT_IDS;
		Map<String, String> map1 = MapUtil.getInstance().sortMapByValue(map0);
		assertNotNull(map1);
		assertFalse(map1.isEmpty());
	}

	@Test(timeout = 1000)
	public void testCreatesMapKeyComparatorAndCallsCompareTaking2Strings() throws Throwable {
		MapUtil.MapKeyComparator mapUtil_MapKeyComparator0 = new MapUtil.MapKeyComparator();
		int int0 = mapUtil_MapKeyComparator0.compare("cba", "cba");
		assertEquals(0, int0);
	}

	@Test(timeout = 1000)
	public void testSortMapByKeyReturningMapWhereSizeIsPositive() throws Throwable {
		Map<String, String> map0 = ZoneId.SHORT_IDS;
		Map<String, String> map1 = MapUtil.getInstance().sortMapByKey(map0);
		assertNotNull(map1);
		assertEquals(28, map1.size());
	}

	@Test(timeout = 1000)
	public void testCycle2() throws Throwable {
		HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
		MapUtil.getInstance().cycle2(hashMap0);
		assertTrue(hashMap0.isEmpty());
	}

	@Test(timeout = 1000)
	public void testCycle1() throws Throwable {
		Map<String, String> map0 = ZoneId.SHORT_IDS;
		MapUtil.getInstance().cycle1(map0);
		assertFalse(map0.isEmpty());
	}

	@Test(timeout = 1000)
	public void testSortMapByValueWithNull() throws Throwable {
		Map<String, String> map0 = MapUtil.getInstance().sortMapByValue((Map<String, String>) null);
		assertNull(map0);
	}

	@Test(timeout = 1000)
	public void testSortMapByKeyWithEmptyMap() throws Throwable {
		HashMap<String, String> hashMap0 = new HashMap<String, String>();
		Map<String, String> map0 = MapUtil.getInstance().sortMapByKey(hashMap0);
		assertNull(map0);
	}

	@Test(timeout = 1000)
	public void testCycle1ThrowsNullPointerException() throws Throwable {
		// Undeclared exception!
		try {
			MapUtil.getInstance().cycle1((Map) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testSortThrowsClassCastException() throws Throwable {
		HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
		Object object0 = new Object();
		hashMap0.put(object0, (Object) null);
		// Undeclared exception!
		try {
			MapUtil.getInstance().sort(hashMap0);
			fail("Expecting exception: ClassCastException");

		} catch (ClassCastException e) {
			//
			// java.lang.Object cannot be cast to java.lang.String
			//
		}
	}

	@Test(timeout = 1000)
	public void testSortMapByKeyThrowsNullPointerException() throws Throwable {
		HashMap<String, String> hashMap0 = new HashMap<String, String>();
		hashMap0.putIfAbsent((String) null, (String) null);
		// Undeclared exception!
		try {
			MapUtil.getInstance().sortMapByKey(hashMap0);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testSortMapByValueThrowsNullPointerException() throws Throwable {
		HashMap<String, String> hashMap0 = new HashMap<String, String>();
		hashMap0.put("wnba", "wnba");
		hashMap0.put((String) null, (String) null);
		// Undeclared exception!
		try {
			MapUtil.getInstance().sortMapByValue(hashMap0);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testCreatesMapValueComparator() throws Throwable {
		MapUtil.MapValueComparator mapUtil_MapValueComparator0 = new MapUtil.MapValueComparator();
		AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>(
				(String) null, (String) null);
		AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry1 = new AbstractMap.SimpleEntry<String, String>(
				abstractMap_SimpleEntry0);
		AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>(
				abstractMap_SimpleEntry1);
		// Undeclared exception!
		try {
			mapUtil_MapValueComparator0.compare((Map.Entry<String, String>) abstractMap_SimpleImmutableEntry0,
					(Map.Entry<String, String>) abstractMap_SimpleEntry1);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testCompareTaking2Map$Entrys() throws Throwable {
		MapUtil.MapValueComparator mapUtil_MapValueComparator0 = new MapUtil.MapValueComparator();
		AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>(
				"V_3WcS", "V_3WcS");
		int int0 = mapUtil_MapValueComparator0.compare((Map.Entry<String, String>) abstractMap_SimpleEntry0,
				(Map.Entry<String, String>) abstractMap_SimpleEntry0);
		assertEquals(0, int0);
	}

	@Test(timeout = 1000)
	public void testSortReturningMapWhereSizeIsPositive() throws Throwable {
		HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
		Integer integer0 = new Integer((-1610));
		hashMap0.put("'0YQ4WyE)scG", integer0);
		hashMap0.put("iuT^iGzl!Ma=n", integer0);
		Map map0 = MapUtil.getInstance().sort(hashMap0);
		assertEquals(2, map0.size());
	}

	@Test
	public void testsortMapByValue_1() throws Exception {
		Map<String, String> map = new HashMap<String, String>();

		map.put("KFC", "kfc");
		map.put("WNBA", "wnba");
		map.put("NBA", "nba");
		map.put("CBA", "cba");
		map.put("CBA", "def");
		// Map<String, String> resultMap = sortMapByKey(map); //按Key进行排序
		Map<String, String> resultMap = MapUtil.getInstance().sortMapByValue(map); // 按Value进行排序

		MapUtil.getInstance().cycle1(resultMap);
	}

	/**
	 * Run the Map<String, String> sortMapByKey(Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:14
	 */
	@Test
	public void testSortMapByKey_1() throws Exception {
		Map<String, String> map = null;

		Map<String, String> result = MapUtil.getInstance().sortMapByKey(map);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void writeMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:14
	 */
	@Test
	public void testWriteMap_1() throws Exception {

		MapUtil.getInstance().writeMap();

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception if the initialization fails for some reason
	 *
	 * @generatedBy wupf at 20-5-7 上午10:14
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
	 * @generatedBy wupf at 20-5-7 上午10:14
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MapUtil_WGTest.class);
	}
}
