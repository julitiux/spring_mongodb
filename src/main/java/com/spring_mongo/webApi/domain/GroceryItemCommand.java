package com.spring_mongo.webApi.domain;

public record GroceryItemCommand(
  String name,
  int quantity,
  String category
) {
}
