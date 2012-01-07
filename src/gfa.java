
final class gfa {

   static Object[][] e = new Object[8][];
   static int g;
   static int f;
   static int h;
   static int d;
   static int f_i;
   static int b;
   static cga[] c;
   static int a;


   static final Object[] a(int var0, Object[] var1) {
      if(var0 != 0) {
         return (Object[])null;
      } else {
         ++g;
         return gca.e;
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(var5 == -8860) {
         ++d;
         if((!var6?hba.a((Object[])((Object[])tu.d[12]), 0):hba.a((Object[])((Object[])tu.d[30]), 0)) != 0 && var4 != 0 && ct.e < 50 && -1 != var3) {
            Class_a.c[ct.e++] = dk.a((Object[])null, var3, var2, 0, var1, new Object[7], (byte)(!var6?2:3), var0, var4, (byte)17);
         }

      }
   }

   static final boolean a(Object[] var0, byte var1) {
      if(var1 < 79) {
         a(-105, -66, 26, 56, -63, -7, false);
      }

      ++f_i;
      return true;
   }

   static final Object[] a(Object[] var0, int var1, int var2, int var3, int var4) {
      qra.a((int)74, var0);
      ++b;
      ((int[])((int[])var0[var3]))[1] = var2;
      ((int[])((int[])var0[0]))[0] = var4;
      ((int[])((int[])var0[0]))[2] = var1;
      return var0;
   }

   static final void a(float var0, int var1, float var2, Object[] var3, float var4, float var5) {
      int var6 = -105 % ((-4 - var1) / 40);
      ((float[])((float[])var3[0]))[0] = var5;
      ((float[])((float[])var3[0]))[1] = var2;
      ((float[])((float[])var3[0]))[2] = var0;
      ++f;
      ((float[])((float[])var3[0]))[3] = var4;
   }

   static final char a(int var0, int var1, char var2) {
      ++a;
      if(var1 != -9253) {
         e = (Object[][])((Object[][])null);
      }

      if(192 <= var2 && var2 <= 255) {
         if(var2 >= 192 && 198 >= var2) {
            return 'A';
         }

         if(199 == var2) {
            return 'C';
         }

         if(200 <= var2 && 203 >= var2) {
            return 'E';
         }

         if(var2 >= 204 && 207 >= var2) {
            return 'I';
         }

         if(var2 >= 210 && 214 >= var2) {
            return 'O';
         }

         if(var2 >= 217 && 220 >= var2) {
            return 'U';
         }

         if(221 == var2) {
            return 'Y';
         }

         if(var2 == 223) {
            return 's';
         }

         if(224 <= var2 && var2 <= 230) {
            return 'a';
         }

         if(var2 == 231) {
            return 'c';
         }

         if(var2 >= 232 && 235 >= var2) {
            return 'e';
         }

         if(var2 >= 236 && 239 >= var2) {
            return 'i';
         }

         if(242 <= var2 && 246 >= var2) {
            return 'o';
         }

         if(249 <= var2 && var2 <= 252) {
            return 'u';
         }

         if(var2 == 253 || 255 == var2) {
            return 'y';
         }
      }

      return var2 != 338?(339 == var2?'o':(376 == var2?'Y':var2)):'O';
   }

}
