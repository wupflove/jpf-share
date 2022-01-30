/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.system;

import java.lang.management.MemoryUsage;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author wupf
 */
public class SystemInfoBean {

	// 加载类的数量
	private int loadClazzCount;
	// 已经加载类的数量
	private long hasloadClazzCount;
	// 尚未加载类的数量
	private long hasUnloadClazzCount;
	// 堆内存信息
	private MemoryUsage heapMemoryUsage;
	// 非堆内存信息
	private MemoryUsage nonHeapMemoryUsage;
	// 操作系统的名称
	private String operateName;
	// 操作系统的进程数
	private int processListCount;
	// 操作系统的架构
	private String archName;
	// 操作系统的版本号码
	private String versionName;
	// 虚拟机的名称
	private String vmName;
	// 虚拟机的版本
	private String vmVersion;
	// 系统的供应商的名称
	private String vmVendor;

	/**
	 * @return the loadClazzCount
	 */
	public int getLoadClazzCount() {
		return loadClazzCount;
	}

	/**
	 * @param loadClazzCount the loadClazzCount to set
	 */
	public void setLoadClazzCount(int loadClazzCount) {
		this.loadClazzCount = loadClazzCount;
	}

	/**
	 * @return the hasloadClazzCount
	 */
	public long getHasloadClazzCount() {
		return hasloadClazzCount;
	}

	/**
	 * @param hasloadClazzCount the hasloadClazzCount to set
	 */
	public void setHasloadClazzCount(long hasloadClazzCount) {
		this.hasloadClazzCount = hasloadClazzCount;
	}

	/**
	 * @return the hasUnloadClazzCount
	 */
	public long getHasUnloadClazzCount() {
		return hasUnloadClazzCount;
	}

	/**
	 * @param hasUnloadClazzCount the hasUnloadClazzCount to set
	 */
	public void setHasUnloadClazzCount(long hasUnloadClazzCount) {
		this.hasUnloadClazzCount = hasUnloadClazzCount;
	}

	/**
	 * @return the heapMemoryUsage
	 */
	public MemoryUsage getHeapMemoryUsage() {
		return heapMemoryUsage;
	}

	/**
	 * @param heapMemoryUsage the heapMemoryUsage to set
	 */
	public void setHeapMemoryUsage(MemoryUsage heapMemoryUsage) {
		this.heapMemoryUsage = heapMemoryUsage;
	}

	/**
	 * @return the nonHeapMemoryUsage
	 */
	public MemoryUsage getNonHeapMemoryUsage() {
		return nonHeapMemoryUsage;
	}

	/**
	 * @param nonHeapMemoryUsage the nonHeapMemoryUsage to set
	 */
	public void setNonHeapMemoryUsage(MemoryUsage nonHeapMemoryUsage) {
		this.nonHeapMemoryUsage = nonHeapMemoryUsage;
	}

	/**
	 * @return the operateName
	 */
	public String getOperateName() {
		return operateName;
	}

	/**
	 * @param operateName the operateName to set
	 */
	public void setOperateName(String operateName) {
		this.operateName = operateName;
	}

	/**
	 * @return the processListCount
	 */
	public int getProcessListCount() {
		return processListCount;
	}

	/**
	 * @param processListCount the processListCount to set
	 */
	public void setProcessListCount(int processListCount) {
		this.processListCount = processListCount;
	}

	/**
	 * @return the archName
	 */
	public String getArchName() {
		return archName;
	}

	/**
	 * @param archName the archName to set
	 */
	public void setArchName(String archName) {
		this.archName = archName;
	}

	/**
	 * @return the versionName
	 */
	public String getVersionName() {
		return versionName;
	}

	/**
	 * @param versionName the versionName to set
	 */
	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	/**
	 * @return the vmName
	 */
	public String getVmName() {
		return vmName;
	}

	/**
	 * @param vmName the vmName to set
	 */
	public void setVmName(String vmName) {
		this.vmName = vmName;
	}

	/**
	 * @return the vmVersion
	 */
	public String getVmVersion() {
		return vmVersion;
	}

	/**
	 * @param vmVersion the vmVersion to set
	 */
	public void setVmVersion(String vmVersion) {
		this.vmVersion = vmVersion;
	}

	/**
	 * @return the vmVendor
	 */
	public String getVmVendor() {
		return vmVendor;
	}

	/**
	 * @param vmVendor the vmVendor to set
	 */
	public void setVmVendor(String vmVendor) {
		this.vmVendor = vmVendor;
	}

	/**
	 * @return the startTime
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the arguments
	 */
	public List<String> getArguments() {
		return arguments;
	}

	/**
	 * @param arguments the arguments to set
	 */
	public void setArguments(List<String> arguments) {
		this.arguments = arguments;
	}

	/**
	 * @return the systemProperties
	 */
	public Map<String, String> getSystemProperties() {
		return systemProperties;
	}

	/**
	 * @param systemProperties the systemProperties to set
	 */
	public void setSystemProperties(Map<String, String> systemProperties) {
		this.systemProperties = systemProperties;
	}

	// JVM启动时间
	private Date startTime;
	// 输入参数
	private List<String> arguments;
	// 系统参数
	private Map<String, String> systemProperties;

	// setter and getter...

}
