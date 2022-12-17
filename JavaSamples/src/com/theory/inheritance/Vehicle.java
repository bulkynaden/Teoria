package com.theory.inheritance;

public class Vehicle {
  private String name;
  private String size;
  private int currentVelocity;
  private int currentDirection;

  public Vehicle(String name, String size) {
    setName(name);
    setSize(size);
    setCurrentDirection(0);
    setCurrentVelocity(0);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public int getCurrentVelocity() {
    return currentVelocity;
  }

  public void setCurrentVelocity(int currentVelocity) {
    this.currentVelocity = currentVelocity;
  }

  public int getCurrentDirection() {
    return currentDirection;
  }

  public void setCurrentDirection(int currentDirection) {
    this.currentDirection = currentDirection;
  }

  public void steer(int direction) {
    setCurrentDirection(getCurrentDirection() + direction);
    System.out.println("Vehicle.steer(): Steering at " + getCurrentDirection() + " degrees.");
  }

  public void move(int velocity, int direction) {
    setCurrentVelocity(velocity);
    setCurrentDirection(direction);
    System.out.println("Vehicle.move(): Moving at " + getCurrentVelocity() + " in direction "
        + getCurrentDirection());
  }

  public void stop() {
    setCurrentVelocity(0);
  }
}
