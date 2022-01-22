package com.company.name.shoes.sporty.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.name.shoes.sporty.model.Shoe;

@Repository
public interface ShoesRepository extends JpaRepository<Shoe, Integer>{
	
}
