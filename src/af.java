import jagdx.IUnknown;
import jaggl.OpenGL;
import java.nio.ByteBuffer;

final class af extends aa {

   static int v;
   static int q;
   static int E;
   static int G;
   static int D = 0;
   static int A;
   static int B;
   static int y;
   static int t = 0;
   static int I;
   private Object[] z;
   static int K;
   static int x;
   static int C;
   static int r;
   static int F;
   static int w;
   static int o;
   static int p;
   static int u;
   static Object[] s = ed.a(16, new Object[1], (byte)-111, 101);


   static final void c(Object[] var0, int var1) {
      ++r;
      var0[0] = sj.a(64, new Object[3], (byte)-64);
      if(var1 != 1) {
         a(-31, (Object[])((Object[])s[10]), -50, 33, 85);
      }

   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      ++o;
      Object[] var9 = this.z;
      if(-1 > ~((int[])((int[])var9[1]))[7]) {
         Object[] var12 = fea.a((Object[])((Object[])var9[12]), (byte)-43, ((int[])((int[])var9[1]))[1]);
         int var13 = 0;
         int var14 = 32767;
         int var15 = -32768;
         ByteBuffer var16 = (ByteBuffer)((Object[])((Object[])var9[12]))[57];
         var16.clear();

         for(int var17 = var5; var7 > var17; ++var17) {
            int var18 = ((aa)var9[2]).f_i * var17 + var4;

            for(int var19 = var4; var6 > var19; ++var19) {
               if(var8[var19 + -var4][var17 - var5]) {
                  short[] var20 = ((short[][])((short[][])var9[4]))[var18];
                  if(null != var20) {
                     if(null != var9 && 1 == var9.length && var9[0].equals(Boolean.valueOf(false))) {
                        this.a(-12, ((int[])((int[])this.z[0]))[21], 42, (boolean[][])null, true, 64);
                     }

                     for(int var21 = 0; var21 < var20.length; ++var21) {
                        int var22 = '\uffff' & var20[var21];
                        if(var22 > var15) {
                           var15 = var22;
                        }

                        var16.putShort((short)var22);
                        ++var13;
                        if(var22 < var14) {
                           var14 = var22;
                        }
                     }
                  }
               }

               ++var18;
            }

            if(null != var9 && 1 == var9.length) {
               return;
            }
         }

         nda.a(-18243, var12, var16.position(), 0, ((long[])((long[])((Object[])((Object[])var9[12]))[50]))[0]);
         if(var13 > 0) {
            bq.a(12391, (Object[])((Object[])var9[12]));
            Object[] var25 = (Object[])((Object[])((Object[])((Object[])var9[12]))[58]);
            hca.a(0, (Object[])((Object[])var9[11]), (Object[])((Object[])var9[12]), 0);
            hca.a(1, (Object[])((Object[])var9[14]), (Object[])((Object[])var9[12]), 0);
            ws.a(117, (Object[])((Object[])var9[18]), (Object[])((Object[])var9[12]));
            eca.a((Object[])((Object[])var9[12]), 24394, var12);
            rna.a((Object[])((Object[])var9[12]), bg.h, 37);
            Object[] var10;
            float var26 = (float)((ta)(null == (var10 = (Object[])((Object[])var9[12]))?null:var10[38])).e(30626).e();
            Object[] var11;
            float var28 = (float)((ta)(null == (var11 = (Object[])((Object[])var9[12]))?null:var11[38])).e(30626).d();
            Object[] var27 = im.a(new Object[2], (int)-16365);
            Object[] var30 = im.a(new Object[2], (int)-16365);
            cma.a(0.0F, 1.0F, 0.0F, 1.0F, (byte)88, 1.0F, 0.0F, var27, 0.0F, 0.0F, 0.0F);
            mq.a((float)var3 / ((float)((aa)var9[2]).g * 256.0F), (byte)-104, var30, 1.0F / (((float[])((float[])var9[23]))[0] - ((float[])((float[])var9[23]))[1]), (float)(-var3) / ((float)((aa)var9[2]).g * 256.0F));
            cq.a((byte)81, -((float)(var3 * var4) / 256.0F) + (float)var1, (float)(var7 * var3) / 256.0F + (float)var2, -((float[])((float[])var9[23]))[1] / (((float[])((float[])var9[23]))[0] - ((float[])((float[])var9[23]))[1]), var30);
            float var29 = 2.0F / var26;
            float var23 = 2.0F / var28;
            ((float[])((float[])var30[0]))[0] *= var29;
            ((float[])((float[])var30[0]))[5] *= var23;
            ((float[])((float[])var30[0]))[10] *= var29;
            ((float[])((float[])var30[0]))[8] *= var29;
            ((float[])((float[])var30[0]))[6] *= var29;
            ((float[])((float[])var30[0]))[3] *= var23;
            ((float[])((float[])var30[0]))[1] *= var23;
            ((float[])((float[])var30[0]))[11] *= var23;
            if(var25 != null && var25.length == 10) {
               ((boolean[])((boolean[])this.z[14]))[3] = ((boolean[])((boolean[])this.z[0]))[7];
            }

            ((float[])((float[])var30[0]))[4] *= 1.0F;
            ((float[])((float[])var30[0]))[2] *= 1.0F;
            ((float[])((float[])var30[0]))[7] *= 1.0F;
            ((float[])((float[])var30[0]))[9] *= 1.0F;
            if(null != var25 && (-34 == ~var25.length && var25[0].equals(Integer.valueOf(1)) || var25.length == 1)) {
               this.a(-113, -28, 82, ((int[])((int[])this.z[5]))[0], -95, 26, 22, (boolean[][])null);
            }

            cq.a((byte)81, -1.0F, -1.0F, 0.0F, var30);
            Class_v.a(var27, var30, (Object[])((Object[])((Object[])((Object[])var9[12]))[6]), (byte)95);
            aqa.a(true, (Object[])((Object[])((Object[])((Object[])var9[12]))[6]), (Object[])((Object[])((Object[])((Object[])var9[12]))[42]));
            sn.a((Object[])((Object[])((Object[])((Object[])var9[12]))[42]), (Object[])((Object[])var9[12]), 7);
            qba.a(fma.f_wb, (byte)99, var25);
            aha.a(0.0F, 0.0F, 0.0F, 0.0F, (Object[])((Object[])var25[12]), (byte)-74);
            Class_cs.a(0.0F, 0.0F, 0.0F, (Object[])((Object[])var25[3]), (byte)125);
            aha.a(0.0F, 0.0F, 0.0F, 0.0F, (Object[])((Object[])var25[10]), (byte)-74);
            Class_cs.a(0.0F, 0.0F, 0.0F, (Object[])((Object[])var25[15]), (byte)125);
            var25[6] = ((Object[])((Object[])var9[12]))[37];
            Class_ds.a((Object[])((Object[])var25[9]), (byte)97);
            ((int[])((int[])var25[1]))[2] = -var14 + var15 + 1;
            ((int[])((int[])var25[1]))[0] = 0;
            ((int[])((int[])var25[1]))[1] = var14;
            ((int[])((int[])var25[1]))[3] = var13 / 3;
            dsa.a(false, var25, (byte)-61);
         }
      }

   }

   static final void a(Object[] var0, byte var1, int var2) {
      ++x;
      synchronized(var0) {
         int var4 = 0;

         for(int var5 = -121 % ((var1 + 49) / 41); var4 < ((int[])((int[])var0[1]))[40]; ++var4) {
            IUnknown.Release(((long[])((long[])var0[74]))[var4]);
         }

         ((int[])((int[])var0[1]))[40] = 0;
         ws.a(-118, var2, var0);
         if(null == var0 || var0.length != 20 || !var0[14].equals(Integer.valueOf(2))) {
            ;
         }
      }
   }

   final void a(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Object[] var11, boolean var12) {
      dha.a(var2, var4, var10, var3, var11, var6, var9, var5, var8, 29603, var7, var12, this.z, var1);
      ++u;
   }

   final void a(int var1, int var2) {
      ++q;
   }

   af(Object[] var1, int var2, int var3, int var4, int[][] var5) {
      super(var2, var3, var4, var5);
      this.z = var1;
   }

   final void ja(ya var1, int var2, int var3, int var4, int var5, boolean var6) {
      ++K;
      Object[] var7 = this.z;
      if(null != var7[16] && var1 != null) {
         int var8 = -(((int[])((int[])((Object[])((Object[])var7[12]))[1]))[27] * var3 >> 8) + var2 >> ((int[])((int[])((Object[])((Object[])var7[12]))[1]))[5];
         int var9 = -(var3 * ((int[])((int[])((Object[])((Object[])var7[12]))[1]))[6] >> 8) + var4 >> ((int[])((int[])((Object[])((Object[])var7[12]))[1]))[5];
         ne.a(var1, var8, (Object[])((Object[])var7[16]), true, var9);
      }

   }

   final void a(Object[] var1, int[] var2) {
      mt.a(var2, 10, this.z, var1);
      ++G;
   }

   final ya h(int var1, int var2, ya var3) {
      ++w;
      Object[] var5 = this.z;
      if(var5 != null && -2 == ~var5.length) {
         return null;
      } else {
         ya var4;
         if(-1 == ~(1 & ((byte[][])((byte[][])var5[7]))[var1][var2])) {
            var4 = null;
         } else {
            int var8;
            Object[] var9;
            label48: {
               var8 = ((aa)var5[2]).g >> ((int[])((int[])((Object[])((Object[])var5[12]))[1]))[5];
               bca var6;
               Object[] var10 = (var6 = (bca)var3) == null?null:var6.I;
               if(var10 != null) {
                  boolean var11 = ~((byte[])((byte[])var10[2])).length <= ~(var8 * var8);
                  if(var11) {
                     var9 = var10;
                     dia.a((byte)58, var10);
                     break label48;
                  }
               }

               Object[] var12 = new Object[3];
               if(null == var12[1]) {
                  var12[1] = new int[4];
               }

               var12[0] = ui.a((int)114, var12);
               var12[2] = new byte[var8 * var8];
               var9 = var12;
            }

            sm.a(var9, var8, var8, 6779, 0, 0);
            lta.a(var2, var1, -103, var5, var9);
            var4 = (ya)(null == var9?null:var9[0]);
         }

         return var4;
      }
   }

   static final void a(int var0, Object[] var1, int var2, int var3, int var4) {
      ++A;
      OpenGL.glTexEnvi(8960, '\u8580' + var4, var3);
      OpenGL.glTexEnvi(8960, var4 + '\u8590', var0);
      if(var2 != 30579) {
         a(-78, (Object[])null);
      }

   }

   final void a(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, Object[] var14, boolean var15) {
      ++C;
      Object[] var16 = this.z;
      int var17 = var10.length;
      int[] var18 = new int[var17 * 3];
      int[] var19 = new int[3 * var17];
      int[] var20 = new int[var17 * 3];
      int[] var21 = new int[3 * var17];
      int[] var22 = new int[var17 * 3];
      int[] var23 = new int[3 * var17];
      int[] var24 = var4 == null?null:new int[var17 * 3];
      int[] var25 = null == var6?null:new int[3 * var17];
      int var26 = 0;

      for(int var27 = 0; var27 < var17; ++var27) {
         int var28 = var7[var27];
         int var29 = var8[var27];
         if(var16 != null && 2 == var16.length && var16[1].equals(Integer.valueOf(2))) {
            return;
         }

         int var30 = var9[var27];
         var18[var26] = var3[var28];
         var19[var26] = var5[var28];
         var20[var26] = var10[var27];
         var22[var26] = var12[var27];
         var23[var26] = var13[var27];
         var21[var26] = null == var11?var10[var27]:var11[var27];
         if(var4 != null) {
            var24[var26] = var4[var28];
         }

         if(var6 != null) {
            var25[var26] = var6[var28];
         }

         ++var26;
         var18[var26] = var3[var29];
         var19[var26] = var5[var29];
         var20[var26] = var10[var27];
         var22[var26] = var12[var27];
         var23[var26] = var13[var27];
         var21[var26] = var11 == null?var10[var27]:var11[var27];
         if(null != var4) {
            var24[var26] = var4[var29];
         }

         if(null != var6) {
            var25[var26] = var6[var29];
         }

         ++var26;
         var18[var26] = var3[var30];
         var19[var26] = var5[var30];
         var20[var26] = var10[var27];
         var22[var26] = var12[var27];
         var23[var26] = var13[var27];
         var21[var26] = var11 != null?var11[var27]:var10[var27];
         if(var4 != null) {
            var24[var26] = var4[var30];
         }

         if(null != var6) {
            var25[var26] = var6[var30];
         }

         ++var26;
      }

      dha.a(var2, var24, var23, var18, var14, var25, var22, var19, var21, 29603, var20, var15, var16, var1);
   }

   static final void a(int var0, Object[] var1) {
      ++v;
      if(var1[var0] == null) {
         var1[0] = new int[6];
      }

   }

   final boolean a(ya var1, int var2, int var3, int var4, int var5, boolean var6) {
      ++E;
      Object[] var8 = this.z;
      boolean var7;
      if(null == var8[16] || var1 == null) {
         var7 = false;
         if(client.f_vb == 0) {
            return var7;
         }
      }

      int var9 = var2 + -(var3 * ((int[])((int[])((Object[])((Object[])var8[12]))[1]))[27] >> 8) >> ((int[])((int[])((Object[])((Object[])var8[12]))[1]))[5];
      int var10 = var4 - (((int[])((int[])((Object[])((Object[])var8[12]))[1]))[6] * var3 >> 8) >> ((int[])((int[])((Object[])((Object[])var8[12]))[1]))[5];
      var7 = ima.a(var1, var9, var10, (Object[])((Object[])var8[16]), (byte)-57);
      return var7;
   }

   final void l() {
      lka.a((byte)-56, this.z);
      ++y;
   }

   final void a(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      ++p;
      Object[] var7 = this.z;
      if(var7[3] != null) {
         int var14 = 1 + var3 + var3;
         var14 *= var14;
         if(~var14 < ~iq.c.length) {
            iq.c = new int[var14];
         }

         int var15 = var1 - var3;
         int var16 = var15;
         if(0 > var15) {
            var15 = 0;
         }

         int var17 = var2 + -var3;
         int var18 = var17;
         if(var17 < 0) {
            var17 = 0;
         }

         int var19 = var1 + var3;
         if(~var19 < ~(((aa)var7[2]).f_i - 1)) {
            var19 = -1 + ((aa)var7[2]).f_i;
         }

         int var20 = var2 + var3;
         ur.f = 0;
         if(~var20 < ~(((aa)var7[2]).h - 1)) {
            var20 = -1 + ((aa)var7[2]).h;
         }

         for(int var21 = var15; var19 >= var21; ++var21) {
            boolean[] var22 = var4[-var16 + var21];

            for(int var23 = var17; var23 <= var20; ++var23) {
               if(var22[-var18 + var23]) {
                  iq.c[ur.f++] = ((aa)var7[2]).f_i * var23 + var21;
               }
            }

            if(var7 != null && (-9 == ~var7.length || var7.length == 7 && var7[4].equals(Integer.valueOf(2)))) {
               this.l();
            }
         }

         ByteBuffer var45 = (ByteBuffer)((Object[])((Object[])var7[12]))[57];
         var45.clear();

         Object[] var46;
         int var44;
         for(var44 = 0; ~var44 > ~((Object[])((Object[])var7[3])).length; ++var44) {
            cn var8;
            var46 = null != (var8 = (cn)((lm[])((lm[])var7[3]))[var44])?var8.j:null;
            bea.a(true, ur.f, var46, iq.c);
         }

         var44 = var45.position();
         if(var44 != 0) {
            var46 = fea.a((Object[])((Object[])var7[12]), (byte)-72, var44 / 2);
            nda.a(-18243, var46, var44, 0, ((long[])((long[])((Object[])((Object[])var7[12]))[50]))[0]);
            bq.a(12391, (Object[])((Object[])var7[12]));
            Object[] var24 = (Object[])((Object[])((Object[])((Object[])var7[12]))[58]);
            hca.a(0, (Object[])((Object[])var7[11]), (Object[])((Object[])var7[12]), 0);
            eca.a((Object[])((Object[])var7[12]), 24394, var46);
            qba.a(fma.f_wb, (byte)-2, var24);
            if(((int[])((int[])((Object[])((Object[])var7[12]))[1]))[4] > 0) {
               aha.a(0.0F, -((float[])((float[])((Object[])((Object[])var7[12]))[0]))[13], 0.0F, 1.0F, (Object[])((Object[])var24[12]), (byte)-74);
               Class_cs.a((float)(255 & ((int[])((int[])((Object[])((Object[])var7[12]))[1]))[15] >> 0) / 255.0F, (float)(255 & ((int[])((int[])((Object[])((Object[])var7[12]))[1]))[15] >> 16) / 255.0F, (float)((((int[])((int[])((Object[])((Object[])var7[12]))[1]))[15] & '\uff39') >> 8) / 255.0F, (Object[])((Object[])var24[3]), (byte)125);
               sea.a((Object[])((Object[])((Object[])((Object[])var7[12]))[28]), (Object[])((Object[])((Object[])((Object[])var7[12]))[42]), (byte)93);
               qp.a((int)4, (Object[])((Object[])((Object[])((Object[])var7[12]))[42]));
               psa.a(true, (Object[])((Object[])var24[12]), (Object[])((Object[])((Object[])((Object[])var7[12]))[42]));
               rk.a((Object[])((Object[])var24[12]), 1.0F / (-((float[])((float[])((Object[])((Object[])var7[12]))[0]))[13] + ((float[])((float[])((Object[])((Object[])var7[12]))[0]))[16]), (byte)126);
            } else {
               aha.a(0.0F, 0.0F, 0.0F, 0.0F, (Object[])((Object[])var24[12]), (byte)-74);
               Class_cs.a(0.0F, 0.0F, 0.0F, (Object[])((Object[])var24[3]), (byte)125);
            }

            int var25;
            Object[] var27;
            int var26;
            Object[] var29;
            if((((int[])((int[])var7[1]))[6] & 55) != 0) {
               Class_cs.a(((float[])((float[])((Object[])((Object[])var7[12]))[53]))[2], ((float[])((float[])((Object[])((Object[])var7[12]))[53]))[0], ((float[])((float[])((Object[])((Object[])var7[12]))[53]))[1], (Object[])((Object[])var24[16]), (byte)125);
               if(null != var7 && 22 == var7.length && var7[15].equals(Integer.valueOf(2))) {
                  this.h(-108, ((int[])((int[])this.z[22]))[5], (ya)null);
               }

               Class_cs.a(((float[])((float[])((Object[])((Object[])var7[12]))[0]))[8] * ((float[])((float[])((Object[])((Object[])var7[12]))[0]))[3], ((float[])((float[])((Object[])((Object[])var7[12]))[0]))[8] * ((float[])((float[])((Object[])((Object[])var7[12]))[0]))[11], ((float[])((float[])((Object[])((Object[])var7[12]))[0]))[8] * ((float[])((float[])((Object[])((Object[])var7[12]))[0]))[2], (Object[])((Object[])var24[11]), (byte)125);
               Class_cs.a(((float[])((float[])((Object[])((Object[])var7[12]))[0]))[3] * -((float[])((float[])((Object[])((Object[])var7[12]))[0]))[0], -((float[])((float[])((Object[])((Object[])var7[12]))[0]))[0] * ((float[])((float[])((Object[])((Object[])var7[12]))[0]))[11], ((float[])((float[])((Object[])((Object[])var7[12]))[0]))[2] * -((float[])((float[])((Object[])((Object[])var7[12]))[0]))[0], (Object[])((Object[])var24[13]), (byte)125);
               Class_cs.a(((float[])((float[])((Object[])((Object[])var7[12]))[0]))[3] * ((float[])((float[])((Object[])((Object[])var7[12]))[0]))[17], ((float[])((float[])((Object[])((Object[])var7[12]))[0]))[11] * ((float[])((float[])((Object[])((Object[])var7[12]))[0]))[17], ((float[])((float[])((Object[])((Object[])var7[12]))[0]))[2] * ((float[])((float[])((Object[])((Object[])var7[12]))[0]))[17], (Object[])((Object[])var24[14]), (byte)125);
               var25 = 0;

               for(var26 = 0; var26 < ((Object[])((Object[])var7[3])).length; ++var26) {
                  cn var11;
                  var27 = null != (var11 = (cn)((lm[])((lm[])var7[3]))[var26])?var11.j:null;
                  if(0 < ((int[])((int[])var27[1]))[3]) {
                     if(((boolean[])((boolean[])((Object[])((Object[])var7[12]))[63]))[11]) {
                        Class_is.a(-6991, 0, (Object[])((Object[])var7[12]), (Object[])((Object[])var27[9]));
                        aha.a(1.0F / (float)((int[])((int[])((Object[])((Object[])var27[9]))[0]))[5], 0.15F + 256.0F / (float)((int[])((int[])((Object[])((Object[])var27[9]))[0]))[5], 0.0F, 0.0F, (Object[])((Object[])var24[10]), (byte)-74);
                        Class_cs.a((float)(255 & ((int[])((int[])((Object[])((Object[])var27[9]))[0]))[1] >> 0) / 255.0F, (float)((16735080 & ((int[])((int[])((Object[])((Object[])var27[9]))[0]))[1]) >> 16) / 255.0F, (float)(((int[])((int[])((Object[])((Object[])var27[9]))[0]))[1] >> 8 & 255) / 255.0F, (Object[])((Object[])var24[15]), (byte)125);
                     } else {
                        aha.a(0.0F, 0.0F, 0.0F, 0.0F, (Object[])((Object[])var24[10]), (byte)-74);
                        Class_cs.a(0.0F, 0.0F, 0.0F, (Object[])((Object[])var24[15]), (byte)125);
                     }

                     byte var28 = 11;
                     if(var46 != null && (var46.length == 24 && var46[8].equals(Integer.valueOf(0)) || -6 == ~var46.length && var46[3].equals(Integer.valueOf(0)) || var46.length == 10)) {
                        return;
                     }

                     if(~((int[])((int[])var27[1]))[2] == 0) {
                        var24[6] = ((Object[])((Object[])var7[12]))[37];
                     } else {
                        Object[] var12;
                        var29 = ((ta)((var12 = (Object[])((Object[])var7[12])) != null?var12[38]:null)).k.a(((int[])((int[])var27[1]))[2], (byte)61);
                        var28 = ((byte[])((byte[])var29[0]))[4];
                        var24[6] = oea.a((Object[])((Object[])((Object[])((Object[])var7[12]))[43]), ((int[])((int[])var27[1]))[2], false);
                     }

                     hca.a(1, (Object[])((Object[])var27[7]), (Object[])((Object[])var7[12]), 0);
                     ws.a(110, (Object[])((Object[])var7[18]), (Object[])((Object[])var7[12]));
                     vt.a(1.0F / ((float[])((float[])var27[4]))[0], (byte)-100, (Object[])((Object[])var24[9]), 1.0F / ((float[])((float[])var27[4]))[0], 1.0F, 1.0F);
                     ((int[])((int[])var24[1]))[0] = var25;
                     ((int[])((int[])var24[1]))[2] = -((int[])((int[])var27[1]))[0] + ((int[])((int[])var27[1]))[1] + 1;
                     ((int[])((int[])var24[1]))[3] = ((int[])((int[])var27[1]))[3] / 3;
                     ((int[])((int[])var24[1]))[1] = ((int[])((int[])var27[1]))[0];
                     Object[] var34;
                     Object[] var32;
                     Object[] var33;
                     if(var28 != 9 && var28 != 8 && 2 != var28 && 4 != var28) {
                        if(1 == var28) {
                           Class_cs.a(((float[])((float[])((Object[])((Object[])((Object[])((Object[])var7[12]))[3]))[0]))[14], ((float[])((float[])((Object[])((Object[])((Object[])((Object[])var7[12]))[3]))[0]))[12], ((float[])((float[])((Object[])((Object[])((Object[])((Object[])var7[12]))[3]))[0]))[13], (Object[])((Object[])var24[4]), (byte)125);
                           if(null != var24 && 39 == var24.length) {
                              te.a(var24, false, 0);
                           } else {
                              if(null == var24 || 17 != var24.length) {
                                 throw new IllegalStateException();
                              }

                              wr.a(var24, 0, 0);
                           }
                        } else if(var28 == 7) {
                           Class_cs.a(((float[])((float[])((Object[])((Object[])((Object[])((Object[])var7[12]))[3]))[0]))[14], ((float[])((float[])((Object[])((Object[])((Object[])((Object[])var7[12]))[3]))[0]))[12], ((float[])((float[])((Object[])((Object[])((Object[])((Object[])var7[12]))[3]))[0]))[13], (Object[])((Object[])var24[4]), (byte)125);
                           Class_ds.a((Object[])((Object[])var24[0]), (byte)99);
                           Object[] var31 = (Object[])((Object[])var7[12]);
                           if(null != var31[25]) {
                              var34 = (Object[])((Object[])var31[25]);
                              if(null == var34) {
                                 throw new IllegalStateException();
                              }

                              var33 = uf.a(true, var34);
                              var32 = var33;
                           } else {
                              var32 = null;
                           }

                           var24[7] = var32;
                           if(null != var24 && -40 == ~var24.length) {
                              as.a(0, -110, var24);
                           } else {
                              if(var24 == null || -18 != ~var24.length) {
                                 throw new IllegalStateException();
                              }

                              eia.a(119, var24, 0);
                           }
                        } else {
                           ps.b(var24, 0, (byte)94);
                        }
                     } else if(!((boolean[])((boolean[])((Object[])((Object[])var7[12]))[63]))[16] && -1 != ~(8 & ((int[])((int[])var7[1]))[6])) {
                        var32 = (Object[])((Object[])((Object[])((Object[])var7[12]))[27]);
                        sea.a((Object[])((Object[])((Object[])((Object[])var7[12]))[51]), (Object[])((Object[])var32[40]), (byte)60);
                        vt.a(1.0F / ((float)((int[])((int[])((Object[])((Object[])var27[9]))[0]))[6] * ((float[])((float[])var27[4]))[0]), (byte)-101, (Object[])((Object[])var32[29]), 1.0F / (((float[])((float[])var27[4]))[0] * (float)((int[])((int[])((Object[])((Object[])var27[9]))[0]))[6]), 1.0F, 1.0F);
                        Class_cs.a(((float[])((float[])((Object[])((Object[])((Object[])((Object[])var7[12]))[3]))[0]))[14], ((float[])((float[])((Object[])((Object[])((Object[])((Object[])var7[12]))[3]))[0]))[12], ((float[])((float[])((Object[])((Object[])((Object[])((Object[])var7[12]))[3]))[0]))[13], (Object[])((Object[])var32[32]), (byte)125);
                        if(var46 != null && -5 == ~var46.length && var46[1].equals(Integer.valueOf(1))) {
                           this.a(-118, ((int[])((int[])this.z[0]))[17], (int[])((int[])this.z[15]), (int[])null, (int[])((int[])this.z[9]), (int[])((int[])this.z[10]), (int[])null, (int[])((int[])((Object[])((Object[])this.z[1]))[1]), (int[])null, (int[])null, (int[])((int[])((Object[])((Object[])this.z[23]))[1]), (int[])null, (int[])((int[])this.z[15]), (Object[])null, ((boolean[])((boolean[])((Object[])((Object[])this.z[2]))[1]))[3]);
                        }

                        Object[] var13;
                        var33 = ((ta)(null == (var13 = (Object[])((Object[])var7[12]))?null:var13[38])).k.a(((int[])((int[])var27[1]))[2], (byte)127);
                        ((int[])((int[])var32[1]))[1] = ((byte[])((byte[])var33[0]))[0];
                        ((int[])((int[])var32[1]))[5] = -((int[])((int[])var27[1]))[0] + ((int[])((int[])var27[1]))[1] + 1;
                        ((int[])((int[])var32[1]))[4] = ((int[])((int[])var27[1]))[3] / 3;
                        ((int[])((int[])var32[1]))[2] = ((int[])((int[])var27[1]))[0];
                        ((int[])((int[])var32[1]))[3] = var25;
                        var34 = (Object[])((Object[])var32[30]);
                        Object[] var35 = (Object[])((Object[])var24[10]);
                        aha.a(((float[])((float[])var35[0]))[3], ((float[])((float[])var35[0]))[0], ((float[])((float[])var35[0]))[2], ((float[])((float[])var35[0]))[1], var34, (byte)-74);
                        rna.a((Object[])((Object[])var24[15]), (Object[])((Object[])var32[31]), true);
                        ln.a(0, (Object[])((Object[])var24[12]), (Object[])((Object[])var32[25]));
                        rna.a((Object[])((Object[])var24[3]), (Object[])((Object[])var32[36]), true);
                        sma.b(0, var32);
                        an.a(vqa.a((Object[])((Object[])var32[17]), (byte)52), (Object[])((Object[])var32[17]), true);
                        if(var27 != null && var27.length == 8) {
                           this.z[1] = this.z[1];
                        }

                        rsa.a(-12423, (Object[])((Object[])var32[17]));
                        mn.a((Object[])((Object[])((Object[])((Object[])var32[39]))[2]), (Object[])((Object[])var32[17]), (byte)74, 0, (Object[])((Object[])var32[28]));
                        Object[] var36 = (Object[])((Object[])var32[17]);
                        Object[] var37 = (Object[])((Object[])var32[46]);
                        Object[] var39 = (Object[])((Object[])var32[0]);
                        Object[] var40;
                        if(var39[25] == null) {
                           var40 = null;
                        } else {
                           Object[] var42 = (Object[])((Object[])var39[25]);
                           if(null == var42) {
                              throw new IllegalStateException();
                           }

                           Object[] var41 = uf.a(true, var42);
                           var40 = var41;
                        }

                        mn.a(var40, var36, (byte)74, 1, var37);
                        vla.a((Object[])((Object[])var32[45]), true, (Object[])((Object[])var32[40]), (Object[])((Object[])var32[17]));
                        kaa.a((Object[])((Object[])var32[29]), (Object[])((Object[])var32[17]), 86, (Object[])((Object[])var32[33]));
                        int var50 = 1 << (((int[])((int[])var32[1]))[1] & 3);
                        fta.a((Object[])((Object[])var32[17]), (float)(((int[])((int[])((Object[])((Object[])var32[0]))[1]))[28] * var50 % '\u9c40') / 40000.0F, (Object[])((Object[])var32[41]), ((float[])((float[])((Object[])((Object[])var32[32]))[1]))[1], ((float[])((float[])((Object[])((Object[])var32[32]))[1]))[2], (byte)21, ((float[])((float[])((Object[])((Object[])var32[32]))[1]))[0]);
                        vm.a((Object[])((Object[])var32[26]), (Object[])((Object[])var32[17]), 29600, (Object[])((Object[])var32[22]));
                        vm.a((Object[])((Object[])var32[37]), (Object[])((Object[])var32[17]), 29600, (Object[])((Object[])var32[43]));
                        vm.a((Object[])((Object[])var32[35]), (Object[])((Object[])var32[17]), 29600, (Object[])((Object[])var32[27]));
                        vm.a((Object[])((Object[])var32[30]), (Object[])((Object[])var32[17]), 29600, (Object[])((Object[])var32[38]));
                        bfa.a((Object[])((Object[])var32[31]), -4678, (Object[])((Object[])var32[17]), (Object[])((Object[])var32[24]));
                        vm.a((Object[])((Object[])var32[25]), (Object[])((Object[])var32[17]), 29600, (Object[])((Object[])var32[23]));
                        bfa.a((Object[])((Object[])var32[36]), -4678, (Object[])((Object[])var32[17]), (Object[])((Object[])var32[42]));
                        vw.a(vqa.j, (Object[])((Object[])var32[0]), ((int[])((int[])var32[1]))[5], ((int[])((int[])var32[1]))[3], ((int[])((int[])var32[1]))[2], (byte)-119, ((int[])((int[])var32[1]))[4]);
                     } else {
                        ps.b(var24, 0, (byte)122);
                     }

                     var25 += ((int[])((int[])var27[1]))[3];
                  }
               }
            } else {
               if(null != var24 && -14 == ~var24.length) {
                  this.a(((int[])((int[])this.z[4]))[1], ((int[])((int[])((Object[])((Object[])this.z[6]))[19]))[4], (int[])null, (int[])((int[])this.z[4]), (int[])null, (int[])null, (int[])null, (int[])null, (int[])null, (int[])null, (int[])null, (int[])null, (int[])null, (Object[])null, false);
               }

               var25 = 0;

               for(var26 = 0; var26 < ((Object[])((Object[])var7[3])).length; ++var26) {
                  cn var9;
                  var27 = (var9 = (cn)((lm[])((lm[])var7[3]))[var26]) == null?null:var9.j;
                  if(((int[])((int[])var27[1]))[3] != 0) {
                     if(((boolean[])((boolean[])((Object[])((Object[])var7[12]))[63]))[11]) {
                        Class_is.a(-6991, 0, (Object[])((Object[])var7[12]), (Object[])((Object[])var27[9]));
                        aha.a(1.0F, (float)((int[])((int[])((Object[])((Object[])var27[9]))[0]))[0] / 255.0F * (float)((int[])((int[])((Object[])((Object[])var27[9]))[0]))[5] + (float)((int[])((int[])((Object[])((Object[])var7[12]))[1]))[35], 0.0F, 0.0F, (Object[])((Object[])var24[10]), (byte)-74);
                        rk.a((Object[])((Object[])var24[10]), 1.0F / (float)((int[])((int[])((Object[])((Object[])var27[9]))[0]))[5], (byte)46);
                        Class_cs.a((float)(((int[])((int[])((Object[])((Object[])var27[9]))[0]))[1] >> 0 & 255) / 255.0F, (float)((((int[])((int[])((Object[])((Object[])var27[9]))[0]))[1] & 16712501) >> 16) / 255.0F, (float)(('\uff05' & ((int[])((int[])((Object[])((Object[])var27[9]))[0]))[1]) >> 8) / 255.0F, (Object[])((Object[])var24[15]), (byte)125);
                     } else {
                        aha.a(0.0F, 0.0F, 0.0F, 0.0F, (Object[])((Object[])var24[10]), (byte)-74);
                        Class_cs.a(0.0F, 0.0F, 0.0F, (Object[])((Object[])var24[15]), (byte)125);
                     }

                     boolean var49 = false;
                     if(null != var27 && (2 == var27.length && var27[0].equals(Integer.valueOf(1)) && var27[0].equals(Boolean.valueOf(false)) || 1 == var27.length && var27[0].equals(Integer.valueOf(1)))) {
                        this.a((ya)null, 118, -123, ((int[])((int[])((Object[])((Object[])this.z[2]))[21]))[1], -14, ((boolean[])((boolean[])((Object[])((Object[])this.z[11]))[2]))[10]);
                     }

                     if(-1 == ((int[])((int[])var27[1]))[2]) {
                        var24[6] = ((Object[])((Object[])var7[12]))[37];
                     } else {
                        var24[6] = oea.a((Object[])((Object[])((Object[])((Object[])var7[12]))[43]), ((int[])((int[])var27[1]))[2], false);
                        Object[] var10;
                        var29 = ((ta)(null != (var10 = (Object[])((Object[])var7[12]))?var10[38]:null)).k.a(((int[])((int[])var27[1]))[2], (byte)52);
                        byte var48 = ((byte[])((byte[])var29[0]))[4];
                        boolean var30 = 1 != var48 && 7 != var48;
                        var49 = !var30;
                     }

                     hca.a(1, (Object[])((Object[])var27[7]), (Object[])((Object[])var7[12]), 0);
                     ws.a(110, (Object[])((Object[])var7[18]), (Object[])((Object[])var7[12]));
                     vt.a(1.0F / ((float[])((float[])var27[4]))[0], (byte)126, (Object[])((Object[])var24[9]), 1.0F / ((float[])((float[])var27[4]))[0], 1.0F, 1.0F);
                     ((int[])((int[])var24[1]))[3] = ((int[])((int[])var27[1]))[3] / 3;
                     ((int[])((int[])var24[1]))[0] = var25;
                     ((int[])((int[])var24[1]))[2] = 1 + -((int[])((int[])var27[1]))[0] + ((int[])((int[])var27[1]))[1];
                     ((int[])((int[])var24[1]))[1] = ((int[])((int[])var27[1]))[0];
                     dsa.a(var49, var24, (byte)-61);
                     var25 += ((int[])((int[])var27[1]))[3];
                  }
               }
            }

            if(var24 != null && (var24.length == 9 && var24[8].equals(Boolean.valueOf(false)) || var24.length == 1)) {
               this.a(((int[])((int[])((Object[])((Object[])this.z[9]))[0]))[1], 10, ((int[])((int[])((Object[])((Object[])this.z[0]))[1]))[1], (boolean[][])((boolean[][])this.z[20]), true, ((int[])((int[])this.z[6]))[3]);
            }

            if(var7[16] != null) {
               hca.a(0, (Object[])((Object[])var7[11]), (Object[])((Object[])var7[12]), 0);
               hca.a(1, (Object[])((Object[])var7[14]), (Object[])((Object[])var7[12]), 0);
               ws.a(121, (Object[])((Object[])var7[18]), (Object[])((Object[])var7[12]));
               Object[] var47 = (Object[])((Object[])((Object[])((Object[])var7[12]))[42]);
               Class_ds.a(var47, (byte)118);
               ((float[])((float[])var47[0]))[13] = -1.0F;
               qba.a(var47, (byte)-104, var24);
               tka.a(var1, var5, var24, (Object[])((Object[])var7[16]), -91, var4, var2, var3);
            }
         }
      }

   }

   static final void a(int var0, int var1, ta var2, int var3) {
      ++I;
      uia.d = new Object[var0][var3][];
      br.e = var2;
      if(null != oka.a) {
         gt.c = cw.a(oka.a[4], oka.a[1], oka.a[3], oka.a[5], oka.a[2], -83, oka.a[0]);
      }

      tma.d = null;
      if(var1 == 4) {
         pea.d = gs.a((byte)85, new Object[4]);
         if(uia.d != null) {
            for(int var4 = 0; uia.d.length > var4; ++var4) {
               for(int var5 = 0; ~var5 > ~uia.d[var4].length; ++var5) {
                  uia.d[var4][var5] = pea.d;
               }
            }
         }

      }
   }

   final void GA(ya var1, int var2, int var3, int var4, int var5, boolean var6) {
      ++F;
      Object[] var7 = this.z;
      if(null != var7[16] && null != var1) {
         int var8 = var2 + -(var3 * ((int[])((int[])((Object[])((Object[])var7[12]))[1]))[27] >> 8) >> ((int[])((int[])((Object[])((Object[])var7[12]))[1]))[5];
         int var9 = -(((int[])((int[])((Object[])((Object[])var7[12]))[1]))[6] * var3 >> 8) + var4 >> ((int[])((int[])((Object[])((Object[])var7[12]))[1]))[5];
         Object[] var10 = (Object[])((Object[])var7[16]);
         bca var13;
         Object[] var14 = (var13 = (bca)var1) == null?null:var13.I;
         int var12 = var9 + 1 + ((int[])((int[])var14[1]))[2];
         int var11 = var8 + ((int[])((int[])var14[1]))[3] + 1;
         int var15 = var11 + ((int[])((int[])var10[1]))[0] * var12;
         int var16 = 0;
         int var17 = ((int[])((int[])var14[1]))[1];
         int var18 = ((int[])((int[])var14[1]))[0];
         int var19 = ((int[])((int[])var10[1]))[0] - var18;
         int var21;
         if(var12 <= 0) {
            var21 = 1 + -var12;
            var15 += ((int[])((int[])var10[1]))[0] * var21;
            var12 = 1;
            var16 += var18 * var21;
            var17 -= var21;
         }

         int var20 = 0;
         if(~((int[])((int[])var10[1]))[2] >= ~(var12 + var17)) {
            var21 = -((int[])((int[])var10[1]))[2] + var12 + var17 + 1;
            var17 -= var21;
         }

         if(var11 <= 0) {
            var21 = 1 - var11;
            var16 += var21;
            var20 += var21;
            var11 = 1;
            var19 += var21;
            var15 += var21;
            var18 -= var21;
         }

         if(~(var18 + var11) <= ~((int[])((int[])var10[1]))[0]) {
            var21 = 1 + var18 + var11 + -((int[])((int[])var10[1]))[0];
            var19 += var21;
            var18 -= var21;
            var20 += var21;
         }

         if(var18 > 0 && 0 < var17) {
            byte[] var33 = (byte[])((byte[])var10[0]);
            byte[] var22 = (byte[])((byte[])var14[2]);
            int var23 = var16;
            int var24 = var15;
            int var27 = var19;
            int var28 = var20;
            int var29 = -(var18 >> 2);
            int var25 = -(var18 & 3);

            for(int var30 = -var17; 0 > var30; ++var30) {
               int var31;
               int var10001;
               for(var31 = var29; 0 > var31; ++var31) {
                  var10001 = var24++;
                  var33[var10001] -= var22[var23++];
                  var10001 = var24++;
                  var33[var10001] -= var22[var23++];
                  var10001 = var24++;
                  var33[var10001] -= var22[var23++];
                  var10001 = var24++;
                  var33[var10001] -= var22[var23++];
               }

               if(null != var14 && 25 == var14.length) {
                  this.a(((int[])((int[])this.z[15]))[0], -90, 14, -107, -30, ((int[])((int[])this.z[0]))[12], -97, (boolean[][])null);
               }

               for(var31 = var25; var31 < 0; ++var31) {
                  var10001 = var24++;
                  var33[var10001] -= var22[var23++];
               }

               var24 += var27;
               var23 += var28;
            }

            js.a(var11, var17, var18, var12, var10, -1);
         }
      }

   }

   final void DA(int var1, int var2, int var3) {
      ++B;
      kt.a(0, var1, var3, this.z, var2);
   }

}
