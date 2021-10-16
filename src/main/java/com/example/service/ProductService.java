package com.example.service;

import java.util.List;

import com.example.entity.Product;

import org.springframework.stereotype.Service;

@Service
public interface ProductService {

    // 물품등록
    public int insertItem(Product product);

    // 물품조회
    public List<Product> selectItemList();

    // 물품삭제
    public int deleteItem(long no);

    // 물품수정
    public int updateItem(Product product);
    
    // 물품한개조회
    public Product selectItemOne(long no);
}
