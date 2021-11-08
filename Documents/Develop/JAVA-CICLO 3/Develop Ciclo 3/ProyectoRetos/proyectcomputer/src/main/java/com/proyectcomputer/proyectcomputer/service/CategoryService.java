package com.proyectcomputer.proyectcomputer.service;

import java.util.List;
import java.util.Optional;

import com.proyectcomputer.proyectcomputer.model.Category;
import com.proyectcomputer.proyectcomputer.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category>getAll(){
        return categoryRepository.getAll();
    }

    public Optional<Category>getCategory(int categoryId){
        return categoryRepository.getCategory(categoryId);
    }

    public Category save(Category category){
        if(category.getCategoryId()==null){
            return categoryRepository.save(category);
        }
        else{
            Optional<Category> consult=categoryRepository.getCategory(category.getCategoryId());
            if(consult.isEmpty()){
                return categoryRepository.save(category);
            }else{
                return category;
            }
        }
        
    }

    public Category update(Category category){
        if(category.getCategoryId()!=null){
            Optional<Category> consult=categoryRepository.getCategory(category.getCategoryId());
            if(!consult.isEmpty()) {
                if(category.getCategoryName()!=null){
                    consult.get().setCategoryName(category.getCategoryName());
                }
                if(category.getDescription()!=null){
                    consult.get().setDescription(category.getDescription());
                }
                return categoryRepository.save(consult.get());
            }else{
                return category;
            }
        }else{
            return category;
        }
    }

    public boolean deleteCategory(int categoryId){
        Optional<Category> consult=categoryRepository.getCategory(categoryId);
        if(!consult.isEmpty()){
            categoryRepository.delete(consult.get());

            return true;
        }
        return false;
    }
}
