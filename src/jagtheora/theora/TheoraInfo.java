package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class TheoraInfo extends SimplePeer {

   public int colourSpace;
   public byte versionSubMinor;
   public int aspectNumerator;
   public int frameHeight;
   public int fpsDenominator;
   public int picHeight;
   public int fpsNumerator;
   public byte versionMinor;
   public byte versionMajor;
   public int frameWidth;
   public int picX;
   public int pixelFormat;
   public int aspectDenominator;
   public int picY;
   public int picWidth;


   private final native void init();

   protected final native void clear();

   private static final native void initFields();

   public TheoraInfo() {
      this.init();
      if(this.b()) {
         throw new IllegalStateException();
      }
   }

   static {
      initFields();
   }
}
