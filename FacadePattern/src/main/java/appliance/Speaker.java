package appliance;

public class Speaker {

  private boolean power;
  private int sound;
  private static Speaker speaker;

  private Speaker() {}

  public static Speaker setUpSpeaker() {
    System.out.println("스피커를 설치 중입니다..");
    if (speaker == null) {
      speaker = new Speaker();
    }
    return speaker;
  }

  public void turnOn() {
    System.out.println("스피커를 켰습니다 .. ");
    System.out.println("사운드가 50으로 설정되어있습니다 .. 홈 시어터에는 60을 추천합니다 ..");
    this.power = true;
    this.sound = 50;
  }
  public void up() {
    if (isOn() && this.sound <= 90) {
      System.out.println("사운드를 10 올렸습니다 ..");
      this.sound += 10;
    }
  }

  public void down() {
    if (isOn() && this.sound >= 10) {
      System.out.println("사운드를 10 내렸습니다..");
      this.sound -= 10;
    }
  }

  public void turnOff() {
    System.out.println("스피커의 전원을 껐습니다..");
    this.power = false;
  }

  public boolean isOn() {
    return this.power;
  }

  public int getSound() {
    return this.sound;
  }
}
