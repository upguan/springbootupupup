package com.hqyj;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hqyj.mapper.MCityMapper;
import com.hqyj.pojo.MCity;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloSpringBootMybatisApplicationTests {
	
	@Autowired
	MCityMapper mcityMapper;
	
//	private static final Logger log = LoggerFactory.getLogger(HelloSpringBootMybatisApplicationTests.class);


	@Test
	public void test1() {
		List<MCity> queryAllCityList = mcityMapper.queryAllCityList();
//		log.trace("info");
		System.out.println(queryAllCityList);
		
	}

}
