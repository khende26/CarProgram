package com.company;

    public class CarDemo {

            public static void main(String[] args) {
                //In your CarDemo class, write a program that instantiates a Car object named myCar,
                // uses accessor methods to set each of its instance variables and then gets their values,
                // and finally prints out information about your vehicle

                Car myCar = new Car();

                myCar.setColorOfCar("Graphite");
                myCar.setMakeOfCar("Ford");
                myCar.setModelOfCar("Bronco");

                System.out.println("My vehicle is a " + myCar.getColorOfCar() + " " + myCar.getMakeOfCar() + " " +
                        myCar.getModelOfCar());
            }
    }
