package com.example.kiosk

//대분류의 메뉴를 번호로
//        해당하는 숫자 입력하면 세부 메뉴로
//        반복문을 이용해서 메뉴를 선택할 수 있게 유지하고 대분류 메뉴에서, 0번이 입력되면 프로그램 종료

fun main() {
    var kiosk = Kiosk()

    while (true) {
        println("이경영 배우님의 경영식당에 오신 것을 환영합니다. 원하시는 메뉴를 선택하여 주십시오.")
        println("[1] 한식, [2] 중식, [3] 일식, [0] 종료")
        val nationSelect = readln().toInt()
        if (nationSelect == 0) {
            println("메인 화면으로")
            break
        }

        when (nationSelect) {
            1 -> {
                println("[1] 욕쟁이 할머니 국밥, [2] 계란 후라이 2개, [0] 뒤로 가기")
            }

            2 -> {
                println("[1] 양꼬치와 칭따오 꼬탄주, [2] 우한 길거리 음식 투어, [0] 뒤로 가기")
            }

            3 -> {
                println("[1] 경영 메이드의 모에모에 뀽 오믈렛, [2] 대마도 오징어잡이 배 체험, [0] 뒤로 가기")
            }
        }

        println("원하시는 식사류의 음식을 선택하여 주십시오.")
        val detailsSelect = readln().toInt()
        if (detailsSelect == 0) {
            continue
        }
        kiosk.myOrder()
        break
    }
}

class Kiosk {
    fun myOrder(): String {
        var myorder_result = ""
        println("주문이 완료 되었습니다.")
        return myorder_result
    }
}