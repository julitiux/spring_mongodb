package com.spring_mongo.webApi;

import com.spring_mongo.domain.GroceryItem;
import com.spring_mongo.service.GroceryItemService;
import com.spring_mongo.webApi.domain.GroceryItemCommand;
import com.spring_mongo.webApi.domain.GroceryItemDto;
import com.spring_mongo.webApi.mapper.GroceryItemMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping(value = "grocery_item")
public class GroceryItemController {

  final private GroceryItemService groceryItemService;

  public GroceryItemController(GroceryItemService groceryItemService) {
    this.groceryItemService = groceryItemService;
  }

  @RequestMapping(value = "/add", method = RequestMethod.POST)
  ResponseEntity<GroceryItemDto> addGroceryItem(@RequestBody GroceryItemCommand command) {
    var groceryItem = groceryItemService.save(GroceryItemMapper.of(command));
    if (Objects.nonNull(groceryItem))
      return new ResponseEntity<>(GroceryItemMapper.of(groceryItem), HttpStatus.CREATED);
    else
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
  }

  @RequestMapping(value = "/add_list", method = RequestMethod.POST)
  @ResponseBody
  ResponseEntity<List<GroceryItemDto>> addGroceryItemList(@RequestBody List<GroceryItemCommand> groceryItemCommands) {
    List<GroceryItem> groceryItems = (List<GroceryItem>) groceryItemService.saveAll(GroceryItemMapper.lof(groceryItemCommands));
    if (Objects.nonNull(groceryItems))
      return new ResponseEntity<>(GroceryItemMapper.of(groceryItems), HttpStatus.CREATED);
    else
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
  }

}