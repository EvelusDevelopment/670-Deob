package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisInfo;

public class DSPState extends SimplePeer {

   private final native void init(VorbisInfo var1);

   public final native void blockIn(VorbisBlock var1);

   public final native float[][] pcmOut(int var1);

   public DSPState(VorbisInfo var1) {
      this.init(var1);
      if(this.b()) {
         throw new IllegalStateException();
      }
   }

   public final native void read(int var1);

   public final native double granuleTime();

   protected final native void clear();
}
