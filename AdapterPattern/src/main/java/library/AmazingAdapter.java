package library;

public class AmazingAdapter implements StandardCalculator {

  private final AmazingCalculator amazingCalculator;

  public AmazingAdapter(AmazingCalculator amazingCalculator) {
    this.amazingCalculator = amazingCalculator;
  }

  @Override
  public int plusNums(int n1, int n2) {
    return amazingCalculator.plus_two_nums(n1, n2);
  }

  @Override
  public int minusNums(int n1, int n2) {
    return amazingCalculator.minus_two_nums(n1, n2);
  }

  @Override
  public int multipleNums(int n1, int n2) {
    return amazingCalculator.multiple_two_nums(n1, n2);
  }

  @Override
  public int divideNums(int n1, int n2) {
    return amazingCalculator.divide_two_nums(n1, n2);
  }
}
