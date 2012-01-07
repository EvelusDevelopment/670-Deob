import jagdx.IDirect3DCubeTexture;
import jagdx.IDirect3DDevice;
import java.nio.ByteBuffer;

final class td extends lm {

   static int q;
   static int f_l;
   static int o;
   static int n = 13156520;
   static int j;
   Object[] k;
   static int m;
   static int r = 100;
   static int p;


   static final int a(Object[] var0, int var1) {
      if(var1 < 71) {
         return 51;
      } else {
         ++o;
         ((int[])((int[])var0[1]))[0] += 3;
         return (255 & ((byte[])((byte[])var0[2]))[-1 + ((int[])((int[])var0[1]))[0]]) + (((byte[])((byte[])var0[2]))[((int[])((int[])var0[1]))[0] - 3] << 16 & 16711680) + ((255 & ((byte[])((byte[])var0[2]))[-2 + ((int[])((int[])var0[1]))[0]]) << 8);
      }
   }

   static final void a(int var0, Object[] var1, int var2) {
      ++m;
      if(var2 != 5) {
         a(((boolean[])((boolean[])var1[2]))[1], ((boolean[])((boolean[])var1[1]))[14], -63, (Object[])((Object[])var1[2]), (Object[])null, (int[][])((int[][])var1[2]));
      }

      Object[] var3;
      Object[] var6;
      byte[] var7;
      Object[] var9;
      byte[] var10;
      if(((boolean[])((boolean[])var1[0]))[0]) {
         var3 = (Object[])((Object[])var1[5]);
         var6 = (Object[])((Object[])var1[2]);
         if(var6 == null) {
            throw new IllegalStateException();
         }

         var9 = dq.a(4, 0, var0, var6);
         if(null != var9) {
            var10 = sh.a(var9, (byte)93);
            ((lm)(null == var9?null:var9[1])).a((byte)90);
            var7 = var10;
         } else {
            var7 = null;
         }

         var3[var0] = var7;
      } else {
         var3 = (Object[])((Object[])var1[5]);
         var6 = (Object[])((Object[])var1[2]);
         if(null == var6) {
            throw new IllegalStateException();
         }

         var9 = dq.a(4, 0, var0, var6);
         if(var9 == null) {
            var7 = null;
         } else {
            var10 = sh.a(var9, (byte)75);
            ((lm)(null == var9?null:var9[1])).a((byte)61);
            var7 = var10;
         }

         var3[var0] = fja.a(-137, var7, false);
      }

   }

   td(Object[] var1) {
      this.k = var1;
   }

   static final rha b(Object[] var0, int var1) {
      if(var1 >= -66) {
         ((int[])((int[])var0[1]))[18] = -81;
      }

      ++f_l;
      return new rha(var0);
   }

   static final Object[] a(boolean var0, boolean var1, int var2, Object[] var3, Object[] var4, int[][] var5) {
      if(var3[8] == null) {
         var3[8] = new int[1];
      }

      ++p;
      qb.a(vk.f, var3, ah.f, var0 && ((boolean[])((boolean[])var4[63]))[22], 6 * var2 * var2, -31470, var4);
      ((int[])((int[])var3[8]))[0] = var2;
      if(!((boolean[])((boolean[])var3[3]))[0]) {
         ((long[])((long[])var3[2]))[0] = IDirect3DDevice.CreateCubeTexture(((long[])((long[])((Object[])((Object[])var3[0]))[50]))[5], ((int[])((int[])var3[8]))[0], 1, 0, 21, 1);
      } else {
         ((long[])((long[])var3[2]))[0] = IDirect3DDevice.CreateCubeTexture(((long[])((long[])((Object[])((Object[])var3[0]))[50]))[5], ((int[])((int[])var3[8]))[0], 0, 1024, 21, 1);
      }

      if(!var1) {
         return (Object[])null;
      } else {
         ByteBuffer var6 = (ByteBuffer)((Object[])((Object[])var3[0]))[57];

         for(int var7 = 0; 6 > var7; ++var7) {
            var6.clear();
            var6.asIntBuffer().put(var5[var7]);
            IDirect3DCubeTexture.Upload(((long[])((long[])var3[2]))[0], var7, 0, 0, 0, ((int[])((int[])var3[8]))[0], ((int[])((int[])var3[8]))[0], 4 * ((int[])((int[])var3[8]))[0], 0, ((long[])((long[])((Object[])((Object[])var3[0]))[50]))[0]);
         }

         return var3;
      }
   }

   static final void a(byte var0, Object[] var1) {
      if(-2 != ~((int[])((int[])var1[1]))[20]) {
         cea.a(var1, false);
         cka.a(20, var1, false);
         pda.a(var1, -21342, false);
         wma.a(-1000, var1, false);
         jma.a(126, false, var1);
         moa.a((byte)105, (Object[])null, var1);
         jia.a(var1, 0, -2);
         za.a(1, -20929, var1);
         ((int[])((int[])var1[1]))[20] = 1;
      }

      int var2 = 98 / ((33 - var0) / 40);
      ++j;
   }

}
