package app;

import java.util.Scanner;


public class App {

    static String brokerName;
    static String email;
    static String phone;
    static String productName;
    static int quantity;
    static double price;
    static String roundBonus;
    static ProductA product;
    static BrokerA broker;
    static String infoBroker;
    static String infoProduct;

    public static void main(String[] args) {
        doInputs();
        showData(processData());
    }

    private static void doInputs() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter broker name:");
        brokerName = sc.nextLine().trim();
        System.out.println("Enter e-mail " + brokerName + ":");
        email = sc.nextLine().trim();
        System.out.println("Enter phone number " + brokerName + ":");
        phone = sc.nextLine().trim();
        System.out.println("Enter product name:");
        productName = sc.nextLine().trim();
        System.out.println("Enter quantity of " + productName + ":");
        quantity = sc.nextInt();
        System.out.println("Enter price of " + productName + ":");
        price = sc.nextDouble();
    }

    private static String processData() {
        broker = new BrokerA(brokerName, phone, email);
        infoBroker = broker.infoBroker();
        product = new ProductA(productName, quantity, price);
        infoProduct = product.infoProduct();

        double sales = product.calcSales(quantity, price);
        roundBonus = Rounder.roundValue(broker.calcCommission(sales));

        return infoBroker + infoProduct + "\nБонус (грн.): " + roundBonus;
    }

    private static void showData(String output) {
        System.out.println(output);
    }
}
