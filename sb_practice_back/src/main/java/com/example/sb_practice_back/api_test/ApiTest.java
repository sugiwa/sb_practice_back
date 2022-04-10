package com.example.sb_practice_back.api_test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiTest {

	@RequestMapping(value = "/return_data", method = RequestMethod.GET)
	public List<Object> getData(){
		
		List<Object> data = new ArrayList<Object>();
		
		data.add("sample");
		data.add("test");
		
		return data;
	}
}
