import java.util.Scanner;

public class bt_tinhcannang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height,weight, bmi;
        System.out.println("weight (kg):");
        weight = scanner.nextDouble();

        System.out.println("height (cm):");
        height = scanner.nextDouble();

        bmi = weight/Math.pow(height,2);

        System.out.println("bmi la: " + bmi);
        System.out.printf("%-20s%s ","bmi","interpretation\n");
        if(bmi<18)
            System.out.printf("%-20.2f%s",bmi,"underweight");
        else if(bmi<25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");






    }
}
