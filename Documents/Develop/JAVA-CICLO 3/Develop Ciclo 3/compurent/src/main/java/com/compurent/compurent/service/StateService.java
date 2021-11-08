// package com.compurent.compurent.service;

// import java.util.List;
// import java.util.Optional;

// import com.compurent.compurent.model.State;
// import com.compurent.compurent.repository.StateRepository;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// @Service
// public class StateService {
//     @Autowired
//     private StateRepository stateRepository;

//     public List<State>getAll(){
//         return stateRepository.getAll();
//     }

//     public Optional<State>getState(int stateId){
//         return stateRepository.getState(stateId);
//     }

//     public State save(State state){
//         if(state.getStateId()==null){
//             return stateRepository.save(state);
//         }
//         else{
//             Optional<State> consult=stateRepository.getState(state.getStateId());
//             if(consult.isEmpty()){
//                 return stateRepository.save(state);
//             }else{
//                 return state;
//             }
//         }
//     }
//     public State update(State state){
//         if(state.getStateId()!=null){
//             Optional<State> consult=stateRepository.getState(state.getStateId());
//             if(!consult.isEmpty()) {
//                 if(state.getStateName()!=null){
//                     consult.get().setStateName(state.getStateName());
//                 }
//                 return stateRepository.save(consult.get());
//             }else{
//                 return state;
//             }
//         }else{
//             return state;
//         }
//     }
//     public boolean deleteState(int stateId){
//         Optional<State> consult=stateRepository.getState(stateId);
//         if(!consult.isEmpty()){
//             stateRepository.delete(consult.get());

//             return true;
//         }
//         return false;
//     }
// }
