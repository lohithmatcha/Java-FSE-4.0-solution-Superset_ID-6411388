
import java.util.*;

class EcommerceSearchTest {

    class Product {
        int productId;
        String productName;
        String productCategory;

        Product(int id, String prod_name, String prod_Categ) {
            productId = id;
            productName = prod_name;
            productCategory = prod_Categ;
        }
    }

    public static boolean LinerSearch(Product[] products, int id) {
        for (int i = 0; i < products.length; i++) {
            if (id == products[i].productId) {
                return true;
            }
        }
        return false;
    }

    public static boolean BinarySearch(Product[] products, int id) {
        int l = 0, h = products.length;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (m == id)
                return true;
            else if (m < id) {
                l = m + 1;
            } else
                h = m - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        // Product pr=new Product [10];
        // Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Choose from the folowing:");
            System.out.println(
                    "1.to ADD product\n 2.Linear Search to find Product\n 3.Binary Search to find Product\n 4.Quit");
            // int op = sc.nextInt();

            switch (0) {
                case 1:
                    System.out.println("Enter name of product");

                    break;

                default:
                    break;
            }
            break;
        }
    }

}