// TODO: дополнить определение класса размерами и позицией
class Circle(var x: Int, var y: Int,var r: Int) : Transforming,Movable,Figure(0) {
    // TODO: реализовать интерфейс Transforming
    override fun area(): Float {
        return  0.toFloat();
    }
    override fun move(dx: Int, dy: Int) {
        this.x+=x
        this.y+=y
    }
    override fun resize(zoom: Int){
        r*=zoom
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
            }
        }
}