// Базовый класс - Point (точка)
open class Point {
    var x = 0
    var y= 0

    constructor(x: Int, y: Int)
    {
        this.x = x
        this.y = y
    }

    //создание ф-ции для перемещения х
    fun moveX(ox: Int)
    {
        x += ox
    }
    //создание ф-ции для перемещения у
    fun moveY(oy: Int)
    {
        y += oy
    }
    //создание ф-ции для перемещения х
    fun moveXY(ox: Int, oy: Int)
    {
        x += ox
        y += oy
    }
//для переопределения методов род класса
    override fun toString(): String
    {
        return "Точка(x=$x, y=$y)"
    }
}