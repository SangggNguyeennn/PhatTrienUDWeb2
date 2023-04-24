package tiil.edu.QuanLyBanMyPhamABC.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tiil.edu.QuanLyBanMyPhamABC.models.Customer;

// để thao tác với cơ sử dũ liệu, ta kế thừa class  JpaRepository <tên Entity, thể loại dữ liệu trường khóa chính>
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
