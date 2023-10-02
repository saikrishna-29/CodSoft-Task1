import java.util.*;
class number {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("If you want to play the game enter Y otherwise N");
            char s = sc.next().charAt(0);
            if (s == 'Y') 
            {
                int n = (int) (100 * Math.random()) + 1;
                int f = 0, g;
                System.out.println("Guess the number between 1 to 100");
                for (int i = 1; i <= 5; i++) 
                {
                    System.out.println("you have " + (6 - i) + " Chances");
                    g = sc.nextInt();
                    if (g == n) 
                    {
                        f = 1;
                        break;
                    } 
                    else if (g < n)
                        System.out.println("your number is too short");
                    else
                        System.out.println("your number is too big");
                }
                if (f == 0)
                    System.out.println("Chances are over");
                else
                    System.out.println("Congratulations! Correct guess");
            }
            else
                break;
        }
    }
}