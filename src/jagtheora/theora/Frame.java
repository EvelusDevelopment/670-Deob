package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class Frame extends SimplePeer {

   public int[] pixels;
   public int a;
   public int b;


   public Frame(int var1, int var2) {
      this.a = var2;
      this.b = var1;
      this.pixels = new int[this.b * this.a];
   }

   protected final native void clear();

   private static final native void init();

   static {
      init();
   }
}
