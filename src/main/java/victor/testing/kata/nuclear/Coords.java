package victor.testing.kata.nuclear;

import lombok.Value;

@Value
public class Coords {
   int x;
   int y;
   int z;
   int t;

   public Coords withT(int newT) {
      return new Coords(x, y, z, newT);
   }
}
