package programwork5;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programwork5 {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Product> list = new ArrayList<>();
        
        SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/yyyy");
        System.out.println("Enter the Number of Products: ");
        
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Product # " + (i + 1) + "data:");
            System.out.print("Common, used or imported (c/u/i)");
            char ch = sc.next().charAt(0);
            
            switch (ch) {
                case 'c':
                    {
                        System.out.print("Name: ");
                        String name = sc.next();
                        sc.nextLine();
                        System.out.print("Price: ");
                        Double price = sc.nextDouble();
                        list.add(new Product(name, price));
                        break;
                    }
                case 'u':
                    {
                        System.out.print("Name: ");
                        String name = sc.next();
                        sc.nextLine();
                        System.out.print("Price: ");
                        Double price = sc.nextDouble();
                        System.out.print("Manufacture data (DD/MM/yyyy)");
                        Date data = sdf.parse(sc.next());
                        list.add(new UsedProduct(data, name, price));
                        break;
                    }
                default:
                    {
                        System.out.print("Name: ");
                        String name = sc.next();
                        sc.nextLine();
                        System.out.print("Price: ");
                        Double price = sc.nextDouble();
                        System.out.print("Customs fee: ");
                        double fee = sc.nextDouble();
                        list.add(new ImportedProduct(fee, name, price));
                        break;
                    }
            }
            

                
            
}
        
            System.out.println();
            System.out.println("PRICE TAGS: ");
            for(Product product : list){
            System.out.println(product.priceTag());
            }
            
}
}
