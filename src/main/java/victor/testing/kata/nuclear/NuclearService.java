package victor.testing.kata.nuclear;

import java.time.LocalDateTime;

/**
 *  Write automated tests for the code below, such that any line here is altered (changed in any way) a test would fail indicating a bug.
 *  Assume the code is super-critical. Human lives depend on it.
 *  Therefore, if any refactoring is required before testing, only perform 100% safe moves.
 *  For some methods, you might need to rely on mocks or alternative dummy implems.
 */
public class NuclearService {
   private final DistanceService distanceService;
   private final ProbeService probeService;

   int phaserThreshold;

   public NuclearService(DistanceService distanceService, ProbeService probeService) {
      this.distanceService = distanceService;
      this.probeService = probeService;
   }

   // TODO test me
   public double interpolateQuantum(int atoms, double mark1) {
      if (atoms - phaserThreshold < 5) {
         throw new IllegalStateException("Too few atoms");
      }
      System.out.println("Processing mass " + atoms);
      double mark2 = 0;
      if (atoms > 2 * phaserThreshold) {
         mark2 = mark1 / 2;
      }
      return atoms * mark1 + mark1 * mark1 - mark2;
   }

   // TODO test me
   public boolean hasRequiredMass(int quanta, int speed, int destinationSolarSystemId) {
      long distance = distanceService.distanceTo(destinationSolarSystemId);
      return distance / speed > quanta;
   }

   // TODO test me
   public void reportProbeStats(Coords coords, double gravity) {
      if (!probeService.hasStatsNear(coords)) {
         Coords newCoords = coords.withT(coords.getT() * 2);
         probeService.reportStats(newCoords, gravity, LocalDateTime.now());
      } else {
         System.out.println("Ignoring duplicate stats at: " + coords);
      }
   }
}


