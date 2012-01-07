import java.awt.Canvas;

final class fh {

   static int d;
   static int e;
   static int c;
   static int a;
   static Object[] b;
   static int f;


   static final void a(int var0, Object[] var1) {
      ++c;
      gm.c = var1;
      if(var0 != -8) {
         a(87, (Object[])((Object[])b[10]));
      }

   }

   static final int a(Object[] var0, boolean var1) {
      ++a;
      if(var1) {
         b = (Object[])null;
      }

      byte[] var10001 = (byte[])((byte[])var0[2]);
      int[] var10002 = (int[])((int[])var0[1]);
      int var10005 = ((int[])((int[])var0[1]))[0];
      var10002[0] = ((int[])((int[])var0[1]))[0] + 1;
      return 255 & var10001[var10005];
   }

   static final Object[] a(int var0, Object[] var1, Object[] var2) {
      if(var0 != 2) {
         b = (Object[])null;
      }

      ++d;
      aa.a(15022, var1, var2);
      return var2;
   }

   static final boolean a(int var0, int var1, int[] var2) {
      ++e;
      if(cb.n[var0]) {
         return true;
      } else {
         hca.f[var0] = dk.a(var2, hca.f[var0], var0, (byte)119, false);
         if(hca.f[var0] == null) {
            return false;
         } else {
            cb.n[var0] = true;
            return var1 == 25401;
         }
      }
   }

   static final ta a(int var0, int var1, int var2, qa var3, Canvas var4) {
      ++f;
      Object[] var5;
      return var1 != 2?(ta)null:(ta)((var5 = ui.a(new Object[15], var4, var3, var0, var2)) != null?var5[6]:null);
   }

}
