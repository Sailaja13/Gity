package com.eptent.bookingsoftware;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "address", path = "address")
public interface AddressRepository extends MongoRepository<Address, String> {

	List<Address> findByCity(@Param("city") String city);
	List<Address> findByState(@Param("state") String state);
	List<Address> findByZip(@Param("zip") String zip);
	
}
