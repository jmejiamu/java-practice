/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.open.bootcamp.java;

/**
 *
 * @author josemejia
 */
public class Main {

    public static void main(String[] args) {
        // Part 1
        System.out.println("Sum : " + sum(2, 5, 5));

        //Part 2
        Car myCar = new Car();
        myCar.incrementDoorsNumber();

        System.out.println("Number of doors: " + myCar.numOfDoor);
    }

    //Part 1
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

}
//Part 2

class Car {

    public int numOfDoor = 4;

    public void incrementDoorsNumber() {
        this.numOfDoor++;
    }
}
