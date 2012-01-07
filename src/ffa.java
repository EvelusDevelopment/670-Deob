
final class ffa {

   static int[][] b;
   static int c;
   static int e;
   static String d = "true";
   static int a;
   static int f;
   static int g;


   static final void a(float var0, float var1, Object[] var2, float[] var3, boolean var4, float var5) {
      ++f;
      if(!var4) {
         d = (String)null;
      }

      float var6 = ((float[])((float[])((Object[])((Object[])var2[45]))[0]))[3] * var5 + ((float[])((float[])((Object[])((Object[])var2[45]))[0]))[15] + var1 * ((float[])((float[])((Object[])((Object[])var2[45]))[0]))[7] + var0 * ((float[])((float[])((Object[])((Object[])var2[45]))[0]))[11];
      float var7 = ((float[])((float[])((Object[])((Object[])var2[45]))[0]))[12] + var5 * ((float[])((float[])((Object[])((Object[])var2[45]))[0]))[0] + ((float[])((float[])((Object[])((Object[])var2[45]))[0]))[4] * var1 + ((float[])((float[])((Object[])((Object[])var2[45]))[0]))[8] * var0;
      float var8 = var0 * ((float[])((float[])((Object[])((Object[])var2[45]))[0]))[9] + ((float[])((float[])((Object[])((Object[])var2[45]))[0]))[13] + ((float[])((float[])((Object[])((Object[])var2[45]))[0]))[1] * var5 + ((float[])((float[])((Object[])((Object[])var2[45]))[0]))[5] * var1;
      var3[0] = var7 * ((float[])((float[])var2[25]))[0] / var6 + ((float[])((float[])var2[25]))[3];
      var3[1] = var8 * ((float[])((float[])var2[25]))[9] / var6 + ((float[])((float[])var2[25]))[4];
      var3[2] = var0;
   }

   static final void a(boolean var0, Object[] var1) {
      if(var0) {
         a(true, (Object[])null);
      }

      ++a;
   }

   static final boolean a(int var0, Object[] var1) {
      ++e;
      if(var0 != -9088) {
         a(101, (Object[])null);
      }

      Object[] var2 = (Object[])((Object[])var1[0]);
      ej.a(var0 + 9091, var2);
      return true;
   }

   static final void a(int var0) {
      if(var0 != -28074) {
         a(false, (Object[])null);
      }

      ++g;
      if(ipa.d == 5) {
         if(to.a == 7 && 73 == opa.e) {
            iea.a(15, (byte)-82);
         }
      }
   }

   static final ka a(ta var0, byte var1, Object[] var2, int var3) {
      ++c;
      int var4 = 95 % ((var1 - 43) / 37);
      if(null != var2[16] && var0.d(((ka)var2[16]).va(), var3) == 0) {
         return (ka)var2[16];
      } else {
         Object[] var5 = gha.a(var3, false, var0, 1, var2);
         return var5 == null?null:(ka)var5[1];
      }
   }

}
