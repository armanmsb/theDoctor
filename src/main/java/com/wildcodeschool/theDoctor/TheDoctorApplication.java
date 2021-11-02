package com.wildcodeschool.theDoctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class TheDoctorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheDoctorApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String index(){
		return "<ul>\n" +
				"  <li> <a href=http://localhost:8080/doctor/1> First </a> </li>\n" +
				"  <li> <a href=http://localhost:8080/doctor/2> Second </a> </li>\n" +
				"  <li> <a href=http://localhost:8080/doctor/3> Third </a> </li>\n" +
				"  <li> <a href=http://localhost:8080/doctor/4> Fourth </a> </li>\n" +
				"</ul>";
	}

	@RequestMapping("/doctor/1")
	@ResponseBody
	public String firstDoc(){
		return "William Hartnell";
	}

	@RequestMapping("/doctor/2")
	@ResponseBody
	public String secondDoc(){
		return "Patrick Troughton";
	}

	@RequestMapping("/doctor/3")
	@ResponseBody
	public String thirdDoc(){
		return "Jon Pertwee";
	}

	@RequestMapping("/doctor/4")
	@ResponseBody
	public String fourthDoc(){
		return "Tom Baker";
	}

}
