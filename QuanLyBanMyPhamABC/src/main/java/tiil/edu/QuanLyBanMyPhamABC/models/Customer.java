package tiil.edu.QuanLyBanMyPhamABC.models;
// Thực hiện việc qui định về mapping
// sử dụng các anotation
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")  // tên bảng trong CSDL, phải viết giống 100%
public class Customer {
  @Id
  @Column(name = "id")    // tên cột, trong bảng , phải viết giống 100%
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;         // được mapping sang trường thông tin là id, trong class này
  
  @Column(name = "name")
  private String name;
  
  @Column(name = "address")
  private String address;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}
  
  
  
}