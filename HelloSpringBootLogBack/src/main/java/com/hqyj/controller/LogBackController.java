package com.hqyj.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LogBackController {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(LoggerFactory.class);
	@RequestMapping("/handler")
	@ResponseBody
	public String handler() {
		LOGGER.trace("trace");
		LOGGER.trace("debug");
		LOGGER.trace("info");
		LOGGER.trace("warn");
		LOGGER.trace("error");
		return "hello springboot";
	}
}
