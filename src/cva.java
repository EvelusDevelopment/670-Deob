
final class cva extends nj {

   Object[] m;
   static int o;
   static Object[] n = ed.a(-2, new Object[1], (byte)-123, 24);
   static int f_i;
   static int[] p = new int[]{0, -1, 0, 1};
   static int j;
   static boolean[][] k = new boolean[][]{{false, false, false, false, false, false, false, false, false, false, false, false, false}, {false, false, true, true, true, true, true, false, false, false, false, false, true}, {true, true, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, false, false, true, true, true, false, false, false, false, false}, {true, false, false, false, false, true, true, true, false, false, false, false, false}, {false, false, true, true, true, true, false, false, false, false, false, false, false}, {false, true, true, true, true, true, false, false, false, false, false, false, true}, {false, true, true, true, true, true, true, true, false, false, false, false, true}, {true, true, false, false, false, false, false, true, false, false, false, false, false}, {true, true, true, true, true, false, false, false, true, true, false, false, false}, {true, false, false, false, true, true, true, true, true, true, false, false, false}, {true, false, true, true, true, true, true, true, false, false, true, true, false}, {true, true, true, true, true, true, true, true, true, true, true, true, true}, {false, false, false, false, false, false, false, false, false, false, false, false, false}, {true, true, true, true, true, true, true, true, true, true, true, true, true}};
   static int f_l;


   static final void a(byte var0, Object[] var1) {
      ++f_i;
      if(var0 != 10) {
         n = (Object[])null;
      }

      ((int[])((int[])var1[1]))[0] = 0;
      ((int[])((int[])var1[1]))[1] = 0;
      ((int[])((int[])var1[1]))[2] = 0;
   }

   static final int b(Object[] var0, boolean var1) {
      if(var1) {
         a(((byte[])((byte[])n[2]))[2], (Object[])((Object[])((Object[])((Object[])var0[11]))[5]));
      }

      ++j;
      Object[] var3 = (Object[])((Object[])var0[0]);
      int var2 = ((int[])((int[])var3[1]))[4];
      return var2;
   }

   static final void a(int var0, Object[] var1, byte var2) {
      ++o;
      if(null != var1[7]) {
         int var3 = -91 % ((var2 + 43) / 33);

         lm var4;
         for(var4 = dda.a((Object[])((Object[])var1[5]), 2); var4 != null; var4 = client.a((Object[])((Object[])var1[5]), -28280)) {
            if(var4.e == (long)var0) {
               return;
            }
         }

         var4 = new lm();
         if(var1 != null && var1.length == 1) {
            afa.a((Object[])null, 3);
         }

         var4.e = (long)var0;
         client.a(115, (Object[])((Object[])var1[5]), var4);
      }
   }

   static final Object[] a(float[][] var0, int[] var1, int[] var2, int[] var3, boolean var4, Object[] var5) {
      var5[3] = var3;
      ++f_l;
      var5[0] = var1;
      var5[2] = var0;
      var5[1] = var2;
      return var4?(Object[])((Object[])var5[10]):var5;
   }

   cva(Object[] var1) {
      this.m = var1;
   }

}
