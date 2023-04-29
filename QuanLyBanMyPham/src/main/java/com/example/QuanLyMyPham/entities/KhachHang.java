package com.example.QuanLyMyPham.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "khachhang")
public class KhachHang {
	@Id
	@Column(name = "MaKhachHang")    // tên cột, trong bảng , phải viết giống 100%
	private String MaKhachHang;         // được mapping sang trường thông tin là id, trong class này
	  
	@Column(name = "AnhKhachHang")
	private String AnhKhachHang;
	  
	@Column(name = "HoTenKhachHang")
	private String HoTenKhachHang;

	@Column(name = "Email")
	private String Email;
	
	@Column(name = "DiaChi")
	private String DiaChi;
	
	@Column(name = "DienThoai")
	private String DienThoai;

	public String getMaKhachHang() {
		return MaKhachHang;
	}

	public void setMaKhachHang(String maKhachHang) {
		MaKhachHang = maKhachHang;
	}

	public String getAnhKhachHang() {
		return AnhKhachHang;
	}

	public void setAnhKhachHang(String anhKhachHang) {
		AnhKhachHang = anhKhachHang;
	}

	public String getHoTenKhachHang() {
		return HoTenKhachHang;
	}

	public void setHoTenKhachHang(String hoTenKhachHang) {
		HoTenKhachHang = hoTenKhachHang;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public String getDienThoai() {
		return DienThoai;
	}

	public void setDienThoai(String dienThoai) {
		DienThoai = dienThoai;
	}
	
	
}
