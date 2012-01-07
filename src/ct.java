
final class ct {

   static int f = 0;
   static int d;
   static int b;
   static int g;
   static int a;
   static int e = 0;
   static int c;


   static final Object[] a(int var0, int var1, int var2) {
      Object[] var3 = ju.g[var0][var1][var2];
      if(var3 != null) {
         poa.a((Object[])((Object[])var3[0]));
         if(var3[0] != null) {
            Object[] var4 = (Object[])((Object[])var3[0]);
            var3[0] = null;
            return var4;
         }
      }

      return null;
   }

   static final void a(Object[] var0, Object[] var1, Object[] var2, Object[] var3, int var4) {
      ++d;
      if(var3 != null && var3.length == 87) {
         ki.a(var2, var4 + 92, var1, var0, var3);
      } else if(var4 == -92) {
         if(var3 != null && var3.length == 91) {
            jma.a(var2, var0, 42, var3, var1);
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final int a(Object[] var0, int var1) {
      ++b;
      if(var1 != 2) {
         ((byte[])((byte[])((Object[])((Object[])var0[7]))[3]))[1] = -44;
      }

      int var3 = ((int[])((int[])var0[1]))[0];
      int var2 = var3 >> 11 & 127;
      return var2;
   }

   static final Object[] a(Object[] var0, boolean var1) {
      ++c;
      if(var0[12] == null) {
         var0[12] = new int[3];
      }

      if(null == var0[10]) {
         var0[10] = new byte[2];
      }

      if(var0[8] == null) {
         var0[8] = new boolean[4];
      }

      if(!var1) {
         return (Object[])((Object[])((Object[])((Object[])var0[8]))[11]);
      } else {
         rl.a(var0, (int)6);
         return var0;
      }
   }

   static final Object[] a(int var0, int var1) {
      ++g;
      Object[][] var2 = fq.a((byte)-86);
      Object[][] var3 = var2;
      if(var1 <= 43) {
         a(63, 56, -16);
      }

      for(int var4 = 0; var3.length > var4; ++var4) {
         Object[] var5 = var3[var4];
         if(((int[])((int[])var5[0]))[0] == var0) {
            return var5;
         }
      }

      return null;
   }

}
