package com.sap.belajar.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="appication_configuration")
public class ApplicationConfiguration {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="name",nullable=false)
	private String name;
	@Column(name="value",nullable=false)
	private String value;
	@Column(name="created_by",nullable=false)
	private String createdBy;
	@Column(name="created_at",nullable=false)
	private Date createdAt = new Date();
	@Column(name="updated_by")
	private String updatedBy;
	@Column(name="updated_at")
	private Date updatedAt = new Date();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}
