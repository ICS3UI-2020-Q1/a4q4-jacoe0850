import java.util.Scanner;
/**
 *
 * @jacoe0850 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //ask or integer
System.out.println("Please enter a positive integer to see the FizzBuzz numbers");
int num = input.nextInt();
// decalre and initialize count
int count = 0;
while(count < num){
  //increase value on count by 1
  count = count + 1;
  //check for fizz buzz answers
  if ((count % 5 == 0) && (count % 3 == 0)){System.out.println("You should say FizzBuzz");
  } else if ((count % 3 == 0)){
    System.out.println("You should say Buzz");
  }else if ((count % 5 == 0)){
    System.out.println("You should say Buzz");
  }else if ((count % 3 !=0) && (count % 5 !=0)){
    System.out.println("You should say" + " " + count);
  }
}
    
  }
}
