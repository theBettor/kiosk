package com.example.kiosk

open class Kiosk {


    fun greet() {
        println("이경영 배우님의 경영식당에 오신 것을 환영합니다. 원하시는 메뉴를 선택하여 주십시오.\n[1] 한식, [2] 중식, [3] 일식, [0] 종료")
    }

    fun koreanMenuList() {
        println("[1] 욕쟁이 할머니 국밥, [2] 계란 후라이 2개, [0] 뒤로 가기")
    }

    fun chineseMenuList() {
        println("[1] 양꼬치와 칭따오 꼬탄주, [2] 우한 길거리 음식 투어, [0] 뒤로 가기")
    }

    fun japaneseMenuList() {
        println("[1] 경영 메이드의 모에모에 뀽 오믈렛, [2] 대마도 오징어잡이 배 체험, [0] 뒤로 가기")
    }
}