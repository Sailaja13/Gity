package com.eptent.bookingsoftware;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "dealwarmthlevels", path = "dealwarmthlevels")
public interface DealWarmthLevelRepository extends MongoRepository<DealWarmthLevel, String> {
	
	List<DealWarmthLevel> findByName(@Param("name") String name);

}
