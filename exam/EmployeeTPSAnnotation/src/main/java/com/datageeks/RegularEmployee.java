package com.datageeks;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "REGULAREMPLOYEETPS")
@PrimaryKeyJoinColumn(name = "EMP_FK_ID")

public class RegularEmployee extends Employee {
     
	@Column(name = "SALARY")
	private Float salary = null;
	
	@Column(name = "BONUS")
	private Float bonus = null;
	
	public RegularEmployee() {
		super();
	}
	public RegularEmployee(Integer empId, String empName, Float salary, Float bonus) {
		setEmpId(empId);
		setEmpName(empName);
		this.salary = salary;
		this.bonus = bonus;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	public void setBonus(Float bonus) {
		this.bonus = bonus;
	}
	public Float getSalary() {
		return salary;
	}
	public Float getBonus() {
		return bonus;
	}
	
	
}
