
final class fq {

   static int h;
   static int g;
   static int[] c = new int[1008];
   static int f;
   static int d = 0;
   static int f_i;
   static Object[] a = sd.a(new Object[1], 37, (byte)126);
   static int e;
   static Object[] b = sd.a(new Object[1], 96, (byte)114);


   static final int a(int var0, Object[] var1, boolean var2) {
      ++f;
      rw var3;
      Object[] var4 = (var3 = (rw)pm.a((long)var0, (Object[])((Object[])var1[2]), var2)) == null?null:var3.y;
      return null == var4?0:pf.a(!var2, var4);
   }

   static final void a(Object[] var0, int var1, byte var2, Object[] var3) {
      ++g;
      if(50 > ct.e && null != var0 && var0[6] != null && ((Object[])((Object[])var0[6])).length > var1 && ((int[][])((int[][])var0[6]))[var1] != null) {
         int var4 = ((int[][])((int[][])var0[6]))[var1][0];
         int var5 = var4 >> 8;
         int var6 = (var4 & 254) >> 5;
         int var7;
         if(((int[][])((int[][])var0[6]))[var1].length > 1) {
            var7 = (int)((double)((int[][])((int[][])var0[6]))[var1].length * Math.random());
            if(var7 > 0) {
               var5 = ((int[][])((int[][])var0[6]))[var1][var7];
            }
         }

         var7 = 256;
         if(var0[8] != null && null != var0[0]) {
            var7 = jt.a(2, ((int[])((int[])var0[8]))[var1], ((int[])((int[])var0[0]))[var1]);
         }

         if(!((boolean[])((boolean[])var0[4]))[2]) {
            iv.a(0, var5, 0, var7, 255, var6);
         } else {
            gfa.a(0, var7, 255, var5, var6, -8860, false);
         }
      }

      if(var2 >= -28) {
         ((long[])((long[])a[26]))[8] = 20L;
      }

   }

   static final void a(int var0, Object[] var1) {
      if(var0 != 23376) {
         d = 18;
      }

      ++f_i;
      if(var1[1] == null) {
         var1[1] = new int[1];
      }

   }

   static final int[][] a(int var0, int var1, Object[] var2) {
      ++e;
      if(var1 != 14185) {
         a(-9, (Object[])((Object[])a[2]));
      }

      int[][] var3 = loa.a((byte)-52, var0, (Object[])((Object[])var2[4]));
      if(((boolean[])((boolean[])((Object[])((Object[])var2[4]))[0]))[0]) {
         int[] var5 = vea.a(var2, 0, var0, (byte)-8);
         int[] var6 = var3[0];
         int[] var7 = var3[1];
         int[] var8 = var3[2];
         if(null != var2 && 6 == var2.length && var2[2].equals(Integer.valueOf(2))) {
            oe.a(25, (Object[])null, 104);
         }

         for(int var9 = 0; fo.b > var9; ++var9) {
            int var4 = var5[var9] >> 4;
            if(var4 < 0) {
               var4 = 0;
            }

            if(var4 > 256) {
               var4 = 256;
            }

            var4 = ((int[])((int[])var2[12]))[var4];
            var6[var9] = (16711680 & var4) >> 12;
            var7[var9] = 4080 & var4 >> 4;
            var8[var9] = 4080 & var4 << 4;
         }
      }

      return var3;
   }

   static final Object[][] a(byte var0) {
      ++h;
      if(var0 != -86) {
         ((byte[])((byte[])a[7]))[25] = 114;
      }

      return new Object[][]{taa.g, hia.e, bua.k, wpa.c, mia.f, bw.a, ufa.d, ca.e, gt.b, boa.t, mla.f_i, fi.f_i, rw.v, Class_f.h, ej.d, jga.f, dha.d, ida.z, cu.c, lb.t, io.b, iha.h, oqa.h, ft.p, pl.d, eha.o, gi.g, lga.d, lga.c, opa.f, lu.d};
   }

}
