package jagdx;

import jagdx.IDirect3DBaseTexture;

public class IDirect3DCubeTexture extends IDirect3DBaseTexture {

   public static final native int Upload(long var0, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10);

   private IDirect3DCubeTexture() throws Throwable {
      throw new Error();
   }

   public static final native int Download(long var0, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10);
}
