package ua.sergiishapoval.usercrud.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity


public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) //for autonumber
	private int id;
	@Size(min = 2, max = 30, message = "Name:length between {min} - {max}")
	@Pattern(regexp = "[A-Za-zА-Яа-я]*", message = "Name:Only letters allowed")
	private String name = "John Doe";
	@Max(value = 200, message = "Unbelievable age, try less than 200")
	@Min(value = 0, message = "Age should be positive")
	private int age = 1;
	private boolean isAdmin;
	@Column(nullable = false, updatable = false)
	@Temporal(TemporalType.DATE) //for autoDate
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Past(message = "Date should be in Past, cannot be updated")
	private Date createdDate = new Date();

	public User(){
	}

	public User(String name, int age, boolean isAdmin, int id, Date createdDate) {
		this.name = name;
		this.age = age;
		this.isAdmin = isAdmin;
		this.createdDate = createdDate;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}
