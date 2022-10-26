package objetos.parcial2.examen.smarthome;

public abstract class Device {
    private String name;

    public Device(String name){
        this.name =name;
    }

    public abstract void turnOn();
    public abstract void turnOff();

    public String getName() {
        return name;
    }
}
