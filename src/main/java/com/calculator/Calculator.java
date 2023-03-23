package com.calculator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.*;

public class Calculator {

  private static final Logger logger = LogManager.getLogger(Calculator.class);

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Operation operation;
    double a = 0;
    double b = 0;
    double result = 0;
    boolean exit = false;
    while (!exit) {
      System.out.println("""
              Enter the operation you want to perform:
              1) SquareRoot(x)
              2) Factorial(x)
              3) NaturalLog(x)
              0) exit
              """);
      System.out.println("Selection option: ");
      int option = sc.nextInt();
      switch (option) {
        case 0 -> {
          logger.warn("[Exit] " + a + " " + b + " [Result] " + result);
          exit = true;
        }
        case 1 -> {
          System.out.println("Enter x: ");
          a = sc.nextDouble();
          operation = new Squareroot();
          result = operation.calculate(a, b);
          System.out.println("Answer: " + result + "\n");
          logger.info("[SquareRoot] " + a + " " + b + " [Result] " + result);
        }
        case 2 -> {
          System.out.println("Enter x: ");
          a = sc.nextDouble();
          operation = new Factorial();
          result = operation.calculate(a, b);
          System.out.println("Answer: " + result + "\n");
          logger.info("[Factorial] " + a + " " + b + " [Result] " + result);
        }
        case 3 -> {
          System.out.println("Enter x: ");
          a = sc.nextDouble();
          operation = new NaturalLog();
          result = operation.calculate(a, b);
          System.out.println("Answer: " + result + "\n");
          logger.info("[NaturalLog] " + a + " " + b + " [Result] " + result);
        }
        case 4 -> {
          System.out.println("In x^y, Enter x: ");
          a = sc.nextDouble();
          System.out.println("In x^y, Enter y: ");
          b = sc.nextDouble();
          operation = new Power();
          result = operation.calculate(a, b);
          System.out.println("Answer: " + result + "\n");
          logger.info("[Power] " + a + " " + b + " [Result] " + result);
        }
        default -> {
          logger.warn("[Invalid] " + a + " " + b + " [Result] " + result);
          System.out.println("Invalid option! Try again!\n");
        }
      }
      a = 0;
      b = 0;
      result = 0;
    }
  }
}
