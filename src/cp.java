
final class cp {

   static int a;
   static String e = "<br>";
   static int c;
   static int b;
   static int f;
   static int d;


   static final int[] a(int var0, Object[] var1, int var2) {
      ++b;
      int var3 = 57 % ((36 - var0) / 41);
      throw new IllegalStateException();
   }

   static final int a(Object[] var0, int var1) {
      ++c;
      if(var1 >= -125) {
         return -7;
      } else if(~((int[])((int[])var0[1]))[35] != 0) {
         return ((int[])((int[])var0[1]))[35];
      } else if(var0[3] == null) {
         return -1;
      } else {
         if(null != var0 && var0.length == 3) {
            gr.a(new Object[0][], -106);
         }

         int var2 = (int)(Math.random() * (double)((int[])((int[])var0[1]))[27]);

         int var3;
         for(var3 = 0; var2 >= ((int[])((int[])var0[2]))[var3]; ++var3) {
            var2 -= ((int[])((int[])var0[2]))[var3];
         }

         return ((int[])((int[])var0[3]))[var3];
      }
   }

   static final int a(byte var0, Object[] var1) {
      ++d;
      if(var0 != 60) {
         ((int[])((int[])((Object[])((Object[])var1[7]))[0]))[5] = ((int[])((int[])((Object[])((Object[])((Object[])((Object[])var1[18]))[1]))[0]))[7];
      }

      byte[] var10001 = (byte[])((byte[])var1[2]);
      int[] var10002 = (int[])((int[])var1[1]);
      int var10005 = ((int[])((int[])var1[1]))[0];
      var10002[0] = ((int[])((int[])var1[1]))[0] + 1;
      return 255 & var10001[var10005] - 128;
   }

   static final int[] a(Object[] var0, int var1, int var2) {
      ++f;
      int[] var3 = od.a(-1704, var2, (Object[])((Object[])var0[5]));
      if(var1 > -8) {
         return (int[])null;
      } else {
         if(((boolean[])((boolean[])((Object[])((Object[])var0[5]))[4]))[0]) {
            if(var0 != null && 4 == var0.length) {
               a((Object[])null, -123, 108);
            }

            int[] var4 = vea.a(var0, 0, var2 - 1 & wq.e, (byte)-8);
            int[] var5 = vea.a(var0, 0, var2, (byte)-8);
            int[] var6 = vea.a(var0, 0, 1 + var2 & wq.e, (byte)-8);

            for(int var7 = 0; fo.b > var7; ++var7) {
               int var8 = ((int[])((int[])var0[1]))[1] * (var6[var7] - var4[var7]);
               int var9 = (-var5[td.q & -1 + var7] + var5[td.q & var7 + 1]) * ((int[])((int[])var0[1]))[1];
               int var10 = var9 >> 12;
               int var11 = var8 >> 12;
               int var12 = var10 * var10 >> 12;
               int var13 = var11 * var11 >> 12;
               int var14 = (int)(4096.0D * Math.sqrt((double)((float)(var13 + var12 + 4096) / 4096.0F)));
               int var15 = 0 != var14?16777216 / var14:0;
               var3[var7] = -var15 + 4096;
            }
         }

         return var3;
      }
   }

   static final void a(int var0) {
      hga.g = var0;

      for(int var1 = 0; var1 < eja.c; ++var1) {
         for(int var2 = 0; var2 < me.c; ++var2) {
            if(ju.g[var0][var1][var2] == null) {
               ju.g[var0][var1][var2] = jg.a(116, var0, new Object[10]);
            }
         }
      }

   }

}
