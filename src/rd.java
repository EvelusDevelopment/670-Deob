import jagdx.IDirect3DDevice;
import java.awt.Color;

final class rd extends lm {

   static int t;
   static int s = -1;
   static int k;
   static int o;
   Object[] n;
   static boolean m = false;
   static int u;
   static int p;
   static int f_l;
   static Object[] j = sd.a(new Object[1], 19, (byte)125);
   static Object[] q = aqa.a(new Object[2], 63);
   static Color[] v = new Color[]{new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277)};
   static String[] r = new String[]{"en", "de", "fr", "pt", "nl"};


   public final String toString() {
      ++p;
      Object[] var2 = this.n;
      String var1;
      if(null != var2 && -4 != ~var2.length) {
         String var4 = var2[5].toString() + " " + (String)var2[4];
         if(var2[3] != null && !"".equals(var2[3])) {
            var4 = var4 + " : " + (String)var2[3];
         }

         var1 = var4;
         if(client.f_vb == 0) {
            return var1;
         }
      }

      var1 = wla.a((int)-120, var2);
      return var1;
   }

   static final void a(Object[] var0, byte var1) {
      ++k;
      ((int[])((int[])var0[1]))[6] = 0;
      int var2 = -95 % ((-78 - var1) / 33);
      ((int[])((int[])var0[1]))[10] = 0;
   }

   static final void a(Object[] var0, int var1) {
      int var2 = 73 % ((var1 - 20) / 37);
      if(((boolean[])((boolean[])var0[63]))[16]) {
         IDirect3DDevice.a(((long[])((long[])var0[50]))[5], 137, ((boolean[])((boolean[])var0[63]))[15] && !((boolean[])((boolean[])var0[63]))[2]);
      }

      ++f_l;
   }

   static final void a(int var0) {
      ++u;
      if(jj.z != -1 && ~nta.e != 0) {
         int var1 = ((-ka.n + sf.b) * mg.a >> 16) + ka.n;
         mg.a += var1;
         if('\uffff' > mg.a) {
            qp.c = false;
            uja.f = false;
         } else {
            mg.a = '\uffff';
            if(!qp.c) {
               uja.f = true;
            } else {
               uja.f = false;
            }

            qp.c = true;
         }

         float var2 = (float)mg.a / 65535.0F;
         float[] var3 = new float[3];
         int var4 = 2 * wha.j;

         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         for(int var5 = 0; var5 < 3; ++var5) {
            var6 = rq.a[jj.z][var4][var5] * 3;
            var7 = rq.a[jj.z][var4 + 1][var5] * 3;
            var8 = 3 * (rq.a[jj.z][var4 + 2][var5] - (rq.a[jj.z][3 + var4][var5] + -rq.a[jj.z][2 + var4][var5]));
            var9 = rq.a[jj.z][var4][var5];
            var10 = var7 + -var6;
            var11 = var8 + (var6 - 2 * var7);
            var12 = -var8 + (rq.a[jj.z][var4 + 2][var5] - (var9 + -var7));
            var3[var5] = (((float)var12 * var2 + (float)var11) * var2 + (float)var10) * var2 + (float)var9;
         }

         woa.M = (int)var3[0] - 512 * rs.f;
         qt.e = -1 * (int)var3[1];
         pta.f = -(512 * qm.d) + (int)var3[2];
         float[] var15 = new float[3];
         var6 = 2 * wb.f;

         for(var7 = 0; 3 > var7; ++var7) {
            var8 = 3 * rq.a[nta.e][var6][var7];
            var9 = rq.a[nta.e][var6 + 1][var7] * 3;
            var10 = 3 * (rq.a[nta.e][var6 + 2][var7] + -rq.a[nta.e][var6 + 3][var7] + rq.a[nta.e][2 + var6][var7]);
            var11 = rq.a[nta.e][var6][var7];
            var12 = -var8 + var9;
            int var13 = -(2 * var9) + var8 + var10;
            int var14 = var9 + -var11 + rq.a[nta.e][var6 + 2][var7] + -var10;
            var15[var7] = (float)var11 + ((float)var12 + ((float)var13 + var2 * (float)var14) * var2) * var2;
         }

         float var16 = -var3[0] + var15[0];
         float var17 = -1.0F * (var15[1] - var3[1]);
         float var18 = -var3[2] + var15[2];
         double var19 = Math.sqrt((double)(var16 * var16 + var18 * var18));
         qaa.r = (int)(Math.atan2((double)var17, var19) * 2607.5945876176133D) & 16383;
         cp.a = 16383 & (int)(2607.5945876176133D * -Math.atan2((double)var16, (double)var18));
         kk.f_l = rq.a[jj.z][var4][3] + ((rq.a[jj.z][var0 + var4][3] - rq.a[jj.z][var4][3]) * mg.a >> 16);
      }
   }

   rd(Object[] var1) {
      this.n = var1;
   }

   final String b(boolean var1) {
      ++o;
      if(!var1) {
         this.b(((boolean[])((boolean[])q[0]))[0]);
      }

      return super.toString();
   }

   static final int a(int var0, Object[] var1) {
      ++t;
      if(lq.b(true, var1) == null) {
         return var1[11] == null?0:pf.a(true, (Object[])((Object[])var1[11]));
      } else {
         if(var0 != 100) {
            q = (Object[])null;
         }

         return 100;
      }
   }

}
