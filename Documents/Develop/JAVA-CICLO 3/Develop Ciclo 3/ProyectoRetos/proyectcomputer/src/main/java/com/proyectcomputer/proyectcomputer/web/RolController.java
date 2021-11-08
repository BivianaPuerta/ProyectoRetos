package com.proyectcomputer.proyectcomputer.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

// import java.util.List;
// import java.util.Optional;

// import com.proyectcomputer.proyectcomputer.model.Rol;
// import com.proyectcomputer.proyectcomputer.service.RolService;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/Rol")
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class RolController {
    // @Autowired
    // private RolService rolService;

    // @GetMapping("/all")
    // public List<Rol>getRol(){
    //     return rolService.getAll();
    // }

    // @GetMapping("/{rolId}")
    // public Optional<Rol>getReservation(@PathVariable("rolId")int id){
    //     return rolService.getRol
    // }

    // @PostMapping("/save")
    // @ResponseStatus(HttpStatus.CREATED)
    // public Rol save(@RequestBody Rol rol){
    //     return rolService.save(rol);
    // }

    // @PutMapping("/update")
    // @ResponseStatus(HttpStatus.CREATED)
    // public Rol update(@RequestBody Rol rol){
    //     return reservationService.update(reservation);
    // }

    // @DeleteMapping("/delete")
    // @ResponseStatus(HttpStatus.NO_CONTENT)
    // public boolean deleteReservation(@PathVariable("reservationId")int reservationId){
    // return reservationService.deleteReservation(reservationId);
    // }
}
