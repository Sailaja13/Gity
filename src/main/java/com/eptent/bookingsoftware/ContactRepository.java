package com.eptent.bookingsoftware;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "contacts", path = "contacts")
public interface ContactRepository extends MongoRepository<Contact, String> {

	List<Contact> findByLastName(@Param("name") String name);
	List<Contact> findByFirstName(@Param("firstName") String firstName);
	List<Contact> findByEmail(@Param("email") String email);
	List<Contact> findByOrganizationID(@Param("organizationID") String organizationID);
	List<Contact> findByActivitiesIn(@Param("activityID") List<String> activityID);
	List<Contact> findByAddressCity(@Param("city") String city);
	List<Contact> findByAddressState(@Param("state") String state);
	List<Contact> findByAddressZip(@Param("zip") String zip);
	
}
