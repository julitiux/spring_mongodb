package com.spring_mongo.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroceryItemRepository extends MongoRepository<GroceryItem, String> {

}
