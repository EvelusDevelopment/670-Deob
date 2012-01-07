import jaggl.OpenGL;
import java.io.IOException;

final class coa extends tha {

   static int B;
   static int u;
   static int F;
   static int t;
   static int v = 0;
   Object[] D;
   static int w;
   static Object[] y = sd.a(new Object[1], 74, (byte)117);
   static int E;
   static int z;
   static int x;
   static int A;


   static final void a(int var0, int var1, Object[] var2) {
      ++w;
      if(var2[var1] != null) {
         lm var3 = pm.a((long)var0, (Object[])((Object[])var2[63]), false);
         if(null != var3) {
            var3.a((byte)14);
         }
      }

   }

   static final int a(int var0, int var1, int var2, Object[] var3, byte var4, int var5, int var6, int var7) {
      ++z;
      int var13 = var5 >> 12;
      int var12 = var13 + 1;
      if(var7 <= var12) {
         var12 = 0;
      }

      var5 &= 4095;
      var13 &= 255;
      int var10 = -4096 + var2;
      var12 &= 255;
      int var11 = -4096 + var5;
      if(var3 != null && var3.length == 3 && var3[1].equals(Boolean.valueOf(false))) {
         return 6;
      } else {
         int var14 = 3 & ((byte[])((byte[])var3[7]))[var13 + var0];
         int var15 = gsa.e[var5];
         int var8;
         if(1 < var14) {
            var8 = var14 != 2?-var5 + -var2:-var2 + var5;
         } else {
            var8 = 0 != var14?-var5 + var2:var5 + var2;
         }

         var14 = ((byte[])((byte[])var3[7]))[var0 + var12] & 3;
         int var9;
         if(1 >= var14) {
            var9 = 0 == var14?var2 + var11:-var11 + var2;
         } else {
            var9 = 2 == var14?var11 + -var2:-var11 + -var2;
         }

         int var16 = var8 + ((var9 - var8) * var15 >> 12);
         var14 = ((byte[])((byte[])var3[7]))[var6 + var13] & 3;
         if(var14 > 1) {
            var8 = var14 != 2?-var5 - var10:var5 + -var10;
         } else {
            var8 = 0 != var14?var10 - var5:var10 + var5;
         }

         if(var4 <= 68) {
            u = -2;
         }

         var14 = ((byte[])((byte[])var3[7]))[var12 + var6] & 3;
         if(var14 <= 1) {
            var9 = 0 == var14?var11 + var10:-var11 + var10;
         } else {
            var9 = var14 == 2?-var10 + var11:-var11 + -var10;
         }

         int var17 = var8 + (var15 * (var9 - var8) >> 12);
         return var16 + (var1 * (var17 + -var16) >> 12);
      }
   }

   static final Object[] a(int var0, Object[] var1, Object[] var2) {
      try {
         ++x;
         if(null == var2[1]) {
            var2[1] = new int[2];
         }

         ((int[])((int[])var2[1]))[1] = -1;
         ((int[])((int[])var2[1]))[0] = -1;
         byte[] var3 = fd.a(-2, 6, var1);
         eja.a(jta.a((byte)-83, var3, new Object[3]), 0, var2);
         int var4 = 23 / ((-57 - var0) / 49);
         if(var2[0] != null) {
            return var2;
         } else {
            throw new RuntimeException("");
         }
      } catch (RuntimeException var5) {
         throw vt.a(var5, "coa.E(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

   static final int a(Object[] var0, int var1) {
      if(var1 != 11) {
         a(new Object[1], ((int[])((int[])var0[1]))[3]);
      }

      ++t;
      return ((int[])((int[])var0[1]))[0];
   }

   static final void a(Object[] var0, int var1, Object[] var2) {
      if(var1 == 2) {
         ++F;
         Object[] var3 = (Object[])((Object[])var0[59]);
         if(null != var0[46]) {
            vqa.a(4, var3, var0);
            float var4 = ((float[])((float[])((Object[])((Object[])var0[46]))[0]))[2];
            float var5 = ((float[])((float[])((Object[])((Object[])var0[46]))[0]))[6];
            float var6 = ((float[])((float[])((Object[])((Object[])var0[46]))[0]))[10];
            float var7 = ((float[])((float[])((Object[])((Object[])var0[46]))[0]))[14];

            try {
               if(null != var3 && var3.length == 7) {
                  esa.a = 104;
               }

               int var8 = 0;
               int var9 = Integer.MAX_VALUE;
               int var10 = 0;
               va var11 = (va)((Object[])((Object[])var2[0]))[1];

               va var12;
               int var14;
               for(var12 = var11.p; var11 != var12; var12 = var12.p) {
                  vsa var13 = (vsa)var12;
                  var14 = (int)(var7 + var6 * (float)(var13.v >> 12) + var4 * (float)(var13.B >> 12) + var5 * (float)(var13.z >> 12));
                  if(var10 < var14) {
                     var10 = var14;
                  }

                  ((int[])((int[])var3[4]))[var8++] = var14;
                  if(var9 > var14) {
                     var9 = var14;
                  }
               }

               int var49 = -var9 + var10;
               if(-1601 <= ~(2 + var49)) {
                  var49 += 2;
                  var14 = 0;
               } else {
                  var14 = dba.a(var49, var1 ^ 69) + 1 + -((int[])((int[])var3[1]))[1];
                  var49 = 2 + (var49 >> var14);
               }

               var12 = var11.p;
               var8 = 0;
               int var15 = -2;
               boolean var16 = true;
               boolean var17 = true;

               while(var12 != var11) {
                  ((int[])((int[])var3[1]))[0] = 0;

                  int var18;
                  for(var18 = 0; var18 < var49; ++var18) {
                     ((int[])((int[])var3[5]))[var18] = 0;
                  }

                  for(var18 = 0; 64 > var18; ++var18) {
                     ((int[])((int[])var3[7]))[var18] = 0;
                  }

                  for(; var12 != var11; var12 = var12.p) {
                     vsa var50 = (vsa)var12;
                     if(var17) {
                        var17 = false;
                        var15 = var50.x;
                        var16 = var50.y;
                     }

                     if(var8 > 0 && (var15 != var50.x || var16 != var50.y)) {
                        var17 = true;
                        break;
                     }

                     int var19 = ((int[])((int[])var3[4]))[var8++] - var9 >> var14;
                     if(1600 > var19) {
                        int[] var59;
                        int var58;
                        vsa[] var60;
                        if(((int[])((int[])var3[5]))[var19] >= 64) {
                           int var10002;
                           if(((int[])((int[])var3[5]))[var19] == 64) {
                              if(64 == ((int[])((int[])var3[1]))[0]) {
                                 continue;
                              }

                              int[] var10000 = (int[])((int[])var3[5]);
                              var10002 = ((int[])((int[])var3[5]))[var19];
                              int[] var10004 = (int[])((int[])var3[1]);
                              int var10007 = ((int[])((int[])var3[1]))[0];
                              var10004[0] = ((int[])((int[])var3[1]))[0] + 1;
                              var10000[var19] = var10002 + 1 + var10007;
                           }

                           var60 = ((vsa[][])((vsa[][])var3[0]))[((int[])((int[])var3[5]))[var19] - 65];
                           var59 = (int[])((int[])var3[7]);
                           var10002 = ((int[])((int[])var3[5]))[var19] - 64 - 1;
                           var58 = var59[((int[])((int[])var3[5]))[var19] - 64 - 1];
                           var59[var10002] = var59[((int[])((int[])var3[5]))[var19] - 64 - 1] + 1;
                           var60[var58] = var50;
                        } else {
                           var60 = ((vsa[][])((vsa[][])var3[3]))[var19];
                           var59 = (int[])((int[])var3[5]);
                           var58 = ((int[])((int[])var3[5]))[var19];
                           var59[var19] = ((int[])((int[])var3[5]))[var19] + 1;
                           var60[var58] = var50;
                        }
                     }
                  }

                  if(0 > var15) {
                     jia.a(var0, 0, -1);
                  } else {
                     jia.a(var0, 0, var15);
                  }

                  if(null != var3 && (-3 == ~var3.length || var3.length == 23)) {
                     pj.a((Object[])null, true);
                  }

                  if(var16 && Class_e.b != ((float[])((float[])var0[25]))[10]) {
                     rea.a(var1 ^ 14035, Class_e.b, var0);
                  } else if(1.0F != ((float[])((float[])var0[25]))[10]) {
                     rea.a(14033, 1.0F, var0);
                  }

                  OpenGL.glGetFloatv(2982, (float[])((float[])var3[10]), 0);
                  float var52 = ((float[])((float[])var3[10]))[0];
                  float var51 = ((float[])((float[])var3[10]))[4];
                  float var20 = ((float[])((float[])var3[10]))[8];
                  float var21 = ((float[])((float[])var3[10]))[1];
                  float var22 = ((float[])((float[])var3[10]))[5];
                  float var23 = ((float[])((float[])var3[10]))[9];
                  float var24 = var21 + var52;
                  float var25 = var22 + var51;
                  float var26 = var20 + var23;
                  float var27 = -var21 + var52;
                  float var28 = var51 - var22;
                  float var29 = var20 - var23;
                  float var30 = var21 - var52;
                  float var31 = -var51 + var22;
                  if(var2 != null && 15 == var2.length) {
                     np.a((Object[])null, (byte)-114);
                  }

                  float var32 = var23 - var20;
                  ((int[])((int[])((Object[])((Object[])var3[2]))[1]))[0] = 0;
                  int var34;
                  int var35;
                  int var33;
                  byte var38;
                  byte var39;
                  vsa var36;
                  int var37;
                  float var42;
                  float var43;
                  byte var40;
                  byte var41;
                  int var46;
                  float var44;
                  int var45;
                  vsa var55;
                  int var54;
                  int var53;
                  byte var57;
                  float var56;
                  if(!((boolean[])((boolean[])var0[17]))[11]) {
                     for(var33 = -1 + var49; var33 >= 0; --var33) {
                        var34 = 64 >= ((int[])((int[])var3[5]))[var33]?((int[])((int[])var3[5]))[var33]:64;
                        if(0 < var34) {
                           if(var0 != null && 5 == var0.length) {
                              dma.f = null;
                           }

                           for(var35 = -1 + var34; var35 >= 0; --var35) {
                              var36 = ((vsa[][])((vsa[][])var3[3]))[var33][var35];
                              var37 = var36.A;
                              var38 = (byte)(var37 >> 16);
                              var39 = (byte)(var37 >> 8);
                              var40 = (byte)var37;
                              var41 = (byte)(var37 >>> 24);
                              var42 = (float)(var36.B >> 12);
                              var43 = (float)(var36.z >> 12);
                              var44 = (float)(var36.v >> 12);
                              var45 = var36.C >> 12;
                              uq.putFloatLE(var1 - 1, 0.0F, (Object[])((Object[])var3[2]));
                              uq.putFloatLE(1, 0.0F, (Object[])((Object[])var3[2]));
                              uq.putFloatLE(1, var24 * (float)(-var45) + var42, (Object[])((Object[])var3[2]));
                              uq.putFloatLE(var1 - 1, var43 + (float)(-var45) * var25, (Object[])((Object[])var3[2]));
                              uq.putFloatLE(1, (float)(-var45) * var26 + var44, (Object[])((Object[])var3[2]));
                              ek.putByte((Object[])((Object[])var3[2]), var38);
                              ek.putByte((Object[])((Object[])var3[2]), var39);
                              ek.putByte((Object[])((Object[])var3[2]), var40);
                              ek.putByte((Object[])((Object[])var3[2]), var41);
                              uq.putFloatLE(1, 0.0F, (Object[])((Object[])var3[2]));
                              uq.putFloatLE(1, 1.0F, (Object[])((Object[])var3[2]));
                              uq.putFloatLE(1, var30 * (float)var45 + var42, (Object[])((Object[])var3[2]));
                              uq.putFloatLE(1, var43 + var31 * (float)var45, (Object[])((Object[])var3[2]));
                              uq.putFloatLE(var1 ^ 3, var44 + var32 * (float)var45, (Object[])((Object[])var3[2]));
                              ek.putByte((Object[])((Object[])var3[2]), var38);
                              ek.putByte((Object[])((Object[])var3[2]), var39);
                              ek.putByte((Object[])((Object[])var3[2]), var40);
                              ek.putByte((Object[])((Object[])var3[2]), var41);
                              uq.putFloatLE(1, 1.0F, (Object[])((Object[])var3[2]));
                              uq.putFloatLE(1, 1.0F, (Object[])((Object[])var3[2]));
                              uq.putFloatLE(1, var42 + (float)var45 * var24, (Object[])((Object[])var3[2]));
                              uq.putFloatLE(1, var43 + var25 * (float)var45, (Object[])((Object[])var3[2]));
                              uq.putFloatLE(1, (float)var45 * var26 + var44, (Object[])((Object[])var3[2]));
                              ek.putByte((Object[])((Object[])var3[2]), var38);
                              ek.putByte((Object[])((Object[])var3[2]), var39);
                              ek.putByte((Object[])((Object[])var3[2]), var40);
                              ek.putByte((Object[])((Object[])var3[2]), var41);
                              uq.putFloatLE(1, 1.0F, (Object[])((Object[])var3[2]));
                              uq.putFloatLE(1, 0.0F, (Object[])((Object[])var3[2]));
                              uq.putFloatLE(1, var27 * (float)var45 + var42, (Object[])((Object[])var3[2]));
                              uq.putFloatLE(var1 ^ 3, var43 + (float)var45 * var28, (Object[])((Object[])var3[2]));
                              uq.putFloatLE(1, (float)var45 * var29 + var44, (Object[])((Object[])var3[2]));
                              ek.putByte((Object[])((Object[])var3[2]), var38);
                              ek.putByte((Object[])((Object[])var3[2]), var39);
                              ek.putByte((Object[])((Object[])var3[2]), var40);
                              ek.putByte((Object[])((Object[])var3[2]), var41);
                           }

                           if(((int[])((int[])var3[5]))[var33] > 64) {
                              var35 = -64 + (((int[])((int[])var3[5]))[var33] - 1);

                              for(var53 = -1 + ((int[])((int[])var3[7]))[var35]; var53 >= 0; --var53) {
                                 var55 = ((vsa[][])((vsa[][])var3[0]))[var35][var53];
                                 var54 = var55.A;
                                 var39 = (byte)(var54 >> 16);
                                 var40 = (byte)(var54 >> 8);
                                 var41 = (byte)var54;
                                 var57 = (byte)(var54 >>> 24);
                                 var43 = (float)(var55.B >> 12);
                                 var44 = (float)(var55.z >> 12);
                                 var56 = (float)(var55.v >> 12);
                                 var46 = var55.C >> 12;
                                 uq.putFloatLE(1, 0.0F, (Object[])((Object[])var3[2]));
                                 uq.putFloatLE(var1 - 1, 0.0F, (Object[])((Object[])var3[2]));
                                 uq.putFloatLE(1, (float)(-var46) * var24 + var43, (Object[])((Object[])var3[2]));
                                 uq.putFloatLE(var1 - 1, var44 + (float)(-var46) * var25, (Object[])((Object[])var3[2]));
                                 uq.putFloatLE(1, (float)(-var46) * var26 + var56, (Object[])((Object[])var3[2]));
                                 ek.putByte((Object[])((Object[])var3[2]), var39);
                                 ek.putByte((Object[])((Object[])var3[2]), var40);
                                 ek.putByte((Object[])((Object[])var3[2]), var41);
                                 ek.putByte((Object[])((Object[])var3[2]), var57);
                                 uq.putFloatLE(var1 - 1, 0.0F, (Object[])((Object[])var3[2]));
                                 uq.putFloatLE(1, 1.0F, (Object[])((Object[])var3[2]));
                                 uq.putFloatLE(var1 ^ 3, (float)var46 * var30 + var43, (Object[])((Object[])var3[2]));
                                 uq.putFloatLE(1, var44 + (float)var46 * var31, (Object[])((Object[])var3[2]));
                                 uq.putFloatLE(var1 - 1, (float)var46 * var32 + var56, (Object[])((Object[])var3[2]));
                                 ek.putByte((Object[])((Object[])var3[2]), var39);
                                 ek.putByte((Object[])((Object[])var3[2]), var40);
                                 ek.putByte((Object[])((Object[])var3[2]), var41);
                                 ek.putByte((Object[])((Object[])var3[2]), var57);
                                 uq.putFloatLE(1, 1.0F, (Object[])((Object[])var3[2]));
                                 uq.putFloatLE(var1 ^ 3, 1.0F, (Object[])((Object[])var3[2]));
                                 uq.putFloatLE(1, var24 * (float)var46 + var43, (Object[])((Object[])var3[2]));
                                 uq.putFloatLE(1, (float)var46 * var25 + var44, (Object[])((Object[])var3[2]));
                                 uq.putFloatLE(1, var56 + (float)var46 * var26, (Object[])((Object[])var3[2]));
                                 if(var3 != null && -4 == ~var3.length) {
                                    esa.a = -11;
                                 }

                                 ek.putByte((Object[])((Object[])var3[2]), var39);
                                 ek.putByte((Object[])((Object[])var3[2]), var40);
                                 ek.putByte((Object[])((Object[])var3[2]), var41);
                                 ek.putByte((Object[])((Object[])var3[2]), var57);
                                 uq.putFloatLE(1, 1.0F, (Object[])((Object[])var3[2]));
                                 uq.putFloatLE(var1 ^ 3, 0.0F, (Object[])((Object[])var3[2]));
                                 uq.putFloatLE(1, (float)var46 * var27 + var43, (Object[])((Object[])var3[2]));
                                 uq.putFloatLE(1, var44 + var28 * (float)var46, (Object[])((Object[])var3[2]));
                                 uq.putFloatLE(1, var56 + var29 * (float)var46, (Object[])((Object[])var3[2]));
                                 ek.putByte((Object[])((Object[])var3[2]), var39);
                                 ek.putByte((Object[])((Object[])var3[2]), var40);
                                 ek.putByte((Object[])((Object[])var3[2]), var41);
                                 ek.putByte((Object[])((Object[])var3[2]), var57);
                              }

                              if(var2 != null && (var2.length == 3 || 5 == var2.length && var2[1].equals(Integer.valueOf(0)))) {
                                 mca.a(-87, 64, (byte)-64, false, -56, 11, (Object[])null);
                              }
                           }
                        }
                     }

                     if(null != var0 && var0.length == 11 && var0[8].equals(Boolean.valueOf(false))) {
                        kr.a((Object[])null, (int)57);
                     }
                  } else {
                     for(var33 = var49 - 1; var33 >= 0; --var33) {
                        var34 = -65 > ~((int[])((int[])var3[5]))[var33]?64:((int[])((int[])var3[5]))[var33];
                        if(var34 > 0) {
                           if(null != var2 && var2.length == 19) {
                              esa.a = 51;
                           }

                           for(var35 = var34 - 1; 0 <= var35; --var35) {
                              var36 = ((vsa[][])((vsa[][])var3[3]))[var33][var35];
                              var37 = var36.A;
                              var38 = (byte)(var37 >> 16);
                              var39 = (byte)(var37 >> 8);
                              var40 = (byte)var37;
                              var41 = (byte)(var37 >>> 24);
                              var42 = (float)(var36.B >> 12);
                              var43 = (float)(var36.z >> 12);
                              var44 = (float)(var36.v >> 12);
                              var45 = var36.C >> 12;
                              tua.putFloat((Object[])((Object[])var3[2]), (byte)-126, 0.0F);
                              tua.putFloat((Object[])((Object[])var3[2]), (byte)-126, 0.0F);
                              tua.putFloat((Object[])((Object[])var3[2]), (byte)-126, var42 + (float)(-var45) * var24);
                              tua.putFloat((Object[])((Object[])var3[2]), (byte)-128, var43 + var25 * (float)(-var45));
                              tua.putFloat((Object[])((Object[])var3[2]), (byte)-126, var44 + var26 * (float)(-var45));
                              ek.putByte((Object[])((Object[])var3[2]), var38);
                              ek.putByte((Object[])((Object[])var3[2]), var39);
                              ek.putByte((Object[])((Object[])var3[2]), var40);
                              ek.putByte((Object[])((Object[])var3[2]), var41);
                              tua.putFloat((Object[])((Object[])var3[2]), (byte)-128, 0.0F);
                              tua.putFloat((Object[])((Object[])var3[2]), (byte)-128, 1.0F);
                              tua.putFloat((Object[])((Object[])var3[2]), (byte)-127, var42 + (float)var45 * var30);
                              tua.putFloat((Object[])((Object[])var3[2]), (byte)-128, var31 * (float)var45 + var43);
                              tua.putFloat((Object[])((Object[])var3[2]), (byte)-128, var44 + var32 * (float)var45);
                              ek.putByte((Object[])((Object[])var3[2]), var38);
                              ek.putByte((Object[])((Object[])var3[2]), var39);
                              ek.putByte((Object[])((Object[])var3[2]), var40);
                              ek.putByte((Object[])((Object[])var3[2]), var41);
                              tua.putFloat((Object[])((Object[])var3[2]), (byte)-127, 1.0F);
                              tua.putFloat((Object[])((Object[])var3[2]), (byte)-128, 1.0F);
                              tua.putFloat((Object[])((Object[])var3[2]), (byte)-126, var42 + var24 * (float)var45);
                              tua.putFloat((Object[])((Object[])var3[2]), (byte)-128, (float)var45 * var25 + var43);
                              tua.putFloat((Object[])((Object[])var3[2]), (byte)-127, var26 * (float)var45 + var44);
                              ek.putByte((Object[])((Object[])var3[2]), var38);
                              ek.putByte((Object[])((Object[])var3[2]), var39);
                              ek.putByte((Object[])((Object[])var3[2]), var40);
                              ek.putByte((Object[])((Object[])var3[2]), var41);
                              tua.putFloat((Object[])((Object[])var3[2]), (byte)-126, 1.0F);
                              tua.putFloat((Object[])((Object[])var3[2]), (byte)-127, 0.0F);
                              tua.putFloat((Object[])((Object[])var3[2]), (byte)-126, var42 + (float)var45 * var27);
                              tua.putFloat((Object[])((Object[])var3[2]), (byte)-126, (float)var45 * var28 + var43);
                              if(null != var0 && var0.length == 3) {
                                 esa.a = 48;
                              }

                              tua.putFloat((Object[])((Object[])var3[2]), (byte)-126, var44 + (float)var45 * var29);
                              ek.putByte((Object[])((Object[])var3[2]), var38);
                              ek.putByte((Object[])((Object[])var3[2]), var39);
                              ek.putByte((Object[])((Object[])var3[2]), var40);
                              ek.putByte((Object[])((Object[])var3[2]), var41);
                           }

                           if(((int[])((int[])var3[5]))[var33] > 64) {
                              var35 = -65 + ((int[])((int[])var3[5]))[var33];
                              if(null != var0 && var0.length == 27 && var0[2].equals(Integer.valueOf(1)) && var0[2].equals(Integer.valueOf(0))) {
                                 lt.a(121, 124, 113, 44, 3, 26, -97, 47, (Object[])null);
                              }

                              for(var53 = -1 + ((int[])((int[])var3[7]))[var35]; var53 >= 0; --var53) {
                                 var55 = ((vsa[][])((vsa[][])var3[0]))[var35][var53];
                                 var54 = var55.A;
                                 var39 = (byte)(var54 >> 16);
                                 var40 = (byte)(var54 >> 8);
                                 var41 = (byte)var54;
                                 var57 = (byte)(var54 >>> 24);
                                 var43 = (float)(var55.B >> 12);
                                 var44 = (float)(var55.z >> 12);
                                 var56 = (float)(var55.v >> 12);
                                 var46 = var55.C >> 12;
                                 tua.putFloat((Object[])((Object[])var3[2]), (byte)-126, 0.0F);
                                 tua.putFloat((Object[])((Object[])var3[2]), (byte)-127, 0.0F);
                                 if(null != var0 && (-30 == ~var0.length && var0[7].equals(Integer.valueOf(1)) || -6 == ~var0.length || var0.length == 16)) {
                                    dma.f = null;
                                 }

                                 tua.putFloat((Object[])((Object[])var3[2]), (byte)-128, var24 * (float)(-var46) + var43);
                                 tua.putFloat((Object[])((Object[])var3[2]), (byte)-128, var25 * (float)(-var46) + var44);
                                 tua.putFloat((Object[])((Object[])var3[2]), (byte)-127, var56 + var26 * (float)(-var46));
                                 ek.putByte((Object[])((Object[])var3[2]), var39);
                                 ek.putByte((Object[])((Object[])var3[2]), var40);
                                 ek.putByte((Object[])((Object[])var3[2]), var41);
                                 ek.putByte((Object[])((Object[])var3[2]), var57);
                                 tua.putFloat((Object[])((Object[])var3[2]), (byte)-127, 0.0F);
                                 tua.putFloat((Object[])((Object[])var3[2]), (byte)-128, 1.0F);
                                 tua.putFloat((Object[])((Object[])var3[2]), (byte)-128, var30 * (float)var46 + var43);
                                 tua.putFloat((Object[])((Object[])var3[2]), (byte)-127, var44 + var31 * (float)var46);
                                 tua.putFloat((Object[])((Object[])var3[2]), (byte)-127, var56 + (float)var46 * var32);
                                 ek.putByte((Object[])((Object[])var3[2]), var39);
                                 ek.putByte((Object[])((Object[])var3[2]), var40);
                                 ek.putByte((Object[])((Object[])var3[2]), var41);
                                 ek.putByte((Object[])((Object[])var3[2]), var57);
                                 tua.putFloat((Object[])((Object[])var3[2]), (byte)-126, 1.0F);
                                 tua.putFloat((Object[])((Object[])var3[2]), (byte)-126, 1.0F);
                                 tua.putFloat((Object[])((Object[])var3[2]), (byte)-127, (float)var46 * var24 + var43);
                                 tua.putFloat((Object[])((Object[])var3[2]), (byte)-128, (float)var46 * var25 + var44);
                                 tua.putFloat((Object[])((Object[])var3[2]), (byte)-126, var56 + (float)var46 * var26);
                                 ek.putByte((Object[])((Object[])var3[2]), var39);
                                 ek.putByte((Object[])((Object[])var3[2]), var40);
                                 ek.putByte((Object[])((Object[])var3[2]), var41);
                                 ek.putByte((Object[])((Object[])var3[2]), var57);
                                 tua.putFloat((Object[])((Object[])var3[2]), (byte)-126, 1.0F);
                                 tua.putFloat((Object[])((Object[])var3[2]), (byte)-126, 0.0F);
                                 tua.putFloat((Object[])((Object[])var3[2]), (byte)-128, var27 * (float)var46 + var43);
                                 tua.putFloat((Object[])((Object[])var3[2]), (byte)-126, var44 + var28 * (float)var46);
                                 tua.putFloat((Object[])((Object[])var3[2]), (byte)-128, var56 + var29 * (float)var46);
                                 ek.putByte((Object[])((Object[])var3[2]), var39);
                                 ek.putByte((Object[])((Object[])var3[2]), var40);
                                 ek.putByte((Object[])((Object[])var3[2]), var41);
                                 ek.putByte((Object[])((Object[])var3[2]), var57);
                              }
                           }
                        }
                     }

                     if(var3 != null && -4 == ~var3.length) {
                        esa.a = -32;
                     }
                  }

                  if(0 != ((int[])((int[])((Object[])((Object[])var3[2]))[1]))[0]) {
                     ci.a(var1 ^ -76, 24, (Object[])((Object[])var3[9]), (byte[])((byte[])((Object[])((Object[])var3[2]))[2]), ((int[])((int[])((Object[])((Object[])var3[2]))[1]))[0]);
                     nqa.a((Object[])((Object[])var3[6]), (Object[])null, 20798, (Object[])((Object[])var3[8]), var0, (Object[])((Object[])var3[11]));
                     var33 = ((int[])((int[])((Object[])((Object[])var3[2]))[1]))[0] / 24;
                     OpenGL.glDrawArrays(7, 0, var33);
                  }
               }
            } catch (Exception var48) {
               ;
            }

            jma.a(121, true, var0);
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
            if(((float[])((float[])var0[25]))[10] != Class_e.b) {
               rea.a(14033, Class_e.b, var0);
            }
         }

      }
   }

   coa(Object[] var1) {
      this.D = var1;
   }

   static final void a(byte var0, Object[] var1) {
      double var2 = Math.cos((double)((float)((int[])((int[])var1[1]))[1] / 4096.0F));
      ((int[])((int[])var1[14]))[0] = (int)(4096.0D * Math.sin((double)((float)((int[])((int[])var1[1]))[2] / 4096.0F)) * var2);
      ((int[])((int[])var1[14]))[1] = (int)(var2 * Math.cos((double)((float)((int[])((int[])var1[1]))[2] / 4096.0F)) * 4096.0D);
      ((int[])((int[])var1[14]))[2] = (int)(4096.0D * Math.sin((double)((float)((int[])((int[])var1[1]))[1] / 4096.0F)));
      int var4 = ((int[])((int[])var1[14]))[0] * ((int[])((int[])var1[14]))[0] >> 12;
      int var5 = ((int[])((int[])var1[14]))[1] * ((int[])((int[])var1[14]))[1] >> 12;
      int var6 = ((int[])((int[])var1[14]))[2] * ((int[])((int[])var1[14]))[2] >> 12;
      int var7 = (int)(Math.sqrt((double)(var6 + var4 + var5 >> 12)) * 4096.0D);
      if(0 != var7) {
         ((int[])((int[])var1[14]))[0] = (((int[])((int[])var1[14]))[0] << 12) / var7;
         ((int[])((int[])var1[14]))[1] = (((int[])((int[])var1[14]))[1] << 12) / var7;
         ((int[])((int[])var1[14]))[2] = (((int[])((int[])var1[14]))[2] << 12) / var7;
      }

      int var8 = -13 / ((-34 - var0) / 39);
      ++A;
   }

   static final void b(Object[] var0, int var1) {
      ++E;
      synchronized(null == var0?null:var0[2]) {
         if(var0[var1] == null) {
            var0[3] = new IOException("");
         }

         var0[2].notifyAll();
      }

      try {
         ((Thread)var0[4]).join();
      } catch (InterruptedException var5) {
         ;
      }

   }

   static final Object[] a(ta var0, Object[] var1, byte var2) {
      ++B;
      long var3 = (long)((int[])((int[])var1[1]))[3] << 32 | 4294967295L & (long)((int[])((int[])var1[1]))[47];
      Object[] var5 = (Object[])((Object[])dna.a((byte)34, jl.b, var3));
      if(var5 != null && -2 == ~var5.length) {
         va.a((Object[])null, 108, (Object[])((Object[])jl.b[4]), (Object[])((Object[])pt.c[8]));
      }

      if(var5 != null) {
         if(((int[])((int[])var5[1]))[1] != ((int[])((int[])var1[1]))[57]) {
            su.a(jl.b, 118, var3);
            var5 = null;
         }

         if(null != var5) {
            return var5;
         }
      }

      aea var6 = aea.b(Class_a.a, ((int[])((int[])var1[1]))[57], 0);
      if(null == var6) {
         return null;
      } else {
         int var7 = var6.d + var6.a + var6.f;
         int var8 = var6.g + var6.h + var6.b;
         int[] var9 = new int[var8];
         int[] var10 = new int[var8];
         int var11 = 0;

         int var14;
         while(var6.h > var11) {
            int var12 = 0;
            var14 = 0;

            while(true) {
               if(var6.a > var14) {
                  if(var6.c[var6.a * var11 + var14] == 0) {
                     ++var14;
                     continue;
                  }

                  var12 = var14;
               }

               int var13 = var6.a;

               for(var14 = var6.a - 1; var14 >= var12; --var14) {
                  if(var6.c[var14 + var11 * var6.a] != 0) {
                     var13 = var14 + 1;
                     break;
                  }
               }

               var9[var11 + var6.b] = var6.f + var12;
               var10[var11 + var6.b] = -var12 + var13;
               ++var11;
               break;
            }
         }

         Class_s var15 = var0.a(var7, var8, var9, var10);
         if(null == var15) {
            return null;
         } else {
            Object[] var16 = new Object[4];
            var14 = ((int[])((int[])var1[1]))[57];
            md.a(var16, (int)125);
            var16[0] = var10;
            ((int[])((int[])var16[1]))[1] = var14;
            ((int[])((int[])var16[1]))[0] = var7;
            ((int[])((int[])var16[1]))[2] = var8;
            var16[3] = var9;
            var16[2] = var15;
            if(var2 != -100) {
               u = 31;
            }

            il.a(var3, var16, true, jl.b);
            return var16;
         }
      }
   }

}
