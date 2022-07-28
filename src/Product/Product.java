package Product;

public class Product {
    int code;
    String name;
    String desc;
    String manufacturer;
    float price;

    public Product(int code, String name, String desc, String manufacturer, float price) {
        this.code = code;
        this.name = name;
        this.desc = desc;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public static void getInformation(Product prod) {
        System.out.println( "Product{" +
                "code=" + prod.code +
                ", name='" + prod.name + '\'' +
                ", desc='" + prod.desc + '\'' +
                ", manufacturer='" + prod.manufacturer + '\'' +
                ", price=" + prod.price +
                '}');
    }
}
