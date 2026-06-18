class Sensor{
    String name;
    int batterylevel;
    void charge(){
        batterylevel = 100;
        System.out.println("Sensor Fully changed");
    }
}
public class Main4 {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        sensor.name = "Temperature Sensor";
        sensor.batterylevel=40;
        sensor.charge();
        System.out.println("New Battery Lavel: "+sensor.batterylevel);
    }
}
