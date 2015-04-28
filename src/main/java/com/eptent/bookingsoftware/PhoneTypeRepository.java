package com.eptent.bookingsoftware;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "phonetypes", path = "phonetypes")
public interface PhoneTypeRepository extends MongoRepository<PhoneType, String> {

	List<PhoneType> findByName(@Param("name") String name);
	
}
