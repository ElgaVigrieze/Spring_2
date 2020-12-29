//package com.company.springmvcweb.api;
//
//import com.company.springmvcweb.data.CarsRepository;
//import com.company.springmvcweb.data.Owner;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping(value = "/api/owners", produces = { MediaType.APPLICATION_JSON_VALUE })
//public class ApiOwnerController {
//
//    private CarsRepository repo = null;
//
//    public ApiOwnerController() {
//        repo = new CarsRepository();
//    }
//
//    @GetMapping("")
//    public Iterable<Owner> getOwners() {
//        return repo.getOwners();
//    }
//}
