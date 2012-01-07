
final class wl {

   static int c;
   static int baS100cacheOffset = 0;
   static int[] e = new int[4];
   static int f;
   static int d;
   static int b;


   static final Object[] a(Object[] var0, byte var1) {
      ++f;
      Object[] var2 = new Object[2];
      int var3 = jia.c(var1 ^ 8066, var0);
      int var14 = jia.c(-8166, var0);
      if(var1 != -104) {
         baS100cacheOffset = -38;
      }

      if(null != var0 && 1 == var0.length && var0[0].equals(Integer.valueOf(2))) {
         return null;
      } else {
         int var25 = jia.c(-8166, var0);
         int var36 = jia.c(-8166, var0);
         int var47 = jia.c(-8166, var0);
         int var58 = jia.c(-8166, var0);
         int var69 = jia.c(var1 ^ 8066, var0);
         int var80 = jia.c(-8166, var0);
         int var91 = td.a(var0, var1 ^ -30);
         int var93 = fh.a(var0, false);
         if(var2[0] == null) {
            var2[0] = new int[11];
         }

         gfa.a(var2, -1, var93, 0, var91);
         ((int[])((int[])var2[0]))[4] = var69;
         ((int[])((int[])var2[0]))[7] = var47;
         ((int[])((int[])var2[0]))[10] = var36;
         ((int[])((int[])var2[0]))[3] = var25;
         ((int[])((int[])var2[0]))[9] = var3;
         ((int[])((int[])var2[0]))[5] = var58;
         ((int[])((int[])var2[0]))[6] = var80;
         ((int[])((int[])var2[0]))[8] = var14;
         return var2 != null && -5 == ~var2.length && var2[3].equals(Integer.valueOf(2)) && var2[3].equals(Integer.valueOf(0))?null:var2;
      }
   }

   static final void a(int var0, byte var1, int[] var2) {
      if(var1 < -7) {
         ++c;
         if(-1 != var0) {
            if(fh.a(var0, 25401, var2)) {
               Object[][] var3 = (Object[][])((Object[][])hca.f[var0][2]);
               nl.a(var3, (int)65);
            }
         }
      }
   }

   static final void a(Object[] var0, int var1) {
      if(var1 != -17554) {
         baS100cacheOffset = ((int[])((int[])var0[1]))[0];
      }

      ++b;
   }

   static final boolean a(byte var0, Object[] var1, int var2) {
      ++d;
      if(!sda.a(var2, var1, 51)) {
         return false;
      } else if(var0 <= 65) {
         return true;
      } else if(((Object[])((Object[])var1[5]))[var2] != null) {
         return true;
      } else {
         td.a(var2, var1, 5);
         return null != ((Object[])((Object[])var1[5]))[var2];
      }
   }

   static {
      mu.a(new Object[1], -24490, 4);
   }
}
