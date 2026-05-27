package com.example.demo.que_5;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;


@Entity
@Table(name = "department_table")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long deptId; 
	
	@NotBlank(message = "Department Name cannot be blank")
	private String deptName; 
	
	@OneToMany
	@JoinColumn(name = "empId")
	private Employee emp; 
}
