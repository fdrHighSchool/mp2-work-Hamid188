class Main {
  public static void main(String[] args) {
   divby3(123);//True
    
  }//end of main method
  
  public static void divby3(int div){
    int sum = 0;

    while (div != 0) {
      sum += div % 10;
      div = div / 10;
    }
    
    System.out.println(sum);
    
    if(sum % 3 == 0) {
      System.out.println("This number divisible by 3");
    }
    else {
      System.out.println("This number is not divisible by 3");
    }
  }
}
  
