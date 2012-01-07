import jaggl.MapBuffer;

final class bb {

   static int c;
   static Object[] b = vra.a(536870911, 23, "", new Object[1]);
   static int a;
   static int h;
   static int f_i;
   static int d;
   static int g;
   static int f;
   static int e;


   static final void a(int var0, long var1, byte var3, Object[] var4, String var5) {
      try {
         ++a;
         if(var5 != null && var5.length() == 0) {
            var5 = null;
         }

         if(~var1 >= -1L != ((boolean[])((boolean[])var4[8]))[0]) {
            if(((boolean[])((boolean[])var4[8]))[1] != (null == var5)) {
               if(var3 == 56) {
                  if(var1 > 0L && (null == var4[6] || ((int[])((int[])var4[1]))[0] >= ((long[])((long[])var4[6])).length) || var5 != null && (null == var4[11] || ~((Object[])((Object[])var4[11])).length >= ~((int[])((int[])var4[1]))[0])) {
                     goa.a(var4, ((int[])((int[])var4[1]))[0] + 5, (byte)-119);
                  }

                  if(null != var4[6]) {
                     ((long[])((long[])var4[6]))[((int[])((int[])var4[1]))[0]] = var1;
                  }

                  if(var4[11] != null) {
                     ((String[])((String[])var4[11]))[((int[])((int[])var4[1]))[0]] = var5;
                  }

                  if(null == var4 || -3 != ~var4.length && var4.length != 11) {
                     if(0 == ~((int[])((int[])var4[1]))[1]) {
                        ((int[])((int[])var4[1]))[1] = ((int[])((int[])var4[1]))[0];
                        ((byte[])((byte[])var4[7]))[((int[])((int[])var4[1]))[0]] = 126;
                     } else {
                        ((byte[])((byte[])var4[7]))[((int[])((int[])var4[1]))[0]] = 0;
                     }

                     ((int[])((int[])var4[0]))[((int[])((int[])var4[1]))[0]] = 0;
                     ((int[])((int[])var4[13]))[((int[])((int[])var4[1]))[0]] = var0;
                     ++((int[])((int[])var4[1]))[0];
                     var4[2] = null;
                  }
               }
            } else {
               throw new RuntimeException("");
            }
         } else {
            throw new RuntimeException("");
         }
      } catch (RuntimeException var7) {
         throw vt.a(var7, "bb.A(" + var0 + ',' + var1 + ',' + var3 + ',' + (var4 != null?"{...}":"null") + ',' + (var5 != null?"{...}":"null") + ')');
      }
   }

   static final cga a(boolean var0, Object[] var1, ta var2) {
      lja.c = var0;
      ++e;
      long var3 = ((!((boolean[])((boolean[])var1[5]))[1]?0L:1L) << 39) + (((!((boolean[])((boolean[])var1[5]))[14]?0L:1L) << 38) + ((((boolean[])((boolean[])var1[5]))[2]?1L:0L) << 35) + (long)((int[])((int[])var1[1]))[57] + ((long)((int[])((int[])var1[1]))[19] << 36) - -((long)((int[])((int[])var1[1]))[54] << 40));
      cga var5 = (cga)dna.a((byte)34, fr.g, var3);
      if(null != var5) {
         return var5;
      } else {
         aea var6 = aea.b(Class_a.a, ((int[])((int[])var1[1]))[57], 0);
         if(null != var6) {
            if(((boolean[])((boolean[])var1[5]))[14]) {
               var6.b();
            }

            if(((boolean[])((boolean[])var1[5]))[1]) {
               var6.c();
            }

            if(((int[])((int[])var1[1]))[19] <= 0) {
               if(((int[])((int[])var1[1]))[54] != 0) {
                  var6.c(1);
               }
            } else {
               var6.c(((int[])((int[])var1[1]))[19]);
            }

            if(-2 >= ~((int[])((int[])var1[1]))[19]) {
               var6.b(1);
            }

            if(((int[])((int[])var1[1]))[19] >= 2) {
               var6.b(16777215);
            }

            if(((int[])((int[])var1[1]))[54] != 0) {
               var6.a(((int[])((int[])var1[1]))[54] | -16777216);
            }

            var5 = var2.a(var6, true);
            if(null != var1 && var1.length == 3) {
               Class_ls.m = (Object[])((Object[])ic.f[5]);
            }

            ava.a(var0, var5.e() * var5.g() * 4, fr.g, var3, var5);
            return var5;
         } else {
            lja.c = true;
            return null;
         }
      }
   }

   static final void a(Object[] var0, int var1, int var2) {
      ++d;
      mn.a((Object[])((Object[])var0[6]), (Object[])((Object[])var0[25]), (byte)74, 0, (Object[])((Object[])var0[31]));
      vla.a((Object[])((Object[])var0[35]), true, (Object[])((Object[])var0[30]), (Object[])((Object[])var0[25]));
      if(var0 != null && -3 == ~var0.length && var0[0].equals(Integer.valueOf(0))) {
         a((Object[])null, -121, (int)0);
      }

      kaa.a((Object[])((Object[])var0[9]), (Object[])((Object[])var0[25]), 112, (Object[])((Object[])var0[37]));
      vm.a((Object[])((Object[])var0[10]), (Object[])((Object[])var0[25]), 29600, (Object[])((Object[])var0[33]));
      bfa.a((Object[])((Object[])var0[15]), -4678, (Object[])((Object[])var0[25]), (Object[])((Object[])var0[28]));
      vm.a((Object[])((Object[])var0[12]), (Object[])((Object[])var0[25]), 29600, (Object[])((Object[])var0[22]));
      bfa.a((Object[])((Object[])var0[3]), var2 - 4678, (Object[])((Object[])var0[25]), (Object[])((Object[])var0[23]));
      bfa.a((Object[])((Object[])var0[16]), -4678, (Object[])((Object[])var0[25]), (Object[])((Object[])var0[27]));
      bfa.a((Object[])((Object[])var0[11]), -4678, (Object[])((Object[])var0[25]), (Object[])((Object[])var0[18]));
      bfa.a((Object[])((Object[])var0[13]), -4678, (Object[])((Object[])var0[25]), (Object[])((Object[])var0[34]));
      bfa.a((Object[])((Object[])var0[14]), -4678, (Object[])((Object[])var0[25]), (Object[])((Object[])var0[36]));
      fta.a((Object[])((Object[])var0[25]), 0.0F, (Object[])((Object[])var0[32]), (float)var2, 0.0F, (byte)21, 0.0F);
      if(var1 > 0) {
         Object[] var3 = (Object[])((Object[])var0[25]);
         Object[] var4 = (Object[])((Object[])var0[21]);
         float[] var5 = (float[])((float[])var0[5]);
         if(var0 != null && var0.length == 1 && var0[0].equals(Boolean.valueOf(false)) && var0[0].equals(Boolean.valueOf(false))) {
            a((Object[])null, 30, (int)0);
         }

         int var6 = 4 * var1;
         kv.a(var6, var4, (byte)-108, ((Object[][])((Object[][])var3[3]))[((int[])((int[])var3[1]))[2]], var5);
         Object[] var7 = (Object[])((Object[])var0[25]);
         Object[] var8 = (Object[])((Object[])var0[38]);
         float[] var9 = (float[])((float[])var0[2]);
         int var10 = 4 * var1;
         kv.a(var10, var8, (byte)-108, ((Object[][])((Object[][])var7[3]))[((int[])((int[])var7[1]))[2]], var9);
      }

      vw.a(vqa.j, (Object[])((Object[])var0[8]), ((int[])((int[])var0[1]))[2], ((int[])((int[])var0[1]))[0], ((int[])((int[])var0[1]))[1], (byte)-122, ((int[])((int[])var0[1]))[3]);
   }

   static final void b(int var0, Object[] var1) {
      ++f;
      var1[82] = ura.a(-80, new Object[2]);
      var1[89] = ura.a(-94, new Object[2]);
      var1[81] = ura.a(-16, new Object[2]);
      var1[77] = ura.a(-20, new Object[2]);
      var1[87] = ura.a(-14, new Object[2]);
      var1[80] = ura.a(-21, new Object[2]);
      var1[74] = ura.a(-35, new Object[2]);
      int var2 = 68 % ((37 - var0) / 56);
      var1[88] = new Object[16][];
      var1[83] = new int[1000];
      new MapBuffer();
      if(var1 != null && var1.length == 1 && var1[0].equals(Integer.valueOf(0))) {
         kf.a((Object[])null, (int)14176);
      }

      new MapBuffer();
      var1[84] = new float[16];
      var1[76] = new float[4];
   }

   static final int a(int var0, Object[] var1) {
      ++c;
      if(var0 != -17157) {
         a((Object[])null, 14, (int)-84);
      }

      return 0;
   }

   static final Object[] a(Object[] var0, byte var1) {
      hqa.a(123, var0);
      ++h;
      if(var1 >= -33) {
         a(59, 48L, ((byte[])((byte[])b[2]))[11], (Object[])null, (String)b[3]);
      }

      uca.a(1, var0, false, false);
      ((int[])((int[])var0[1]))[2] = 2048;
      ((int[])((int[])var0[1]))[3] = 1024;
      ((int[])((int[])var0[1]))[1] = 3072;
      return var0;
   }

   static final Object[] a(Object[] var0, int var1, byte var2) {
      ++f_i;
      li var3;
      Object[] var5 = (var3 = (li)dna.a((byte)34, (Object[])((Object[])var0[0]), (long)var1)) == null?null:var3.B;
      if(null != var5) {
         return var5;
      } else {
         if(var2 < 95) {
            g = -40;
         }

         byte[] var6;
         if('\u8000' > var1) {
            var6 = qn.a(0, var1, (Object[])((Object[])var0[1]), 123);
         } else {
            var6 = qn.a(0, var1 & 32767, (Object[])((Object[])var0[2]), -116);
         }

         Object[] var8 = new Object[6];
         var8[1] = rea.b(var8, -85);
         if(var6 != null) {
            it.a(var8, jta.a((byte)-126, var6, new Object[3]), true);
         }

         if('\u8000' <= var1) {
            ula.a(101, var8);
         }

         Object[] var4;
         il.a((long)var1, null == (var4 = var8)?null:var4[1], true, (Object[])((Object[])var0[0]));
         return var8;
      }
   }

}
