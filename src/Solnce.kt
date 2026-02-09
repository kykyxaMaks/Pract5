fun main()
{
    try {
        println("Введите 1 число")
        var one = readLine()!!.toDouble()
        println("Введите 2 число")
        var two = readLine()!!.toDouble()

        if (one>two)
        {
            one++
        }
        else if (one<two)
        {
            two++
        }
        else if (one==two)
        {
            one = Math.pow(one,3.0)
        }
        println("one = $one \n two =$two")
    }catch (e:NumberFormatException)
    {
        println("Неверный формат")
    }

}
