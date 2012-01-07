import java.nio.ByteBuffer;

final class wj {

   static int a;
   static int f;
   static int b;
   static int e;
   static int c;
   static int d;


   private static final jda a(Object[] var0, ta var1, Object[] var2) {
      return new jda(var0, var1, var2);
   }

   static final void a(int var0, int var1, int var2, boolean var3, int var4, int var5, Object[] var6, int var7, int var8, int var9, ta var10, int var11, int var12, boolean var13) {
      ++b;
      int var14 = 0;
      if(((boolean[])((boolean[])var6[2]))[0]) {
         var14 = ((int[])((int[])var6[1]))[5];
      }

      if(null == var6[var7]) {
         kqa.a(var14, var4, var0, var9, var11, var2, var6, var13, var7 + 0, var12, var10, var3, var1, var8, var5);
      } else {
         Object[] var15 = var6;
         Object[] var16 = (Object[])((Object[])var6[0]);
         if(var6.hashCode() > var16.hashCode()) {
            var15 = (Object[])((Object[])var6[0]);
            var16 = var6;
            var14 = 255 + -var14;
         }

         kqa.a(var14, var4, var0, var9, var11, var2, var15, var13, 0, var12, var10, var3, var1, var8, var5);
         kqa.a(-var14 + 255, var4, var0, var9, var11, var2, var16, var13, 0, var12, var10, false, var1, var8, var5);
      }

   }

   static final void a(Object[] var0, char var1, int var2, int var3, int var4, boolean var5) {
      el.a(121, (Object[])((Object[])var0[2]));
      aqa.a(1, (Object[])((Object[])var0[2]), 124);
      Object[] var8 = (Object[])((Object[])((Object[])((Object[])var0[2]))[10]);
      var8[8] = var0[3];
      sca.a(3, var8, var4, 16);
      Object[] var6;
      float var9 = (float)((ta)((var6 = (Object[])((Object[])var0[2])) == null?null:var6[38])).e(30626).e();
      Object[] var7;
      float var10 = (float)((ta)((var7 = (Object[])((Object[])var0[2])) == null?null:var7[38])).e(30626).d();
      vt.a(2.0F / var9, (byte)127, (Object[])((Object[])var8[4]), 2.0F / var10, 1.0F, 1.0F);
      if(var0 == null || var0.length != 22 || !var0[13].equals(Integer.valueOf(0))) {
         ((float[])((float[])((Object[])((Object[])var8[4]))[0]))[12] = ((float)var2 + ck.a(87, (Object[])((Object[])var0[2]))) * 2.0F / var9 - 1.0F;
         ((float[])((float[])((Object[])((Object[])var8[4]))[0]))[13] = ((float)var3 + ck.a(87, (Object[])((Object[])var0[2]))) * 2.0F / var10 - 1.0F;
         ((float[])((float[])((Object[])((Object[])var8[4]))[0]))[14] = -1.0F;
         Class_ds.a((Object[])((Object[])var8[6]), (byte)114);
         var8[2] = var0[0];
         ((int[])((int[])var8[1]))[0] = var1 * 4;
         var8[3] = ((Object[])((Object[])var0[2]))[41];
         Class_ss.a(var8, (int)5);
      }
   }

   static final boolean c(Object[] var0, int var1) {
      if(var1 != 0) {
         return ((boolean[])((boolean[])((Object[])((Object[])((Object[])((Object[])var0[0]))[9]))[1]))[5];
      } else {
         ++e;
         return false;
      }
   }

   static final int b(Object[] var0, int var1) {
      ++f;
      Object[] var2 = ro.a((int)3, var0);
      int var3 = ((int[])((int[])((Object[])((Object[])var0[35]))[0]))[1];
      boolean var4;
      if(0 != ((int[])((int[])var2[1]))[17]) {
         var4 = vu.a(((int[])((int[])var2[1]))[15], (Object[])((Object[])var0[35]), ((int[])((int[])var0[12]))[31], 0, ((int[])((int[])var2[1]))[17]);
      } else {
         var4 = vu.a(((int[])((int[])var0[12]))[27], (Object[])((Object[])var0[35]), ((int[])((int[])var0[12]))[31], 0, ((int[])((int[])var0[12]))[27]);
      }

      int var5 = -var3 + ((int[])((int[])((Object[])((Object[])var0[35]))[0]))[1];
      if(var1 > -100) {
         return 91;
      } else {
         if(var5 != 0) {
            ++((int[])((int[])var0[12]))[16];
         } else {
            ((int[])((int[])var0[12]))[16] = 0;
            dfa.a(1, (Object[])((Object[])var0[35]), ((int[])((int[])var0[12]))[31]);
         }

         if(var4) {
            if(((int[])((int[])var2[1]))[8] != 0) {
               if(var5 <= 0) {
                  vu.a(((int[])((int[])var2[1]))[34], (Object[])((Object[])var0[24]), -((int[])((int[])var2[1]))[36], 0, ((int[])((int[])var2[1]))[8]);
               } else {
                  vu.a(((int[])((int[])var2[1]))[34], (Object[])((Object[])var0[24]), ((int[])((int[])var2[1]))[36], 0, ((int[])((int[])var2[1]))[8]);
               }
            }

            if(((int[])((int[])var2[1]))[0] != 0) {
               vu.a(((int[])((int[])var2[1]))[20], (Object[])((Object[])var0[28]), ((int[])((int[])var2[1]))[30], 0, ((int[])((int[])var2[1]))[0]);
            }
         } else {
            if(((int[])((int[])var2[1]))[8] == 0) {
               dfa.a(1, (Object[])((Object[])var0[24]), 0);
            } else {
               vu.a(((int[])((int[])var2[1]))[34], (Object[])((Object[])var0[24]), 0, 0, ((int[])((int[])var2[1]))[8]);
            }

            if(0 == ((int[])((int[])var2[1]))[0]) {
               dfa.a(1, (Object[])((Object[])var0[28]), 0);
            } else {
               vu.a(((int[])((int[])var2[1]))[20], (Object[])((Object[])var0[28]), 0, 0, ((int[])((int[])var2[1]))[0]);
            }
         }

         return var5;
      }
   }

   static final Object[] a(Object[] var0, int var1) {
      if(var1 >= -69) {
         return new Object[1];
      } else {
         ++c;
         mc var3 = new mc(var0);
         var0[0] = var3;
         return var0;
      }
   }

   static final Object[] a(Object[] var0, Object[] var1, Object[] var2, aea[] var3, boolean var4) {
      var0[1] = a(var0, (ta)(var1 == null?null:var1[38]), var2);
      var0[2] = var1;
      int var6 = 0;

      int var7;
      for(var7 = 0; var7 < 256; ++var7) {
         aea var8 = var3[var7];
         if(var8.h > var6) {
            var6 = var8.h;
         }

         if(var8.a > var6) {
            var6 = var8.a;
         }
      }

      var7 = var6 * 16;
      int var9;
      aea var10;
      int var13;
      int var14;
      int var15;
      int var16;
      int var19;
      int var18;
      int var38;
      if(var4) {
         if(var0 != null && var0.length == 1 && var0[0].equals(Integer.valueOf(0))) {
            a((Object[])null, 'n', -34, 49, 112, false);
         }

         byte[] var26 = new byte[var7 * var7];

         for(var9 = 0; var9 < 256; ++var9) {
            var10 = var3[var9];
            int var11 = var10.h;
            int var12 = var10.a;
            var13 = var9 % 16 * var6;
            var14 = var9 / 16 * var6;
            var15 = var14 * var7 + var13;
            var16 = 0;
            byte[] var17;
            if(var10.e == null) {
               if(var0 != null && var0.length == 3) {
                  a((Object[])null, '5', 30, 107, -103, false, (Class_s)null, 2, -29);
               }

               var17 = var10.c;

               for(var18 = 0; var18 < var11; ++var18) {
                  for(var19 = 0; var19 < var12; ++var19) {
                     var26[var15++] = (byte)(var17[var16++] == 0?0:-1);
                  }

                  if(var1 != null && var1.length == 8) {
                     return null;
                  }

                  var15 += var7 - var12;
               }
            } else {
               var17 = var10.e;

               for(var18 = 0; var18 < var11; ++var18) {
                  for(var19 = 0; var19 < var12; ++var19) {
                     var26[var15++] = var17[var16++];
                  }

                  var15 += var7 - var12;
               }

               if(var1 != null && var1.length == 10) {
                  a((Object[])null, (Object[])null, (Object[])null, (aea[])null, true);
               }
            }
         }

         if(!oa.a(var1, vk.f, (byte)-99, br.f)) {
            int[] var28 = new int[var26.length];
            if(var0 != null && var0.length == 7) {
               a((Object[])null, (Object[])null, (Object[])null, (aea[])null, false);
            }

            for(int var31 = 0; var31 < var26.length; ++var31) {
               var28[var31] = var26[var31] << 24;
            }

            var0[3] = bda.a(var7, 92, var7, var1, var28, false);
         } else {
            var0[3] = vh.a(42, false, var1, br.f, var26, var7, var7);
         }
      } else {
         int[] var25 = new int[var7 * var7];

         for(var9 = 0; var9 < 256; ++var9) {
            var10 = var3[var9];
            int[] var30 = var10.f_i;
            byte[] var33 = var10.e;
            byte[] var36 = var10.c;
            var14 = var10.h;
            var15 = var10.a;
            var16 = var9 % 16 * var6;
            var38 = var9 / 16 * var6;
            var18 = var38 * var7 + var16;
            var19 = 0;
            int var21;
            int var20;
            if(var33 != null) {
               for(var20 = 0; var20 < var14; ++var20) {
                  if(var2 != null && var2.length == 2) {
                     a((Object[])null, '\uffa5', 22, -117, -25, false, (Class_s)null, 124, -50);
                  }

                  for(var21 = 0; var21 < var15; ++var21) {
                     var25[var18++] = var33[var19] << 24 | var30[var36[var19] & 255];
                     ++var19;
                  }

                  var18 += var7 - var15;
               }

               if(var0 != null && var0.length == 6) {
                  return null;
               }
            } else {
               for(var20 = 0; var20 < var14; ++var20) {
                  if(var0 != null && var0.length == 1) {
                     a((Object[])null, new Object[1][], (Object[])null, (aea[])null, true);
                  }

                  for(var21 = 0; var21 < var15; ++var21) {
                     byte var22;
                     if((var22 = var36[var19++]) != 0) {
                        var25[var18++] = -16777216 | var30[var22 & 255];
                     } else {
                        ++var18;
                     }
                  }

                  var18 += var7 - var15;
               }

               if(var2 != null && var2.length == 12) {
                  return null;
               }
            }

            if(var1 != null && var1.length == 2) {
               return null;
            }
         }

         var0[3] = bda.a(var7, 45, var7, var1, var25, false);
      }

      Object[] var27 = (Object[])((Object[])var0[3]);
      Object[] var32 = di.d;
      if(var32 != null && -2 == ~var32.length && var32[0].equals(Integer.valueOf(1))) {
         a((Object[])null, ',', -66, -17, 45, false);
      }

      if(var27 != null && 14 == var27.length) {
         hda.a(95, var27, var32);
      } else if(var27 != null && var27.length == 8) {
         jk.a(2, var32, var27);
      } else if(var27 != null && 11 == var27.length) {
         soa.a(var32, false, var27);
      } else if(var27 != null && (8 == var27.length || -12 >= ~var27.length && -13 <= ~var27.length || 14 == var27.length)) {
         wm.a(var32, var27, 8);
      } else if(var27 == null || var27.length != 9) {
         if(var27 != null && var27.length == 13) {
            dfa.a(var27, var32, (byte)-122);
         } else if(null == var27 || 15 != var27.length) {
            if(var27 != null && (-16 == ~var27.length || 10 == var27.length)) {
               qka.a(15, var32, var27);
            } else {
               if(var27 == null || var27.length != 12) {
                  throw new IllegalStateException();
               }

               jk.a(2, var32, var27);
            }
         }
      }

      var0[0] = mc.a(-87, var1, false);
      lm.a(20, (Object[])((Object[])var0[0]), 20480, -26241);
      ByteBuffer var29 = (ByteBuffer)((Object[])((Object[])var0[2]))[57];
      var29.clear();
      float var35 = wv.a((byte)-128, (float)var7, (Object[])((Object[])var0[3])) / (float)var7;
      if(var0 != null && var0.length == 1 && var0[0].equals(Boolean.valueOf(false))) {
         return null;
      } else {
         float var34 = rra.a((Object[])((Object[])var0[3]), (float)var7, (byte)-106) / (float)var7;

         for(var13 = 0; var13 < 256; ++var13) {
            aea var37 = var3[var13];
            var15 = var37.h;
            var16 = var37.a;
            var38 = var37.b;
            var18 = var37.f;
            float var41 = (float)(var13 % 16 * var6);
            float var42 = (float)(var13 / 16 * var6);
            float var39 = var41 * var35;
            float var40 = var42 * var34;
            float var23 = (var41 + (float)var16) * var35;
            float var24 = (var42 + (float)var15) * var34;
            var29.putFloat((float)var18);
            var29.putFloat((float)var38);
            var29.putFloat(0.0F);
            var29.putFloat(var39);
            var29.putFloat(var40);
            var29.putFloat((float)var18);
            var29.putFloat((float)(var38 + var15));
            var29.putFloat(0.0F);
            var29.putFloat(var39);
            var29.putFloat(var24);
            var29.putFloat((float)(var18 + var16));
            var29.putFloat((float)(var38 + var15));
            if(var2 != null && (var2.length == 1 && var2[0].equals(Integer.valueOf(2)) || var2.length == 2 || var2.length == 10)) {
               a(new Object[20][], ':', 83, 104, 65, false);
            }

            var29.putFloat(0.0F);
            var29.putFloat(var23);
            var29.putFloat(var24);
            var29.putFloat((float)(var18 + var16));
            var29.putFloat((float)var38);
            var29.putFloat(0.0F);
            var29.putFloat(var23);
            var29.putFloat(var40);
         }

         nda.a(-18243, (Object[])((Object[])var0[0]), var29.position(), 0, ((long[])((long[])((Object[])((Object[])var0[2]))[50]))[0]);
         ul.a(var1, 12, -116);
         return var0;
      }
   }

   static final void a(int var0, Object[] var1, Object[] var2) {
      ((int[])((int[])var2[1]))[0] = de.a((int)0, var1);
      ++d;
      int var3 = -35 / ((var0 + 15) / 59);
      fh.a(var1, false);
      if(fh.a(var1, false) != 255) {
         --((int[])((int[])var1[1]))[0];
         Class_i.a(false, var1);
      }

   }

   static final void a(Object[] var0, char var1, int var2, int var3, int var4, boolean var5, Class_s var6, int var7, int var8) {}

   static final Object[] a(int var0, Object[] var1) {
      int var2 = 117 / ((46 - var0) / 49);
      if(null == var1[14]) {
         var1[14] = new byte[5];
      }

      if(var1[1] == null) {
         var1[1] = new int[41];
      }

      if(null == var1[0]) {
         var1[0] = new boolean[16];
      }

      ++a;
      rna.a((byte)79, var1);
      return var1;
   }

}
