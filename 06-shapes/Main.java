class Main {
  public static void main(String[] args) {
    square(6);
    Rec(2, 3);
    righttriangle(4);
  }
public static void square(int s) {
for (int row = 0; row < s; row++) {
  for(int col =0; col < s; col++)  {
     System.out.print("* ");
    }//end of col loop
    System.out.println();
   }//end of the method
  }//end of class
public static void Rec(int l, int w) {
for (int row = 0; row < w; row++) {
  for(int col =0; col < l; col++)  {
     System.out.print("* ");
    }//end of col loop
    System.out.println();
   }//end of the method
  }//end of class
public static void righttriangle(int s) {
int p=0;
for (int row = 0; row < s; row++) {
  for(int col =0; col < p; col++)  {
     System.out.print("* ");
    }//end of col loop
    System.out.println();
    p += 1;
   }//end of the method
  }//end of class
}
