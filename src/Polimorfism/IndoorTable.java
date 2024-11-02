package Polimorfism;

public class IndoorTable extends Table {
    private String decorStyle;

    public IndoorTable(int tableNumber, int seats, boolean isReserved, String size, String decorStyle) {
        super(tableNumber, seats, false, size);
        this.decorStyle = decorStyle;
    }

    @Override
    public void reserve() {
        super.reserve();
    }

    public String getDecorStyle() {
        return decorStyle;
    }

    public void setDecorStyle(String decorStyle) {
        this.decorStyle = decorStyle;

    }

    @Override
    public void reserve(int numOfPeople) {
        super.reserve(numOfPeople);
    }
}
