//Write a method with a random string inoput returns a vowels string as ouput.

class Main {
  int a = 20,b=-29 ,c=23;
  public static void main(String[] args) {
    StringBuilder sb= new StringBuilder("Good Morning");
    sb.insert(1, "Friend");
    System.out.println(sb.toString());
 System.out.println( "Vowels in input are :"+vowelsOnly("input"));

  }
  public static String  vowelsOnly(String input){
  String vowels = "aeiou";
    StringBuilder   sb  = new StringBuilder();
    for(char c : input.toCharArray()){
      if(vowels.contains(String.valueOf(c).toLowerCase())){
        sb.append(c);
      }
    }
    return sb.toString();
  }
}


