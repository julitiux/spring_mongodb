package com.spring_mongo.service;

import com.spring_mongo.domain.GroceryItem;
import com.spring_mongo.repository.GroceryItemRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GroceryItemServiceImpl implements GroceryItemService {

  private final GroceryItemRepository groceryItemRepository;

  public GroceryItemServiceImpl(GroceryItemRepository groceryItemRepository) {
    this.groceryItemRepository = groceryItemRepository;
  }


  @Override
  public GroceryItem save(GroceryItem groceryItem) {
    return groceryItemRepository.save(groceryItem);
  }

  @Override
  public Iterable<GroceryItem> saveAll(Iterable<GroceryItem> groceryItems) {
    return groceryItemRepository.saveAll(groceryItems);
  }

  @Override
  public Optional<GroceryItem> findById(String id) {
    return groceryItemRepository.findById(id);
  }

  @Override
  public boolean existsById(String id) {
    return groceryItemRepository.existsById(id);
  }

  @Override
  public Iterable<GroceryItem> findAll() {
    return groceryItemRepository.findAll();
  }

  @Override
  public Iterable<GroceryItem> findAllByIds(Iterable<String> ids) {
    return groceryItemRepository.findAllById(ids);
  }

  @Override
  public long count() {
    return groceryItemRepository.count();
  }

  @Override
  public void deleteById(String id) {
    groceryItemRepository.deleteById(id);
  }

  @Override
  public void delete(GroceryItem groceryItem) {
    groceryItemRepository.delete(groceryItem);
  }

  @Override
  public void deleteAllById(Iterable<String> strings) {
    groceryItemRepository.deleteAllById(strings);
  }

  @Override
  public void deleteAll(Iterable<GroceryItem> groceryItems) {
    groceryItemRepository.deleteAll(groceryItems);
  }

  @Override
  public void deleteAll() {
    groceryItemRepository.deleteAll();
  }
}
