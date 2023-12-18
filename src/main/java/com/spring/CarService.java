package com.spring;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public interface CarService {
	
	
	public SampleResponse startEngine();

}
