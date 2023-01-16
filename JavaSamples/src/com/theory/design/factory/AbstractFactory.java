package com.theory.design.factory;

interface Table {
    String getTable();
}

class KitchenTable implements Table {
    @Override
    public String getTable() {
        return "There is a kitchen table";
    }
}

class OfficeTable implements Table {
    @Override
    public String getTable() {
        return "There is an office table";
    }
}

interface TableTools {
    String getTool();
}

class KitchenTableTool implements TableTools {
    @Override
    public String getTool() {
        return "These are kitchen table tools";
    }
}

class OfficeTableTool implements TableTools {
    @Override
    public String getTool() {
        return "These are office table tools";
    }
}

interface TableFactory {
    Table makeTable();

    TableTools makeTableTools();
}

class KitchenTableFactory implements TableFactory {
    @Override
    public Table makeTable() {
        return new KitchenTable();
    }

    @Override
    public TableTools makeTableTools() {
        return new KitchenTableTool();
    }
}

class OfficeTableFactory implements TableFactory {
    @Override
    public Table makeTable() {
        return new OfficeTable();
    }

    @Override
    public TableTools makeTableTools() {
        return new OfficeTableTool();
    }
}

public class AbstractFactory {
    public static void main(String[] args) throws InterruptedException {
        Table table;
        TableTools tableTools;

        TableFactory kitchenTableFactory = new KitchenTableFactory();
        TableFactory officeTableFactory = new OfficeTableFactory();

        System.out.println("-I work as a cook. I need a kitchen table");
        System.out.println(
                "-Got It! Give me a sec,- Calling the KitchenTableFactory. - Bring me the KitchenTable with KitchenTableTools");
        Thread.sleep(5000);

        table = kitchenTableFactory.makeTable();
        tableTools = kitchenTableFactory.makeTableTools();

        System.out.println(table.getTable() + "\n" + tableTools.getTool());
        System.out.println("-There they are!\n");
        Thread.sleep(5000);

        System.out.println("-I am an office manager. I need an office table");
        System.out.println(
                "-Got It! Give me a sec,- Calling the OfficeTableFactory. - Bring me the OfficeTable with OfficeTableTools");
        Thread.sleep(5000);

        table = officeTableFactory.makeTable();
        tableTools = officeTableFactory.makeTableTools();

        System.out.println(table.getTable() + "\n" + tableTools.getTool());
        System.out.println("-There they are!");
    }
}

/*
 * Imprime:
 * 
 * -I work as a cook. I need a kitchen table
 * -Got It! Give me a sec,- Calling the KitchenTableFactory. - Bring me the
 * KitchenTable with KitchenTableTools
 * There is a kitchen table
 * These are kitchen table tools
 * -There they are!
 * 
 * -I am an office manager. I need an office table
 * -Got It! Give me a sec,- Calling the OfficeTableFactory. - Bring me the
 * OfficeTable with OfficeTableTools
 * There is an office table
 * These are office table tools
 * -There they are!
 */