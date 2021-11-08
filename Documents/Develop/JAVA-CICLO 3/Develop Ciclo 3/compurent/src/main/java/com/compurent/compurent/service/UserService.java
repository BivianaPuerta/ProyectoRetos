// package com.compurent.compurent.service;

// import java.util.List;
// import java.util.Optional;

// import com.compurent.compurent.model.User;
// import com.compurent.compurent.repository.UserRepository;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// @Service
// public class UserService {
//     @Autowired
//     private UserRepository userRepository;

//     public List<User>getAll(){
//         return userRepository.getAll();
//     }

//     public Optional<User> getUser(int idClient){
//         return userRepository.getUser(idClient);
//     }

//     public User save(User user){
//         if(user.getIdClient()==null){
//             return userRepository.save(user);
//         }
//         else{
//             Optional<User> consult=userRepository.getUser(user.getIdClient());
//             if(consult.isEmpty()){
//                 return userRepository.save(user);
//             }else{
//                 return user;
//             }
//         }
//     }
//     public User update(User user){
//         if(user.getIdClient()!=null){
//             Optional<User> consult=userRepository.getUser(user.getIdClient());
//             if(!consult.isEmpty()) {
//                 if(user.getName()!=null){
//                     consult.get().setName(user.getName());
//                 }
//                 if(user.getEmail()!=null){
//                     consult.get().setEmail(user.getEmail());
//                 }
//                 if(user.getPassword()!=null){
//                     consult.get().setPassword(user.getPassword());
//                 }
//                 if(user.getAge()!=null){
//                     consult.get().setAge(user.getAge());
//                 }
//                 // if(user.getInsertDateTime()!=null){
//                 //     consult.get().setInsertDateTime(user.getInsertDateTime());
//                 // }
//                 return userRepository.save(consult.get());
//             }else{
//                 return user;
//             }
//         }else{
//             return user;
//         }
//     }
//     public boolean deleteUser (int idClient){
//         Optional<User> consult=userRepository.getUser(idClient);
//         if(!consult.isEmpty()){
//             userRepository.delete(consult.get());

//             return true;
//         }
//         return false;
//     }

// }
