package com.eptent.bookingsoftware;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "activities", path = "activities")
public interface ActivityRepository extends MongoRepository<Activity, String> {
	
	List<Activity> findByDate(@Param("date") Date date);
	List<Activity> findByDueDate(@Param("dueDate") Date dueDate);	
	List<Activity> findByUserID(@Param("userID") String userID);
}
