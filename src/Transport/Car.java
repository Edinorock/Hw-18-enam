package Transport;

public class Car extends Transport implements Compating {

    private final Bodytype bodytype;
    public Car (String brand, String model, float engineVolume, Bodytype bodytype) {
        super (brand, model, engineVolume);
        this.bodytype = bodytype;
    }


    public void printType() {
        if (this.bodytype != null) {
            System.out.println(bodytype);
        } else {
            System.out.println("Нет информации");
        }
    }
    @Override
    public void startMovement() {
        System.out.printf("Автомобиль %s %s начинает движение",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }

    @Override
    public void stopMovement() {
        System.out.printf("Автомобиль %s %s заканчивает движение",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }

    @Override
    public void pitStop() {
        System.out.printf("Автомобиль %s %s на пит-стопе",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }

    @Override
    public void bestLapTime() {
        System.out.printf("Лучшее время авто %s %s - 6 минут 12 секунд",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.printf("Максимальная скорость авто %s %s - 220 км/ч",
                this.getBrand(),
                this.getModel());
    }
}