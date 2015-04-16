package com.eptent.bookingsoftware;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "eventattributes", path = "eventattributes")
public interface EventAttributeRepository extends MongoRepository<EventAttribute, String> {

	List<EventAttribute> findByName(@Param("name") String name);
}
