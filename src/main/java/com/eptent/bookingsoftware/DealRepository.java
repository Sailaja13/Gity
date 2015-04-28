package com.eptent.bookingsoftware;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "deals", path = "deals")
public interface DealRepository extends MongoRepository<Deal, String> {
	
	List<Deal> findByDate(@Param("date") Date date);
	List<Deal> findByUserID(@Param("userID") String userID);
	List<Deal> findByContactID(@Param("contactID") String contactID);
	List<Deal> findByOrganizationID(@Param("organizationID") String organizationID);
	List<Deal> findByDealStatusID(@Param("dealStatusID") String dealStatusID);
	List<Deal> findByDealWarmthLevel(@Param("dealWarmthLevel") String dealWarmthLevel);
	List<Deal> findByPipelineStageID(@Param("pipelineStageID") String pipelineStageID);
	List<Deal> findByPipelineType(@Param("pipelineType") String pipelineType);
	List<Deal> findByExpectedCloseDate(@Param("expectedCloseDate") Date expectedCloseDate);
	
	
}