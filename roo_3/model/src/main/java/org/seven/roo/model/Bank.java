package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_bank database table.
 * 
 */
@Entity
@Table(name="t_bank")
@NamedQuery(name="Bank.findAll", query="SELECT b FROM Bank b")
public class Bank implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="bank_card")
	private String bankCard;

	@Column(name="bank_info_id")
	private int bankInfoId;

	@Column(name="bank_name")
	private String bankName;

	@Column(name="card_holder")
	private String cardHolder;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="id_card")
	private String idCard;

	@Column(name="item_id")
	private int itemId;

	@Column(name="open_bank")
	private String openBank;

	private String phone;

	private String photo;

	private int status;

	private int type;

	public Bank() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBankCard() {
		return this.bankCard;
	}

	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}

	public int getBankInfoId() {
		return this.bankInfoId;
	}

	public void setBankInfoId(int bankInfoId) {
		this.bankInfoId = bankInfoId;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getCardHolder() {
		return this.cardHolder;
	}

	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public int getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getOpenBank() {
		return this.openBank;
	}

	public void setOpenBank(String openBank) {
		this.openBank = openBank;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

}