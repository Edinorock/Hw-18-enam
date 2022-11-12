package Transport;

public class Bus extends Transport implements Compating {

    private final Capacitytype capacitytype;

    public Bus(String brand, String model, float engineVolume, Capacitytype capacitytype) {
        super(brand, model, engineVolume);
        this.capacitytype = capacitytype;
    }

    public void printType() {
        if (this.capacitytype != null) {
            System.out.println(this.capacitytype);
        } else {
            System.out.println("Нет информации");
        }
    }

    @Override
    public void startMovement() {
        System.out.printf("Автобус %s %s начинает движение",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }

    @Override
    public void stopMovement() {
        System.out.printf("Автобус %s %s заканчивает движение",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }

    @Override
    public void pitStop() {
        System.out.printf("Автобус %s %s на пит-стопе",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }

    @Override
    public void bestLapTime() {
        System.out.printf("Лучшее время автобуса %s %s - 10 минут 11 секунд",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }

    @Override
    public void maxSpeed() {
        System.out.printf("Максимальная скорость автобуса %s %s - 90 км/ч",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }
}