package facade;

import appliance.BeamProjector;
import appliance.Light;
import appliance.Speaker;

public class HomeTheater {

  private BeamProjector beamProjector;
  private Light light;
  private Speaker speaker;

  public static class Builder {
    private BeamProjector beamProjector;
    private Light light;
    private Speaker speaker;

    public Builder beamProjector(BeamProjector beamProjector) {
      this.beamProjector = beamProjector;
      return this;
    }

    public Builder light(Light light) {
      this.light = light;
      return this;
    }

    public Builder speaker(Speaker speaker) {
      this.speaker = speaker;
      return this;
    }

    public HomeTheater build() {
      return new HomeTheater(this);
    }
  }

  private HomeTheater(Builder builder) {
    this.beamProjector = builder.beamProjector;
    this.speaker = builder.speaker;
    this.light = builder.light;
  }

  public void startHomeTheater() {
    beamProjector.turnOn();
    light.turnOn();
    speaker.turnOn();

    light.down();
    speaker.up();

    beamProjector.playVideo();
  }

  public void endHomeTheater() {
    beamProjector.turnOff();
    light.turnOff();
    speaker.turnOff();
  }
}
