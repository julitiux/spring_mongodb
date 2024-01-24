package com.spring_mongo.service;

import com.spring_mongo.domain.GroceryItem;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GroceryItemServiceImpl implements GroceryItemService {

  @Override
  public GroceryItem save(GroceryItem groceryItem) {
    return null;
  }

  @Override
  public Iterable<GroceryItem> saveAll(Iterable<GroceryItem> groceryItems) {
    return null;
  }

  @Override
  public Optional<GroceryItem> findById(String id) {
    return Optional.empty();
  }

  @Override
  public boolean existsById(String id) {
    return false;
  }

  @Override
  public Iterable<GroceryItem> findAll() {
    return null;
  }

  @Override
  public Iterable<GroceryItem> findAllByIds(Iterable<String> ids) {
    return null;
  }

  @Override
  public long count() {
    return 0;
  }

  @Override
  public void deleteById(String id) {

  }

  @Override
  public void delete(GroceryItem groceryItem) {

  }

  @Override
  public void deleteAllById(Iterable<String> strings) {

  }

  @Override
  public void deleteAll(Iterable<GroceryItem> groceryItems) {

  }

  @Override
  public void deleteAll() {

  }
}
