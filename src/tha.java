
class tha extends lm {

   tha s;
   static int f_l;
   static int p;
   static int k;
   static int n;
   static int o;
   static int j;
   long m;
   static int q;
   tha r;


   final boolean b(byte var1) {
      int var2 = 106 / ((84 - var1) / 40);
      ++o;
      return null != this.r;
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, Object[] var5, int var6) {
      ++n;
      gl.a(var1 + var2, var1, var3, var5, (byte)-120, var0, var0, var6);
      if(var4 != -1) {
         a(((int[])((int[])var5[8]))[1], -121, ((int[])((int[])((Object[])((Object[])var5[1]))[2]))[0], 123, 112, ((int[])((int[])var5[16]))[22], -77, 43, ((boolean[])((boolean[])var5[2]))[0], 1, ((int[])((int[])((Object[])((Object[])var5[0]))[2]))[1], 57, -115, ((int[])((int[])((Object[])((Object[])var5[12]))[0]))[1], (Object[])((Object[])((Object[])((Object[])var5[9]))[0]));
      }

   }

   static final lm a(Object[] var0, byte var1) {
      ++p;
      lm var2 = (lm)var0[1];
      if(var2 != ((Object[])((Object[])var0[0]))[0]) {
         if(var1 < 100) {
            a(((int[])((int[])var0[0]))[26], -98, -6, -92, -10, new Object[7], -77);
         }

         var0[1] = var2.f;
         return var2;
      } else {
         var0[1] = null;
         return null;
      }
   }

   static final boolean a(int var0, Object[] var1, byte var2, int var3, Object[] var4) {
      ++k;
      if(null != var1) {
         Object[] var5 = cfa.a(var0, 9, var1);
         if(null != var5) {
            var4[1] = var5;
            var4[0] = var1;
            return true;
         }
      }

      if(var2 != 83) {
         return true;
      } else {
         var4[1] = null;
         var4[0] = null;
         return false;
      }
   }

   static final Object[] a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, int var13, Object[] var14) {
      ++q;
      if(null == var14[8]) {
         var14[8] = new boolean[6];
      }

      if(null == var14[12]) {
         var14[12] = new int[7];
      }

      wda.a(var9, var2, var10, var11, var6 - 2, var14, var4, (byte)0, var0, var13, var3, var7, false);
      iqa.a(var14, false);
      ((int[])((int[])var14[12]))[5] = var12;
      ((int[])((int[])var14[12]))[4] = var5;
      if(var14 != null && 1 == var14.length) {
         return null;
      } else {
         Object[] var15 = qda.a(((int[])((int[])var14[var6]))[5], (byte)-64, dfa.a);
         int var16 = ((int[])((int[])var15[1]))[4];
         if(~var16 != 0) {
            var14[18] = lea.a(var14, false, (byte)-116, new Object[6]);
            int var17 = ((boolean[])((boolean[])var15[6]))[0]?0:2;
            if(var8) {
               var17 = 1;
            }

            tma.a(103, var1, (Object[])((Object[])var14[18]), var17, false, var16);
         }

         toa.a(1, var14, 5029);
         return var14;
      }
   }

   static final boolean a(int var0, int var1, int var2) {
      ++f_l;
      boolean var3 = am.a(var2, 55, var0);
      boolean var4 = ns.a(var0, (byte)-119, var2) | (var0 & 8192) != 0;
      if(var1 != -23901) {
         return false;
      } else {
         boolean var5 = (var0 & 65536) != 0;
         return (var4 | var5) & var3;
      }
   }

   final void a(int var1) {
      ++j;
      if(this.r != null) {
         this.r.s = this.s;
         this.s.r = this.r;
         this.r = null;
         if(var1 == 8192) {
            this.s = null;
         }
      }
   }

}
