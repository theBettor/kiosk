package com.example.kiosk

open class Kiosk {

    // 원래 여기에
//    var koreanKiosk = Korean()
    // 이런식으로 한중일식 클래스들을 객체화? 했는데, 자식 클래스에서는 부모 클랙스를 이미 상복 받고 있는데 부모 클래스 내에서 자식 클래스를 상속 받는 양방향 상속(?) 같은 상황 때문에 에러가 떠서 다 빼고 main에만 객체화(?)를 하고 있다.

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
//    fun displayInfo(detailsSelect: Int) {
////        if (detailsSelect == 1) {
////            println("주문하신 음식은 ${menuName[0]} 입니다.")
////        } else if (detailsSelect == 2) {
////            println("주문하신 음식은 ${menuName[1]} 입니다.")
////        } else if (detailsSelect == 3) {
////            println("주문하신 음식은 ${menuName[2]} 입니다.")
////        }
//        println("${menuName[detailsSelect - 1]} 주문이 완료 되었습니다.")
//    }

    // 위에 주석처리된 코드는 원래 Korean 클래스에 있던 것인데 지우기 아까워서 남겨두었음. 지금은 무용지물
    fun displayInfo(koreanKiosk: Korean, chineseKiosk: Chinese, japaneseKiosk: Japanese, nationSelect: Int, detailsSelect: Int) { // 한중일 클래스의 프로퍼티들을 다 여기서 받아가지고 main에서 쓸 수 있게끔 하는 함수를 만들었다. 이게 내가 제일 구현하고 싶었던 기능
        // 한중일을 골라야 하는 중에 한식을 골랐는데 그 중에 1번 음식을 골랐다면, 한식 클래스의 프로퍼티 중 배열의 0번째 인덱스 값을 출력하는 코드를 작성
        if (nationSelect == 1) {
            if (detailsSelect == 1) {
                println(koreanKiosk.koreanMenuName[0])
            } else if (detailsSelect == 2) {
                println(koreanKiosk.koreanMenuName[1])
            } else if (detailsSelect == 0) {
                println(koreanKiosk.koreanMenuName[2])
            }
        } else if (nationSelect == 2) {
            if (detailsSelect == 1) {
                println(chineseKiosk.chineseMenuName[0])
            } else if (detailsSelect == 2) {
                println(chineseKiosk.chineseMenuName[1])
            } else if (detailsSelect == 0) {
                println(chineseKiosk.chineseMenuName[2])
            }
        } else if (nationSelect == 3) {
            if (detailsSelect == 1) {
                println(japaneseKiosk.japaneseMenuName[0])
            } else if (detailsSelect == 2) {
                println(japaneseKiosk.japaneseMenuName[1])
            } else if (detailsSelect == 0) {
                println(japaneseKiosk.japaneseMenuName[2])
            }
        }
    }
}

// 여기까지도 의도대로 완성, 다음 Korean Class로 이동