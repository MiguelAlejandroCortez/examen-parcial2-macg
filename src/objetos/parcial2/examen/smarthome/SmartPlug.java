package objetos.parcial2.examen.smarthome;

public class SmartPlug extends Device{
    public SmartPlug(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        System.out.println(getName() +" : " + "Energizando Contacto" );
    }

    @Override
    public void turnOff() {
        System.out.println(getName() +" : " + "Apagando Contacto" );
    }
}
