package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_after_sale_log database table.
 * 
 */
@Entity
@Table(name="t_after_sale_log")
@NamedQuery(name="AfterSaleLog.findAll", query="SELECT a FROM AfterSaleLog a")
public class AfterSaleLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="after_number")
	private String afterNumber;

	private String status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="status_date")
	private Date statusDate;

	public AfterSaleLog() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAfterNumber() {
		return this.afterNumber;
	}

	public void setAfterNumber(String afterNumber) {
		this.afterNumber = afterNumber;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getStatusDate() {
		return this.statusDate;
	}

	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}

}