package secondproject;

public class Main {
    public static void main(String[] args) {

        Kiosk kiosk = new Kiosk();

        // 키오스크 시작 메서드 호출
        kiosk.start();

        // 카테고리 선택 메서드 호출
        kiosk.getUserCategoryChoice();

        // 메뉴 선택 메서드 호출
        kiosk.getUserChoice();
        System.out.println();

        // 장바구니 출력 메서드 호출
        kiosk.printShoppingCart();

    }
}

// ================= To do List =======================

// 시작 지점이 되는 클래스
// Main = User 라고 생각하기 (키오스크 시작하기, 카테고리 선택하기, 결제하기 등)

// Kiosk 객체 생성
// Kiosk 내 시작하는 함수 호출 -> 키오스크 프로그램을 시작하는 메서드 구현하고 -> start 함수 만들어서 관리

// 구현할 것등 : 장바구니, 구매하기(결제하기)
