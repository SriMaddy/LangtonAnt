import java.util.Scanner;

public class LangtonAntTest
{
 public static void main(String[] args)
 {
 int xPosOfAnt, yPosOfAnt;
 int xMaxOfBoard, yMaxOfBoard;
 String antDirection;
 Scanner scanner = new Scanner(System.in);

 System.out.print("Enter ant direction(North/West/East/South): ");
 antDirection = scanner.nextLine();
 System.out.print("Enter x-position of ant: ");
 xPosOfAnt = scanner.nextInt();
 System.out.print("Enter y-position of ant: ");
 yPosOfAnt = scanner.nextInt();
 Ant ant = new Ant(xPosOfAnt, yPosOfAnt, antDirection);
 System.out.print("Enter x-max of Langton board: ");
 xMaxOfBoard = scanner.nextInt();
 System.out.print("Enter y-max of Langton board: ");
 yMaxOfBoard = scanner.nextInt();
 LangtonAnt langtonAntPlayer = new LangtonAnt(xMaxOfBoard, yMaxOfBoard);
 int choice = 1;
 int count = 1;
 do
  {
   if(count <= 10)
   {
   langtonAntPlayer.playGame(ant);
   count += 1;
   }
   else
   {
   System.out.println("Do you want to continue the game:\tYes-1\tNo-0");
   choice = scanner.nextInt();
   count = (choice==0) ? 1 : 0;
   }
  }while(choice == 1);
 }
}