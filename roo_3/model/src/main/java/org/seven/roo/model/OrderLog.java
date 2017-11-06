package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_order_log database table.
 * 
 */
@Entity
@Table(name="t_order_log")
@NamedQuery(name="OrderLog.findAll", query="SELECT o FROM OrderLog o")
public class OrderLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="order_number")
	private String orderNumber;

	@Column(name="order_status_details")
	private String orderStatusDetails;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="status_date")
	private Date statusDate;

	public OrderLog() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderStatusDetails() {
		return this.orderStatusDetails;
	}

	public void setOrderStatusDetails(String orderStatusDetails) {
		this.orderStatusDetails = orderStatusDetails;
	}

	public Date getStatusDate() {
		return this.statusDate;
	}

	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}

}