package jp.ivs.controller;

import javax.servlet.*;
import javax.servlet.http.*;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.*;

public class BMIController extends HttpServlet {
	@RequestMapping(value = "bmi", method = RequestMethod.GET)
	public String loginGet()
	{
		return "bmi"; //view login2.jsp
	}
	//Xu ly khi user nhan submit
	@RequestMapping(value = "bmi", method = RequestMethod.POST)
	public String loginPost(ModelMap model, @RequestParam("cn") float weight, @RequestParam("cc") float height)
	{
		float bmi = weight / (height * height);
		if(bmi<18.5) {
			model.addAttribute("<p>Gay</p>");
		}
		if(bmi>18.5 && bmi<24.9) {
			model.addAttribute("<p>Binh Thuong</p>");
		}
		if(bmi>25 && bmi<29.9) {
			model.addAttribute("<p>Hoi Beo</p>");
		}
		if(bmi>30 && bmi<34.9) {
			model.addAttribute("<p>Beo Phi Cap Do 1</p>");
		}
		if(bmi>35 && bmi<39.9) {
			model.addAttribute("<p>Beo Phi Cap Do 2</p>");
		}
		if(bmi>40) {
			model.addAttribute("<p>Beo Phi Cap Do 3</p>");
		}
		return "bmi";
	}
}
