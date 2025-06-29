package com.example.demo.Service;

import com.example.demo.Entity.CategoryEntity;
import com.example.demo.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<CategoryEntity> findAll(){
        return categoryRepository.findAll();
    }

    public Optional<CategoryEntity> findById(Long id){
        return categoryRepository.findById(id);
    }

    public void save(CategoryEntity categoryEntity){
        categoryRepository.save(categoryEntity);
    }
}
