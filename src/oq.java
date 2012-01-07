
final class oq {

   static Object[] b = ed.a(3, new Object[1], (byte)-114, 106);
   static int g;
   static int e;
   static int f;
   static int c;
   private Object[] f_i;
   static Object[] a = ura.a(-98, new Object[2]);
   static int d;
   static int h;


   static final void a(int var0, Object[] var1) {
      ++f;
      ((int[])((int[])var1[1]))[2] = -1;
      if(var0 != 12523) {
         a();
      }

   }

   static final void a() {
      for(int var0 = 0; var0 < sc.b.length; ++var0) {
         sc.b[var0].d();
      }

      sc.b = null;
   }

   protected final void finalize() throws Throwable {
      ++e;
      Object[] var1 = this.f_i;
      if(var1 != null && var1.length == 16) {
         ue.a((byte)-5, var1);
      } else if(var1 != null && var1.length == 12) {
         wt.a(var1, true);
         ((oq)var1[0]).a(123);
      } else {
         ((oq)var1[0]).a(48);
      }

   }

   final void a(int var1) throws Throwable {
      ++h;
      super.finalize();
      if(var1 <= 14) {
         a((byte)52, 18, ((boolean[])((boolean[])((Object[])((Object[])a[2]))[5]))[8], -43, (Object[])null, (ya)null, ((int[])((int[])b[6]))[11], -19);
      }

   }

   oq(Object[] var1) {
      this.f_i = var1;
   }

   static final boolean a(int var0, Object[][] var1, Object[] var2, int var3, Object[] var4, Object[] var5) {
      if(null != var5 && (-7 == ~var5.length || var5.length == 4)) {
         a(var0 + 0, (Object[][])null, (Object[])null, -69, (Object[])null, (Object[])null);
      }

      ++c;
      if(var0 != -69) {
         return false;
      } else {
         for(int var6 = 0; var3 > var6 && var1.length > var6; ++var6) {
            Object[] var7 = var1[var6];
            if(var7 != null && noa.a(true, var7) == ((int[])((int[])var4[1]))[1] && ~fv.a(var7, (byte)1) == ~((int[])((int[])var4[1]))[0]) {
               return true;
            }
         }

         return false;
      }
   }

   static final void a(byte var0, int var1, boolean var2, int var3, Object[] var4, ya var5, int var6, int var7) {
      ++g;
      if(null != var4[22] && var5 != null) {
         int var8 = -(var6 * ((int[])((int[])((Object[])((Object[])var4[11]))[1]))[30] >> 8) + var3 >> ((int[])((int[])((Object[])((Object[])var4[11]))[1]))[9];
         if(var0 > -99) {
            a = (Object[])null;
         }

         int var9 = -(var6 * ((int[])((int[])((Object[])((Object[])var4[11]))[1]))[31] >> 8) + var1 >> ((int[])((int[])((Object[])((Object[])var4[11]))[1]))[9];
         Object[] var10 = (Object[])((Object[])var4[22]);
         uma var13;
         Object[] var14 = null == (var13 = (uma)var5)?null:var13.A;
         int var11 = var8 + 1 + ((int[])((int[])var14[1]))[0];
         int var12 = var9 + ((int[])((int[])var14[1]))[2] + 1;
         int var15 = ((int[])((int[])var10[1]))[0] * var12 + var11;
         int var16 = 0;
         int var17 = ((int[])((int[])var14[1]))[1];
         if(var4 == null || var4.length != 6) {
            int var18 = ((int[])((int[])var14[1]))[3];
            int var19 = ((int[])((int[])var10[1]))[0] - var18;
            int var21;
            if(var12 <= 0) {
               var21 = -var12 + 1;
               var12 = 1;
               var17 -= var21;
               var16 += var18 * var21;
               var15 += var21 * ((int[])((int[])var10[1]))[0];
            }

            int var20 = 0;
            if(var12 + var17 >= ((int[])((int[])var10[1]))[3]) {
               var21 = 1 + var17 + (var12 - ((int[])((int[])var10[1]))[3]);
               var17 -= var21;
            }

            if(0 >= var11) {
               var21 = 1 + -var11;
               var16 += var21;
               var20 += var21;
               var18 -= var21;
               var11 = 1;
               var15 += var21;
               var19 += var21;
            }

            if(((int[])((int[])var10[1]))[0] <= var11 + var18) {
               var21 = var18 + var11 + 1 + -((int[])((int[])var10[1]))[0];
               var19 += var21;
               var20 += var21;
               var18 -= var21;
            }

            if(0 < var18 && 0 < var17) {
               bo.a(var17, (byte[])((byte[])var14[0]), (byte[])((byte[])var10[0]), var15, var16, var18, var19, -1, var20);
               el.a(var17, var12, true, var11, var18, var10);
            }

         }
      }
   }

}
