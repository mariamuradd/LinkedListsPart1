/*
 * Name: Maria Murad
 * Project Name: "Linked Lists I"
 * Date: October 17th, 2024
 * Description: This class implements a linked list specifically designed for managing a grocery list. The list supports operations such as inserting items at the beginning, end, or at a specified position, as well as searching for items and printing the entire list.
 */

package com.processing.example;

public class GroceryLinkedList {
    private FoodNode header; // points to the first node in the linked list

    //Constructor but first has to be empty
    public GroceryLinkedList(){
        this.header = null;
    }

    //this method prints all the food names in the list. it starts from header and iterates through each node until the end.
    public void print(){
        FoodNode current = header;
        while (current != null){
            System.out.println(current.getFoodName());
            current = current.getNextFood(); // move to next node in the list
        }
    }

    // this will insert a node at the start of the List. if node is empty, new node becomes the header but if it's not, then node is inserted before current header.
    public void insertAtStart(FoodNode node){
        if(isEmpty()){
            header = node;
        } else {
            node.setNextFood(header);
            header = node; // updates header to new node
        }
    }

    // this will insert a node at the end of the list
    public void insertAtEnd(FoodNode node) {
        if (isEmpty()) {
            header = node;
        } else {
            FoodNode current = header;
            while (current.getNextFood() != null) {
                current = current.getNextFood();
            }
            current.setNextFood(node); // appends new node to the last node
        }
    }

    // this will insert a node at a specified index point
    public void insert(int index, FoodNode node){
        if(index == 0){
            insertAtStart(node); // call insertAtStart
        } else {
            FoodNode current = header;
            for (int i = 0; i < index - 1 && current != null; i++){
                current = current.getNextFood();
            }
            if (current != null){
                node.setNextFood(current.getNextFood()); // link new node to the next
                current.setNextFood(node); // link current node to new one
            }
        }
    }

    // this will insert a node after a specified food type
    public void insert(String food, FoodNode node){
        int index = find(food);
        if(index != -1){
            insert(index + 1, node); // insert new node after found food item
        }
    }

    // this will help find the index of a food in the list
    public int find(String food) {
        FoodNode current = header;
        int index = 0;
        while (current != null) {
            if (current.getFoodName().equals(food)) {
                return index;
            }
            current = current.getNextFood();
            index++;
        }
        return -1; // food not found!
    }

    // this will remove a specified food type from the list
    public void remove(String food) {
        if (isEmpty()) {
            return;
        }

        if (header.getFoodName().equals(food)) {
            header = header.getNextFood();
            return;
        }

        FoodNode current = header; // start from head
        while (current.getNextFood() != null) {
            if (current.getNextFood().getFoodName().equals(food)) {
                current.setNextFood(current.getNextFood().getNextFood());
                return;
            }
            current = current.getNextFood(); // move next node
        }
    }

    // this will check if list is empty or not
    public boolean isEmpty(){
        return header == null; // list is empty if header is null
    }

}
