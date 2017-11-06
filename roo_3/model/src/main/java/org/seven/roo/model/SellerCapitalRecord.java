package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the t_seller_capital_record database table.
 * 
 */
@Entity
@Table(name="t_seller_capital_record")
@NamedQuery(name="SellerCapitalRecord.findAll", query="SELECT s FROM SellerCapitalRecord s")
public class SellerCapitalRecord implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private BigInteger count;

	@Column(name="create_time")
	private Timestamp createTime;

	private int operation;

	@Column(name="operation_number")
	private String operationNumber;

	private String remark;

	@Column(name="seller_id")
	private int sellerId;

	public SellerCapitalRecord() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigInteger getCount() {
		return this.count;
	}

	public void setCount(BigInteger count) {
		this.count = count;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public int getOperation() {
		return this.operation;
	}

	public void setOperation(int operation) {
		this.operation = operation;
	}

	public String getOperationNumber() {
		return this.operationNumber;
	}

	public void setOperationNumber(String operationNumber) {
		this.operationNumber = operationNumber;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getSellerId() {
		return this.sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

}