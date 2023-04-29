package com.example.QuanLyMyPham.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.QuanLyMyPham.entities.KhachHang;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang, String> {

}
