package victor.testing.kata.nuclear;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class NuclearServiceTest {
   @Test
   @Disabled // TODO remove this
   public void aFirstNaiveTest() {
      DistanceService distanceService = new DistanceService();
      ProbeService probeService = new ProbeService();
      NuclearService nuclearService = new NuclearService(distanceService, probeService);
      nuclearService.interpolateQuantum(0,0); // TODO fix and cover rest
   }
}
