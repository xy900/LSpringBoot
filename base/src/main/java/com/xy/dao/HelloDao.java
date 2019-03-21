package com.xy.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.xy.entity.User;


public interface HelloDao extends JpaRepository<User, Long>{
	static final Logger logger = LoggerFactory.getLogger(HelloDao.class);

	/*public void sayHello() {
		logger.info("dao say hello");
	}*/
	
	User findByName(String name);
	
	@Query("from User u where u.name=:name_")
	User findByNameQuery(@Param("name_") String name);
}
