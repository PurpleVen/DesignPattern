package AdapterDesignPattern.Model;

public class Socket {

    public Volt getVolt() {
        return new Volt(120);
    }
}
