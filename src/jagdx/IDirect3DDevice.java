package jagdx;

import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IUnknown;

public final class IDirect3DDevice extends IUnknown {

   public static final native long CreateCubeTexture(long var0, int var2, int var3, int var4, int var5, int var6);

   public static final int a(long var0, int var2, boolean var3) {
      return SetRenderStateb(var0, var2, var3);
   }

   public static final native long CreateTexture(long var0, int var2, int var3, int var4, int var5, int var6, int var7);

   public static final native int SetVertexShader(long var0, long var2);

   public static final native int UpdateTexture(long var0, long var2, long var4);

   public static final native int SetRenderState(long var0, int var2, int var3);

   public static final native long CreatePixelShader(long var0, byte[] var2);

   public static final native boolean LightEnable(long var0, int var2, boolean var3);

   public static final native long CreateVertexBuffer(long var0, int var2, int var3, int var4, int var5);

   public static final native int SetDepthStencilSurface(long var0, long var2);

   public static final native long CreateOffscreenPlainSurface(long var0, int var2, int var3, int var4, int var5);

   public static final native int EndScene(long var0);

   private IDirect3DDevice() throws Throwable {
      throw new Error();
   }

   public static final native int DrawIndexedPrimitive(long var0, int var2, int var3, int var4, int var5, int var6, int var7);

   public static final native int StretchRect(long var0, long var2, int var4, int var5, int var6, int var7, long var8, int var10, int var11, int var12, int var13, int var14);

   public static final native int SetStreamSource(long var0, int var2, long var3, int var5, int var6);

   private static final native int SetRenderStatef(long var0, int var2, float var3);

   public static final native void GetRenderTargetData(long var0, long var2, long var4);

   public static final native int SetVertexDeclaration(long var0, long var2);

   public static final native int SetScissorRect(long var0, int var2, int var3, int var4, int var5);

   public static final native long GetRenderTarget(long var0, int var2);

   public static final native void Destroy(long var0);

   public static final int a(long var0, int var2, float var3) {
      return SetRenderStatef(var0, var2, var3);
   }

   public static final native long CreateEventQuery(long var0);

   public static final native int SetVertexShaderConstantF(long var0, int var2, long var3, int var5);

   public static final native long CreateVolumeTexture(long var0, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

   public static final native int SetPixelShaderConstantF(long var0, int var2, long var3, int var5);

   public static final native int TestCooperativeLevel(long var0);

   public static final native int BeginScene(long var0);

   public static final native long CreateRenderTarget(long var0, int var2, int var3, int var4, int var5, int var6, boolean var7);

   public static final native int SetRenderTarget(long var0, int var2, long var3);

   public static final native int SetSamplerState(long var0, int var2, int var3, int var4);

   public static final native long CreateIndexBuffer(long var0, int var2, int var3, int var4, int var5);

   public static final native long CreateVertexShader(long var0, byte[] var2);

   public static final native long GetSwapChain(long var0, int var2);

   private static final native int SetRenderStateb(long var0, int var2, boolean var3);

   public static final native long CreateAdditionalSwapChain(long var0, D3DPRESENT_PARAMETERS var2);

   public static final native long GetBackBuffer(long var0, int var2, int var3, int var4);

   public static final native int Clear(long var0, int var2, int var3, float var4, int var5);

   public static final native int SetPixelShader(long var0, long var2);

   public static final native int SetIndices(long var0, long var2);

   public static final native long CreateVertexDeclaration(long var0, long var2);

   public static final native long GetDepthStencilSurface(long var0);

   public static final native int SetTransform(long var0, int var2, float[] var3);

   public static final native int SetTexture(long var0, int var2, long var3);

   public static final native int SetTextureStageState(long var0, int var2, int var3, int var4);

   public static final native int SetViewport(long var0, int var2, int var3, int var4, int var5, float var6, float var7);

   public static final native int Reset(long var0, D3DPRESENT_PARAMETERS var2);

   public static final native int SetLight(long var0, int var2, long var3);

   public static final native long CreateDepthStencilSurface(long var0, int var2, int var3, int var4, int var5, int var6, boolean var7);

   public static final native int DrawPrimitive(long var0, int var2, int var3, int var4);
}
