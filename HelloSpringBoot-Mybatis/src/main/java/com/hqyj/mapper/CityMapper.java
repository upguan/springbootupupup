package com.hqyj.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.hqyj.pojo.MCity;

@Mapper
public interface MCityMapper {

	  @Select("select * from m_city")
	  List<MCity> queryAllCityList();
}
