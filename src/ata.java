
final class ata {

   static int c;
   static int e;
   static int a;
   static int b;
   static Object[] f = sd.a(new Object[1], 65, (byte)117);
   static float d;
   static boolean g = false;


   static final void a(int var0) {
      ++a;
      int[] var1 = ot.a;

      int var2;
      Object[] var3;
      for(var2 = var0; ofa.b > var2; ++var2) {
         var3 = vo.E[var1[var2]];
         if(null != var3) {
            vda.a(var3, (byte)107);
         }
      }

      for(var2 = 0; var2 < rba.h; ++var2) {
         long var6 = (long)gr.c[var2];
         hna var5 = (hna)pm.a(var6, hf.g, false);
         if(var5 != null) {
            vda.a(var5.k, (byte)107);
         }
      }

      if(0 == bw.b) {
         for(var2 = 0; ofa.e.length > var2; ++var2) {
            var3 = ofa.e[var2];
            if(((boolean[])((boolean[])var3[2]))[0]) {
               vda.a(za.a(var3, (byte)93), (byte)107);
            }
         }
      }

   }

   static final void a(int var0, Object[] var1, int var2) {
      if(var0 < 59) {
         a(-13, 93, -22, (String)null);
      }

      ((int[])((int[])var1[1]))[0] = var2;
      ++c;
   }

   static final void a(int var0, int var1, int var2, String var3) {
      ++e;
      Object[] var4 = dja.a(-1, sla.c, 8860, var1);
      if(null != var4) {
         sp.c = new String[((int[])((int[])var4[var0]))[1]];
         nba.a = new int[((int[])((int[])var4[1]))[4]];
         nba.a[0] = var2;
         sp.c[0] = var3;
         wla.a(var4, 200000, 16);
      }
   }

   static final boolean a(Object[] var0, int var1) {
      ++b;
      return null == var0[16]?(var1 > -4?((boolean[])((boolean[])var0[0]))[17]:true):!((ka)var0[16]).m();
   }

}
