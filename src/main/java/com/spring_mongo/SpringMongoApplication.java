package com.spring_mongo;

import com.spring_mongo.domain.GroceryItem;
import com.spring_mongo.repository.GroceryItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SpringMongoApplication implements CommandLineRunner {

  @Autowired
  GroceryItemRepository groceryItemRepository;

  public static void main(String[] args) {
    SpringApplication.run(SpringMongoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    createGroceryItems();
  }

  void createGroceryItems() {
    System.out.println("Data creation started... ");

    groceryItemRepository.save(new GroceryItem("Whole Wheat Biscuit", "Whole Wheat Biscuit", 5, "snacks"));
    groceryItemRepository.save(new GroceryItem("Kodo Millet", "XYZ Kodo Millet healthy", 2, "millets"));
    groceryItemRepository.save(new GroceryItem("Dried Red Chilli", "Dried Whole Red Chilli", 2, "spices"));
    groceryItemRepository.save(new GroceryItem("Pearl Millet", "Healthy Pearl Millet", 1, "millets"));
    groceryItemRepository.save(new GroceryItem("Cheese Crackers", "Bonny Cheese Crackers Plain", 6, "snacks"));

  }

}
