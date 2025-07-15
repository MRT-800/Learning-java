import java.util.Scanner;
public class Simple_Calc {
    public static void main(String[] args) throws InterruptedException {
        Scanner op = new Scanner(System.in);
        System.out.println("Enter 2 number");
        double a = op.nextDouble();
        double b = op.nextDouble();
        while (true) {
            System.out.println("choose a no - 1(add) - 2(subtract) - 3(Multiply) - 4(Divide) - Any no.(Exit)");
            int c = op.nextInt();
            if (c == 1) {
                System.out.println(a + b);
            } else if (c == 2) {
                System.out.println(a - b);
            } else if (c == 3) {
                System.out.println(a * b);
            } else if (c == 4) {
                if (b != 0) {
                    System.out.println(a / b);
                } else
                    System.out.println("Error");
            } else {
                String message = "Exiting program......";
                for (char ch : message.toCharArray()) {
                    System.out.print(ch);
                    Thread.sleep(100);}
                break;
            }
        }
        op.close();
    }
}

