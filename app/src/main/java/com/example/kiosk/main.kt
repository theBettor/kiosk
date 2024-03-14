package com.example.kiosk

// main -> Kiosk Class -> Korean Class 순으로 코드 작성 이유를 주석으로 남기고자 함.
fun main() {
    var kiosk = Kiosk()
    var a = Korean.CursingGMGukbap()
    var b = Korean.TwoSunnySideup()
    var c = Chinese.LambSkewersAndBeer()
    var d = Chinese.UhanStreetFoodTour()
    var e = Japanese.GMMGOmelet()
    var f = Japanese.SquidFishingBoatTour()



    while (true) {
        kiosk.greet() // 환영 멘트
        val nationSelect = readln().toInt()
        if (nationSelect == 0) {
            println("메인 화면으로")
            break // 프로그램 종료
        }

        when (nationSelect) { // 한식을 먹고자해서 1번을 고르면, 한식 메뉴를 안내 해준다.
            1 -> {
                kiosk.koreanMenuList()
            }

            2 -> {
                kiosk.chineseMenuList()
            }

            3 -> {
                kiosk.japaneseMenuList()
            }
        }

        println("원하시는 식사류의 음식을 선택하여 주십시오.")
        val detailsSelect = readln().toInt()
        if (detailsSelect == 0) {
            continue // 메뉴를 선택해야 하는 순간에, 다른 식사류로 바꾸고 싶다면 0으로 뒤로 갈 수 있게 구현
        }
        kiosk.displayInfo(a, b, c, d, e, f, nationSelect, detailsSelect) // Kiosk 클래스의 메서드를 통해 주문이 완료 되었음을 표시
        break
    }
}

// 여기까지는 만족! 다음은 Kiosk Class로 이동.
