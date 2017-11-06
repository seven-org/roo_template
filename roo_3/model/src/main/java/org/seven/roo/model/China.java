package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_china database table.
 * 
 */
@Entity
@Table(name="t_china")
@NamedQuery(name="China.findAll", query="SELECT c FROM China c")
public class China implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private byte areaFlag;

	private String areaKey;

	private int areaSort;

	private byte isShow;

	private byte level;

	private String name;

	private int pid;

	private String pinyin;

	public China() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getAreaFlag() {
		return this.areaFlag;
	}

	public void setAreaFlag(byte areaFlag) {
		this.areaFlag = areaFlag;
	}

	public String getAreaKey() {
		return this.areaKey;
	}

	public void setAreaKey(String areaKey) {
		this.areaKey = areaKey;
	}

	public int getAreaSort() {
		return this.areaSort;
	}

	public void setAreaSort(int areaSort) {
		this.areaSort = areaSort;
	}

	public byte getIsShow() {
		return this.isShow;
	}

	public void setIsShow(byte isShow) {
		this.isShow = isShow;
	}

	public byte getLevel() {
		return this.level;
	}

	public void setLevel(byte level) {
		this.level = level;
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

	public String getPinyin() {
		return this.pinyin;
	}

	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

}