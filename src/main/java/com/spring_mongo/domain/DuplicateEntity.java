package com.spring_mongo.domain;

public class DuplicateEntity extends RuntimeException {

  private final String entityName;
  private final String entityId;
  private static final long serialVersionUID = 1L;

  public DuplicateEntity(String entityName, String entityId) {
    super("Duplicate %s with id %s ".formatted(entityName, entityId));
    this.entityName = entityName;
    this.entityId = entityId;
  }

  public static DuplicateEntity groceryItem(final String entityId) {
    return new DuplicateEntity("GroceryItem", entityId);
  }

}
