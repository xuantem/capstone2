package com.example.capstone.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.capstone.converter.NewConverter;
import com.example.capstone.dto.NewDTO;
import com.example.capstone.entity.CategoryEntity;
import com.example.capstone.entity.NewsEntity;
import com.example.capstone.repository.CategoryRepository;
import com.example.capstone.repository.NewRepository;
import com.example.capstone.service.INewService;

@Service
public class NewService implements INewService{

	@Autowired
	private NewRepository newRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired 
	private NewConverter newConverter;
	
	@Override
	public NewDTO save(NewDTO newDTO) {
		// TODO Auto-generated method stub
		CategoryEntity categoryEntity = categoryRepository.findOneByCode(newDTO.getCategoryCode());
		NewsEntity newsEntity = newConverter.toEntity(newDTO);
		newsEntity.setCategory(categoryEntity);
		newsEntity = newRepository.save(newsEntity);
		
		return newConverter.toEntity(newsEntity);
	}
}
