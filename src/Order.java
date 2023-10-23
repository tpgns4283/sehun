import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order extends Burger{
    Scanner sc = new Scanner(System.in);
    List<String> cartName = new ArrayList<String>();
    List<String> cartAbout = new ArrayList<String>();
    List<Double> cartPrice = new ArrayList<Double>();

    void addCart(int i){
        System.out.println(burgerName[i-1]+"|"+burgerAbout[i-1]+"|"+burgerPrice[i-1]);
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인");
        System.out.println("2. 취소");

        boolean flag = false;

        while (true) {
            String orderNum = sc.nextLine();

            switch (orderNum) {
                case "1":
                    yes(i);
                    System.out.println(cartName);
                    flag = true;
                    break;1
                case "2":
                    System.out.println("장바구니에 추가되지 않았습니다.");
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

    void yes(int i){
        cartName.add(burgerName[i-1]);
        cartAbout.add(burgerAbout[i-1]);
        cartPrice.add(burgerPrice[i-1]);

        System.out.println(burgerName[i-1] + "가 장바구니에 추가되었습니다");
    }

    void orderCart(){
        int sum = 0;

        System.out.println("아래와 같이 주문하시겠습니까?");
        System.out.println("[Orders]");

        for(int i = 0; i<cartName.size(); i++){
            System.out.println(cartName.get(i) + "|" + cartAbout.get(i) + "|" + cartPrice.get(i));
        }

        System.out.println("[ Total ]");

        for (int i=0; i<cartPrice.size(); i++) {
            sum += cartPrice.get(i);
        }

        System.out.println(sum+"\n");
        System.out.println("1. 주문");
        System.out.println("2. 메뉴판");

        boolean flag = false;

            while (true) {
                String cartNum = sc.nextLine();

                switch (cartNum) {
                    case "1":
                        waiting();
                        flag = true;
                        break;
                    case "2":
                        cancel();
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

    void waiting(){
        System.out.println("주문이 완료되었습니다\n");
        System.out.println("대기번호는 1번 입니다.");
        System.out.println("3초후 메뉴판으로 이동합니다");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        cartName.clear();
        cartAbout.clear();
        cartPrice.clear();
    }

    void cancel(){
        cartName.clear();
        cartAbout.clear();
        cartPrice.clear();
        System.out.println("주문이 취소되었습니다.");
    }
}
