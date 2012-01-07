
final class et {

   static int m;
   static int d = 1;
   static int k;
   static int h;
   static int e;
   static Object[] c;
   static boolean b = false;
   static Object[] j = ed.a(-1, new Object[1], (byte)-107, 22);
   static int f_l;
   static int g;
   static int n;
   static boolean a = false;
   static int f;
   static Object[] f_i = Class_fs.a(2, (byte)-98, new Object[1], 1, 0, 2);


   static final String a(int var0, int var1) {
      if(var1 != -129) {
         a((byte)119, (byte)-31);
      }

      ++h;
      oc var2;
      Object[] var3 = null != (var2 = (oc)pm.a((long)var0, fo.c, false))?var2.n:null;
      if(var3 != null) {
         Object[] var5 = (Object[])((Object[])var3[2]);
         Object[] var4 = (Object[])((Object[])var5[6]);
         if(null != var4) {
            double var7 = ae.a(-2, (Object[])((Object[])var3[2]));
            float var9 = ((float[])((float[])var4[5]))[1];
            if(var7 >= (double)var9) {
               float var10 = ((float[])((float[])var4[5]))[0];
               if(var7 <= (double)var10) {
                  return oc.a(var1 + 131, var4);
               }
            }
         }
      }

      return null;
   }

   static final void a(boolean var0, int var1, Object[] var2, int var3, int var4) {
      ++k;
      int var5 = var1;
      boolean var6 = false;
      if(-1 == var1) {
         Object[] var7 = mca.a(true, ((int[])((int[])var2[1]))[6], lja.d);
         Object[] var8 = var7;
         if(var7[11] != null) {
            var7 = vs.a(bw.b != 0?eo.g:qba.h, var7, (byte)-94);
         }

         if(null == var7) {
            return;
         }

         if(var7 == var8) {
            var8 = null;
         }

         if(es.b(-1019, var7)) {
            if(var0 && wna.a((Object[])((Object[])var2[3]), 4) && sda.a(var7, var3 - 1, lt.a((byte)99, (Object[])((Object[])var2[3])))) {
               return;
            }

            if(~((int[])((int[])var7[1]))[13] != ~((int[])((int[])var2[1]))[2]) {
               var6 = ((boolean[])((boolean[])var7[0]))[14];
            }

            var5 = pca.a(2, var7);
            if(!jga.a(var7, (byte)-48)) {
               var4 = 1;
            } else {
               var4 = 0;
            }
         } else if(var8 != null && es.b(-1019, var8)) {
            if(var0 && wna.a((Object[])((Object[])var2[3]), 4) && sda.a(var8, 2, lt.a((byte)118, (Object[])((Object[])var2[3])))) {
               return;
            }

            if(((int[])((int[])var2[1]))[2] != ((int[])((int[])var7[1]))[13]) {
               var6 = ((boolean[])((boolean[])var8[0]))[14];
            }

            var5 = pca.a(2, var8);
            if(jga.a(var8, (byte)-97)) {
               var4 = 0;
            } else {
               var4 = 1;
            }
         }
      }

      if(var5 == -1) {
         uca.a(false, -1, (byte)-65, (Object[])((Object[])var2[3]));
      } else {
         tma.a(73, 0, (Object[])((Object[])var2[var3]), var4, var6, var5);
         var2[0] = null;
         ((int[])((int[])var2[1]))[4] = kda.d;
         ((boolean[])((boolean[])var2[8]))[1] = false;
      }
   }

   static final int a(Object[] var0, int var1, Object[] var2) {
      ++e;
      String var3 = joa.a(3, var2);
      int[] var4 = bua.a(var2, (int)9);
      if(var4 != null) {
         var3 = var3 + jla.a(var4, var1 ^ 11559);
      }

      int var5 = ob.a(var0, var3, false, sf.g);
      if(((boolean[])((boolean[])var2[4]))[var1]) {
         var5 += 4 + iaa.b.e();
      }

      return var5;
   }

   static final void a(Object[] var0, int var1, byte var2) {
      int var3 = -10 % ((var2 - 13) / 58);
      ((int[])((int[])var0[1]))[0] = var1;
      ++f_l;
      ((int[])((int[])var0[1]))[2] = var1;
   }

   static final boolean a(byte var0, byte var1) {
      ++n;
      if(var1 < 61) {
         return ((boolean[])((boolean[])f_i[0]))[0];
      } else {
         int var2 = 255 & var0;
         return 0 == var2?false:var2 < 128 || 160 <= var2 || 0 != mp.f_i[var2 - 128];
      }
   }

   static final void a(int var0, Object[] var1) {
      if(var1[1] == null) {
         var1[1] = new int[3];
      }

      ++f;
      if(null == var1[3]) {
         var1[3] = new char[1];
      }

      if(var0 == -6075) {
         if(null == var1[0]) {
            var1[0] = new long[1];
         }

      }
   }

   static final void a(int var0, int[] var1, int var2, int var3, Object[] var4) {
      ++g;
      synchronized(var4) {
         if(!((boolean[])((boolean[])var4[3]))[0]) {
            if(mb.a(var4, 6) == null) {
               if(((boolean[])((boolean[])var4[3]))[1]) {
                  ((lm)var4[2]).a((byte)93);
                  wi.a(sl.a, (byte)65);
               }

            } else {
               int var6 = var2 + var3;
               if(df.g) {
                  var6 <<= 1;
               }

               byte var7 = 0;
               byte var8 = 0;
               if(((int[])((int[])var4[var0]))[3] == 2) {
                  var8 = 1;
               }

               while(var3 < var6) {
                  Object[] var9 = mb.a(var4, var0 ^ 7);
                  if(null != var4 && -2 == ~var4.length) {
                     oc.a((Object[])null, (byte)-62);
                  }

                  if(null == var9) {
                     return;
                  }

                  short[][] var10;
                  for(var10 = (short[][])((short[][])var9[1]); var6 > var3 && ~((int[])((int[])var4[1]))[4] > ~var10[0].length; ++((int[])((int[])var4[1]))[4]) {
                     if(!df.g) {
                        int var10001 = var3++;
                        var1[var10001] += var10[var7][((int[])((int[])var4[1]))[4]] * ((int[])((int[])var4[1]))[2] + ((int[])((int[])var4[1]))[0] * var10[var8][((int[])((int[])var4[1]))[4]];
                     } else {
                        var1[var3++] = ((int[])((int[])var4[1]))[2] * var10[var7][((int[])((int[])var4[1]))[4]];
                        var1[var3++] = var10[var8][((int[])((int[])var4[1]))[4]] * ((int[])((int[])var4[1]))[0];
                     }
                  }

                  if(~((int[])((int[])var4[1]))[4] <= ~var10[0].length) {
                     epa.a(var4, -109);
                  }
               }

            }
         }
      }
   }

   static final void a(int var0, int var1, Object[] var2) {
      ++m;
      if(null == var2 || -11 != ~var2.length || !var2[6].equals(Integer.valueOf(2))) {
         nha.a((Object[])((Object[])var2[0]), 18806, 1);
         moa.a((byte)119, (Object[])((Object[])var2[3]), (Object[])((Object[])var2[0]));
         el.a(7681, 30862, mg.a((byte)-124, var1, (Object[])((Object[])var2[0])), (Object[])((Object[])var2[0]));
         af.a(768, (Object[])((Object[])var2[0]), 30579, '\u8577', 1);
         db.a(770, (Object[])((Object[])var2[0]), (byte)-68, 0, '\u8578');
         nha.a((Object[])((Object[])var2[var0]), 18806, 0);
         moa.a((byte)124, (Object[])((Object[])var2[4]), (Object[])((Object[])var2[0]));
         el.a(7681, var0 ^ 30862, '\u86af', (Object[])((Object[])var2[0]));
         af.a(768, (Object[])((Object[])var2[0]), 30579, '\u8576', 1);
         if(-1 == ~((int[])((int[])var2[1]))[1]) {
            moa.a((Object[])((Object[])var2[0]), 1.0F, 0.0F, 0.5F, var0 + 2481, 0.5F);
         } else if(1 == ((int[])((int[])var2[1]))[1]) {
            moa.a((Object[])((Object[])var2[0]), 0.5F, 0.0F, 0.5F, 2481, 1.0F);
         } else if(2 == ((int[])((int[])var2[1]))[1]) {
            moa.a((Object[])((Object[])var2[0]), 0.5F, 0.0F, 1.0F, var0 + 2481, 0.5F);
         } else if(3 == ((int[])((int[])var2[1]))[1]) {
            moa.a((Object[])((Object[])var2[0]), 128.5F, 0.0F, 128.5F, 2481, 128.5F);
         }

      }
   }

}
