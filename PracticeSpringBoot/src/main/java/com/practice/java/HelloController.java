package com.practice.java;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.practice.java.dto.ControllerDto;

@Controller
public class HelloController {

	@RequestMapping("{num}")
	public ModelAndView index(@PathVariable int num, ModelAndView mav) {
		mav.setViewName("index");
		mav.addObject("num", num);

		ArrayList<ControllerDto> data = new ArrayList<ControllerDto>();
		data.add(new ControllerDto(0, "taro", "taro@yamada"));
		data.add(new ControllerDto(1, "hanako", "hanako@flower"));
		data.add(new ControllerDto(2, "sachiko", "sachiko@flower"));
		if (num >= 0) {
			mav.addObject("check", "num >= data.size() ? 0:num");
		} else {
			mav.addObject("check", "num <= data.size()*-1 ? 0:num*-1");
		}
		mav.addObject("data",data);
		return mav;

	}

}