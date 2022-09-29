package com.blz.EmpPayrollReact.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.blz.EmpPayrollReact.Dto.EmpDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class EmpModel {

	public EmpModel(EmpDto empDto) {
		this.name=empDto.getName();
		this.salary=empDto.getSalary();
		this.photo=empDto.getPhoto();
		this.gender=empDto.getGender();
		this.dept=empDto.getDept();
		this.day=empDto.getDay();
		this.month=empDto.getMonth();
		this.year=empDto.getYear();
		this.note=empDto.getNote();			
	}
	
	
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long empId;
    private String name;    
    private String salary;
    private String photo;
    private String gender;
    private String dept;
    private String day;
    private String month;
    private String year;
    private String note;
    
}
