package com.eptent.bookingsoftware;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "organizationtypes", path = "organizationtypes")
public interface OrganizationTypeRepository extends MongoRepository<OrganizationType, String> {

	List<OrganizationType> findByName(@Param("name") String name);
	
}
