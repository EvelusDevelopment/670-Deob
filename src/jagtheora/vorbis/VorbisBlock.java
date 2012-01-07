package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;
import jagtheora.vorbis.DSPState;

public class VorbisBlock extends SimplePeer {

   protected final native void clear();

   public final native int synthesis(OggPacket var1);

   public VorbisBlock(DSPState var1) {
      this.init(var1);
      if(this.b()) {
         throw new IllegalStateException();
      }
   }

   private final native void init(DSPState var1);
}
