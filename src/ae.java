
final class ae {

   static int a;
   static int f;
   static int d;
   static int c;
   static int b;
   static Object[] e = ed.a(-2, new Object[1], (byte)-126, 111);


   static final double a(int var0, Object[] var1) {
      ++f;
      if(var1[8] != null) {
         Object[] var4 = (Object[])((Object[])var1[8]);
         double var5 = ((double[])((double[])var4[5]))[0];
         if(null != var4[7]) {
            Object[] var9 = (Object[])((Object[])var4[7]);
            double var7;
            synchronized(var9) {
               if(-2 >= ~((int[])((int[])var9[1]))[1]) {
                  ota var11;
                  Object[] var12 = (var11 = (ota)dda.a((Object[])((Object[])var9[0]), 2)) == null?null:var11.x;
                  if(var12 != null) {
                     var7 = ((double[])((double[])var12[2]))[0] - (double)((float)((short[][])((short[][])var12[1]))[0].length / (float)mc.a);
                  } else {
                     var7 = -1.0D;
                  }
               } else {
                  var7 = -1.0D;
               }
            }

            var5 = var7;
            if(0.0D > var7) {
               var5 = ((double[])((double[])var4[5]))[0];
            }
         }

         double var2 = var5 - (double)(256.0F / (float)mc.a);
         return var2;
      } else if(null != var1[3]) {
         return jj.a(var0 + 5, (Object[])((Object[])var1[3]));
      } else {
         if(var0 != -2) {
            a(-11, (Object[])null, (Object[])null);
         }

         return 0.0D;
      }
   }

   static final void a(int var0, Object[] var1, int var2) {
      ++c;
      if(0 != (((int[])((int[])var1[9]))[var2] & 2)) {
         if(null != var1 && 25 == var1.length && var1[1].equals(Boolean.valueOf(false))) {
            return;
         }

         mt var3;
         mt var4;
         for(Object[] var5 = null != (var3 = (mt)dda.a((Object[])((Object[])((Object[])((Object[])var1[4]))[0]), var0 ^ 3))?var3.n:null; null != var5; var5 = (var4 = (mt)client.a((Object[])((Object[])((Object[])((Object[])var1[4]))[0]), -28280)) == null?null:var4.n) {
            if(var2 == ((int[])((int[])var5[1]))[3] && ((Object[][][])((Object[][][])var1[25]))[var2][((int[])((int[])var5[1]))[16]] == null && 0 > ((int[])((int[])var5[1]))[13]) {
               ((int[])((int[])var5[1]))[13] = 0;
            }
         }
      }

      if(var0 != 1) {
         e = (Object[])((Object[])var1[1]);
      }

   }

   static final int a(String var0, byte var1) {
      ++b;
      if(null != var0) {
         if(var1 != 84) {
            return 55;
         } else {
            for(int var2 = 0; ola.c > var2; ++var2) {
               if(var0.equalsIgnoreCase(ir.a[var2])) {
                  return var2;
               }
            }

            return -1;
         }
      } else {
         return -1;
      }
   }

   static final void a(int var0, Object[] var1, Object[] var2) {
      ++a;
      float var3 = ((float[])((float[])var1[1]))[2];
      float var4 = ((float[])((float[])var1[1]))[0];
      ((float[])((float[])var1[1]))[2] = ((float[])((float[])var2[0]))[8] + ((float[])((float[])var1[1]))[1] * ((float[])((float[])var2[0]))[6] + var4 * ((float[])((float[])var2[0]))[0] + var3 * ((float[])((float[])var2[0]))[10];
      ((float[])((float[])var1[1]))[0] = ((float[])((float[])var2[0]))[1] + ((float[])((float[])var1[1]))[1] * ((float[])((float[])var2[0]))[11] + var4 * ((float[])((float[])var2[0]))[3] + var3 * ((float[])((float[])var2[0]))[5];
      ((float[])((float[])var1[1]))[1] = ((float[])((float[])var2[0]))[7] + var3 * ((float[])((float[])var2[0]))[9] + ((float[])((float[])var2[0]))[2] * var4 + ((float[])((float[])var2[0]))[4] * ((float[])((float[])var1[1]))[1];
      if(var0 != -10554) {
         e[0] = (Object)null;
      }

   }

}
