package com.spring_mongo.webApi.mapper;

import com.spring_mongo.domain.GroceryItem;
import com.spring_mongo.webApi.domain.GroceryItemCommand;
import com.spring_mongo.webApi.domain.GroceryItemDto;

import java.util.List;
import java.util.stream.Collectors;

public class GroceryItemMapper {

  public static GroceryItem of(final GroceryItemCommand command){
    return new GroceryItem(null, command.name(), command.quantity(), command.category());
  }

  public static List<GroceryItem> of(List<GroceryItemCommand> itemCommands){
    return itemCommands.stream().map(GroceryItemMapper::of).collect(Collectors.toList());
  }

  public static GroceryItemDto of(final GroceryItem groceryItem){
    return new GroceryItemDto(groceryItem.getName(), groceryItem.getQuantity(), groceryItem.getCategory());
  }

}
