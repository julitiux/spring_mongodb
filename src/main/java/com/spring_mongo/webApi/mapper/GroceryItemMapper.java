package com.spring_mongo.webApi.mapper;

import com.spring_mongo.domain.GroceryItem;
import com.spring_mongo.webApi.domain.GroceryItemCommand;

public class GroceryItemMapper {

  public static GroceryItem of(final GroceryItemCommand command){
    return new GroceryItem(null, command.name(), command.quantity(), command.category());
  }

}
