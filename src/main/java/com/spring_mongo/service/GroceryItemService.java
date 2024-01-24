package com.spring_mongo.service;

import com.spring_mongo.domain.GroceryItem;

public interface GroceryItemService {

  GroceryItem save(GroceryItem groceryItem);
  Iterable<GroceryItem> saveAll(Iterable<GroceryItem> groceryItems);

}