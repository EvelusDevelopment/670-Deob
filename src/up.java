import java.io.IOException;
import java.io.OutputStream;

final class up extends OutputStream {

   static int e;
   static Object[] c;
   static int f;
   static int a;
   static int b;
   static int d;


   static final int a(boolean var0, int var1, int var2, int var3) {
      ++e;
      Object[] var4 = fk.a(Integer.MIN_VALUE, var1, var0);
      if(null != var4) {
         if(~var2 == 0) {
            return 0;
         } else {
            if(null != var4 && (-2 == ~var4.length && var4[0].equals(Boolean.valueOf(false)) || var4.length == 7 && var4[1].equals(Integer.valueOf(2)))) {
               gj.a(((int[])((int[])((Object[])((Object[])wp.c[15]))[1]))[5], 32432, false, 103, false);
            }

            int var5 = 0;

            for(int var6 = 0; var6 < ((int[])((int[])var4[0])).length; ++var6) {
               if(((int[])((int[])var4[2]))[var6] == var2) {
                  var5 += ((int[])((int[])var4[0]))[var6];
               }
            }

            if(var3 <= 56) {
               a(new Object[4], (int[])null, 3, ((int[])((int[])c[0]))[5]);
            }

            return var5;
         }
      } else {
         return 0;
      }
   }

   static final int[] a(Object[] var0, int[] var1, int var2, int var3) {
      ++d;
      int var5 = -74 % ((var2 - 3) / 50);
      int[] var4 = new int[1152];
      if(var0 != null && var0.length == 24 && var0[6].equals(Boolean.valueOf(false))) {
         la.b = null;
      }

      int var6 = 0;

      for(int var7 = 0; 32 > var7; ++var7) {
         if(null != var0 && var0.length == 8) {
            la.b = null;
         }

         for(int var8 = 0; var8 < 36; ++var8) {
            int var9 = var1[var6];
            if(var9 == 0) {
               if(var8 > 0 && 0 != var1[-1 + var6]) {
                  var9 = var3;
               } else if(0 < var7 && -1 != ~var1[var6 - 36]) {
                  var9 = var3;
               } else if(35 > var8 && -1 != ~var1[var6 + 1]) {
                  var9 = var3;
               } else if(31 > var7 && 0 != var1[36 + var6]) {
                  var9 = var3;
               }
            }

            var4[var6++] = var9;
         }
      }

      return var4;
   }

   static final Object[] a(Object[] var0, Object[] var1, int var2, Object[] var3, Object[] var4, float var5) {
      ++f;
      if(var2 != -30180) {
         a((Object[])null, true, ((int[])((int[])var1[32]))[0]);
      }

      if(var4 != null && var4.length == 87) {
         return lo.a(var0, var5, var4, (byte)57, var1, var3);
      } else if(null != var4 && 91 == var4.length) {
         Object[] var6 = 0.5F <= var5?var3:var0;
         return var6;
      } else {
         throw new IllegalStateException();
      }
   }

   up(Object[] var1) {}

   static final int[] a(Object[] var0, boolean var1, int var2) {
      ++a;
      if(!var1) {
         c = (Object[])null;
      }

      return var2 >= 0?(var2 >= ((Object[])((Object[])var0[7])).length?(int[])((int[])var0[12]):((int[][])((int[][])var0[7]))[var2]):(int[])((int[])var0[11]);
   }

   public final void write(int var1) throws IOException {
      ++b;
      throw new IOException();
   }

}
