import jaggl.OpenGL;

final class tia {

   static int h;
   static Object[] f_l = osa.a(0, new Object[2]);
   static int f;
   static int e;
   static int a;
   static int j;
   static Thread k;
   static int b;
   static int m;
   static int f_i = 0;
   static int g;
   static int c;
   static int d;


   static final void a(int var0, boolean var1, boolean var2) {
      ++b;
      if(var0 != -927416089) {
         a(-113, true, ((boolean[])((boolean[])((Object[])((Object[])((Object[])((Object[])f_l[8]))[17]))[0]))[10]);
      }

      if(var2) {
         ++bka.a;
         sd.a((byte)-106);
      }

      if(var1) {
         ++lq.q;
         if(null == tpa.f) {
            tpa.f = new int[65536];
            bk.n = new int[65536];
            double var3 = 0.7D + (Math.random() * 0.03D - 0.015D);

            for(int var5 = 0; 65536 > var5; ++var5) {
               double var6 = (double)(var5 >> 10 & 63) / 64.0D + 0.0078125D;
               double var8 = 0.0625D + (double)(var5 >> 7 & 7) / 8.0D;
               double var10 = (double)(127 & var5) / 128.0D;
               double var12 = var10;
               double var14 = var10;
               double var16 = var10;
               if(var8 != 0.0D) {
                  double var18;
                  if(var10 >= 0.5D) {
                     var18 = -(var8 * var10) + var8 + var10;
                  } else {
                     var18 = (var8 + 1.0D) * var10;
                  }

                  double var20 = -var18 + 2.0D * var10;
                  double var22 = var6 + 0.3333333333333333D;
                  if(var22 > 1.0D) {
                     --var22;
                  }

                  double var26 = -0.3333333333333333D + var6;
                  if(0.0D > var26) {
                     ++var26;
                  }

                  if(1.0D > 6.0D * var6) {
                     var14 = var20 + var6 * 6.0D * (var18 - var20);
                  } else if(var6 * 2.0D < 1.0D) {
                     var14 = var18;
                  } else if(2.0D <= 3.0D * var6) {
                     var14 = var20;
                  } else {
                     var14 = var20 + (0.6666666666666666D - var6) * (-var20 + var18) * 6.0D;
                  }

                  if(6.0D * var22 < 1.0D) {
                     var12 = (-var20 + var18) * 6.0D * var22 + var20;
                  } else if(1.0D <= 2.0D * var22) {
                     if(2.0D > var22 * 3.0D) {
                        var12 = var20 + 6.0D * (0.6666666666666666D - var22) * (-var20 + var18);
                     } else {
                        var12 = var20;
                     }
                  } else {
                     var12 = var18;
                  }

                  if(1.0D <= 6.0D * var26) {
                     if(var26 * 2.0D >= 1.0D) {
                        if(2.0D <= var26 * 3.0D) {
                           var16 = var20;
                        } else {
                           var16 = 6.0D * (var18 - var20) * (-var26 + 0.6666666666666666D) + var20;
                        }
                     } else {
                        var16 = var18;
                     }
                  } else {
                     var16 = var20 + var26 * (var18 - var20) * 6.0D;
                  }
               }

               var12 = Math.pow(var12, var3);
               var14 = Math.pow(var14, var3);
               var16 = Math.pow(var16, var3);
               int var28 = (int)(var12 * 256.0D);
               int var19 = (int)(var14 * 256.0D);
               int var29 = (int)(256.0D * var16);
               int var21 = var29 + (var19 << 8) + (var28 << 16);
               tpa.f[var5] = 16777215 & var21;
               int var30 = (var29 << 16) + (var19 << 8) + var28;
               bk.n[var5] = var30;
            }
         }
      }

   }

   static final jaa a(int var0, Object[] var1) {
      ++g;
      if(var0 != 0) {
         a(106, (Object[])((Object[])var1[1]));
      }

      return new jaa(var1);
   }

   static final void a(Object[] var0, int var1, int var2, int var3) {
      ++e;
      if(null == var0[0]) {
         var0[0] = nb.a((byte)52, ((int[])((int[])var0[1]))[0], new Object[5]);
      }

      ma var4;
      Object[] var6 = null != (var4 = (ma)pm.a((long)var3, (Object[])((Object[])var0[0]), false))?var4.s:null;
      if(var1 > -4) {
         a(91);
      }

      if(var6 != null) {
         ((int[])((int[])var6[1]))[0] = var2;
      } else {
         var6 = ps.a((byte)-56, var2, new Object[2]);
         di.a((Object[])((Object[])var0[0]), true, (lm)(null != var6?var6[0]:null), (long)var3);
      }

   }

   static final void a(Object[] var0, int var1, int var2) {
      if(var2 >= -28) {
         a(-128, false, -128, 115);
      }

      ++d;
      OpenGL.glNewList(((int[])((int[])var0[0]))[0] + var1, 4864);
   }

   static final Object[] a(int var0) {
      ++a;
      Object[] var1 = hi.newByteBufferWrapper(518);
      if(var1 != null && (9 == var1.length || var1.length == 10 || var1.length == 2 && var1[1].equals(Integer.valueOf(2)))) {
         ida.a(264);
      }
      maa.csk = new int[4];
      maa.csk[1] = (int)(Math.random() * 9.9999999E7D);
      maa.csk[3] = (int)(Math.random() * 9.9999999E7D);
      maa.csk[0] = (int)(Math.random() * 9.9999999E7D);
      maa.csk[2] = (int)(9.9999999E7D * Math.random());
      ek.putByte(var1, 10);
      op.putInt(var1, maa.csk[0]);
      op.putInt(var1, maa.csk[1]);
      op.putInt(var1, maa.csk[2]);
      op.putInt(var1, maa.csk[3]);
      return var1;
   }

   static final int[] a(int var0, Object[] var1, int var2) {
      ++h;
      if(var2 <= 104) {
         a(new Object[10], -77, -106, 51);
      }

      int[] var3 = od.a(-1704, var0, (Object[])((Object[])var1[5]));
      if(((boolean[])((boolean[])((Object[])((Object[])var1[5]))[4]))[0]) {
         int var4 = bv.b[var0];
         if(null != var1 && var1.length == 2 && var1[0].equals(Integer.valueOf(2))) {
            return null;
         }

         for(int var5 = 0; fo.b > var5; ++var5) {
            int var9 = wra.d[var5];
            int var10 = var9 + var4 * 57;
            var10 ^= var10 << 1;
            int var8 = -((Integer.MAX_VALUE & (789221 + var10 * var10 * 15731) * var10 - -1376312589) / 262144) + 4096;
            var3[var5] = var8 % 4096;
         }
      }

      return var3;
   }

   static final void a(ta var0, long var1, byte var3) {
      da.b = gd.f_i;
      ++c;
      gd.f_i = 0;
      he.a(88);

      for(ch var4 = (ch)om.a(tsa.h, false); null != var4; var4 = (ch)pw.a(tsa.h, -120)) {
         if(var4.a(var0, var1)) {
            ;
         }
      }

      if(var3 >= 0) {
         f_i = -67;
      }

   }

   static final Object[] a(int var0, byte var1) {
      ++j;
      int var2 = -30 / ((-46 - var1) / 59);
      return 0 <= var0 && var0 < 100?hja.g[var0]:null;
   }

   static final void a(int var0, boolean var1, int var2, int var3) {
      ++m;
      if(var1) {
         pd.b = new byte[var3][var0][var2];
      }
   }

   static final Object[] a(int var0, int var1, Object[] var2, byte var3) {
      if(null == var2[1]) {
         var2[1] = new int[2];
      }

      int var5 = 27 % ((var3 + 42) / 60);
      ++f;
      cd var6 = new cd(var2);
      ((int[])((int[])var2[1]))[1] = var1;
      var2[0] = var6;
      ((int[])((int[])var2[1]))[0] = var0;
      return var2;
   }

}
