// package com.compurent.compurent.repository;

// import java.util.List;
// import java.util.Optional;

// import com.compurent.compurent.model.State;
// import com.compurent.compurent.repository.crud.StateCrudRepository;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Repository;

// @Repository
// public class StateRepository {
//     @Autowired
//     private StateCrudRepository stateCrudRepository;

//     public List<State> getAll(){
//         return (List<State>)stateCrudRepository.findAll();
//     }
    
//     public Optional<State>getState(int id){
//         return stateCrudRepository.findById(id);
//     }

//     public State save(State state){
//         return stateCrudRepository.save(state);
//     }

//     public void delete(State state){
//         stateCrudRepository.delete(state);
//     }
// }
