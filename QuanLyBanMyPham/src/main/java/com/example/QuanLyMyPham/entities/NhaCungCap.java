package com.example.QuanLyMyPham.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "nhacungcap")
public class NhaCungCap {
	@Id
	@Column(name = "MaNhaCungCap")    // tên cột, trong bảng , phải viết giống 100%
	private String MaNhaCungCap;         // được mapping sang trường thông tin là id, trong class này
	  
	@Column(name = "TenNhaCungCap")
	private String TenNhaCungCap;
	  
	@Column(name = "AnhNCC")
	private String AnhNCC;
	
	@Column(name = "DiaChi")
	private String DiaChi;
	
	@Column(name = "DienThoai")
	private String DienThoai;
	
	@Column(name = "Email")
	private String Email;

	public String getMaNhaCungCap() {
		return MaNhaCungCap;
	}

	public void setMaNhaCungCap(String maNhaCungCap) {
		MaNhaCungCap = maNhaCungCap;
	}

	public String getTenNhaCungCap() {
		return TenNhaCungCap;
	}

	public void setTenNhaCungCap(String tenNhaCungCap) {
		TenNhaCungCap = tenNhaCungCap;
	}

	public String getAnhNCC() {
		return AnhNCC;
	}

	public void setAnhNCC(String anhNCC) {
		AnhNCC = anhNCC;
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

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
	
}
