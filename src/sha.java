import jaclib.memory.heap.NativeHeap;

final class sha extends rqa {

   static int h;
   static Object[][] d;
   static int f;
   static int j = 0;
   static int f_i;
   static int e;
   static int g;
   static int c;
   static int k;


   static final Object[] a(byte var0, Object[] var1) {
      ++f;
      return var0 > -24?(Object[])null:kla.a(((int[])((int[])var1[0]))[0], ((int[])((int[])var1[0]))[1], ((int[])((int[])var1[0]))[4], ((int[])((int[])var1[0]))[5], ((int[])((int[])var1[0]))[3], ((int[])((int[])var1[0]))[2], 0, new Object[1]);
   }

   static final void a(Object[] var0, byte var1, int var2) {
      byte[] var10000 = (byte[])((byte[])var0[2]);
      int[] var10001 = (int[])((int[])var0[1]);
      int var10004 = ((int[])((int[])var0[1]))[0];
      var10001[0] = ((int[])((int[])var0[1]))[0] + 1;
      var10000[var10004] = (byte)(var2 >> 8);
      ++g;
      var10000 = (byte[])((byte[])var0[2]);
      var10001 = (int[])((int[])var0[1]);
      var10004 = ((int[])((int[])var0[1]))[0];
      var10001[0] = ((int[])((int[])var0[1]))[0] + 1;
      var10000[var10004] = (byte)var2;
      int var3 = 36 / ((var1 + 40) / 54);
      var10000 = (byte[])((byte[])var0[2]);
      var10001 = (int[])((int[])var0[1]);
      var10004 = ((int[])((int[])var0[1]))[0];
      var10001[0] = ((int[])((int[])var0[1]))[0] + 1;
      var10000[var10004] = (byte)(var2 >> 24);
      var10000 = (byte[])((byte[])var0[2]);
      var10001 = (int[])((int[])var0[1]);
      var10004 = ((int[])((int[])var0[1]))[0];
      var10001[0] = ((int[])((int[])var0[1]))[0] + 1;
      var10000[var10004] = (byte)(var2 >> 16);
   }

   static final boolean a(int var0, Object[] var1) {
      if(var0 != 4) {
         return ((boolean[])((boolean[])var1[4]))[19];
      } else {
         ++e;
         return maa.a(bg.a(true, (Object[])((Object[])((Object[])((Object[])var1[0]))[5])), -127);
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5) {
      for(int var6 = var0; var6 <= var5; ++var6) {
         fka.a(var3, fda.c[var6], var1, var2, (byte)-109);
      }

      if(var4 != 4) {
         d = (Object[][])((Object[][])null);
      }

      ++h;
   }

   static final void a(int var0, Object[] var1, int var2, int var3, Object[] var4, Object[] var5) {
      if(var0 > 0) {
         bqa.b(var1, 31);
         eca.a((Object[])((Object[])var1[4]), 24394, var4);
         ((int[])((int[])var5[1]))[3] = var0;
         ((int[])((int[])var5[1]))[2] = -((int[])((int[])var1[1]))[3] + ((int[])((int[])var1[1]))[0] + 1;
         ((int[])((int[])var5[1]))[0] = var2;
         var5[6] = var1[5];
         ((int[])((int[])var5[1]))[1] = ((int[])((int[])var1[1]))[3];
         ps.b(var5, 0, (byte)126);
      }

      if(var3 <= 1) {
         ((boolean[])((boolean[])var1[0]))[4] = true;
      }

      ++c;
   }

   sha(Object[] var1, Object[] var2, byte[] var3, int var4) {
      super(var2, var3, var4);
   }

   static final void a(boolean var0, Object[] var1) {
      if(((int[])((int[])var1[4]))[1] != 0) {
         kc.a((byte)-123, (Object[])((Object[])var1[15]), ((int[])((int[])var1[4]))[1]);
         Object[] var2;
         long var3;
         lm var6;
         if(-1 != ~((int[])((int[])var1[4]))[2]) {
            var2 = (Object[])((Object[])var1[15]);
            var3 = (long)((int[])((int[])var1[4]))[2];
            synchronized(var2) {
               var6 = new lm();
               var6.e = var3;
               client.a(-67, (Object[])((Object[])var2[74]), var6);
            }
         }

         if(-1 != ~((int[])((int[])var1[4]))[0]) {
            var2 = (Object[])((Object[])var1[15]);
            var3 = (long)((int[])((int[])var1[4]))[0];
            synchronized(var2) {
               var6 = new lm();
               var6.e = var3;
               client.a(120, (Object[])((Object[])var2[74]), var6);
            }
         }

         ((int[])((int[])var1[4]))[0] = 0;
         ((int[])((int[])var1[4]))[2] = 0;
         ((int[])((int[])var1[4]))[1] = 0;
      }

      ++k;
      if(!var0) {
         a(72, (Object[])((Object[])var1[5]), ((int[])((int[])var1[9]))[22], -23, (Object[])null, (Object[])((Object[])var1[0]));
      }

   }

   static final Object[] a(Object[] var0, int var1, int var2) {
      var0[var1] = tj.a(8, var0);
      ++f_i;
      var0[0] = new NativeHeap(var2);
      return var0;
   }

}
