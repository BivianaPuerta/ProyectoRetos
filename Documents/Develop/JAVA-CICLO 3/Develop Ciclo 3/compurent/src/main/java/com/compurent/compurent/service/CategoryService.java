package com.compurent.compurent.service;

import java.util.List;
import java.util.Optional;

import com.compurent.compurent.model.Category;
import com.compurent.compurent.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category>getAll(){
        return categoryRepository.getAll();
    }

    public Optional<Category>getCategory(int idCategory){
        return categoryRepository.getCategory(idCategory);
    }

    public Category save(Category category){
        if(category.getId()==null){
            return categoryRepository.save(category);
        }
        else{
            Optional<Category> consult=categoryRepository.getCategory(category.getId());
            if(consult.isEmpty()){
                return categoryRepository.save(category);
            }else{
                return category;
            }
        }
    }
    public Category update(Category category){
        if(category.getId()!=null){
            Optional<Category> consult=categoryRepository.getCategory(category.getId());
            if(!consult.isEmpty()) {
                if(category.getName()!=null){
                    consult.get().setName(category.getName());
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
    public boolean deleteCategory(int idCategory){
        Optional<Category> consult=categoryRepository.getCategory(idCategory);
        if(!consult.isEmpty()){
            categoryRepository.delete(consult.get());

            return true;
        }
        return false;
    }
}
