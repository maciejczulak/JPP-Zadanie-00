package pl.sda;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Height in m:");
        Double height = scanner.nextDouble();
        System.out.println("Wieght in kg:");
        Double wieght = scanner.nextDouble();
        Double BMI = wieght / (Math.pow(height,2));
        System.out.println("Your BMI:" + BMI);




    }
}
