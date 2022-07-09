def attendees(price:Int):Double=120+(15-price)/5*20;
def cost(price: Int):Double =500+ 3*attendees(price);
def revenue(price:Int):Double= attendees(price)*price;
def profit(price:Int):Double = revenue(price) - cost(price);

println("If ticket price is increased by Rs:5/= the profit would be" );
println(profit(20));
println("If ticket price is decreased by Rs:5/= the profit would be");
println(profit(10));

if (profit(20)>profit(10)) printf("The best ticket price is Rs 20/=")
else printf("The best ticket price is Rs 10/=");
