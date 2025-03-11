package secondproject;

import java.util.Scanner;

public class Kiosk {

    Scanner sc = new Scanner(System.in);

    // 키오스크 시작 메서드
    public void start() {
        System.out.println("키오스크를 시작합니다.");
        System.out.println();
    }

    // 메뉴 크기 메서드
    public int menuSize() {
        return Menu.TotalMenuSize(burgerMenu, drinkMenu);
    }

    // 카테고리 배열로 관리
    private final String[] Categories = {"버거 메뉴", "음료 메뉴"};

    // 각 카테고리의 Menu 객체 생성
    Menu burgerMenu = new Menu("버거 메뉴");
    Menu drinkMenu = new Menu("음료 메뉴");

    // 사용자에게 카테고리 번호를 입력받는 메서드
    public int getUserCategoryChoice() {
        int choice;

        while (true) {
            System.out.println("[[ Lotteria Menu ]]");
            System.out.println();
            System.out.println("[ 카테고리 ]");

            // 카테고리 선택지 출력
            for (int i = 0; i < Categories.length; i++) {
                System.out.println("[ " + (i + 1) + ". " + Categories[i] + " ]");
            }

            System.out.println("[ 0. 종료 ]");
            System.out.println("원하는 카테고리의 번호를 입력해주세요: ");
            String input = sc.nextLine();

            try {
                choice = Integer.parseInt(input);

                if (choice == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                }
                if (choice >= 1 && choice <= Categories.length) {
                    // 카테고리 선택 후 해당 카테고리 출력하는 연산 로직
                    // 상황 연산자(? :) → (조건) ? 조건이 참일 때 실행할 코드 : 조건이 거짓일 때 실행할 코드
                    Menu SelectedCategory = (choice == 1) ? burgerMenu : drinkMenu;
                    // choice가 1이면 참 → 버거메뉴 출력, 2면 거짓 → 음료 메뉴 출력

                    // 선택된 카테고리 출력
                    SelectedCategory.printMenuItem();
                    break;  // 선택이 완료되면 반복문 종료
                } else {
                    System.out.println("유효하지 않은 번호입니다. 선택지에 있는 번호를 입력해주세요.");
                    System.out.println();
                }
            } catch (NumberFormatException a) {
                System.out.println("잘못된 입력입니다. 숫자만 입력해주세요.");
                System.out.println();
            }
        } return -1;
    }

    // 메뉴 항목 배열로 관리
//    private final String[] MenuDetails = {"버거 메뉴", "음료 메뉴"};
//
//    // 각 카테고리의 Menu 객체 생성
//    Menu burgerMenuDetail = new Menu("버거 메뉴");
//    Menu drinkMenuDetail = new Menu("음료 메뉴");

    // 사용자에게 메뉴 번호를 입력받는 메서드
    public int getUserChoice() {
        int choice;

        while (true) {
            // 번호 입력 받기
            System.out.println();
            System.out.println("원하는 제품의 번호를 입력해주세요 (0을 입력하면 종료): ");
            String input = sc.nextLine();

            try {
                // 입력 받은 (문자 형태)숫자를 숫자로 인식하기 위해 형 변환
                choice = Integer.parseInt(input);

                // 0 입력시 종료
                if (choice == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);

                    if (choice > 0 && choice <= menuSize()) {
                        // 선택된 제품 출력하는 연산 로직
                        MenuItem selectedMenu = burgerMenu.getMenuItems().get(choice - 1);
                        printSelectedMenu(selectedMenu);
                    } else {
                        MenuItem selectedMenu = drinkMenu.getMenuItems().get(choice - burgerMenu.MenuSize() - 1);
                        printSelectedMenu(selectedMenu);
                    } break;

                    // 메뉴 번호가 유효한지 확인
                } else {
                    System.out.println("유효하지 않은 번호입니다. 1 ~ " + menuSize() + " 사이의 번호만 입력해주세요.");
                }

            } catch (NumberFormatException a) {
                System.out.println("잘못된 입력입니다. 숫자만 입력해주세요.");
            }
        }
    }

    // 선택한 메뉴를 출력하는 메서드
    public void printSelectedMenu(MenuItem selectedMenu) {
        System.out.println("선택한 메뉴는 다음과 같습니다:");
        System.out.println("메뉴명: " + selectedMenu.getName());
        System.out.println("가격: " + selectedMenu.getPrice());
        System.out.println("상세정보: " + selectedMenu.getDescription());
        System.out.println();
    }

}


// 프로그램 순서 및 흐름 제어를 담당하는 클래스
// 키오스크 실행 시 콘솔에 햄버거 메뉴 (with 선택번호) 출력, 종료 (with 선택번호) 함께 출력
// 사용자에게 숫자를 입력 받아 메뉴를 선택, 0을 입력하면 프로그램 종료
// 예외처리는 오류메시지 출력

// 스캐너 선언
// 반복문 시작

// List와 Menu 클래스 활용하여 상위 카테고리 메뉴 출력

// 카테고리 숫자 입력 받기

// 입력 받은 숫자가 올바르다면 인덱스로 활용하여 List에 접근하기
// List<Menu>에 인덱스로 접근하여 Menu만 추출할 수 있도록하기

// Menu가 가진 List<MenuItem>을 반복문을 활용하여 햄버거 메뉴 출력

// 주문할 메뉴 숫자 입력 받기
// 입력 받은 숫자가 올바르다면 인덱스로 활용해서 Menu가 가지고 있는 List<MenuItem>에 접근하기
// menu.getMenuItems().get(i); 같은 형식으로 하나씩 들어가서 얻어오기