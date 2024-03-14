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
    fun displayInfo(a: Korean.CursingGMGukbap, b: Korean.TwoSunnySideup, c: Chinese.LambSkewersAndBeer, d: Chinese.UhanStreetFoodTour,e: Japanese.GMMGOmelet, f: Japanese.SquidFishingBoatTour, nationSelect: Int, detailsSelect: Int) { // 한중일 클래스의 프로퍼티들을 다 여기서 받아가지고 main에서 쓸 수 있게끔 하는 함수를 만들었다. 이게 내가 제일 구현하고 싶었던 기능
        // 한중일을 골라야 하는 중에 한식을 골랐는데 그 중에 1번 음식을 골랐다면, 한식 클래스의 프로퍼티 중 배열의 0번째 인덱스 값을 출력하는 코드를 작성
        if (nationSelect == 1) {
            if (detailsSelect == 1) {
                println(a.gukbap) // 무지성으로 계속 korean으로만 상속하려고 했는데 국밥은 컬싱 클래스 안에 있는거라 Korean.CursingGMGukbap 클래스를 상속해야한다.
            } else if (detailsSelect == 2) {
                println(b.ssu)
            } else if (detailsSelect == 0) {
                println("뒤로 가기")
            }
        } else if (nationSelect == 2) {
            if (detailsSelect == 1) {
                println(c.lsab)
            } else if (detailsSelect == 2) {
                println(d.usft)
            } else if (detailsSelect == 0) {
                println("뒤로 가기")
            }
        } else if (nationSelect == 3) {
            if (detailsSelect == 1) {
                println(e.omlet)
            } else if (detailsSelect == 2) {
                println(f.sfbt)
            } else if (detailsSelect == 0) {
                println("뒤로 가기")
            }
        }
    }

}

public class Korean : Kiosk() { // 프로퍼티와 메소드를 만들라고 했다.(Ex. name, price, displayinfo)

//    val koreanMenuName =
//    val chineseMenuName =
//    val japaneseMenuName =
        // 이미 위의 displayinfo라는 메소드를 쓰고 있었고, 하위 클래스의 배열 프로퍼티를 쓰고 있어서 koreanMenuName은 배열값을 담은 상수였는데
        // 지금은 아래 국밥 변수처럼 변수를 사용하기 때문에 주석처리하였다. 나중에 구현 시도해보면 좋을것 같아서 남겨 놓음.
    open class CursingGMGukbap { // 여기에 원래 클래스 명 옆에 Korean()을 상속 받게 하려고 했는데 빨간줄 떠서 뭔가 고민하다가 당연히 내부 클래스로 만들고 있으니 또 선언해줄 필요 없다고 생각하게됨.
        val gukbap = "[욕쟁이 할머니 국밥] 주문이 완료 되었습니다."
        var price: Int = 0 // 아직 구현 안함, 우선순위 중에 당장 급한건 아닌 것 같아서
    }
    class TwoSunnySideup {
        val ssu: String = "[계란 후라이 2개] 주문이 완료 되었습니다."
    }
}

public class Chinese {
    class LambSkewersAndBeer {
        val lsab = "[양꼬치와 칭따오 꼬탄주] 주문이 완료 되었습니다."
    }
    class UhanStreetFoodTour {
        val usft = "[우한 길거리 음식 투어] 주문이 완료 되었습니다."
    }
}

public class Japanese : Kiosk() { // 프로퍼티와 메소 ex. name, price, displayinfo
    class GMMGOmelet {
        val omlet = "[경영 메이드의 모에모에 뀽 오믈렛] 주문이 완료 되었습니다."
    }
    class SquidFishingBoatTour {
        val sfbt = "[대마도 오징어잡이 배 체험] 주문이 완료 되었습니다."
    }
}



