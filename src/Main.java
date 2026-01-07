import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Variables
        String name_1 = "Mikasa";
        String name_2 = "Noor";
        int age = 22;
//        String mikasa_bf = name_2;

        // Output
//        System.out.println(name_1);
//        System.out.print(age);
//        System.out.println(name_2);

        // ======= DATA TYPE =======

        // ------- Primitive -------
        byte age_ = 17; // byte = 1 ********** {-128 to 127}
        // short = 2
        int phone = 1974463319; // int = 4 ********** {1,2,3,4}
        long phone_2 = 1974463471L; // long = 8
        // double = 8
        float pi = 3.1416F; // float = 4 ********** {4.1416}
        char letter = '@'; // char = 2 ********** {a,b,c,d}
        boolean isAdult = false; // boolean = 1 ********** {true/false}

        // ------- Non-Primitive -------
        String super_hero = "thor";
//        System.out.println(super_hero.length());

        // concatente
        String desc = "My name is " + name_1 + " " + name_2 + " and my age is around " + age + " yo.";
//        System.out.println(desc);

        // charAt
//        System.out.println("thor's last word is: " + super_hero.charAt(3));

        // length
//        System.out.println("mikasa has total " + name_1.length() + " words.");

        // replace
        String new_sup = super_hero.replace("thor", "iman v");
//        System.out.println("replaced one: " + new_sup);
//        System.out.println("old one: " + super_hero);

        // substring
        String new_sup_2 = new_sup.substring(0, 4);
//        System.out.println("cutout from new_sup: " + new_sup_2);

        // ------- Array -------
        int[] ages = {33, 32,11};
//        System.out.println(ages[2]);

        // ------ 2D Array ------
        int[][] super_age = {{33,32,11}, {34,41,10}};
//        System.out.println(super_age[1][2]);

        // ======= Casting =======
        double price = 100.00;
        double fPrice = price + 20; // 20 is an int type not a double type
//        System.out.println(fPrice);

        int prc = 100;
        int fPrc = prc + (int)20.99; // 20.00 is a double type, so (int) is placed before the number.
//        System.out.println(fPrc);

        // Constants
        final float pi_number = 3.1416F; // final is for the constant

        // ======= OPERATORS =======
        double a = 4;
        double b = 3;

        double add = a + b;
        double sub = a - b;
        double mul = a * b;
        double div = a / b;
        double mod = a % b;

//        System.out.println("3 + 4 is " + add);
//        System.out.println("3 - 4 is " + sub);
//        System.out.println("3 * 4 is " + mul);
//        System.out.println("3 / 4 is " + div);
//        System.out.println("3 % 4 is " + mod);

        // ======= MATH =======
//        System.out.println("Max value: " + Math.max(7,11));
//        System.out.println("Min value: " + Math.min(7,11));

        // random
//        System.out.println((int)(Math.random() * 100));

        // ======= INPUT =======
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Input your name: ");
//        String name = sc.nextLine();
//        System.out.println(name);

        // ======= Comparison Operators =======
        /*
        * a == b
        * a != b
        * a < b
        * a > b
        * a <= b
        * a >= b
        */

        // ======= CONDITIONAL STATEMENTS =======
        boolean isSunUp = true;
//        if(isSunUp == true)
//            System.out.println("it is day.");
//        else
//            System.out.println("it is night.");

        // ======= logical operators =======
        int x = 1;
        int y = 70;

//        if(x < 50 && y < 90)
//            System.out.println("Both are less then 100");
//        if(x < 50 || y < 90)
//            System.out.println("Both are atleast less then 100");

//        switch(x){
//            case 1:
//                System.out.println("it's less then 100");
//                break;
//            case 2:
//                System.out.println("it's dumb");
//                break;
//            default:
//                System.out.println("default");
//        }

        // ======= For Loop =======

//        for(x = 100; x >= 0; x--){
//            System.out.println("number: " + x);
//        }

        // ======= While Loop =======
//        while (y >= 1){
//            System.out.println(y);
//            y--;
//        }

        // ======= Do While Loop =======
//        Scanner sC = new Scanner(System.in);
//        int num;
//        do {
//            System.out.print("Type a number: ");
//            num = sC.nextInt();
//            System.out.println("here's your number: " + num);
//        } while (num >= 5);
//        System.out.println("------- THE END -------");

        // ======= BREAK / CONTINUE =======
        int z = 1;
        while (true){
                if(z == 7){
                    z++;
                    continue;
                }
                System.out.println("number: " + z);
                z++; // z = z + 1
                if(z > 10){
                    break;
                }

        }

    }
}