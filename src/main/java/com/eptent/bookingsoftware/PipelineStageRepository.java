package com.eptent.bookingsoftware;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "pipelinestages", path = "pipelinestages")
public interface PipelineStageRepository extends MongoRepository<PipelineStage, String> {

	List<PipelineStage> findByName(@Param("name") String name);
	
}