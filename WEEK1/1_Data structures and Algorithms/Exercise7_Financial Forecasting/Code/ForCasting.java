import java.util.Scanner;

//refer docs for analysis
public class ForCasting {
    public static double recu(double amnt, double[] past, int count) {
        if (count >= past.length)
            return amnt;

        double new_amnt = amnt * (1 + past[count]);
        System.out.printf("Year %d: %.2f (Growth: %.2f%%)%n", count + 1, new_amnt, past[count] * 100);
        return recu(new_amnt, past, count + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial amount");
        double initial_amnt = sc.nextDouble();
        double[] past = { 0.04, 0.07, 0.09, 0.067 };
        double final_amnt = recu(initial_amnt, past, 0);
        System.out.printf("\nFinal forecasted value after %d years: %.2f%n", past.length, final_amnt);
        //
    }
}
