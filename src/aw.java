
final class aw {

   static int d;
   static int b;
   static int a;
   static int c;


   static final void a(int var0, int var1, int var2, int var3, boolean var4, int var5, ta var6, int var7) {
      ++a;
      var6.d(var7, var3, var5, var1, var0, 14851);
      var6.d(16, 1 + var3, -2 + var5, 1 + var1, var2, 14851);
      if(!var4) {
         a(107, (Object[])null);
      }

      var6.a(18 + var3, (byte)-121, var2, var5 - 2, var7 - 19, 1 + var1);
   }

   static final void a(byte var0) {
      if(var0 >= 6) {
         if(ob.e != null) {
            ob.e.a((byte)17);
            ob.e = null;
            vja.f = null;
         }

         ++b;
      }
   }

   static final bc a(int var0, Object[] var1) {
      ++d;
      return var0 != 512?(bc)null:new bc(var1);
   }

   static final void a(int var0, int var1, int var2, int var3, byte var4, int var5) {
      pia.b = var0;
      of.b = var2;
      mma.a = var5;
      ++c;
      rf.f = var1;
      mka.b = var3;
      if(mma.a >= 100) {
         int var6 = pia.b * 512 + 256;
         int var7 = 256 + 512 * mka.b;
         int var8 = Class_ds.a(jca.n, var6, var7, (byte)122) - of.b;
         int var9 = var6 - woa.M;
         int var10 = var8 + -qt.e;
         int var11 = -pta.f + var7;
         int var12 = (int)Math.sqrt((double)(var9 * var9 + var11 * var11));
         qaa.r = (int)(2607.5945876176133D * Math.atan2((double)var10, (double)var12)) & 16383;
         cp.a = 16383 & (int)(Math.atan2((double)var9, (double)var11) * -2607.5945876176133D);
         if(qaa.r < 1024) {
            qaa.r = 1024;
         }

         kk.f_l = 0;
         if(3072 < qaa.r) {
            qaa.r = 3072;
         }
      }

      nca.a = -1;
      hh.b = -1;
      if(var4 == -114) {
         ha.e = 4;
      }
   }

}
