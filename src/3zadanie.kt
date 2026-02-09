fun main() {
    try {
        {}

        println("Введите возраст от 0 до 150")
        var age = readLine()!!.toInt()
        if (age>=0&&age<=150) {
            when(age) {
                in 0..2 -> println("Младенец")
                in  3..12 -> println("Ребенок")
                in  13..17 -> println("Подросток")
                in  18..64 -> println("Взрослый")
                in  65..150 -> println("Пожилой")
            }
        }
        else
        {
            println("Неверный возраст")
        }
    }catch (e:NumberFormatException)
    {
        println("Неверный формат")
    }
}