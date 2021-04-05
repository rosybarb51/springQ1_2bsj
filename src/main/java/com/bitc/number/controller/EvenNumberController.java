package com.bitc.number.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bitc.number.dto.EvenNumber;

@Controller
public class EvenNumberController {

	@RequestMapping(value="/number", method=RequestMethod.GET)
	public String number() throws Exception {
		return "/number/number";
	}
	
	@RequestMapping(value="/number/result", method=RequestMethod.GET)
	public ModelAndView res(EvenNumber res) throws Exception {
		ModelAndView mv = new ModelAndView("/number/result");
		
		res.setResult(res.getNum());
		
		mv.addObject("result", res);
		
		return mv;
	}
	
}
