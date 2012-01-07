
final class ld {

   static int f;
   static int g;
   static Object[] e = ve.a(new Object[1], (byte)3, 2);
   static int b;
   static int c;
   static int a;
   static int h = 1409;
   static boolean[] d = new boolean[8];


   static final void a(int var0, int var1, int var2, int var3, Object[] var4, int var5, int var6, int var7) {
      label29: {
         ++g;
         if(!((boolean[])((boolean[])var4[63]))[3]) {
            Object[] var9;
            ((cga)(null != (var9 = (Object[])((Object[])var4[65]))?var9[2]:null)).b(var7, var2, var3, var0, 0, var5, var6);
            if(client.f_vb == 0) {
               break label29;
            }
         }

         av.a(false, var4, 0);
         Object[] var8;
         ((cga)(null == (var8 = (Object[])((Object[])var4[65]))?null:var8[2])).b(var7, var2, var3, var0, 0, var5, var6);
         av.a(true, var4, 0);
      }

      if(var1 != 61) {
         e = (Object[])null;
      }

   }

   static final void a(int var0, boolean var1) {
      ++f;
      if(var0 != 520) {
         b = -18;
      }

      if(var1) {
         sca.b[221] = 43;
         sca.b[219] = 42;
         sca.b[192] = 58;
         sca.b[187] = 27;
         sca.b[188] = 71;
         sca.b[189] = 26;
         sca.b[186] = 57;
         sca.b[222] = 59;
         sca.b[223] = 28;
         sca.b[191] = 73;
         sca.b[190] = 72;
         sca.b[220] = 74;
      } else {
         sca.b[192] = 28;
         sca.b[93] = 43;
         sca.b[45] = 26;
         sca.b[91] = 42;
         sca.b[92] = 74;
         sca.b[44] = 71;
         sca.b[59] = 57;
         sca.b[520] = 59;
         sca.b[47] = 73;
         sca.b[222] = 58;
         sca.b[46] = 72;
         sca.b[61] = 27;
      }

   }

   static final int a(byte var0, Object[] var1, String var2) {
      try {
         int var4 = 118 % ((56 - var0) / 44);
         ++c;
         int var3 = ((int[])((int[])var1[1]))[0];
         byte[] var5 = jta.a(var2, (int)69);
         int var6 = var5.length;
         if(var6 >= 0 && var6 < 128) {
            ek.putByte(var1, var6);
         } else {
            if(0 > var6 || '\u8000' <= var6) {
               throw new IllegalArgumentException();
            }

            eda.a((byte)108, var1, var6 + '\u8000');
         }

         if(null != var1 && var1.length == 1) {
            qca.b = (Object[])((Object[])qca.b[8]);
         }

         int[] var7;
         int[] var9 = var7 = (int[])((int[])var1[1]);
         byte var8 = 0;
         byte var10 = 0;
         int var11 = var7[var8];
         Object[] var13 = qca.b;
         int var14 = 0;
         int var15 = var5.length;
         byte[] var16 = (byte[])((byte[])var1[2]);
         int var17 = ((int[])((int[])var1[1]))[0];
         int var18 = 0;
         int var19 = var17 << 3;

         for(var15 += var14; var15 > var14; ++var14) {
            int var20 = var5[var14] & 255;
            if(null != var1 && (var1.length == 29 || var1.length == 5 && var1[2].equals(Integer.valueOf(0)) && var1[2].equals(Integer.valueOf(0)))) {
               qca.b = null;
            }

            int var21 = ((int[])((int[])var13[1]))[var20];
            byte var22 = ((byte[])((byte[])var13[2]))[var20];
            if(var22 == 0) {
               throw new RuntimeException("" + var20);
            }

            int var23 = var19 >> 3;
            int var24 = 7 & var19;
            var18 &= -var24 >> 31;
            int var25 = (var24 + var22 - 1 >> 3) + var23;
            var24 += 24;
            var16[var23] = (byte)(var18 |= var21 >>> var24);
            if(var23 < var25) {
               var24 -= 8;
               ++var23;
               var16[var23] = (byte)(var18 = var21 >>> var24);
               if(var23 < var25) {
                  var24 -= 8;
                  ++var23;
                  var16[var23] = (byte)(var18 = var21 >>> var24);
                  if(var25 > var23) {
                     ++var23;
                     var24 -= 8;
                     var16[var23] = (byte)(var18 = var21 >>> var24);
                     if(var23 < var25) {
                        if(var1 != null && var1.length == 5 && var1[3].equals(Boolean.valueOf(false))) {
                           qca.b = null;
                        }

                        ++var23;
                        var24 -= 8;
                        var16[var23] = (byte)(var18 = var21 << -var24);
                     }
                  }
               }
            }

            var19 += var22;
         }

         int var12 = (7 + var19 >> 3) - var17;
         if(var13 != null && var13.length == 4) {
            qca.b = new Object[10][];
         }

         var9[var10] = var12 + var11;
         return -var3 + ((int[])((int[])var1[1]))[0];
      } catch (RuntimeException var26) {
         throw vt.a(var26, "ld.C(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

}
