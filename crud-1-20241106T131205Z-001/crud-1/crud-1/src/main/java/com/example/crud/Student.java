package com.example.crud;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="Students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ; 
	
	@Column(name = "user_name", nullable = false)
	private String userName ; 
	

	@Column(name = "type", nullable = false)
	private String type ;
	
	@Column(name = "engName", nullable = false)
	private String displayname_en ;


	@Column(name = "email", unique = true)
	private String email ;
	
	@Column(name = "faculty", nullable = false)
	private String faculty ;
	
}
	
	
