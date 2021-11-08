// package com.compurent.compurent.repository;

// import java.util.List;
// import java.util.Optional;

// import com.compurent.compurent.model.Rol;
// import com.compurent.compurent.repository.crud.RolCrudRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Repository;

// @Repository
// public class RolRepository  {
//     @Autowired
//     private RolCrudRepository rolCrudRepository;

//     public List<Rol> getAll(){
//         return (List<Rol>)rolCrudRepository.findAll();
//     }
    
//     public Optional<Rol>getRol(int id){
//         return rolCrudRepository.findById(id);
//     }

//     public Rol save(Rol rol){
//         return rolCrudRepository.save(rol);
//     }

//     public void delete(Rol rol){
//         rolCrudRepository.delete(rol);
//     }
// }
