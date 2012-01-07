import jagdx.IDirect3DDevice;
import jaggl.OpenGL;

final class gha {

   static int d;
   static Object[] c = ura.a(-76, new Object[2]);
   static int f;
   static int h;
   static byte[][] a = new byte[50][];
   static int e;
   static int f_i;
   static int g;
   static int b;


   static final Object[] a(byte var0, Object[] var1) {
      ++b;
      if(null == var1[1]) {
         var1[1] = new int[2];
      }

      if(var0 <= 119) {
         a((Object[])((Object[])var1[12]), true);
      }

      return var1;
   }

   static final void a(Object[] var0, boolean var1) {
      if(var1) {
         ++d;
         if(0L == ((long[])((long[])var0[50]))[1] && eb.m != ((Object[][])((Object[][])var0[64]))[((int[])((int[])var0[1]))[7]]) {
            long var2;
            int var4;
            Object[] var6;
            float[] var7;
            if(tka.q == ((Object[][])((Object[][])var0[64]))[((int[])((int[])var0[1]))[7]]) {
               var2 = ((long[])((long[])var0[50]))[5];
               var4 = 16 + ((int[])((int[])var0[1]))[7];
               var6 = ((Object[][])((Object[][])var0[59]))[((int[])((int[])var0[1]))[7]];
               var7 = (float[])((float[])var0[86]);
               var7[3] = 0.0F;
               var7[4] = ((float[])((float[])var6[0]))[4];
               var7[7] = 0.0F;
               var7[10] = ((float[])((float[])var6[0]))[14];
               var7[8] = ((float[])((float[])var6[0]))[12];
               var7[5] = ((float[])((float[])var6[0]))[5];
               var7[9] = ((float[])((float[])var6[0]))[13];
               var7[2] = 0.0F;
               var7[6] = 0.0F;
               var7[1] = ((float[])((float[])var6[0]))[1];
               var7[0] = ((float[])((float[])var6[0]))[0];
               var7[11] = 0.0F;
               if(null != var0 && var0.length == 20) {
                  return;
               }

               var7[13] = 0.0F;
               var7[15] = 1.0F;
               var7[12] = 0.0F;
               var7[14] = 0.0F;
               IDirect3DDevice.SetTransform(var2, var4, var7);
            } else {
               var2 = ((long[])((long[])var0[50]))[5];
               var4 = 16 + ((int[])((int[])var0[1]))[7];
               var6 = ((Object[][])((Object[][])var0[59]))[((int[])((int[])var0[1]))[7]];
               var7 = (float[])((float[])var0[86]);
               System.arraycopy(var6[0], 0, var7, 0, 16);
               IDirect3DDevice.SetTransform(var2, var4, var7);
            }

            int var8 = pa.b(-96, ((Object[][])((Object[][])var0[64]))[((int[])((int[])var0[1]))[7]]);
            if(~var8 != ~((int[])((int[])var0[81]))[((int[])((int[])var0[1]))[7]]) {
               IDirect3DDevice.SetTextureStageState(((long[])((long[])var0[50]))[5], ((int[])((int[])var0[1]))[7], 24, var8);
               ((int[])((int[])var0[81]))[((int[])((int[])var0[1]))[7]] = var8;
            }
         } else {
            IDirect3DDevice.SetTextureStageState(((long[])((long[])var0[50]))[5], ((int[])((int[])var0[1]))[7], 24, 0);
            ((int[])((int[])var0[81]))[((int[])((int[])var0[1]))[7]] = 0;
         }

      }
   }

   static final void a(Object[] var0, int var1, boolean var2) {
      if(!var2) {
         a(new Object[2], 10, ((boolean[])((boolean[])((Object[])((Object[])c[1]))[36]))[9]);
      }

      ++f;
      Object[] var3 = ((Object[][])((Object[][])var0[4]))[var1];
      if(var3 == null) {
         OpenGL.glFramebufferRenderbufferEXT('\u8d40', var1 + '\u8ce0', '\u8d41', 0);
      } else {
         oo.a((byte)-124, '\u8ce0' + var1, var3);
      }

   }

   static final void a(boolean var0) {
      ++h;

      for(int var1 = 0; ct.e > var1; ++var1) {
         Object[] var2 = Class_a.c[var1];
         boolean var3 = false;
         int var4;
         if(null == var2[6]) {
            --((int[])((int[])var2[1]))[5];
            if(((int[])((int[])var2[1]))[5] < (!kc.a(-29946, var2)?-10:-1500)) {
               var3 = true;
            } else {
               if(1 == ((byte[])((byte[])var2[4]))[0] && null == var2[2]) {
                  var2[2] = nka.a(ij.e, ((int[])((int[])var2[1]))[0], 0);
                  if(null == var2[2]) {
                     continue;
                  }

                  ((int[])((int[])var2[1]))[5] += ((nka)var2[2]).c();
               } else if(kc.a(-29946, var2) && (var2[0] == null || null == var2[3])) {
                  if(null == var2[0]) {
                     var2[0] = pr.a(bqa.h, ((int[])((int[])var2[1]))[0]);
                  }

                  if(null == var2[0]) {
                     continue;
                  }

                  if(null == var2[3]) {
                     var2[3] = ((pr)var2[0]).a(new int[]{22050});
                     if(var2[3] == null) {
                        continue;
                     }
                  }
               }

               if(((int[])((int[])var2[1]))[5] < 0) {
                  int var5 = 8192;
                  if(((int[])((int[])var2[1]))[4] != 0) {
                     int var6 = 3 & ((int[])((int[])var2[1]))[4] >> 24;
                     if(((byte[])((byte[])uta.g[10]))[0] == var6) {
                        int var7 = (255 & ((int[])((int[])var2[1]))[4]) << 9;
                        int var8 = gn.a(uta.g, (byte)-102) << 8;
                        Object[] var9 = (Object[])((Object[])woa.a(5, uta.g)[1]);
                        int var10 = (((int[])((int[])var2[1]))[4] & 16740321) >> 16;
                        int var11 = -((int)((float[])((float[])var9[1]))[2]) + 256 + (var10 << 9) + var8;
                        int var12 = (((int[])((int[])var2[1]))[4] & '\uffed') >> 8;
                        int var13 = -((int)((float[])((float[])var9[1]))[1]) + (var12 << 9) + 256 + var8;
                        if(var2 != null && 4 == var2.length) {
                           lo.a((int)18);
                        }

                        int var14 = Math.abs(var11) + Math.abs(var13) - 512;
                        if(var7 < var14) {
                           ((int[])((int[])var2[1]))[5] = -99999;
                           continue;
                        }

                        if(var14 < 0) {
                           var14 = 0;
                        }

                        var4 = (-var14 + var7) * hba.a((Object[])((Object[])tu.d[33]), 0) * ((int[])((int[])var2[1]))[1] / var7 >> 2;
                        Object[] var15;
                        if(null != var2[5] && (var15 = (Object[])((Object[])var2[5])) != null && (var15.length == 17 || var15.length == 16 && ((boolean[])((boolean[])var15[8])).length == 7 || var15.length >= 24 || 20 == var15.length && ((int[])((int[])var15[12])).length == 7)) {
                           Object[] var16 = (Object[])((Object[])var2[5]);
                           short var24 = ((short[])((short[])var16[13]))[1];
                           short var25 = ((short[])((short[])var16[13]))[3];
                        }

                        if(var11 != 0 || var13 != 0) {
                           int var26 = -cp.a - ((int)(Math.atan2((double)var11, (double)var13) * 2607.5945876176133D) + 4096) & 16383;
                           if(8192 < var26) {
                              var26 = -var26 + 16384;
                           }

                           int var17;
                           if(var14 <= 0) {
                              var17 = 8192;
                           } else if(4096 > var14) {
                              var17 = 8192 + (-var14 + 8192) / 4096;
                           } else {
                              var17 = 16384;
                           }

                           var5 = (16384 + -var17 >> 1) + var26 * var17 / 8192;
                        }
                     } else {
                        var4 = 0;
                     }
                  } else {
                     var4 = ((int[])((int[])var2[1]))[1] * (((byte[])((byte[])var2[4]))[0] != 3?hba.a((Object[])((Object[])tu.d[12]), 0):hba.a((Object[])((Object[])tu.d[30]), 0)) >> 2;
                  }

                  if(var4 > 0) {
                     hb var22 = null;
                     if(1 == ((byte[])((byte[])var2[4]))[0]) {
                        var22 = ((nka)var2[2]).a().a(bd.b);
                     } else if(kc.a(-29946, var2)) {
                        var22 = (hb)var2[3];
                     }

                     on var23 = (on)(var2[6] = on.a(var22, ((int[])((int[])var2[1]))[2], var4, var5));
                     var23.e(((int[])((int[])var2[1]))[3] - 1);
                     ah.d.a((kp)var23);
                  }
               }
            }
         } else if(!((lm)var2[6]).a(var0)) {
            var3 = true;
         }

         if(var3) {
            --ct.e;

            for(var4 = var1; ct.e > var4; ++var4) {
               Class_a.c[var4] = Class_a.c[var4 + 1];
            }

            if(null != var2 && 1 == var2.length) {
               ah.d = (jua)((Object[])((Object[])br.j[6]))[7];
            }

            --var1;
         }
      }

      if(var0) {
         f_i = 116;
      }

      Object[] var18;
      if(qk.d && !vr.a((byte)-128)) {
         if(-1 != ~hba.a((Object[])((Object[])tu.d[26]), 0) && ~si.b != 0) {
            if(br.j != null) {
               var18 = vra.d;
               int var19 = si.b;
               int var20 = hba.a((Object[])((Object[])tu.d[26]), 0);
               Object[] var21 = br.j;
               uia.a(-17380, 0, false, var19, var18, var20);
               rua.a = var21;
            } else {
               uia.a(-17380, 0, false, si.b, vra.d, hba.a((Object[])((Object[])tu.d[26]), 0));
            }
         }

         br.j = null;
         qk.d = false;
      } else if(-1 != ~hba.a((Object[])((Object[])tu.d[26]), 0) && -1 != si.b && !vr.a((byte)-92)) {
         ++ana.a;
         var18 = ona.a((byte)117, (Object[])((Object[])lba.f[7]), wm.c);
         op.putInt((Object[])((Object[])var18[0]), si.b);
         lj.a(var18, 6, lba.f);
         si.b = -1;
      }

   }

   static final Object[] a(int var0, boolean var1, ta var2, int var3, Object[] var4) {
      ++e;
      Object[] var5 = mca.a(true, ((int[])((int[])var4[12]))[3], lja.d);
      aa var6;
      aa var7;
      if(!((boolean[])((boolean[])var4[8]))[4]) {
         if(((byte[])((byte[])var4[10]))[1] >= 3) {
            var7 = null;
         } else {
            var7 = bf.f_l[((byte[])((byte[])var4[10]))[1] + 1];
         }

         var6 = bf.f_l[((byte[])((byte[])var4[10]))[1]];
      } else {
         var6 = wd.a[((byte[])((byte[])var4[10]))[1]];
         var7 = bf.f_l[0];
      }

      Object[] var8 = (Object[])((Object[])woa.a(5, var4)[var3]);
      return lq.a(var7, var0, (int)((float[])((float[])var8[1]))[0], var1, 15790, (int)((float[])((float[])var8[1]))[1], (int)((float[])((float[])var8[1]))[2], var2, var6, (Object[])null, var5, ((byte[])((byte[])var4[10]))[3], ((byte[])((byte[])var4[10]))[2]);
   }

}
