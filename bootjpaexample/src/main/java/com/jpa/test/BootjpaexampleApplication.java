package com.jpa.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.print.CancelablePrintJob;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

import ch.qos.logback.core.joran.conditional.ThenAction;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);	
		
		/* Create object of User */
//		User user1 = new User();
////		user.setId();
//		user1.setName("Addy");
//		user1.setCity("Bangalore");
//		user1.setStatus("I am passionate java developer.");
//		
//		User user2 = new User();
//		user2.setName("Mayank");
//		user2.setCity("Hyderabad");
//		user2.setStatus("I am frontend developer.");
//		
//		/*Saving single user
//		User  res = userRepository.save(user1);
//		System.out.println(res);*/
//		
//		// Saving multiple users
//		ArrayList<User> list = new ArrayList<>();
//		list.add(user1);
//		list.add(user2);
//		
//		Iterable<User> result = userRepository.saveAll(list);
//		// printing all the users stored in result
//		result.forEach(user ->{
//			System.out.println(user);
//		});
		
		/* Updating the user of id 2 */
//		Optional<User> optional = userRepository.findById(2);
//		User user = optional.get();
//		System.out.println(user);//User [id=2, name=Addy, city=Bangalore, status=I am passionate java developer.]
//		
//		user.setName("Adarsh");
//		user.setCity("Hyderabad");
//		
//		userRepository.save(user);
//		System.out.println(user);//User [id=2, name=Adarsh, city=Hyderabad, status=I am passionate java developer.]

		/* How to get data*/
		//findById(id): return Optional containing your data then we can get.
		
//		Iterable<User> itr = userRepository.findAll();
//		
//		itr.forEach(user -> {
//			System.out.println(user);
//		});
		
		/* Deleting the user element by id=53*/
//		userRepository.deleteById(53);
//		System.out.println("Deleted");
		
		// Delete all the users
//		Iterable<User> allusers = userRepository.findAll();
//		allusers.forEach(user ->{
//			System.out.println(user);
//		});
//		userRepository.deleteAll(allusers);
		
		/* Using custom finder methods*/
		List<User> users = userRepository.findByName("Addy");
		users.forEach(user ->{
			System.out.println(user);
		});
		
		
	}
}
