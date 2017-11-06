package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_systemlog database table.
 * 
 */
@Entity
@Table(name="t_systemlog")
@NamedQuery(name="Systemlog.findAll", query="SELECT s FROM Systemlog s")
public class Systemlog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String account;

	private String content;

	@Column(name="diff_area_login")
	private String diffAreaLogin;

	@Column(name="login_area")
	private String loginArea;

	private String login_iP;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="login_time")
	private Date loginTime;

	private String title;

	private int type;

	public Systemlog() {
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

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDiffAreaLogin() {
		return this.diffAreaLogin;
	}

	public void setDiffAreaLogin(String diffAreaLogin) {
		this.diffAreaLogin = diffAreaLogin;
	}

	public String getLoginArea() {
		return this.loginArea;
	}

	public void setLoginArea(String loginArea) {
		this.loginArea = loginArea;
	}

	public String getLogin_iP() {
		return this.login_iP;
	}

	public void setLogin_iP(String login_iP) {
		this.login_iP = login_iP;
	}

	public Date getLoginTime() {
		return this.loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

}