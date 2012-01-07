import jaggl.OpenGL;

final class pga {

   static int c;
   static int e;
   static float[] h = new float[3];
   static int[] g = new int[32];
   static int b;
   static int f;
   static int f_i;
   static int a;
   static int j;
   static int d;


   static final void a(Object[] var0, int var1) {
      OpenGL.glLightfv(16384, 4611, (float[])((float[])var0[5]), 0);
      ++c;
      OpenGL.glLightfv(16385, 4611, (float[])((float[])var0[6]), var1);
   }

   static final void a(int var0, int var1, Object[] var2, Object[] var3) {
      if(var1 != 8) {
         b((Object[])((Object[])var3[0]), 77);
      }

      ++f_i;
   }

   static final int c(Object[] var0, int var1) {
      if(var1 != 1) {
         return 115;
      } else {
         ++e;
         return ((int[])((int[])var0[1]))[1];
      }
   }

   static final Object[] a(int var0, boolean var1, Object[] var2, int var3, Object[] var4, int var5, int var6, int var7, int var8, ta var9, Object[] var10) {
      ++f;
      if(var4[1] == null) {
         var4[1] = new int[7];
      }

      if(var4[4] == null) {
         var4[4] = new byte[2];
      }

      if(var4[8] == null) {
         var4[8] = new boolean[4];
      }

      ee.b(var4, 1);
      tn var12 = new tn(var4);
      ((int[])((int[])var4[1]))[6] = ((int[])((int[])var2[1]))[13];
      ((int[])((int[])var4[1]))[3] = var0;
      ((byte[])((byte[])var4[4]))[0] = (byte)var3;
      ((boolean[])((boolean[])var4[8]))[2] = -1 != var6;
      ((int[])((int[])var4[1]))[5] = var5;
      ((boolean[])((boolean[])var4[8]))[0] = var1;
      var4[6] = var12;
      var4[2] = var10;
      ((byte[])((byte[])var4[4]))[1] = (byte)var8;
      ((boolean[])((boolean[])var4[8]))[3] = var9.n() && ((boolean[])((boolean[])var2[0]))[10] && !((boolean[])((boolean[])var4[8]))[0];
      var4[3] = lea.a(var10, false, (byte)-89, new Object[6]);
      et.a(false, var6, var4, 3, 1);
      if(null != var10 && 1 == var10.length) {
         et.a(true, -76, (Object[])null, 3, -101);
      }

      if(var7 > -126) {
         c((Object[])((Object[])((Object[])((Object[])var2[1]))[0]), 69);
      }

      return var4;
   }

   static final boolean a(byte var0, Object[] var1, int var2) {
      ++a;
      int var3 = 79 / ((73 - var0) / 36);
      return ((er[])((er[])var1[2]))[var2].k;
   }

   static final boolean a(int var0, Object[] var1, int var2) {
      ++b;
      if(var2 != 1) {
         ((boolean[])((boolean[])var1[5]))[23] = false;
      }

      return (1 & ((int[])((int[])var1[1]))[0] >> 1 + var0) != 0;
   }

   static final byte a(boolean var0, Object[] var1) {
      if(var0) {
         a((Object[])null, -20);
      }

      ++d;
      byte[] var10001 = (byte[])((byte[])var1[2]);
      int[] var10002 = (int[])((int[])var1[1]);
      int var10005 = ((int[])((int[])var1[1]))[0];
      var10002[0] = ((int[])((int[])var1[1]))[0] + 1;
      return (byte)(-128 + var10001[var10005]);
   }

   static final lua b(Object[] var0, int var1) {
      ++j;
      return null != var0 && -6 == ~var0.length?(lua)var0[3]:(var0 != null && -5 == ~var0.length?(lua)var0[0]:(var1 != 0?(lua)null:null));
   }

}
