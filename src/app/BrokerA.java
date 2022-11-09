package app;


public class BrokerA extends Broker implements Commission {

    String email;

    public BrokerA(String name, String phone, String email) {
        super(name, phone);
        this.email = email;
    }

    public String infoBroker() {
        String name = getName();
        String phone = getPhone();
        return "Брокер: " + name + ", " + phone + ", " + email + "\n";
    }

    @Override
    public double calcCommission(double sales) {
        double commission;
        if (sales <= 100000) {
            commission = sales * 10 / 100;
        } else if (sales > 100000 && sales <= 300000) {
            commission = sales * 15 / 100;
        } else {
            commission = sales * 20 / 100;
        }
        return commission;
    }
}
