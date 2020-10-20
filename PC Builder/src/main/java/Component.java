public abstract class Component {
    private String name;
    private int powerConsumption;

    public Component(String name, int powerConsumption) {
        this.name = name;
        this.powerConsumption = powerConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
}
