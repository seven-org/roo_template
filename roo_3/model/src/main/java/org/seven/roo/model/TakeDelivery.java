package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_take_delivery database table.
 * 
 */
@Entity
@Table(name="t_take_delivery")
@NamedQuery(name="TakeDelivery.findAll", query="SELECT t FROM TakeDelivery t")
public class TakeDelivery implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="china_id")
	private String chinaId;

	@Column(name="china_name")
	private String chinaName;

	private String consignee;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private byte flag;

	private String location;

	private String phone;

	private byte sex;

	@Column(name="take_delivery_addr")
	private String takeDeliveryAddr;

	@Column(name="take_delivery_complete_address")
	private String takeDeliveryCompleteAddress;

	@Column(name="take_delivery_type")
	private String takeDeliveryType;

	private int type;

	@Column(name="user_id")
	private int userId;

	public TakeDelivery() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getChinaId() {
		return this.chinaId;
	}

	public void setChinaId(String chinaId) {
		this.chinaId = chinaId;
	}

	public String getChinaName() {
		return this.chinaName;
	}

	public void setChinaName(String chinaName) {
		this.chinaName = chinaName;
	}

	public String getConsignee() {
		return this.consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public byte getSex() {
		return this.sex;
	}

	public void setSex(byte sex) {
		this.sex = sex;
	}

	public String getTakeDeliveryAddr() {
		return this.takeDeliveryAddr;
	}

	public void setTakeDeliveryAddr(String takeDeliveryAddr) {
		this.takeDeliveryAddr = takeDeliveryAddr;
	}

	public String getTakeDeliveryCompleteAddress() {
		return this.takeDeliveryCompleteAddress;
	}

	public void setTakeDeliveryCompleteAddress(String takeDeliveryCompleteAddress) {
		this.takeDeliveryCompleteAddress = takeDeliveryCompleteAddress;
	}

	public String getTakeDeliveryType() {
		return this.takeDeliveryType;
	}

	public void setTakeDeliveryType(String takeDeliveryType) {
		this.takeDeliveryType = takeDeliveryType;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}