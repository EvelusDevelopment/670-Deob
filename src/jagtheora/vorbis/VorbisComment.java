package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;

public class VorbisComment extends SimplePeer {

   public VorbisComment() {
      this.init();
      if(this.b()) {
         throw new IllegalStateException();
      }
   }

   protected final native void clear();

   private final native void init();
}
