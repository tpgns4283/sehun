import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MainMenu mainMenu = new MainMenu();
        BurgerMenu burgerMenu = new BurgerMenu();
        Order order = new Order();

        boolean flag = false;

        while (true) {
            mainMenu.setMainMenu();

            System.out.print("원하시는 메뉴 번호를 입력해주세요 :");
            String menuNum = sc.nextLine();

            switch (menuNum) {
                case "1":
                    burgerMenu.burgerMenu();
                    burgerMenu.order();
                    break;
                case "2", "3", "4":
                    System.out.println("아직 구현 안했습니다 ㅜ");
                case "5":
                    order.orderCart();
                    break;
                case "6":
                    order.cancel();
                    break;
                case  "7":
                    System.out.println("시스템을 종료합니다.");
                    flag = true;
                    break;
                default:
                    System.out.println("올바른 번호를 입력해주세요.");
            }

            if (flag == true) {
                break;
            }
        }
    }
}