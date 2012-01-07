package jagtheora.ogg;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;

public class OggStreamState extends SimplePeer {

   public OggStreamState(int var1) {
      if(!this.init(var1)) {
         throw new IllegalStateException();
      }
   }

   public final native boolean pageIn(OggPage var1);

   public final native boolean isEOS();

   public final native int packetPeek();

   private final native boolean init(int var1);

   public final native int packetPeek(OggPacket var1);

   public final native int packetOut(OggPacket var1);

   public final native int packetOut();

   public final native boolean reset();

   protected final native void clear();

   public final native boolean resetSerialNo(int var1);
}
