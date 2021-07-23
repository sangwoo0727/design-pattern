package library;

public class AppleCalculator implements StandardCalculator{

  @Override
  public int plusNums(int n1, int n2) {
    loadingTime();
    return n1 + n2;
  }

  @Override
  public int minusNums(int n1, int n2) {
    loadingTime();
    return n1 - n2;
  }

  @Override
  public int multipleNums(int n1, int n2) {
    loadingTime();
    return n1 * n2;
  }

  @Override
  public int divideNums(int n1, int n2) {
    loadingTime();
    if (n2 == 0) {
      return 0;
    }
    return n1 / n2;
  }

  private void loadingTime() {
    int loading = 0;
    System.out.println("로딩 중...");
    for (int i = 0; i < 100; i++) {
      loading += i;
    }
  }
}
