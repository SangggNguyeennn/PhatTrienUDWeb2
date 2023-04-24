package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	//Xay dung action
		//Mapping URL
		@GetMapping("/")
		public String trangChu() {
			return "index";
		}
		@GetMapping("/about")
		public String gioiThieu() {
			return "about";
		}
		@GetMapping("/login")
		public String dangNhap() {
			return "login";
		}
}
