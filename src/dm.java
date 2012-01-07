import jaggl.OpenGL;
import java.io.IOException;
import java.io.RandomAccessFile;

final class dm {

   static int c;
   static int d;
   static Object[] b = ura.a(-37, new Object[2]);
   static int h;
   static int e;
   static int g = -50;
   static int f;
   static int a;


   static final Object[] a(boolean var0, int var1, int var2, String var3, int var4, boolean var5, int var6, long var7, int var9, int var10, long var11, String var13, Object[] var14, boolean var15) {
      ++d;
      if(null != var14 && -2 == ~var14.length) {
         return null;
      } else {
         if(var14[1] == null) {
            var14[1] = new int[5];
         }

         if(null == var14[4]) {
            var14[4] = new boolean[3];
         }

         if(var14[2] == null) {
            var14[2] = new long[2];
         }

         var14[6] = iq.a(var14, (byte)117);
         var14[0] = var3;
         ((int[])((int[])var14[1]))[1] = var9;
         ((int[])((int[])var14[1]))[3] = var4;
         var14[5] = var13;
         if(var2 >= 0) {
            a((byte)-77, 5, 46, (Object[])null);
         }

         ((int[])((int[])var14[1]))[4] = var1;
         ((boolean[])((boolean[])var14[4]))[0] = var5;
         ((int[])((int[])var14[1]))[0] = var6;
         ((boolean[])((boolean[])var14[4]))[2] = var15;
         ((long[])((long[])var14[2]))[0] = var7;
         ((int[])((int[])var14[1]))[2] = var10;
         ((long[])((long[])var14[2]))[1] = var11;
         ((boolean[])((boolean[])var14[4]))[1] = var0;
         return var14;
      }
   }

   static final void a(byte var0, Object[] var1) {
      ++f;
      if(null != var1[10]) {
         ((ch)var1[10]).d();
      }

      int var2 = 46 / ((1 - var0) / 41);
   }

   static final String a(int var0, String var1) {
      if(var0 > -9) {
         b = (Object[])null;
      }

      ++c;
      if(var1 == null) {
         return null;
      } else {
         int var2 = 0;

         int var3;
         for(var3 = var1.length(); var2 < var3 && mua.a(var1.charAt(var2), (byte)0); ++var2) {
            ;
         }

         while(var3 > var2 && mua.a(var1.charAt(-1 + var3), (byte)0)) {
            --var3;
         }

         int var4 = var3 - var2;
         if(1 <= var4 && var4 <= 12) {
            StringBuffer var5 = new StringBuffer(var4);

            for(int var6 = var2; var6 < var3; ++var6) {
               char var7 = var1.charAt(var6);
               if(ija.a(false, var7)) {
                  char var8 = vs.a(0, var7);
                  if(0 != var8) {
                     var5.append(var8);
                  }
               }
            }

            if(var5.length() != 0) {
               return var5.toString();
            } else {
               return null;
            }
         } else {
            return null;
         }
      }
   }

   static final void a(byte var0, int var1, int var2, Object[] var3) {
      ++e;
      if(var0 <= -94) {
         if(!((boolean[])((boolean[])var3[5]))[0]) {
            ((OpenGL)var3[3]).surfaceResized(((long[])((long[])var3[6]))[0]);
            no.b(false, var3);
            Object[] var5;
            if((var3 == null?null:var3[4]) == ((ta)((var5 = (Object[])((Object[])var3[2])) == null?null:var5[55])).e(30626)) {
               Class_f.a((byte)102, (Object[])((Object[])var3[2]));
            }

         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final void a(long var0, int var2, Object[] var3) throws IOException {
      ((RandomAccessFile)var3[2]).seek(var0);
      ++h;
      ((long[])((long[])var3[1]))[var2] = var0;
   }

   static final void a(int var0, int var1, int var2, int var3, int var4) {
      ++a;
      if(var3 != -22172) {
         b = (Object[])null;
      }

      if(var4 >= hla.g && var4 <= td.r) {
         var0 = eua.a(sda.c, (byte)-53, var0, sea.k);
         var1 = eua.a(sda.c, (byte)-53, var1, sea.k);
         uc.a(var0, var4, var2, 0, var1);
      }

   }

}
