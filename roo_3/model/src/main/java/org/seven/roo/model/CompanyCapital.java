package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the t_company_capital database table.
 * 
 */
@Entity
@Table(name="t_company_capital")
@NamedQuery(name="CompanyCapital.findAll", query="SELECT c FROM CompanyCapital c")
public class CompanyCapital implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="capital_money")
	private BigInteger capitalMoney;

	@Column(name="company_id")
	private String companyId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="order_number")
	private String orderNumber;

	@Column(name="payment_type")
	private int paymentType;

	@Column(name="trade_no")
	private String tradeNo;

	private int type;

	public CompanyCapital() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigInteger getCapitalMoney() {
		return this.capitalMoney;
	}

	public void setCapitalMoney(BigInteger capitalMoney) {
		this.capitalMoney = capitalMoney;
	}

	public String getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public int getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

}