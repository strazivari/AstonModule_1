package org.example;

public final class ImmutableOrder {

    private final String name;
    private final String phone;
    private final Address address;

    public ImmutableOrder (String name, String phone, Address address) {
        this.name = ValidationUtils.verifyData(name);
        this.phone = ValidationUtils.verifyData(phone);
        this.address = new Address(address);
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public Address getAddress() {
        return new Address(address);
    }
}
