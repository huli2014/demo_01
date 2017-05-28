package com.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.BaseMapper;

@Service
public class BaseService {
	@Autowired
	BaseMapper baseMapper;

	public Map<String, Object> test() {
		Map<String, Object> result = baseMapper.findEmp();
		return result;
	}
}
