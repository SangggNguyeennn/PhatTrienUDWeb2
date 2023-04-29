package com.example.QuanLyMyPham.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.QuanLyMyPham.entities.KhachHang;
import com.example.QuanLyMyPham.repository.KhachHangRepository;

@Service
public class KhachHangServiceImpl implements KhachHangService {
	@Autowired KhachHangRepository khachHangRepository;
	
	@Override
	public List<KhachHang> getAllKhachHang(){
		List<KhachHang> dsKH = khachHangRepository.findAll();
		return dsKH;
	}
	
	@Override
	public boolean AddNewCustomer(KhachHang kh) {
		khachHangRepository.saveAndFlush(kh);
		return false;
	}
	
	@Override
	public boolean DeleleCustomer(String id) {
		khachHangRepository.deleteById(id);
		return false;
	}
}
