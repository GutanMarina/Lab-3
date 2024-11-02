package Polimorfism;

public class OutdoorTable extends Table {
    private String weatherProtection;

    public OutdoorTable(int tableNumber, int seats, boolean isReserved, String size, String weatherProtection) {
        super(tableNumber, seats, false, size);
        this.weatherProtection = "Umbrella";
    }

    @Override
    public void reserve() {
        super.reserve();
    }

    public String getWeatherProtection() {
        return weatherProtection;
    }

    public void setWeatherProtection(String weatherProtection) {
        this.weatherProtection = weatherProtection;
    }

    @Override
    public void reserve(int numOfPeople) {
        super.reserve(numOfPeople);
    }
}
