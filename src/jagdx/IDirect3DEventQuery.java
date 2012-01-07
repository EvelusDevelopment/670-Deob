package jagdx;

import jagdx.IUnknown;

public class IDirect3DEventQuery extends IUnknown {

   private IDirect3DEventQuery() throws Throwable {
      throw new Error();
   }

   public static final native int Issue(long var0);

   public static final native int IsSignaled(long var0);
}
