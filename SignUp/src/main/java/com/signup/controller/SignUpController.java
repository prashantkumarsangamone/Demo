package com.signup.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.signup.service.SignUpService;

@Controller
@RequestMapping("/")
public class SignUpController {
@Autowired
private SignUpService signUpService;
	
	@RequestMapping(value="", method = RequestMethod.GET)
			public ModelAndView signup() {
				ModelAndView model = new ModelAndView();
				model.setViewName("signUp");
				return model;

			}
	@RequestMapping(value="submit", method = RequestMethod.POST)
	public ModelAndView submit(
			@RequestParam(value = "password", required = false) String password,
			@RequestParam(value = "email", required = false) String email,
			@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "age", required = false) int age
			) {
		ModelAndView model = new ModelAndView();
		signUpService.submit(password, email,name,age);
		model.addObject("success","success");
		model.setViewName("signUp");
		return model;
	}

}

	

