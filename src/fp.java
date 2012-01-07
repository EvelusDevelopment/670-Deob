
final class fp {

   static int d;
   static int c;
   static int a;
   static int b;


   static final void a(int var0, Object[] var1, int var2) {
      ((byte[])((byte[])var1[2]))[-var2 + ((int[])((int[])var1[1]))[0] - 2] = (byte)(var2 >> 8);
      if(var0 != -11399) {
         a((Object[])null, ((int[])((int[])var1[3]))[3], ((int[])((int[])var1[1]))[0], ((byte[])((byte[])var1[2]))[0], ((int[])((int[])((Object[])((Object[])((Object[])((Object[])var1[0]))[0]))[0]))[6], -20);
      }

      ++c;
      ((byte[])((byte[])var1[2]))[-1 + -var2 + ((int[])((int[])var1[1]))[0]] = (byte)var2;
   }

   static final Object[] a(Object[] var0, int var1, int var2, byte var3, int var4, int var5) {
      ++d;
      if(var3 != 74) {
         return new Object[4];
      } else if(!((boolean[])((boolean[])var0[17]))[27] && (!ol.a((byte)66, var5) || !ol.a((byte)85, var1))) {
         if(!((boolean[])((boolean[])var0[17]))[5]) {
            Object[] var6 = new Object[7];
            int var12 = fda.a(var5, (byte)81);
            return oh.a(var2, var12, var1, var4, var5, true, var3 - 187, fda.a(var1, (byte)81), var6, var0);
         } else {
            return nd.a(new Object[7], '\u84f5', var2, var5, var4, true, var1, (byte)-36, var0);
         }
      } else {
         return nd.a(new Object[7], 3553, var2, var5, var4, true, var1, (byte)-36, var0);
      }
   }

   static final boolean a(boolean var0, Object[] var1) {
      ++b;
      if(var1 != null && var1.length == 8) {
         return ko.b(1, var1);
      } else {
         if(!var0) {
            a((Object[])null, 65, -21, ((byte[])((byte[])var1[0]))[2], 22, 123);
         }

         return var1 != null && 6 == var1.length?Class_a.c(var1, 0):pna.a((byte)108, var1);
      }
   }

   static final boolean a(int var0, Object[] var1, byte[] var2, int[] var3, Object[] var4) {
      try {
         ++a;
         boolean var5 = true;
         if(var1 != null && (var1.length == 1 || var1.length == 2 || var1.length == 1 && var1[0].equals(Boolean.valueOf(false)))) {
            return false;
         } else {
            int var6 = 0;
            hb var7 = null;

            for(int var8 = 0; var8 < 128; ++var8) {
               if(null == var2 || var2[var8] != 0) {
                  int var9 = ((int[])((int[])var1[7]))[var8];
                  if(var9 != 0) {
                     if(var6 != var9) {
                        var6 = var9--;
                        if(-1 != ~(var9 & 1)) {
                           var7 = ts.a(var9 >> 2, var4, (byte)120, var3);
                        } else {
                           int var11 = var9 >> 2;
                           hb var10;
                           if(oh.a((Object[])((Object[])var4[2]), (byte)104) == 1) {
                              var10 = lja.a(var3, -33, 0, var4, var11);
                           } else {
                              if(1 != jla.a((Object[])((Object[])var4[2]), (byte)35, var11)) {
                                 throw new RuntimeException();
                              }

                              var10 = lja.a(var3, -31, var11, var4, 0);
                           }

                           var7 = var10;
                        }

                        if(null == var7) {
                           var5 = false;
                        }
                     }

                     if(var7 != null) {
                        ((hb[])((hb[])var1[8]))[var8] = var7;
                        ((int[])((int[])var1[7]))[var8] = 0;
                     }
                  }
               }
            }

            if(var0 <= 17) {
               ((int[])((int[])var1[14]))[2] = 6;
            }

            return var5;
         }
      } catch (RuntimeException var12) {
         throw vt.a(var12, "fp.D(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + (var2 != null?"{...}":"null") + ',' + (var3 != null?"{...}":"null") + ',' + (var4 != null?"{...}":"null") + ')');
      }
   }

   static {
      mu.a(new Object[1], -24490, 5);
   }
}
