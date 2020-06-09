/*
 *
 * Classname: AbstractFactoryParallelogram
 *
 * 09 June 2020
 *
 * Copyright Zaichenko Vladyslav KNUTE
 *
 * Module 2 task 3
 *
 * Programming patterns. Factory, Builder.
 *
 * Develop for your class
 * 1. Factory.
 * 2. Abstract factory.
 * 3. Create a class Student  - 25 fields.
 * 4.  Create a builder for the class Student
 *
 */

package com.company;

public class AbstractFactoryParallelogram {

    public static Parallelogram create(int sideA, int sideB, double angle){
        if (sideA == sideB ) {return
                new Rhombus (sideA, angle);
        } else return
                new Parallelogram(sideA, sideB, angle);

    }
}