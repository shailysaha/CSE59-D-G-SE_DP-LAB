
class Printer{
    void printData(String text){
        System.out.println("Print text: "+text);
    }
    void printData(int num){
        System.out.println("Print number: "+num);
    }
}

public class Main5 {
    public static void main(String[] args) {
        Printer print = new Printer();
        print.printData("hello Java");
        print.printData(100);
    }
    
}
