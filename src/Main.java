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
/*
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
*/

// program to find multiplication table
/*
public class Main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println(a+ "x" +i+ "="+ a*i);
        }
    }
}
*/


//program to reverse string
/*
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: " );
        String name=sc.nextLine();

        String rev="";
        for(int i = name.length()-1; i>=0; i--)
            rev = rev + name.charAt(i);

        System.out.println(rev);

    }
}
*/

//reverse a string another method

/*
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String rev=new StringBuilder(name).reverse().toString();
        System.out.println(rev);
    }
}
*/

//Factorial of a number
/*
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number for factorial:");
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int fact =1;
        for (int i = 1; i <= a; i++) {
             fact = fact * i;
        }
        System.out.println("Factorial is :"+fact);
    }
}
*/


//prime or not prime
/*
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime=true;

        if (n < 2) {
            System.out.println("Not prime");
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                prime=false;
                break;
            }
        }
        if (prime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}

*/

//reverse of a no. and palindrom
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int rev =0;
        while(n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }
        System.out.println(rev);
        if(temp==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
