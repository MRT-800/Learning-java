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

//check even or odd
/*
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }

    }
}
*/



// program to find greater no from 3 no;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("choose 1 or 2 ");
            int x= in.nextInt();
            if (x == 1) {
            System.out.print("Enter Numbers: ");
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int max = Math.max(a, (Math.max(b, c)));
            System.out.println("The largest is: " + max);}
            else{
                System.out.print("Exit");
                break;
            }
        }
    }
}


