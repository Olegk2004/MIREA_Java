interface Priceable {
    double getPrice();
}


class Product implements Priceable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

// Класс для услуги
class Service implements Priceable {
    private String serviceName;
    private double Price4hour;
    private int hours;

    public Service(String serviceName, double price4hour, int hours) {
        this.serviceName = serviceName;
        this.Price4hour = price4hour;
        this.hours = hours;
    }

    @Override
    public double getPrice() {
        return Price4hour * hours;
    }
}

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Колонка", 1000.0);
        Service service = new Service("Ремонт", 5000.0, 5);

        System.out.println("Цена товара: " + product.getPrice());
        System.out.println("Цена услуги: " + service.getPrice());
    }
}
