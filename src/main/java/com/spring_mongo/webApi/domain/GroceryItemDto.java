package com.spring_mongo.webApi.domain;

public record GroceryItemDto(
  String name,
  int quantity,
  String category
) {
}
