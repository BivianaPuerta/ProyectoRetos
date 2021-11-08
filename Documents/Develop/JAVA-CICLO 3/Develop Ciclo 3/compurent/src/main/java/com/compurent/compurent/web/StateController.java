// package com.compurent.compurent.web;

// import org.springframework.web.bind.annotation.RequestMapping;

// import java.util.List;
// import java.util.Optional;

// import com.compurent.compurent.model.State;
// import com.compurent.compurent.service.StateService;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.web.bind.annotation.*;

// @RestController
// @RequestMapping("/api/state")
// @CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
// public class StateController {
//     @Autowired
//     private StateService stateService;

//     @GetMapping("/all")
//     public List<State>getStates(){
//         return stateService.getAll();
//     }

//     @GetMapping("/{stateId}")
//     public Optional<State>getRol(@PathVariable("Id")int stateId){
//         return stateService.getState(stateId);
//     }

//     @PostMapping("/save")
//     @ResponseStatus(HttpStatus.CREATED)
//     public State save(@RequestBody State state){
//         return stateService.save(state);
//     }

//     @PutMapping("/update")
//     @ResponseStatus(HttpStatus.CREATED)
//     public State update(@RequestBody State state){
//         return stateService.update(state);
//     }

//     @DeleteMapping("/delete")
//     @ResponseStatus(HttpStatus.NO_CONTENT)
//     public boolean deleteState(@PathVariable("stateId")int stateId){
//         return stateService.deleteState(stateId);
//     }    
// }
