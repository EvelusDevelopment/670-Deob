import java.awt.Component;
import java.awt.Dimension;

final class hv {

   static int f_i;
   static int d;
   static int b;
   static Object[] a = ed.a(0, new Object[1], (byte)-111, 113);
   static Object[] g = null;
   static int c;
   static int e;
   static int h = -1;
   static int[][] f = new int[][]{{6, 6}, {6, 6}, {6, 5, 5}, {5, 6, 5}, {5, 5, 6}, {6, 5, 5}, {5, 0, 4, 1}, {7, 7, 1, 2}, {7, 1, 2, 7}, {8, 9, 4, 0, 8, 9}, {0, 8, 9, 8, 9, 4}, {11, 0, 10, 11, 4, 2}, {6, 6}, {7, 7, 1, 2}, {7, 7, 1, 2}};


   static final void a(Object[] var0, boolean var1) throws Throwable {
      ++c;
      if(!var1) {
         ((long[])((long[])((Object[])((Object[])((Object[])((Object[])var0[18]))[5]))[1]))[0] = ((long[])((long[])g[0]))[2];
      }

      hw.a(var0, -16774);
      ((jaa)var0[0]).a(27106);
   }

   static final void a(Object[] var0, Object[] var1, byte var2) {
      if(var2 == -97) {
         ++e;
         if(var0[1] != null) {
            ((byte[])((byte[])var1[5]))[0] = ((byte[])((byte[])var0[3]))[1];
            ((byte[])((byte[])var1[5]))[1] = ((byte[])((byte[])var0[3]))[0];
         }

         var1[4] = var0[1];
      }
   }

   static final void a(int var0) {
      ++b;
      dq.a(38, fr.g);
      dq.a(-125, ic.f);
      dq.a(-103, jl.b);
      dq.a(var0 - 115, Class_ls.m);
      if(var0 != 4) {
         a((int)54, new Object[1]);
      }

   }

   static final td a(byte var0, Object[] var1) {
      ++d;
      return var0 <= 57?(td)((Object[])((Object[])a[4]))[6]:new td(var1);
   }

   static final void a(int var0, Object[] var1) {
      if(var0 != 3444) {
         a(((byte[])((byte[])((Object[])((Object[])g[0]))[6]))[0], (Object[])null);
      }

      ++f_i;
      Dimension var2 = ((Component)var1[2]).getSize();
      ((int[])((int[])var1[5]))[0] = var2.width;
      ((int[])((int[])var1[5]))[1] = var2.height;
   }

}
