package com.barclays.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
	
	@RequestMapping(value="/get", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> get(){
		System.out.println("Get method");

		String s="Anket";

		return new ResponseEntity<String>(s,HttpStatus.OK);
	}

	

	
	public void m2()
	{
		
		System.out.println("method m2");
	}
	
	public void m3()
	{
		System.out.println("method m3");
	}
	public void m4()
	{
		System.out.println("method m3");
	}
	
	
	
}
