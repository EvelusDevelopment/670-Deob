
final class uta {

   static int d;
   static int b;
   static int c;
   static int e;
   static int f_i;
   static Object[] g;
   static Object[] h = ho.a(7, 20, new Object[1], true);
   static int f;
   static int a;


   static final Object[] a(byte var0, Object[] var1, Object[] var2) {
      ++d;
      ui.a((byte)-81, var2);
      var2[2] = var1;
      if(var0 != 94) {
         return (Object[])null;
      } else {
         ln.a(-28834, var2);
         ((int[])((int[])var2[5]))[0] = -1;
         return var2;
      }
   }

   static final void a(int var0, Object[] var1, byte var2) {
      if(var2 != 66) {
         a((byte)-8, (Object[])null, (Object[])null);
      }

      ++b;
      ((int[])((int[])var1[1]))[0] = var0;
   }

   static final fra a(Object[] var0, boolean var1) {
      ++f;
      if(var1) {
         a((Object[])null, false);
      }

      return new fra(var0);
   }

   static final Object[] a(Object[] var0, int var1, int var2) {
      ++f_i;
      ama.a((byte)83, var0);
      ((int[])((int[])var0[var2]))[0] = var1;
      return var0;
   }

   static final void a(Object[] var0, byte var1) {
      if(var0[1] == null) {
         var0[1] = new int[1];
      }

      if(var1 != 62) {
         a(-66, (Object[])null, (byte)71);
      }

      ++e;
   }

   static final int a(byte var0, Object[] var1) {
      ++c;
      if(var0 != 13) {
         a((float[])null, 25, 90, ((int[])((int[])var1[2]))[0], 0.96952844F, (float[])null, -113, -35, 0.011713172F, (byte)14, ((int[])((int[])var1[1]))[7], 46);
      }

      if(null == var1) {
         throw new IllegalStateException();
      } else {
         int var2 = ((int[])((int[])var1[1]))[0];
         return var2;
      }
   }

   static final void a(float[] var0, int var1, int var2, int var3, float var4, float[] var5, int var6, int var7, float var8, byte var9, int var10, int var11) {
      ++a;
      var2 -= var6;
      var7 -= var10;
      var11 -= var1;
      float var12 = var0[2] * (float)var7 + (float)var2 * var0[1] + (float)var11 * var0[0];
      float var13 = (float)var7 * var0[5] + var0[3] * (float)var11 + (float)var2 * var0[4];
      float var14 = var0[6] * (float)var11 + (float)var2 * var0[7] + var0[8] * (float)var7;
      if(var9 != -121) {
         ((Object[])((Object[])g[0]))[2] = (Object)null;
      }

      float var15 = 0.5F + (float)Math.atan2((double)var12, (double)var14) / 6.2831855F;
      if(1.0F != var8) {
         var15 *= var8;
      }

      float var16 = var13 + 0.5F + var4;
      float var17;
      if(1 != var3) {
         if(var3 != 2) {
            if(3 == var3) {
               var17 = var15;
               var15 = var16;
               var16 = -var17;
            }
         } else {
            var15 = -var15;
            var16 = -var16;
         }
      } else {
         var17 = var15;
         var15 = -var16;
         var16 = var17;
      }

      var5[0] = var15;
      var5[1] = var16;
   }

}
