package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_validate_code database table.
 * 
 */
@Entity
@Table(name="t_validate_code")
@NamedQuery(name="ValidateCode.findAll", query="SELECT v FROM ValidateCode v")
public class ValidateCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="item_id")
	private int itemId;

	@Column(name="item_type")
	private int itemType;

	@Column(name="operation_type")
	private int operationType;

	private String phone;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="send_time")
	private Date sendTime;

	@Column(name="validate_code")
	private String validateCode;

	public ValidateCode() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getItemType() {
		return this.itemType;
	}

	public void setItemType(int itemType) {
		this.itemType = itemType;
	}

	public int getOperationType() {
		return this.operationType;
	}

	public void setOperationType(int operationType) {
		this.operationType = operationType;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getSendTime() {
		return this.sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public String getValidateCode() {
		return this.validateCode;
	}

	public void setValidateCode(String validateCode) {
		this.validateCode = validateCode;
	}

}