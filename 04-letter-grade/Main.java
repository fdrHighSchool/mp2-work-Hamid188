class Main {
  public static void main(String[] args) {
    int grade = 99;
    System.out.println(letterGrade(grade));
    
    grade = 81;
    System.out.println(letterGrade(grade));
    
    grade = 70;
    System.out.println(letterGrade(grade));
    
    grade = 69;
    System.out.println(letterGrade(grade));
    
    grade = 55;
    System.out.println(letterGrade(grade));

    
  }// end main method

  public static String letterGrade(int grade) {

    if (grade <= 100 && grade >= 90) {
      return "A";
    } else if (grade < 90 && grade >= 80) {
      return "B";
    } else if (grade < 80 && grade >= 70) {
      return "C";
    } else if (grade < 70 && grade >= 60) {
      return "D";
    } else {
      return "F";
    }
  }
}// end letter grade method
