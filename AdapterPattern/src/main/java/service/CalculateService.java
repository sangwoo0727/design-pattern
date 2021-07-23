package service;

import library.StandardCalculator;

public class CalculateService {

  private final StandardCalculator calculator;

  public CalculateService(StandardCalculator calculator) {
    this.calculator = calculator;
  }

  public int plusTwoNums(int num1, int num2) {
    return calculator.plusNums(num1, num2);
  }

  public int minusTwoNums(int num1, int num2) {
    return calculator.minusNums(num1, num2);
  }

  public int multipleTwoNums(int num1, int num2) {
    return calculator.multipleNums(num1, num2);
  }

  public int divideTwoNums(int num1, int num2) {
    return calculator.divideNums(num1, num2);
  }
}
