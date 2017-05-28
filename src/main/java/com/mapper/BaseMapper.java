package com.mapper;

import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface BaseMapper {
	
	public Map<String, Object> findEmp();
}
