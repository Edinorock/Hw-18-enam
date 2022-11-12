package Transport;

public enum Bodytype {

    SEDAN("Седан"),
    HATCHBACK("Хетчбек"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    VNEDOROZHNIK("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    FURGON("Фургон"),
    MINIVAN("Минивэн");

    private final String name;

    Bodytype(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Тип кузова: " + this.name;
    }
}