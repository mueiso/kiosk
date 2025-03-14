# kiosk 프로젝트

JDK version 17

## 목적

**간단한 키오스크 기능 구현하기**

키오스크가 시작되고, 메뉴가 출력되면 사용자가 메뉴를 골라 장바구니에 담을 수 있고, 장바구니에서 주문하기를 통해 결제하거나, 혹은 제품을 뺄 수도 있는 키오스크 기능을 구현해보려고 했다.

## 주요 기능

크게 `Main`, `Kiosk`, `Menu`, `MenuItem` 클래스로 분류하여 각 클래스가 각기 다른 기능을 담당하도록 했다

**선택지 : 사용자가 가장 먼저 접하는 것은 카테고리 옵션 - 롯데리아의 `버거메뉴`, `음료메뉴` 카테고리를 선택하거나, 장바구니로 바로 갈 수 있는 `Oreders` 또한 카테고리에 함께 출력되며, 0번을 입력시 언제든 선택지로 이동하거나, (가장 상위 옵션에서 0 입력시)프로그램을 종료할 수 있다.**

**장바구니 : 제품을 장바구니에 담을 수 있고, 잠바구니에 담긴 제품들의 총 금액이 출력된다. 사용자는 이를 통해 제품을 주문할 수도 있고, 제품을 뺄 수도 있다.**
