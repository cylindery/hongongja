package sec03.exam02;   //Scanner로 입력된 문자열 얻기

import java.util.*;

public class ProductStorage {
    private List<Product> list = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private int counter = 0;

    public void showMenu() {
        while(true) {
            System.out.println("-----------------------------------");
            System.out.println("1.등록  |  2.목록  |  3.종료");
            System.out.println("-----------------------------------");
            System.out.print("선택: ");
            String choice = scanner.nextLine();
            switch(choice) {
                case "1" : registerProduct(); break;
                case "2" : showProduct(); break;
                case "3" : return;
            }
        }
    }

    public void registerProduct() {
        try {
            Product product = new Product();
            product.setPno(++counter);

            System.out.print("상품명: ");
            product.setName(scanner.nextLine());

            System.out.print("가격: ");
            product.setPrice(Integer.parseInt(scanner.nextLine()));

            System.out.print("재고: ");
            product.setStock(Integer.parseInt(scanner.nextLine()));

            list.add(product);
        } catch (Exception e) {
            System.out.println("등록 에러: " + e.getMessage());
        }
    }

    public void showProduct() {
        for(Product p : list) {
            System.out.println(p.getPno() + "\t" + p.getName() + "\t" + p.getPrice() + "\t" + p.getStock());
        }
    }
}
