package com.example.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.capstone.entity.NewsEntity;

public interface NewRepository extends JpaRepository<NewsEntity, Long> {

}
