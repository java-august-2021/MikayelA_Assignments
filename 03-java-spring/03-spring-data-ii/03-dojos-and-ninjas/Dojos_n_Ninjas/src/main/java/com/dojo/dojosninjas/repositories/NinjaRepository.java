package com.dojo.dojosninjas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dojo.dojosninjas.models.Ninjas;

@Repository
public interface NinjaRepository extends CrudRepository<Ninjas, Long>{
	
}
