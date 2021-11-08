// package com.compurent.compurent.repository;

// import java.util.List;
// import java.util.Optional;

// import com.compurent.compurent.model.User;
// import com.compurent.compurent.repository.crud.UserCrudRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Repository;

// @Repository
// public class UserRepository {
//     @Autowired
//     private UserCrudRepository userCrudRepository;

//     public List<User> getAll(){
//         return (List<User>)userCrudRepository.findAll();
//     }
    
//     public Optional<User>getUser(int id){
//         return userCrudRepository.findById(id);
//     }

//     public User save(User user){
//         return userCrudRepository.save(user);
//     }

//     public void delete(User user){
//         userCrudRepository.delete(user);
//     }
// }
