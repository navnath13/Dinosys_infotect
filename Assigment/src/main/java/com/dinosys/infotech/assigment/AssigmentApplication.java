package com.dinosys.infotech.assigment;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dinosys.infotech.assigment.entities.Category;
import com.dinosys.infotech.assigment.entities.Users;
import com.dinosys.infotech.assigment.repository.CategoryRepository;
import com.dinosys.infotech.assigment.repository.UserRepository;

@SpringBootApplication
public class AssigmentApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {

		SpringApplication.run(AssigmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * //this the creatint user list Users user = new Users();
		 * user.setName("anuskha"); user.setEmail("anushka@gmai.com");
		 * user.setPassword("3884993"); user.setStatus("i am sad no");
		 * user.setMobile("9890112023"); Users user1 = new Users();
		 * user1.setName("vaishanvi"); user1.setEmail("vaishanvi@gmaild.com");
		 * user1.setPassword("9029291939"); user1.setStatus("hi friend");
		 * user1.setMobile("9527785227");
		 * 
		 * Users user2 = new Users(); user2.setName("sunil g");
		 * user2.setEmail("sunila.com"); user2.setPassword("499300003");
		 * user2.setStatus("time is very important  !!"); user2.setMobile("783899949");
		 * 
		 * //this user list is add in the company or category Set<Users> listset = new
		 * LinkedHashSet<>(); listset.add(user); listset.add(user1); listset.add(user2);
		 * 
		 * Category category = new Category(); category.setCompany("phonePay");
		 * category.setUser(listset);
		 * 
		 * user.setCategory(category); user1.setCategory(category);
		 * user2.setCategory(category); this.categoryRepository.save(category);
		 * this.userRepository.save(user); this.userRepository.save(user1);
		 * this.userRepository.save(user2);
		 * 
		 */
	

	}

}
