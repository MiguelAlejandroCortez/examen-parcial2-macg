package objetos.parcial2.examen.smarthome;

public abstract class Device {
    private String name;

    public Device(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void turnOn();

    abstract void turnOff();
}
