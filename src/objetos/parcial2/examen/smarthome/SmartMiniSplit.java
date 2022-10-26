package objetos.parcial2.examen.smarthome;

public class SmartMiniSplit extends Device{

    public SmartMiniSplit(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        System.out.println(getName() +" : " + "Encendiendo MiniSplit" );
    }

    @Override
    public void turnOff() {
        System.out.println(getName() +" : " + "Apagando MiniSplit" );
    }
}
