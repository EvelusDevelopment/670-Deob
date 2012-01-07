package jagtheora.ogg;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPage;

public class OggSyncState extends SimplePeer {

   public final native long pageSeek(OggPage var1);

   protected final native void clear();

   public OggSyncState() {
      this.init();
      if(this.b()) {
         throw new IllegalStateException();
      }
   }

   public final native boolean reset();

   public final native boolean write(byte[] var1, int var2);

   private final native void init();

   public final native int pageOut(OggPage var1);
}
