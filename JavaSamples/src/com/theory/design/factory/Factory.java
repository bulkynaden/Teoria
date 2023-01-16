package com.theory.design.factory;

class Computer {

    private long ram;
    private long cpu;

    // getters and setters
}

class PC extends Computer {

    // additional members
}

class Laptop extends Computer {

    // additional members
}

class ComputerStaticFactory {

    public static Computer newInstance(String type) {
        if (type.equals("Computer")) {
            return new Computer();
        } else if (type.equals("PC")) {
            return new PC();
        } else if (type.equals("Laptop")) {
            return new Laptop();
        }
        return null; // if not a suitable type
    }
}

public class Factory {

    public static void main(String args[]) {

        Computer pc = ComputerStaticFactory.newInstance("PC");
        System.out.println(pc instanceof PC); // prints "true"

        Computer laptop = ComputerStaticFactory.newInstance("Laptop");
        System.out.println(laptop instanceof Laptop); // prints "true"
    }
}