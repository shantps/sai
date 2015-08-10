package raisingteam.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import raisingteam.domain.SignUp;
import raisingteam.domain.User;

public interface SignUpRepository extends JpaRepository<SignUp, String> {
	
	//public User findUser(@Param("id") String id);
}
