// package com.compurent.compurent.service;

// import java.util.List;
// import java.util.Optional;

// import com.compurent.compurent.model.Rol;
// import com.compurent.compurent.repository.RolRepository;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// @Service
// public class RolService {
//     @Autowired
//     private RolRepository rolRepository;

//     public List<Rol>getAll(){
//         return rolRepository.getAll();
//     }

//     public Optional<Rol> getRol(int rolId){
//         return rolRepository.getRol(rolId);
//     }

//     public Rol save(Rol rol){
//         if(rol.getRolId()==null){
//             return rolRepository.save(rol);
//         }
//         else{
//             Optional<Rol> consult=rolRepository.getRol(rol.getRolId());
//             if(consult.isEmpty()){
//                 return rolRepository.save(rol);
//             }else{
//                 return rol;
//             }
//         }
//     }
//     public Rol update(Rol rol){
//         if(rol.getRolId()!=null){
//             Optional<Rol> consult=rolRepository.getRol(rol.getRolId());
//             if(!consult.isEmpty()) {
//                 if(rol.getRolName()!=null){
//                     consult.get().setRolName(rol.getRolName());
//                 }
//                 return rolRepository.save(consult.get());
//             }else{
//                 return rol;
//             }
//         }else{
//             return rol;
//         }
//     }
//     public boolean deleteRol(int rolId){
//         Optional<Rol> consult=rolRepository.getRol(rolId);
//         if(!consult.isEmpty()){
//             rolRepository.delete(consult.get());

//             return true;
//         }
//         return false;
//     }
// }
