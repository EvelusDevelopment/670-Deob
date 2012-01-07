
final class tma {

   static int a;
   static int b;
   static int c;
   static Object[] d;


   static final void a(int var0, int var1, Object[] var2, int var3, boolean var4, int var5) {
      if(var0 < 51) {
         a(113, 87, (Object[])null, -19, ((boolean[])((boolean[])var2[1]))[12], 71);
      }

      ++b;
      if(lt.a((byte)102, var2) != var5) {
         if(-1 == var5) {
            var2[4] = null;
         } else {
            if(var2[4] != null && ~var5 == ~((int[])((int[])((Object[])((Object[])var2[4]))[1]))[3]) {
               if(((int[])((int[])((Object[])((Object[])var2[4]))[1]))[4] == 0) {
                  return;
               }
            } else {
               var2[4] = bs.a(kaa.f, -15, var5);
            }

            ((int[])((int[])var2[1]))[1] = 0;
            ((int[])((int[])var2[1]))[2] = var3;
            ((int[])((int[])var2[1]))[0] = var1;
            if(var4) {
               ((int[])((int[])var2[1]))[4] = (int)((double)((int[])((int[])((Object[])((Object[])var2[4]))[7])).length * Math.random());
               ((int[])((int[])var2[1]))[3] = (int)(Math.random() * (double)((int[])((int[])((Object[])((Object[])var2[4]))[5]))[((int[])((int[])var2[1]))[4]]);
            } else {
               ((int[])((int[])var2[1]))[3] = 0;
               ((int[])((int[])var2[1]))[4] = 0;
            }

            ((int[])((int[])var2[1]))[5] = 1 + ((int[])((int[])var2[1]))[4];
            if(((int[])((int[])var2[1]))[5] < 0 || ~((int[])((int[])var2[1]))[5] <= ~((int[])((int[])((Object[])((Object[])var2[4]))[7])).length) {
               ((int[])((int[])var2[1]))[5] = -1;
            }

            if(0 == ((int[])((int[])var2[1]))[0]) {
               pia.a((Object[])((Object[])var2[4]), 16706, var2, ((int[])((int[])var2[1]))[4]);
            }

            ((boolean[])((boolean[])var2[3]))[0] = false;
         }

         isa.a((int)127, var2);
      }

   }

   static final void a(Object[] var0, int var1, int var2, boolean var3, int var4, Object[] var5, ka var6, int var7, ta var8, int var9) {
      if(var1 != 12) {
         d = (Object[])((Object[])var0[1]);
      }

      ++c;
      Object[][] var10 = var6.a();
      Object[][] var11 = var6.b();
      if((var0[10] == null || ((ch)var0[10]).r) && (null != var10 || var11 != null)) {
         Object[] var12 = mca.a(true, ((int[])((int[])var0[1]))[6], lja.d);
         if(null != var12[11]) {
            var12 = vs.a(0 != bw.b?eo.g:qba.h, var12, (byte)-84);
         }

         if(var12 != null) {
            var0[10] = ch.b(kda.d, true);
         }
      }

      if(var0[10] != null) {
         var6.a(var5);
         if(var3) {
            ((ch)var0[10]).a(var8, (long)kda.d, var10, var11, false);
         } else {
            ((ch)var0[10]).a((long)kda.d);
         }

         ((ch)var0[10]).a(((byte[])((byte[])var0[4]))[0], var7, var2, var9, var4);
      }

   }

   static final void a(boolean var0, Object[] var1) {
      if(null == var1[12]) {
         var1[12] = new int[41];
      }

      if(!var0) {
         a(((boolean[])((boolean[])((Object[])((Object[])var1[3]))[20]))[1], (Object[])((Object[])((Object[])((Object[])d[3]))[1]));
      }

      ++a;
      if(var1[10] == null) {
         var1[10] = new byte[8];
      }

      if(var1[8] == null) {
         var1[8] = new boolean[10];
      }

   }

}
