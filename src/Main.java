import Transport.*;
import Driver.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car ("Kia", "Rio",1.6f, Bodytype.HATCHBACK);
        DriverB DriverB = new DriverB("Меладзе Валерий", 5, car);
        System.out.println(DriverB);

        Bus volgabus = new Bus ("Volgabus", "Дельта 12", 1.7f, Capacitytype.N3);
        Bus zonda = new Bus("Zonda", "YCK6116HGL3", 2.5f, Capacitytype.N1);
        Bus daewoo = new Bus("Daewoo", "BC212MA", 3.0f, Capacitytype.N1);
        Bus gazelle = new Bus("Газель", "Next A63R42", 2.0f, Capacitytype.N2);

        Car kia = new Car("Kia", "Rio", 1.6f, Bodytype.HATCHBACK);
        Car honda = new Car("Honda", "CR-V", 2.0f, Bodytype.CROSSOVER);
        Car hyundai = new Car("Hyundai", "Creta", 1.8f, Bodytype.SEDAN);
        Car toyota = new Car("Toyota", "Camry", 3.0f, Bodytype.HATCHBACK);

        Truck pazik = new Truck("Паз", "Вектор", 3.7f, Loadtype.N3);
        Truck kavz = new Truck("КАВЗ", "4239", 2.5f, Loadtype.N1);
        Truck gaz = new Truck("ГАЗ", "3308 Садко", 2.5f, Loadtype.N2);
        Truck gazon = new Truck("ГАЗон", "Next", 3.7f, Loadtype.N1);

        System.out.println(volgabus);
        System.out.println(toyota);
        System.out.println(pazik);
        toyota.printType();

        honda.startMovement();
        honda.pitStop();
        honda.bestLapTime();
        System.out.println();
        honda.maxSpeed();
        System.out.println();
        honda.printType();

        pazik.pitStop();
        pazik.bestLapTime();
        System.out.println();
        pazik.maxSpeed();
        System.out.println();
        pazik.printType();

        volgabus.pitStop();
        volgabus.bestLapTime();
        System.out.println();
        volgabus.maxSpeed();
        System.out.println();
        volgabus.printType();
    }
}