package com.datageeks;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "CONTRACTEMPLOYEETPS")
@PrimaryKeyJoinColumn(name = "EMP_FK_ID")

public class ContractEmployee  extends Employee{

	@Column(name = "PAYPERHOUR")
	private Float payPerHour = null;
	
	@Column(name = "CONTRACTPERIOD")
	private String contractPeriod = null;
	
	public ContractEmployee() {
		super();
	}
	public ContractEmployee(Integer empId, String empName, Float payPerHour, String contractPeriod) {
		setEmpId(empId);
		setEmpName(empName);
		this.payPerHour = payPerHour;
		this.contractPeriod = contractPeriod;
	}
	public void setPayPerHour(Float payPerHour) {
		this.payPerHour = payPerHour;
	}
	public void setContractPeriod(String contractPeriod) {
		this.contractPeriod = contractPeriod;
	}
	public Float getPayPerHour() {
		return payPerHour;
	}
	public String getContractPeriod() {
		return contractPeriod;
	}
	
	
}
