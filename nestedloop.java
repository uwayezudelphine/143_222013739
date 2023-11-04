class nestedloop{//create class nestedloop
    public static void main(String args[]){//create main function
        for(int i=1;i<=5;i++){ //the firstloop
        
               for(int j=1;j<=i;j++)   {  //the second loop          
                   System.out.print("*");//print *

                }
                System.out.println();
        }
    }
}
