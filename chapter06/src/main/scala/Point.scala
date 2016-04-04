
class Point(var x: Double, var y: Double) {

  override def toString = "(" + x + "," + y +")"
}

object Point {
  def apply(x: Double, y: Double) = {
    new Point(x, y)
  }
}
