// package com.compurent.compurent.web;


// import java.util.List;
// import java.util.Optional;

// import com.compurent.compurent.model.Rol;
// import com.compurent.compurent.service.RolService;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.*;

// @RestController
// @RequestMapping("/api/Rol")
// @CrossOrigin(origins = "*",methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
// public class RolController {
//     @Autowired
//     private RolService rolService;

//     @GetMapping("/all")
//     public List<Rol>getRols(){
//         return rolService.getAll();
//     }

//     @GetMapping("/{Id}")
//     public Optional<Rol>getRol(@PathVariable("Id")int rolId){
//         return rolService.getRol(rolId);
//     }

//     @PostMapping("/save")
//     @ResponseStatus(HttpStatus.CREATED)
//     public Rol save(@RequestBody Rol rol){
//         return rolService.save(rol);
//     }

//     @PutMapping("/update")
//     @ResponseStatus(HttpStatus.CREATED)
//     public Rol update(@RequestBody Rol rol){
//         return rolService.update(rol);
//     }

//     @DeleteMapping("/delete")
//     @ResponseStatus(HttpStatus.NO_CONTENT)
//     public boolean deleteRol(@PathVariable("rolId")int rolId){
//         return rolService.deleteRol(rolId);
//     }    
// }
