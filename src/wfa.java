import jagdx.D3DLIGHT;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexBuffer;
import java.awt.Dimension;

final class wfa {

   static int c;
   static int b;
   static int h;
   static int e;
   static cga[] d;
   static int a;
   static int f_i;
   static int g;
   static int k;
   static int j;
   static float f = 1.0F;


   static final boolean a(int var0, int var1, int var2, int var3, int[] var4, Object[] var5) {
      ++a;
      if(var5 != null && var5.length == 2 && var5[0].equals(Integer.valueOf(1))) {
         ila.a(-98, (byte)5, (int[])null, (Object[])null, -85);
      }

      wr var6;
      wr var7;
      for(Object[] var8 = (var6 = (wr)dda.a((Object[])((Object[])var5[3]), 2)) == null?null:var6.f_l; var8 != null; var8 = (var7 = (wr)client.a((Object[])((Object[])var5[3]), -28280)) != null?var7.f_l:null) {
         boolean var9;
         if(((int[])((int[])var8[1]))[7] == var0 && ((int[])((int[])var8[1]))[5] <= var1 && ~var1 >= ~((int[])((int[])var8[1]))[0] && ~var3 <= ~((int[])((int[])var8[1]))[3] && var3 <= ((int[])((int[])var8[1]))[1]) {
            var9 = true;
         } else {
            var9 = false;
         }

         if(var9) {
            bs.a(var1, (byte)33, var3, var8, var4);
            return true;
         }
      }

      if(var2 <= 30) {
         d = (cga[])null;
      }

      return false;
   }

   static final byte[] a(byte[] var0, boolean var1, Object[] var2) {
      if(!var1) {
         var2[0] = (Object)null;
      }

      ++j;
      if(null != var2[0]) {
         int var3 = (int)((long)((int[])((int[])var2[1]))[1] * (long)var0.length / (long)((int[])((int[])var2[1]))[0]) + 14;
         if(null != var2 && -6 == ~var2.length) {
            return null;
         }

         int[] var4 = new int[var3];
         int var5 = 0;
         int var6 = 0;

         int var7;
         for(var7 = 0; var0.length > var7; ++var7) {
            byte var8 = var0[var7];
            int[] var9 = ((int[][])((int[][])var2[0]))[var6];
            if(null != var2 && -4 == ~var2.length && var2[2].equals(Integer.valueOf(2)) && var2[2].equals(Boolean.valueOf(false))) {
               return null;
            }

            int var10;
            for(var10 = 0; 14 > var10; ++var10) {
               var4[var5 + var10] += var9[var10] * var8;
            }

            var6 += ((int[])((int[])var2[1]))[1];
            var10 = var6 / ((int[])((int[])var2[1]))[0];
            var5 += var10;
            var6 -= ((int[])((int[])var2[1]))[0] * var10;
         }

         var0 = new byte[var3];

         for(var7 = 0; var7 < var3; ++var7) {
            int var11 = var4[var7] + -32768 >> 16;
            if(var11 < -128) {
               var0[var7] = -128;
            } else if(127 >= var11) {
               var0[var7] = (byte)var11;
            } else {
               var0[var7] = 127;
            }
         }
      }

      return var0;
   }

   static final long a(int var0, Object[] var1, int var2, int var3) {
      if(var3 != 4) {
         ((long[])((long[])var1[15]))[12] = -117L;
      }

      ++h;
      return IDirect3DVertexBuffer.Lock(((long[])((long[])var1[4]))[0], var2, var0, !((boolean[])((boolean[])var1[2]))[0]?0:8192);
   }

   static final void a(int var0, int var1, boolean var2, int var3, ta var4, int var5, Object[] var6, Object[] var7) {
      ++g;
      if(null != var7 && var7.length == 16 && 3 == ((int[])((int[])var7[12])).length) {
         ie.a(var3, var5, var7, false, var2, var4, var6, var0);
      } else if(null != var7 && var7.length == 20 && 7 == ((int[])((int[])var7[12])).length) {
         vm.a(var0, var4, (byte)48, var5, var2, var3, var6, var7);
      } else if(null != var7 && (var7.length == 20 && ((int[])((int[])var7[12])).length == 3 && var7[14].equals(Integer.valueOf(0)) || var7.length == 18)) {
         throw new IllegalStateException();
      } else if(var7 != null && var7.length == 22) {
         ws.a(var6, var3, var7, var2, var0, (byte)-90, var5, var4);
      } else if(null != var7 && -44 == ~var7.length && ((int[])((int[])var7[12])).length == 46) {
         em.a(var6, false, var3, var2, var5, var4, var7, var0);
      } else if(null != var7 && var7.length == 16 && 11 == ((int[])((int[])var7[12])).length) {
         ij.a(var5, var3, (byte)-8, var4, var6, var7, var0, var2);
      } else if(null != var7 && 23 == var7.length) {
         ima.a(var4, var2, var0, var6, var5, var7, 2, var3);
      } else if(var7 != null && 17 == var7.length) {
         if(null != var6 && var6.length == 20 && ((int[])((int[])var6[12])).length == 4) {
            if(var7[16] != null && null != var6[19]) {
               ((ka)var7[16]).a((ka)var6[19], var3, var5, var0, var2);
            }
         } else if(null != var6 && var6.length == 17 && var7[16] != null && null != var6[16]) {
            ((ka)var7[16]).a((ka)var6[16], var3, var5, var0, var2);
         }

      } else if(var7 != null && var7.length == 24) {
         hka.a(var5, var3, var7, 1, var6, var4, var0, var2);
      } else if(null != var7 && 20 == var7.length && ((boolean[])((boolean[])var7[8])).length == 8) {
         if(null != var6 && -21 == ~var6.length && ((boolean[])((boolean[])var6[8])).length == 8) {
            if(null != var7[19] && null != var6[19]) {
               ((ka)var7[19]).a((ka)var6[19], var3, var5, var0, var2);
            }
         } else if(null != var6 && var6.length == 17 && null != var7[19] && var6[16] != null) {
            ((ka)var7[19]).a((ka)var6[16], var3, var5, var0, var2);
         }

      } else if(null != var7 && var7.length == 20 && -8 == ~((boolean[])((boolean[])var7[8])).length) {
         throw new IllegalStateException();
      } else {
         if(var1 != 1) {
            a(-119, (Object[])null);
         }

         if(var7 != null && var7.length == 43 && ((boolean[])((boolean[])var7[8])).length == 16) {
            throw new IllegalStateException();
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final lua a(int var0, Object[] var1, int var2) {
      ++e;
      Object[] var5 = new Object[4];
      if(var2 <= 65) {
         return (lua)null;
      } else {
         ada.c(var5, -22651);
         eo var7 = new eo(var5);
         ((int[])((int[])var5[1]))[0] = var0;
         var5[2] = var1;
         var5[0] = var7;
         return (lua)(null == var5?null:var5[0]);
      }
   }

   static final int a(int var0, byte var1, int var2) {
      ++k;
      if(~((int[])((int[])fk.j[1]))[5] == 0) {
         return 1;
      } else {
         if(var0 != bg.a(true, (Object[])((Object[])tu.d[5]))) {
            cf.a((byte)-90, true, var0, gj.a(dp.y, 92, gj.y));
            if(~var0 != ~bg.a(true, (Object[])((Object[])tu.d[5]))) {
               return -1;
            }
         }

         try {
            Dimension var3 = ru.d.getSize();
            npa.a(40, lna.g, gj.a(dp.y, -92, gj.y), true, fha.m, nsa.c);
            ii var4 = ii.a(dl.b, ((int[])((int[])fk.j[1]))[5], (int)0);
            long var5 = he.a(-119);
            lna.g.a();
            pfa.a(9, aha.e, (float)iba.b, 0.0F, 0.0F);
            lna.g.d(aha.e);
            Object[] var7 = lna.g.v();
            pq.a(512.0F, (float)var3.height, (float)var3.width, (float)(var3.height / 2), (float)(var3.width / 2), 512.0F, (float)gea.v, (float)qja.k, false, var7);
            lna.g.a(var7);
            lna.g.ka(1.0F);
            lna.g.FA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            ka var8 = lna.g.a(var4, 2048, 64, 64, 768);
            if(var1 <= 40) {
               a((byte[])null, true, (Object[])null);
            }

            int var9 = 0;

            label88:
            for(int var10 = 0; var10 < 500; ++var10) {
               if(var7 != null && (var7.length == 25 && var7[0].equals(Integer.valueOf(2)) && var7[0].equals(Integer.valueOf(2)) || var7.length == 9)) {
                  uua.a(false, -41, -6, 17, -24, -127);
               }

               lna.g.Z(3, 0);

               for(int var11 = 15; var11 >= 0; --var11) {
                  for(int var12 = 0; var11 >= var12; ++var12) {
                     pfa.a(9, nta.a, 0.0F, (float)(iia.n * (1 + var11)), (float)((int)(((float)var12 - (float)var11 / 2.0F) * (float)iia.n)));
                     var8.a(nta.a, (lpa)null, 0);
                     ++var9;
                     if((long)var2 <= he.a(-128) + -var5) {
                        break label88;
                     }
                  }

                  if(var7 != null && (8 == var7.length && var7[1].equals(Boolean.valueOf(false)) || var7.length == 13 || -9 == ~var7.length && var7[6].equals(Boolean.valueOf(false)) && var7[6].equals(Integer.valueOf(0)))) {
                     nua.h = 45;
                  }
               }
            }

            lna.g.t();
            long var14 = (long)(1000 * var9) / (-var5 + he.a(-107));
            lna.g.Z(3, 0);
            return (int)var14;
         } catch (Throwable var13) {
            var13.printStackTrace();
            return -1;
         }
      }
   }

   static final void a(int var0, Object[] var1) {
      ++b;
      if(null != var1 && var1.length == 87) {
         int var2;
         for(var2 = 0; ~var2 > ~((int[])((int[])var1[1]))[37]; ++var2) {
            Object[] var3 = ((Object[][])((Object[][])var1[30]))[var2];
            int var4 = var2 + 2;
            int var5 = gaa.a(var3, (byte)-69);
            float var6 = sba.a(0, var3) / 255.0F;
            D3DLIGHT.SetPosition(((long[])((long[])var1[50]))[4], (float)lba.a(var3, var0 ^ -13631), (float)sla.a(var3, false), (float)fn.a(var3, 31));
            D3DLIGHT.SetDiffuse(((long[])((long[])var1[50]))[4], (float)((16741637 & var5) >> 16) * var6, var6 * (float)(('\uffa0' & var5) >> 8), var6 * (float)(255 & var5), 0.0F);
            D3DLIGHT.SetAttenuation(((long[])((long[])var1[50]))[4], 0.0F, 0.0F, 1.0F / (float)(mc.a(false, var3) * mc.a(false, var3)));
            D3DLIGHT.SetRange(((long[])((long[])var1[50]))[4], (float)mc.a(false, var3));
            IDirect3DDevice.SetLight(((long[])((long[])var1[50]))[5], var4, ((long[])((long[])var1[50]))[4]);
            IDirect3DDevice.LightEnable(((long[])((long[])var1[50]))[5], var4, true);
            if(null != var1 && (34 == var1.length && var1[15].equals(Integer.valueOf(1)) || var1.length == 3 && var1[1].equals(Integer.valueOf(0)) || -3 == ~var1.length && var1[0].equals(Boolean.valueOf(false)))) {
               ((boolean[])((boolean[])((Object[])((Object[])ota.z[9]))[2]))[1] = ((boolean[])((boolean[])ota.z[0]))[0];
            }
         }

         while(((int[])((int[])var1[1]))[24] > var2) {
            IDirect3DDevice.LightEnable(((long[])((long[])var1[50]))[5], 2 + var2, false);
            ++var2;
         }

         if(var1 != null && var1.length == 2) {
            ao.a((Object[][])null, (Object[])null, false);
         }

      } else if(var0 == 20828) {
         if(var1 != null && var1.length == 91) {
            Class_a.b(var1, 0);
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final int a(Object[] var0, int var1) {
      ++c;
      return var1 != 3?-1:((int[])((int[])var0[1]))[3];
   }

}
