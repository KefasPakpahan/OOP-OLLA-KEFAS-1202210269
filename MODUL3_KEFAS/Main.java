package Praktikum.MODUL3_KEFAS;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
    boolean repeat = true;
    Scanner scanner = new Scanner(System.in);
    Calculation calculation = new Calculation();

    do {
      try {
        System.out.print("\n==Menu Program==\n1. Square\n2. Circle\n3. Trapezoid\n0. Exit\nSelect menu:");
        int choose = scanner.nextInt();

        switch (choose) {
          case 1:
            System.out.print("\nEnter the length of the side of the square : ");
            double sisi = scanner.nextDouble();
            calculation.setSquare(sisi);
            calculation.run();
            System.out.println("\nThe calculation result: " + calculation.getSquare());
            break;
          case 2:
            System.out.print("\nEnter the radius of the circle : ");
            double diameter = scanner.nextDouble();
            calculation.setCircle(diameter);
            calculation.run();
            System.out.println("\nThe calculation result: " + calculation.getCircle());
            break;
          case 3:
            System.out.print("\nEnter the upper side of the trapezoid : ");
            double atassisi = scanner.nextDouble();
            System.out.print("Insert the side of the base of the trapezoid : ");
            double sisipinggir = scanner.nextDouble();
            System.out.print("Enter the height of the trapezoid : ");
            double tinggi = scanner.nextDouble();
            calculation.setTrapezoid(atassisi, sisipinggir, tinggi);
            calculation.run();
            System.out.println("\nThe calculation result: " + calculation.getTrapezoid());
            break;
          case 0:
            System.out.println("\nProgram End");
            break;
          default:
            System.out.println("\nOption not available");
            continue;
        }
        repeat = false;
      } catch (InputMismatchException e) {
        System.out.println("\n====Error: Input must be a number====");
        scanner.next();
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    } while (repeat);

    scanner.close();
  }
}
