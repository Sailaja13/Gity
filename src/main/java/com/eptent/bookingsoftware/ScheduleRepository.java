package com.eptent.bookingsoftware;

import java.util.List;
import java.util.Date;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "scheduless", path = "schedules")
public interface ScheduleRepository extends MongoRepository<Schedule, String> {

	List<Schedule> findByName(@Param("name") String name);
	//List<Schedule> findByStartAndEnd(@Param("start") String start); //TODO this needs to be fixed!
	List<Schedule> findByStartGreaterThan(@Param("start") Date start);
	List<Schedule> findByEndGreaterThan(@Param("end") Date end);
}
