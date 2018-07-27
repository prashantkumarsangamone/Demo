package com.signup.signupimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.signup.model.Signup;
import com.signup.repository.SignupRepository;
import com.signup.service.SignUpService;

@Component("signUpService")
public class SignUpImpl implements SignUpService {

	@Autowired
	private SignupRepository signupRepository;
	@Override
	public void submit(String password, String email, String name, int age) {
		Signup signUp = new Signup();
		signUp.setAge(age);
		signUp.setEmail(email);
		signUp.setName(name);
		signUp.setPassword(password);
		signupRepository.save(signUp);
		
		
		
	}

}
