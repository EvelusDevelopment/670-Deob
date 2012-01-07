
final class pia {

   static int c;
   static Object[] a = sd.a(new Object[1], 118, (byte)114);
   static int f;
   static Object[] d;
   static int e;
   static int b;


   static final void a(Object[] var0, int var1, Object[] var2, int var3) {
      ++c;
      if(var1 != 16706) {
         ((long[])((long[])var2[1]))[1] = -15L;
      }

      if(var2 != null && var2.length == 5 && -8 == ~((int[])((int[])var2[1])).length) {
         fq.a(var0, var3, (byte)-33, var2);
      } else if(var2 != null && 6 == var2.length) {
         Object[] var4 = (Object[])((Object[])var2[5]);
         if(null != var4 && (-7 == ~var4.length && var4[0].equals(Integer.valueOf(2)) && var4[0].equals(Boolean.valueOf(false)) || var4.length == 1 && var4[0].equals(Integer.valueOf(1)))) {
            kaa.f = null;
         }

         if(50 > ct.e && null != var0 && null != var0[6] && ~var3 > ~((Object[])((Object[])var0[6])).length && null != ((int[][])((int[][])var0[6]))[var3]) {
            int var5 = ((int[][])((int[][])var0[6]))[var3][0];
            int var6 = var5 >> 8;
            int var7 = 7 & var5 >> 5;
            int var9;
            if(((int[][])((int[][])var0[6]))[var3].length > 1) {
               var9 = (int)(Math.random() * (double)((int[][])((int[][])var0[6]))[var3].length);
               if(0 < var9) {
                  var6 = ((int[][])((int[][])var0[6]))[var3][var9];
               }
            }

            int var8 = 31 & var5;
            var9 = 256;
            if(null != var0[8] && var0[0] != null) {
               var9 = (int)((double)(-((int[])((int[])var0[8]))[var3] + ((int[])((int[])var0[0]))[var3]) * Math.random()) + ((int[])((int[])var0[8]))[var3];
            }

            int var10 = null == var0[2]?255:((int[])((int[])var0[2]))[var3];
            if(0 == var8) {
               if(uta.g == var4) {
                  if(((boolean[])((boolean[])var0[4]))[2]) {
                     gfa.a(0, var9, var10, var6, var7, -8860, false);
                  } else {
                     iv.a(0, var6, var1 ^ 16706, var9, var10, var7);
                  }
               }
            } else if(0 != hba.a((Object[])((Object[])tu.d[33]), 0)) {
               Object[] var11 = (Object[])((Object[])woa.a(var1 - 16701, var4)[1]);
               int var12 = (int)((float[])((float[])var11[1]))[2] - 256 >> 9;
               int var13 = (int)((float[])((float[])var11[1]))[1] - 256 >> 9;
               int var14 = uta.g == var4?0:var8 + (var12 << 16) + (((byte[])((byte[])var4[10]))[0] << 24) + (var13 << 8);
               Class_a.c[ct.e++] = dk.a(var4, var6, var10, var14, var9, new Object[7], (byte)(!((boolean[])((boolean[])var0[4]))[2]?1:2), 0, var7, (byte)17);
            }
         }

      } else {
         pga.a(var3, 8, var0, var2);
      }
   }

   static final Object[] a(byte var0, Object[] var1) {
      te.a(var1, true);
      if(var0 != -10) {
         return (Object[])null;
      } else {
         ++f;
         var1[3] = osa.a(0, new Object[2]);
         ((int[])((int[])var1[1]))[0] = 0;
         ((boolean[])((boolean[])var1[2]))[0] = false;
         pj var4 = new pj(var1);
         var1[0] = var4;
         var1[4] = new Thread((Runnable)(null != var1?var1[0]:null));
         ((Thread)var1[4]).setDaemon(true);
         if(null != var1 && -20 == ~var1.length) {
            dd.a(true, (Object[])null, (Object[])null, -52);
         }

         ((Thread)var1[4]).start();
         ((Thread)var1[4]).setPriority(1);
         return var1;
      }
   }

   static final int a(byte var0, Object[] var1, int var2, int var3) {
      ++e;
      if(var1[63] != null) {
         ma var4;
         Object[] var5 = null == (var4 = (ma)pm.a((long)var2, (Object[])((Object[])var1[63]), false))?null:var4.s;
         int var6 = -69 % ((-39 - var0) / 46);
         return var5 != null?((int[])((int[])var5[1]))[0]:var3;
      } else {
         return var3;
      }
   }

}
