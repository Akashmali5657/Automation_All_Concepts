package designpattern.Builder;

public class PhoneBuilder {
    private String model;
    private String os;
    private Integer price;
    private String camera;

    public PhoneBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setPrice(Integer price) {
        this.price = price;
        return this;
    }

    public PhoneBuilder setCamera(String camera) {
        this.camera = camera;
        return this;
    }

    public Phone buildPhone() {
        return new Phone(model, os, price, camera);
    }
}
