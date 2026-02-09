fun main() {
    try {
        println("Введите двухзначное число")
        var number = readLine()!!.toInt()
       var x: Int
       var y: Int
       x = number%10
        y = number/10
        if (x==3 || x == 6 || x== 9 || y == 3 || y == 6 || y == 9)
        {
            println("Цифры 3 6 или 9 есть в числе")
        }
        else
        {
            println("Нет")
        }
    }catch (e:NumberFormatException)
    {
        println("Неверный формат")
    }
}