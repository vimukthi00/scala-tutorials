def shippingCost(n:Int):Double=n match{
  case 50 => 3;
  case x if x>50 =>3+(x-50)*0.75;
}

def bookstorePrice(n:Int)=24.95*.6*n;

def total(n:Int)= bookstorePrice(n) + shippingCost(n);

print(total(60));