package com.eptent.bookingsoftware;

import java.util.List;



import org.springframework.data.geo.Circle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "organizations", path = "organizations")
public interface OrganizationRepository extends MongoRepository<Organization, String> {

	List<Organization> findByName(@Param("name") String name);	
	List<Organization> findByOrganizationType(@Param("organizationType") String organizationType);
	List<Organization> findByParentID(@Param("parentID") String parentID);
	List<Organization> findByAddressCity(@Param("city") String city);
	List<Organization> findByAddressState(@Param("state") String state);
	List<Organization> findByAddressZip(@Param("zip") String zip);
	List<Organization> findByAddressWithin(@Param("circle") Circle circle);
	
}
