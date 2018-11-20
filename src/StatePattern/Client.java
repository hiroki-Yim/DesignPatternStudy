package StatePattern;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("음료의 갯수를 설정해 주세요");
        int setDrinkThings = scan.nextInt();
        System.out.println("음료의 가격을 설정해 주세요");
        int setDrinkPrice = scan.nextInt();
        VendingMachine machine = new VendingMachine(setDrinkThings, setDrinkPrice); // 1개 1000원 초기화
        // 생성자 의미 (재고량, 가격) 종류는 하나

        machine.insertMoney(1000);
        machine.insertMoney(500);
        machine.pushButton();
        machine.returnMoney();
        machine.insertMoney(1000);
        machine.pushButton();

        int num = scan.nextInt();
        int price = scan.nextInt();
        machine.pushButton();
        machine.setDrink(num, price);
        machine.insertMoney(1000);
        machine.pushButton();

    }
}
