package jp.ivs.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	//Tra ve cho user trang de dang nhap 
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String loginGet()
	{
		return "login";
	}
	//Xu ly khi user nhan submit
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String loginPost(ModelMap model, HttpServletRequest request)
	{
		//Xu ly dang nhap o day
		//LAy thong tin user submit
		String id= request.getParameter("id");
		String pass = request.getParameter("pwd");
		//Tiep theo, ta truy van bang user, de tim xem co khong
		//Neu co thi dang nhap thanh cong, va nguoc lai
		//O bai nay chung ta bo qu buoc truy cap csdl(hoc sau)
		//Ta hard code
		if(id.equals("admin") && pass.equals("62cnttclc")) 
		{//dang nhap thanh cong thi do something
			//Dieu huong den trang chu quan tri
			return "redirect:/admin/index.html";
			
		}else//Dang nhap khong duoc
		{
			//gui bao loi ra trang dang nhap , thong qua model
			//??
			model.addAttribute("thongbaoloi","Thong tin dang nhap khong dung");
			return "login";
		}
		
	}
}
