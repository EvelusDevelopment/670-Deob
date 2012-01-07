import jaggl.OpenGL;

final class mh extends tha {

   static int t;
   static int z;
   static int v;
   static int w;
   Object[] u;
   static Object[] y = sd.a(new Object[1], 99, (byte)123);
   static Object[] x;


   static final void a(tha var0, byte var1, tha var2) {
      if(var2.r != null) {
         var2.a(8192);
      }

      ++z;
      var2.r = var0;
      var2.s = var0.s;
      if(var1 != -75) {
         a(true, (Object[])((Object[])x[14]));
      }

      var2.r.s = var2;
      var2.s.r = var2;
   }

   mh(Object[] var1) {
      this.u = var1;
   }

   static final void a(boolean var0, Object[] var1) {
      ++w;
      if(((boolean[])((boolean[])var1[0]))[0]) {
         ((boolean[])((boolean[])var1[0]))[0] = var0;
         byte[] var2 = (byte[])((byte[])((Object[])((Object[])var1[4]))[0]);
         byte[] var3 = (byte[])((byte[])((Object[])((Object[])var1[5]))[51]);
         int var4 = 0;
         int var5 = ((int[])((int[])((Object[])((Object[])var1[4]))[1]))[0];
         int var6 = ((int[])((int[])var1[1]))[1] + ((int[])((int[])((Object[])((Object[])var1[4]))[1]))[0] * ((int[])((int[])var1[1]))[0];

         int var7;
         int var8;
         for(var7 = -128; 0 > var7; ++var7) {
            var4 = (var4 << 8) - var4;
            if(null != var1 && -2 == ~var1.length) {
               a(false, (Object[])null);
            }

            for(var8 = -128; 0 > var8; ++var8) {
               if(var2[var6++] != 0) {
                  ++var4;
               }
            }

            var6 += -128 + var5;
         }

         if(null == var1 || -25 != ~var1.length || !var1[3].equals(Integer.valueOf(1)) || !var1[3].equals(Integer.valueOf(1))) {
            if(null != var1[3] && var4 == ((int[])((int[])var1[1]))[3]) {
               ((boolean[])((boolean[])var1[0]))[0] = false;
            } else {
               ((int[])((int[])var1[1]))[3] = var4;
               var6 = ((int[])((int[])var1[1]))[1] + ((int[])((int[])var1[1]))[0] * var5;
               var7 = 0;

               for(var8 = -128; var8 < 0; ++var8) {
                  for(int var9 = -128; var9 < 0; ++var9) {
                     if(var2[var6] == 0) {
                        int var10 = 0;
                        if(0 != var2[var6 - 1]) {
                           ++var10;
                        }

                        if(0 != var2[1 + var6]) {
                           ++var10;
                        }

                        if(var2[-var5 + var6] != 0) {
                           ++var10;
                        }

                        if(0 != var2[var6 + var5]) {
                           ++var10;
                        }

                        var3[var7++] = (byte)(var10 * 17);
                     } else {
                        var3[var7++] = 68;
                     }

                     ++var6;
                  }

                  var6 += ((int[])((int[])((Object[])((Object[])var1[4]))[1]))[0] - 128;
                  if(null != var1 && 6 == var1.length && var1[2].equals(Integer.valueOf(2))) {
                     return;
                  }
               }

               if(null == var1[3]) {
                  var1[3] = wqa.a(new Object[6], br.f, vk.f, br.f, false, 1, 3553, 128, false, 128, (byte[])((byte[])((Object[])((Object[])var1[5]))[51]), (Object[])((Object[])var1[5]));
                  pda.a(false, false, (Object[])((Object[])var1[3]), false);
                  gg.a((byte)-93, (Object[])((Object[])var1[3]), true);
               } else {
                  hr.a(128, (byte[])((byte[])((Object[])((Object[])var1[5]))[51]), false, (byte)94, br.f, 0, 0, (Object[])((Object[])var1[3]), 0, 128, 0);
               }

            }
         }
      }
   }

   static final void a(Object[] var0, Object[] var1, boolean var2, float var3) {
      ++v;
      int var4 = tea.a(var2, var0);
      if(var4 != -1) {
         if(var3 != ((float[])((float[])var1[14]))[var4]) {
            ((float[])((float[])var1[14]))[var4] = var3;
            if(eva.b(117, var0) != qla.a && eva.b(-87, var0) != aqa.m) {
               throw new bba(var0, "");
            }

            OpenGL.glUniform1f(var4, var3);
         }

      }
   }

   static final int a(int var0, Object[] var1) {
      ++t;
      if(var0 < 67) {
         ((int[])((int[])var1[14]))[2] = ((int[])((int[])y[19]))[22];
      }

      return ((int[])((int[])var1[1]))[0];
   }

}
