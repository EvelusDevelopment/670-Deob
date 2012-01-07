import jagdx.IDirect3DTexture;
import java.nio.ByteBuffer;

final class wh {

   static int b;
   static int d;
   static int g;
   static int e;
   static int a = 0;
   static int f;
   static boolean[] c = new boolean[8];


   static final void a(int var0, int var1, boolean var2, int var3, int var4) {
      ++g;
      float var5 = (float)eka.K / (float)eka.f;
      int var6 = var1;
      int var7 = var4;
      if(var5 >= 1.0F) {
         var6 = (int)((float)var4 / var5);
      } else {
         var7 = (int)(var5 * (float)var1);
      }

      var0 -= (var4 - var7) / 2;
      var3 -= (-var6 + var1) / 2;
      dq.f = -1;
      rd.s = -1;
      if(!var2) {
         a = 105;
      }

      jw.c = -(var0 * eka.K / var7) + eka.K;
      ln.b = eka.f * var3 / var6;
      sia.a((byte)-68);
   }

   static final int a(byte var0, Object[] var1) {
      if(var0 != -31) {
         return -51;
      } else {
         ++d;
         return ((int[])((int[])var1[1]))[0];
      }
   }

   static final Object[] a(int var0, int var1, int var2) {
      Object[] var3 = ju.g[var0][var1][var2];
      return var3 == null?null:(Object[])((Object[])var3[3]);
   }

   static final void a(Object[] var0, int var1) {
      ++b;
      if(var1 < -70) {
         if(var0[1] == null) {
            var0[1] = new int[2];
         }

      }
   }

   static final void a(int var0, Object[] var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      try {
         ++f;
         if(var1[4] == ah.f && vk.f == var1[1]) {
            ByteBuffer var8 = (ByteBuffer)((Object[])((Object[])var1[0]))[57];
            var8.clear();
            IDirect3DTexture.Download(((long[])((long[])var1[var6]))[0], 0, var3, var5, var4, var2, var4 * 4, 0, ((long[])((long[])((Object[])((Object[])var1[0]))[50]))[0]);
            var8.asIntBuffer().get(var7, var0, var2 * var4);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var9) {
         throw vt.a(var9, "wh.D(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + (var7 != null?"{...}":"null") + ')');
      }
   }

}
