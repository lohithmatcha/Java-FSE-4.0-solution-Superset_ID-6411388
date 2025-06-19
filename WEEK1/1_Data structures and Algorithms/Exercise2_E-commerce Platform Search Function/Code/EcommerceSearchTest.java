
//Step-1

import java.util.*;

class EcommerceSearchTest {

    static class Product {
        int productId;
        String productName;
        String productCategory;

        Product(int id, String prod_name, String prod_Categ) {
            productId = id;
            productName = prod_name;
            productCategory = prod_Categ;
        }
    }

    public static int LinerSearch(Product[] products, int id) {
        for (int i = 0; i < products.length; i++) {
            if (id == products[i].productId) {
                return i;
            }
        }
        return -1;
    }

    public static int BinarySearch(Product[] products, int id) {
        int l = 0, h = products.length;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (m == id)
                return m;
            else if (m < id) {
                l = m + 1;
            } else
                h = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Product[] products = {
                new Product(205, "White Shirt", "Clothing"),
                new Product(210, "Hp Laptop", "Electronics"),
                new Product(199, "Bata Shoes", "Footwear"),
                new Product(180, "Casio Watch", "Accessories")
        };
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Choose from the folowing:");
            System.out.println("1.Linear Search to find Product\n2.Binary Search to find Product\n3.Quit");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Enter id of product to find using Linear Search");
                    int id = sc.nextInt();
                    long start_time_linear = System.nanoTime();
                    int res_linear = LinerSearch(products, id);
                    long end_time_linear = System.nanoTime();
                    if (res_linear != -1) {

                        System.out.println("Product Found: " + products[res_linear].productName);

                        System.out.println(
                                "Time Taken by Linear Search: " + (end_time_linear - start_time_linear) + "ns\n");
                    } else
                        System.out.println("Product Not Found\n");
                    break;
                case 2:
                    System.out.println("Enter id of product to find using Binary Search");
                    int id2 = sc.nextInt();

                    Product[] products2 = Arrays.copyOf(products, 4);
                    Arrays.sort(products2, (a, b) -> a.productId - b.productId);

                    long start_time_binary = System.nanoTime();
                    int res_binary = LinerSearch(products2, id2);
                    long end_time_binary = System.nanoTime();
                    if (res_binary != -1) {
                        System.out.println("Product Found: " + products2[res_binary].productName);
                        System.out.println(
                                "Time Taken by Binary Search: " + (end_time_binary - start_time_binary) + "ns\n");
                    } else
                        System.out.println("Product Not Found\n");
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid Option");
            }

        }
    }

}