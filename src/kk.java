import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;
import jagdx.fna;
import java.nio.Buffer;
import java.nio.ByteBuffer;

final class kk implements re, lua {

   static int k;
   static boolean a;
   static int h = 2;
   static int m;
   static Object[] c = nea.a((byte)-58, new Object[1], 3);
   static int f;
   Object[] j;
   static int b;
   static int f_i;
   static int g = 0;
   static int e;
   static int f_l;
   static int d;


   static final void a(int var0, int var1, Object[] var2, int var3) {
      try {
         ++f_i;
         if(var1 != 0) {
            a(-113, ((int[])((int[])var2[2]))[3], (Object[])null, -31);
         }

         throw new RuntimeException("");
      } catch (RuntimeException var5) {
         throw vt.a(var5, "kk.B(" + var0 + ',' + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ')');
      }
   }

   kk(Object[] var1) {
      this.j = var1;
   }

   public final int b() {
      ++b;
      Object[] var2 = this.j;
      int var1 = ((int[])((int[])var2[1]))[2];
      return var1;
   }

   public final int c() {
      ++m;
      return mba.a(this.j, false);
   }

   static final void a(int var0, Object[] var1, int var2, int var3, byte var4, int var5, int var6, int[] var7) {
      ++k;
      long var8 = IDirect3DTexture.GetSurfaceLevel(((long[])((long[])var1[2]))[0], 0);
      long var10 = IDirect3DDevice.CreateRenderTarget(((long[])((long[])((Object[])((Object[])var1[0]))[50]))[5], var3, var0, 21, 0, 0, true);
      if(var4 != -51) {
         f_l = -14;
      }

      if(fna.a(IDirect3DDevice.StretchRect(((long[])((long[])((Object[])((Object[])var1[0]))[50]))[5], var8, var2, var6, var3, var0, var10, 0, 0, var3, var0, 1), (byte)91)) {
         IDirect3DSurface.Download(var10, 0, 0, var3, var0, var3 * 4, 16, ((long[])((long[])((Object[])((Object[])var1[0]))[50]))[0]);
         ((Buffer)((Object[])((Object[])var1[0]))[57]).clear();
         ((ByteBuffer)((Object[])((Object[])var1[0]))[57]).asIntBuffer().get(var7);
      }

      IUnknown.Release(var8);
      IUnknown.Release(var10);
   }

   public final void a() {
      ++f;
      cma.a(-1, this.j);
   }

   private final void a(byte var1) throws Throwable {
      ++d;
      if(var1 <= -111) {
         super.finalize();
      }
   }

   protected final void finalize() throws Throwable {
      ++e;
      Object[] var1 = this.j;
      if(-1 > ~((int[])((int[])var1[1]))[0]) {
         ec.a(((int[])((int[])((Object[])((Object[])var1[0]))[0]))[0] * ((int[])((int[])var1[1]))[1] * ((int[])((int[])var1[1]))[2] * ((int[])((int[])((Object[])((Object[])var1[2]))[0]))[1], ((int[])((int[])var1[1]))[0], (Object[])((Object[])var1[3]), (byte)-21);
         ((int[])((int[])var1[1]))[0] = 0;
      }

      ((kk)var1[4]).a((byte)-126);
   }

}
