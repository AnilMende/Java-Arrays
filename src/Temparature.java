import java.sql.SQLOutput;
import java.util.Scanner;
public class Temparature {
    private static double celsiusToFahrenheit(double celsius){
        return (celsius * 9/5)+32;
    }
    private static  double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32)*5/9;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature value:");
        double temperature = sc.nextDouble();
        System.out.println("Enter unit of measurement (C for Celsius,F for Fahrenheit):");
        char unit = sc.next().charAt(0);

        double convertedTemperature = 0.0;
        if(unit == 'C'||unit == 'c'){
            convertedTemperature = celsiusToFahrenheit(temperature);
            System.out.println("Converted temperature in Fahrenheit:"+convertedTemperature+"degree Fahrenheit");
        }
        else if(unit == 'F'||unit == 'f'){
            convertedTemperature = fahrenheitToCelsius(temperature);
            System.out.println("Converted temperature in Celsius:"+convertedTemperature+"degree Celsius");
        }
        else {
            System.out.println("Invalid unit of measurement.Please enter either C or F");
        }

    }
}

