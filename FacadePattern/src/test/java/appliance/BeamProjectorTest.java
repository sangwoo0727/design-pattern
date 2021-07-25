package appliance;


import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BeamProjectorTest {

  private BeamProjector beamProjector;

  @BeforeEach
  void buyAppliance() {
    beamProjector = BeamProjector.setUpBeamProjector();
  }

  @Test
  void beamProjectorOnTest() {
    beamProjector.turnOn();

    assertThat(beamProjector.isOn())
        .isTrue();
  }

  @Test
  void beamProjectorPlayVideo() {
    beamProjector.turnOn();

    assertThatCode(() -> beamProjector.playVideo())
        .doesNotThrowAnyException();
  }

  @Test
  void beamProjectorOffShouldThrowException() {
    assertThatThrownBy(() -> beamProjector.playVideo())
        .isInstanceOf(RuntimeException.class);
  }

  @Test
  void beamProjectorTurnOff() {
    beamProjector.turnOff();

    assertThat(beamProjector.isOn())
        .isFalse();
  }
}
