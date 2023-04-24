package tiil.edu.QuanLyBanMyPhamABC.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tiil.edu.QuanLyBanMyPhamABC.models.Customer;
import tiil.edu.QuanLyBanMyPhamABC.repositories.CustomerRepository;
@Service
public class CustomerServiceImpl implements CustomerService {
    // để sử dụng được repos, khai báo biến ở đây
	// sử dụng kỹ thuật Inject (tiêm/bơm đối tượng vào lớp này
	@Autowired CustomerRepository customerRepository; 
	
	@Override
	public List<Customer> getAllCustommer() {
		// thực té, có thẻ có nhiều xử lý nghiệp vụ khác nữa ở đây
		// 
		List<Customer> dsKH = customerRepository.findAll();
		return dsKH; 
	}

	@Override
	public boolean AddNewCustomer(Customer cs) {
		customerRepository.saveAndFlush(cs);
		return false;
	}

	@Override
	public boolean DeleleCustomer(int id) {
		customerRepository.deleteById(id);
		
		return false;
	}

}
