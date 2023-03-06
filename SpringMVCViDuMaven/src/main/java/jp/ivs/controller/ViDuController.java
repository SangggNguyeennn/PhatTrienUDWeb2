package jp.ivs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class ViDuController {
	@RequestMapping("/index")
	public String welcome() {
		return "home/viewViDu";
	}
	@RequestMapping("/about")
	public String gioiThieu() {
		return "home/viewHello";
	}
	@RequestMapping("/contact")
	public String lienHe() {
		return "home/viewContact";
	}
}
