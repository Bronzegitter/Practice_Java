package com.practice.java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {

	@RequestMapping("{tax}")
	public ModelAndView index(@PathVariable int tax, ModelAndView mav) {
		mav.setViewName("index");
		mav.addObject("tax", tax);
		return mav;
	}
}