import java.awt.Rectangle;

final class ha {

   static int g;
   static int b;
   static Object[] f_i;
   static int h;
   static int e;
   static int a;
   static int c;
   static int f;
   static int d;


   static final void a(int var0, int var1, Object[] var2, int var3) {
      ++a;
      if(ra.h) {
         Object[] var4 = -1 != ck.e?jd.a(ck.e, (byte)-125, bm.c):null;
         if(la.a(6860, client.c(var2)) && (kd.c & 32) != 0 && (null == var4 || pia.a((byte)-115, var2, ck.e, ((int[])((int[])var4[1]))[0]) != ((int[])((int[])var4[1]))[0])) {
            oja.a(((int[])((int[])var2[1]))[3], kca.b + " " + iv.a + " " + (String)var2[15], (long)(((int[])((int[])var2[1]))[3] | ((int[])((int[])var2[1]))[47] << 0), false, aj.a, false, ((int[])((int[])var2[1]))[47], true, qp.b, ((int[])((int[])var2[1]))[13], (byte)-56, 22, 0L);
            ++os.h;
         }
      }

      for(int var7 = 9; var7 >= 5; --var7) {
         String var5 = mpa.a(var7, var2, (byte)-102);
         if(null != var5) {
            ++aia.d;
            oja.a(((int[])((int[])var2[1]))[3], (String)var2[15], (long)(((int[])((int[])var2[1]))[47] << 0 | ((int[])((int[])var2[1]))[3]), false, mqa.a(var7, 32007, var2), false, ((int[])((int[])var2[1]))[47], true, var5, ((int[])((int[])var2[1]))[13], (byte)-28, 1004, (long)(var7 + 1));
         }
      }

      if(null != var2 && (var2.length == 23 && var2[0].equals(Integer.valueOf(2)) || -3 == ~var2.length)) {
         bia.f = ((int[])((int[])ij.f[19]))[1];
      }

      String var9 = si.c(var2, var0 + -749712478);
      if(null != var9) {
         oja.a(((int[])((int[])var2[1]))[3], (String)var2[15], (long)(((int[])((int[])var2[1]))[47] << 0 | ((int[])((int[])var2[1]))[3]), false, ((int[])((int[])var2[1]))[4], false, ((int[])((int[])var2[1]))[47], true, var9, ((int[])((int[])var2[1]))[13], (byte)101, 6, 0L);
         ++pfa.a;
      }

      for(int var8 = 4; 0 <= var8; --var8) {
         String var6 = mpa.a(var8, var2, (byte)-108);
         if(null != var6) {
            oja.a(((int[])((int[])var2[1]))[3], (String)var2[15], (long)(((int[])((int[])var2[1]))[3] | ((int[])((int[])var2[1]))[47] << 0), false, mqa.a(var8, 32007, var2), false, ((int[])((int[])var2[1]))[47], true, var6, ((int[])((int[])var2[1]))[13], (byte)-93, 9, (long)(var8 + 1));
            ++aia.d;
         }
      }

      if(var0 != 749712384) {
         e = ((int[])((int[])f_i[9]))[8];
      }

      if(tn.a(client.c(var2), (byte)-121)) {
         ++ka.f_i;
         if(var2[57] == null) {
            oja.a(((int[])((int[])var2[1]))[3], "", (long)(((int[])((int[])var2[1]))[47] << 0 | ((int[])((int[])var2[1]))[3]), false, -1, false, ((int[])((int[])var2[1]))[47], true, gj.a(dp.y, -93, gj.a), ((int[])((int[])var2[1]))[13], (byte)-57, 45, 0L);
         } else {
            oja.a(((int[])((int[])var2[1]))[3], "", (long)(((int[])((int[])var2[1]))[3] | ((int[])((int[])var2[1]))[47] << 0), false, -1, false, ((int[])((int[])var2[1]))[47], true, (String)var2[57], ((int[])((int[])var2[1]))[13], (byte)87, 45, 0L);
         }
      }

   }

   static final void a(byte var0, Object[] var1) {
      ++h;
      if(var0 == -66) {
         if(null != var1 && 10 == var1.length) {
            mo.c(var1, -51);
         }
      }
   }

   static final void a(int var0, int var1, int var2, int var3, boolean var4) {
      for(int var5 = 0; lw.c > var5; ++var5) {
         Rectangle var6 = fma.X[var5];
         if(var6.x + var6.width > var3 && var6.x < var3 + var1 && ~var0 > ~(var6.y + var6.height) && ~(var2 + var0) < ~var6.y) {
            qma.d[var5] = true;
         }
      }

      if(!var4) {
         f_i = (Object[])((Object[])f_i[3]);
      }

      ++c;
   }

   static final Object[] a(Object[] var0, int var1, Object[] var2) {
      ++d;
      var2[var1] = var0;
      return var2;
   }

   static final void a(boolean var0, int var1) {
      ++f;
      Object[] var2 = la.a(0, (long)var1, 7);
      aia.a(var2, 1);
      if(!var0) {
         f_i = (Object[])((Object[])f_i[18]);
      }

   }

   static final void a(float var0, float var1, Object[] var2, int var3, float var4, float var5) {
      ++b;
      float var6 = (float)Math.cos((double)var4);
      float var7 = (float)Math.sin((double)var4);
      float var8 = var6 + (-var6 + 1.0F) * var5 * var5;
      if(var3 == 24515) {
         if(null == var2 || -12 != ~var2.length) {
            float var9 = var1 * var5 * (1.0F - var6) + var0 * var7;
            float var10 = var7 * -var1 + var5 * var0 * (-var6 + 1.0F);
            float var11 = var5 * var1 * (-var6 + 1.0F) + -var0 * var7;
            float var12 = var6 + (1.0F - var6) * var1 * var1;
            float var13 = var0 * var1 * (1.0F - var6) + var7 * var5;
            float var14 = var1 * var7 + var5 * var0 * (-var6 + 1.0F);
            float var15 = (1.0F - var6) * var0 * var1 + var7 * -var5;
            float var16 = var0 * var0 * (-var6 + 1.0F) + var6;
            float var17 = ((float[])((float[])var2[0]))[10];
            float var18 = ((float[])((float[])var2[0]))[5];
            float var19 = ((float[])((float[])var2[0]))[0];
            float var20 = ((float[])((float[])var2[0]))[3];
            float var21 = ((float[])((float[])var2[0]))[6];
            float var22 = ((float[])((float[])var2[0]))[11];
            float var23 = ((float[])((float[])var2[0]))[8];
            float var24 = ((float[])((float[])var2[0]))[1];
            ((float[])((float[])var2[0]))[10] = ((float[])((float[])var2[0]))[9] * var14 + var8 * var17 + var11 * var18;
            ((float[])((float[])var2[0]))[5] = ((float[])((float[])var2[0]))[9] * var15 + var12 * var18 + var17 * var9;
            ((float[])((float[])var2[0]))[3] = var15 * ((float[])((float[])var2[0]))[2] + var9 * var19 + var20 * var12;
            ((float[])((float[])var2[0]))[9] = var10 * var17 + var13 * var18 + var16 * ((float[])((float[])var2[0]))[9];
            ((float[])((float[])var2[0]))[0] = var8 * var19 + var20 * var11 + ((float[])((float[])var2[0]))[2] * var14;
            ((float[])((float[])var2[0]))[2] = ((float[])((float[])var2[0]))[2] * var16 + var13 * var20 + var10 * var19;
            ((float[])((float[])var2[0]))[6] = ((float[])((float[])var2[0]))[4] * var14 + var11 * var22 + var8 * var21;
            ((float[])((float[])var2[0]))[11] = var22 * var12 + var9 * var21 + ((float[])((float[])var2[0]))[4] * var15;
            ((float[])((float[])var2[0]))[1] = var23 * var9 + var24 * var12 + ((float[])((float[])var2[0]))[7] * var15;
            ((float[])((float[])var2[0]))[8] = var14 * ((float[])((float[])var2[0]))[7] + var24 * var11 + var8 * var23;
            ((float[])((float[])var2[0]))[4] = var22 * var13 + var21 * var10 + var16 * ((float[])((float[])var2[0]))[4];
            ((float[])((float[])var2[0]))[7] = ((float[])((float[])var2[0]))[7] * var16 + var13 * var24 + var23 * var10;
         }
      }
   }

   static final String a(boolean var0, int var1, byte var2, long var3, int var5) {
      ++g;
      char var6 = 44;
      char var7 = 46;
      if(var5 == 0) {
         var6 = 46;
         var7 = 44;
      }

      if(2 == var5) {
         var7 = 160;
      }

      if(var2 >= -35) {
         return (String)null;
      } else {
         boolean var8 = false;
         if(~var3 > -1L) {
            var8 = true;
            var3 = -var3;
         }

         StringBuffer var9 = new StringBuffer(26);
         int var10;
         int var11;
         if(var1 > 0) {
            for(var10 = 0; var10 < var1; ++var10) {
               var11 = (int)var3;
               var3 /= 10L;
               var9.append((char)(-(10 * (int)var3) + var11 + 48));
            }

            var9.append(var6);
         }

         var10 = 0;

         while(true) {
            var11 = (int)var3;
            var3 /= 10L;
            var9.append((char)(-(10 * (int)var3) + 48 + var11));
            if(0L == var3) {
               if(var8) {
                  var9.append('-');
               }

               return var9.reverse().toString();
            }

            if(var0) {
               ++var10;
               if(0 == var10 % 3) {
                  var9.append(var7);
               }
            }
         }
      }
   }

}
