package appliance;

public class Light {
  private boolean power;
  private int bright;
  private static Light light;

  private Light() {}

  public static Light setUpLight() {
    System.out.println("전등을 설치 중입니다..");
    if (light == null) {
      light = new Light();
    }
    return light;
  }

  public void turnOn() {
    System.out.println("전등을 켰습니다..");
    System.out.println("기본 밝기가 50입니다.. 홈 시어터에는 40이 적당한 밝기입니다..");
    this.power = true;
    this.bright = 50;
  }

  public void turnOff() {
    System.out.println("전등을 껐습니다..");
    this.power = false;
  }

  public void up() {
    if (isOn() && this.bright <= 90) {
      System.out.println("전등의 밝기를 10 올렸습니다..");
      this.bright += 10;
    }
  }

  public void down() {
    if (isOn() && this.bright >= 10) {
      System.out.println("전등의 밝기를 10 내렸습니다..");
      this.bright -= 10;
    }
  }

  public boolean isOn() {
    return power;
  }

  public int getBright() {
    return bright;
  }
}
