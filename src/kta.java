import java.io.File;

final class kta extends nj {

   static int f_i;
   static int m;
   Object[] f_l;
   static File o;
   static Object[] p = ed.a(20, new Object[1], (byte)-113, 115);
   static ja j;
   static int k;
   static int n;


   static final int a(int var0, int var1) {
      return jaa.f_i != null?jaa.f_i[var0][var1] & 255:0;
   }

   static final void a(Object[] var0, int var1, int var2, ya var3, boolean var4, int var5, int var6, int var7) {
      ++m;
      if(var0[22] != null && null != var3) {
         int var8 = -(var1 * ((int[])((int[])((Object[])((Object[])var0[11]))[1]))[30] >> 8) + var6 >> ((int[])((int[])((Object[])((Object[])var0[11]))[var2]))[9];
         int var9 = var5 - (((int[])((int[])((Object[])((Object[])var0[11]))[1]))[31] * var1 >> 8) >> ((int[])((int[])((Object[])((Object[])var0[11]))[1]))[9];
         Object[] var10 = (Object[])((Object[])var0[22]);
         if(null != var10 && var10.length == 19) {
            ufa.a(19, -51, (Object[])null, -119);
         }

         uma var13;
         Object[] var14 = null == (var13 = (uma)var3)?null:var13.A;
         int var11 = var8 + 1 + ((int[])((int[])var14[1]))[0];
         int var12 = var9 + ((int[])((int[])var14[1]))[2] + 1;
         int var15 = ((int[])((int[])var10[1]))[0] * var12 + var11;
         int var16 = 0;
         int var17 = ((int[])((int[])var14[1]))[1];
         int var18 = ((int[])((int[])var14[1]))[3];
         int var19 = ((int[])((int[])var10[1]))[0] - var18;
         int var21;
         if(var12 <= 0) {
            var21 = -var12 + 1;
            var17 -= var21;
            var12 = 1;
            var15 += var21 * ((int[])((int[])var10[1]))[0];
            var16 += var18 * var21;
         }

         int var20 = 0;
         if(((int[])((int[])var10[1]))[3] <= var12 + var17) {
            var21 = -((int[])((int[])var10[1]))[3] + 1 + var12 + var17;
            var17 -= var21;
         }

         if(var11 <= 0) {
            var21 = -var11 + 1;
            var18 -= var21;
            var16 += var21;
            var20 += var21;
            var19 += var21;
            var11 = 1;
            var15 += var21;
         }

         if(var11 + var18 >= ((int[])((int[])var10[1]))[0]) {
            var21 = var11 - (-var18 - 1 + ((int[])((int[])var10[1]))[0]);
            var19 += var21;
            var20 += var21;
            var18 -= var21;
         }

         if(0 < var18 && (var17 > 0 || client.f_vb != 0)) {
            bja.a(var18, var19, var15, var17, var16, var20, -1, (byte[])((byte[])var10[0]), (byte[])((byte[])var14[0]));
            el.a(var17, var12, true, var11, var18, var10);
         }

      }
   }

   static final Object[] a(int var0, Object[] var1, Object[] var2, Object[] var3, int var4, int var5) {
      ++n;
      if(null != var3 && 87 == var3.length) {
         return sg.a(false, var4, var1, var5, var2, var3);
      } else {
         int var6 = 1 / ((var0 - 24) / 49);
         if(null != var3 && -92 == ~var3.length) {
            return jt.a(var2, 1, var4, var3, var5, var1);
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final Object[] a(Object[] var0, int var1, Object[] var2) {
      ++k;
      ee.a(var0, (byte)54);
      int var3 = 92 % ((23 - var1) / 48);
      sea.b(var2, var0, (byte)-119);
      ((int[])((int[])var0[0]))[1] = de.a((int)0, var2);
      ((int[])((int[])var0[0]))[2] = de.a((int)0, var2);
      return var0;
   }

   kta(Object[] var1) {
      this.f_l = var1;
   }

   static final int a(int var0, int var1, Object[] var2) {
      ++f_i;
      if(var0 != 37) {
         a(-128, -48, (Object[])null);
      }

      return ((int[])((int[])var2[37]))[var1];
   }

}
