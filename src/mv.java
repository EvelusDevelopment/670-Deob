import java.io.EOFException;
import java.io.IOException;

final class mv {

   static int a;
   static int c;
   static int b;
   static int d;
   static int e;


   static final void a(byte var0, Object[] var1, Object[] var2) {
      ++d;
      float var3 = ((float[])((float[])var2[0]))[10];
      float var4 = ((float[])((float[])var2[0]))[5];
      float var5 = ((float[])((float[])var2[0]))[0];
      float var6 = ((float[])((float[])var2[0]))[3];
      if(var2 != null && (var2.length == 3 || 23 == var2.length)) {
         pfa.a(9, (Object[])((Object[])bg.h[17]), 0.999201F, -0.5513432F, -0.7100881F);
      }

      float var7 = ((float[])((float[])var2[0]))[6];
      float var8 = ((float[])((float[])var2[0]))[11];
      int var10 = -59 / ((36 - var0) / 38);
      float var9 = ((float[])((float[])var2[0]))[8];
      float var11 = ((float[])((float[])var2[0]))[1];
      float var12 = ((float[])((float[])var2[0]))[9];
      float var13 = ((float[])((float[])var2[0]))[2];
      float var14 = ((float[])((float[])var2[0]))[4];
      ((float[])((float[])var2[0]))[5] = ((float[])((float[])var1[0]))[3] * var4 + var3 * ((float[])((float[])var1[0]))[5] + ((float[])((float[])var1[0]))[11] * var12;
      float var15 = ((float[])((float[])var2[0]))[7];
      ((float[])((float[])var2[0]))[10] = ((float[])((float[])var1[0]))[10] * var3 + ((float[])((float[])var1[0]))[0] * var4 + ((float[])((float[])var1[0]))[6] * var12;
      ((float[])((float[])var2[0]))[9] = var3 * ((float[])((float[])var1[0]))[9] + var4 * ((float[])((float[])var1[0]))[2] + ((float[])((float[])var1[0]))[4] * var12;
      ((float[])((float[])var2[0]))[3] = ((float[])((float[])var1[0]))[11] * var13 + ((float[])((float[])var1[0]))[5] * var5 + var6 * ((float[])((float[])var1[0]))[3];
      ((float[])((float[])var2[0]))[2] = ((float[])((float[])var1[0]))[4] * var13 + ((float[])((float[])var1[0]))[9] * var5 + ((float[])((float[])var1[0]))[2] * var6;
      ((float[])((float[])var2[0]))[0] = ((float[])((float[])var1[0]))[6] * var13 + ((float[])((float[])var1[0]))[0] * var6 + ((float[])((float[])var1[0]))[10] * var5;
      ((float[])((float[])var2[0]))[6] = ((float[])((float[])var1[0]))[6] * var14 + var8 * ((float[])((float[])var1[0]))[0] + var7 * ((float[])((float[])var1[0]))[10];
      ((float[])((float[])var2[0]))[4] = var7 * ((float[])((float[])var1[0]))[9] + ((float[])((float[])var1[0]))[2] * var8 + var14 * ((float[])((float[])var1[0]))[4];
      ((float[])((float[])var2[0]))[11] = ((float[])((float[])var1[0]))[11] * var14 + ((float[])((float[])var1[0]))[5] * var7 + var8 * ((float[])((float[])var1[0]))[3];
      ((float[])((float[])var2[0]))[1] = ((float[])((float[])var1[0]))[1] + var15 * ((float[])((float[])var1[0]))[11] + ((float[])((float[])var1[0]))[3] * var11 + var9 * ((float[])((float[])var1[0]))[5];
      ((float[])((float[])var2[0]))[7] = ((float[])((float[])var1[0]))[7] + ((float[])((float[])var1[0]))[9] * var9 + var11 * ((float[])((float[])var1[0]))[2] + var15 * ((float[])((float[])var1[0]))[4];
      ((float[])((float[])var2[0]))[8] = ((float[])((float[])var1[0]))[10] * var9 + ((float[])((float[])var1[0]))[0] * var11 + var15 * ((float[])((float[])var1[0]))[6] + ((float[])((float[])var1[0]))[8];
   }

   static final void a(int var0, byte[] var1, int var2, int var3, Object[] var4) throws IOException {
      ++c;

      try {
         if(~(var3 + var2) < ~var1.length) {
            throw new ArrayIndexOutOfBoundsException(-var1.length + var2 + var3);
         }

         if(-1L != ((long[])((long[])var4[4]))[5] && ((long[])((long[])var4[4]))[5] <= ((long[])((long[])var4[4]))[4] && ~((long)((int[])((int[])var4[1]))[0] + ((long[])((long[])var4[4]))[5]) <= ~((long)var3 + ((long[])((long[])var4[4]))[4])) {
            System.arraycopy(var4[3], (int)(-((long[])((long[])var4[4]))[5] + ((long[])((long[])var4[4]))[4]), var1, var2, var3);
            ((long[])((long[])var4[4]))[4] += (long)var3;
            return;
         }

         long var5 = ((long[])((long[])var4[4]))[4];
         int var8 = var3;
         int var9;
         if(((long[])((long[])var4[4]))[4] >= ((long[])((long[])var4[4]))[1] && ~((long)((int[])((int[])var4[1]))[1] + ((long[])((long[])var4[4]))[1]) < ~((long[])((long[])var4[4]))[4]) {
            var9 = (int)((long)((int[])((int[])var4[1]))[1] + ((long[])((long[])var4[4]))[1] + -((long[])((long[])var4[4]))[4]);
            if(var9 > var3) {
               var9 = var3;
            }

            System.arraycopy(var4[0], (int)(((long[])((long[])var4[4]))[4] - ((long[])((long[])var4[4]))[1]), var1, var2, var9);
            var2 += var9;
            ((long[])((long[])var4[4]))[4] += (long)var9;
            var3 -= var9;
         }

         if(((byte[])((byte[])var4[0])).length >= var3) {
            if(var3 > 0) {
               tqa.b(var4, (byte)-5);
               var9 = var3;
               if(((int[])((int[])var4[1]))[1] < var3) {
                  var9 = ((int[])((int[])var4[1]))[1];
               }

               System.arraycopy(var4[0], 0, var1, var2, var9);
               var3 -= var9;
               ((long[])((long[])var4[4]))[4] += (long)var9;
               var2 += var9;
            }
         } else {
            dm.a(((long[])((long[])var4[4]))[4], 1, (Object[])((Object[])var4[2]));
            ((long[])((long[])var4[4]))[0] = ((long[])((long[])var4[4]))[4];
            if(var4 != null && var4.length == 3 && var4[0].equals(Integer.valueOf(0))) {
               return;
            }

            while(var3 > 0) {
               var9 = bpa.a(var3, (byte)34, (Object[])((Object[])var4[2]), var1, var2);
               if(-1 == var9) {
                  break;
               }

               ((long[])((long[])var4[4]))[0] += (long)var9;
               ((long[])((long[])var4[4]))[4] += (long)var9;
               var2 += var9;
               var3 -= var9;
            }
         }

         if(((long[])((long[])var4[4]))[5] != -1L) {
            if(~((long[])((long[])var4[4]))[5] < ~((long[])((long[])var4[4]))[4] && 0 < var3) {
               var9 = var2 + (int)(((long[])((long[])var4[4]))[5] + -((long[])((long[])var4[4]))[4]);
               if(~var9 < ~(var2 + var3)) {
                  var9 = var3 + var2;
               }

               while(var9 > var2) {
                  --var3;
                  var1[var2++] = 0;
                  ++((long[])((long[])var4[4]))[4];
               }
            }

            long var16 = -1L;
            if(((long[])((long[])var4[4]))[5] >= var5 && ~((long)var8 + var5) < ~((long[])((long[])var4[4]))[5]) {
               var16 = ((long[])((long[])var4[4]))[5];
            } else if(((long[])((long[])var4[4]))[5] <= var5 && ~var5 > ~(((long[])((long[])var4[4]))[5] + (long)((int[])((int[])var4[1]))[0])) {
               var16 = var5;
            }

            long var11 = -1L;
            if(~var5 > ~(((long[])((long[])var4[4]))[5] + (long)((int[])((int[])var4[1]))[0]) && ~(((long[])((long[])var4[4]))[5] - -((long)((int[])((int[])var4[1]))[0])) >= ~((long)var8 + var5)) {
               var11 = (long)((int[])((int[])var4[1]))[0] + ((long[])((long[])var4[4]))[5];
            } else if(~((long[])((long[])var4[4]))[5] > ~(var5 - -((long)var8)) && var5 - -((long)var8) <= (long)((int[])((int[])var4[1]))[0] + ((long[])((long[])var4[4]))[5]) {
               var11 = (long)var8 + var5;
            }

            if(0L > ~var16 && var11 > var16) {
               int var13 = (int)(-var16 + var11);
               System.arraycopy(var4[3], (int)(-((long[])((long[])var4[4]))[5] + var16), var1, var2 + (int)(-var5 + var16), var13);
               if(var11 > ((long[])((long[])var4[4]))[4]) {
                  var3 = (int)((long)var3 - (-((long[])((long[])var4[4]))[4] + var11));
                  ((long[])((long[])var4[4]))[4] = var11;
               }
            }
         }
      } catch (IOException var14) {
         ((long[])((long[])var4[4]))[0] = -1L;
         throw var14;
      }

      if(0 >= var3) {
         int var15 = 100 / ((-54 - var0) / 52);
      } else {
         throw new EOFException();
      }
   }

   static final void a(int var0, int var1, Object[] var2, Object[] var3) {
      if(var0 != 133) {
         a(74, ((int[])((int[])var2[0]))[0], (Object[])((Object[])((Object[])((Object[])var2[10]))[8]), (Object[])((Object[])((Object[])((Object[])var2[2]))[30]));
      }

      if(1 == var1) {
         ((int[])((int[])var3[0]))[2] = fh.a(var2, false);
      } else if(var1 == 2) {
         ((int[])((int[])var3[0]))[0] = de.a((int)0, var2);
      } else if(3 == var1) {
         ((int[])((int[])var3[0]))[1] = de.a((int)0, var2);
      } else if(var1 == 4) {
         ((int[])((int[])var3[0]))[3] = jia.c(-8166, var2);
      }

      ++e;
   }

   static final Object[] a(int var0, Object[] var1) {
      if(var1[3] == null) {
         var1[3] = new boolean[1];
      }

      ++b;
      var1[0] = uma.a(var1, 107);
      if(var0 != -17207) {
         a = 61;
      }

      return var1;
   }

}
