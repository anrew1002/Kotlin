// сочетание определения класса и конструктора одновременно объявляет переменные и задаёт их значения
class Rect(var x: Int, var y: Int, var width: Int, var height: Int) : Transforming,Movable, Figure(0) {
    // TODO: реализовать интерфейс Transforming
    override fun resize(zoom: Int){
        width*=zoom
        height*=zoom
    }
    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int){
        when (direction){
            RotateDirection.Clockwise ->{
                // -(3,3)
                x -= centerX
                y -= centerY
                //swap
                var temp = y
                y = -x
                x = temp
                x += centerX
                y += centerY

                temp = width
                width = height
                height = temp
            }
            RotateDirection.CounterClockwise ->{
                // -(3,3)
                x -= centerX
                y -= centerY
                //swap
                var temp = y
                y = x
                x = -temp
                x += centerX
                y += centerY

                temp = width
                width = height
                height = temp
            }
        }
    }
    var color: Int = -1 // при объявлении каждое поле нужно инициализировать

    lateinit var name: String // значение на момент определения неизвестно (только для объектных типов)
    // дополнительный конструктор вызывает основной
    constructor(rect: Rect) : this(rect.x, rect.y, rect.width, rect.height)

    // нужно явно указывать, что вы переопределяете метод
    override fun move(dx: Int, dy: Int) {
        x += dx; y += dy
    }

    // для каждого класса area() определяется по-своему
    override fun area(): Float {
        return (width*height).toFloat() // требуется явное приведение к вещественному числу
    }
    override fun toString(): String {
        return "(${x}, ${y}), height ${height},width ${width}"
    }
}