
final class kqa {

   static int c;
   static int g;
   static int d;
   static client h;
   static int e;
   static int b;
   static int a;
   static int[] f = new int[]{0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4};


   static final boolean a(Object[] var0, int var1) {
      if(var1 != -11671) {
         return true;
      } else {
         ++a;
         boolean var2;
         if(var0 != null && -17 == ~var0.length) {
            var2 = gs.a((Object[])((Object[])var0[14]), var1 ^ -26758);
            return var2;
         } else if(var0 != null && -21 == ~var0.length && var0[14].equals(Integer.valueOf(0))) {
            return kka.a(var0, var1 ^ -11655);
         } else if(var0 != null && var0.length == 22) {
            return mfa.a(var0, -470);
         } else if(null != var0 && var0.length == 18) {
            return hka.a((byte)56, var0);
         } else if(null != var0 && var0.length == 23) {
            var2 = ((boolean[])((boolean[])var0[8]))[5];
            return var2;
         } else if(var0 != null && var0.length == 17) {
            return Class_i.b((int)-110, var0);
         } else if(var0 != null && -21 == ~var0.length && ((int[])((int[])var0[12])).length == 4) {
            return ge.a(var0, (byte)82);
         } else if(null != var0 && var0.length == 20 && 7 == ((boolean[])((boolean[])var0[8])).length) {
            var2 = gs.a((Object[])((Object[])var0[19]), var1 ^ -26758);
            return var2;
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final daa a(int var0, Object[] var1) {
      ++g;
      if(var0 >= -112) {
         a((Object[])null, false);
      }

      return new daa(var1);
   }

   static final void a(Object[] var0, boolean var1, Object[] var2) {
      if(!var1) {
         a((Object[])null, -115);
      }

      mc.a(0, var2, (Object[])((Object[])var0[2]));
      ++e;
      Object[] var3 = (Object[])((Object[])var0[1]);
      cq.a((byte)81, ((float[])((float[])var3[1]))[2], ((float[])((float[])var3[1]))[0], ((float[])((float[])var3[1]))[1], var2);
   }

   static final Object[] a(ta var0, Object[] var1, byte var2) {
      ++c;
      if(var1[16] == null) {
         return null;
      } else {
         Object[] var3 = bra.a(var1, true);
         Object[] var4 = bva.a(var2 ^ -43, ((boolean[])((boolean[])var1[8]))[8]);
         ((ka)var1[16]).a(var3, ((lpa[])((lpa[])var1[9]))[0], 0);
         if(var2 != 92) {
            f = (int[])null;
         }

         return var4;
      }
   }

   static final int a(Object[] var0, boolean var1) {
      ++d;
      ((int[])((int[])var0[1]))[0] += 4;
      if(!var1) {
         f = (int[])null;
      }

      return ((((byte[])((byte[])var0[2]))[((int[])((int[])var0[1]))[0] - 1] & 255) << 8) + ((((byte[])((byte[])var0[2]))[-3 + ((int[])((int[])var0[1]))[0]] << 24 & -16777216) - (-(((byte[])((byte[])var0[2]))[-4 + ((int[])((int[])var0[1]))[0]] << 16 & 16711680) + -(255 & ((byte[])((byte[])var0[2]))[-2 + ((int[])((int[])var0[1]))[0]])));
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, Object[] var6, boolean var7, int var8, int var9, ta var10, boolean var11, int var12, int var13, int var14) {
      ++b;
      int var15 = -var0 + 255;
      Object[] var16;
      if(null == var6[6]) {
         var10.Z(2, 0);
         var4 = 16383 & var13 + var4;
         if(~((int[])((int[])var6[1]))[6] != 0 && ((int[])((int[])var6[1]))[11] != 0) {
            var16 = ela.d.a(((int[])((int[])var6[1]))[6], (byte)124);
            if(null == var6[3] && ela.d.a(-20460, ((int[])((int[])var6[1]))[6])) {
               int[] var17 = ((int[])((int[])var16[1]))[0] == 2?ela.d.a(((int[])((int[])var6[1]))[11], 0.7F, (byte)-87, ((int[])((int[])var6[1]))[11], false, ((int[])((int[])var6[1]))[6]):ela.d.a(((int[])((int[])var6[1]))[11], 0.7F, false, -6300, ((int[])((int[])var6[1]))[11], ((int[])((int[])var6[1]))[6]);
               ((int[])((int[])var6[1]))[8] = var17[0];
               ((int[])((int[])var6[1]))[9] = var17[-1 + var17.length];
               var6[3] = var10.a(((int[])((int[])var6[1]))[11], var8 ^ -7343, 0, var17, ((int[])((int[])var6[1]))[11], ((int[])((int[])var6[1]))[11]);
            }

            int var24 = 255 != var15?1:(-3 != ~((int[])((int[])var16[1]))[0]?0:1);
            if(var24 == 1 && var11) {
               var10.r(var9, var1, var12, var5, var3, 0);
            }

            if(null != var6[3]) {
               int var18 = var14 * var5 / -4096;

               int var19;
               for(var19 = (-var5 + var12) / 2 + var4 * var5 / 4096; var5 < var19; var19 -= var5) {
                  ;
               }

               while(0 > var19) {
                  var19 += var5;
               }

               int var20;
               if(((int[])((int[])var6[1]))[4] != 1) {
                  if(var16 != null && 3 == var16.length && var16[2].equals(Integer.valueOf(1))) {
                     ((byte[])((byte[])((Object[])((Object[])tg.n[0]))[19]))[9] = ((byte[])((byte[])tg.n[2]))[19];
                  }

                  while(var5 < var18) {
                     var18 -= var5;
                  }

                  while(0 > var18) {
                     var18 += var5;
                  }

                  for(var20 = -var5 + var19; var20 < var12; var20 += var5) {
                     if(null != var16 && var16.length == 8) {
                        wj.a(44, 32, ((int[])((int[])tg.n[8]))[0], ((boolean[])((boolean[])tg.n[0]))[2], 94, 32, new Object[0][], var8 ^ 0, 122, 110, (ta)null, 60, -9, true);
                     }

                     for(int var21 = var18 + -var5; var21 < var5; var21 += var5) {
                        ((cga)var6[3]).b(var9 + var20, var1 + var21, var5, var5, 0, 16777215 | var15 << 24, var24);
                     }
                  }
               } else {
                  for(var20 = var19 - var5; var12 > var20; var20 += var5) {
                     ((cga)var6[3]).b(var9 + var20, var18 + var1, var5, var5, 0, var15 << 24 | 16777215, var24);
                  }

                  if((((int[])((int[])var6[1]))[8] & -16777216) != 0) {
                     var10.d(1 + var18 + var1, 0, var12, 0, ((int[])((int[])var6[1]))[8], 14851);
                  }

                  if(0 != (-16777216 & ((int[])((int[])var6[1]))[9])) {
                     var10.d(var5 + -var18 + -var1 + -var5, var18 + var1 + var5, var12, 0, ((int[])((int[])var6[1]))[9], 14851);
                  }
               }
            }
         } else {
            var10.r(var9, var1, var12, var5, var3 | var15 << 24, 1);
         }
      } else if(!var7) {
         if(var11) {
            var10.Z(3, var3);
         }

         tt.a(75, var10, var6, var2, var14, var0, var4);
      } else {
         var16 = var10.h();
         Object[] var23 = var10.h();
         ((float[])((float[])var16[0]))[14] = ((float[])((float[])var16[0]))[15];
         ((float[])((float[])var16[0]))[10] = ((float[])((float[])var16[0]))[11];
         ((float[])((float[])var16[0]))[6] = ((float[])((float[])var16[0]))[7];
         ((float[])((float[])var16[0]))[2] = ((float[])((float[])var16[0]))[3];
         var10.a(var16);
         tt.a(var8 ^ 75, var10, var6, var2, var14, var0, var4);
         var10.a(var23);
      }

      for(int var22 = -1 + ((int[])((int[])var6[1]))[7]; 0 <= var22; --var22) {
         ((faa[])((faa[])var6[5]))[var22].a(var10, var9, var1, var12, var5, var14, var4, ((int[])((int[])var6[1]))[0], ((int[])((int[])var6[1]))[13], ((int[])((int[])var6[1]))[10], var15);
      }

      var10.Z(2, var8);
   }

}
