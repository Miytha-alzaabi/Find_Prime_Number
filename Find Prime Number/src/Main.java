public class Main {
    public static void main(String[] args) {
        // Find prime numbers
        int i=0;

        do {
            if(i != 1 && i % 2 !=0 && i %3 !=0 && i % 5 != 0 && i % 7 != 0
                    || i == 2 || i == 3 || i == 5 || i == 7) {
                System.out.println("i = " + i);
            }i++;
        }while(i<=100);

//Find odd numbers
        int a =1;
        System.out.println("Odd Numbers: " );
        while (a <= 100) {
            if(a % 2 != 0) {

                System.out.println("a = " + a);
            }
            a++;
        }

    }
}