package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_auth_rule database table.
 * 
 */
@Entity
@Table(name="t_auth_rule")
@NamedQuery(name="AuthRule.findAll", query="SELECT a FROM AuthRule a")
public class AuthRule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String condition;

	private int createtime;

	private String icon;

	private byte ismenu;

	private String name;

	private int pid;

	private String remark;

	private String status;

	private String title;

	private String type;

	private int updatetime;

	private int weigh;

	public AuthRule() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCondition() {
		return this.condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public int getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(int createtime) {
		this.createtime = createtime;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public byte getIsmenu() {
		return this.ismenu;
	}

	public void setIsmenu(byte ismenu) {
		this.ismenu = ismenu;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPid() {
		return this.pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(int updatetime) {
		this.updatetime = updatetime;
	}

	public int getWeigh() {
		return this.weigh;
	}

	public void setWeigh(int weigh) {
		this.weigh = weigh;
	}

}