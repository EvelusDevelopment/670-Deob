import jagdx.IDirect3DDevice;
import jaggl.OpenGL;

final class ki {

   static int h;
   static int b = 0;
   static int[] f_i;
   static int a;
   static int d;
   static int g;
   static String[] f;
   static int e;
   static int c;


   static final void a(Object[] var0, byte var1) {
      ++c;
      if(var0 != null && 87 == var0.length) {
         if(((boolean[])((boolean[])var0[63]))[16]) {
            IDirect3DDevice.SetRenderState(((long[])((long[])var0[50]))[5], 60, ((int[])((int[])var0[1]))[31]);
         }

      } else if(null != var0 && 91 == var0.length) {
         ((float[])((float[])var0[76]))[0] = (float)(((int[])((int[])var0[1]))[31] & 16711680) / 1.671168E7F;
         ((float[])((float[])var0[76]))[3] = (float)(((int[])((int[])var0[1]))[31] >>> 24) / 255.0F;
         ((float[])((float[])var0[76]))[2] = (float)(((int[])((int[])var0[1]))[31] & 255) / 255.0F;
         ((float[])((float[])var0[76]))[1] = (float)(((int[])((int[])var0[1]))[31] & '\uff00') / 65280.0F;
         OpenGL.glTexEnvfv(8960, 8705, (float[])((float[])var0[76]), 0);
      } else {
         if(var1 <= 23) {
            a(103, (byte)71, (Object[])((Object[])var0[5]), (Class_s)null, ((int[])((int[])var0[1]))[4], ((int[])((int[])var0[0]))[2], 105);
         }

         throw new IllegalStateException();
      }
   }

   static final String a(int var0, byte[] var1, int var2, int var3) {
      int var4 = 63 / ((var2 - 27) / 63);
      ++d;
      char[] var5 = new char[var0];
      int var6 = 0;
      int var7 = var3;

      int var10;
      for(int var8 = var0 + var3; var8 > var7; var5[var6++] = (char)var10) {
         int var9 = 255 & var1[var7++];
         if(var9 >= 128) {
            if(var9 >= 192) {
               if(224 > var9) {
                  if(var8 > var7 && (192 & var1[var7]) == 128) {
                     var10 = 63 & var1[var7++] | (31 & var9) << 6;
                     if(128 > var10) {
                        var10 = '\ufffd';
                     }
                  } else {
                     var10 = '\ufffd';
                  }
               } else if(var9 >= 240) {
                  if(248 > var9) {
                     if(~var8 < ~(2 + var7) && 128 == (192 & var1[var7]) && (192 & var1[1 + var7]) == 128 && 128 == (192 & var1[var7 + 2])) {
                        var10 = 258048 & var1[var7++] << 12 | 1835008 & var9 << 18 | 4032 & var1[var7++] << 6 | 63 & var1[var7++];
                        if(var10 >= 65536 && var10 <= 1114111) {
                           var10 = '\ufffd';
                        } else {
                           var10 = '\ufffd';
                        }
                     } else {
                        var10 = '\ufffd';
                     }
                  } else {
                     var10 = '\ufffd';
                  }
               } else if(var7 + 1 < var8 && (var1[var7] & 192) == 128 && (var1[var7 + 1] & 192) == 128) {
                  var10 = '\uf000' & var9 << 12 | (63 & var1[var7++]) << 6 | var1[var7++] & 63;
                  if(var10 < 2048) {
                     var10 = '\ufffd';
                  }
               } else {
                  var10 = '\ufffd';
               }
            } else {
               var10 = '\ufffd';
            }
         } else if(var9 != 0) {
            var10 = var9;
         } else {
            var10 = '\ufffd';
         }
      }

      return new String(var5, 0, var6);
   }

   static final void a(Object[] var0, int var1, Object[] var2, Object[] var3, Object[] var4) {
      ++e;
      IDirect3DDevice.SetTransform(((long[])((long[])var4[50]))[5], 256, (float[])((float[])var3[var1]));
      IDirect3DDevice.SetTransform(((long[])((long[])var4[50]))[5], 2, (float[])((float[])var2[0]));
      IDirect3DDevice.SetTransform(((long[])((long[])var4[50]))[5], 3, (float[])((float[])var0[0]));
   }

   static final void a(int var0, Object[] var1) {
      ++h;
      ((int[])((int[])var1[1]))[0] = (7 + ((int[])((int[])var1[1]))[var0]) / 8;
   }

   static final boolean a(int var0, byte var1, Object[] var2) {
      ++a;
      if(var2[2] != null) {
         if(var2[4] == null) {
            jm.a((int)73, var2);
         }

         if(null == pm.a((long)var0, (Object[])((Object[])var2[4]), false)) {
            return false;
         } else {
            if(var1 != 106) {
               f_i = (int[])null;
            }

            return true;
         }
      } else {
         return false;
      }
   }

   static final void a(int var0, byte var1, Object[] var2, Class_s var3, int var4, int var5, int var6) {
      ++g;
      if(var1 < 86) {
         f_i = (int[])null;
      }

      el.a(94, (Object[])((Object[])var2[0]));
      Object[] var10 = (Object[])((Object[])((Object[])((Object[])var2[0]))[10]);
      var10[8] = var2[4];
      sca.a(1, var10, -1, 16);
      var6 += ((int[])((int[])var2[1]))[2];
      var5 += ((int[])((int[])var2[1]))[0];
      if(var2 != null && (var2.length == 14 && var2[6].equals(Integer.valueOf(1)) || var2.length == 5 && var2[3].equals(Integer.valueOf(1)) && var2[3].equals(Integer.valueOf(1)))) {
         gga.a(-122, (Object[])null, 12, true, true, -82, (Object[])null);
      }

      Object[] var7;
      float var11 = (float)((ta)(null != (var7 = (Object[])((Object[])var2[0]))?var7[38]:null)).e(30626).e();
      Object[] var8;
      float var12 = (float)((ta)((var8 = (Object[])((Object[])var2[0])) != null?var8[38]:null)).e(30626).d();
      vt.a(2.0F * (float)((int[])((int[])var2[1]))[4] / var11, (byte)-72, (Object[])((Object[])var10[4]), (float)((int[])((int[])var2[1]))[3] * 2.0F / var12, 1.0F, 1.0F);
      ((float[])((float[])((Object[])((Object[])var10[4]))[0]))[12] = ((float)var6 + ck.a(87, (Object[])((Object[])var2[0]))) * 2.0F / var11 - 1.0F;
      ((float[])((float[])((Object[])((Object[])var10[4]))[0]))[13] = -1.0F + 2.0F * ((float)var5 + ck.a(87, (Object[])((Object[])var2[0]))) / var12;
      ((float[])((float[])((Object[])((Object[])var10[4]))[0]))[14] = -1.0F;
      vt.a(wv.a((byte)-126, (float)((int[])((int[])var2[1]))[4], (Object[])((Object[])var2[4])), (byte)-31, (Object[])((Object[])var10[6]), rra.a((Object[])((Object[])var2[4]), (float)((int[])((int[])var2[1]))[3], (byte)-82), 1.0F, 1.0F);
      var10[3] = ((Object[])((Object[])var2[0]))[23];
      ((int[])((int[])var10[1]))[0] = 0;
      var10[2] = ((Object[])((Object[])var2[0]))[17];
      fg var9;
      Object[] var13 = (Object[])((Object[])(null != (var9 = (fg)var3)?var9.m:null)[0]);
      var10[7] = var13;
      vt.a(wv.a((byte)-126, (float)((int[])((int[])var2[1]))[4], var13), (byte)125, (Object[])((Object[])var10[5]), rra.a(var13, (float)((int[])((int[])var2[1]))[3], (byte)-85), 1.0F, 1.0F);
      ((float[])((float[])((Object[])((Object[])var10[5]))[0]))[12] = wv.a((byte)-126, (float)(var6 + -var4), var13);
      ((float[])((float[])((Object[])((Object[])var10[5]))[0]))[13] = rra.a(var13, (float)(-var0 + var5), (byte)-123);
      Class_a.a((byte)122, var10);
   }

}
