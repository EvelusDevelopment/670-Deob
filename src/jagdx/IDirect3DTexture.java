package jagdx;

import jagdx.IDirect3DBaseTexture;

public class IDirect3DTexture extends IDirect3DBaseTexture {

   public static final native int Upload(long var0, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9);

   public static final native int Download(long var0, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9);

   private IDirect3DTexture() throws Throwable {
      throw new Error();
   }

   public static final native long GetSurfaceLevel(long var0, int var2);
}
