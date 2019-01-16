package com.practice.java;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.practice.java.dto.ControllerDto;
@Controller
public class HelloController {

	@RequestMapping("/")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		ArrayList<ControllerDto> data = new ArrayList<ControllerDto>();
		data.add(new ControllerDto(0, "taro", "taro@yamada"));
		data.add(new ControllerDto(1, "hanako", "hanako@flower"));
		data.add(new ControllerDto(2, "sachiko", "sachiko@flower"));

		mav.addObject("data",data);
		return mav;

	}

}