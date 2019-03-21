package com.xy.mapper;

import java.util.List;

//import org.apache.ibatis.annotations.*;

import com.xy.entity.Test;

//@Mapper
public interface TestMapper {

	/*@Select("select * from test")
	List<Test> getAllTest();*/
	
	//@Select("select count(*) from test")
	Long getCount();
}
