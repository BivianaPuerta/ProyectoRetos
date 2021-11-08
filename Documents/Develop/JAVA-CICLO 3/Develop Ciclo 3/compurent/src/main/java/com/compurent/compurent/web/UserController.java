// package com.compurent.compurent.web;


// import java.util.List;
// import java.util.Optional;

// import com.compurent.compurent.model.User;
// import com.compurent.compurent.service.UserService;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.*;

// @RestController
// @RequestMapping("/api/User")
// @CrossOrigin(origins = "*",methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
// public class UserController {
//     @Autowired
//     private UserService userService;

//     @GetMapping("/all")
//     public List<User>getUsers(){
//         return userService.getAll();
//     }

//     @GetMapping("/{idClient}")
//     public Optional<User> getUser(@PathVariable("idClient")int id){
//         return userService.getUser(id);
//     }

//     @PostMapping("/save")
//     @ResponseStatus(HttpStatus.CREATED)
//     public User save(@RequestBody User user){
//         return userService.save(user);
//     }

//     @PutMapping("/update")
//     @ResponseStatus(HttpStatus.CREATED)
//     public User update(@RequestBody User user){
//         return userService.update(user);
//     }

//     @DeleteMapping("/delete")
//     @ResponseStatus(HttpStatus.NO_CONTENT)
//     public boolean deleteUser(@PathVariable("idClient")int idClient){
//     return userService.deleteUser(idClient);
//     }
// }
