package com.spring;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class Audi implements CarService {

	@Override
	@ResponseBody
	public SampleResponse startEngine() {
		return new SampleResponse("Hi from Audi");

	}

}
