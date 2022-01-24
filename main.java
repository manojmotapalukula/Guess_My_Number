
/**
 *
 * @author Manoj
 */
import java.util.Scanner;
public class main {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int my_guess =(int)(Math.random()*100);
        int user_guess=0;
        do{
            System.out.println("Guess The Number");
            user_guess = sc.nextInt();
            if (user_guess==my_guess){
                System.out.println("You are correct");
                break;
            }
            else if (user_guess<my_guess){
                System.out.println("Your Number is Small");      
            }
            else{
                System.out.println("Your Number is Large");
            }   
        
        }while (user_guess<my_guess){
                System.out.println("The Number is " + my_guess);
                
            }
          
    }
    
}
