package org.example;

public class Main {

    public static void main(String[] args) {

        Address deliveryTo = new Address("Moscow");

        ImmutableOrder order = new ImmutableOrder(
                "Vlad",
                "88005553535",
                deliveryTo);

        deliveryTo.setCity("Magadan");
        System.out.println(order.getAddress().getCity());

        Address received = order.getAddress();
        received.setCity("Saint-Petersburg");
        System.out.println(order.getAddress().getCity());

        System.out.println(
                "\nИтоговые данные: '" +
                "\nName: " + order.getName() +
                "\nPhone: " + order.getPhone() +
                "\nCity: " + order.getAddress().getCity() + "'");

    }

}
