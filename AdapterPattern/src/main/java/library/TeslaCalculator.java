package library;

public class TeslaCalculator implements AmazingCalculator {

  @Override
  public int plus_two_nums(int n1, int n2) {
    return n1 + n2;
  }

  @Override
  public int minus_two_nums(int n1, int n2) {
    return n1 - n2;
  }

  @Override
  public int multiple_two_nums(int n1, int n2) {
    return n1 * n2;
  }

  @Override
  public int divide_two_nums(int n1, int n2) {
    if (n2 == 0) {
      return 0;
    }
    return n1 / n2;
  }
}
