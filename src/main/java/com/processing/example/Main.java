/*
 * Name: Maria Murad
 * Project Name: "Hello, World!!! Processing in Java/VSCode"
 * Date: September 3rd, 2024
 * Description: 
 */
package com.processing.example;

import processing.core.*;

// sets up processing and prints the hello world message to the console

public class Main extends PApplet {
    public static void main(String[] args) {
        PApplet.main("com.processing.example.Main");
        System.out.println("Hello world!");
    }

    //sets up the size of the window

    public void settings() {
    
        size(500, 500);
    }

    // changes background color to dark green
    public void setup(){
        background(34, 55, 16);
    }

    // builds a set of my favorite shapes
    public void draw() {

        ellipse(200, 200, 350, 350);
        rect(120, 120, 160, 160);
        triangle(150, 280, 250, 120, 350, 280);
        quad(180, 160, 280, 120, 240, 240, 140, 280);
        square(170, 170, 60);
        arc(200, 200, 250, 250, 0, PI + QUARTER_PI, CHORD);
        
    }
}

