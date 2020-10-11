package com.test.demo.services;

import com.test.demo.models.TypePrimes;
import com.test.demo.repository.TypePrimesRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypePrimesServiceImpl implements TypePrimesService {

    @Autowired
    private TypePrimesRespository typePrimesRespository;

    @Override
    public TypePrimes saveTyepPrimes(final TypePrimes typeprimes){
        typePrimesRespository.save(typeprimes);
        return typeprimes;
    }

    @Override
    public TypePrimes updateTyepPrimes(final TypePrimes typeprimes){
        return typePrimesRespository.save(typeprimes);
    }

    @Override
    public void deleteTyepPrimes(final Long TyepPrimesId){
        typePrimesRespository.deleteById(TyepPrimesId);
    }

    @Override
    public List<TypePrimes> findAllTyepPrimes(){
        return typePrimesRespository.findAll();
    }

    @Override
    public Long nombreTyepPrimes(){
        return typePrimesRespository.count();
    }

}
