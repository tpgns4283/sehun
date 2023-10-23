import java.util.Scanner;

public class BurgerMenu extends Burger{

    void burgerMenu(){
        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n");
        System.out.println("[ Burgers MENU ]");

        for(int i=0; i<4; i++){
            System.out.println((i+1)+burgerName[i] + "|" + burgerAbout[i] + "|" + burgerPrice[i]);
        }
    }

     void order(){
        Order order = new Order();
        Scanner sc = new Scanner(System.in);

        boolean flag = false;

        while (true) {
            System.out.print("원하시는 메뉴 번호를 입력해주세요 :");
            String burgerNum = sc.nextLine();

            switch (burgerNum) {
                case "1", "2", "3", "4":
                    order.addCart(Integer.parseInt(burgerNum));
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
