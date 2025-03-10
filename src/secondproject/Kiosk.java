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

    // 각 카테고리 초기화
    Menu burgerMenu = new Menu("버거 메뉴");
    Menu drinkMenu = new Menu("음료 메뉴");

    // 사용자에게 메뉴 번호를 입력받는 메서드
    public int getUserChoice() {
        int choice;

        while (true) {
            // 메뉴 보여주기
            burgerMenu.printMenuItem();
            System.out.println();
            drinkMenu.printMenuItem();

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
                    break;
                }

                // 메뉴 번호가 유효한지 확인
                if (choice > 0 && choice <= menuSize()) {
                    return choice;
                } else {
                    System.out.println("유효하지 않은 번호입니다. 1 ~ " + menuSize() + " 사이의 번호만 입력해주세요.");
                }

            } catch (NumberFormatException a) {
                System.out.println("잘못된 입력입니다. 숫자만 입력해주세요.");
            }
        }
        return choice;
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

// 추후에 카테고리도 한번에 같이 출력하지 않고, 카테고리 선택하여 출력하기