
final class qta {

   Object[][] e;
   Object[][] c;
   static int b;
   String f;
   static int a;
   static Object[] d = sd.a(new Object[1], 34, (byte)127);
   Object[][] h;
   static Object[] g = sl.a("12", 0, new Object[1], "12");


   private final void a(byte[] var1, int var2) throws ufa {
      ++b;
      Object[] var4 = new Object[2];
      if(var4[1] == null) {
         var4[1] = new int[1];
      }

      var4[0] = var1;
      ((int[])((int[])var4[1]))[0] = 0;
      Object[] var5 = var4;
      int var6 = rda.d(var2 ^ 26311, var4);
      if(var6 != 4) {
         throw new ufa(var6, 4);
      } else {
         this.f = eha.a(var2 ^ var2, var4);
         this.e = new Object[rda.d(var2 ^ 26311, var4)][];
         this.c = new Object[rda.d(0, var4)][];
         this.h = new Object[rda.d(0, var4)][];

         int var7;
         for(var7 = 0; this.e.length > var7; ++var7) {
            this.e[var7] = qi.a(true, new Object[7]);
            gm.a(-93, var5, this.e[var7]);
         }

         for(var7 = 0; ~var7 > ~this.c.length; ++var7) {
            this.c[var7] = qi.a(true, new Object[7]);
            gm.a(-101, var5, this.c[var7]);
         }

         for(var7 = 0; this.h.length > var7; ++var7) {
            Object[][] var8 = this.h;
            Object[] var11 = new Object[5];
            var8[var7] = var11;
            gsa.a((byte)95, this.h[var7], var5);
         }

         if(var4 != null && var4.length == 10) {
            this.h = (Object[][])null;
         }

      }
   }

   static final void a(int var0, int var1) {
      wq.d = -1;
      rga.c = 100;
      qc.b = 3;
      if(var1 == 8601) {
         sv.f = var0;
         ++a;
      }
   }

   qta(byte[] var1) throws ufa {
      this.a(var1, 26311);
   }

}
