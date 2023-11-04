public class compoundInterest {//create class compoundInterest

    public static void main(String[] args) {//create main method to start program execution
        calculateCompound compound= new calculateCompound();// calculate instance of calculateCompound
        compound.calculate();//call method calculate from compound object
    }
}
/**
 * class to claculate Compound interest
 */
class calculateCompound {
public void calculate(){
    double principle=500000,rate=0.18,time=3,compoundInterest;
    compoundInterest=principle*(Math.pow(1+(rate/12),(time*12)));
    System.out.println("Bob will have to pay "+compoundInterest+" after 3 Years");
}
    
}