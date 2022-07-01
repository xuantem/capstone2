package com.example.capstone.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter 
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "new")
public class NewsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long new_id;

	private String createdBy;
	private Date createdDate;

	private String modifiedBy;
	private Date modifiedDate;
	private String title;
	private String thumbnail;
	private String shortDescription;
	private String content;
	
	 @ManyToOne
	 @JoinColumn(name = "category_id")
	 private CategoryEntity category;
}
