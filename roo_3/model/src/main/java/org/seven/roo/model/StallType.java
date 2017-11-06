package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_stall_type database table.
 * 
 */
@Entity
@Table(name="t_stall_type")
@NamedQuery(name="StallType.findAll", query="SELECT s FROM StallType s")
public class StallType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="admin_id")
	private int adminId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private int flag;

	@Column(name="stall_type_name")
	private String stallTypeName;

	public StallType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAdminId() {
		return this.adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getFlag() {
		return this.flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getStallTypeName() {
		return this.stallTypeName;
	}

	public void setStallTypeName(String stallTypeName) {
		this.stallTypeName = stallTypeName;
	}

}