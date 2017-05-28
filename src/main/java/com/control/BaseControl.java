package com.control;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.BaseService;

@Controller
@RequestMapping("/base")
public class BaseControl {
	private final Logger log = Logger.getLogger(BaseControl.class);
	@Autowired
	BaseService baseService;
	
	@RequestMapping("/index")
	public String toIndex(Model model) {
		log.debug("测试开始");
		Map<String, Object> result = baseService.test();
		model.addAttribute("result", result);
		log.debug("测试结束");
		return "NewFile";
	}
}
