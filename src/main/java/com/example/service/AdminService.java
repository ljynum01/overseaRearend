package com.example.service;

import com.example.model.Admin;

import java.util.List;

public interface AdminService {

    public Boolean deleteAdmin(Integer aid);

    public List<Admin> selectAllAdmin(Integer pageNum, Integer pageSize);

    public Boolean updateAdmin(Admin admin);

    public Boolean updateAdmin2(Admin admin);

    public Admin selectById(Integer id);

    public Admin selectByName(String username);

}
