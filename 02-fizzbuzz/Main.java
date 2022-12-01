 class Main {
  public static void main(String[] args){
    String game = "";
    for(int a = 1;a <= 100;a++){
      if(a % 3 == 0){
        game = "fizz";
        if(a % 5 == 0){
          game += "buzz";
        }
      }else if(a % 5 == 0){
        game = "buzz";
        
      }else{
        game = Integer.toString(a);
      }
      System.out.println(game);
    }
  }
}
