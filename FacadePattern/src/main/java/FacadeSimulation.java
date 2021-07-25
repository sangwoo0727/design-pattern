import appliance.BeamProjector;
import appliance.Light;
import appliance.Speaker;
import facade.HomeTheater;

public class FacadeSimulation {

  public static void main(String[] args) {
    HomeTheater homeTheater = new HomeTheater.Builder()
        .beamProjector(BeamProjector.setUpBeamProjector())
        .light(Light.setUpLight())
        .speaker(Speaker.setUpSpeaker())
        .build();

    homeTheater.startHomeTheater();
    homeTheater.endHomeTheater();
  }
}
