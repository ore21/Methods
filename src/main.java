import java.util.Scanner;

public class main {
    public static void main(String[] args){
      int nUserShape1, nUserShape2, nUserShape3, nUserShape4 = 0;
      int result = 0;

      nUserShape1 = getInput("Get the area of a square. ");
      nUserShape2 = getInput(" Get the area of a parallelogram. ");
      nUserShape3 = getInput(" Get the area of a triangle. ");
      nUserShape4 = getInput(" Get the area of a Rectangle. ");



    }

    public static int getInput(String sLabel) {
        int nShape = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print(sLabel);
        nShape = sc.nextInt();
        return nShape;
    }
}


