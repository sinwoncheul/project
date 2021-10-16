package com.example.service;



import com.example.entity.Company;

import org.springframework.stereotype.Service;

@Service
public interface CompanyService {

    // 회원가입
    public int insertUsered(Company usered);

    // 회원수정
    public int updateUsered(Company usered);

    // 회원탈퇴
    public int deleteUsered(Company usered);

    // 회원조회
    public Company selectUseredOne(String id);

}
