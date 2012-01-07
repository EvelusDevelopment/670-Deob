
final class wsa {

   static int f_i;
   static int f;
   static int h;
   static int c;
   static int j;
   static int a;
   static int d;
   static int e = 0;
   static Object[] g = null;
   static int b;


   static final void a(Object[] var0, byte var1, int var2) {
      ++f;
      Object[] var3 = ro.a(var1 ^ 114, var0);
      if(((int[])((int[])var3[1]))[17] != 0 || -1 != ~((int[])((int[])var0[12]))[27]) {
         Object[] var4 = (Object[])((Object[])var0[35]);
         if(var1 != 113) {
            ((long[])((long[])var0[16]))[0] = ((long[])((long[])var0[0]))[0];
         }

         ((int[])((int[])var4[0]))[1] &= 16383;
         int var5 = 16383 & -((int[])((int[])((Object[])((Object[])var0[35]))[0]))[1] + var2;
         if(var5 <= 8192) {
            ((int[])((int[])var0[12]))[31] = ((int[])((int[])((Object[])((Object[])var0[35]))[0]))[1] + var5;
         } else {
            ((int[])((int[])var0[12]))[31] = ((int[])((int[])((Object[])((Object[])var0[35]))[0]))[1] + var5 - 16384;
         }

      }
   }

   static final void a(Object[] var0, int var1) {
      ((long[])((long[])var0[50]))[6] = 0L;
      ++f_i;
      ((long[])((long[])var0[50]))[5] = 0L;
      var0[75] = ura.a(-18, new Object[2]);
      ((long[])((long[])var0[50]))[4] = 0L;
      int var2 = -49 / ((-67 - var1) / 58);
      ((long[])((long[])var0[50]))[3] = 0L;
      ((long[])((long[])var0[50]))[2] = 0L;
      ((int[])((int[])var0[1]))[43] = 0;
      if(var0 == null || var0.length != 1) {
         ((int[])((int[])var0[1]))[42] = 128;
         var0[86] = new float[16];
         ((boolean[])((boolean[])var0[63]))[21] = false;
         ((int[])((int[])var0[1]))[40] = 0;
         var0[74] = new long[((int[])((int[])var0[1]))[42]];
      }
   }

   static final void a(int var0, int var1) {
      ++j;
      if(var1 == 9) {
         oc var2;
         Object[] var3 = (var2 = (oc)pm.a((long)var0, fo.c, false)) != null?var2.n:null;
         if(var3 != null) {
            ((boolean[])((boolean[])var3[3]))[0] = !((boolean[])((boolean[])var3[3]))[0];
            eh.a((Object[])((Object[])var3[2]), -119, ((boolean[])((boolean[])var3[3]))[0]);
         }

      }
   }

   static final Object[] a(byte var0, Object[] var1, Object[] var2) {
      if(null == var1[1]) {
         var1[1] = new int[4];
      }

      ++a;
      var1[10] = var2;
      if(var0 >= -38) {
         ((int[])((int[])var2[1]))[2] = 4;
      }

      ln.a(-28834, var1);
      return var1;
   }

   static final void a(byte var0) {
      if(var0 != -1) {
         a((Object[])null, false);
      }

      ++h;
      if(sfa.f_i != null) {
         Object[][] var1 = sfa.f_i;

         for(int var2 = 0; var1.length > var2; ++var2) {
            Object[] var3 = var1[var2];
            if(null != var3 && 4 == var3.length) {
               if(lna.g != var3[0]) {
                  ((boolean[])((boolean[])var3[1]))[0] = true;
                  var3[0] = lna.g;
               }

               ((ta)var3[0]).Z(3, 0);
               if(var3 != null && (-6 == ~var3.length || -14 == ~var3.length)) {
                  ug.b = ((boolean[])((boolean[])((Object[])((Object[])wga.g[0]))[7]))[20];
               }

               Object[][] var4 = (Object[][])((Object[][])var3[2]);

               for(int var5 = 0; var4.length > var5; ++var5) {
                  Object[] var6 = var4[var5];
                  if(var6 != null) {
                     Class_s.a(true, var6);
                  }
               }
            } else if(null == var3 || 15 != var3.length) {
               throw new IllegalStateException();
            }
         }
      }

   }

   static final void a(Object[] var0, boolean var1) {
      ++d;
      ((long[])((long[])var0[3]))[0] = 0L;
      if(var1) {
         a(new Object[0], (byte)-101, 36);
      }

   }

   static final char a(int var0, Object[] var1) {
      if(var0 != -3055) {
         ((boolean[])((boolean[])g[11]))[3] = ((boolean[])((boolean[])g[3]))[4];
      }

      ++c;
      return ((char[])((char[])var1[3]))[0];
   }

   static final void a(int[] var0, int var1, byte var2, int[] var3, boolean var4, int[] var5, int[] var6, Object[] var7, int[] var8, int var9, int[] var10, Object[] var11, int[] var12, int[] var13) {
      ++b;
      if(null != var7 && var7.length == 4 && var7[1].equals(Integer.valueOf(2))) {
         qaa.a((Object[])null, (int)71);
      }

      if(null != var8 && null == var7[4]) {
         var7[4] = new int[((aa)var7[6]).f_i][((aa)var7[6]).h][];
      }

      Object[] var14;
      qa var18 = ((ta)((var14 = (Object[])((Object[])var7[11])) != null?var14[55]:null)).k;
      if(var12 != null && var7[9] == null) {
         var7[9] = new int[((aa)var7[6]).f_i][((aa)var7[6]).h][];
      }

      ((int[][][])((int[][][])var7[12]))[var1][var9] = var5;
      ((int[][][])((int[][][])var7[18]))[var1][var9] = var6;
      ((int[][][])((int[][][])var7[19]))[var1][var9] = var13;
      ((int[][][])((int[][][])var7[23]))[var1][var9] = var3;
      if(var7[4] != null) {
         ((int[][][])((int[][][])var7[4]))[var1][var9] = var8;
      }

      if(null != var7[9]) {
         ((int[][][])((int[][][])var7[9]))[var1][var9] = var12;
      }

      Object[][] var19 = ((Object[][][][])((Object[][][][])var7[10]))[var1][var9] = new Object[var13.length][];
      int var20 = 0;

      while(var13.length > var20) {
         int var21 = var0[var20];
         int var22 = var10[var20];
         if((32 & ((int[])((int[])var7[1]))[3]) != 0 && var21 != -1 && ((boolean[])((boolean[])var18.a(var21, (byte)120)[3]))[7]) {
            var21 = -1;
            var22 = 128;
         }

         long var23 = (long)(var22 << 14) | (long)((int[])((int[])var11[0]))[1] << 28 | (long)((int[])((int[])var11[0]))[5] << 42 | (long)((int[])((int[])var11[0]))[0] << 48 | (long)var21;
         lm var25 = pm.a(var23, (Object[])((Object[])var7[20]), false);

         while(true) {
            if(var25 != null) {
               eha var15;
               Object[] var26 = (var15 = (eha)var25) == null?null:var15.j;
               if(((int[])((int[])var26[1]))[0] != var21 || ((float[])((float[])var26[4]))[0] != (float)var22 || !oea.a(-23705, var11, (Object[])((Object[])var26[6]))) {
                  var25 = mla.b((Object[])((Object[])var7[20]), (byte)123);
                  continue;
               }
            }

            if(var25 != null) {
               eha var17;
               var19[var20] = (var17 = (eha)var25) == null?null:var17.j;
            } else {
               var19[var20] = kw.a(var21, var22, new Object[11], var7, var11, (byte)19);
               Object[] var16;
               di.a((Object[])((Object[])var7[20]), true, (lm)((var16 = var19[var20]) != null?var16[0]:null), var23);
            }

            ++var20;
            break;
         }
      }

      var20 = 32 % ((-69 - var2) / 42);
      if(var4) {
         ((byte[][])((byte[][])var7[2]))[var1][var9] = (byte)(((byte[][])((byte[][])var7[2]))[var1][var9] | 1);
      }

      if(~((int[])((int[])var7[1]))[0] > ~var13.length) {
         ((int[])((int[])var7[1]))[0] = var13.length;
      }

      ((int[])((int[])var7[1]))[4] += var13.length;
   }

}
