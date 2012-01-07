
final class hj {

   static int h;
   static int j;
   static int g;
   static int a;
   static int d;
   static Object[] f = ed.a(22, new Object[1], (byte)-116, 117);
   static int e;
   static Object[] b = ed.a(-2, new Object[1], (byte)-122, 55);
   static Object[][] f_i = new Object[4][];
   static int[] c;


   static final Object[] a(Object[] var0, byte var1) {
      ++j;
      int var2 = fh.a(var0, false);
      int[] var3 = new int[var2];
      int var4 = 0;

      for(int var5 = -93 / ((var1 + 1) / 46); var4 < var2; ++var4) {
         var3[var4] = fh.a(var0, false);
      }

      Object[] var6 = new Object[]{var3};
      return var6;
   }

   static final String a(Object[] var0, boolean var1) {
      ++e;
      StringBuffer var2 = new StringBuffer(80);
      if(null != var0 && 2 == var0.length && var0[1].equals(Boolean.valueOf(false)) && var0[1].equals(Boolean.valueOf(false))) {
         return null;
      } else if(var0[3] == null) {
         return "";
      } else {
         var2.append(((String[])((String[])var0[3]))[0]);

         for(int var3 = 1; var3 < ((Object[])((Object[])var0[3])).length; ++var3) {
            if(null != var0 && -7 == ~var0.length) {
               cua.a((Object[])null, 0);
            }

            for(int var4 = 0; 3 > var4; ++var4) {
               var2.append('.');
            }

            var2.append(((String[])((String[])var0[3]))[var3]);
         }

         if(var1) {
            b = (Object[])null;
         }

         return var2.toString();
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4) {
      if(var0 == -8586) {
         ++d;
         if(var2 + -var4 >= hla.g && td.r >= var4 + var2 && ~sea.k >= ~(var3 + -var4) && var4 + var3 <= sda.c) {
            dg.a(var2, var1, var4, 0, var3);
         } else {
            int var5 = 0;
            int var6 = var4;
            int var7 = -var4;
            int var8 = -1;
            int var9 = eua.a(td.r, (byte)-53, var2 + var4, hla.g);
            int var10 = eua.a(td.r, (byte)-53, var2 + -var4, hla.g);
            fka.a(var1, fda.c[var3], var9, var10, (byte)58);

            while(var6 > var5) {
               var8 += 2;
               var7 += var8;
               int var11;
               int var12;
               int var13;
               int var14;
               if(0 < var7) {
                  --var6;
                  var7 -= var6 << 1;
                  var11 = -var6 + var3;
                  var12 = var6 + var3;
                  if(var12 >= sea.k && sda.c >= var11) {
                     var13 = eua.a(td.r, (byte)-53, var2 + var5, hla.g);
                     var14 = eua.a(td.r, (byte)-53, -var5 + var2, hla.g);
                     if(var12 <= sda.c) {
                        fka.a(var1, fda.c[var12], var13, var14, (byte)37);
                     }

                     if(sea.k <= var11) {
                        fka.a(var1, fda.c[var11], var13, var14, (byte)29);
                     }
                  }
               }

               ++var5;
               var11 = -var5 + var3;
               var12 = var5 + var3;
               if(var12 >= sea.k && sda.c >= var11) {
                  var13 = eua.a(td.r, (byte)-53, var6 + var2, hla.g);
                  var14 = eua.a(td.r, (byte)-53, -var6 + var2, hla.g);
                  if(sda.c >= var12) {
                     fka.a(var1, fda.c[var12], var13, var14, (byte)84);
                  }

                  if(sea.k <= var11) {
                     fka.a(var1, fda.c[var11], var13, var14, (byte)57);
                  }
               }
            }
         }

      }
   }

   static final int a(byte var0, Object[] var1) {
      if(var0 != -57) {
         a((Object[])((Object[])var1[10]), 68, (tha)null, -30L);
      }

      ++g;
      if(pba.b == var1) {
         return 7681;
      } else if(Class_t.c == var1) {
         return 8448;
      } else if(kk.c != var1) {
         if(lf.e != var1) {
            if(var1 != vb.d) {
               throw new IllegalArgumentException();
            } else {
               return '\u84e7';
            }
         } else {
            return 260;
         }
      } else {
         return '\u8575';
      }
   }

   static final boolean a(int var0, int var1, String var2) {
      ma.q = oe.a(new Object[var1]);
      ++h;
      ma.q[0] = var2;
      ((int[])((int[])ma.q[1]))[0] = var0;
      if(mka.g != po.f_i) {
         ((int[])((int[])ma.q[1]))[1] = '\uc350' + ((int[])((int[])ma.q[1]))[0];
         ((int[])((int[])ma.q[1]))[2] = '\u9c40' + ((int[])((int[])ma.q[1]))[0];
      }

      return true;
   }

   static final void a(Object[] var0, int var1, tha var2, long var3) {
      ++a;
      if(((int[])((int[])var0[1]))[0] == 0) {
         tha var5 = hia.b((byte)127, (Object[])((Object[])var0[0]));
         var5.a((byte)73);
         var5.a(8192);
         if(var0[2] == var5) {
            var5 = hia.b((byte)127, (Object[])((Object[])var0[0]));
            var5.a((byte)66);
            var5.a(8192);
         }
      } else {
         --((int[])((int[])var0[1]))[0];
      }

      di.a((Object[])((Object[])var0[3]), true, var2, var3);
      ama.a(var2, (byte)-90, (Object[])((Object[])var0[var1]));
   }

}
