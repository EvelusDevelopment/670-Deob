package jagdx;

import jagdx.D3DADAPTER_IDENTIFIER;
import jagdx.D3DCAPS;
import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IUnknown;
import java.awt.Component;

public class IDirect3D extends IUnknown {

   public static final native long Direct3DCreate();

   public static final native int CheckDeviceMultiSampleType(long var0, int var2, int var3, int var4, boolean var5, int var6);

   public static final native long CreateDeviceContext(long var0, int var2, int var3, Component var4, int var5, D3DPRESENT_PARAMETERS var6);

   public static final native int GetDeviceCaps(long var0, int var2, int var3, D3DCAPS var4);

   public static final native int CheckDeviceType(long var0, int var2, int var3, int var4, int var5, boolean var6);

   public static final native int GetAdapterCount(long var0);

   public static final native int GetAdapterDisplayMode(long var0, int var2, D3DDISPLAYMODE var3);

   public static final native int GetAdapterIdentifier(long var0, int var2, int var3, D3DADAPTER_IDENTIFIER var4);

   public static final native int CheckDeviceFormat(long var0, int var2, int var3, int var4, int var5, int var6, int var7);

   private IDirect3D() throws Throwable {
      throw new Error();
   }

   public static final native int CheckDepthStencilMatch(long var0, int var2, int var3, int var4, int var5, int var6);
}
