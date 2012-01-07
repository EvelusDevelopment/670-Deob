import java.nio.Buffer;
import java.nio.ByteBuffer;

final class ml {

   static int a;
   static int b;
   static int c;


   static final void a(byte var0, Object[] var1) {
      ++c;
      ada.d((Object[])((Object[])var1[4]), 0);

      for(int var2 = 0; var2 < ((Object[])((Object[])var1[12])).length; ++var2) {
         if(((Object[][])((Object[][])var1[12]))[var2] != null && ji.a((int)18845, ((Object[][])((Object[][])var1[12]))[var2])) {
            pja.a((byte)-98, ((Object[][])((Object[][])var1[12]))[var2]);
         }
      }

      Object[] var4 = new Object[10];
      gu.b(-2, var4);
      var4[2] = new vsa[64][768];
      ((int[])((int[])var4[1]))[0] = 0;
      var4[3] = new int[8191];
      var4[8] = new int[1600];
      var4[6] = new vsa[1600][64];
      var4[0] = new int[64];
      var4[4] = ao.a(new Object[][]{vg.a((byte)15, new Object[2], new Object[][]{eba.a, eba.d, eba.e}), sv.a(31675, new Object[2], eba.h)}, var1, false);
      var4[7] = mc.a(-108, var1, true);
      var4[5] = mc.a(-96, var1, false);
      lm.a(12, (Object[])((Object[])var4[5]), 393168, -26241);
      var4[9] = rta.a((byte)125, var1, false);
      if(var4 != null && (-6 == ~var4.length && var4[3].equals(Boolean.valueOf(false)) || var4.length == 8 && var4[1].equals(Integer.valueOf(1)))) {
         ela.a(1, (Object[])((Object[])((Object[])((Object[])ota.z[0]))[2]));
      }

      bj.a(4, (Object[])((Object[])var4[9]), '\ubffa');
      ByteBuffer var5 = (ByteBuffer)var1[57];
      var5.clear();

      int var6;
      for(var6 = 0; 8191 > var6; ++var6) {
         int var7 = var6 * 4;
         var5.putShort((short)var7);
         var5.putShort((short)(1 + var7));
         var5.putShort((short)(2 + var7));
         var5.putShort((short)(2 + var7));
         var5.putShort((short)(3 + var7));
         var5.putShort((short)var7);
      }

      nda.a(-18243, (Object[])((Object[])var4[9]), var5.position(), 0, ((long[])((long[])var1[50]))[0]);
      var5.clear();

      for(var6 = 0; 8191 > var6; ++var6) {
         var5.putFloat(0.0F);
         var5.putFloat(-1.0F);
         var5.putFloat(0.0F);
         var5.putFloat(0.0F);
         var5.putFloat(-1.0F);
         var5.putFloat(0.0F);
         var5.putFloat(0.0F);
         var5.putFloat(-1.0F);
         var5.putFloat(0.0F);
         var5.putFloat(0.0F);
         var5.putFloat(-1.0F);
         var5.putFloat(0.0F);
      }

      nda.a(-18243, (Object[])((Object[])var4[5]), var5.position(), 0, ((long[])((long[])var1[50]))[0]);
      var1[45] = var4;
      ela.a(1, var1);
      int var11 = 102 % ((24 - var0) / 62);
      var1[39] = mc.a(-109, var1, true);
      lm.a(12, (Object[])((Object[])var1[39]), 24, -26241);
      var1[68] = ao.a(new Object[][]{sv.a(31675, new Object[2], eba.a)}, var1, false);
      var1[69] = mc.a(-108, var1, false);
      lm.a(12, (Object[])((Object[])var1[69]), 3096, -26241);
      if(null != var4 && (var4.length == 3 && var4[0].equals(Integer.valueOf(2)) && var4[0].equals(Boolean.valueOf(false)) || var4.length == 21)) {
         mfa.a(-5, 31, (Object[])null, -58, 42);
      }

      ((Buffer)var1[57]).clear();
      ((ByteBuffer)var1[57]).putFloat(0.0F);
      ((ByteBuffer)var1[57]).putFloat(0.0F);
      ((ByteBuffer)var1[57]).putFloat(0.0F);

      for(var6 = 0; 256 >= var6; ++var6) {
         double var12 = 3.141592653589793D * (double)(var6 * 2) / 256.0D;
         float var9 = (float)Math.cos(var12);
         float var10 = (float)Math.sin(var12);
         ((ByteBuffer)var1[57]).putFloat(var10);
         ((ByteBuffer)var1[57]).putFloat(var9);
         ((ByteBuffer)var1[57]).putFloat(0.0F);
      }

      nda.a(-18243, (Object[])((Object[])var1[69]), ((Buffer)var1[57]).position(), 0, ((long[])((long[])var1[50]))[0]);
      uba.a(var1, (Object[])((Object[])var1[45]), -22245);
   }

   static final Object[] a(byte var0, Object[] var1, Object[] var2) {
      ++b;
      if(var0 <= 67) {
         var2[0] = var1[12];
      }

      jr.a((byte)106, var1);
      sea.b(var2, var1, (byte)-120);
      ((int[])((int[])var1[0]))[4] = de.a((int)0, var2);
      ((int[])((int[])var1[0]))[3] = fh.a(var2, false);
      ((int[])((int[])var1[0]))[1] = fh.a(var2, false);
      ((int[])((int[])var1[0]))[2] = fh.a(var2, false);
      return var1;
   }

   static final void a(int var0, Object[][] var1, int var2, int var3, int var4, byte var5, Object[] var6, int var7, int var8, Object[] var9, int var10) {
      ++a;
      int var11 = (var2 & 7) * 8;
      int var12 = (7 & var3) * 8;
      int var14;
      int var17;
      int var19;
      int var20;
      if(!((boolean[])((boolean[])var6[3]))[0]) {
         Object[] var13 = var1[var4];

         for(var14 = 0; var14 < 8; ++var14) {
            if(var9 != null && var9.length == 2) {
               dia.a((Object[])null, var5 + 39);
            }

            for(int var15 = 0; var15 < 8; ++var15) {
               int var16 = var10 + qm.a(7 & var14, var0, 7, 7 & var15);
               var17 = im.a(var0, 7 & var15, var14 & 7, 7) + var8;
               if(0 < var16 && ((int[])((int[])var6[1]))[0] - 1 > var16 && var17 > 0 && -1 + ((int[])((int[])var6[1]))[2] > var17) {
                  var20 = var17 - ((int[])((int[])var13[1]))[0];
                  var19 = var16 - ((int[])((int[])var13[1]))[2];
                  ((int[][])((int[][])var13[0]))[var19][var20] &= -2097153;
               }
            }
         }
      }

      int var28 = var2 << 3 & -64;
      var14 = var3 << 3 & -64;
      byte var30 = 0;
      byte var29 = 0;
      if(var5 != 57) {
         a((byte)28, (Object[])null);
      }

      if(var0 == 1) {
         var29 = 1;
      } else if(var0 != 2) {
         if(var0 == 3) {
            var30 = 1;
         }
      } else {
         var29 = 1;
         var30 = 1;
      }

      for(var17 = 0; var17 < ((int[])((int[])var6[1]))[1]; ++var17) {
         for(int var18 = 0; var18 < 64; ++var18) {
            for(var19 = 0; 64 > var19; ++var19) {
               if(var17 == var7 && var11 <= var18 && ~var18 >= ~(var11 + 8) && var19 >= var12 && ~var19 >= ~(var12 + 8)) {
                  int var21;
                  if(var11 + 8 != var18 && var12 - -8 != var19) {
                     var20 = var10 + qm.a(var18 & 7, var0, 7, var19 & 7);
                     var21 = var8 + im.a(var0, 7 & var19, var18 & 7, 7);
                     ora.a(var9, var30, var29, var21, var14 + var19, var4, var20, var0, var28 + var18, 1, false, var6);
                  } else {
                     if(var0 != 0) {
                        if(1 == var0) {
                           var20 = var10 + -var12 + var19;
                           var21 = -var18 + var11 + var8 + 8;
                        } else if(var0 != 2) {
                           var21 = var8 - (var11 + -var18);
                           var20 = 8 + var10 - (var19 - var12);
                        } else {
                           var21 = 8 + var8 + -var19 + var12;
                           var20 = var11 + -var18 + var10 + 8;
                        }
                     } else {
                        var20 = -var11 + var18 + var10;
                        var21 = var19 - (var12 - var8);
                     }

                     ora.a(var9, 0, 0, var21, var19 + var14, var4, var20, 0, var28 + var18, var5 - 56, true, var6);
                  }

                  if(var18 == 63 || 63 == var19) {
                     byte var22 = 1;
                     if(var18 == 63 && var19 == 63) {
                        var22 = 3;
                     }

                     for(int var23 = 0; var22 > var23; ++var23) {
                        int var24 = var18;
                        int var25 = var19;
                        if(0 == var23) {
                           var24 = 63 == var18?64:var18;
                           var25 = var19 != 63?var19:64;
                        } else if(var23 != 1) {
                           if(2 == var23) {
                              var25 = 64;
                           }
                        } else {
                           var24 = 64;
                        }

                        int var27;
                        int var26;
                        if(0 != var0) {
                           if(var0 != 1) {
                              if(2 == var0) {
                                 var26 = 8 + var10 - (var24 + -var11);
                                 var27 = 8 + var8 + var12 - var25;
                              } else {
                                 var26 = var12 + -var25 + 8 + var10;
                                 var27 = var8 + -var11 + var24;
                              }
                           } else {
                              var26 = var10 - (var12 + -var25);
                              var27 = 8 + var8 + var11 + -var24;
                           }
                        } else {
                           var26 = var24 + -var11 + var10;
                           var27 = var8 + var25 - var12;
                        }

                        if(var26 >= 0 && var26 < ((int[])((int[])var6[1]))[0] && 0 <= var27 && var27 < ((int[])((int[])var6[1]))[2]) {
                           ((int[][][])((int[][][])var6[4]))[var4][var26][var27] = ((int[][][])((int[][][])var6[4]))[var4][var30 + var20][var21 + var29];
                        }
                     }

                     if(var6 != null && (-6 == ~var6.length && var6[2].equals(Integer.valueOf(2)) || -6 == ~var6.length && var6[4].equals(Integer.valueOf(1)))) {
                        nua.e = -116;
                     }
                  }
               } else {
                  ora.a(var9, 0, 0, -1, 0, 0, -1, 0, 0, 1, false, var6);
               }
            }

            if(var6 != null && var6.length == 2) {
               kma.f = null;
            }
         }
      }

   }

}
