package com.theory.inheritance;

public class Car extends Vehicle {

  private int wheels;
  private int doors;
  private int gears;
  private boolean isManual;
  private int currentGear;

  public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
    super(name, size);
    setWheels(wheels);
    setDoors(doors);
    setGears(gears);
    setManual(isManual);
    setCurrentGear(1);
  }

  public int getWheels() {
    return wheels;
  }

  public void setWheels(int wheels) {
    this.wheels = wheels;
  }

  public int getDoors() {
    return doors;
  }

  public void setDoors(int doors) {
    this.doors = doors;
  }

  public int getGears() {
    return gears;
  }

  public void setGears(int gears) {
    this.gears = gears;
  }

  public boolean isManual() {
    return isManual;
  }

  public void setManual(boolean isManual) {
    this.isManual = isManual;
  }

  public int getCurrentGear() {
    return currentGear;
  }

  public void setCurrentGear(int currentGear) {
    this.currentGear = currentGear;
  }

  public void changeGear(int currentGear) {
    setCurrentGear(currentGear);
    System.out.println("Car.setCurrentGear(): Changed to " + getCurrentGear() + " gear.");
  }

  public void changeVelocity(int speed, int direction) {
    System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
    move(speed, direction);
  }
}
