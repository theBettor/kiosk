package com.example.kiosk

//대분류의 메뉴를 번호로
//        해당하는 숫자 입력하면 세부 메뉴로
//        반복문을 이용해서 메뉴를 선택할 수 있게 유지하고 대분류 메뉴에서, 0번이 입력되면 프로그램 종료

fun main() {
    var kiosk = Kiosk()
    var korean = Korean()

    while (true) {
        kiosk.greet()
        val nationSelect = readln().toInt()
        if (nationSelect == 0) {
            println("메인 화면으로")
            break
        }

        when (nationSelect) {
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
            continue
        }
        korean.displayInfo(detailsSelect)
        break
    }
}