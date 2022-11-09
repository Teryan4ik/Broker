package app;

public class Broker {

    private final String name;
    private final String phone;

    public Broker(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
