package appliance;

public class BeamProjector {

  private boolean power;
  private static BeamProjector beamProjector;

  private BeamProjector() {
  }

  public static BeamProjector setUpBeamProjector() {
    System.out.println("빔 프로젝트를 설치 중입니다..");
    if (beamProjector == null) {
      beamProjector = new BeamProjector();
    }
    return beamProjector;
  }

  public void playVideo() {
    if (isOn()) {
      System.out.println("비디오가 재생됩니다...");
    } else {
      System.out.println("전원이 켜지지 않았습니다 ...");
      throw new RuntimeException("전원이 켜지지 않았습니다 ...");
    }
  }

  public void turnOn() {
    System.out.println("빔 프로젝트의 전원을 켰습니다..");
    this.power = true;
  }

  public void turnOff() {
    System.out.println("빔 프로젝트의 전원을 껐습니다..");
    this.power = false;
  }

  public boolean isOn() {
    return power;
  }
}
