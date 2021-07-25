import appliance.BeamProjector;
import appliance.Light;
import appliance.Speaker;

public class Simulation {

  public static void main(String[] args) {
    BeamProjector beamProjector = BeamProjector.setUpBeamProjector();
    Light light = Light.setUpLight();
    Speaker speaker = Speaker.setUpSpeaker();

    beamProjector.turnOn();
    light.turnOn();
    speaker.turnOn();

    light.down();
    speaker.up();

    beamProjector.playVideo();

    beamProjector.turnOff();
    light.turnOff();
    speaker.turnOff();
  }
}
