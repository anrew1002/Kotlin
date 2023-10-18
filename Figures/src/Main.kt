fun main() {

    // интерфейсы удобно использовать в коллекциях
    val figures: Array<Movable>
    val movable: Movable = Rect(0,0,1,1)
    // переменной базового класса
    val f: Rect = Rect(0,0,4,2)
    f.move(4,3)
    f.rotate(RotateDirection.CounterClockwise, 3,-3)
    f.rotate(RotateDirection.CounterClockwise, 3,-3)
    f.rotate(RotateDirection.CounterClockwise, 3,-3)
    println(f)


}