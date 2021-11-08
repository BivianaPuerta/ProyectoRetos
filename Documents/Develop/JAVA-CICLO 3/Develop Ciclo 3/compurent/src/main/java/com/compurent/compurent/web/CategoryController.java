package com.compurent.compurent.web;

import java.util.List;
import java.util.Optional;

import com.compurent.compurent.model.Category;
import com.compurent.compurent.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Category")
@CrossOrigin(origins = "*",methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    // @GetMapping("/hello")
    // public String getComputers(){
    //     return "Hello";
    // }

    @GetMapping("/all")
    public List<Category>getCategories(){
        return categoryService.getAll();
    }

    @GetMapping("/{idCategory}")
    public Optional<Category>getComputer(@PathVariable("idCategory")int id){
        return categoryService.getCategory(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Category save(@RequestBody Category category){
        return categoryService.save(category);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Category update(@RequestBody Category category){
        return categoryService.update(category);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean deleteCategory(@PathVariable("id")int idCategory){
    return categoryService.deleteCategory(idCategory);
    }

}
