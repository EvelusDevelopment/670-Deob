import jaggl.OpenGL;

final class db {

   static int f;
   static int b;
   static int c;
   static Object[] e = ho.a(6, 45, new Object[1], true);
   static int a;
   static int g;
   static int d;


   static final void a(Object[] var0, boolean var1, byte var2) {
      int var3 = 56 / ((var2 - 0) / 57);
      ++c;
      if(var0 == null || var0.length != 2) {
         if(var0 != null && var0.length == 10) {
            jja.a(var0, var1, 1);
         } else if(var0 != null && -9 == ~var0.length) {
            tea.a(var1, (byte)86, var0);
         } else if(var0 != null && 3 == var0.length) {
            lia.a(var1, 80, var0);
         } else if(null == var0 || var0.length != 7) {
            if(null != var0 && var0.length == 6) {
               om.a(-126, var0, var1);
            } else if(null != var0 && 9 == var0.length) {
               aia.a(var1, var0, -118);
            } else if(null != var0 && 5 == var0.length) {
               pp.a(-9, var1, var0);
            } else if(var0 != null && 4 == var0.length) {
               ma.a(var0, (byte)49, var1);
            } else {
               throw new IllegalStateException();
            }
         }
      }
   }

   static final void b(byte var0, Object[] var1) {
      if(var0 != -64) {
         a(-88, (Object[])null, (byte)53, 39, 33);
      }

      ++d;
   }

   static final int a(byte var0, Object[] var1) {
      if(var0 > -3) {
         a(new Object[8], false, (byte)6);
      }

      ++g;
      return fca.a(77, (Object[])((Object[])var1[0])) == uha.g && se.a((Object[])((Object[])var1[0]), (byte)-122)?0:1;
   }

   static final void a(int var0, Object[] var1, byte var2, int var3, int var4) {
      OpenGL.glTexEnvi(8960, var3 + '\u8588', var4);
      ++a;
      OpenGL.glTexEnvi(8960, '\u8598' + var3, var0);
      if(var2 != -68) {
         ((int[])((int[])e[1]))[1] = ((int[])((int[])var1[7]))[5];
      }

   }

   static final void a(Object[] var0, byte var1) {
      if(null == var0[6]) {
         oe.a(1, var0, 92);
      }

      ++b;
      Object[] var2 = var0;
      int var6 = ((Object[])((Object[])var0[6])).length;
      int var3;
      if(var6 > 0) {
         for(int var7 = 0; var7 < 257; ++var7) {
            int var8 = 0;
            int var9 = var7 << 4;

            for(int var10 = 0; var6 > var10 && var9 >= ((int[][])((int[][])var2[6]))[var10][0]; ++var10) {
               ++var8;
            }

            int var4;
            int var5;
            int[] var14;
            if(var6 > var8) {
               var14 = ((int[][])((int[][])var2[6]))[var8];
               if(var8 > 0) {
                  int[] var11 = ((int[][])((int[][])var2[6]))[var8 - 1];
                  int var12 = (var9 - var11[0] << 12) / (var14[0] - var11[0]);
                  int var13 = -var12 + 4096;
                  var5 = var12 * var14[3] + var11[3] * var13 >> 12;
                  var3 = var11[1] * var13 + var12 * var14[1] >> 12;
                  var4 = var11[2] * var13 + var14[2] * var12 >> 12;
               } else {
                  var4 = var14[2];
                  var3 = var14[1];
                  var5 = var14[3];
               }
            } else {
               var14 = ((int[][])((int[][])var2[6]))[var6 - 1];
               var3 = var14[1];
               var5 = var14[3];
               var4 = var14[2];
            }

            var3 >>= 4;
            var4 >>= 4;
            var5 >>= 4;
            if(var3 < 0) {
               var3 = 0;
            } else if(var3 > 255) {
               var3 = 255;
            }

            if(var0 != null && var0.length == 12 && var0[8].equals(Integer.valueOf(0)) && var0[8].equals(Integer.valueOf(1))) {
               return;
            }

            if(0 > var4) {
               var4 = 0;
            } else if(255 < var4) {
               var4 = 255;
            }

            if(var5 < 0) {
               var5 = 0;
            } else if(var5 > 255) {
               var5 = 255;
            }

            ((int[])((int[])var2[12]))[var7] = var3 << 16 | var4 << 8 | var5;
         }

         if(var2 != null && -4 == ~var2.length) {
            return;
         }
      }

      var3 = 122 / ((var1 + 73) / 38);
   }

   static final Object[] a(Object[] var0, int var1) {
      if(var1 <= 63) {
         a((Object[])((Object[])var0[2]), ((int[])((int[])e[12]))[1]);
      }

      ++f;
      Object[] var2 = hi.newByteBufferWrapper(40);
      ek.putByte(var2, 25);
      ek.putByte(var2, kea.b(24, (Object[])((Object[])var0[16])));
      ek.putByte(var2, uha.a(false, (Object[])((Object[])var0[9])));
      ek.putByte(var2, bqa.a((Object[])((Object[])var0[34]), 128));
      ek.putByte(var2, noa.a((Object[])((Object[])var0[19]), 36));
      ek.putByte(var2, eq.a((Object[])((Object[])var0[41]), 3));
      ek.putByte(var2, Class_ss.b((Object[])((Object[])var0[38]), 0));
      ek.putByte(var2, cf.a((int)-113, (Object[])((Object[])var0[3])));
      ek.putByte(var2, fsa.a((Object[])((Object[])var0[36]), 16711680));
      ek.putByte(var2, vr.b((Object[])((Object[])var0[29]), (byte)38));
      ek.putByte(var2, oua.a((byte)-26, (Object[])((Object[])var0[6])));
      ek.putByte(var2, ft.a((Object[])((Object[])var0[13]), (int)-14072));
      ek.putByte(var2, dua.a((Object[])((Object[])var0[35]), (byte)-78));
      ek.putByte(var2, pqa.a(117, (Object[])((Object[])var0[17])));
      ek.putByte(var2, mh.a(102, (Object[])((Object[])var0[11])));
      ek.putByte(var2, bt.a((Object[])((Object[])var0[4]), (byte)-43));
      ek.putByte(var2, fg.a((byte)122, (Object[])((Object[])var0[1])));
      ek.putByte(var2, lc.a((Object[])((Object[])var0[10]), 0));
      ek.putByte(var2, gna.a((byte)-125, (Object[])((Object[])var0[0])));
      ek.putByte(var2, fpa.a((int)0, (Object[])((Object[])var0[24])));
      ek.putByte(var2, bg.a(true, (Object[])((Object[])var0[21])));
      ek.putByte(var2, qga.b((Object[])((Object[])var0[2]), 13687));
      ek.putByte(var2, pda.a(true, (Object[])((Object[])var0[25])));
      ek.putByte(var2, Class_m.a((Object[])((Object[])var0[40]), -23352));
      ek.putByte(var2, coa.a((Object[])((Object[])var0[31]), 11));
      Object[] var5 = (Object[])((Object[])var0[20]);
      int var4 = ((int[])((int[])var5[1]))[0];
      if(var0 != null && (var0.length == 4 || var0.length == 14)) {
         return new Object[27][];
      } else {
         ek.putByte(var2, var4);
         ek.putByte(var2, gua.b((Object[])((Object[])var0[27]), 2));
         Object[] var8 = (Object[])((Object[])var0[39]);
         int var7 = ((int[])((int[])var8[1]))[0];
         ek.putByte(var2, var7);
         Object[] var11 = (Object[])((Object[])var0[15]);
         int var10 = ((int[])((int[])var11[1]))[0];
         ek.putByte(var2, var10);
         ek.putByte(var2, hba.a((Object[])((Object[])var0[12]), 0));
         ek.putByte(var2, hba.a((Object[])((Object[])var0[33]), 0));
         ek.putByte(var2, hba.a((Object[])((Object[])var0[30]), 0));
         ek.putByte(var2, hba.a((Object[])((Object[])var0[26]), 0));
         ek.putByte(var2, hba.a((Object[])((Object[])var0[32]), 0));
         ek.putByte(var2, wh.a((byte)-31, (Object[])((Object[])var0[22])));
         return var2;
      }
   }

}
