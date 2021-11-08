package victor.testing.kata.nuclear;

public class Coords {
   private final int x;
   private final int y;
   private final int z;
   private final int t;

   public Coords withT(int newT) {
      return new Coords(x, y, z, newT);
   }

   public Coords(int x, int y, int z, int t) {
      this.x = x;
      this.y = y;
      this.z = z;
      this.t = t;
   }

   public int getX() {
      return x;
   }

   public int getY() {
      return y;
   }

   public int getZ() {
      return z;
   }

   public int getT() {
      return t;
   }
}
