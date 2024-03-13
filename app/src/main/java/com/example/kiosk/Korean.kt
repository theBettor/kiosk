package com.example.kiosk

// nationSelect에서 한식을 선택했을 경우 여기서 무엇을 할 수 있을까?
// Kiosk에서는 안내 메시지를 주고
// Koean 클래스에서는 상세 정보를 Kiosk에게 줄 수 있게끔하면 되겠다.

// 1번을 통해 한식을 고르면
class Korean : Kiosk() { // 프로퍼티와 메소 ex. name, price, displayinfo

    val menuName = arrayOf("욕쟁이 할머니 국밥", "계란 후라이 2개", "뒤로 가기")
    var price: Int = 0

    fun displayInfo(detailsSelect: Int) {
//        if (detailsSelect == 1) {
//            println("주문하신 음식은 ${menuName[0]} 입니다.")
//        } else if (detailsSelect == 2) {
//            println("주문하신 음식은 ${menuName[1]} 입니다.")
//        } else if (detailsSelect == 3) {
//            println("주문하신 음식은 ${menuName[2]} 입니다.")
//        }
        println("주문하신 음식은 ${menuName[detailsSelect - 1]} 입니다.")
    }
}

//// 문자열 배열
//val colors = arrayOf("Red", "Green", "Blue")
//println("문자열 배열: ${colors.joinToString()}")

// run mainkit을 하면 readline으로 입력받기 이전에, 입력을 요구하는 메시지를 출력하도록 했다.
// 한식, 중식, 일식 중 고르라는 메시지였는데, 예를들어 한식을 고르게 되면 메뉴를 표시하는 출력과 동시에 새로운 입력을 받고 이후에
// while문을 끝내거나 다시 반복하는 코드까지 구현을 해놓았는데
// 한식 중식 일식을 고르기 위한 첫 입력을 한 이후 입력한 값이, korean class에 가고,
// korean class는 받은 입력 값을

