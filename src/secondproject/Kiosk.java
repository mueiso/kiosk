package secondproject;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Kiosk {

    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();

    // 키오스크 시작 메서드
    public void start() {
        System.out.println("키오스크를 시작합니다.");
        System.out.println();
    }

    // 카테고리 배열로 관리
    private final String[] Categories = {"버거 메뉴", "음료 메뉴"};

    // 각 카테고리의 Menu 객체 생성
    Menu burgerMenu = new Menu("버거 메뉴");
    Menu drinkMenu = new Menu("음료 메뉴");

    // 현재 선택된 카테고리 추적(burgerMenu 또는 drinkMenu)
    public Menu selectedCategory;
    // 현재 선택된 메뉴 추적
    public MenuItem selectedMenu;

    int choice;

    // 사용자에게 카테고리 번호를 입력받는 메서드
    public void getUserCategoryChoice() {

        while (true) {
            System.out.println("[[ Lotteria Menu ]]");
            System.out.println();
            System.out.println("[ 카테고리 ]");

            // 카테고리 선택지 출력
            for (int i = 0; i < Categories.length; i++) {
                System.out.println("[ " + (i + 1) + ". " + Categories[i] + " ]");
            }

            System.out.println("[ 0. 종료 ]");
            System.out.println();

            System.out.println("[ ORDER MENU ]");
            System.out.println("[ 4. Orders ]  |  장바구니를 확인 후 주문합니다.");
            System.out.println("[ 5. Cancle ]  |  진행중인 주문을 취소합니다.");


            System.out.println("원하는 카테고리의 번호를 입력해주세요: ");

            try {
                choice = Integer.parseInt(input);

                if (choice == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                }
                if (choice >= 1 && choice <= Categories.length) {
                    // 카테고리 선택 후 해당 카테고리 출력하는 연산 로직
                    // 상황 연산자(? :) → (조건) ? 조건이 참일 때 실행할 코드 : 조건이 거짓일 때 실행할 코드
                    selectedCategory = (choice == 1) ? burgerMenu : drinkMenu;
                    // choice가 1이면 참 → 버거메뉴 출력, 2면 거짓 → 음료 메뉴 출력

                    // 선택된 카테고리의 메뉴로 이동
                    getUserChoice();
                    break;  // 선택이 완료되면 반복문 종료
                }
                if (choice == 4) {
                    printShoppingCart();
                } else {
                    System.out.println("▶ 유효하지 않은 번호입니다. 선택지 중에서 번호를 골라 입력해주세요 ◀");
                    System.out.println();
                }
            } catch (NumberFormatException a) {
                System.out.println("▶ 잘못된 입력입니다. 숫자만 입력해주세요 ◀");
                System.out.println();
            }
        }
    }

    // 사용자에게 메뉴 번호 입력 받는 메서드
    public int getUserChoice() {

        while (true) {

            // 선택된 카테고리 출력
            selectedCategory.printMenuItem();

            // 번호 입력 받기
            System.out.println();
            System.out.println("원하는 제품의 번호를 입력해주세요 (0을 입력하면 뒤로가기): ");

            try {
                // 입력 받은 (문자 형태)숫자를 숫자로 인식하기 위해 형 변환
                choice = Integer.parseInt(input);

                // 0 입력시 뒤로가기
                if (choice == 0) {
                    System.out.println("▶ 카테고리 선택으로 돌아갑니다 ◀");
                    System.out.println();
                    getUserCategoryChoice();
                    break;
                }

                if (choice > 0 && choice <= selectedCategory.MenuSize()) {
                    // 선택된 메뉴 항목을 selectedMenu에 할당
                    selectedMenu = selectedCategory.getMenuItems().get(choice - 1);  // 0부터 시작하기 때문에 -1
                    shoppingCart(selectedMenu);
                    break;
                } else {  // 메뉴 번호가 유효한지 확인
                    System.out.println("▶ 유효하지 않은 번호입니다. 선택지 중에서 번호를 골라 입력해주세요 ◀");
                    System.out.println();
                }

            } catch (NumberFormatException a) {
                System.out.println("▶ 잘못된 입력입니다. 숫자만 입력해주세요 ◀");
            }
        }
        return choice;
    }

    // 선택한 메뉴 상세정보 출력하는 메서드
    public void printSelectedMenu() {
        System.out.println("선택한 메뉴는 다음과 같습니다:");
        System.out.println();
        System.out.println("| 메뉴명 : " + selectedMenu.getName() + " |");
        System.out.println("| 가격 : " + selectedMenu.getPrice() + " |");
        System.out.println("| 상세정보 : " + selectedMenu.getDescription() + " |");
        System.out.println();
    }

    // 장바구니 담을 리스트 생성
    public List<MenuItem> orders = new ArrayList<>();

    // 장바구니 메서드
    public void shoppingCart(MenuItem selectedMenu) {

        while (true) {

            // 선택한 메뉴 상세정보 출력하는 메서드호출
            printSelectedMenu();

            // 장바구니에 담을지 물어보는 로직
            System.out.println("장바구니에 담으시겠습니싸? (추가 / 취소): ");
            String addToCart = sc.nextLine();

            if (addToCart.equals("추가")) {
                orders.add(selectedMenu);
                System.out.println(selectedMenu.getName() + " 가 장바구니에 추가되었습니다.");
                System.out.println();
                printShoppingCart();
                break;
            } else if (addToCart.equals("취소")) {
                System.out.println("▶ 취소되었습니다 ◀");
                System.out.println();
                getUserChoice();
                break;
            } else {
                System.out.println("▶ 잘못된 입력입니다. '추가' 또는 '취소'를 입력하세요 ◀");
                System.out.println();
            }
        }
    }

    // 장바구니 담긴 목록 총 금액 계산해서 출력하는 메서드
    public void printShoppingCart() {

        if (orders.isEmpty()) {
            System.out.println("▶ 장바구니에 아무것도 없습니다. 먼저 메뉴를 선택해주세요 ◀");
            return;
        }
        System.out.println("[ Orders ]");

        double totalPrice = 0;

        // ':' 향상된 for문 (shoppingCart에서 MenuItem 타입의 요소들을 하나씩 써내서 item에 담고 반복)
        for (MenuItem item : orders) {
            System.out.println(item.getName() + " | " + item.getPrice() + " | " + item.getDescription());
            totalPrice += item.getPrice();
        }

        System.out.println("총 금액: " + totalPrice);
        System.out.println("주문하시겠습니까? (주문하기 / 취소): ");
        String order = sc.nextLine();

        if (order.equals("주문하기")) {
            System.out.println("주문이 완료되었습니다. 감사합니다.");
            orders.clear();  // 장바구니 초기화
        } else {
            System.out.println("주문이 취소되었습니다.");
        }
    }


}

// ================= To do List =================

// 프로그램 순서 및 흐름 제어를 담당하는 클래스
// 키오스크 실행 시 콘솔에 햄버거 메뉴 (with 선택번호) 출력, 종료 (with 선택번호) 함께 출력
// 사용자에게 숫자를 입력 받아 메뉴를 선택, 0을 입력하면 프로그램 종료
// 예외처리는 오류메시지 출력

// Menu가 가진 List<MenuItem>을 반복문을 활용하여 햄버거 메뉴 출력

// 주문할 메뉴 숫자 입력 받기
// 입력 받은 숫자가 올바르다면 인덱스로 활용해서 Menu가 가지고 있는 List<MenuItem>에 접근하기
// menu.getMenuItems().get(i); 같은 형식으로 하나씩 들어가서 얻어오기

// 장바구니: 메뉴를 선택/입력 시 장바구니에 추가할 지 물어보고, 입력값에 따라 추가/취소 처리, 메뉴는 한 번에 1개만 담기
// 장바구니에 담긴 모든 항목 출력, 합산하여 총 금액을 계산하고, “주문하기”를 누르면 장바구니를 초기화, ⭐장바구니 목록 수량도 출력
