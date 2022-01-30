package org.jpf.utils.ios;

import static org.junit.Assert.assertEquals;

import org.jpf.utils.ios.ZipUtil;
import org.junit.Test;

public class ZipUtil_WHTest {
	@Test(timeout = 1000)
	public void testzip() {
		String s = "this is a test";

		byte[] b1 = ZipUtil.zip(s.getBytes());
		System.out.println("zip:" + ZipUtil.bytesToHexString(b1));
		byte[] b2 = ZipUtil.unZip(b1);
		System.out.println("unZip:" + new String(b2));
		assertEquals(s, new String(b2));

		byte[] b3 = ZipUtil.bZip2(s.getBytes());
		System.out.println("bZip2:" + ZipUtil.bytesToHexString(b3));
		byte[] b4 = ZipUtil.unBZip2(b3);
		System.out.println("unBZip2:" + new String(b4));
		assertEquals(s, new String(b4));

		byte[] b5 = ZipUtil.gZip(s.getBytes());
		System.out.println("bZip2:" + ZipUtil.bytesToHexString(b5));
		byte[] b6 = ZipUtil.unGZip(b5);
		System.out.println("unBZip2:" + new String(b6));
		assertEquals(s, new String(b6));
		//byte[] b7 = ZipUtil.jzlib(s.getBytes());
		//System.out.println("jzlib:" + ZipUtil.bytesToHexString(b7));
		//byte[] b8 = ZipUtil.unjzlib(b7);
		//System.out.println("unjzlib:" + new String(b8));
	}
}
