import java.util.Scanner;
/*public class Main {
    public static void main(String[] args) {
        System.out.println("First program");
    }
}*/

// lets start from simple.

/*public class Main {
    public static void main(String[] args) {
        System.out.println("This is my starting of java programming journey");
    }
}*/

// simple addition
/*
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("the sum of a and b is "+ (a+b));

    }
}*/

//simple calculator
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner op = new Scanner(System.in);
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
