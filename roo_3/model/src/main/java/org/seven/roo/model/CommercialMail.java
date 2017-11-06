package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_commercial_mail database table.
 * 
 */
@Entity
@Table(name="t_commercial_mail")
@NamedQuery(name="CommercialMail.findAll", query="SELECT c FROM CommercialMail c")
public class CommercialMail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String content;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="expired_time")
	private Date expiredTime;

	private String from;

	@Column(name="from_type")
	private int fromType;

	@Column(name="is_readed")
	private int isReaded;

	private String to;

	@Column(name="to_type")
	private int toType;

	private int type;

	private String value;

	public CommercialMail() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getExpiredTime() {
		return this.expiredTime;
	}

	public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
	}

	public String getFrom() {
		return this.from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public int getFromType() {
		return this.fromType;
	}

	public void setFromType(int fromType) {
		this.fromType = fromType;
	}

	public int getIsReaded() {
		return this.isReaded;
	}

	public void setIsReaded(int isReaded) {
		this.isReaded = isReaded;
	}

	public String getTo() {
		return this.to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getToType() {
		return this.toType;
	}

	public void setToType(int toType) {
		this.toType = toType;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}