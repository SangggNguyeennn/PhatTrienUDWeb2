package jp.ivs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import till.edu.beans.Student;

@Controller
public class StudentController {
	@RequestMapping("edit")
	public String suaSinhVien(ModelMap model) {
		Student sv = new Student("Tho",8.5,"Java Web 2");
		//Chu y rang, thuc te thi SV nay duoc lay tu CSDL, theo mot dinh danh
		//Dua sang view
		model.addAttribute("student",sv);
		
		return "edit";
	}
	@RequestMapping(value="update",method = RequestMethod.POST)
	public String capNhatSinhVien(@ModelAttribute("student") Student sinhVien, ModelMap model) {
		//O tren, du lieu tu form, duoc do vao bien sinh vien roi, thong qua chu thich @ModelAttribute("student")
		//Ta se xu ly cap nhat o day
		//------------------------------
		//return mot view nao do, vi du: studentUpdateData
		model.addAttribute("svCapNhat",sinhVien);
		return "studentUpdateData";
	}
}
