
final class ir {

   static int c;
   static String[] a = new String[200];
   static int b;
   static int d;


   static final void a(Object[] var0, int var1, int var2, int var3, int var4, boolean var5) {
      try {
         ++b;
         if(var4 != 0) {
            Object[] var6 = ((Object[][])((Object[][])var0[2]))[var1];
            if(null == var6[48]) {
               var6[48] = new Object[1 + var3][];
               var6[7] = var6[48];
            }

            if(((Object[])((Object[])var6[48])).length <= var3) {
               Object[][] var7;
               if(var6[7] != var6[48]) {
                  var7 = new Object[var3 + 1][];
                  Object[][] var8 = new Object[var3 + 1][];

                  for(int var9 = 0; ((Object[])((Object[])var6[48])).length > var9; ++var9) {
                     var7[var9] = ((Object[][])((Object[][])var6[48]))[var9];
                     var8[var9] = ((Object[][])((Object[][])var6[7]))[var9];
                  }

                  if(null != var0 && 2 == var0.length && var0[0].equals(Boolean.valueOf(false)) && var0[0].equals(Integer.valueOf(0))) {
                     ina.a(-49, (Object[])null, ((int[])((int[])uba.g[1]))[4], new Object[15][], (Object[])((Object[])cda.e[24]), var2 + 74);
                  }

                  var6[7] = var8;
                  var6[48] = var7;
               } else {
                  var7 = new Object[var3 + 1][];

                  for(int var12 = 0; ((Object[])((Object[])var6[48])).length > var12; ++var12) {
                     var7[var12] = ((Object[][])((Object[][])var6[48]))[var12];
                  }

                  var6[48] = var6[7] = var7;
                  if(var6 != null && var6.length == 2) {
                     ina.a(83, (Object[])null, 52, (Object[])((Object[])((Object[])((Object[])loa.b[1]))[16]), (Object[])((Object[])loa.b[2]), 120);
                  }
               }
            }

            if(0 < var3 && null == ((Object[][])((Object[][])var6[48]))[var3 - 1]) {
               throw new RuntimeException("" + (-1 + var3));
            } else {
               Object[] var11 = wi.a(new Object[65], var2 ^ 53);
               ((int[])((int[])var11[1]))[47] = var3;
               ((int[])((int[])var11[1]))[18] = var4;
               ((int[])((int[])var11[1]))[39] = ((int[])((int[])var11[1]))[3] = ((int[])((int[])var6[1]))[3];
               ((Object[][])((Object[][])var6[var2]))[var3] = var11;
               if(var6[7] != var6[48]) {
                  ((Object[][])((Object[][])var6[7]))[var3] = var11;
               }

               Object[] var13;
               if(var5) {
                  var13 = pca.c;
               } else {
                  var13 = loa.b;
               }

               var13[1] = var11;
               var13[0] = var0;
               vr.a(var6, (int)24);
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var10) {
         throw vt.a(var10, "ir.B(" + (var0 != null?"{...}":"null") + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   static final void a(Object[] var0, Object[] var1, int var2) {
      ((int[])((int[])var0[var2]))[1] = de.a((int)0, var1);
      ++c;
      ((byte[])((byte[])var0[3]))[0] = ipa.a(var1, var2 - 127);
      ((int[])((int[])var0[1]))[0] = de.a((int)0, var1);
      Class_i.a(false, var1);
      var0[2] = ara.b((byte)61, var1);
   }

   static final void a(String var0, byte var1, String var2, boolean var3, boolean var4) {
      ++d;
      ++bpa.k;
      Object[] var5 = hua.a(true);
      Object[] var6 = ona.a((byte)116, (Object[])((Object[])var5[7]), mfa.d);
      ek.putByte((Object[])((Object[])var6[0]), 1 + vs.a(var0, (byte)14) + vs.a(var2, (byte)14));
      bw.a(var0, (byte)0, (Object[])((Object[])var6[0]));
      bw.a(var2, (byte)0, (Object[])((Object[])var6[0]));
      int var7 = 0;
      if(var5 != null && -9 == ~var5.length && var5[7].equals(Integer.valueOf(0))) {
         ina.a(100, (Object[])((Object[])nta.b[0]), -79, (Object[])((Object[])cda.e[0]), (Object[])null, 105);
      }

      if(var3) {
         var7 |= 1;
      }

      if(var4) {
         var7 |= 2;
      }

      if(var1 != 90) {
         a = (String[])null;
      }

      ek.putByte((Object[])((Object[])var6[0]), var7);
      lj.a(var6, 6, var5);
   }

}
