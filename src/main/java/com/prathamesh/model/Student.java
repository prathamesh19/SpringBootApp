package com.prathamesh.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "stdtab")
public class Student {

	/*
	 * @Id
	 * 
	 * @Column(name = "std_id_col")
	 * 
	 * @GeneratedValue(generator = "abc")
	 * 
	 * @GenericGenerator(name = "abc",strategy = "com.prathamesh.model.MyGen")
	 * private String stdId;
	 */
	
	@Id
	@Column(name = "std_id_col")
	private Integer stdId;
	
	@Column(name = "std_name_col")
	private String stdName;
	
	@Column(name = "std_dept_col")
	private String stdDept;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer stdId, String stdName, String stdDept) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdDept = stdDept;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdDept=" + stdDept + "]";
	}
	/**
	 * @return the stdId
	 */
	public Integer getStdId() {
		return stdId;
	}
	/**
	 * @param stdId the stdId to set
	 */
	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}
	/**
	 * @return the stdName
	 */
	public String getStdName() {
		return stdName;
	}
	/**
	 * @param stdName the stdName to set
	 */
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	/**
	 * @return the stdDept
	 */
	public String getStdDept() {
		return stdDept;
	}
	/**
	 * @param stdDept the stdDept to set
	 */
	public void setStdDept(String stdDept) {
		this.stdDept = stdDept;
	}
	
	
}
