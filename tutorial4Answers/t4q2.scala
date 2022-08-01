
object t4q2 extends App {

  println("Input number : ")
  var user_input: Int = scala.io.StdIn.readInt()

  def function(number:Int)= number match{
    case x if 0 >= x => println("Negative/Zero")
    case x if x % 2 == 0 => println("Even number is given ")
    case x if x % 2 != 0 => println("Odd number is given ")
  }
  function(user_input)
}

