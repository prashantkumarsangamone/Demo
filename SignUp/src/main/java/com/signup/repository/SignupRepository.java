package com.signup.repository;

import org.springframework.data.repository.CrudRepository;

import com.signup.model.Signup;


public interface SignupRepository extends CrudRepository<Signup, String>{

}
