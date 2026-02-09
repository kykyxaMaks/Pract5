fun main() {
    try {
        println("Введите длину окна")
        var x = readln()!!.toDouble()
        println("Введите ширину окна")
        var y = readln()!!.toDouble()
        println("Введите диаметр головы")
        var d = readln()!!.toDouble()
        when
        {
            x<=0 || y<=0 || d<= 0 -> println("Размеры должны быть положительными")
            d<=x && d<= y -> {println("Голова пройдет")}
            d>x && d>y -> println("Голова не пройдет")

        }
    }catch (e:NumberFormatException)
    {
        println("Неверный формат")
    }
}