public class Functions{

public static int reverseNumber(int num){
  boolean isNegative = (num < 0) ? true : false;
  if(isNegative){
    num *= -1;
  }
  int result = 0;
  while (num > 0){
    result = result*10 + num%10;
  }
  if(isNegative){
    result *= -1;
  }
  return result;
}


public static void main(String[] args){
  System.out.println(reverse(-123));
  System.out.println(reverse(-1));
  System.out.println(reverse(0));
  System.out.println(reverse(123));
  System.out.println(reverse(1));
}
