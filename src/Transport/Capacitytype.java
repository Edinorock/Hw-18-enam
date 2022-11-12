package Transport;

public enum Capacitytype {
    N1 (0, 10),
    N2 (0, 25),
    N3 (40, 50),
    N4 (60, 80),
    N5 (100, 120);

    private final int capacityFrom;
    private final int capacityTo;


    Capacitytype(int capacityFrom, int capacityTo) {
        this.capacityFrom = capacityFrom;
        this.capacityTo = capacityTo;
    }

    @Override
    public String toString() {
        String capacity = capacityFrom > 0
                ? capacityFrom + " - " + capacityTo
                : String.valueOf(capacityTo);
        return "Вместимость:  "+ name()+"(" + capacity + " мест)";
    }
}