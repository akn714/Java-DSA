import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        System.out.println("Hello world!");
        
        /* ---------------- DATA TYPES ---------------- */

        /* -------- PRIMITIVE DATA TYEPS -------- */

        byte age = 38;
        int phone = 29582737;
        long phone2 = 29304232432423L;
        float pi = 3.14F;
        char letter = '@';
        boolean isAdult = true;

        /* -------- NON-PRIMITIVE DATA TYPES -------- */

        // STRINGS
        String name = "Doremon";    // String doesn't not have any fixed size
        String friend = new String("Nobita");
        System.out.println(friend);

        // length
        System.out.println(name.length());

        // concatenation of strings
        System.out.println(name+' '+friend);

        // chatAt
        System.out.println(name.charAt(0));

        // replace
        System.out.println(name.replace('o', '0'));
        System.out.println(name);

        // substring
        String string = "a and b";
        System.out.println(string.substring(2,5));



        // ARRAYS
        int[] marks = new int[3];
        int[] marks2 = {23,63,2};
        System.out.println(marks);
        System.out.println(marks2[0]);
        System.out.println(marks[0]);
        
        System.out.println(marks.length);

        // sorting
        System.out.println(marks2[0] + " " + marks2[1] + " " + marks2[2]);
        Arrays.sort(marks2);
        System.out.println(marks2[0] + " " + marks2[1] + " " + marks2[2]);

        boolean[] boolarr = new boolean[3];
        System.out.println(boolarr[0]);

        // 2D arrays
        int[][] finalMarks = {{94,92,96},{94,92,96}};
        System.out.println(finalMarks[0][2]);


        // CASTING
        int price = 100;
        // int finalPrice = price + 18.4; // this will give error
        
        // implicit casting
        float fp = price + 23.5F;

        // explicit casting
        int finalPrice = price + (int)18.88;
        System.out.println(finalPrice);


        // CONSTANTS - this can be 
        final float PI = 3.14F;
        

        /* ---------------- OPERATORS ---------------- */
        int a = 2;
        int b = 4;
        System.out.println(a*b);
        System.out.println(b/2);
        System.out.println(4%3);
        System.out.println(a+b);
        System.out.println(b-a);

        
        /* ---------------- TAKING INPUTS ---------------- */
        // Scanner sc = new Scanner(System.in);
        // System.out.println("input your age");
        // int age2 = sc.nextInt();
        // System.out.println("your age is "+age2);

        // // taking string input
        // System.out.print("enter your name: ");
        // String name2 = sc.next();
        // System.out.println("your name is "+name2);

        // sc.nextLine(); // always use this before taking string input

        // System.out.println("how are you");
        // String about = sc.nextLine();
        // System.out.println("about: "+about);

        /* ---------------- CONDITIONAL STATEMENTS ---------------- */
        boolean condition = true;
        if(condition){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        int switch_condition = 5;

        switch (switch_condition) {
            case 5:
                System.out.println("first case");
                break;
            case 3:
                System.out.println("second case");
                break;
        
            default:
                System.out.println("default case");
        }

        /* ---------------- LOOPS ---------------- */
        // for, while, do while
        for(int i=0;i<10;i++){
            System.out.println(i);
        }

        /* ---------------- EXCEPTION HANDLING ---------------- */
        // try, catch
        int[] try_catch_array = {2,3,6};
        try {
            System.out.println(try_catch_array[6]);
        } catch (Exception e) {
            System.out.println(e);
        }

        /* ---------------- FUNCTIONS ---------------- */
        add(2,3,6);
    }
    public static void add(int ...arr){
        System.out.println("ok");
    }
}
