import Polimorfism.IndoorTable;
import Polimorfism.OutdoorTable;
import Polimorfism.Table;


public class Main {
    public static void main(String[] args) {
        Table table1 = new Table(1, 4, false, "Medium");
        OutdoorTable table2 = new OutdoorTable(2, 6, false, "Large","Umbrella");
        IndoorTable table3 = new IndoorTable(3, 2, false, "Small", "Classic");

        table1.reserve();
        table2.reserve();
        table3.reserve();
        table1.reserve(2);
        table2.reserve(4);

    }
    }
