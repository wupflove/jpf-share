package org.jpf.utils.ios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>JpfFileUtil_WGTest</code> contains tests for the class
 * <code>{@link JpfFileUtil}</code>.
 *
 * @generatedBy wupf at 21-3-27 下午8:33
 * @author wupf
 * @version $Revision: 1.0 $
 */
public class JpfFileUtil_WGTest {

	/**
	 * Run the long FileSize(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testFileSize_1() throws Exception {
		String pathAndFile = "";

		long result = JpfFileUtil.FileSize(pathAndFile);

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the void checkFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(expected = java.lang.Exception.class)
	public void testCheckFile_1() throws Exception {
		String strFileName = "";

		JpfFileUtil.checkFile(strFileName);

		// add additional test code here
	}

	/**
	 * Run the void checkFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(expected = java.lang.Exception.class)
	public void testCheckFile_2() throws Exception {
		String strFileName = "";

		JpfFileUtil.checkFile(strFileName);

		// add additional test code here
	}

	/**
	 * Run the void checkFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(expected = java.lang.Exception.class)
	public void testCheckFile_3() throws Exception {
		String strFileName = "";

		JpfFileUtil.checkFile(strFileName);

		// add additional test code here
	}

	/**
	 * Run the void checkPath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(expected = java.lang.Exception.class)
	public void testCheckPath_1() throws Exception {
		String strFileName = "";

		JpfFileUtil.checkPath(strFileName);

		// add additional test code here
	}

	/**
	 * Run the void checkPath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(expected = java.lang.Exception.class)
	public void testCheckPath_2() throws Exception {
		String strFileName = "";

		JpfFileUtil.checkPath(strFileName);

		// add additional test code here
	}

	/**
	 * Run the void checkPath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(expected = java.lang.Exception.class)
	public void testCheckPath_3() throws Exception {
		String strFileName = "";

		JpfFileUtil.checkPath(strFileName);

		// add additional test code here
	}

	/**
	 * Run the boolean compareFileDate(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testCompareFileDate_1() throws Exception {
		String sFileName1 = "";
		String sFileName2 = "";

		boolean result = JpfFileUtil.compareFileDate(sFileName1, sFileName2);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean compareFileDate(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testCompareFileDate_2() throws Exception {
		String sFileName1 = "";
		String sFileName2 = "";

		boolean result = JpfFileUtil.compareFileDate(sFileName1, sFileName2);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void copyDir(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(timeout = 3000)
	public void testCopyDir_1() throws Exception {
		String src = "";
		String des = "";

		JpfFileUtil.copyDir(src, des);

		// add additional test code here
	}

	/**
	 * Run the void copyDir(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(timeout = 3000)
	public void testCopyDir_2() throws Exception {
		String src = "";
		String des = "";

		JpfFileUtil.copyDir(src, des);

		// add additional test code here
	}

	/**
	 * Run the void copyDir(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(timeout = 3000)
	public void testCopyDir_3() throws Exception {
		String src = "";
		String des = "";

		JpfFileUtil.copyDir(src, des);

		// add additional test code here
	}

	/**
	 * Run the void copyDir(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(timeout = 3000)
	public void testCopyDir_4() throws Exception {
		String src = "";
		String des = "";

		JpfFileUtil.copyDir(src, des);

		// add additional test code here
	}

	/**
	 * Run the void copyDir(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(timeout = 3000)
	public void testCopyDir_5() throws Exception {
		String src = "";
		String des = "";

		JpfFileUtil.copyDir(src, des);

		// add additional test code here
	}

	/**
	 * Run the void copyDir(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(timeout = 3000)
	public void testCopyDir_6() throws Exception {
		String src = "";
		String des = "";

		JpfFileUtil.copyDir(src, des);

		// add additional test code here
	}

	/**
	 * Run the void copyDir(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(timeout = 3000)
	public void testCopyDir_7() throws Exception {
		String src = "";
		String des = "";

		JpfFileUtil.copyDir(src, des);

		// add additional test code here
	}

	/**
	 * Run the void copyDir(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(timeout = 3000)
	public void testCopyDir_8() throws Exception {
		String src = "";
		String des = "";

		JpfFileUtil.copyDir(src, des);

		// add additional test code here
	}

	/**
	 * Run the void copyDir(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(timeout = 3000)
	public void testCopyDir_9() throws Exception {
		String src = "";
		String des = "";

		JpfFileUtil.copyDir(src, des);

		// add additional test code here
	}

	/**
	 * Run the void copyFile(String,String,List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(expected = java.lang.Exception.class)
	public void testCopyFile_17() throws Exception {
		String new_Path = "";
		String old_Path = "";
		List<String> arrFileList = null;

		JpfFileUtil.copyFile(new_Path, old_Path, arrFileList);

		// add additional test code here
	}

	/**
	 * Run the void delBlankDir(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testDelBlankDir_1() throws Exception {
		String inFileDir = "";

		JpfFileUtil.delBlankDir(inFileDir);

		// add additional test code here
	}

	/**
	 * Run the void delBlankDir(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testDelBlankDir_2() throws Exception {
		String inFileDir = "";

		JpfFileUtil.delBlankDir(inFileDir);

		// add additional test code here
	}

	/**
	 * Run the void delBlankDir(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testDelBlankDir_3() throws Exception {
		String inFileDir = "";

		JpfFileUtil.delBlankDir(inFileDir);

		// add additional test code here
	}

	/**
	 * Run the void delBlankDir(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testDelBlankDir_4() throws Exception {
		String inFileDir = "";

		JpfFileUtil.delBlankDir(inFileDir);

		// add additional test code here
	}

	/**
	 * Run the void delBlankDir(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testDelBlankDir_5() throws Exception {
		String inFileDir = "";

		JpfFileUtil.delBlankDir(inFileDir);

		// add additional test code here
	}

	/**
	 * Run the void delBlankDir(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testDelBlankDir_6() throws Exception {
		String inFileDir = "";

		JpfFileUtil.delBlankDir(inFileDir);

		// add additional test code here
	}

	/**
	 * Run the void delBlankDir(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testDelBlankDir_7() throws Exception {
		String inFileDir = "";

		JpfFileUtil.delBlankDir(inFileDir);

		// add additional test code here
	}

	/**
	 * Run the void delFile(String,ArrayList<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testDelFile_3() throws Exception {
		String in_Path = "";
		ArrayList<String> arrFileList = new ArrayList();

		JpfFileUtil.delFile(in_Path, arrFileList);

		// add additional test code here
	}

	/**
	 * Run the void delFile(String,ArrayList<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(timeout = 3000)
	public void testDelFile_4() throws Exception {
		String in_Path = "";
		ArrayList arrFileList = new ArrayList();
		arrFileList.add("");

		JpfFileUtil.delFile(in_Path, arrFileList);

		// add additional test code here
	}

	/**
	 * Run the boolean fileTime(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testFileTime_1() throws Exception {
		String url = "";
		int time = 1;

		boolean result = JpfFileUtil.fileTime(url, time);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean fileTime(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testFileTime_2() throws Exception {
		String url = "";
		int time = 1;

		boolean result = JpfFileUtil.fileTime(url, time);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String getCurrentPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetCurrentPath_1() throws Exception {

		String result = JpfFileUtil.getCurrentPath();

		// add additional test code here
		assertNotEquals("D:\\eclipse-java-2020-03-R-win32-x86_642\\eclipse", result);
	}

	/**
	 * Run the String getCurrentPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetCurrentPath_2() throws Exception {

		String result = JpfFileUtil.getCurrentPath();

		// add additional test code here
		assertNotEquals("D:\\eclipse-java-2020-03-R-win32-x86_642\\eclipse", result);
	}

	/**
	 * Run the String getFileDate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFileDate_1() throws Exception {
		String sFileName = "";

		String result = JpfFileUtil.getFileDate(sFileName);

		// add additional test code here
		assertEquals("1970-01-01 08:00:00", result);
	}

	/**
	 * Run the String getFileName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFileName_1() throws Exception {
		String sFilePathName = null;

		String result = JpfFileUtil.getFileName(sFilePathName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getFileName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFileName_2() throws Exception {
		String sFilePathName = "";

		String result = JpfFileUtil.getFileName(sFilePathName);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getFilePath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFilePath_1() throws Exception {
		String sFilePathName = "";

		String result = JpfFileUtil.getFilePath(sFilePathName);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getFilePath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFilePath_2() throws Exception {
		String sFilePathName = "";

		String result = JpfFileUtil.getFilePath(sFilePathName);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getFilePath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFilePath_3() throws Exception {
		String sFilePathName = "";

		String result = JpfFileUtil.getFilePath(sFilePathName);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getFileSeparator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFileSeparator_1() throws Exception {

		String result = JpfFileUtil.getFileSeparator();

		// add additional test code here
		assertEquals("\\", result);
	}

	/**
	 * Run the long getFileSize(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFileSize_1() throws Exception {
		String sFileName = "";

		long result = JpfFileUtil.getFileSize(sFileName);

		// add additional test code here
		assertEquals(-1L, result);
	}

	/**
	 * Run the long getFileSize(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFileSize_2() throws Exception {
		String sFileName = "";

		long result = JpfFileUtil.getFileSize(sFileName);

		// add additional test code here
		assertEquals(-1L, result);
	}

	/**
	 * Run the long getFileSize(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFileSize_3() throws Exception {
		String sFileName = "";

		long result = JpfFileUtil.getFileSize(sFileName);

		// add additional test code here
		assertEquals(-1L, result);
	}

	/**
	 * Run the List<String> getFileSystemWin() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFileSystemWin_1() throws Exception {

		List<String> result = JpfFileUtil.getFileSystemWin();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
		assertTrue(result.contains("C:\\"));
		assertTrue(result.contains("D:\\"));

	}

	/**
	 * Run the List<String> getFileSystemWin() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFileSystemWin_2() throws Exception {

		List<String> result = JpfFileUtil.getFileSystemWin();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.size());
		assertTrue(result.contains("C:\\"));
		assertTrue(result.contains("D:\\"));
		assertTrue(result.contains("F:\\"));
	}

	/**
	 * Run the String getFileTxt2(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFileTxt2_1() throws Exception {
		String strFileName = null;

		String result = JpfFileUtil.getFileTxt2(strFileName);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getFileTxt2(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFileTxt2_2() throws Exception {
		String strFileName = "";

		String result = JpfFileUtil.getFileTxt2(strFileName);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getFileTxt2(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFileTxt2_3() throws Exception {
		String strFileName = "";

		String result = JpfFileUtil.getFileTxt2(strFileName);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getFileTxt2(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFileTxt2_4() throws Exception {
		String strFileName = "";

		String result = JpfFileUtil.getFileTxt2(strFileName);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the List<String> getFileTxt2List(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFileTxt2List_1() throws Exception {
		String strFileName = null;
		String strEncode = "";

		List<String> result = JpfFileUtil.getFileTxt2List(strFileName, strEncode);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> getFileTxt2List(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFileTxt2List_2() throws Exception {
		String strFileName = "";
		String strEncode = "";

		List<String> result = JpfFileUtil.getFileTxt2List(strFileName, strEncode);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> getFileTxt2List(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFileTxt2List_3() throws Exception {
		String strFileName = "";
		String strEncode = "";

		List<String> result = JpfFileUtil.getFileTxt2List(strFileName, strEncode);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> getFileTxt2List(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFileTxt2List_4() throws Exception {
		String strFileName = "";
		String strEncode = "";

		List<String> result = JpfFileUtil.getFileTxt2List(strFileName, strEncode);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> getFileTxt2List(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFileTxt2List_5() throws Exception {
		String strFileName = "";
		String strEncode = "";

		List<String> result = JpfFileUtil.getFileTxt2List(strFileName, strEncode);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> getFileTxt2List(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFileTxt2List_6() throws Exception {
		String strFileName = "";
		String strEncode = "";

		List<String> result = JpfFileUtil.getFileTxt2List(strFileName, strEncode);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> getFileTxt2List(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFileTxt2List_7() throws Exception {
		String strFileName = "";
		String strEncode = "";

		List<String> result = JpfFileUtil.getFileTxt2List(strFileName, strEncode);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> getFileTxt2List(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFileTxt2List_8() throws Exception {
		String strFileName = "a";
		String strEncode = "a";

		List<String> result = JpfFileUtil.getFileTxt2List(strFileName, strEncode);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> getFileTxt2List(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFileTxt2List_9() throws Exception {
		String strFileName = "";
		String strEncode = "";

		List<String> result = JpfFileUtil.getFileTxt2List(strFileName, strEncode);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void getFiles(String,Vector<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFiles_1() throws Exception {
		String inFilePath = "";
		Vector<String> v = new Vector();

		JpfFileUtil.getFiles(inFilePath, v);

		// add additional test code here
	}

	/**
	 * Run the void getFiles(String,Vector<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFiles_2() throws Exception {
		String inFilePath = "";
		Vector<String> v = new Vector();

		JpfFileUtil.getFiles(inFilePath, v);

		// add additional test code here
	}

	/**
	 * Run the void getFiles(String,Vector<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFiles_3() throws Exception {
		String inFilePath = "";
		Vector<String> v = new Vector();

		JpfFileUtil.getFiles(inFilePath, v);

		// add additional test code here
	}

	/**
	 * Run the void getFiles(String,Vector<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFiles_4() throws Exception {
		String inFilePath = "";
		Vector<String> v = new Vector();

		JpfFileUtil.getFiles(inFilePath, v);

		// add additional test code here
	}

	/**
	 * Run the void getFiles(String,Vector<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFiles_5() throws Exception {
		String inFilePath = "";
		Vector<String> v = new Vector();

		JpfFileUtil.getFiles(inFilePath, v);

		// add additional test code here
	}

	/**
	 * Run the void getFiles(String,Vector<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFiles_6() throws Exception {
		String inFilePath = "";
		Vector<String> v = new Vector();
		String strFileType = "";

		JpfFileUtil.getFiles(inFilePath, v, strFileType);

		// add additional test code here
	}

	/**
	 * Run the void getFiles(String,Vector<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFiles_7() throws Exception {
		String inFilePath = "";
		Vector<String> v = new Vector();
		String strFileType = "";

		JpfFileUtil.getFiles(inFilePath, v, strFileType);

		// add additional test code here
	}

	/**
	 * Run the void getFilesWithFilter(String,Vector<String>,MyFilter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFilesWithFilter_1() throws Exception {
		String inFilePath = "";
		Vector<String> v = new Vector();
		JpfFileUtil.MyFilter cMyFilter = new JpfFileUtil.MyFilter("");

		JpfFileUtil.getFilesWithFilter(inFilePath, v, cMyFilter);

		// add additional test code here
	}

	/**
	 * Run the void getFilesWithFilter(String,Vector<String>,MyFilter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFilesWithFilter_2() throws Exception {
		String inFilePath = "";
		Vector<String> v = new Vector();
		JpfFileUtil.MyFilter cMyFilter = new JpfFileUtil.MyFilter("");

		JpfFileUtil.getFilesWithFilter(inFilePath, v, cMyFilter);

		// add additional test code here
	}

	/**
	 * Run the void getFilesWithFilter(String,Vector<String>,MyFilter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFilesWithFilter_3() throws Exception {
		String inFilePath = "";
		Vector<String> v = new Vector();
		JpfFileUtil.MyFilter cMyFilter = new JpfFileUtil.MyFilter("");

		JpfFileUtil.getFilesWithFilter(inFilePath, v, cMyFilter);

		// add additional test code here
	}

	/**
	 * Run the void getFilesWithFilter(String,Vector<String>,MyFilter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFilesWithFilter_4() throws Exception {
		String inFilePath = "";
		Vector<String> v = new Vector();
		JpfFileUtil.MyFilter cMyFilter = new JpfFileUtil.MyFilter("");

		JpfFileUtil.getFilesWithFilter(inFilePath, v, cMyFilter);

		// add additional test code here
	}

	/**
	 * Run the void getFilesWithFilter(String,Vector<String>,MyFilter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testGetFilesWithFilter_5() throws Exception {
		String inFilePath = "";
		Vector<String> v = new Vector();
		JpfFileUtil.MyFilter cMyFilter = new JpfFileUtil.MyFilter("");

		JpfFileUtil.getFilesWithFilter(inFilePath, v, cMyFilter);

		// add additional test code here
	}

	/**
	 * Run the byte[] input2byte(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(expected = java.io.IOException.class)
	public void testInput2byte_1() throws Exception {
		InputStream inStream = new PipedInputStream();

		byte[] result = JpfFileUtil.input2byte(inStream);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] input2byte(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(expected = java.io.IOException.class)
	public void testInput2byte_2() throws Exception {
		InputStream inStream = new PipedInputStream();

		byte[] result = JpfFileUtil.input2byte(inStream);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] input2byte(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(expected = java.io.IOException.class)
	public void testInput2byte_3() throws Exception {
		InputStream inStream = new PipedInputStream();

		byte[] result = JpfFileUtil.input2byte(inStream);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] input2byte(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(expected = java.io.IOException.class)
	public void testInput2byte_4() throws Exception {
		InputStream inStream = new PipedInputStream();

		byte[] result = JpfFileUtil.input2byte(inStream);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isDirectory(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testIsDirectory_1() throws Exception {
		String strInput = "";

		boolean result = JpfFileUtil.isDirectory(strInput);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDirectory(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testIsDirectory_2() throws Exception {
		String strInput = "";

		boolean result = JpfFileUtil.isDirectory(strInput);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDirectory(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testIsDirectory_3() throws Exception {
		String strInput = "";

		boolean result = JpfFileUtil.isDirectory(strInput);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isEmptyFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testIsEmptyFile_1() throws Exception {
		String strFileName = "";

		boolean result = JpfFileUtil.isEmptyFile(strFileName);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isEmptyFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testIsEmptyFile_2() throws Exception {
		String strFileName = "";

		boolean result = JpfFileUtil.isEmptyFile(strFileName);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isEmptyFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testIsEmptyFile_3() throws Exception {
		String strFileName = "";

		boolean result = JpfFileUtil.isEmptyFile(strFileName);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isEmptyFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testIsEmptyFile_4() throws Exception {
		String strFileName = "";

		boolean result = JpfFileUtil.isEmptyFile(strFileName);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testIsFile_1() throws Exception {
		String strInput = "";

		boolean result = JpfFileUtil.isFile(strInput);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testIsFile_2() throws Exception {
		String strInput = "";

		boolean result = JpfFileUtil.isFile(strInput);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testIsFile_3() throws Exception {
		String strInput = "";

		boolean result = JpfFileUtil.isFile(strInput);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isFile(File,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testIsFile_4() throws Exception {
		File dir = new File("");
		String name = "";

		boolean result = JpfFileUtil.isFile(dir, name);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isFile(File,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testIsFile_5() throws Exception {
		File dir = new File("");
		String name = "";

		boolean result = JpfFileUtil.isFile(dir, name);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isFile(File,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testIsFile_6() throws Exception {
		File dir = new File("");
		String name = "";

		boolean result = JpfFileUtil.isFile(dir, name);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String isFileExist(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testIsFileExist_4() throws Exception {
		String filePath = "";
		String fileName = "";

		String result = JpfFileUtil.isFileExist(filePath, fileName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String isFileExist(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testIsFileExist_5() throws Exception {
		String filePath = "";
		String fileName = "";

		String result = JpfFileUtil.isFileExist(filePath, fileName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String isFileExist(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testIsFileExist_6() throws Exception {
		String filePath = "";
		String fileName = "";

		String result = JpfFileUtil.isFileExist(filePath, fileName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String isFileExist(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testIsFileExist_7() throws Exception {
		String filePath = "";
		String fileName = "";

		String result = JpfFileUtil.isFileExist(filePath, fileName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void keepFilesByType(Vector<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testKeepFilesByType_1() throws Exception {
		Vector<String> v = new Vector();
		String inFileType = "";

		JpfFileUtil.keepFilesByType(v, inFileType);

		// add additional test code here
	}

	/**
	 * Run the void keepFilesByType(Vector<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testKeepFilesByType_2() throws Exception {
		Vector<String> v = new Vector();
		String inFileType = "";

		JpfFileUtil.keepFilesByType(v, inFileType);

		// add additional test code here
	}

	/**
	 * Run the void keepFilesByType(Vector<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testKeepFilesByType_3() throws Exception {
		Vector<String> v = new Vector();
		String inFileType = "";

		JpfFileUtil.keepFilesByType(v, inFileType);

		// add additional test code here
	}

	/**
	 * Run the void nioTransferCopy(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testNioTransferCopy_1() throws Exception {
		File source = new File("");
		File target = new File("");

		JpfFileUtil.nioTransferCopy(source, target);

		// add additional test code here
	}

	/**
	 * Run the void nioTransferCopy(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testNioTransferCopy_2() throws Exception {
		File source = new File("");
		File target = new File("");

		JpfFileUtil.nioTransferCopy(source, target);

		// add additional test code here
	}

	/**
	 * Run the void nioTransferCopy(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testNioTransferCopy_3() throws Exception {
		File source = new File("");
		File target = new File("");

		JpfFileUtil.nioTransferCopy(source, target);

		// add additional test code here
	}

	/**
	 * Run the void nioTransferCopy(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testNioTransferCopy_4() throws Exception {
		File source = new File("");
		File target = new File("");

		JpfFileUtil.nioTransferCopy(source, target);

		// add additional test code here
	}

	/**
	 * Run the void nioTransferCopy(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testNioTransferCopy_5() throws Exception {
		File source = new File("");
		File target = new File("");

		JpfFileUtil.nioTransferCopy(source, target);

		// add additional test code here
	}

	/**
	 * Run the boolean nioWriteAppendable(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testNioWriteAppendable_1() throws Exception {
		String contents = "";
		String filePath = "";

		boolean result = JpfFileUtil.nioWriteAppendable(contents, filePath);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean nioWriteAppendable(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testNioWriteAppendable_2() throws Exception {
		String contents = "";
		String filePath = "";

		boolean result = JpfFileUtil.nioWriteAppendable(contents, filePath);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean nioWriteFile(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testNioWriteFile_1() throws Exception {
		String contents = "";
		String filePath = "";

		boolean result = JpfFileUtil.nioWriteFile(contents, filePath);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean nioWriteFile(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testNioWriteFile_2() throws Exception {
		String contents = "";
		String filePath = "";

		boolean result = JpfFileUtil.nioWriteFile(contents, filePath);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean nioWriteFile(String,String,OpenOption) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testNioWriteFile_3() throws Exception {
		String filePath = "";
		String contents = "";
		OpenOption openOption = null;

		boolean result = JpfFileUtil.nioWriteFile(filePath, contents, openOption);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean nioWriteFile(String,String,OpenOption) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testNioWriteFile_4() throws Exception {
		String filePath = "";
		String contents = "";
		OpenOption openOption = EasyMock.createMock(OpenOption.class);
		// add mock object expectations here

		EasyMock.replay(openOption);

		boolean result = JpfFileUtil.nioWriteFile(filePath, contents, openOption);

		// add additional test code here
		EasyMock.verify(openOption);
		assertTrue(result);
	}

	/**
	 * Run the boolean nioWriteFile(String,String,OpenOption) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testNioWriteFile_5() throws Exception {
		String filePath = "";
		String contents = "";
		OpenOption openOption = EasyMock.createMock(OpenOption.class);
		// add mock object expectations here

		EasyMock.replay(openOption);

		boolean result = JpfFileUtil.nioWriteFile(filePath, contents, openOption);

		// add additional test code here
		EasyMock.verify(openOption);
		assertTrue(result);
	}

	/**
	 * Run the boolean nioWriteFile(String,String,OpenOption) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testNioWriteFile_6() throws Exception {
		String filePath = "";
		String contents = "";
		OpenOption openOption = null;

		boolean result = JpfFileUtil.nioWriteFile(filePath, contents, openOption);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean nioWriteFile(String,String,OpenOption) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testNioWriteFile_7() throws Exception {
		String filePath = "";
		String contents = "";
		OpenOption openOption = null;

		boolean result = JpfFileUtil.nioWriteFile(filePath, contents, openOption);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean nioWriteFile(String,String,OpenOption) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testNioWriteFile_8() throws Exception {
		String filePath = "";
		String contents = "";
		OpenOption openOption = EasyMock.createMock(OpenOption.class);
		// add mock object expectations here

		EasyMock.replay(openOption);

		boolean result = JpfFileUtil.nioWriteFile(filePath, contents, openOption);

		// add additional test code here
		EasyMock.verify(openOption);
		assertTrue(result);
	}

	/**
	 * Run the boolean nioWriteFile(String,String,OpenOption) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testNioWriteFile_9() throws Exception {
		String filePath = "";
		String contents = "";
		OpenOption openOption = EasyMock.createMock(OpenOption.class);
		// add mock object expectations here

		EasyMock.replay(openOption);

		boolean result = JpfFileUtil.nioWriteFile(filePath, contents, openOption);

		// add additional test code here
		EasyMock.verify(openOption);
		assertTrue(result);
	}

	/**
	 * Run the void removeFilesByType(Vector<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testRemoveFilesByType_1() throws Exception {
		Vector<String> v = new Vector();
		String inFileType = "";

		JpfFileUtil.removeFilesByType(v, inFileType);

		// add additional test code here
	}

	/**
	 * Run the void removeFilesByType(Vector<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testRemoveFilesByType_2() throws Exception {
		Vector<String> v = new Vector();
		String inFileType = "";

		JpfFileUtil.removeFilesByType(v, inFileType);

		// add additional test code here
	}

	/**
	 * Run the void removeFilesByType(Vector<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Test
	public void testRemoveFilesByType_3() throws Exception {
		Vector<String> v = new Vector();
		String inFileType = "";

		JpfFileUtil.removeFilesByType(v, inFileType);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception if the initialization fails for some reason
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@Before
	public void setUp() throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception if the clean-up fails for some reason
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	@After
	public void tearDown() throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy wupf at 21-3-27 下午8:33
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(JpfFileUtil_WGTest.class);
	}
}
