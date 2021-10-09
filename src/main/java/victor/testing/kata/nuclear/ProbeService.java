package victor.testing.kata.nuclear;

import java.time.LocalDateTime;

public class ProbeService {
   public boolean hasStatsNear(Coords coord) {
      throw new IllegalStateException("Can't call this from tests!");
   }

   public void reportStats(Coords coord, double gravity, LocalDateTime timeStamp) {
      throw new IllegalStateException("Can't call this from tests!");
   }
}
