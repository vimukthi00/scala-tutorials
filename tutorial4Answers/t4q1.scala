
object t4q1 extends App{
  def interest(deposit: Double): Double = deposit match {
    case x if x < 0       => 0;
    case x if x <= 20000  => x * 0.02;
    case x if x <= 200000 => x * 0.04;
    case x if x > 200000  => x * 0.065;
  }
  println("Enter deposit amount : ")
  val input = scala.io.StdIn.readFloat()
  println("Interest " + interest(input))


}