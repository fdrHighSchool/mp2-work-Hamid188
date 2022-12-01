 class Main {
  public static void main(String[] args) {
   isLeapYear(2022);//false
   isLeapYear(2024);//true
   isLeapYear(1900);//false
   isLeapYear(2000);//true
  }//end of main method
  
  public static void isLeapYear(int year){
    if ((year % 4 == 0) && ((year % 100 != 0) || (year%400 == 0))) {
      System.out.println("This is a leap year");
    }
    
    else {
      System.out.println("This is not a leap year");
    }
  }
}
