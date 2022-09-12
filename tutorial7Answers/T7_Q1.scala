object Q1 extends App{

    class Rational(x:Int,y:Int){
        private def gcd(a:Int,b:Int):Int=if(b==0)a else gcd(b,a%b)

        val numer = x/gcd(x,y)
        val denom = y/gcd(x,y)

        def neg = new Rational(-this.numer,this.denom)

        override def toString(): String = this.numer.toString + " / " + this.denom.toString

    }
    val number = new Rational(4,7)

    println(number)
    println(number.neg)
}