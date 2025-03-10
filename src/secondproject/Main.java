package secondproject;

public class Main {
    public static void main(String[] args) {

        Kiosk kiosk = new Kiosk();

        // 키오스크 시작 메서드 호출
        kiosk.start();

        // 크기 계산한 메뉴 사이즈 호출하고 사용자 선택받기 메서드 호출하기
        System.out.println("[[ Lotteria Menu ]]");
        System.out.println();
        int totalMenuSize = kiosk.menuSize();
        int userChoice = kiosk.getUserChoice();
        System.out.println();






    }
}


// 시작 지점이 되는 클래스
// Main = User 라고 생각하기 (키오스크 시작하기, 카테고리 선택하기, 결제하기 등)

// Kiosk 객체 생성
// Kiosk 내 시작하는 함수 호출 -> 키오스크 프로그램을 시작하는 메서드 구현하고 -> start 함수 만들어서 관리