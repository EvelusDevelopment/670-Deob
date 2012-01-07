
final class fj {

   static int a;
   static Object[] d = sd.a(new Object[1], 76, (byte)122);
   static int g;
   static int b;
   static Object[] c = ed.a(2, new Object[1], (byte)-119, 80);
   static Object[] f = ed.a(5, new Object[1], (byte)-116, 127);
   static long e;


   static final void a(int var0, float[] var1, float var2, float var3, Object[] var4, float var5) {
      ++b;
      float var6 = ((float[])((float[])((Object[])((Object[])var4[16]))[0]))[10] * var5 + ((float[])((float[])((Object[])((Object[])var4[16]))[0]))[2] * var3 + ((float[])((float[])((Object[])((Object[])var4[16]))[0]))[14] + var2 * ((float[])((float[])((Object[])((Object[])var4[16]))[0]))[6];
      float var7 = ((float[])((float[])((Object[])((Object[])var4[16]))[0]))[7] * var2 + ((float[])((float[])((Object[])((Object[])var4[16]))[0]))[15] + var3 * ((float[])((float[])((Object[])((Object[])var4[16]))[0]))[3] + ((float[])((float[])((Object[])((Object[])var4[16]))[0]))[11] * var5;
      if(-var7 <= var6 && var6 <= var7) {
         float var8 = ((float[])((float[])((Object[])((Object[])var4[16]))[0]))[8] * var5 + var2 * ((float[])((float[])((Object[])((Object[])var4[16]))[0]))[4] + ((float[])((float[])((Object[])((Object[])var4[16]))[0]))[12] + ((float[])((float[])((Object[])((Object[])var4[16]))[0]))[0] * var3;
         if(-var7 <= var8 && var7 >= var8) {
            float var9 = var5 * ((float[])((float[])((Object[])((Object[])var4[16]))[0]))[9] + ((float[])((float[])((Object[])((Object[])var4[16]))[0]))[13] + ((float[])((float[])((Object[])((Object[])var4[16]))[0]))[1] * var3 + var2 * ((float[])((float[])((Object[])((Object[])var4[16]))[0]))[5];
            if(var9 >= -var7 && var9 <= var7) {
               var1[1] = ((float[])((float[])var4[0]))[15] + ((float[])((float[])var4[0]))[10] * var9 / var7;
               var1[0] = ((float[])((float[])var4[0]))[9] * var8 / var7 + ((float[])((float[])var4[0]))[4];
               float var10 = ((float[])((float[])((Object[])((Object[])var4[28]))[0]))[var0] * var5 + var2 * ((float[])((float[])((Object[])((Object[])var4[28]))[0]))[6] + ((float[])((float[])((Object[])((Object[])var4[28]))[0]))[2] * var3 + ((float[])((float[])((Object[])((Object[])var4[28]))[0]))[14];
               var1[2] = var10;
            } else {
               var1[2] = Float.NaN;
               var1[1] = Float.NaN;
               var1[0] = Float.NaN;
            }
         } else {
            var1[2] = Float.NaN;
            var1[1] = Float.NaN;
            var1[0] = Float.NaN;
         }
      } else {
         var1[2] = Float.NaN;
         var1[0] = Float.NaN;
         var1[1] = Float.NaN;
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, Object[] var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      ((int[])((int[])var5[0]))[3] = var2;
      ((int[])((int[])var5[0]))[8] = var3;
      ((int[])((int[])var5[0]))[2] = var8 * var8;
      if(var10 <= 15) {
         ((long[])((long[])d[0]))[5] = ((long[])((long[])var5[8]))[3];
      }

      ++a;
      ((int[])((int[])var5[0]))[4] = var9;
      ((int[])((int[])var5[0]))[7] = ((int[])((int[])var5[0]))[3] + var6;
      ((int[])((int[])var5[0]))[1] = ((int[])((int[])var5[0]))[8] + var4;
      ((int[])((int[])var5[0]))[5] = ((int[])((int[])var5[0]))[4] + var0;
      ((int[])((int[])var5[0]))[9] = ((int[])((int[])var5[0]))[4] + var1;
      ((int[])((int[])var5[0]))[6] = ((int[])((int[])var5[0]))[8] + var7;
      ((int[])((int[])var5[0]))[0] = var11 + ((int[])((int[])var5[0]))[3];
   }

   static final void a(int var0, Object[] var1) {
      ++g;
      if(var0 != 127) {
         c = (Object[])((Object[])d[2]);
      }

      if(null != var1[11]) {
         if(var1 == null || var1.length != 3 || !var1[2].equals(Integer.valueOf(1))) {
            for(int var2 = 0; var2 < 10 && ((int[])((int[])var1[12]))[0] + var2 < ((int[])((int[])var1[11])).length; ++var2) {
               if(null == ((byte[][])((byte[][])var1[15]))[var2] && Class_ss.a(0, 5, (Object[])((Object[])var1[14]), ((int[])((int[])var1[11]))[((int[])((int[])var1[12]))[0] + var2])) {
                  ((byte[][])((byte[][])var1[15]))[var2] = qn.a(((int[])((int[])var1[11]))[var2 + ((int[])((int[])var1[12]))[0]], 0, (Object[])((Object[])var1[14]), 80);
               }
            }

         }
      }
   }

}
