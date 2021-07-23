import library.AmazingAdapter;
import library.TeslaCalculator;
import service.CalculateService;

public class Application {

  public static void main(String[] args) {
    AmazingAdapter amazingAdapter = new AmazingAdapter(new TeslaCalculator());
    CalculateService app = new CalculateService(amazingAdapter);

    System.out.println(app.plusTwoNums(1, 1));
    System.out.println(app.minusTwoNums(1, 2));
    System.out.println(app.multipleTwoNums(1, 2));
    System.out.println(app.divideTwoNums(10, 5));
  }
}
