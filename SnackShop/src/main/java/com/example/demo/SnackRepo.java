package com.example.demo;



import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.query.Param;

public interface SnackRepo extends JpaRepository<Snack, Integer> {

	Snack findByCustname(String custname);
}
