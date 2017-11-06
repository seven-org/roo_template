package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_system_info database table.
 * 
 */
@Entity
@Table(name="t_system_info")
@NamedQuery(name="SystemInfo.findAll", query="SELECT s FROM SystemInfo s")
public class SystemInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="backstage_java_version")
	private String backstageJavaVersion;

	@Column(name="backstage_version")
	private String backstageVersion;

	@Column(name="mysql_version")
	private String mysqlVersion;

	@Column(name="running_environment")
	private String runningEnvironment;

	@Column(name="server_operation_system")
	private String serverOperationSystem;

	@Column(name="upload_restriction")
	private String uploadRestriction;

	public SystemInfo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBackstageJavaVersion() {
		return this.backstageJavaVersion;
	}

	public void setBackstageJavaVersion(String backstageJavaVersion) {
		this.backstageJavaVersion = backstageJavaVersion;
	}

	public String getBackstageVersion() {
		return this.backstageVersion;
	}

	public void setBackstageVersion(String backstageVersion) {
		this.backstageVersion = backstageVersion;
	}

	public String getMysqlVersion() {
		return this.mysqlVersion;
	}

	public void setMysqlVersion(String mysqlVersion) {
		this.mysqlVersion = mysqlVersion;
	}

	public String getRunningEnvironment() {
		return this.runningEnvironment;
	}

	public void setRunningEnvironment(String runningEnvironment) {
		this.runningEnvironment = runningEnvironment;
	}

	public String getServerOperationSystem() {
		return this.serverOperationSystem;
	}

	public void setServerOperationSystem(String serverOperationSystem) {
		this.serverOperationSystem = serverOperationSystem;
	}

	public String getUploadRestriction() {
		return this.uploadRestriction;
	}

	public void setUploadRestriction(String uploadRestriction) {
		this.uploadRestriction = uploadRestriction;
	}

}