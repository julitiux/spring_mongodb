package com.spring_mongo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroceryItem {

  private String id;
  private String name;
  private int quantity;
  private String category;

}
