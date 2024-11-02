package Polimorfism;

public class Table {
    private int tableNumber;
    private int seats;
    private boolean isReserved;
    private String size;

    public Table(int tableNumber, int seats, boolean isReserved, String size) {
        this.tableNumber = tableNumber;
        this.seats = seats;
        this.isReserved = false;
        this.size = size;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean getIsReserved() {
        return isReserved;
    }

    public void setIsReserved(boolean isReserved) {
        this.isReserved = isReserved;
    }

    public void reserve() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Table " + tableNumber + " reserved for " + seats + " people.");
        } else {
            System.out.println("Table " + tableNumber + " is already reserved.");
        }
    }

    public void reserve(int numOfPeople) {
        if (!isReserved && numOfPeople <= seats) {
            isReserved = true;
            System.out.println("Table " + tableNumber + " reserved for " + numOfPeople + " people.");
        } else {
            System.out.println("Cannot reserve table " + tableNumber + " for " + numOfPeople + " people.");
        }
    }


}


