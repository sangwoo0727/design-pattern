package appliance;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SpeakerTest {

  private Speaker speaker;

  @BeforeEach
  void buySpeaker() {
    speaker = Speaker.setUpSpeaker();
  }

  @Test
  void baseSoundIs50() {
    speaker.turnOn();

    Assertions.assertThat(speaker.getSound())
        .isEqualTo(50);
  }

  @Test
  void upMethodShouldUp10() {
    speaker.turnOn();
    speaker.up();

    Assertions.assertThat(speaker.getSound())
        .isEqualTo(60);
  }

  @Test
  void downMethodShouldDown10() {
    speaker.turnOn();
    speaker.down();

    Assertions.assertThat(speaker.getSound())
        .isEqualTo(40);
  }
}
