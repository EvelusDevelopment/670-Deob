
final class tt {

   static int d = 0;
   static int e;
   static int a;
   static int c;
   static int f;
   static int b;


   static final void b(Object[] var0, int var1) {
      var0[4] = null;
      var0[6] = new Object[4][];
      ++f;
      if(var1 != 6054) {
         a(((int[])((int[])var0[6]))[12], (ta)((Object[])((Object[])var0[7]))[8], (Object[])null, -51, ((int[])((int[])var0[1]))[0], -4, -36);
      }

   }

   static final void a(Object[] var0, boolean var1) {
      ++a;
      lm var3 = dda.a((Object[])((Object[])var0[75]), 2);
      if(!var1) {
         b((Object[])null, 127);
      }

      while(var3 != null) {
         ava var2;
         Object[] var4 = null != (var2 = (ava)var3)?var2.m:null;
         Object[] var5 = (Object[])((Object[])var4[0]);
         if(var5 == null) {
            throw new IllegalStateException();
         }

         gua.a(true, var5);
         var3 = client.a((Object[])((Object[])var0[75]), -28280);
      }

      Class_e.a(var0, -80);
   }

   static final void a(int var0, ta var1, Object[] var2, int var3, int var4, int var5, int var6) {
      ++c;
      Object[] var7 = var1.c();
      Object[] var8 = im.a(new Object[2], (int)-16365);
      if(var0 == 75) {
         pfa.a(9, var8, 0.0F, 0.0F, 0.0F);
         ha.a(0.0F, -1.0F, var8, 24515, mw.a(16383 & -var6, (byte)40), 0.0F);
         ha.a(0.0F, 0.0F, var8, 24515, mw.a(-var4 & 16383, (byte)121), -1.0F);
         ha.a(-1.0F, 0.0F, var8, 24515, mw.a(16383 & -var3, (byte)127), 0.0F);
         var1.d(var8);
         Object[] var9 = im.a(new Object[2], (int)-16365);
         if(~var5 != ~((int[])((int[])var2[1]))[12]) {
            ((ka)var2[6]).I((byte)var5, (byte[])((byte[])var2[7]));
            ((int[])((int[])var2[1]))[12] = var5;
         }

         ((ka)var2[6]).a(var9, (lpa)null, 0);
         var1.d(var7);
      }
   }

   static final boolean a(Object[] var0, int var1) {
      if(var1 != 0) {
         d = ((int[])((int[])var0[9]))[4];
      }

      ++e;
      return ((int[])((int[])var0[1]))[0] != 0;
   }

}
