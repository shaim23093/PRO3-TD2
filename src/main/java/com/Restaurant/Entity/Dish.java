package com.Restaurant.Entity;

import java.util.List;
import java.util.Objects;

public class Dish {
    private int id;
    private String name;
    private double price;
    private DishTypeEnum dishType;
    private List<Ingredient> ingredients;

    public Dish(int id, String name, DishTypeEnum dishType, List<Ingredient> ingredient) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.dishType = dishType;
        this.ingredients = ingredient;
    }

    public Dish() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public DishTypeEnum getDishType() {
        return dishType;
    }

    public void setDishType(DishTypeEnum dishType) {
        this.dishType = dishType;
    }

    public List<Ingredient> getIngredient() {
        return ingredients;
    }

    public void setIngredient(List<Ingredient> ingredient) {
        this.ingredients = ingredient;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return id == dish.id && Double.compare(price, dish.price) == 0 && Objects.equals(name, dish.name) && dishType == dish.dishType && Objects.equals(ingredient, dish.ingredient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, dishType, ingredient);
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", dishType=" + dishType +
                ", ingredient=" + ingredients +
                '}';
    }
    public Double getDishPrice() {
        return ingredients.stream();


    }

    public  List<Ingredient> getIngredients() {
        return List.of(ingredients.toArray(new Ingredient[0]));
    }
}
