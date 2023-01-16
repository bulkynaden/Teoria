package com.theory.design.factory;

abstract class Table {
    private String name;

    Table(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void attachLegs() {
        System.out.println("Attaching Legs");
    }

    void attachTableTop() {
        System.out.println("Attaching tabletop");
    }
}

class TableOffice extends Table {
    TableOffice(String name) {
        super(name);
    }
}

class TableKitchen extends Table {
    TableKitchen(String name) {
        super(name);
    }
}

abstract class TableFactory {

    abstract Table createTable(String type);

    Table orderTable(String type) {
        Table table = createTable(type);
        if (table == null) {
            System.out.println("Sorry, we are not able to create this kind of table\n");
            return null;
        }
        System.out.println("Making " + table.getName());
        table.attachLegs();
        table.attachTableTop();
        System.out.println("Created " + table.getName() + "\n");
        return table;
    }
}

class TableStore extends TableFactory {
    @Override
    Table createTable(String type) {
        if (type.equals("office")) {
            return new TableOffice("Office Table");
        } else if (type.equals("kitchen")) {
            return new TableKitchen("Kitchen Table");
        } else
            return null;
    }
}

public class FactoryMethod {
    public static void main(String[] args) {
        TableStore tableStore = new TableStore();
        Table strangeTable = tableStore.orderTable("Mysterious table");
        Table officeTable = tableStore.orderTable("office");
        Table kitchenTable = tableStore.orderTable("kitchen");
    }
}

/*
 * Imprime:
 * 
 * Sorry, we are not able to create this kind of table
 * 
 * Making Office Table
 * Attaching Legs
 * Attaching tabletop
 * Created Office Table
 * 
 * Making Kitchen Table
 * Attaching Legs
 * Attaching tabletop
 * Created Kitchen Table
 */