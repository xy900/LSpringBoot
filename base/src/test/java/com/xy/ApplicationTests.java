package com.xy;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import com.xy.dao.HelloDao;
import com.xy.entity.User;
import com.xy.mapper.TestMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(StartUp.class)
//@WebAppConfiguration
public class ApplicationTests {

	@Autowired
	private HelloDao dao;

	/*@Autowired
	private TestMapper testMapper;*/
	
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@Test
	public void mapper() {
		//System.out.println(testMapper.getCount());
		
		/*List<com.xy.entity.Test> list = testMapper.getAllTest();
		if (list != null && !list.isEmpty()) {
			for (com.xy.entity.Test test : list) {
				System.out.println(test);
			}
		}*/
	}

	@Test
	public void getHello() throws Exception {
		List<User> list = dao.findAll();
		if (list != null && !list.isEmpty()) {
			for (User user : list) {
				System.out.println(user);
			}
		}
		
		System.out.println(dao.count());
		
		System.out.println(dao.findOne(10L));

		System.out.println(dao.findByName("BBB"));
		
		System.out.println(dao.findByNameQuery("BBB"));
		
		User x = new User();
		x.setName("110");
		x.setAge(110);
		x = dao.save(x);
		System.out.println(x);
	}

}