package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class TheoraComment extends SimplePeer {

   private final native void init();

   public TheoraComment() {
      this.init();
      if(this.b()) {
         throw new IllegalStateException();
      }
   }

   protected final native void clear();
}
