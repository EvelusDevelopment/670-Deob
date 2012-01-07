
final class kfa {

   static int d;
   static boolean e = false;
   static Object[] c = sl.a("4", 0, new Object[1], "4");
   static int f;
   static float b = 0.5F;
   static float a = (-b + 1.0F) / 2.0F;


   static final String a(long var0, int var2, int var3) {
      ++d;
      ew.a(var0, 9921);
      int var4 = ot.b.get(5);
      int var5 = ot.b.get(2);
      if(var3 != -31906) {
         return (String)c[4];
      } else {
         int var6 = ot.b.get(1);
         if(3 == var2) {
            ew.a(var0, 9921);
            int var8 = ot.b.get(5);
            int var9 = ot.b.get(2) + 1;
            int var10 = ot.b.get(1);
            String var7 = Integer.toString(var8 / 10) + var8 % 10 + "/" + var9 / 10 + var9 % 10 + "/" + var10 % 100 / 10 + var10 % 10;
            return var7;
         } else {
            return Integer.toString(var4 / 10) + var4 % 10 + "-" + hl.g[var2][var5] + "-" + var6;
         }
      }
   }

   static final void a(Object[][] var0, int var1, int var2) {
      if(var1 < var2) {
         int var3 = (var1 + var2) / 2;
         int var4 = var1;
         Object[] var5 = var0[var3];
         var0[var3] = var0[var2];
         var0[var2] = var5;
         int var6 = ((int[])((int[])var5[12]))[0];

         for(int var7 = var1; var7 < var2; ++var7) {
            if(((int[])((int[])var0[var7][12]))[0] > var6 + (var7 & 1)) {
               Object[] var8 = var0[var7];
               var0[var7] = var0[var4];
               var0[var4++] = var8;
            }
         }

         var0[var2] = var0[var4];
         var0[var4] = var5;
         a(var0, var1, var4 - 1);
         a(var0, var4 + 1, var2);
      }

   }

   static final void a(int var0, Object[] var1) {
      ((int[])((int[])var1[1]))[2] = ((int[])((int[])((Object[])((Object[])var1[0]))[1]))[1];
      ++f;
      if(var0 == 4562) {
         ((int[])((int[])var1[1]))[1] = ((int[])((int[])((Object[])((Object[])var1[0]))[1]))[2];
         ((int[])((int[])var1[1]))[0] = ((int[])((int[])((Object[])((Object[])var1[0]))[1]))[3];
         if(null != ((Object[])((Object[])var1[0]))[0]) {
            Class_cs.a((float)((int[])((int[])((Object[])((Object[])var1[4]))[1]))[10], sda.j, (float)((int[])((int[])((Object[])((Object[])var1[4]))[1]))[8], (float)((int[])((int[])((Object[])((Object[])var1[4]))[1]))[6], -109, (Object[])((Object[])((Object[])((Object[])var1[0]))[0]));
         }

         ((float[])((float[])var1[3]))[0] = sda.j[0];
         ((float[])((float[])var1[3]))[1] = sda.j[2];
      }
   }

}
