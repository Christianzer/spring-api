package com.test.demo.services;

import com.test.demo.models.TypePrimes;

import java.util.List;

public interface TypePrimesService {
    TypePrimes saveTyepPrimes(TypePrimes typeprimes);

    TypePrimes updateTyepPrimes(TypePrimes typeprimes);

    void deleteTyepPrimes(Long TyepPrimesId);

    List<TypePrimes> findAllTyepPrimes();

    Long nombreTyepPrimes();
}
