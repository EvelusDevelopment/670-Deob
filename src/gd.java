
final class gd {

   static int c;
   static Object[] f = ed.a(-2, new Object[1], (byte)-100, 36);
   static int g;
   static int d;
   static float e = 0.25F;
   static int b;
   static int a;
   static int h = 0;
   static int f_i = 0;


   static final String a(Object[] var0, byte var1) {
      ++a;
      if(var1 >= -112) {
         a((Object[])null, (byte)-18);
      }

      return ((int[])((int[])var0[1]))[2] + "," + (((int[])((int[])var0[1]))[1] >> 6) + "," + (((int[])((int[])var0[1]))[0] >> 6) + "," + (63 & ((int[])((int[])var0[1]))[1]) + "," + (63 & ((int[])((int[])var0[1]))[0]);
   }

   static final Object[] a(Object[] var0, Object[] var1, Object[] var2, float var3, Object[] var4, int var5) {
      ++b;
      if(var5 >= -124) {
         h = ((int[])((int[])var4[6]))[7];
      }

      if(var1 != null && null != var4 && ((boolean[])((boolean[])var2[17]))[4] && ((boolean[])((boolean[])var2[17]))[0]) {
         Object[] var6 = null;
         Object[] var9 = jna.a((byte)127, var1);
         Object[] var10 = jna.a((byte)127, var4);
         if(null != var9 && var10 != null) {
            int var11 = ((int[])((int[])var10[1]))[3] >= ((int[])((int[])var9[1]))[3]?((int[])((int[])var10[1]))[3]:((int[])((int[])var9[1]))[3];
            if(var1 != var0 && var0 != var4 && null != var0 && 2 == var0.length && var11 == nn.b((byte)-76, var0)) {
               var6 = var0;
            }

            if(var6 == null) {
               Object[] var13 = new Object[2];
               pk.a(-9987, var13);
               var13[0] = var2;
               var13[1] = kca.a(var11, ah.f, -2, vk.f, var2, new Object[6]);
               var6 = var13;
            }

            if(cv.a(var10, var9, var3, var6, (byte)84)) {
               return var6;
            }
         }
      }

      return 0.5F <= var3?var4:var1;
   }

   static final int a(int var0, Object[] var1, int var2, int var3) {
      ++g;
      if(var2 >= -6) {
         ((boolean[])((boolean[])((Object[])((Object[])f[21]))[3]))[1] = true;
      }

      return var1[6] != null && var3 >= 0 && ~var3 >= ~((int[])((int[])var1[6])).length?(((int[][])((int[][])var1[0]))[var3] != null && 0 <= var0 && ((int[][])((int[][])var1[0]))[var3].length >= var0?((int[][])((int[][])var1[0]))[var3][var0]:-1):-1;
   }

   static final void a(Object[] var0, int var1) {
      ++d;
      synchronized(var0[1]) {
         lga.b(0, (Object[])((Object[])var0[1]));
      }

      if(var1 > -15) {
         ((long[])((long[])f[22]))[0] = 42L;
      }

   }

}
