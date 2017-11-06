package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the t_order database table.
 * 
 */
@Entity
@Table(name="t_order")
@NamedQuery(name="Order.findAll", query="SELECT o FROM Order o")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String address;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="confirm_time")
	private Date confirmTime;

	@Column(name="coupon_code")
	private String couponCode;

	@Column(name="coupon_price")
	private BigInteger couponPrice;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="estimate_amount")
	private BigInteger estimateAmount;

	@Column(name="estimate_amount_price")
	private BigInteger estimateAmountPrice;

	@Column(name="estimate_count")
	private BigDecimal estimateCount;

	@Column(name="evaluate_message")
	private String evaluateMessage;

	private int flag;

	@Column(name="food_market_id")
	private int foodMarketId;

	@Column(name="food_market_name")
	private String foodMarketName;

	@Column(name="food_market_photo")
	private String foodMarketPhoto;

	@Column(name="incubator_price")
	private BigInteger incubatorPrice;

	@Column(name="is_incubator")
	private int isIncubator;

	@Column(name="is_reminder")
	private int isReminder;

	@Column(name="is_urgent")
	private int isUrgent;

	@Column(name="manager_id")
	private int managerId;

	@Column(name="manager_phone")
	private String managerPhone;

	private int oos;

	@Column(name="oos_price")
	private BigInteger oosPrice;

	@Column(name="order_number")
	private String orderNumber;

	@Column(name="order_status")
	private int orderStatus;

	@Column(name="order_status_details")
	private int orderStatusDetails;

	@Column(name="pay_code")
	private String payCode;

	@Column(name="pay_money_status")
	private int payMoneyStatus;

	@Column(name="pay_name")
	private String payName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="pay_time")
	private Date payTime;

	private String phone;

	@Column(name="receiver_location")
	private String receiverLocation;

	private String remark;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="reminder_manager_time")
	private Date reminderManagerTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="reminder_time")
	private Date reminderTime;

	private int remindStall;

	@Column(name="sent_time")
	private int sentTime;

	@Column(name="shipping_id")
	private int shippingId;

	@Column(name="shipping_name")
	private String shippingName;

	@Column(name="shipping_price")
	private BigInteger shippingPrice;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="shipping_time")
	private Date shippingTime;

	@Column(name="shortage_status")
	private int shortageStatus;

	@Column(name="total_amount")
	private BigInteger totalAmount;

	@Column(name="total_count")
	private BigDecimal totalCount;

	@Column(name="trade_no")
	private String tradeNo;

	@Column(name="urgent_price")
	private BigInteger urgentPrice;

	@Column(name="user_id")
	private int userId;

	@Column(name="user_name")
	private String userName;

	@Column(name="weigh_price")
	private BigInteger weighPrice;

	@Column(name="weighing_confirm")
	private int weighingConfirm;

	public Order() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getConfirmTime() {
		return this.confirmTime;
	}

	public void setConfirmTime(Date confirmTime) {
		this.confirmTime = confirmTime;
	}

	public String getCouponCode() {
		return this.couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public BigInteger getCouponPrice() {
		return this.couponPrice;
	}

	public void setCouponPrice(BigInteger couponPrice) {
		this.couponPrice = couponPrice;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public BigInteger getEstimateAmount() {
		return this.estimateAmount;
	}

	public void setEstimateAmount(BigInteger estimateAmount) {
		this.estimateAmount = estimateAmount;
	}

	public BigInteger getEstimateAmountPrice() {
		return this.estimateAmountPrice;
	}

	public void setEstimateAmountPrice(BigInteger estimateAmountPrice) {
		this.estimateAmountPrice = estimateAmountPrice;
	}

	public BigDecimal getEstimateCount() {
		return this.estimateCount;
	}

	public void setEstimateCount(BigDecimal estimateCount) {
		this.estimateCount = estimateCount;
	}

	public String getEvaluateMessage() {
		return this.evaluateMessage;
	}

	public void setEvaluateMessage(String evaluateMessage) {
		this.evaluateMessage = evaluateMessage;
	}

	public int getFlag() {
		return this.flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public int getFoodMarketId() {
		return this.foodMarketId;
	}

	public void setFoodMarketId(int foodMarketId) {
		this.foodMarketId = foodMarketId;
	}

	public String getFoodMarketName() {
		return this.foodMarketName;
	}

	public void setFoodMarketName(String foodMarketName) {
		this.foodMarketName = foodMarketName;
	}

	public String getFoodMarketPhoto() {
		return this.foodMarketPhoto;
	}

	public void setFoodMarketPhoto(String foodMarketPhoto) {
		this.foodMarketPhoto = foodMarketPhoto;
	}

	public BigInteger getIncubatorPrice() {
		return this.incubatorPrice;
	}

	public void setIncubatorPrice(BigInteger incubatorPrice) {
		this.incubatorPrice = incubatorPrice;
	}

	public int getIsIncubator() {
		return this.isIncubator;
	}

	public void setIsIncubator(int isIncubator) {
		this.isIncubator = isIncubator;
	}

	public int getIsReminder() {
		return this.isReminder;
	}

	public void setIsReminder(int isReminder) {
		this.isReminder = isReminder;
	}

	public int getIsUrgent() {
		return this.isUrgent;
	}

	public void setIsUrgent(int isUrgent) {
		this.isUrgent = isUrgent;
	}

	public int getManagerId() {
		return this.managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getManagerPhone() {
		return this.managerPhone;
	}

	public void setManagerPhone(String managerPhone) {
		this.managerPhone = managerPhone;
	}

	public int getOos() {
		return this.oos;
	}

	public void setOos(int oos) {
		this.oos = oos;
	}

	public BigInteger getOosPrice() {
		return this.oosPrice;
	}

	public void setOosPrice(BigInteger oosPrice) {
		this.oosPrice = oosPrice;
	}

	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public int getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}

	public int getOrderStatusDetails() {
		return this.orderStatusDetails;
	}

	public void setOrderStatusDetails(int orderStatusDetails) {
		this.orderStatusDetails = orderStatusDetails;
	}

	public String getPayCode() {
		return this.payCode;
	}

	public void setPayCode(String payCode) {
		this.payCode = payCode;
	}

	public int getPayMoneyStatus() {
		return this.payMoneyStatus;
	}

	public void setPayMoneyStatus(int payMoneyStatus) {
		this.payMoneyStatus = payMoneyStatus;
	}

	public String getPayName() {
		return this.payName;
	}

	public void setPayName(String payName) {
		this.payName = payName;
	}

	public Date getPayTime() {
		return this.payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getReceiverLocation() {
		return this.receiverLocation;
	}

	public void setReceiverLocation(String receiverLocation) {
		this.receiverLocation = receiverLocation;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getReminderManagerTime() {
		return this.reminderManagerTime;
	}

	public void setReminderManagerTime(Date reminderManagerTime) {
		this.reminderManagerTime = reminderManagerTime;
	}

	public Date getReminderTime() {
		return this.reminderTime;
	}

	public void setReminderTime(Date reminderTime) {
		this.reminderTime = reminderTime;
	}

	public int getRemindStall() {
		return this.remindStall;
	}

	public void setRemindStall(int remindStall) {
		this.remindStall = remindStall;
	}

	public int getSentTime() {
		return this.sentTime;
	}

	public void setSentTime(int sentTime) {
		this.sentTime = sentTime;
	}

	public int getShippingId() {
		return this.shippingId;
	}

	public void setShippingId(int shippingId) {
		this.shippingId = shippingId;
	}

	public String getShippingName() {
		return this.shippingName;
	}

	public void setShippingName(String shippingName) {
		this.shippingName = shippingName;
	}

	public BigInteger getShippingPrice() {
		return this.shippingPrice;
	}

	public void setShippingPrice(BigInteger shippingPrice) {
		this.shippingPrice = shippingPrice;
	}

	public Date getShippingTime() {
		return this.shippingTime;
	}

	public void setShippingTime(Date shippingTime) {
		this.shippingTime = shippingTime;
	}

	public int getShortageStatus() {
		return this.shortageStatus;
	}

	public void setShortageStatus(int shortageStatus) {
		this.shortageStatus = shortageStatus;
	}

	public BigInteger getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(BigInteger totalAmount) {
		this.totalAmount = totalAmount;
	}

	public BigDecimal getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(BigDecimal totalCount) {
		this.totalCount = totalCount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public BigInteger getUrgentPrice() {
		return this.urgentPrice;
	}

	public void setUrgentPrice(BigInteger urgentPrice) {
		this.urgentPrice = urgentPrice;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public BigInteger getWeighPrice() {
		return this.weighPrice;
	}

	public void setWeighPrice(BigInteger weighPrice) {
		this.weighPrice = weighPrice;
	}

	public int getWeighingConfirm() {
		return this.weighingConfirm;
	}

	public void setWeighingConfirm(int weighingConfirm) {
		this.weighingConfirm = weighingConfirm;
	}

}