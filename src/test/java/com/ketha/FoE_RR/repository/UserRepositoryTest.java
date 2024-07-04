package com.ketha.FoE_RR.repository;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.ketha.FoE_RR.model.User;
import com.ketha.FoE_RR.model.User.UserType;


@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class UserRepositoryTest {
	
//	@Autowired
//	private UserRepository repo;
//	
//	@Test
//	public void SaveAll_ReturnSavedUser() {
//		User user = User.builder()
//				.email("e20199@eng.pdn.ac.lk")
//				.phoneNo(07)
//				.userType(UserType.admin)
//				.build();
//		
//		User savedUser = repo.save(user);
//		
//		Assertions.assertThat(savedUser).isNotNull();
//		Assertions.assertThat(savedUser.getUserId()).isGreaterThan(0);
//	}
}
