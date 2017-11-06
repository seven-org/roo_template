package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_agent_stall_type database table.
 * 
 */
@Entity
@Table(name="t_agent_stall_type")
@NamedQuery(name="AgentStallType.findAll", query="SELECT a FROM AgentStallType a")
public class AgentStallType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="agent_id")
	private int agentId;

	private String alias;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="is_show")
	private int isShow;

	private String photo;

	private int sort;

	@Column(name="stall_type_id")
	private String stallTypeId;

	public AgentStallType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAgentId() {
		return this.agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getIsShow() {
		return this.isShow;
	}

	public void setIsShow(int isShow) {
		this.isShow = isShow;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public int getSort() {
		return this.sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public String getStallTypeId() {
		return this.stallTypeId;
	}

	public void setStallTypeId(String stallTypeId) {
		this.stallTypeId = stallTypeId;
	}

}