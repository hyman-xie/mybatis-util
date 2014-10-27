package com.hyman.model.entity;

public abstract class ABaseEntity implements IEntity {

	private static final long serialVersionUID = -2975424897106620060L;
	
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
