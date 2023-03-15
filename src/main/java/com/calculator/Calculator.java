package com.calculator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.*;

public class Calculator {

  private static final Logger logger = LogManager.getLogger(Calculator.class);

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Operation operation;
    double a = 0;
    double b = 0;
    double result = 0;
    boolean exit = false;
    while (!exit) {
      System.out.println("Enter the operation you want to perform:\n"
                         + "1) SquareRoot(x)\n"
                         + "0) exit\n");
      System.out.println("Selection option: ");
      int option = sc.nextInt();
      switch (option) {
      case 0:
        logger.info("Exiting the calculator");
        exit = true;
        break;

      case 1:
        logger.info("Executing square root function");
        System.out.println("Enter x: ");
        a = sc.nextDouble();
        operation = new Squareroot();
        result = operation.calculate(a, b);
        System.out.println("Answer: " + result + "\n");
        break;

      default:
        logger.warn("Invalid function option");
        System.out.println("Invalid option! Try again!\n");
        break;
      }
    }
  }
}
