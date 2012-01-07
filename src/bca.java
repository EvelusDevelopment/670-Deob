import jaggl.OpenGL;

final class bca extends ya {

   static int M;
   static int H;
   static int J;
   static int G;
   static int B;
   static int E;
   static int[][] D = new int[5][5000];
   static int C;
   static Object[] F;
   static int z;
   static Object[] y = nla.a(78, new Object[0], 8);
   static int[] L = new int[]{16776960, 16711680, '\uff00', '\uffff', 16711935, 16777215};
   Object[] I;
   static int N;
   static Object[] K = sd.a(new Object[1], 18, (byte)118);


   static final int a(Object[] var0, boolean var1) {
      ++M;
      if(var1) {
         a((int[])null, ((int[])((int[])F[1]))[0], (short[])null, (Object[])null, ((long[])((long[])var0[3]))[8], (short[])null);
      }

      return ((int[])((int[])var0[0]))[1] & 16383;
   }

   static final Object[] a(byte var0, Object[] var1, Object[] var2, int var3, Object[] var4, Object[] var5, int var6, boolean var7) {
      gp.a(var4, -80);
      if(var0 < 102) {
         return (Object[])null;
      } else {
         ++N;
         ra.a(var4, false);
         var4[0] = soa.a(var4, (byte)125);
         var4[5] = var5;
         ((int[])((int[])var4[1]))[1] = var3;
         ((int[])((int[])var4[1]))[2] = var6;
         var4[3] = var1;
         var4[6] = var2;
         ((boolean[])((boolean[])var4[4]))[0] = var7;
         OpenGL.glGenTextures(1, mfa.b, 0);
         ((int[])((int[])var4[1]))[0] = mfa.b[0];
         if(null != var1 && var1.length == 4) {
            return null;
         } else {
            df.a((int)23060, var4);
            cd.a(0, 5, var4);
            return var4;
         }
      }
   }

   static final int b(int var0, int var1, int var2) {
      ++C;
      int var3 = var2 >>> 24;
      var2 = (var3 * (var1 & var2) & 16711680 | (16711935 & var2) * var3 & -16711936) >>> 8;
      int var4 = -var3 + 255;
      return var2 + ((var4 * ('\uff00' & var0) & 16711680 | (var0 & 16711935) * var4 & -16711936) >>> 8);
   }

   bca(Object[] var1) {
      this.I = var1;
   }

   static final void a(Object[] var0, Object[] var1, int var2, int var3, int var4) {
      if(var2 != 1) {
         if(var2 == 2) {
            ((int[])((int[])var0[1]))[2] = de.a(var3 + 25240, var1) + 1;
            ((int[])((int[])var0[1]))[0] = 1 + de.a((int)0, var1);
         } else if(var2 == 3) {
            ipa.a(var1, (int)-112);
         } else if(var2 != 4) {
            if(var2 == 5) {
               ((int[])((int[])var0[1]))[4] = fh.a(var1, false);
            } else if(6 != var2) {
               if(var2 == 7) {
                  ((boolean[])((boolean[])var0[0]))[0] = true;
               }
            } else {
               ((boolean[])((boolean[])var0[0]))[1] = true;
            }
         } else {
            ((int[])((int[])var0[1]))[3] = fh.a(var1, false);
         }
      } else {
         ((int[])((int[])var0[1]))[1] = de.a((int)0, var1);
         if(((int[])((int[])var0[1]))[1] == '\uffff') {
            ((int[])((int[])var0[1]))[1] = -1;
         }
      }

      if(var3 != -25240) {
         a((byte)-85, (String)null);
      }

      ++G;
   }

   static final void a(Object[] var0, byte var1, ka var2, Object[] var3) {
      if(var1 < 86) {
         b(-82, (Object[])null);
      }

      ++E;
      if(ih.a(var0, 0) && ih.a(var3, 0)) {
         Object[] var4 = (Object[])((Object[])var0[4]);
         Object[] var5 = (Object[])((Object[])var3[4]);
         var2.a(((int[])((int[])var0[1]))[3], (Object[])((Object[])((Object[])((Object[])var3[2]))[2]), (Object[])((Object[])((Object[])((Object[])var3[2]))[3]), ((int[])((int[])((Object[])((Object[])var3[2]))[1]))[1], false, ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[1], ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[0], ((int[])((int[])var4[5]))[((int[])((int[])var0[1]))[4]], (Object[])((Object[])((Object[])((Object[])var0[2]))[3]), ((int[])((int[])var5[5]))[((int[])((int[])var3[1]))[4]], (boolean[])((boolean[])var4[9]), ((int[])((int[])((Object[])((Object[])var3[2]))[1]))[0], (Object[])((Object[])((Object[])((Object[])var0[2]))[2]), ((int[])((int[])var3[1]))[3], ((boolean[])((boolean[])var5[4]))[1] | ((boolean[])((boolean[])var4[4]))[1]);
      }

   }

   static final int c(int var0, Object[] var1) {
      ++H;
      if(var0 != 3) {
         a(((byte[])((byte[])var1[0]))[0], (String)null);
      }

      return ((int[])((int[])var1[12]))[3];
   }

   static final int a(byte var0, String var1) {
      int var2 = 22 % ((-58 - var0) / 62);
      ++J;
      return bi.a(10, -49, var1, true);
   }

   static final boolean b(int var0, Object[] var1) {
      ++B;
      return var1 != null?(((boolean[])((boolean[])var1[9]))[1]?(var0 != 2?((boolean[])((boolean[])((Object[])((Object[])K[3]))[2]))[6]:(hta.a(var0 ^ -93, var1, eka.d)?(null != pm.a((long)((int[])((int[])var1[1]))[4], hqa.c, false)?false:null == pm.a((long)((int[])((int[])var1[1]))[7], soa.f, false)):false)):false):false;
   }

   static final Object[] a(int[] var0, int var1, short[] var2, Object[] var3, long var4, short[] var6) {
      if(var3[0] == null) {
         var3[0] = new long[1];
      }

      int var7 = 91 % ((79 - var1) / 42);
      ++z;
      var3[3] = var6;
      ((long[])((long[])var3[0]))[0] = var4;
      var3[2] = var2;
      var3[1] = var0;
      return var3;
   }

}
