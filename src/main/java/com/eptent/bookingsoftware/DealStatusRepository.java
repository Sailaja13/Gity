package com.eptent.bookingsoftware;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "dealstatuses", path = "dealstatuses")
public interface DealStatusRepository extends MongoRepository<DealStatus, String> { 
	
	List<DealStatus> findByName(@Param("name") String name);

}
