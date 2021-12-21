package com.alkemy.ong.mapper;

import com.alkemy.ong.dto.CategoryDto;
import com.alkemy.ong.model.entity.Category;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {
    
    @Autowired
    private ModelMapper modelMapper;
    
    public CategoryDto categoryToCategoryDto(Category entity){
        return modelMapper.map(entity, CategoryDto.class);
    }   
}
