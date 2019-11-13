package com.nk.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "Customer")
public class Customer {

	@Id
	@GeneratedValue
	@Column(name = "customer_id", updatable = false)
	private Integer customerId;

	@Column(name = "forename")
	private String foreName;

	@Column(name = "surname")
	private String surName;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "date_of_birth", nullable = true)
	private Date dateOfBirth;

	public Customer() {
		super();
	}

	public Customer(Integer customerId, String foreName, String surName, Date dateOfBirth) {
		super();
		this.customerId = customerId;
		this.foreName = foreName;
		this.surName = surName;
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the customerId
	 */
	public Integer getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the foreName
	 */
	public String getForeName() {
		return foreName;
	}

	/**
	 * @param foreName the foreName to set
	 */
	public void setForeName(String foreName) {
		this.foreName = foreName;
	}

	/**
	 * @return the surName
	 */
	public String getSurName() {
		return surName;
	}

	/**
	 * @param surName the surName to set
	 */
	public void setSurName(String surName) {
		this.surName = surName;
	}

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", foreName=" + foreName + ", surName=" + surName
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}

}
