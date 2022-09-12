object Q2 extends App{

    class Rational(x:Int, y:Int){
        private def gcd(a:Int,b:Int):Int= if(b==0)a else gcd(b,a%b)
        val numer = x/gcd(x,y)
        val denom = y/gcd(x,y)

        def neg = new Rational(-this.numer, this.denom)

        def add(num:Rational):Rational = {
            new Rational(this.numer*num.denom + this.denom*num.numer, this.denom*num.denom)
        }

        def sub(r:Rational) = this.add(r.neg)

        override def toString(): String = this.numer.toString + " / " + this.denom.toString
    }

    val n1 = new Rational(3,4)
    val n2 = new Rational(5,8)
    val n3 = new Rational(2,7)

    println(n1.sub(n2).sub(n3))
}