fun main() {
    // Создаем массив из элементов базового класса
    val elements = arrayOf(
        ColoredPoint(1, 2, "Red"),
        Line(1, 2, 3, 4),
        ColoredLine(Point(1, 2), Point(3, 4), "Blue"),
        Polygon(Point(1, 2), Point(3, 4), Point(5, 6))
    )

    // Демонстрация использования всех элементов классов
    for (element in elements) {
        println(element)
        when (element) {
            is ColoredPoint ->
            {
                element.moveX(1)
                element.moveY(2)
                element.moveXY(3, 4)
                element.setColor("зеленый")
                println("Новая цветная точка: ${element.getColor()}")
            }

            is Line ->
            {
                element.setStartPoint(Point(0, 0))
                element.setEndPoint(Point(10, 10))
                println("стартовая точка линии: ${element.getStartPoint()}")
                println("конечная точка линии: ${element.getEndPoint()}")
            }

            is ColoredLine ->
            {
                element.setStartPoint(Point(0, 0))
                element.setEndPoint(Point(10, 10))
                element.setColor("желтый")
                println("стартовая точка цветной линии: ${element.getStartPoint()}")
                println("конечная точка цветной линии: ${element.getEndPoint()}")
                println("новый цвет цветной точки: ${element.getColor()}")
            }
        }
    }
}