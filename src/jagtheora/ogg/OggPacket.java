package jagtheora.ogg;

import jagtheora.misc.SimplePeer;

public class OggPacket extends SimplePeer {

   public final native int isHeader();

   public final native boolean isVorbis();

   public final native boolean isTheora();

   public final native int isKeyFrame();

   public final native byte[] getData();

   protected final native void clear();
}
