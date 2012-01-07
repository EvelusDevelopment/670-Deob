
final class js {

   static int g;
   static int d;
   static vp b;
   static int f_i;
   static int a;
   static int c;
   static Object[] e = pa.a("BUILDLIVE", false, 3, new Object[2]);
   static Object[] f = ed.a(2, new Object[1], (byte)-113, 58);
   static Object[] h = null;


   static final int a(boolean var0, int var1) {
      if(var1 != -1332625561) {
         a((Object[])null, 83);
      }

      ++d;
      if(aqa.n == null) {
         return 0;
      } else if(!var0 && rt.g != null) {
         return aqa.n.length * 2;
      } else {
         int var2 = 0;

         for(int var3 = 0; aqa.n.length > var3; ++var3) {
            int var4 = aqa.n[var3];
            if(hp.a(-125, oma.f, var4)) {
               ++var2;
            }

            if(hp.a(var1 + 1332625435, uha.d, var4)) {
               ++var2;
            }
         }

         return var2;
      }
   }

   static final Object[] a(Object[] var0, boolean var1) {
      ++g;
      if(!var1) {
         e = (Object[])((Object[])((Object[])((Object[])f[0]))[20]);
      }

      if(var0[1] == null) {
         var0[1] = new int[6];
      }

      var0[8] = a(var0, 0);
      return var0;
   }

   static final byte[] a(String var0, int var1, Object[] var2) {
      ++a;
      byte[] var3 = sra.a("dx", (Object[])((Object[])var2[9]), var0, true);
      int var4 = -8 % ((var1 - 0) / 56);
      return var3;
   }

   static final void a(int var0, int var1, int var2, int var3, Object[] var4, int var5) {
      ++c;
      if(var4[2] != null) {
         int var6 = -1 + var0 >> 7;
         int var7 = var5 + -1 + var0 + var2 >> 7;
         int var8 = var3 - 1 >> 7;
         int var9 = var1 + var3 - 2 >> 7;

         for(int var10 = var6; var7 >= var10; ++var10) {
            Object[][] var11 = ((Object[][][])((Object[][][])var4[2]))[var10];

            for(int var12 = var8; var12 <= var9; ++var12) {
               if(var11[var12] != null) {
                  ((boolean[])((boolean[])var11[var12][0]))[0] = true;
               }
            }

            if(null != var4 && -5 == ~var4.length && var4[2].equals(Integer.valueOf(2))) {
               a(89, -88, -10, -89, (Object[])null, -1);
            }
         }

         if(null == var4 || (var4.length != 9 || !var4[2].equals(Boolean.valueOf(false)) || !var4[2].equals(Integer.valueOf(0))) && (var4.length != 27 || !var4[2].equals(Integer.valueOf(1)))) {
            ;
         }
      }
   }

   private static final coa a(Object[] var0, int var1) {
      int var2 = 69 / ((var1 - 64) / 49);
      ++f_i;
      return new coa(var0);
   }

}
