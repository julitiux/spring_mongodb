package com.spring_mongo.service;

import com.spring_mongo.domain.GroceryItem;

import java.util.Optional;

public interface GroceryItemService {

  GroceryItem save(GroceryItem groceryItem);
  Iterable<GroceryItem> saveAll(Iterable<GroceryItem> groceryItems);
  Optional<GroceryItem> findById(String id);
  boolean existsById(String id);

}