package com.dinosys.infotech.assigment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dinosys.infotech.assigment.entities.Category;
import com.dinosys.infotech.assigment.entities.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{
	public List<Users> findByNameContaining(String category);

	public List<Users> findByNameContainingAndEmailContaining(String name, String mobile);
	public List<Users> findByEmailContaining(String email);

	public List<Users> findByMobileContaining(String mobile);





}
