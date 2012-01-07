import java.nio.Buffer;
import java.nio.ByteBuffer;

final class jo {

   static int c;
   static Object[] d = ho.a(3, 32, new Object[1], true);
   static int a;
   static int b;


   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7, int var8, int var9, Object[] var10) {
      ++a;
      float var11 = (float)var0 - (float)var6;
      float var12 = (float)var9 - (float)var4;
      if(var11 == 0.0F && var12 == 0.0F) {
         var11 = 1.0F;
      } else {
         float var13 = (float)(1.0D / Math.sqrt((double)(var12 * var12 + var11 * var11)));
         var12 *= var13;
         var11 *= var13;
      }

      el.a(80, var10);
      Object[] var28 = ((Object[][])((Object[][])var10[32]))[13];
      eba.b(var28, 108);
      aqa.a(var5, var10, 82);
      if(var7 != -64) {
         a(62, ((int[])((int[])d[2]))[0], -103, ((int[])((int[])var10[2]))[13], (Object[])null, ((int[])((int[])d[0]))[13], 110, -79);
      }

      if(null == var28) {
         throw new IllegalStateException();
      } else {
         gi.a(~var7, var28);
         if(null != var10 && 87 == var10.length) {
            qja.a(var7 ^ 101, var10, false);
         } else {
            if(null == var10 || -92 != ~var10.length) {
               throw new IllegalStateException();
            }

            kma.a(false, var10, (byte)-51);
         }

         var1 %= var2 + var8;
         float var14 = (float)var8 * var11;
         float var15 = var12 * (float)var8;
         float var16 = 0.0F;
         float var17 = 0.0F;
         float var18 = var14;
         float var19 = var15;
         if(var1 > var8) {
            var16 = var11 * (float)(var2 + var8 + -var1);
            var17 = (float)(var2 + var8 + -var1) * var12;
         } else {
            var19 = var12 * (float)(var8 - var1);
            var18 = (float)(var8 + -var1) * var11;
         }

         float var20 = var16 + (float)var6;
         float var21 = (float)var4 + var17;
         if(var28 != null && (10 == var28.length || var28.length == 8 && var28[6].equals(Integer.valueOf(2)))) {
            ota.z[0] = ota.z[7];
         }

         float var22 = var11 * (float)var2;
         float var23 = (float)var2 * var12;

         while(true) {
            if(var0 > var6) {
               if((float)var0 < var20) {
                  break;
               }

               if((float)var0 < var20 + var18) {
                  var18 = (float)var0 - var20;
               }
            } else {
               if(var20 < (float)var0) {
                  break;
               }

               if(var20 + var18 < (float)var0) {
                  var18 = (float)var0 - var20;
               }
            }

            if(var28 != null && var28.length == 5 && var28[1].equals(Boolean.valueOf(false)) && var28[1].equals(Integer.valueOf(0))) {
               dj.a(false, (Object[])((Object[])ota.z[1]));
            }

            if(var4 >= var9) {
               if(var21 < (float)var9) {
                  break;
               }

               if(var21 + var19 < (float)var9) {
                  var19 = (float)var9 - var21;
               }
            } else {
               if(var21 > (float)var9) {
                  break;
               }

               if((float)var9 < var21 + var19) {
                  var19 = -var21 + (float)var9;
               }
            }

            float var25 = var18 + var20;
            float var26 = var19 + var21;
            ((Buffer)var10[57]).clear();
            ((ByteBuffer)var10[57]).putFloat(var20);
            ((ByteBuffer)var10[57]).putFloat(var21);
            ((ByteBuffer)var10[57]).putFloat(0.0F);
            ((ByteBuffer)var10[57]).putFloat(var25);
            ((ByteBuffer)var10[57]).putFloat(var26);
            ((ByteBuffer)var10[57]).putFloat(0.0F);
            boolean var24 = nda.a(-18243, (Object[])((Object[])var10[39]), ((Buffer)var10[57]).position(), 0, ((long[])((long[])var10[50]))[0]);
            if(!var24) {
               return;
            }

            var20 += var22 + var18;
            var21 += var23 + var19;
            lg.a(var10, -123);
            var19 = var15;
            var18 = var14;
         }

         if(var10 != null && var10.length == 87) {
            qja.a(-105, var10, true);
         } else {
            if(var10 == null || var10.length != 91) {
               throw new IllegalStateException();
            }

            kma.a(true, var10, (byte)-55);
         }

         kpa.a((byte)85, var28);
      }
   }

   static final void a(int var0, int var1, int var2, int var3, Object[] var4, int var5, int var6, int var7) {
      ++b;
      if(var1 != -4) {
         a(114, -28, ((int[])((int[])((Object[])((Object[])d[12]))[1]))[11], -118, (Object[])((Object[])d[3]), ((int[])((int[])var4[5]))[11], 71, ((int[])((int[])var4[9]))[2]);
      }

      Object[] var8;
      int[] var9 = ((ta)((var8 = (Object[])((Object[])var4[0])) == null?null:var8[38])).Y(var2, var3, var6, var5);
      if(var9 != null) {
         for(int var10 = 0; var10 < var9.length; ++var10) {
            var9[var10] |= -16777216;
         }

         if(var4 != null && var4.length == 14) {
            return;
         }

         lma.a((Object[])((Object[])var4[4]), (byte)-83, var0, var7, var6, 0, var9, var6, var5);
      }

   }

   static final int a(int var0, int var1, Object[] var2) {
      ++c;
      if(null != var2 && var2.length == 19) {
         return gb.a((byte)-114, var2, var1);
      } else {
         byte var3;
         if(var2 != null && var2.length == 26 && ((int[])((int[])var2[1])).length == 2 && ((int[])((int[])var2[1]))[1] == 2) {
            if(maa.a(bg.a(true, (Object[])((Object[])((Object[])((Object[])var2[0]))[5])), -121)) {
               var3 = 1;
            } else {
               var3 = 3;
            }

            return var3;
         } else if(var2 != null && -13 == ~var2.length && -3 == ~((int[])((int[])var2[1])).length) {
            return bqa.a(-126, var1, var2);
         } else if(null != var2 && var2.length == 5 && ((int[])((int[])var2[1])).length == 2) {
            return cma.a(var2, var1, var0 - 81);
         } else if(null != var2 && -26 == ~var2.length) {
            return tu.a(var2, var1, (byte)84);
         } else if(var2 != null && -7 == ~var2.length) {
            var3 = 1;
            return var3;
         } else if(null != var2 && 16 == var2.length) {
            return mha.a(var2, var1, (byte)58);
         } else if(var2 != null && 5 == var2.length && ((int[])((int[])var2[1])).length == 1) {
            return we.a(var2, (byte)65, var1);
         } else if(var2 != null && var2.length == 8) {
            return qt.a(var2, var1, var0 ^ 2);
         } else if(null != var2 && -3 == ~var2.length) {
            if(se.a((Object[])((Object[])var2[0]), (byte)-122)) {
               var3 = 3;
            } else if(fca.a(-55, (Object[])((Object[])var2[0])) == uha.g) {
               var3 = 1;
            } else {
               var3 = 3;
            }

            return var3;
         } else if(null != var2 && -15 == ~var2.length) {
            return iea.a(var1, var2, 0);
         } else if(null != var2 && var2.length == 11 && 1 == ((int[])((int[])var2[1])).length) {
            return lm.a(var1, var2, (byte)71);
         } else {
            if(var0 != 3) {
               d = (Object[])((Object[])var2[0]);
            }

            if(null != var2 && 24 == var2.length) {
               var3 = 1;
               return var3;
            } else if(var2 != null && 3 == var2.length) {
               return cb.a(var2, var1, (byte)-103);
            } else if(null != var2 && -27 == ~var2.length && ((int[])((int[])var2[1])).length == 1) {
               return Class_a.a(var2, (byte)-110, var1);
            } else if(null != var2 && var2.length == 12 && -2 == ~((int[])((int[])var2[1])).length) {
               return oma.a(var2, var1, 9111);
            } else if(null != var2 && var2.length == 4) {
               if(3 == var1) {
                  boolean var4 = nua.d.containsKey("jagdx");
                  if(!var4) {
                     var3 = 3;
                     return var3;
                  }
               }

               var3 = 2;
               return var3;
            } else if(var2 != null && var2.length == 22) {
               return wga.a(var2, var1, 3);
            } else if(var2 != null && 18 == var2.length) {
               var3 = 1;
               return var3;
            } else if(null != var2 && -21 == ~var2.length) {
               if(2 == var1) {
                  var3 = 2;
               } else {
                  var3 = 1;
               }

               return var3;
            } else if(var2 != null && 7 == var2.length) {
               var3 = 1;
               return var3;
            } else if(null != var2 && var2.length == 9) {
               return tb.a(var1, var0 ^ -91, var2);
            } else if(var2 != null && var2.length == 23) {
               return daa.a(var2, var1, (byte)-119);
            } else if(var2 != null && var2.length == 17) {
               return tb.a(var2, var0 ^ 2, var1);
            } else if(var2 != null && var2.length == 15) {
               if(se.a((Object[])((Object[])var2[0]), (byte)-122)) {
                  var3 = 3;
               } else {
                  var3 = 1;
               }

               return var3;
            } else if(var2 != null && -11 == ~var2.length) {
               if(!maa.a(bg.a(true, (Object[])((Object[])((Object[])((Object[])var2[0]))[5])), var0 + 15)) {
                  var3 = 3;
               } else {
                  var3 = 1;
               }

               return var3;
            } else if(var2 != null && var2.length == 11 && -3 == ~((int[])((int[])var2[1])).length) {
               return bk.a(var2, var1, false);
            } else if(var2 != null && var2.length == 21) {
               return osa.a(-3644, var1, var2);
            } else if(null != var2 && -27 == ~var2.length && ((int[])((int[])var2[1])).length == 2 && 0 == ((int[])((int[])var2[1]))[1]) {
               return tp.a(var2, var1, (byte)44);
            } else if(var2 != null && 13 == var2.length) {
               if(!se.a((Object[])((Object[])var2[0]), (byte)-122)) {
                  if(0 != var1 && 1 != cf.a(var0 ^ 83, (Object[])((Object[])((Object[])((Object[])var2[0]))[3]))) {
                     var3 = 2;
                  } else {
                     var3 = 1;
                  }
               } else {
                  var3 = 3;
               }

               return var3;
            } else {
               throw new IllegalStateException();
            }
         }
      }
   }

}
