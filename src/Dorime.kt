fun main() {
    try {
        println("Введите Х")
        var x = readLine()!!.toDouble()
        when
        {
            x<=0 -> println("F(x) = 0")

            x>1 -> println("F(x) = ${1/(x+6)}")

        }


    }catch (e:NumberFormatException)
    {
        println("Неверный формат")
    }
}