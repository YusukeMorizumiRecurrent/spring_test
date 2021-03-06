package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FizzBuzzController {

	@RequestMapping(value = "/apply", method = RequestMethod.POST)
	public ModelAndView apply(@RequestParam("num") int num, ModelAndView mv) {

		String result = "";
		if (num != 0) {

			if (num % 3 == 0) {
				result += "Fizz ";
			}
			if (num % 5 == 0) {
				result += "Buzz ";
			}
			if (num % 7 == 0) {
				result += "Ass ";
			}else {
				System.out.println("営　　業");
			}
		}
		mv.addObject("result", result);
		mv.addObject("num", num);
		mv.addObject("num", num);
		mv.addObject("num", num);

		mv.setViewName("index");
		return mv;
	}

}
