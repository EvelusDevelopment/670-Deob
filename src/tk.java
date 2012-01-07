
final class tk extends ja {

   private Object[] G;
   static int J;
   static int E;
   static int B;
   static int I;
   static int D;
   static int K;
   static int H;
   static int C;


   static final String a(String var0, byte var1, int var2, Object[] var3) {
      ++D;
      if(null == var3[63]) {
         return var0;
      } else {
         ns var4;
         Object[] var5 = (var4 = (ns)pm.a((long)var2, (Object[])((Object[])var3[63]), false)) != null?var4.n:null;
         int var6 = 112 % ((32 - var1) / 55);
         return var5 != null?(String)var5[0]:var0;
      }
   }

   final void HA(char var1, int var2, int var3, int var4, boolean var5) {
      ok.a(this.G, var1, var2, var3, var4, var5);
   }

   static final Object[] a(Object[] var0, Object[] var1, int var2) {
      ++H;
      Object[] var3;
      if(var0 != null && var0.length == 8) {
         var3 = ja.a(var0, var1, new Object[9], var2 ^ 24000);
         return var3;
      } else {
         if(var2 != 0) {
            a((Object[])null, (Object[])null, 88);
         }

         if(null != var0 && var0.length == 9) {
            var3 = bn.a(var1, var0, new Object[10], 17034);
            return var3;
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final void a(boolean var0, int var1) {
      ++J;
      if(var0) {
         Object[] var2 = la.a(0, (long)var1, 12);
         aia.a(var2, 1);
      }
   }

   static final void b(int var0, Object[] var1, Object[] var2) {
      if(var0 == -1) {
         while(true) {
            int var3 = fh.a(var2, false);
            if(0 == var3) {
               ++E;
               return;
            }

            cpa.a(var0 ^ -20690, var3, var1, var2);
         }
      }
   }

   static final String a(int var0, Object[] var1, boolean var2) {
      ++B;
      return var0 < 64?(String)null:(!var2?(String)var1[37]:(String)var1[39]);
   }

   tk(Object[] var1, ta var2, Object[] var3) {
      super(var2, var3);
      this.G = var1;
   }

   final void a(char var1, int var2, int var3, int var4, boolean var5, Class_s var6, int var7, int var8) {
      ok.a(this.G, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   static final Object[] a(byte var0) {
      ++C;
      int var1 = -82 / ((var0 + 38) / 41);
      return nga.a;
   }

   static final void b(Object[] var0, int var1) {
      if(var0[1] == null) {
         var0[1] = new int[9];
      }

      if(null == var0[0]) {
         var0[0] = new boolean[3];
      }

      int var2 = -16 / ((var1 - 57) / 46);
      ++K;
   }

   static final void a(int var0, Object[] var1, Object[] var2) {
      if(var0 == 26397) {
         ((float[])((float[])var1[0]))[1] = ((float[])((float[])var2[0]))[1];
         ((float[])((float[])var1[0]))[2] = ((float[])((float[])var2[0]))[2];
         ++I;
         ((float[])((float[])var1[0]))[0] = ((float[])((float[])var2[0]))[0];
         ((float[])((float[])var1[0]))[3] = ((float[])((float[])var2[0]))[3];
      }
   }

}
