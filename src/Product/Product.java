package Product;

public class Product {
    int code;
    private String name;
    private String desc;
    private String manufacturer;
    private float price;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
