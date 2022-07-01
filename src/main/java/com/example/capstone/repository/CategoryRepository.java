package com.example.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.capstone.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long>{
	
	CategoryEntity findOneByCode(String code);
	
}
