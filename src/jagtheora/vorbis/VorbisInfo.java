package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;
import jagtheora.vorbis.VorbisComment;

public class VorbisInfo extends SimplePeer {

   public int channels;
   public int rate;


   private static final native void initFields();

   protected final native void clear();

   public VorbisInfo() {
      this.init();
      if(this.b()) {
         throw new IllegalStateException();
      }
   }

   private final native void init();

   public final native int headerIn(VorbisComment var1, OggPacket var2);

   static {
      initFields();
   }
}
