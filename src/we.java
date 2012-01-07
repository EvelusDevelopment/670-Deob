
final class we {

   static int c;
   static Object[] b = vra.a(536870911, 12, "", new Object[1]);
   static Object[] d = ve.a(new Object[1], (byte)3, 1);
   static int e;
   static int f;
   static int a;
   static int g = -1;


   static final int a(Object[] var0, byte var1, int var2) {
      if(var1 < 12) {
         b(((int[])((int[])b[0]))[0], -17, 101);
      }

      ++e;
      return 1;
   }

   static final void a(Object[] var0, Object[] var1, int var2) {
      ++a;
      ((Object[][])((Object[][])var1[64]))[((int[])((int[])var1[1]))[7]] = var0;
      ufa.a((byte)75, var1);
      if(var2 != -21748) {
         ((byte[])((byte[])var1[6]))[0] = -61;
      }

   }

   static final String a(long var0, int var2) {
      ++f;
      if(0L < var0 && -6582952005840035282L < ~var0) {
         if(-1L == ~(var0 % (long)var2)) {
            return null;
         } else {
            int var3 = 0;

            for(long var4 = var0; -1L != ~var4; ++var3) {
               var4 /= 37L;
            }

            StringBuffer var6;
            char var9;
            for(var6 = new StringBuffer(var3); 0L != var0; var6.append(var9)) {
               long var7 = var0;
               var0 /= 37L;
               var9 = fo.k[(int)(-(var0 * 37L) + var7)];
               if(95 == var9) {
                  int var10 = var6.length() - 1;
                  var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                  var9 = 160;
               }
            }

            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
         }
      } else {
         return null;
      }
   }

   static final void b(int var0, int var1, int var2) {
      ++c;
      Object[] var3 = la.a(0, (long)var0, 17);
      jqa.a((byte)126, var3);
      ((int[])((int[])var3[0]))[var1] = var2;
   }

   static final Object[] a(int var0, int var1, int var2) {
      Object[] var3 = ju.g[var0][var1][var2];
      if(var3 != null) {
         poa.a((Object[])((Object[])var3[4]));
         if(var3[4] != null) {
            Object[] var4 = (Object[])((Object[])var3[4]);
            var3[4] = null;
            return var4;
         }
      }

      return null;
   }

}
