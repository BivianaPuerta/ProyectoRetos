// package com.proyectcomputer.proyectcomputer.web;

// import java.util.List;
// import java.util.Optional;

// import com.proyectcomputer.proyectcomputer.model.Reservation;
// import com.proyectcomputer.proyectcomputer.service.ReservationService;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.*;

// @RestController
// @RequestMapping("/api/Reservation")
// @CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
// public class ReservationController {
//     // @Autowired
//     // private ReservationService reservationService;

//     // @GetMapping("/all")
//     // public List<Reservation>getMessages(){
//     //     return reservationService.getAll();
//     // }

//     // @GetMapping("/{reservationId}")
//     // public Optional<Reservation>getReservation(@PathVariable("reservationId")int id){
//     //     return reservationService.getReservation(id);
//     // }

//     // @PostMapping("/save")
//     // @ResponseStatus(HttpStatus.CREATED)
//     // public Reservation save(@RequestBody Reservation reservation){
//     //     return reservationService.save(reservation);
//     // }

//     // @PutMapping("/update")
//     // @ResponseStatus(HttpStatus.CREATED)
//     // public Reservation update(@RequestBody Reservation reservation){
//     //     return reservationService.update(reservation);
//     // }

//     // @DeleteMapping("/delete")
//     // @ResponseStatus(HttpStatus.NO_CONTENT)
//     // public boolean deleteReservation(@PathVariable("reservationId")int reservationId){
//     // return reservationService.deleteReservation(reservationId);
//     // }
// }
