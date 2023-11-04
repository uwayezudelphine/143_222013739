public class simpleInterest {//create class compoundInterest

    public static void main(String[] args) {//main method
      interest interest1= new interest();// create object interest1
       interest1.calculate(); //coll method calculate
    }
}

//class to calculate simple interest

class interest {//class interest
  public  void calculate(){//create function
    float principle=100000,rate=5,time=5,simpleInterest;//initiatilisation of variable
    simpleInterest=(principle*rate*time)/100;//calculate simpleinterest
    System.out.println("simple interest for Bob After 5 years is ="+simpleInterest);//display simple interest after5 years
  }
}