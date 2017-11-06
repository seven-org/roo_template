package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_family_user_name database table.
 * 
 */
@Entity
@Table(name="t_family_user_name")
@NamedQuery(name="FamilyUserName.findAll", query="SELECT f FROM FamilyUserName f")
public class FamilyUserName implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="family_id")
	private int familyId;

	private String nickname;

	@Column(name="user_id")
	private int userId;

	@Column(name="users_id")
	private int usersId;

	public FamilyUserName() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFamilyId() {
		return this.familyId;
	}

	public void setFamilyId(int familyId) {
		this.familyId = familyId;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getUsersId() {
		return this.usersId;
	}

	public void setUsersId(int usersId) {
		this.usersId = usersId;
	}

}