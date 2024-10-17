/*
 * Name: Maria Murad
 * Project Name: "Linked Lists I"
 * Date: October 17th, 2024
 * Description: This class represents a node in a linked list, specifically for a grocery list. Each node contains the name of a food item and a reference to the next node in the list
 */

package com.processing.example;

public class FoodNode {
    private String foodName;
    private FoodNode nextFood;

    //Constructor
    public FoodNode(String foodName){
        this.foodName = foodName;
        this.nextFood = null;
    }

    // getter and setter for foodName
    public String getFoodName(){
        return foodName;
    }

    public void setFoodName(String foodName){
        this.foodName = foodName;
    }

    // getter and setter for nextFood
    public FoodNode getNextFood(){
        return nextFood;
    }

    public void setNextFood(FoodNode nextFood){
        this.nextFood = nextFood;
    }
}
