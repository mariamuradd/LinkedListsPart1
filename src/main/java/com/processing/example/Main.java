/*
 * Name: Maria Murad
 * Project Name: "Linked Lists I"
 * Date: October 17th, 2024
 * Description: This class shows the implementation of how a linked list works. It covers operations from adding, removing and finding items on the list. Includes 7 tests.
 */
package com.processing.example;

public class Main {
    public static void main(String[] args) {
        // create GroceryLinkedList
        GroceryLinkedList list = new GroceryLinkedList();

        // In test 1, I add items to the list and print it
        System.out.println("Test 1");
        list.insertAtEnd(new FoodNode("milk"));
        list.insertAtEnd(new FoodNode("bananas"));
        list.insertAtEnd(new FoodNode("ice cream"));
        list.insertAtEnd(new FoodNode("spinach"));
        list.insertAtEnd(new FoodNode("chicken"));
        list.print();
        System.out.println("---------------------");

        // In test 2, I remove ice cream and print the list
        System.out.println("Test 2");
        list.remove("ice cream");
        list.print();
        System.out.println("---------------------");

        // In test 3, I remove chicken and print the list
        System.out.println("Test 3");
        list.remove("chicken");
        list.print();
        System.out.println("---------------------");

        // In test 4, I find spinach in the list. But if not found, I add it to the end.
        System.out.println("Test 4");
        int spinachIndex = list.find("spinach");
        if (spinachIndex != -1) {
            System.out.println("Spinach is number " + (spinachIndex + 1) + " in the grocery list.");
        } else {
            list.insertAtEnd(new FoodNode("spinach"));
            System.out.println("Spinach not found. Added it to the end of the list.");
        }
        list.print();
        System.out.println("---------------------");

        // In test 5, I find eggs in the list. In this case, I did not find them so place them at end of list
        System.out.println("Test 5");
        int eggsIndex = list.find("eggs");
        if (eggsIndex != -1) {
            System.out.println("Eggs are number " + (eggsIndex + 1) + " in the grocery list.");
        } else {
            list.insertAtEnd(new FoodNode("eggs"));
            System.out.println("Eggs not found. Added them to the end of the list.");
        }
        list.print();
        System.out.println("---------------------");

        // In test 6, I add onions at the beginning of the list and print it
        System.out.println("Test 6");
        list.insertAtStart(new FoodNode("onions"));
        list.print();
        System.out.println("---------------------");

        // In test 7, I add strawberries after bananas and print the list
        System.out.println("Test 7");
        list.insert("bananas", new FoodNode("strawberries"));
        list.print();
        System.out.println("---------------------");
    }
        
}

