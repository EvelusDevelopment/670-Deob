import jaggl.OpenGL;
import java.io.InputStream;

final class jma {

   static int a;
   static int e;
   static int k;
   static int g;
   static boolean[][] d;
   static int b;
   static int h;
   static int f;
   static int j;
   static int f_i;
   static int c;


   static final void a(int var0, boolean var1, Object[] var2) {
      ++b;
      if(var1 != ((boolean[])((boolean[])var2[17]))[23]) {
         ((boolean[])((boolean[])var2[17]))[23] = var1;
         OpenGL.glDepthMask(((boolean[])((boolean[])var2[17]))[23] && ((boolean[])((boolean[])var2[17]))[17]);
         ((int[])((int[])var2[1]))[20] &= -16;
      }

      if(var0 < 118) {
         ((boolean[])((boolean[])var2[7]))[6] = false;
      }

   }

   static final void a(Object[] var0, Object[] var1, int var2, Object[] var3, Object[] var4) {
      ++j;
      OpenGL.glMatrixMode(5888);
      jt.a(var4, var1, 2, (Object[])((Object[])var3[var2]));
      OpenGL.glLoadMatrixf((float[])((float[])((Object[])((Object[])var3[42]))[0]), 0);
      OpenGL.glMatrixMode(5889);
      OpenGL.glLoadMatrixf((float[])((float[])var0[0]), 0);
   }

   static final Object[] a(Object[] wrapper, InputStream input, int size) {
      tb.newIAS3I1Wrapper(wrapper);
      ++e;
      ((int[])((int[])wrapper[1]))[1] = 0;
      ((int[])((int[])wrapper[1]))[2] = 0;
      wrapper[2] = nea.newInputStreamWorker(wrapper);
      wrapper[0] = input;
      ((int[])((int[])wrapper[1]))[0] = 1 + size;
      wrapper[5] = new byte[((int[])((int[])wrapper[1]))[0]];
      wrapper[4] = new Thread((Runnable)(null != wrapper?wrapper[2]:null));
      ((Thread)wrapper[4]).setDaemon(true);
     ((Thread)wrapper[4]).start();
     if(null != wrapper && wrapper.length == 7) {
        coa.b((Object[])null, 3);
     }
     return wrapper;
   }

   static final void a(int var0, byte var1) {
      if(var1 != 115) {
         a((Object[])null, (Object[])null, -82, (Object[])null, (Object[])null);
      }

      ma.r = var0;
      ++f;
      dq.a(67, be.a);
   }

   static final void b(byte var0, Object[] var1) {
      ((int[])((int[])var1[1]))[6] = 0;
      if(var0 != -2) {
         ((byte[])((byte[])var1[4]))[16] = ((byte[])((byte[])var1[30]))[0];
      }

      var1[7] = new byte[256];
      var1[10] = new int[256];
      var1[3] = new boolean[16];
      var1[0] = new byte[4096];
      ((int[])((int[])var1[1]))[1] = 0;
      ++a;
      var1[16] = new int[257];
      var1[2] = new boolean[256];
      var1[5] = new int[16];
      if(null != var1 && -9 == ~var1.length) {
         oa.e = null;
      }

      var1[14] = new byte[6][258];
      var1[9] = new byte[18002];
      var1[6] = new int[6];
      var1[12] = new int[6][258];
      var1[8] = new int[6][258];
      var1[15] = new int[6][258];
      var1[11] = new byte[18002];
   }

   static final Object[] a(byte var0, Object[] var1) {
      nh.a((int)4, var1);
      ++c;
      int var2 = -32 / ((var0 + 4) / 32);
      ((int[])((int[])var1[1]))[22] = 100;
      ((int[])((int[])var1[1]))[0] = -2;
      ((boolean[])((boolean[])var1[0]))[8] = true;
      ((int[])((int[])var1[1]))[42] = 0;
      ((int[])((int[])var1[1]))[43] = -1;
      ((int[])((int[])var1[1]))[46] = -1;
      ((boolean[])((boolean[])var1[0]))[4] = true;
      ((boolean[])((boolean[])var1[0]))[5] = true;
      ((int[])((int[])var1[1]))[4] = -1;
      ((int[])((int[])var1[1]))[19] = 100;
      ((int[])((int[])var1[1]))[18] = -1;
      ((int[])((int[])var1[1]))[20] = 100;
      ((int[])((int[])var1[1]))[14] = 0;
      ((int[])((int[])var1[1]))[25] = 100;
      ((int[])((int[])var1[1]))[44] = -2;
      if(var1 != null && (3 == var1.length && var1[1].equals(Integer.valueOf(2)) || -18 == ~var1.length)) {
         cv.a((Object[])((Object[])ma.m[2]), -19219);
      }

      ((int[])((int[])var1[1]))[26] = 0;
      ((boolean[])((boolean[])var1[0]))[6] = true;
      ((boolean[])((boolean[])var1[0]))[3] = true;
      ((boolean[])((boolean[])var1[0]))[0] = false;
      ((boolean[])((boolean[])var1[0]))[2] = false;
      ((int[])((int[])var1[1]))[5] = -1;
      ((boolean[])((boolean[])var1[0]))[1] = false;
      ((int[])((int[])var1[1]))[2] = -1;
      ((boolean[])((boolean[])var1[0]))[7] = true;
      return var1;
   }

   static final void a(int var0, int var1, byte var2, Object[] var3, int[] var4) {
      ++f_i;
      if(var2 != 25) {
         d = (boolean[][])((boolean[][])((Object[])((Object[])var3[12]))[5]);
      }

      if(var0 > var1) {
         int var5 = (var1 + var0) / 2;
         int var6 = var1;
         int var7 = var4[var5];
         var4[var5] = var4[var0];
         var4[var0] = var7;
         Object var8 = var3[var5];
         var3[var5] = var3[var0];
         var3[var0] = var8;
         int var9 = Integer.MAX_VALUE == var7?0:1;

         for(int var10 = var1; var10 < var0; ++var10) {
            if((var10 & var9) + var7 > var4[var10]) {
               int var11 = var4[var10];
               var4[var10] = var4[var6];
               var4[var6] = var11;
               Object var12 = var3[var10];
               var3[var10] = var3[var6];
               var3[var6++] = var12;
            }
         }

         var4[var0] = var4[var6];
         var4[var6] = var7;
         var3[var0] = var3[var6];
         var3[var6] = var8;
         a(var6 - 1, var1, (byte)25, var3, var4);
         a(var0, var6 + 1, (byte)25, var3, var4);
      }

   }

   static final void a(Object[] var0, byte var1) {
      if(var1 >= -31) {
         a(-80, false, (Object[])null);
      }

      ++g;
      if(null == var0[1]) {
         var0[1] = new int[1];
      }

   }

}
