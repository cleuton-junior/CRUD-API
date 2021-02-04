package com.main.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Student implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1077998168742592900L;

	@Id
	@SequenceGenerator(name = "SQ_STU_NU", sequenceName = "SQ_ML_NU", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SQ_STU_NU")
	@Column(name = "STU_NU")
	private int student_id;
	
	@Column(name = "STU_NA")
	private String student_name;
	
	@Column(name = "STU_EM")
	private String student_email;
	
	@Column(name = "STU_BR")
	private String student_branck;
	
	public Student() {
		super();
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_email() {
		return student_email;
	}
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
	public String getStudent_branck() {
		return student_branck;
	}
	public void setStudent_branck(String student_branck) {
		this.student_branck = student_branck;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((student_branck == null) ? 0 : student_branck.hashCode());
		result = prime * result + ((student_email == null) ? 0 : student_email.hashCode());
		result = prime * result + student_id;
		result = prime * result + ((student_name == null) ? 0 : student_name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (student_branck == null) {
			if (other.student_branck != null)
				return false;
		} else if (!student_branck.equals(other.student_branck))
			return false;
		if (student_email == null) {
			if (other.student_email != null)
				return false;
		} else if (!student_email.equals(other.student_email))
			return false;
		if (student_id != other.student_id)
			return false;
		if (student_name == null) {
			if (other.student_name != null)
				return false;
		} else if (!student_name.equals(other.student_name))
			return false;
		return true;
	}
	
	
}
