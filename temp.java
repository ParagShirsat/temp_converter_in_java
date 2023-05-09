import java.io.*;
import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Enter the temperature in Fahrenheit or Celsius
        System.out.println("Enter the temperature:");
        double temperature = scanner.nextDouble();
        
        // Prompt the user to select the conversion type
        System.out.println("***********************Welcome to temperature Converter**********************");
        System.out.println("Select the conversion type:");
        System.out.println("*****************************************************************************");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        int ch= scanner.nextInt();
        
        // Convert the temperature based on the selected conversion type
        double con_Temp = 0;
        String unit = "";
        switch (ch) {
            case 1:
                con_Temp = (temperature - 32) * 5 / 9;
                unit = "Celsius";
                break;
            case 2:
                con_Temp = temperature * 9 / 5 + 32;
                unit = "Fahrenheit";
                break;
            default:
                System.out.println("Invalid conversion type.");
                System.exit(0);
        }
        
        // Display the converted temperature
        System.out.println(temperature + " degrees " + (ch == 1 ? "Fahrenheit" : "Celsius") + " is " + con_Temp + " degrees " + unit + ".");
    }
}
