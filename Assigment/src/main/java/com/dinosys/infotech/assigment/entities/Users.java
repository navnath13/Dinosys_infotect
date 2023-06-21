package com.dinosys.infotech.assigment.entities;

import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String userName;
    @Column(unique=true)
	private String email;
	private String password;
	 @Column(unique=true)
	private String mobile;
	private String profile="https://t4.ftcdn.net/jpg/03/23/30/91/360_F_323309190_FwaLnwQ0tfL6TZbtvrja2rWXeVp6okGu.jpgs";
	private String lastSeen;
	private String upiid;
	private String status;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Category category;
	
	
	

}
