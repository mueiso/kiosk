package secondproject;

import java.util.List;

public class Menu {

    public String name;

    // 메뉴 항목 저장할 리스트
    private List<MenuItem> menuItems;  // 객체들의 리스트 (각 카테고리의 메뉴 항목들을 저장)

    // 게터
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    // 생성자 (메뉴 항목 받아서 각 카테고리의 메뉴 항목 초기화)
    public Menu(String name) {  // 메뉴 객체 생성할 때 카테고리 이름 받아오기
        this.name = name;

        // 메뉴 항목 리스트 불러오기
        if (name.equals("버거 메뉴")) {
            this.menuItems = MenuItem.BurgerMenu();
        } else if (name.equals("음료 메뉴")) {
            this.menuItems = MenuItem.DrinkMenu();
        }
    }

    // 메뉴 항목 출력 메서드
    public void printMenuItem() {
        System.out.println("[ " + name + " ]");
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem items = menuItems.get(i);
            System.out.println((i + 1) + ". " + items.getName() + " | " + items.getPrice() + " | " + items.getDescription());
        }
    }

    // 메뉴 크기 계산 메서드
    // 해당 메뉴의 항목 개수를 반환하기 위해
    public int MenuSize() {
        return menuItems.size();
    }
}

// ================= To do List =================

// MenuItem 클래스를 관리하는 클래스
// 카테고리 이름 필드 추가 -> 버거 메뉴, 음료 메뉴, 디저트 메뉴 등 각 카테고리 내에 여러 MenuItem 을 포함

// MenuItem 클래스를 List 로 관리
// Menu 객체 생성하면서 카테고리 이름 설정 (버거, 음료, 디저트 등등)
// List 에 포함된 MenuItem 을 순차적으로 보여주는 함수
// 구조에 맞게 함수를 선언해놓고 가져다 사용
