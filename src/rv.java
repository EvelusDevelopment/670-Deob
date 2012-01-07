import jaggl.OpenGL;

final class rv {

   static Object[][] c;
   static int f;
   static int f_i;
   static int b;
   static int h;
   static int d;
   static int a;
   static int g;
   static int e;


   static final long a(int var0, Object[] var1) {
      ++h;
      return var0 != 15?90L:((long[])((long[])var1[2]))[0];
   }

   static final void a(int var0, int var1, int var2, int var3, Object[] var4, int var5) {
      if(~var5 > ~((int[])((int[])var4[var3]))[15]) {
         ((int[])((int[])var4[1]))[15] = var5;
      }

      ++f_i;
      if(var1 > ((int[])((int[])var4[1]))[10]) {
         ((int[])((int[])var4[1]))[10] = var1;
      }

      if(((int[])((int[])var4[1]))[25] > var2) {
         ((int[])((int[])var4[1]))[25] = var2;
      }

      if(((int[])((int[])var4[1]))[28] < var0) {
         ((int[])((int[])var4[1]))[28] = var0;
      }

      OpenGL.glEnable(3089);
      no.a(true, var4);
   }

   static final void a(int var0, int var1, int var2, Object[] var3) {
      if(var2 != 128) {
         var3[1] = (Object)null;
      }

      ++d;
      int var4 = 0;
      if((1 & var0) != 0) {
         OpenGL.glClearColor((float)(var1 & 16711680) / 1.671168E7F, (float)('\uff00' & var1) / 65280.0F, (float)(var1 & 255) / 255.0F, (float)(var1 >>> 24) / 255.0F);
         var4 = 16384;
      }

      if(0 != (2 & var0)) {
         var4 |= 256;
         jma.a(123, true, var3);
      }

      if(-1 != ~(var0 & 4)) {
         var4 |= 1024;
      }

      OpenGL.glClear(var4);
   }

   static final void b(int var0, Object[] var1) {
      Object[] var2;
      byte[] var3;
      if(ne.d == null) {
         var2 = ww.b(new Object[7], true);
         var2[5] = new byte[524288];
         dba.a(var2, 16, 128, -98, 128);
         var3 = (byte[])((byte[])var2[5]);
         ne.d = fja.a(-137, var3, false);
      }

      if(var0 != 128) {
         c = (Object[][])((Object[][])null);
      }

      ++a;
      if(ee.b == null) {
         var2 = kda.a(new Object[6], 16);
         var2[5] = new byte[524288];
         dba.a(var2, 16, 128, -85, 128);
         var3 = (byte[])((byte[])var2[5]);
         ee.b = fja.a(var0 ^ -9, var3, false);
      }

      var2 = (Object[])((Object[])var1[28]);
      if(fi.a(var2, 3) && null == ke.d) {
         var3 = ci.a(4.0F, 16.0F, kla.a(419684, new Object[1], false), 8, 0.6F, 0.5F, 4.0F, 16, 1, 128, 128);
         ke.d = fja.a(var0 ^ -9, var3, false);
      }

   }

   static final void a(int var0, Object[] var1, Object[] var2, Object[] var3) {
      ++g;
      int var4;
      if(null != var3 && var3.length == 16) {
         var4 = tea.a(false, var2);
         if(-1 != var4) {
            OpenGL.glUniform2fv(var4, 4, sb.a(22981, var1, fta.P), 0);
         }

      } else {
         if(var0 != -17242) {
            a(((byte[])((byte[])((Object[])((Object[])((Object[])((Object[])var2[0]))[0]))[1]))[0], (Object[])null, (ta)null);
         }

         if(null != var3 && var3.length == 12) {
            var4 = va.a(var2, (byte)64);
            int var5 = nba.a(var2, (byte)-99);
            if(eva.b(95, var2) != pna.f) {
               throw new bba(var2, "");
            } else {
               if(0 <= var4) {
                  gj.a(var3, 8, dna.a(var1, wg.z, -4631), (byte)107, var4);
               }

               if(var5 >= 0) {
                  gua.a(8, var5, dna.a(var1, wg.z, -4631), var0 ^ 17189, var3);
               }

            }
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final nj a(Object[] var0, int var1) {
      ++b;
      nj var2 = ((nj)var0[0]).f;
      if(var2 != var0[0]) {
         var2.a(1);
         return var1 > -50?(nj)null:var2;
      } else {
         return null;
      }
   }

   static final Object[] a(byte var0, Object[] var1, ta var2) {
      int var3 = 89 / ((var0 - 31) / 48);
      ++e;
      return null;
   }

   static final Object[] a(Object[] var0, Object[] var1, int var2) {
      aa.a(15022, var1, var0);
      if(var2 != 5) {
         c = (Object[][])((Object[][])null);
      }

      ++f;
      return var0;
   }

}
