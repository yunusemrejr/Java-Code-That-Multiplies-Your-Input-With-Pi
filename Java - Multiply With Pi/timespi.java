import java.util.Scanner;

public class timespi {

    public static void main(String[] args) {
        double Pi = 3.14159265359;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number and it will be multiplied with Pi: ");
        int num = input.nextInt();
        input.close();
        double result = Pi * num;
        System.out.println(result);
    }

}
