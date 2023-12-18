package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VehicleController {

	@Autowired
	CarService car;

	@ResponseBody
	@GetMapping(path = "/auto", produces = MediaType.APPLICATION_XML_VALUE)
	public SampleResponse getEngines() {
		System.out.println("getEngines called");
		SampleResponse msg =  car.startEngine();
		return msg;
	}
}
