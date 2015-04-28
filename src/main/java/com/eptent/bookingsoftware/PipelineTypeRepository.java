package com.eptent.bookingsoftware;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "pipelinetypes", path = "pipelinetypes")
public interface PipelineTypeRepository extends MongoRepository<PipelineType, String> {

	List<PipelineType> findByName(@Param("name") String name);
	
}