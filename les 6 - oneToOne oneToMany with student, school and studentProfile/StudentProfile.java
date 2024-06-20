package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class StudentProfile {
	@Id
	@GeneratedValue
	private int spId;
	private String bio;
	
	@OneToOne
	@JoinColumn(name="student_id")
	private Student student;

	public StudentProfile() {
	}
	
	public int getId() {
		return spId;
	}
	
	public StudentProfile(String bio) {
		this.bio = bio;
	}
	public void setId(int spId) {
		this.spId = spId;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
}
