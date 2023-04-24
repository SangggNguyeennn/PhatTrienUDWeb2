package tiil.edu.QuanLyBanMyPhamABC.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import tiil.edu.QuanLyBanMyPhamABC.models.Customer;
@Service
public interface CustomerService {
	// Tại đây, ta viết các phương thức cung cấp cho controller
	// ví dụ:
	// Lấy về danh sách khách hàng
	List<Customer> getAllCustommer();
	// Thêm mới một khách hàng
	boolean AddNewCustomer(Customer cs);
	// Xóa khách hành theo mã
	boolean DeleleCustomer(int id);
	
}
