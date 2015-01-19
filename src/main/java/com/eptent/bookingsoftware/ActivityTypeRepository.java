package com.eptent.bookingsoftware;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(collectionResourceRel = "activitytypes", path = "activitytypes")
public interface ActivityTypeRepository extends MongoRepository<ActivityType, String> {

	List<ActivityType> findByName(@Param("name") String name);
	
}