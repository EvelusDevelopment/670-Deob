
final class aba {

   static String a;
   static int e;
   static int c;
   static int f;
   static int[] b = new int[5];
   static int d;


   static final Object[] a(Object[] var0, byte var1) {
      if(var1 <= 22) {
         return (Object[])null;
      } else {
         if(var0[3] == null) {
            var0[3] = new char[2];
         }

         if(null == var0[1]) {
            var0[1] = new int[2];
         }

         ++c;
         hla.b(26206, var0);
         return var0;
      }
   }

   static final float[] a(float[] var0, Object[] var1, boolean var2) {
      var0[2] = ((float[])((float[])var1[0]))[7];
      if(var2) {
         return (float[])((float[])var1[9]);
      } else {
         var0[1] = ((float[])((float[])var1[0]))[1];
         var0[0] = ((float[])((float[])var1[0]))[8];
         ++e;
         return var0;
      }
   }

   static final void a(int var0, Object[] var1) {
      ++f;
      if(null != var1[23] || null != var1[26]) {
         boolean var2 = true;

         for(int var3 = 0; ((int[])((int[])var1[23])).length > var3; ++var3) {
            int var4 = -1;
            if(null != var1[23]) {
               var4 = ((int[])((int[])var1[23]))[var3];
            }

            if(-1 == var4) {
               if(!bqa.a(var3, 12, var1, -1)) {
                  var2 = false;
               }
            } else {
               var2 = false;
               boolean var5 = false;
               boolean var6 = false;
               Object[] var7 = (Object[])((Object[])woa.a(5, var1)[1]);
               int var8;
               int var11;
               int var12;
               if(1073741823 != ~(-1073741824 & var4)) {
                  Object[] var9;
                  Object[] var10;
                  if(0 != (var4 & '\u8000')) {
                     var8 = var4 & 32767;
                     var9 = vo.E[var8];
                     if(var9 == null) {
                        bqa.a(var3, 12, var1, -1);
                        continue;
                     }

                     var10 = (Object[])((Object[])woa.a(5, var9)[1]);
                     var11 = (int)((float[])((float[])var7[1]))[2] + -((int)((float[])((float[])var10[1]))[2]);
                     var12 = (int)((float[])((float[])var7[1]))[1] - (int)((float[])((float[])var10[1]))[1];
                  } else {
                     hna var13 = (hna)pm.a((long)var4, hf.g, false);
                     if(null == var13) {
                        bqa.a(var3, 12, var1, -1);
                        continue;
                     }

                     var9 = var13.k;
                     var10 = (Object[])((Object[])woa.a(5, var9)[1]);
                     var12 = (int)((float[])((float[])var7[1]))[1] + -((int)((float[])((float[])var10[1]))[1]);
                     var11 = (int)((float[])((float[])var7[1]))[2] + -((int)((float[])((float[])var10[1]))[2]);
                  }
               } else {
                  var8 = var4 & 268435455;
                  int var14 = var8 >> 14;
                  var11 = -((-rs.f + var14) * 512) + -256 + (int)((float[])((float[])var7[1]))[2];
                  int var15 = var8 & 16383;
                  var12 = (int)((float[])((float[])var7[1]))[1] + (-((var15 - qm.d) * 512) - 256);
               }

               if(0 != var11 || 0 != var12) {
                  bqa.a(var3, 12, var1, 16383 & (int)(2607.5945876176133D * Math.atan2((double)var11, (double)var12)));
               }
            }
         }

         if(var2) {
            var1[23] = null;
            var1[26] = null;
         }

         if(null != var1 && 11 == var1.length && var1[8].equals(Integer.valueOf(2))) {
            ((boolean[])((boolean[])lba.f[6]))[0] = true;
         }

         if(var0 >= -26) {
            ((long[])((long[])var1[2]))[0] = 67L;
         }

      }
   }

   static final Object[] a(Object[] var0, Object[] var1, int var2) {
      usa.a((byte)127, var0);
      ++d;
      if(var0 != null && 3 == var0.length) {
         a((Object[])null, (Object[])null, 21929);
      }

      wu var4 = new wu(var0);
      var0[0] = var4;
      int var5 = lr.a(var2 - 21928, var1);
      ((int[])((int[])var0[1]))[2] = var5 >>> 28;
      ((int[])((int[])var0[1]))[7] = 16383 & var5;
      ((int[])((int[])var0[1]))[3] = (268434092 & var5) >>> 14;
      ((int[])((int[])var0[1]))[5] = fh.a(var1, false);
      ((int[])((int[])var0[1]))[8] = fh.a(var1, false);
      ((int[])((int[])var0[1]))[1] = fh.a(var1, false);
      ((int[])((int[])var0[1]))[0] = fh.a(var1, false);
      ((int[])((int[])var0[1]))[4] = fh.a(var1, false);
      ((int[])((int[])var0[1]))[6] = fh.a(var1, false);
      return var2 != 21929?(Object[])((Object[])var1[7]):var0;
   }

}
