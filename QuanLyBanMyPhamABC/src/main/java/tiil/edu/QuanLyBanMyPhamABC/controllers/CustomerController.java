package tiil.edu.QuanLyBanMyPhamABC.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import tiil.edu.QuanLyBanMyPhamABC.models.Customer;
import tiil.edu.QuanLyBanMyPhamABC.services.CustomerService;

@Controller
public class CustomerController {
	@Autowired CustomerService customerService;
	//
	@GetMapping("/dsKhachHang")
	public String layDSKH(Model model) {
      List<Customer> dsKH= customerService.getAllCustommer();
	  // bở vào model, để đưa sang view	
      model.addAttribute("listCustomer", dsKH);
      // trả về view
      return "CustomerGetAll";    //CustomerGetAll.html
	}
	
}
