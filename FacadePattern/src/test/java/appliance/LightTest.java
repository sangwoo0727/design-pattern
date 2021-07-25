package appliance;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class LightTest {

  private Light light;

  @BeforeEach
  void BuyLight() {
    light = Light.setUpLight();
  }

  @Test
  void baseBrightIs50() {
    light.turnOn();

    Assertions.assertThat(light.getBright())
        .isEqualTo(50);
  }

  @Test
  void upMethodShouldUpBright10() {
    light.turnOn();
    light.up();

    Assertions.assertThat(light.getBright())
        .isEqualTo(60);
  }

  @Test
  void downMethodShouldDownBright10() {
    light.turnOn();
    light.down();

    Assertions.assertThat(light.getBright())
        .isEqualTo(40);
  }
}
