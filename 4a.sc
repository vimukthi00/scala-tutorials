def normal(hrs:Int):Int=hrs*250;
def ot(hrs:Int):Int=hrs*85;
def total(x:Int,y:Int):Int=normal(x)+ ot(y);
def tax(total:Int):Int=total*12/100;
def salary(x:Int,y:Int):Int=total(x,y)-tax(total(x,y));

println("Take home salary;");
println(salary(40,30));
