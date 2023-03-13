package jp.ivs.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class User2Controller {
	//Tra ve cho user trang de dang nhap 
		@RequestMapping(value = "login2", method = RequestMethod.GET)
		public String loginGet()
		{
			return "login2"; //view login2.jsp
		}
		//Xu ly khi user nhan submit
		@RequestMapping(value = "login2", method = RequestMethod.POST)
		public String loginPost(ModelMap model, @RequestParam("id") String tenDN, @RequestParam("pwd") String matKhau)
		{
			if(tenDN.equals("admin") && matKhau.equals("62cnttclc")) 
			{//dang nhap thanh cong thi do something
				//Dieu huong den trang chu quan tri
				return "redirect:/admin/index.html";
				
			}else//Dang nhap khong duoc
			{
				//gui bao loi ra trang dang nhap , thong qua model
				//??
				model.addAttribute("thongbaoloi","Thong tin dang nhap khong dung");
				return "login2";
			}
			
		}
}
