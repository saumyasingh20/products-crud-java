package Product;

import java.util.ArrayList;
import java.util.Scanner;

import static Product.Product.getInformation;

public class ProductMgmt {
    static ArrayList<Product> products = new ArrayList<>();

    public static void inputProductDetails(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter product code");
        int prodCode = scan.nextInt();
        System.out.println("Enter product name");
        String prodName = scan.next();
        System.out.println("Enter product description");
        String prodDesc = scan.next();
        System.out.println("Enter product manufacturer");
        String prodManu = scan.next();
        System.out.println("Enter product price");
        float prodPrice = scan.nextFloat();
        Product prod = new Product(prodCode,prodName,prodDesc,prodManu,prodPrice);
        addProduct(prod);

    }
    public static void addProduct(Product prod){
        products.add(prod);
        System.out.println("added");
    }
    public static void listProducts(){
        if(products.size()==0){
            System.out.println("Empty Product List");
            return;
        }
        for(Product prod:products){
            getInformation(prod);
        }
    }
    public static void deleteProduct(int code){
        products.removeIf(product -> (product.code == code));
        System.out.println("Product deleted successfully");
        listProducts();
    }
    public static boolean findProduct(int code){
        boolean isFound = false;
        for(Product prod:products){
            if(prod.code==code){
                isFound=true;
            }
        }
        return isFound;
    }
    public static void updateProduct(int code){
        System.out.println("Enter the product property which you want to update . Choose index: ");
        System.out.println("1. Product Name");
        System.out.println("2. Product Description");
        System.out.println("3. Product Manufacturer");
        System.out.println("4. Product Price");
        Scanner scan = new Scanner(System.in);
        int ch = scan.nextInt();
        switch (ch){
            case 1: {
                System.out.println("Enter new Product name");
                String newName = scan.next();
                for(Product prod:products){
                    if(prod.code==code){
                        prod.name=newName;
                        System.out.println("Product Updated");
                        getInformation(prod);
                        return;
                    }
                }
                break;
            }
            case 2: {
                System.out.println("Enter new Product description");
                String newDesc = scan.next();
                for(Product prod:products){
                    if(prod.code==code){
                        prod.desc=newDesc;
                        System.out.println("Product Updated");
                        getInformation(prod);
                        return;
                    }
                }
                break;
            }
            case 3: {
                System.out.println("Enter new Product manufacturer");
                String newManu = scan.next();
                for(Product prod:products){
                    if(prod.code==code){
                        prod.manufacturer=newManu;
                        System.out.println("Product Updated");
                        getInformation(prod);
                        return;
                    }
                }
                break;
            }
            case 4: {
                System.out.println("Enter new Product price");
                float newPrice = scan.nextFloat();
                for(Product prod:products){
                    if(prod.code==code){
                        prod.price=newPrice;
                        System.out.println("Product Updated");
                        getInformation(prod);
                        return;
                    }
                }
                break;
            }
            default:
                System.out.println("Invalid choice");
        }
    }


}
