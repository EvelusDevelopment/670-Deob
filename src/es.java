import jaggl.OpenGL;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

final class es {

   static int f_l;
   static int c;
   static int j;
   static int k;
   static Object[] h = sl.a("21", 0, new Object[1], "21");
   static int b = 0;
   static int g;
   static int a;
   static int f_i;
   static int d;
   static float f;
   static boolean e;


   static final boolean a(Object[] var0, Object[] var1, int var2) {
      if(var2 > -95) {
         f = 0.51218104F;
      }

      ++c;
      return null != var1 && var1.length <= 19;
   }

   static final void a(Object[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      ++k;
      td.a((byte)97, var0);
      kd.a(3042, var0, var4);
      float var7 = 0.35F + (float)var3;
      int var8 = -25 / ((-63 - var1) / 56);
      OpenGL.glColor4ub((byte)(var2 >> 16), (byte)(var2 >> 8), (byte)var2, (byte)(var2 >> 24));
      float var9 = 0.35F + (float)var6;
      OpenGL.glBegin(1);
      OpenGL.glVertex2f(var7, var9);
      OpenGL.glVertex2f(var7, var9 + (float)var5);
      OpenGL.glEnd();
   }

   static final void a(int var0, Object[] var1) {
      if(null == var1[1]) {
         var1[1] = new boolean[1];
      }

      ++f_i;
      if(var0 != 24) {
         a((Object[])null, (byte)68, (ta)null);
      }

   }

   static final void a(int var0, int var1, int var2, int var3, Object[] var4, int var5) {
      ++g;
      int var6;
      if(var4 != null && 12 == var4.length && ((int[])((int[])var4[1])).length == 2) {
         var6 = ((cga)var4[6]).f();
         int var7 = ((int[])((int[])((Object[])((Object[])var4[2]))[1]))[13];
         Object[] var10 = eoa.b;
         int var9 = ((int[])((int[])var10[1]))[1];
         var9 = var9 * var7 / 10 % var6;
         ((cga)var4[6]).b(var9 + -var6 + var0, var2, var3 + var6 + -var9, var5);
      } else {
         var6 = -125 % ((-62 - var1) / 56);
         ((cga)var4[6]).b(var0, var2, var3, var5);
      }
   }

   static final int[][] a(byte var0, Object[] var1, int var2) {
      ++j;
      int[][] var3 = loa.a((byte)-52, var2, (Object[])((Object[])var1[4]));
      int var4 = 32 % ((50 - var0) / 33);
      if(((boolean[])((boolean[])((Object[])((Object[])var1[4]))[0]))[0]) {
         int[] var5 = vea.a(var1, 0, wq.e & -1 + var2, (byte)-8);
         int[] var6 = vea.a(var1, 0, var2, (byte)-8);
         int[] var7 = vea.a(var1, 0, var2 + 1 & wq.e, (byte)-8);
         if(null != var1 && var1.length == 2) {
            return (int[][])null;
         }

         int[] var8 = var3[0];
         int[] var9 = var3[1];
         int[] var10 = var3[2];

         for(int var11 = 0; var11 < fo.b; ++var11) {
            int var15 = (var7[var11] + -var5[var11]) * ((int[])((int[])var1[1]))[1];
            int var16 = (var6[1 + var11 & td.q] - var6[td.q & var11 - 1]) * ((int[])((int[])var1[1]))[1];
            int var17 = var16 >> 12;
            int var18 = var15 >> 12;
            int var19 = var17 * var17 >> 12;
            int var20 = var18 * var18 >> 12;
            int var21 = (int)(4096.0D * Math.sqrt((double)((float)(var19 - (-var20 - 4096)) / 4096.0F)));
            int var12;
            int var13;
            int var14;
            if(0 != var21) {
               var13 = var15 / var21;
               var12 = var16 / var21;
               var14 = 16777216 / var21;
            } else {
               var14 = 0;
               var13 = 0;
               var12 = 0;
            }

            if(((boolean[])((boolean[])var1[3]))[1]) {
               var13 = (var13 >> 1) + 2048;
               var12 = (var12 >> 1) + 2048;
               var14 = (var14 >> 1) + 2048;
            }

            var8[var11] = var12;
            var9[var11] = var13;
            var10[var11] = var14;
         }
      }

      return var3;
   }

   static final Object[] a(Object[] var0, long var1, String var3, byte var4, File var5) throws IOException {
      if(null == var0[1]) {
         var0[1] = new long[2];
      }

      ++d;
      if(0L == ~var1) {
         var1 = Long.MAX_VALUE;
      }

      var0[0] = eca.a(var0, 3);
      if(var4 != -36) {
         h = (Object[])null;
      }

      if(~var5.length() < ~var1) {
         var5.delete();
      }

      var0[2] = new RandomAccessFile(var5, var3);
      ((long[])((long[])var0[1]))[0] = var1;
      ((long[])((long[])var0[1]))[1] = 0L;
      int var6 = ((RandomAccessFile)var0[2]).read();
      if(var6 != -1 && !var3.equals("r")) {
         ((RandomAccessFile)var0[2]).seek(0L);
         ((RandomAccessFile)var0[2]).write(var6);
      }

      if(null != var0 && var0.length == 2) {
         eca.a((Object[])null, -109);
      }

      ((RandomAccessFile)var0[2]).seek(0L);
      return var0;
   }

   static final Object[] a(Object[] var0, byte var1, ta var2) {
      ++f_l;
      if(null != var0 && var0.length == 16 && ((int[])((int[])var0[12])).length == 3) {
         return sfa.a(false, var2, var0);
      } else if(var1 != -13) {
         return (Object[])null;
      } else {
         Object[] var3;
         if(null != var0 && var0.length == 20 && 6 == ((boolean[])((boolean[])var0[8])).length && 2 == ((byte[])((byte[])var0[10])).length) {
            var3 = (Object[])((Object[])var0[18]);
            return var3;
         } else if(null != var0 && 20 == var0.length && ((int[])((int[])var0[12])).length == 7) {
            var3 = null;
            return var3;
         } else if(null != var0 && (var0.length == 12 || 9 == var0.length || var0.length == 4)) {
            return null;
         } else if(null != var0 && 16 == var0.length && 11 == ((int[])((int[])var0[12])).length) {
            return eh.a(var2, (byte)-71, var0);
         } else if(var0 != null && -23 == ~var0.length) {
            var3 = (Object[])((Object[])var0[17]);
            return var3;
         } else if(null != var0 && var0.length == 43 && -47 == ~((int[])((int[])var0[12])).length) {
            return rja.a(var2, (byte)-94, var0);
         } else if(var0 != null && -19 == ~var0.length) {
            Object[] var4 = (Object[])((Object[])woa.a(5, var0)[1]);
            if(null == var0[17]) {
               var0[17] = lv.a((int)((float[])((float[])var4[1]))[1], (int)((float[])((float[])var4[1]))[0], (int)((float[])((float[])var4[1]))[2], 0, ffa.a(var2, (byte)-74, var0, 0));
            }

            var3 = (Object[])((Object[])var0[17]);
            return var3;
         } else if(var0 != null && var0.length == 23) {
            return ph.a(var0, 2, var2);
         } else if(var0 != null && var0.length == 17) {
            return InputStreamWorker.a(0, var2, var0);
         } else if(var0 != null && var0.length == 24) {
            return rv.a((byte)-24, var0, var2);
         } else if(null != var0 && var0.length == 20 && ((byte[])((byte[])var0[10])).length == 4) {
            return lo.a(var0, var2, (byte)-110);
         } else if(var0 != null && -21 == ~var0.length && ((boolean[])((boolean[])var0[8])).length == 7) {
            return vja.a(var1 + 1989, var0, var2);
         } else if(null != var0 && var0.length == 43 && ((byte[])((byte[])var0[10])).length == 9) {
            return mba.a(var2, -86, var0);
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final boolean b(int var0, Object[] var1) {
      if(var0 != -1019) {
         return true;
      } else {
         ++a;
         return null != var1[15];
      }
   }

}
