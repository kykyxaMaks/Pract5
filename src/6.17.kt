fun main()
{
    try {
        println("Введите X")
        var x = readln()!!.toDouble()
        when
        {
            0<=x && x<=3 -> println("X = ${x*x}")
            x>3 || x<0 -> println("X = 4")
        }

    }catch (e:NumberFormatException)
    {
        println("Неверный формат")
    }
}