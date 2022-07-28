package Product;

import java.util.Scanner;

import static Product.ProductMgmt.*;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ch;
        do {
            System.out.println("Welcome to Product mgmt");
            System.out.println("Enter the operation you want to perform ");
            System.out.println("1. Add Product ");
            System.out.println("2. List Products");
            System.out.println("3. Delete Products");
            System.out.println("4. Update Product");
            System.out.println("5. exit ");
            ch = scan.nextInt();
            switch (ch) {
                case 1: {
                    inputProductDetails();
                    break;
                }
                case 2: {
                        listProducts();
                        break;
                  }
                case 3: {
                        System.out.println("Enter product code");
                        int codeToBeDeleted = scan.nextInt();
                        boolean isProductPresent = findProduct(codeToBeDeleted);
                        if (isProductPresent) {
                            deleteProduct(codeToBeDeleted);
                        }
                        else {
                            System.out.println("Product not present in list");
                        }
                        break;
                }
                case 4: {
                    System.out.println("Enter product code");
                    int c = scan.nextInt();
                    boolean isProductPresent = findProduct(c);
                    if (isProductPresent) {
                        updateProduct(c);
                    } else {
                        System.out.println("Product not present in list");
                    }
                    break;
                }
                case 5: System.exit(0);
                default:
                    System.out.println("invalid choice");
                    ;
            }
        }while (ch!=5);

    }
}
