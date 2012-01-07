
final class Class_p {

   static int a = 0;
   static int c;
   static int b;
   static int e;
   static int d;


   static final void a(int var0, Object[] var1, Object[] var2) {
      ++b;
      int var3 = fh.a(var1, false);
      if(-2 == ~oua.a((byte)-26, (Object[])((Object[])tu.d[6])) && br.e.x() > 0) {
         if(-1 != ~(var3 & 1)) {
            ((int[])((int[])var2[1]))[5] = lr.a(var0 + 2, var1);
         } else {
            ((int[])((int[])var2[1]))[5] = to.b;
         }

         if((var3 & 2) == 0) {
            ((float[])((float[])var2[2]))[3] = 1.1523438F;
         } else {
            ((float[])((float[])var2[2]))[3] = (float)de.a(var0 + 1, var1) / 256.0F;
         }

         if((4 & var3) == 0) {
            ((float[])((float[])var2[2]))[2] = 0.69921875F;
         } else {
            ((float[])((float[])var2[2]))[2] = (float)de.a((int)0, var1) / 256.0F;
         }

         if(0 == (8 & var3)) {
            ((float[])((float[])var2[2]))[0] = 1.2F;
         } else {
            ((float[])((float[])var2[2]))[0] = (float)de.a((int)0, var1) / 256.0F;
         }
      } else {
         if((var3 & 1) != 0) {
            lr.a(1, var1);
         }

         if(-1 != ~(var3 & 2)) {
            de.a((int)0, var1);
         }

         if((var3 & 4) != 0) {
            de.a((int)0, var1);
         }

         if((8 & var3) != 0) {
            de.a(var0 + 1, var1);
         }

         ((float[])((float[])var2[2]))[2] = 0.69921875F;
         ((float[])((float[])var2[2]))[3] = 1.1523438F;
         ((int[])((int[])var2[1]))[5] = to.b;
         ((float[])((float[])var2[2]))[0] = 1.2F;
      }

      if((var3 & 16) != 0) {
         ((int[])((int[])var2[1]))[3] = jia.c(-8166, var1);
         ((int[])((int[])var2[1]))[0] = jia.c(-8166, var1);
         ((int[])((int[])var2[1]))[4] = jia.c(-8166, var1);
      } else {
         ((int[])((int[])var2[1]))[0] = -60;
         ((int[])((int[])var2[1]))[4] = -50;
         ((int[])((int[])var2[1]))[3] = -50;
      }

      if(0 == (var3 & 32)) {
         ((int[])((int[])var2[1]))[1] = td.n;
      } else {
         ((int[])((int[])var2[1]))[1] = lr.a(1, var1);
      }

      if((64 & var3) != 0) {
         ((int[])((int[])var2[1]))[2] = de.a((int)0, var1);
      } else {
         ((int[])((int[])var2[1]))[2] = 0;
      }

      if(var0 == ~(128 & var3)) {
         var2[3] = gt.c;
      } else {
         int var4 = de.a((int)0, var1);
         int var5 = de.a(~var0, var1);
         int var6 = de.a((int)0, var1);
         int var7 = de.a(~var0, var1);
         int var8 = de.a(var0 + 1, var1);
         int var9 = de.a((int)0, var1);
         var2[3] = cw.a(var8, var5, var7, var9, var6, -70, var4);
      }

   }

   static final void a(Object[] var0, int var1, Object[] var2, int var3) {
      if(var1 == 2) {
         ((boolean[])((boolean[])var2[3]))[0] = fh.a(var0, false) == 1;
      } else if(var1 == 1) {
         ((int[])((int[])var2[1]))[1] = de.a((int)0, var0);
      } else if(var1 == 0) {
         ((int[])((int[])var2[1]))[2] = de.a((int)0, var0);
      }

      ++c;
      if(var3 > -98) {
         a(-42, -101, 66, (Object[])null, new Object[6]);
      }

   }

   static final void a(int var0, int var1, int var2, Object[] var3, Object[] var4) {
      Object[] var5 = ws.a(var0, var1, var2);
      if(var5 != null) {
         var5[4] = var3;
         var5[2] = var4;
         int var6 = jp.o == wd.a?1:0;
         if(eb.c(81, var3)) {
            if(kca.a(var3, 27381)) {
               var3[11] = usa.e[var6];
               usa.e[var6] = var3;
            } else {
               var3[11] = ri.f_l[var6];
               ri.f_l[var6] = var3;
               bla.b = true;
            }
         } else {
            var3[11] = sfa.g[var6];
            sfa.g[var6] = var3;
         }

         if(var4 != null) {
            if(eb.c(36, var4)) {
               if(kca.a(var4, 27381)) {
                  var4[11] = usa.e[var6];
                  usa.e[var6] = var4;
               } else {
                  var4[11] = ri.f_l[var6];
                  ri.f_l[var6] = var4;
                  bla.b = true;
               }
            } else {
               var4[11] = sfa.g[var6];
               sfa.g[var6] = var4;
            }
         }
      }

   }

   static final boolean a(Object[] var0, int var1, int var2, byte var3) {
      ++d;
      Object[] var4 = nja.a(var1, 1, var2);
      if(var3 < 26) {
         return false;
      } else if(null != var4) {
         var0[0] = hca.f[var1 >> 16];
         var0[1] = var4;
         return true;
      } else {
         var0[1] = null;
         var0[0] = null;
         return false;
      }
   }

}
