
final class dha {

   static int e;
   static Object[] d = st.a(new Object[1], 7, 0, 10);
   static int c;
   static int b;
   static int a = 0;


   static final void a(int var0, int[] var1, int[] var2, int[] var3, Object[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int var9, int[] var10, boolean var11, Object[] var12, int var13) {
      ++c;
      if(var1 != null && var12[20] == null) {
         var12[20] = new int[((aa)var12[2]).f_i][((aa)var12[2]).h][];
      }

      Object[] var14;
      qa var18 = ((ta)((var14 = (Object[])((Object[])var12[12])) == null?null:var14[38])).k;
      if(null != var5 && var12[9] == null) {
         var12[9] = new int[((aa)var12[2]).f_i][((aa)var12[2]).h][];
      }

      ((int[][][])((int[][][])var12[10]))[var13][var0] = var3;
      ((int[][][])((int[][][])var12[5]))[var13][var0] = var7;
      ((int[][][])((int[][][])var12[0]))[var13][var0] = var10;
      ((int[][][])((int[][][])var12[21]))[var13][var0] = var8;
      if(null != var12[9]) {
         ((int[][][])((int[][][])var12[9]))[var13][var0] = var5;
      }

      if(var12[20] != null) {
         ((int[][][])((int[][][])var12[20]))[var13][var0] = var1;
      }

      Object[][] var19 = ((Object[][][][])((Object[][][][])var12[13]))[var13][var0] = new Object[var10.length][];
      if(var9 == 29603) {
         int var20 = 0;

         while(var10.length > var20) {
            int var21 = var6[var20];
            int var22 = var2[var20];
            if(var12 != null && -5 == ~var12.length) {
               ur.f = -25;
            }

            if((((int[])((int[])var12[1]))[6] & 32) != 0 && -1 != var21 && ((boolean[])((boolean[])var18.a(var21, (byte)76)[3]))[7]) {
               var21 = -1;
               var22 = 128;
            }

            long var23 = (long)((int[])((int[])var4[0]))[1] << 28 | (long)((int[])((int[])var4[0]))[5] << 42 | (long)((int[])((int[])var4[0]))[0] << 48 | (long)(var22 << 14) | (long)var21;
            lm var25 = pm.a(var23, (Object[])((Object[])var12[22]), false);

            while(true) {
               if(var25 != null) {
                  cn var15;
                  Object[] var26 = null == (var15 = (cn)var25)?null:var15.j;
                  if(((int[])((int[])var26[1]))[2] != var21 || ((float[])((float[])var26[4]))[0] != (float)var22 || !oea.a(-23705, var4, (Object[])((Object[])var26[9]))) {
                     var25 = mla.b((Object[])((Object[])var12[22]), (byte)123);
                     continue;
                  }
               }

               if(var25 == null) {
                  Object[] var29 = new Object[10];
                  if(var29[4] == null) {
                     var29[4] = new float[1];
                  }

                  if(null == var29[1]) {
                     var29[1] = new int[5];
                  }

                  ((int[])((int[])var29[1]))[3] = 0;
                  ((int[])((int[])var29[1]))[4] = 0;
                  ((int[])((int[])var29[1]))[0] = 0;
                  ((int[])((int[])var29[1]))[1] = 0;
                  var29[5] = woa.b(var29, 262144);
                  var29[3] = var12;
                  ((float[])((float[])var29[4]))[0] = (float)var22;
                  var29[8] = ((Object[])((Object[])var29[3]))[12];
                  ((int[])((int[])var29[1]))[2] = var21;
                  var29[9] = var4;
                  Object[] var31;
                  Object[] var30;
                  var29[0] = new int[((aa)(null == (var31 = (Object[])((Object[])var29[3]))?null:var31[2])).h * ((aa)(null == (var30 = (Object[])((Object[])var29[3]))?null:var30[2])).f_i];
                  byte var33 = 10;
                  if(0 <= var21) {
                     Object[] var32;
                     Object[] var34 = ((ta)((var32 = (Object[])((Object[])var29[8])) == null?null:var32[38])).k.a(var21, (byte)108);
                     if(((byte[])((byte[])var34[0]))[4] > 0) {
                        var33 = ((byte[])((byte[])var34[0]))[4];
                     }
                  }

                  ul.a((Object[])((Object[])var29[8]), var33, var9 ^ -29684);
                  ul.a((Object[])((Object[])var29[8]), 3, -96);
                  var19[var20] = var29;
                  Object[] var16;
                  di.a((Object[])((Object[])var12[22]), true, (lm)(null == (var16 = var19[var20])?null:var16[5]), var23);
               } else {
                  cn var17;
                  var19[var20] = null == (var17 = (cn)var25)?null:var17.j;
               }

               ++var20;
               break;
            }
         }

         if(var11) {
            ((byte[][])((byte[][])var12[7]))[var13][var0] = (byte)(((byte[][])((byte[][])var12[7]))[var13][var0] | 1);
         }

         if(var10.length > ((int[])((int[])var12[1]))[3]) {
            ((int[])((int[])var12[1]))[3] = var10.length;
         }

         ((int[])((int[])var12[1]))[7] += var10.length;
      }
   }

   static final Object[] a(boolean var0, Object[] var1, Object[] var2) {
      ++e;
      aa.a(15022, var2, var1);
      if(!var0) {
         a(-20, (int[])null, (int[])null, (int[])null, (Object[])null, (int[])null, (int[])null, (int[])null, (int[])null, 22, (int[])((int[])var2[0]), ((boolean[])((boolean[])d[0]))[12], (Object[])null, 100);
      }

      return var1;
   }

}
