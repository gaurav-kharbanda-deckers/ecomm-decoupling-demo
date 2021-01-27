package com.deckers.integrations.ecommdecouplingdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.deckers.integrations.ecommdecouplingdemo.model.DoOrderHeaders;

@Repository
public interface OrderRepository extends JpaRepository<DoOrderHeaders, String>{
	@Query(value = "SELECT xxd_ecom_transaction_id.nextval FROM dual", nativeQuery = 
	        true)
	 Long getNextSeriesId();
}
