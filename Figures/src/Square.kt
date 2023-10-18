// TODO: дополнить определение класса размерами и позицией
class Square(var x: Int,var y: Int,var side: Int) : Transforming,Movable,Figure(0) {
    // TODO: унаследовать от Figure, реализовать area()
    override fun area(): Float{
        return (side*side).toFloat()
    }
    override fun move(dx: Int, dy: Int) {
        this.x+=x
        this.y+=y
    }
    override fun resize(zoom: Int){
        side*=zoom
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

    // TODO: реализовать интерфейс Transforming
}