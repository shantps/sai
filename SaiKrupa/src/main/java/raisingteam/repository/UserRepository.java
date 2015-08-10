package raisingteam.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import raisingteam.domain.User;

public interface UserRepository extends JpaRepository<User, String> {
	
	//public User findUser(@Param("id") String id);
}
