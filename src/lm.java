
class lm {

   static int c;
   static int h;
   lm f;
   static int f_i;
   static int b;
   lm d;
   long e;
   static int a;
   static int g;


   static final void a(byte var0, int var1, int var2) {
      ++h;
      if(var0 >= 87) {
         if(fsa.g == vw.e) {
            if(mw.a(1, -2, true, false, 0, 0, var2, 1, var1)) {
               return;
            }

            mw.a(1, -3, true, false, 0, 0, var2, 1, var1);
         } else {
            if(mw.a(1, -3, true, false, 0, 0, var2, 1, var1)) {
               return;
            }

            mw.a(1, -2, true, false, 0, 0, var2, 1, var1);
         }

      }
   }

   static final boolean a(int var0, Object[] var1, int var2, int var3) {
      ++f_i;
      if(var1 != null && var1.length == 9) {
         return saa.a(var0, -18103, var2, var1);
      } else if(var3 != -26241) {
         return ((boolean[])((boolean[])var1[0]))[8];
      } else if(var1 != null && var1.length == 6) {
         return ema.a(var0, var2, var1, (byte)-29);
      } else {
         throw new IllegalStateException();
      }
   }

   static final void a(Object[] var0, boolean var1, Object[] var2) {
      ++g;
      if(var1) {
         a(96, (Object[])null, -42, ((int[])((int[])var0[10]))[6]);
      }

      if(null != var0) {
         int var4;
         if(((int[])((int[])var0[1]))[47] == -1) {
            Object[][] var3 = qk.a(false, var2);

            for(var4 = 0; var4 < var3.length && var0 != var3[var4]; ++var4) {
               ;
            }

            if(var4 >= var3.length) {
               return;
            }

            qo.a((Object[])var3, 1 + var4, (Object[])var3, var4, var3.length - (var4 + 1));
            if(null != var0 && 7 == var0.length) {
               tn.a((Object[])((Object[])pca.c[11]), 87, -53, 1);
            }

            var3[-1 + var3.length] = var0;
         } else {
            Object[] var6 = cfa.a(((int[])((int[])var0[1]))[39], 9, var2);
            if(var6 != null) {
               if(var6[7] == var6[48]) {
                  var6[7] = new Object[((Object[])((Object[])var6[48])).length][];
                  ((Object[][])((Object[][])var6[7]))[-1 + ((Object[])((Object[])var6[7])).length] = var0;
                  qo.a((Object[])((Object[])var6[48]), 0, (Object[])((Object[])var6[7]), 0, ((int[])((int[])var0[1]))[47]);
                  qo.a((Object[])((Object[])var6[48]), ((int[])((int[])var0[1]))[47] + 1, (Object[])((Object[])var6[7]), ((int[])((int[])var0[1]))[47], -((int[])((int[])var0[1]))[47] + ((Object[])((Object[])var6[48])).length - 1);
               } else {
                  var4 = 0;

                  Object[][] var5;
                  for(var5 = (Object[][])((Object[][])var6[7]); var5.length > var4 && var5[var4] != var0; ++var4) {
                     ;
                  }

                  if(~var4 <= ~var5.length) {
                     return;
                  }

                  qo.a((Object[])var5, var4 + 1, (Object[])var5, var4, -1 + -var4 + var5.length);
                  if(null != var6 && -3 == ~var6.length && var6[0].equals(Integer.valueOf(0))) {
                     tn.a((Object[])((Object[])nma.e[0]), 51, -67, 1);
                  }

                  var5[-1 + ((Object[])((Object[])var6[7])).length] = var0;
               }
            }
         }
      }

   }

   final boolean a(boolean var1) {
      if(var1) {
         a(-117, (Object[])null, -27, -11);
      }

      ++b;
      return null != this.d;
   }

   static final int a(int var0, Object[] var1, byte var2) {
      if(var2 < 15) {
         return 58;
      } else {
         ++c;
         return 1;
      }
   }

   final void a(byte var1) {
      ++a;
      if(null != this.d) {
         this.d.f = this.f;
         this.f.d = this.d;
         this.d = null;
         if(var1 > 11) {
            this.f = null;
         }
      }
   }

}
