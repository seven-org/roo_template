package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the t_seller database table.
 * 
 */
@Entity
@Table(name="t_seller")
@NamedQuery(name="Seller.findAll", query="SELECT s FROM Seller s")
public class Seller implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String account;

	@Column(name="admin_id")
	private int adminId;

	@Column(name="client_id")
	private String clientId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private String email;

	@Column(name="food_market_id")
	private int foodMarketId;

	@Column(name="id_card")
	private String idCard;

	@Temporal(TemporalType.DATE)
	@Column(name="id_card_end_date")
	private Date idCardEndDate;

	@Column(name="id_card_photo_front")
	private String idCardPhotoFront;

	@Column(name="id_card_photo_opposite")
	private String idCardPhotoOpposite;

	@Temporal(TemporalType.DATE)
	@Column(name="id_card_start_date")
	private Date idCardStartDate;

	private BigInteger integral;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_get_inner_mail_time")
	private Date lastGetInnerMailTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_login")
	private Date lastLogin;

	@Column(name="last_login_ip")
	private String lastLoginIp;

	private BigInteger money;

	private String password;

	private String phone;

	private String rate;

	@Column(name="seller_name")
	private String sellerName;

	@Column(name="stall_id")
	private int stallId;

	@Column(name="stall_name")
	private String stallName;

	@Column(name="stall_no")
	private String stallNo;

	@Column(name="stall_type_id")
	private int stallTypeId;

	private int status;

	private String token;

	public Seller() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getAdminId() {
		return this.adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getFoodMarketId() {
		return this.foodMarketId;
	}

	public void setFoodMarketId(int foodMarketId) {
		this.foodMarketId = foodMarketId;
	}

	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public Date getIdCardEndDate() {
		return this.idCardEndDate;
	}

	public void setIdCardEndDate(Date idCardEndDate) {
		this.idCardEndDate = idCardEndDate;
	}

	public String getIdCardPhotoFront() {
		return this.idCardPhotoFront;
	}

	public void setIdCardPhotoFront(String idCardPhotoFront) {
		this.idCardPhotoFront = idCardPhotoFront;
	}

	public String getIdCardPhotoOpposite() {
		return this.idCardPhotoOpposite;
	}

	public void setIdCardPhotoOpposite(String idCardPhotoOpposite) {
		this.idCardPhotoOpposite = idCardPhotoOpposite;
	}

	public Date getIdCardStartDate() {
		return this.idCardStartDate;
	}

	public void setIdCardStartDate(Date idCardStartDate) {
		this.idCardStartDate = idCardStartDate;
	}

	public BigInteger getIntegral() {
		return this.integral;
	}

	public void setIntegral(BigInteger integral) {
		this.integral = integral;
	}

	public Date getLastGetInnerMailTime() {
		return this.lastGetInnerMailTime;
	}

	public void setLastGetInnerMailTime(Date lastGetInnerMailTime) {
		this.lastGetInnerMailTime = lastGetInnerMailTime;
	}

	public Date getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getLastLoginIp() {
		return this.lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public BigInteger getMoney() {
		return this.money;
	}

	public void setMoney(BigInteger money) {
		this.money = money;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRate() {
		return this.rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getSellerName() {
		return this.sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public int getStallId() {
		return this.stallId;
	}

	public void setStallId(int stallId) {
		this.stallId = stallId;
	}

	public String getStallName() {
		return this.stallName;
	}

	public void setStallName(String stallName) {
		this.stallName = stallName;
	}

	public String getStallNo() {
		return this.stallNo;
	}

	public void setStallNo(String stallNo) {
		this.stallNo = stallNo;
	}

	public int getStallTypeId() {
		return this.stallTypeId;
	}

	public void setStallTypeId(int stallTypeId) {
		this.stallTypeId = stallTypeId;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}