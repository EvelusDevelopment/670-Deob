import jaggl.OpenGL;

final class fg extends Class_s {

   static int s;
   static int q = 1000933;
   static int k;
   Object[] m;
   static int f_l;
   static int o;
   static int r;
   static int p;
   static int n;


   static final int a(int var0, int var1, int var2, int var3) {
      ++s;
      int var4 = -var2 + 255;
      if(var3 <= 13) {
         a(36, -12, 31, (byte)3);
      }

      var1 = (var2 * (var1 & 16711935) & -16711936 | var2 * ('\uff00' & var1) & 16711680) >>> 8;
      return var1 + ((var4 * (16711935 & var0) & -16711936 | 16711680 & ('\uff00' & var0) * var4) >>> 8);
   }

   static final int a(byte var0, Object[] var1) {
      if(var0 < 86) {
         return 74;
      } else {
         ++n;
         return ((int[])((int[])var1[1]))[0];
      }
   }

   fg(Object[] var1) {
      this.m = var1;
   }

   static final int b(Object[] var0, byte var1) {
      ++o;
      if(var0 == null) {
         if(var1 >= -49) {
            a(-28, -22, ((int[])((int[])((Object[])((Object[])var0[30]))[1]))[11], (int)-43);
         }

         throw new IllegalStateException();
      } else {
         int var2 = ((int[])((int[])var0[1]))[1];
         return var2;
      }
   }

   static final void d(int var0, Object[] var1) {
      ++p;
      ((int[])((int[])var1[1]))[0] += ++((int[])((int[])var1[1]))[var0];

      for(int var2 = 0; 256 > var2; ++var2) {
         int var3 = ((int[])((int[])var1[0]))[var2];
         if((var2 & 2) != 0) {
            if(0 != (var2 & 1)) {
               ((int[])((int[])var1[1]))[2] >>>= 16;
            } else {
               ((int[])((int[])var1[1]))[2] <<= 2;
            }
         } else if(-1 == ~(1 & var2)) {
            ((int[])((int[])var1[1]))[2] <<= 13;
         } else {
            ((int[])((int[])var1[1]))[2] >>>= 6;
         }

         ((int[])((int[])var1[1]))[2] += ((int[])((int[])var1[0]))[255 & 128 + var2];
         int var4;
         ((int[])((int[])var1[0]))[var2] = var4 = ((int[])((int[])var1[0]))[255 & var3 >> 2] + ((int[])((int[])var1[1]))[2] + ((int[])((int[])var1[1]))[0];
         ((int[])((int[])var1[2]))[var2] = ((int[])((int[])var1[1]))[0] = var3 + ((int[])((int[])var1[0]))[(261306 & var4) >> 8 >> 2];
      }

      if(null == var1 || var1.length != 12) {
         ;
      }
   }

   static final void a(int var0, int var1, int var2, byte var3) {
      ++r;
      int var8 = rs.f + var1;
      int var9 = var2 + qm.d;
      if(ju.g != null && 0 <= var1 && var2 >= 0 && rp.c > var1 && wpa.a > var2) {
         if(0 != qga.b((Object[])((Object[])tu.d[14]), 13687) || var0 == ((byte[])((byte[])uta.g[10]))[0]) {
            long var10 = (long)(var8 | var9 << 14 | var0 << 28);
            oga var4;
            Object[] var12 = (var4 = (oga)pm.a(var10, vg.e, false)) != null?var4.k:null;
            if(var12 == null) {
               ud.a(var0, var1, var2);
            } else {
               gn var5;
               Object[] var13 = (var5 = (gn)dda.a((Object[])((Object[])var12[0]), 2)) != null?var5.j:null;
               if(null == var13) {
                  ud.a(var0, var1, var2);
               } else {
                  if(var3 < 25) {
                     f_l = 56;
                  }

                  Object[] var14 = ud.a(var0, var1, var2);
                  Object[] var16;
                  if(var14 == null) {
                     var16 = new Object[16];
                     int var17 = var1 << 9;
                     int var18 = jp.o[var0].b(-119, var2, var1);
                     int var19 = var2 << 9;
                     wea.b(var16, -36);
                     ct.a(var16, true);
                     ((byte[])((byte[])var16[10]))[1] = (byte)var0;
                     ((byte[])((byte[])var16[10]))[0] = (byte)var0;
                     sra.a(var16, bl.a((byte)94, (float)var17, new Object[2], (float)var19, (float)var18), 1);
                     bma.a(false, var16);
                     toa.a(3, var16, 5029);
                     var14 = var16;
                  } else {
                     ((int[])((int[])var14[12]))[9] = -1;
                     ((int[])((int[])var14[12]))[6] = -1;
                  }

                  ((int[])((int[])var14[12]))[4] = ((int[])((int[])var13[1]))[0];
                  ((int[])((int[])var14[12]))[10] = ((int[])((int[])var13[1]))[1];

                  label105:
                  while(true) {
                     if(var12 != null && var12.length == 8) {
                        rea.a((Object[])null, (byte)-43, (byte[][])((byte[][])((Object[])((Object[])dra.g[0]))[1]));
                     }

                     gn var6;
                     Object[] var15 = null != (var6 = (gn)client.a((Object[])((Object[])var12[0]), -28280))?var6.j:null;
                     if(null == var15) {
                        break;
                     }

                     if(~((int[])((int[])var15[1]))[1] != ~((int[])((int[])var14[12]))[10]) {
                        ((int[])((int[])var14[12]))[7] = ((int[])((int[])var15[1]))[0];
                        ((int[])((int[])var14[12]))[6] = ((int[])((int[])var15[1]))[1];

                        while(true) {
                           gn var7;
                           var16 = null != (var7 = (gn)client.a((Object[])((Object[])var12[0]), -28280))?var7.j:null;
                           if(null == var16) {
                              break label105;
                           }

                           if(~((int[])((int[])var14[12]))[10] != ~((int[])((int[])var16[1]))[1] && ((int[])((int[])var16[1]))[1] != ((int[])((int[])var14[12]))[6]) {
                              ((int[])((int[])var14[12]))[5] = ((int[])((int[])var16[1]))[0];
                              ((int[])((int[])var14[12]))[9] = ((int[])((int[])var16[1]))[1];
                           }
                        }
                     }
                  }

                  int var20 = Class_ds.a(var0, (var1 << 9) + 256, (var2 << 9) + 256, (byte)122);
                  sra.a(var14, bl.a((byte)-108, (float)(var1 << 9), new Object[2], (float)(var2 << 9), (float)var20), 1);
                  ((byte[])((byte[])var14[10]))[0] = (byte)var0;
                  ((int[])((int[])var14[12]))[8] = 0;
                  ((byte[])((byte[])var14[10]))[1] = (byte)var0;
                  if(fr.a(var2, var1, (byte)51)) {
                     ++((byte[])((byte[])var14[10]))[1];
                  }

                  sn.a(var0, var1, var2, var20, var14);
                  if(null != var12 && -2 == ~var12.length) {
                     ((byte[])((byte[])fha.s[3]))[14] = ((byte[])((byte[])ira.f[0]))[4];
                  }

               }
            }
         }
      }
   }

   static final Object[] a(int[] var0, Object[] var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      ++k;
      Object[] var24;
      if(null != var1 && var1.length == 87) {
         var24 = ona.a(4, var1, var4, var0, var6, var5, new Object[10], var3, var7);
         return var24;
      } else if(var1 != null && var1.length == 91) {
         Object[] var10;
         if(!((boolean[])((boolean[])var1[63]))[23] && (!ol.a((byte)-105, var4) || !ol.a((byte)111, var5))) {
            if(((boolean[])((boolean[])var1[63]))[27]) {
               var10 = new Object[8];
               wma.a(var10, 5);
               bca.a((byte)104, vk.f, ah.f, var5 * var4, var10, var1, '\u84f5', false);
               ((int[])((int[])var10[1]))[4] = var4;
               ((int[])((int[])var10[1]))[3] = var5;
               ah.a((Object[])((Object[])var10[5]), var10, (byte)110);
               OpenGL.glPixelStorei(3314, var7);
               OpenGL.glTexImage2Di(((int[])((int[])var10[1]))[2], 0, 6408, ((int[])((int[])var10[1]))[4], ((int[])((int[])var10[1]))[3], 0, '\u80e1', ((int[])((int[])((Object[])((Object[])var10[5]))[1]))[40], var0, 4 * var6);
               OpenGL.glPixelStorei(3314, 0);
               var24 = var10;
            } else {
               Object[] var9 = new Object[11];
               if(var9 != null && -10 == ~var9.length) {
                  uk.a((Object[])null, false);
               }

               Object[] var11 = ah.f;
               Object[] var16 = vk.f;
               int var22 = fda.a(var4, (byte)81);
               Object[] var23 = om.a(120, var11, var9, var22, var1, fda.a(var5, (byte)81), var16);
               vs.a(var7, var5, var23, var0, 5, 0, var4, var6, 0);
               var24 = var23;
            }
         } else {
            var10 = new Object[11];
            esa.a(var10, 1);
            bca.a((byte)113, vk.f, ah.f, var5 * var4, var10, var1, 3553, var3);
            ((int[])((int[])var10[1]))[4] = var4;
            ((int[])((int[])var10[1]))[3] = var5;
            ah.a((Object[])((Object[])var10[5]), var10, (byte)85);
            if(var3 && var7 == 0 && 0 == var6) {
               jq.a(var10, ((int[])((int[])var10[1]))[2], 0, var0, var5, var4);
            } else {
               OpenGL.glPixelStorei(3314, var7);
               OpenGL.glTexImage2Di(((int[])((int[])var10[1]))[2], 0, 6408, ((int[])((int[])var10[1]))[4], ((int[])((int[])var10[1]))[3], 0, '\u80e1', ((int[])((int[])((Object[])((Object[])var10[5]))[1]))[40], var0, 4 * var6);
               OpenGL.glPixelStorei(3314, 0);
            }

            var24 = var10;
         }

         return var24;
      } else {
         int var8 = 83 % ((-60 - var2) / 38);
         throw new IllegalStateException();
      }
   }

}
