package com.compurent.compurent.repository;

import java.util.List;
import java.util.Optional;

import com.compurent.compurent.model.Category;
import com.compurent.compurent.repository.crud.CategoryCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryRepository {
    @Autowired
    private CategoryCrudRepository categoryCrudRepository;

    public List<Category> getAll(){
        return (List<Category>)categoryCrudRepository.findAll();
    }
    
    public Optional<Category>getCategory(int id){
        return categoryCrudRepository.findById(id);
    }

    public Category save(Category category){
        return categoryCrudRepository.save(category);
    }

    public void delete(Category category){
        categoryCrudRepository.delete(category);
    }
}
