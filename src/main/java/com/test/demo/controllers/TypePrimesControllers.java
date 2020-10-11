package com.test.demo.controllers;

import com.test.demo.models.TypePrimes;
import com.test.demo.services.TypePrimesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TypePrimesControllers {
    @Autowired
    private TypePrimesService typePrimesService;

    @PostMapping("/api/typePrime-create")
    public ResponseEntity<?> createTypePrimes(@RequestBody TypePrimes typePrimes){
        return new ResponseEntity<>(typePrimesService.saveTyepPrimes(typePrimes), HttpStatus.CREATED);
    }

    @PutMapping("/api/typePrime-update")
    public ResponseEntity<?> updateTypePrimes(@RequestBody TypePrimes typePrimes){
        return new ResponseEntity<>(typePrimesService.updateTyepPrimes(typePrimes), HttpStatus.CREATED);
    }

    //This can be also @DeleteMapping.
    @PostMapping("/api/typePrime-delete")
    public ResponseEntity<?> deleteTypePrimes(@RequestBody TypePrimes typePrimes){
        typePrimesService.deleteTyepPrimes(typePrimes.getId());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/api/typePrime-all")
    public ResponseEntity<?> findAllTypePrimess(){
        return new ResponseEntity<>(typePrimesService.findAllTyepPrimes(), HttpStatus.OK);
    }

}
