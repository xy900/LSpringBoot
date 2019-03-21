package com.xy.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.xy.dao.HelloDao;
import com.xy.entity.Test;
import com.xy.entity.User;

@Service
public class HelloService {
	private static final Logger logger = LoggerFactory.getLogger(HelloService.class);
	
	@Autowired
	private HelloDao dao;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;    //Spring Jdbc
	
	public void sayHello() {
		logger.info("service say hello");
		//dao.sayHello();
	}
	
	public Test add(Test test) {
		//jdbcTemplate.execute("insert into test(`name`) value('" + test.getName() + "')");
		jdbcTemplate.update("insert into test(`name`) value(?)", test.getName() + "_");
		return test;
	}
	
	@Cacheable(cacheNames = "test") //  spring cache
	public List<User> getAll() {
		logger.info("getAll user cache");
		return dao.findAll();
	}
	
	@CacheEvict(cacheNames = "test")
	public void deleteCache() {
		logger.info("delete cache");
	}
}
