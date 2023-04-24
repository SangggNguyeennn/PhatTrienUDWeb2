package com.example.BaiTapVD3.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BMIController {
	@GetMapping("/index")
	public String trangChu() {
		return "index";
	}
	@GetMapping("/about")
	public String gioiThieu() {
		return "about";
	}
	@GetMapping("/add")
	public String traVeFormTinh() {
		return "tinhBMI";
	}
	@GetMapping("/addCal")
	public String tinhTong( @RequestParam("cn") float CanNang, 
							@RequestParam("cc") float ChieuCao,
							Model m) {
		//Dua du lieu vao model
		m.addAttribute("cnn",CanNang);
		m.addAttribute("ccc",ChieuCao);
		m.addAttribute("kq",CanNang/(ChieuCao*ChieuCao));
		return "tinhBMI";
	}
}
