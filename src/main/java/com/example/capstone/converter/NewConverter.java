package com.example.capstone.converter;

import org.springframework.stereotype.Component;

import com.example.capstone.dto.NewDTO;
import com.example.capstone.entity.NewsEntity;

@Component
public class NewConverter {

	public NewsEntity toEntity(NewDTO dto) {
		NewsEntity entity = new NewsEntity();
		entity.setTitle(dto.getTitle());
		entity.setContent(dto.getContent());
		entity.setShortDescription(dto.getShortDescription());
		entity.setThumbnail(dto.getThumbnail());
		
		return entity;
		
	}
	
	public NewDTO toEntity(NewsEntity newsEntity) {
		NewDTO newDTO = new NewDTO();
		newDTO.setTitle(newsEntity.getTitle());
		newDTO.setContent(newsEntity.getContent());
		newDTO.setShortDescription(newsEntity.getShortDescription());
		newDTO.setThumbnail(newsEntity.getThumbnail());
		
		return newDTO;
		
	}
}
