import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary = 0;
        int creditScore = 0;
        boolean criminal = false;
        while (true) {
            System.out.print("Enter your salary: ");
            if (sc.hasNextDouble()) {
                salary = sc.nextDouble();
                break;
            } else {
                System.out.println("Please enter number only:");
                sc.next();
            }
        }
        while (true) {
            System.out.print("Enter your credit score (1 to 500): ");
            if (sc.hasNextInt()) {
                creditScore = sc.nextInt();
                if (creditScore >= 1 && creditScore <= 500) {
                break;
                } else {
                 System.out.println("Credit score must be between 1 to 500");
                }
            } else {
                System.out.println("Enter number:");
                sc.next();
            }
        }
        while (true) {
            System.out.print("criminal record(true/false): ");
            if (sc.hasNextBoolean()) {
            criminal = sc.nextBoolean();
             break;
            } else {
            System.out.println("Type true or false only:");
            sc.next();
            }
        }
        if (creditScore < 300 || criminal == true) {
            System.out.println("you are not eligible for loan.");
        } else {
            double loanAmount = 0;
            while (true) {
                System.out.print("Enter loan amount: ");
                if (sc.hasNextDouble()) {
                 loanAmount = sc.nextDouble();
                 if (loanAmount <= (salary * 2)) {
                 break;
                    } else {
                     System.out.println("Loan too high,Must be less than double your salary:");
                    }
                } else {
                    System.out.println("Enter in number:");
                    sc.next();
                }
            }
            double rate = 0;
            int years = 0;
            while (true) {
                System.out.print("Enter annual interest rate (in %): ");
                if (sc.hasNextDouble()) {
                    rate = sc.nextDouble();
                    break;
                } else {
                    System.out.println("enter number only:");
                    sc.next();
                }
            }
            while (true) {
                System.out.print("Enter loan term in years: ");
                if (sc.hasNextInt()) {
                    years = sc.nextInt();
                    break;
                } else {
                    System.out.println("Enter in number:");
                    sc.next();
                }
            }
            double R = (rate / 100) / 12;
            int N = years * 12;
            double M = loanAmount * (R * Math.pow(1 + R, N)) / (Math.pow(1 + R, N) - 1);
            System.out.println("Your monthly mortgage payment is: " + String.format("%.2f", M));
        }

        sc.close();
    }
}