package org.jpf.utils.system;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>ToolsJarLocator_WGTest</code> contains tests for the class <code>{@link ToolsJarLocator}</code>.
 *
 * @generatedBy wupf at 20-5-7 上午10:15
 * @author wupf
 * @version $Revision: 1.0 $
 */
public class ToolsJarLocator_WGTest {

	/**
	 * @category:
	 * @Title: main
	 * @author wupf
	 * @date:2020年4月10日
	 * @param args
	 */
	@Test
	public void testmain() {

		new ToolsJarLocator();

		System.out.println("Java运行时环境版本:" + System.getProperty("java.version"));
		System.out.println("Java 运行时环境供应商:" + System.getProperty("java.vendor"));
		System.out.println("Java 供应商的URL:" + System.getProperty("java.vendor.url"));
		System.out.println("Java安装目录:" + System.getProperty("java.home"));
		System.out.println("Java 虚拟机规范版本:" + System.getProperty("java.vm.specification.version"));
		System.out.println("Java 类格式版本号:" + System.getProperty("java.class.version"));
		System.out.println("Java类路径:" + System.getProperty("java.class.path"));
		System.out.println("操作系统的名称:" + System.getProperty("os.name"));
		System.out.println("操作系统的架构:" + System.getProperty("os.arch"));
		System.out.println("操作系统的版本:" + System.getProperty("os.version"));
		System.out.println("用户的主目录:" + System.getProperty("user.home"));
		System.out.println("用户的当前工作目录:" + System.getProperty("user.dir"));
		System.out.println("自定义变量getProperty CONF_LOCATION:" + System.getProperty("conf.location"));
		System.out.println("自定义变量getenv CONF_LOCATION:" + System.getenv("conf.location"));
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
		new org.junit.runner.JUnitCore().run(ToolsJarLocator_WGTest.class);
	}
}
