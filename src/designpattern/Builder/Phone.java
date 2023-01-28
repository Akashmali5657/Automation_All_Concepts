package designpattern.Builder;

public class Phone {
    private String model;
    private String os;
    private Integer price;
    private String camera;

    public Phone(String model, String os, Integer price, String camera) {
        super();
        this.model = model;
        this.os = os;
        this.price = price;
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", os='" + os + '\'' +
                ", price=" + price +
                ", camera='" + camera + '\'' +
                '}';
    }
}
