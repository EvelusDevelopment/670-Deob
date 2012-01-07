import jaggl.OpenGL;
import java.util.Date;

final class Class_b {

   static int e;
   static int b;
   static rp j;
   static int c;
   static int a;
   static ta f_i = null;
   static int d;
   static int h = 0;
   static int f;
   static int g;


   static final void a(Object[] var0, int var1) {
      ++g;
      if(var1 != 22775) {
         a(new Object[3], 85);
      }

      moa.a((byte)97, var0, (Object[])((Object[])var0[4]));
      if(!((boolean[])((boolean[])var0[3]))[1]) {
         OpenGL.glTexParameteri(((int[])((int[])var0[1]))[2], 10241, !((boolean[])((boolean[])var0[3]))[0]?9728:9984);
         OpenGL.glTexParameteri(((int[])((int[])var0[1]))[2], 10240, 9728);
      } else {
         OpenGL.glTexParameteri(((int[])((int[])var0[1]))[2], 10241, ((boolean[])((boolean[])var0[3]))[0]?9987:9729);
         OpenGL.glTexParameteri(((int[])((int[])var0[1]))[2], 10240, 9729);
      }

   }

   static final String a(long var0, boolean var2) {
      hp.e.setTime(new Date(var0));
      ++d;
      int var3 = hp.e.get(7);
      int var4 = hp.e.get(5);
      int var5 = hp.e.get(2);
      int var6 = hp.e.get(1);
      int var7 = hp.e.get(11);
      int var8 = hp.e.get(12);
      int var9 = hp.e.get(13);
      if(var2) {
         a(-7, (Object[])null, (za)null);
      }

      return tw.b[-1 + var3] + wu.o + " " + var4 / 10 + var4 % 10 + "-" + hl.g[0][var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
   }

   static final int[][] a(byte var0, Object[] var1, int var2) {
      if(var0 > -35) {
         f_i = (ta)null;
      }

      ++e;
      int[][] var3 = loa.a((byte)-52, var2, (Object[])((Object[])var1[4]));
      if(((boolean[])((boolean[])((Object[])((Object[])var1[4]))[0]))[0]) {
         int[][] var4 = bsa.a(0, (byte)17, var2, var1);
         int[] var5 = var4[0];
         int[] var6 = var4[1];
         int[] var7 = var4[2];
         int[] var8 = var3[0];
         int[] var9 = var3[1];
         if(var1 != null && (var1.length == 3 || -34 == ~var1.length)) {
            ada.b((Object[])null, 96);
         }

         int[] var10 = var3[2];

         for(int var11 = 0; fo.b > var11; ++var11) {
            int var12 = var5[var11];
            int var13 = var7[var11];
            int var14 = var6[var11];
            if(var13 == var12 && var14 == var13) {
               var8[var11] = var12 * ((int[])((int[])var1[1]))[4] >> 12;
               var9[var11] = ((int[])((int[])var1[1]))[3] * var13 >> 12;
               var10[var11] = var14 * ((int[])((int[])var1[1]))[2] >> 12;
            } else {
               var8[var11] = ((int[])((int[])var1[1]))[4];
               var9[var11] = ((int[])((int[])var1[1]))[3];
               var10[var11] = ((int[])((int[])var1[1]))[2];
            }
         }
      }

      return var3;
   }

   static final void a(int var0, Object[] var1, za var2) {
      int var3 = 127 / ((75 - var0) / 37);
      ++c;
      gba var4;
      var1[19] = ((var4 = (gba)var2) == null?null:var4.p)[1];
      if(null == var1[10]) {
         Object[] var5 = jaa.a(new Object[3], 80, false);
         if(((boolean[])((boolean[])var1[17]))[11]) {
            tua.putFloat(var5, (byte)-126, -1.0F);
            tua.putFloat(var5, (byte)-127, -1.0F);
            tua.putFloat(var5, (byte)-127, 0.0F);
            tua.putFloat(var5, (byte)-128, 0.0F);
            tua.putFloat(var5, (byte)-126, 0.0F);
            tua.putFloat(var5, (byte)-127, -1.0F);
            tua.putFloat(var5, (byte)-126, 1.0F);
            tua.putFloat(var5, (byte)-126, 0.0F);
            tua.putFloat(var5, (byte)-127, 0.0F);
            tua.putFloat(var5, (byte)-128, 1.0F);
            tua.putFloat(var5, (byte)-128, 1.0F);
            tua.putFloat(var5, (byte)-128, 1.0F);
            tua.putFloat(var5, (byte)-128, 0.0F);
            tua.putFloat(var5, (byte)-127, 1.0F);
            tua.putFloat(var5, (byte)-127, 1.0F);
            tua.putFloat(var5, (byte)-128, 1.0F);
            tua.putFloat(var5, (byte)-126, -1.0F);
            tua.putFloat(var5, (byte)-127, 0.0F);
            if(var1 != null && (7 == var1.length && var1[0].equals(Boolean.valueOf(false)) || var1.length == 26)) {
               no.a(true, (Object[])null);
            }

            tua.putFloat(var5, (byte)-128, 1.0F);
            tua.putFloat(var5, (byte)-128, 0.0F);
         } else {
            uq.putFloatLE(1, -1.0F, var5);
            uq.putFloatLE(1, -1.0F, var5);
            uq.putFloatLE(1, 0.0F, var5);
            uq.putFloatLE(1, 0.0F, var5);
            uq.putFloatLE(1, 0.0F, var5);
            uq.putFloatLE(1, -1.0F, var5);
            uq.putFloatLE(1, 1.0F, var5);
            uq.putFloatLE(1, 0.0F, var5);
            uq.putFloatLE(1, 0.0F, var5);
            uq.putFloatLE(1, 1.0F, var5);
            uq.putFloatLE(1, 1.0F, var5);
            uq.putFloatLE(1, 1.0F, var5);
            uq.putFloatLE(1, 0.0F, var5);
            uq.putFloatLE(1, 1.0F, var5);
            uq.putFloatLE(1, 1.0F, var5);
            uq.putFloatLE(1, 1.0F, var5);
            uq.putFloatLE(1, -1.0F, var5);
            uq.putFloatLE(1, 0.0F, var5);
            uq.putFloatLE(1, 1.0F, var5);
            uq.putFloatLE(1, 0.0F, var5);
            if(var1 != null && (4 == var1.length && var1[0].equals(Integer.valueOf(2)) || -11 == ~var1.length && var1[3].equals(Integer.valueOf(0)))) {
               sm.a((Object[])null, 123);
            }
         }

         var1[10] = hq.a(var1, ((int[])((int[])var5[1]))[0], false, 20, (byte[])((byte[])var5[2]), false);
         var1[42] = dq.a((Object[])((Object[])var1[10]), 5126, 3, 0, new Object[3], 3);
         var1[29] = dq.a((Object[])((Object[])var1[10]), 5126, 2, 12, new Object[3], 3);
         gsa.a((Object[])((Object[])var1[59]), 3, var1);
      }

   }

   static final boolean a(byte var0) {
      ++f;
      sf.b(0);
      int var1 = dua.a((Object[])((Object[])tu.d[35]), (byte)-78);
      if(var1 == 2) {
         nq.a(100, 0.3F, 119, lna.g);
      }

      if(null != lna.g) {
         ima.a(104);
      }

      Class_n.a = 0 != dua.a((Object[])((Object[])tu.d[35]), (byte)-78);
      mka.e = var1 == 2;
      return var0 <= -75;
   }

   static final boolean a(ta var0, byte var1, int var2, int var3, Object[] var4) {
      ++a;
      if(var1 != 109) {
         j = (rp)null;
      }

      int var5 = csa.a((Object[])((Object[])var4[2]), var1 ^ 88);
      if(((Object[])((Object[])var4[2]))[9] != null) {
         for(int var6 = 0; ((Object[])((Object[])((Object[])((Object[])var4[2]))[9])).length > var6; ++var6) {
            ((lpa[])((lpa[])((Object[])((Object[])var4[2]))[9]))[var6].j <<= var5;
            if(((lpa[])((lpa[])((Object[])((Object[])var4[2]))[9]))[var6].a(((int[])((int[])((Object[])((Object[])var4[1]))[1]))[0] + var2, var3 + ((int[])((int[])((Object[])((Object[])var4[1]))[1]))[1]) && nv.a(var0, var2, (Object[])((Object[])var4[2]), var3, 3)) {
               ((lpa[])((lpa[])((Object[])((Object[])var4[2]))[9]))[var6].j >>= var5;
               return true;
            }

            ((lpa[])((lpa[])((Object[])((Object[])var4[2]))[9]))[var6].j >>= var5;
         }

         if(var4 != null && (var4.length == 14 || -2 == ~var4.length || 12 == var4.length)) {
            af.D = ((int[])((int[])jr.d[4]))[2];
         }
      }

      return false;
   }

   static final boolean a(String var0, byte var1, Object[] var2) {
      ++b;
      if(ev.a((int)4120, var2)) {
         var0 = var0.toLowerCase();
         if(var1 > -36) {
            return true;
         } else {
            int var3 = pe.a((Object[])((Object[])((Object[])((Object[])var2[3]))[4]), false, hp.a(var0, (int)1));
            return wl.a((byte)115, var2, var3);
         }
      } else {
         return false;
      }
   }

}
