package com.example.QuanLyMyPham.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.QuanLyMyPham.entities.KhachHang;

@Service
public interface KhachHangService {
	List<KhachHang> getAllKhachHang();
	boolean AddNewCustomer(KhachHang kh);
	boolean DeleleCustomer(String id);
}
