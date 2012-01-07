package jagdx;

import jagdx.IUnknown;

public class IDirect3DVertexBuffer extends IUnknown {

   public static final native void Unlock(long var0);

   public static final native int Upload(long var0, int var2, int var3, int var4, long var5);

   private IDirect3DVertexBuffer() throws Throwable {
      throw new Error();
   }

   public static final native int Download(long var0, int var2, int var3, int var4, long var5);

   public static final native long Lock(long var0, int var2, int var3, int var4);
}
