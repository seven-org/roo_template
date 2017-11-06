package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_activity database table.
 * 
 */
@Entity
@Table(name="t_activity")
public class Activity implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ActivityPK id;

	@Column(name="item_id")
	private int itemId;

	private String photo;

	public Activity() {
	}

	public ActivityPK getId() {
		return this.id;
	}

	public void setId(ActivityPK id) {
		this.id = id;
	}

	public int getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}