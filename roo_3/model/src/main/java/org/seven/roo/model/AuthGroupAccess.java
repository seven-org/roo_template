package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_auth_group_access database table.
 * 
 */
@Embeddable
@Table(name="t_auth_group_access")
@NamedQuery(name="AuthGroupAccess.findAll", query="SELECT a FROM AuthGroupAccess a")
public class AuthGroupAccess implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="group_id")
	private int groupId;

	private int uid;

	public AuthGroupAccess() {
	}

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public int getUid() {
		return this.uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

}