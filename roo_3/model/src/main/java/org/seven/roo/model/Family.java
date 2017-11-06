package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the t_family database table.
 * 
 */
@Entity
@Table(name="t_family")
@NamedQuery(name="Family.findAll", query="SELECT f FROM Family f")
public class Family implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="family_money")
	private BigInteger familyMoney;

	@Column(name="family_name")
	private String familyName;

	private byte flag;

	@Column(name="freeze_money")
	private BigInteger freezeMoney;

	public Family() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public BigInteger getFamilyMoney() {
		return this.familyMoney;
	}

	public void setFamilyMoney(BigInteger familyMoney) {
		this.familyMoney = familyMoney;
	}

	public String getFamilyName() {
		return this.familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public BigInteger getFreezeMoney() {
		return this.freezeMoney;
	}

	public void setFreezeMoney(BigInteger freezeMoney) {
		this.freezeMoney = freezeMoney;
	}

}