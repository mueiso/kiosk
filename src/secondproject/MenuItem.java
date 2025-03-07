package secondproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuItem {

    private String name;
    private double price;
    private String description;

    //메뉴 아이템을 생성할 때 생성하는 생성자
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // 각 속성에 대한 getter 메서드
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }

    // 메뉴마다 항목 추가 메서드
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 메뉴 항목을 담을 리스트 생성
        List<MenuItem> menuItems = new ArrayList<>();

        // 메뉴 항목을 리스트에 추가
        menuItems.add(new MenuItem("Bulgogi Burger", 4.7, "마요네즈, 양파, 레터스, 불고기소스, 불고기패티가 토핑된 불고기버거"));
        menuItems.add(new MenuItem("Shrimp Burger", 4.7, "타르타르 소스, 새우 패티, 양상추, 사우전드 아일랜드 드레싱이 토핑된 새우버거"));
        menuItems.add(new MenuItem("Cheese Burger", 5.2, " 머스타드 소스, 마요네즈, 저민 양파, 저민 피클, 치즈, 쇠고기 패티가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Chicken Burger", 4.0, "닭다리살패티, 데리야키소스, 양상추, 마요네즈, 머스타드가 토핑된 치킨버거"));
        menuItems.add(new MenuItem("Hanwoo Bulgogi Burger", 8.6, "마요네즈, 양파, 레터스, 불고기소스, 한우패티로 구성된 한우불고기버거"));


        // 메뉴 출력
        System.out.println("[ Lotteria Menu ]");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i + 1) + ". " + menuItems.get(i).getName() + " | " + menuItems.get(i).getPrice() + " | " + menuItems.get(i).getDescription());
        }
    }

    // 사용자로부터 메뉴 입력받는 메서드
    public int getUserChoice(Scanner sc, int menuSize) {
        int choice;
        while(true) {
            System.out.println("원하는 제품의 번호를 입력해주세요");
        }
    }




}


// 세부 메뉴 속성 가지는 클래스
// 예) 햄버거 이름, 설명, 가격
// List를 선언하여 여러 메뉴 추가 -> List<MenuItem> menuItems = new ArrayList<>();

// new MenuItem("Bulgogi Burger", 4.7, "마요네즈, 양파, 레터스, 불고기소스, 불고기패티가 토핑된 불고기버거")
// new MenuItem("Shrimp Burger", 4.7, "타르타르 소스, 새우 패티, 양상추, 사우전드 아일랜드 드레싱이 토핑된 새우버거")
// new MenuItem("Cheese Burger", 5.2, " 머스타드 소스, 마요네즈, 저민 양파, 저민 피클, 치즈, 쇠고기 패티가 토핑된 치즈버거")
// new MenuItem("Chicken Burger", 4.0, "닭다리살패티, 데리야키소스, 양상추, 마요네즈, 머스타드가 토핑된 치킨버거")
// new MenuItem("Hanwoo Bulgogi Burger", 8.6, "마요네즈, 양파, 레터스, 불고기소스, 한우패티로 구성된 한우불고기버거")