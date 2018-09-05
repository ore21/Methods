import java.util.Scanner;
public class main {
    public static void main(String[] args){
      System.out.println("please type 1 - 4 to select a shape to find out it's area.");
      System.out.println("-------------------");
      System.out.println(" 1 = Square. ");
      System.out.println(" 2 = Circle. ");
      System.out.println(" 3 = Rectangle. ");
      System.out.println(" 4 = Cube. ");

      Scanner scanner = new Scanner(System.in);
      loop: while (true) {
          int decision = scanner.nextInt();
          switch (decision){
              case 1:
                  System.out.println("You selected Square");
                  System.out.println("Enter your number to represent 1 side");
                  double squareSide = scanner.nextDouble();

                  double squarePerm = squareSide * 4;
                  double squareArea = squareSide * 2;

                  System.out.println("Your perimeter is : " + squarePerm + " and your Area is : " + squareArea + "cm Squared");

                  break;
              case 2:
                  System.out.println("You selected Circle");
                  System.out.println("Enter the radius for your circle");
                  double radius = scanner.nextDouble();

                  double circPerm = radius * Math.PI;
                  double circumference = circPerm * 2;

                  double circleArea = Math.PI * (radius * radius);

                  System.out.println("Your perimeter (circumference in this case) is : " + circumference + " and your Area is : " + circleArea);

                  break;
              case 3:
                  System.out.println("You selected Rectangle");
                  System.out.println("Enter your First side Length number");
                  double recSide1 = scanner.nextDouble();
                  double recPerm1 = recSide1 * 2;

                  System.out.println("Enter your Second side Length number");
                  double recSide2 = scanner.nextDouble();
                  double recPerm2 = recSide2 * 2;

                  double recArea = recSide1 * recSide2;
                  double recPermAnswer = recPerm1 + recPerm2;

                  System.out.println("Your perimeter is : " + recPermAnswer + "cm and your Area is : " + recArea + "cm squared");

                  break;
              case 4:
                  System.out.println("You selected Cube");
                  System.out.println("Enter your number to represent 1 side/edge of your Cube");
                  double cubeSide = scanner.nextDouble();

                  double cubeVol = cubeSide * cubeSide * cubeSide;
                  double cubeSurf = 6 * (cubeSide * cubeSide);

                  System.out.println("Your Volume is : " + cubeVol + " and your Surface Area is : " + cubeSurf);

                  break;
                  default:
                      System.out.println("Really? Select a number between 1-4 to make a decision.");
          }
      }
    }
}
