package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;

public class SetupInfo extends SimplePeer {

   protected final native void clear();

   public final native int decodeHeader(TheoraInfo var1, TheoraComment var2, OggPacket var3);

}
