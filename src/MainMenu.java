public class MainMenu {
    void setMainMenu(){

        String[] MainMenu = new String[]{"1. Burgers         | ",
                "2. Forzen Custard  | ",
                "3. Drinks          | ",
                "4. Beer            | "};

        String[] AboutMenu = new String[]{"앵거스 비프 통살을 다져만든 버거",
                "매장에서 신선하게 만드는 아이스크림",
                "매장에서 직접 만드는 음료",
                "뉴욕 브루클린 브루어리에서 양조한 맥주"};

        System.out.println("SHAKESHACK BURGER에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요." + "\n");
        System.out.println("[ SHAKESHACK MENU ]");

        for (int i = 0; i < MainMenu.length; i++) {
            System.out.println(MainMenu[i] + AboutMenu[i]);
        }

        System.out.println("\n" + "[ ORDER MENU ]");
        System.out.println("5. Order       | 장바구니를 확인 후 주문합니다.");
        System.out.println("6. Cancel      | 진행중인 주문을 취소합니다.");
        System.out.println("7. Exit        | 시스템을 종료합니다.");
    }

}
