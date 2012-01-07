import jaggl.OpenGL;
import java.util.Random;

final class kla {

   static int c;
   static int b;
   static int g;
   static int f_i;
   static Object[] f;
   static int d;
   static Object[] j = sd.a(new Object[1], 28, (byte)123);
   static Object[] a = ho.a(11, 89, new Object[1], true);
   static int h;
   static int e;


   static final void b(byte var0, Object[] var1) {
      if(null == var1[4]) {
         var1[4] = new long[1];
      }

      if(var0 > 59) {
         ++f_i;
         if(null == var1[5]) {
            var1[5] = new int[2];
         }

      }
   }

   static final Object[] a(int var0, Object[] var1, boolean var2) {
      ++b;
      jp.a((byte)97, var1);
      Random var3 = new Random((long)var0);

      int var4;
      for(var4 = 0; var4 < 256; ++var4) {
         ((int[])((int[])var1[0]))[var4] = ((int[])((int[])var1[0]))[var4 + 256] = var4;
      }

      if(null != var1 && (var1.length == 20 || -9 == ~var1.length && var1[1].equals(Integer.valueOf(1)))) {
         jp.a((byte)118, (Object[])null);
      }

      if(var2) {
         return (Object[])null;
      } else {
         for(var4 = 0; 256 > var4; ++var4) {
            int var5 = var3.nextInt() & 255;
            int var6 = ((int[])((int[])var1[0]))[var5];
            ((int[])((int[])var1[0]))[var5] = ((int[])((int[])var1[0]))[256 + var5] = ((int[])((int[])var1[0]))[var4];
            ((int[])((int[])var1[0]))[var4] = ((int[])((int[])var1[0]))[var4 + 256] = var6;
         }

         return var1;
      }
   }

   static final Object[] a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, Object[] var7) {
      af.a(0, var7);
      ++g;
      ((int[])((int[])var7[0]))[0] = var0;
      ((int[])((int[])var7[0]))[2] = 128;
      ((int[])((int[])var7[0]))[4] = 128;
      ((int[])((int[])var7[0]))[1] = var1;
      ((int[])((int[])var7[0]))[4] = var2;
      ((int[])((int[])var7[0]))[2] = var5;
      ((int[])((int[])var7[var6]))[3] = var4;
      ((int[])((int[])var7[0]))[5] = var3;
      return var7;
   }

   static final Object[] a(Object[] var0, Object[] var1, byte var2) {
      if(var2 != -100) {
         a(((int[])((int[])var1[0]))[0], -77, 82, 54, 45, -56, 73, (Object[])null);
      }

      aa.a(var2 ^ -15054, var1, var0);
      ++e;
      return var0;
   }

   static final void a(byte var0, Object[] var1) {
      if(var0 != -58) {
         a((Object[])((Object[])f[13]), (Object[])((Object[])((Object[])((Object[])j[27]))[3]), (byte)-56);
      }

      ++d;
      if(((int[])((int[])var1[1]))[1] > 0) {
         ((int[])((int[])((Object[])((Object[])var1[4]))[1]))[26] -= qka.a(var0 - 23806, var1);
         int[] var2 = new int[]{((int[])((int[])var1[1]))[1]};
         OpenGL.glDeleteTextures(1, var2, 0);
         ((int[])((int[])var1[1]))[1] = 0;
      }

   }

   static final ii c(byte var0, Object[] var1) {
      ++c;
      ii[] var2 = new ii[5];
      int var3 = 0;
      int var5;
      synchronized(((Object[])((Object[])var1[0]))[2]) {
         if(null != var1 && (-3 == ~var1.length || 2 == var1.length && var1[1].equals(Integer.valueOf(1)))) {
            return null;
         }

         for(var5 = 0; 5 > var5; ++var5) {
            if(-1 != ((int[])((int[])var1[4]))[var5]) {
               var2[var3++] = ii.a((Object[])((Object[])((Object[])((Object[])var1[0]))[2]), ((int[])((int[])var1[4]))[var5], (int)0);
            }
         }
      }

      if(var0 > -61) {
         a(-79, ((int[])((int[])((Object[])((Object[])var1[1]))[2]))[9], -101, ((int[])((int[])f[0]))[1], -38, -26, 19, (Object[])((Object[])j[2]));
      }

      for(int var4 = 0; 5 > var4; ++var4) {
         if(null != var2[var4] && var2[var4].a < 13) {
            var2[var4].a(2);
         }
      }

      ii var8 = new ii(var2, var3);
      if(var1 != null && var1.length == 1 && var1[0].equals(Integer.valueOf(2))) {
         return null;
      } else {
         if(var1[1] != null) {
            if(var1 != null && var1.length == 2 && var1[1].equals(Integer.valueOf(1))) {
               return null;
            }

            for(var5 = 0; var5 < ((short[])((short[])var1[1])).length; ++var5) {
               var8.b(((short[])((short[])var1[1]))[var5], ((short[])((short[])var1[3]))[var5]);
            }
         }

         if(var1[5] != null) {
            if(var1 != null && (-5 == ~var1.length || 9 == var1.length)) {
               return null;
            }

            for(var5 = 0; ((short[])((short[])var1[5])).length > var5; ++var5) {
               var8.a(((short[])((short[])var1[5]))[var5], ((short[])((short[])var1[2]))[var5]);
            }
         }

         return var8;
      }
   }

}
