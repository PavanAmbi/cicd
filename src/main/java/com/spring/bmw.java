package com.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
@Primary
public class bmw implements CarService {

	@Override
	@ResponseBody
	public SampleResponse startEngine() {
		return new SampleResponse("Hi from BMA");

	}

}
