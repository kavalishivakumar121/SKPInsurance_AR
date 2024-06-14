package com.app.skp.binding;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

public class CitizenApp {
//binding class is used for request and response purpose
	private Integer caseNum;
	private String citizenName;
	private String citizenEmail;
	private String citizenPhno;
	private String citizenGender;
	private LocalDate citizenDob;
	private Long citizenSsn;
	@CreationTimestamp
	private LocalDate createdDate;
	@UpdateTimestamp
	private LocalDate updatedDate;
	private String createdBy;
	public Integer getCaseNum() {
		return caseNum;
	}
	public void setCaseNum(Integer caseNum) {
		this.caseNum = caseNum;
	}
	public String getCitizenName() {
		return citizenName;
	}
	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}
	public String getCitizenEmail() {
		return citizenEmail;
	}
	public void setCitizenEmail(String citizenEmail) {
		this.citizenEmail = citizenEmail;
	}
	public String getCitizenPhno() {
		return citizenPhno;
	}
	public void setCitizenPhno(String citizenPhno) {
		this.citizenPhno = citizenPhno;
	}
	public String getCitizenGender() {
		return citizenGender;
	}
	public void setCitizenGender(String citizenGender) {
		this.citizenGender = citizenGender;
	}
	public LocalDate getCitizenDob() {
		return citizenDob;
	}
	public void setCitizenDob(LocalDate citizenDob) {
		this.citizenDob = citizenDob;
	}
	public Long getCitizenSsn() {
		return citizenSsn;
	}
	public void setCitizenSsn(Long citizenSsn) {
		this.citizenSsn = citizenSsn;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDate getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public CitizenApp() {
		super();
	}
	@Override
	public String toString() {
		return "CitizenApp [caseNum=" + caseNum + ", citizenName=" + citizenName + ", citizenEmail=" + citizenEmail
				+ ", citizenPhno=" + citizenPhno + ", citizenGender=" + citizenGender + ", citizenDob=" + citizenDob
				+ ", citizenSsn=" + citizenSsn + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate
				+ ", createdBy=" + createdBy + "]";
	}

	
}
