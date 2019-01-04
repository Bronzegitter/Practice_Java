package com.practice.java;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.practice.java.dto.ControllerDto;



@RestController
public class HelloController {

	@RequestMapping("/")
	public ModelAndView index(ModelAndView mav) {

		mav.setViewName("index");
		mav.addObject("msg", "current data.");
		ControllerDto obj = new ControllerDto(123, "hanako", "hanako@flower");
		mav.addObject("object",obj);
		return mav;
	}
}