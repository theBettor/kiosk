package com.example.kiosk

// main -> Kiosk Class -> Korean Class 순으로 코드 작성 이유를 주석으로 남기고자 함.
fun main() {
    var kiosk = Kiosk()
    var food = Food()

    // 2. 객체화해서 리스트 안에 담아라
    val list = init() // 끝났음 touch xx
    // 3. 위의 list 상수를 이용해서


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
        kiosk.displayInfo(list[0], list[1], list[2], list[3], list[4], list[5], nationSelect, detailsSelect) // Kiosk 클래스의 메서드를 통해 주문이 완료 되었음을 표시
        break
    }
}

// 여기까지는 만족! 다음은 Kiosk Class로 이동.

// 1. 클래스 안에 init을 쓰자 일단은
fun init(): List<Any> {
    var a = Korean.CursingGMGukbap()
    var b = Korean.TwoSunnySideup()
    var c = Chinese.LambSkewersAndBeer()
    var d = Chinese.UhanStreetFoodTour()
    var e = Japanese.GMMGOmelet()
    var f = Japanese.SquidFishingBoatTour()
    var abcdef = listOf(a, b, c, d, e, f)
    return abcdef
}

// init 함수에서 a부터 f의 요소를 가진 list를 리턴한다