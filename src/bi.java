import java.util.Random;

final class bi {

   static int d;
   static int[] f = new int[2048];
   static Object[] g = ho.a(-1, 73, new Object[1], true);
   static int a;
   static int h;
   static int k;
   static int b;
   static int j;
   static int f_i;
   static int e;
   static char[] c = new char[]{'[', ']', '#'};


   static final void a(Object[] var0, Object[] var1, int var2) {
      ++k;
      ((int[])((int[])var0[1]))[1] = td.a(var1, 90);
      ((int[])((int[])var0[1]))[var2] = de.a((int)0, var1);
      var0[0] = new Object[fh.a(var1, false)][];
      Object[][] var3 = new Object[][]{no.a, ld.e, kaa.a, qj.b, nsa.a, gca.e, nt.j, jta.e, we.d, sd.f};
      Object[][] var4 = var3;

      for(int var5 = 0; ((Object[])((Object[])var0[0])).length > var5; ++var5) {
         ((Object[][])((Object[][])var0[0]))[var5] = jd.a(0, var4[fh.a(var1, false)], var0, var1);
      }

      if(var0 == null || -2 != ~var0.length && -13 != ~var0.length && 23 != var0.length) {
         ;
      }
   }

   static final void a(int var0, Object[] var1, Object[] var2) {
      try {
         ++f_i;
         if(null == var2 || 1 != var2.length && 2 != var2.length) {
            if(~((long[])((long[])var2[10]))[0] == ~((long[])((long[])var1[2]))[0] && ((int[])((int[])var1[1]))[0] == ((int[])((int[])var2[1]))[5]) {
               if(var0 != -22970) {
                  f = (int[])((int[])g[1]);
               }

               ul var3;
               ul var4;
               for(Object[] var5 = null == (var3 = (ul)dda.a((Object[])((Object[])var1[0]), 2))?null:var3.j; null != var5; var5 = (var4 = (ul)client.a((Object[])((Object[])var1[0]), -28280)) != null?var4.j:null) {
                  epa.a((byte)-26, var5, var2);
               }

               ++((int[])((int[])var2[1]))[5];
            } else {
               throw new RuntimeException("");
            }
         }
      } catch (RuntimeException var6) {
         throw vt.a(var6, "bi.A(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

   static final int a(int var0, int var1, String var2, boolean var3) {
      ++e;
      if(2 <= var0 && var0 <= 36) {
         boolean var4 = false;
         boolean var5 = false;
         int var6 = 0;
         int var7 = var2.length();
         if(var1 != -49) {
            g = (Object[])null;
         }

         for(int var8 = 0; var7 > var8; ++var8) {
            char var9 = var2.charAt(var8);
            if(0 == var8) {
               if(var9 == 45) {
                  var4 = true;
                  continue;
               }

               if(43 == var9 && var3) {
                  continue;
               }
            }

            int var11;
            if(48 <= var9 && var9 <= 57) {
               var11 = var9 - 48;
            } else if(65 <= var9 && var9 <= 90) {
               var11 = var9 - 55;
            } else {
               if(var9 < 97 || 122 < var9) {
                  throw new NumberFormatException();
               }

               var11 = var9 - 87;
            }

            if(var11 >= var0) {
               throw new NumberFormatException();
            }

            if(var4) {
               var11 = -var11;
            }

            int var10 = var11 + var0 * var6;
            if(~var6 != ~(var10 / var0)) {
               throw new NumberFormatException();
            }

            var5 = true;
            var6 = var10;
         }

         if(var5) {
            return var6;
         } else {
            throw new NumberFormatException();
         }
      } else {
         throw new IllegalArgumentException("" + var0);
      }
   }

   static final Object[] a(Object[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      bta.a(54, var0);
      ++d;
      var0[0] = new short[512];
      ((int[])((int[])var0[1]))[2] = 4;
      ((int[])((int[])var0[1]))[0] = 4;
      ((int[])((int[])var0[1]))[1] = 4;
      ((int[])((int[])var0[1]))[3] = 0;
      ((int[])((int[])var0[1]))[4] = 4;
      ((int[])((int[])var0[1]))[1] = var1;
      ((int[])((int[])var0[1]))[3] = var5;
      ((int[])((int[])var0[1]))[2] = var4;
      ((int[])((int[])var0[1]))[4] = var3;
      ((int[])((int[])var0[1]))[var6] = var2;
      var0[2] = new short[((int[])((int[])var0[1]))[0]];

      for(int var7 = 0; ((int[])((int[])var0[1]))[0] > var7; ++var7) {
         ((short[])((short[])var0[2]))[var7] = (short)((int)Math.pow(2.0D, (double)var7));
      }

      Random var12 = new Random((long)((int[])((int[])var0[1]))[3]);
      if(var0 != null && 24 == var0.length) {
         return null;
      } else {
         int var8;
         for(var8 = 0; var8 < 255; ++var8) {
            ((short[])((short[])var0[0]))[var8] = (short)var8;
         }

         for(var8 = 0; var8 < 255; ++var8) {
            int var9 = 255 + -var8;
            int var10 = cl.a(114, var12, var9);
            short var11 = ((short[])((short[])var0[0]))[var10];
            ((short[])((short[])var0[0]))[var10] = ((short[])((short[])var0[0]))[var9];
            ((short[])((short[])var0[0]))[var9] = ((short[])((short[])var0[0]))[256 + var9] = var11;
         }

         return var0;
      }
   }

   static final void a(byte var0) {
      ++b;
      oc var1;
      Object[] var4 = null == (var1 = (oc)qt.a(0, fo.c))?null:var1.n;
      if(var0 != 71) {
         c = (char[])null;
      }

      oc var2;
      for(; null != var4; var4 = (var2 = (oc)nda.a(1, fo.c)) != null?var2.n:null) {
         Object[] var6 = (Object[])((Object[])var4[2]);
         boolean var5;
         if(!((boolean[])((boolean[])var6[7]))[1] && !((boolean[])((boolean[])var6[7]))[3]) {
            var5 = false;
         } else if(var6[8] != null && gk.a((Object[])((Object[])var6[8]), -16356) > 0) {
            var5 = false;
         } else {
            var5 = true;
         }

         if(!var5) {
            fj.a(127, (Object[])((Object[])var4[2]));

            try {
               hpa.a((Object[])((Object[])var4[2]), -92);
            } catch (Exception var12) {
               taa.a(var12, 32, "" + ((int[])((int[])var4[1]))[0]);
               nia.a(-7027, ((int[])((int[])var4[1]))[0]);
            }

            if(!((boolean[])((boolean[])var4[3]))[1] && !((boolean[])((boolean[])var4[3]))[0]) {
               Object[] var8 = (Object[])((Object[])var4[2]);
               Object[] var7 = (Object[])((Object[])var8[8]);
               if(null != var7) {
                  Object[] var10 = uga.c((byte)113, var7);
                  if(null != var10) {
                     et.a(var10, ((int[])((int[])var4[1]))[1], (byte)-69);
                     ah.d.a((kp)(var10 != null?var10[2]:null));
                     ((boolean[])((boolean[])var4[3]))[1] = true;
                  }
               }
            }
         } else {
            nia.a(-7027, ((int[])((int[])var4[1]))[0]);
         }
      }

   }

   static final Object[] a(int var0, float var1, float var2, float var3, float var4) {
      ++h;
      Object[][] var5 = Class_m.f;
      synchronized(Class_m.f) {
         if(var0 != 31728) {
            a(new Object[2], (Object[])null, -118);
         }

         if(0 != te.c) {
            gfa.a(var4, 110, var2, Class_m.f[--te.c], var3, var1);
            return Class_m.f[te.c];
         } else {
            return wu.a(true, new Object[2], var1, var4, var3, var2);
         }
      }
   }

   static final boolean a(ya var0, int var1, int var2, int var3, boolean[] var4) {
      boolean var5 = false;
      if(jp.o != wd.a) {
         int var6 = bf.f_l[var1].a(1, var2, var3);

         for(int var7 = 0; var7 <= var1; ++var7) {
            aa var8 = bf.f_l[var7];
            if(var8 != null) {
               int var9 = var6 - var8.a(1, var2, var3);
               if(var4 != null) {
                  var4[var7] = var8.a(var0, var2, var9, var3, 0, false);
                  if(!var4[var7]) {
                     continue;
                  }
               }

               var8.ja(var0, var2, var9, var3, 0, false);
               var5 = true;
            }
         }
      }

      return var5;
   }

}
