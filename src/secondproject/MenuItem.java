package secondproject;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {

    // 필드 선언
    private final String name;
    private final double price;
    private final String description;

    // 게터
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    // 메뉴 아이템을 생성할 때 생성하는 생성자
    // MenuItem 객체를 생성할 때 이름, 가격, 설명을 받아서 필드에 저장
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // 버거 항목을 리스트에 추가하는 메서드
    public static List<MenuItem> BurgerMenu() {  // 버거 메뉴 항목들을 생성하여 List<MenuItem> 형태로 반환
        List<MenuItem> Burgers = new ArrayList<>();  // 여러 가지 버거 메뉴를 생성하여 리스트에 추가

        Burgers.add(new MenuItem("Bulgogi Burger", 4.7, "마요네즈, 양파, 레터스, 불고기소스, 불고기패티가 토핑된 불고기버거"));
        Burgers.add(new MenuItem("Shrimp Burger", 4.7, "타르타르 소스, 새우 패티, 양상추, 사우전드 아일랜드 드레싱이 토핑된 새우버거"));
        Burgers.add(new MenuItem("Cheese Burger", 5.2, " 머스타드 소스, 마요네즈, 저민 양파, 저민 피클, 치즈, 쇠고기 패티가 토핑된 치즈버거"));
        Burgers.add(new MenuItem("Chicken Burger", 4.0, "닭다리살패티, 데리야키소스, 양상추, 마요네즈, 머스타드가 토핑된 치킨버거"));
        Burgers.add(new MenuItem("Hanwoo Bulgogi Burger", 8.6, "마요네즈, 양파, 레터스, 불고기소스, 한우패티로 구성된 한우불고기버거"));

        return Burgers;  // 위에서 추가한 메뉴들을 리스트에 반환
    }

    // 음료 항목을 리스트에 추가하는 메서드
    public static List<MenuItem> DrinkMenu() {
        List<MenuItem> Drinks = new ArrayList<>();

        Drinks.add(new MenuItem("Pepsi Cola", 2.0, "콜라"));
        Drinks.add(new MenuItem("Pepsi Cola Zero Sugar", 2.0, "제로 콜라"));
        Drinks.add(new MenuItem("Chilsung Cider", 1.7, "사이다"));
        Drinks.add(new MenuItem("Cafe Americano", 2.5, "아메리카노"));
        Drinks.add(new MenuItem("Lemonade", 2.7, "레몬에이드"));

        return Drinks;
    }
}

// ================= To do List =================

// 세부 메뉴 속성 가지는 클래스
// List를 선언하여 여러 메뉴 추가 -> List<MenuItem> menuItems = new ArrayList<>();

// 이름, 가격, 설명 필드 선언하여 관리

// 구조에 맞게 함수를 선언해놓고 가져다 사용

// ================= 수정 과정에서 뺀 메서드 =================

// 세터
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }

// =======================================================