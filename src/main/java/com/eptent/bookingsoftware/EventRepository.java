package com.eptent.bookingsoftware;

import java.util.List;
import java.util.Date;

import org.springframework.data.geo.Circle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "events", path = "events")
public interface EventRepository extends MongoRepository<Event, String> {

	List<Event> findByShowDate(@Param("showDate") Date showDate);
	List<Event> findByAddressCity(@Param("city") String city);
	List<Event> findByAddressState(@Param("state") String state);
	List<Event> findByAddressZip(@Param("zip") String zip);
	List<Event> findByAddressWithin(@Param("circle") Circle circle);
	List<Event> findByEventAttributesIn(@Param("eventAttributeID") List<String> eventAttributeID);
	List<Event> findBySponsorsIn(@Param("sponsorID") List<String> sponsorID);
}

