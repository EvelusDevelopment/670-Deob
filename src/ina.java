import java.awt.Canvas;
import java.awt.Rectangle;

final class ina {

   static Object[][] a = new Object[6][];
   static int c;
   static int d;
   static int b;
   static int f;
   static int e;


   static final Object[] a(Canvas var0, int var1, Object[] var2, Object[] var3, int var4, int var5) {
      int var6 = -18 % ((var5 - 6) / 47);
      nja.a(var2, 3);
      wea var8 = new wea(var2);
      var2[0] = var3;
      ((int[])((int[])var2[1]))[0] = var1;
      var2[5] = var0;
      ((int[])((int[])var2[1]))[1] = var4;
      var2[3] = var8;
      ++d;
      new Rectangle();
      qea.a((byte)87, var2);
      return var2;
   }

   static final void a(int var0, Object[] var1, int var2, Object[] var3, Object[] var4, int var5) {
      if(var5 > 95) {
         ++e;
         nma.e = var1;
         tn.a(var4, var0, var2, 1);
         nma.e = null;
      }
   }

   static final Object[] a(Object[] var0, boolean var1, boolean var2, Object[] var3, Object[] var4) {
      if(var2) {
         return (Object[])null;
      } else {
         ep.a('\u8893', var1, var4, var3, (byte)14);
         ++f;
         var3[5] = var0;
         return var3;
      }
   }

   static final int a(Object[] var0, String var1, int var2, cga[] var3, int var4) {
      if(var0 != null && (12 == var0.length && var0[3].equals(Integer.valueOf(0)) || var0.length == 7)) {
         jh.a(-60, false, (Object[])null);
      }

      if(var2 != -60) {
         a = (Object[][])((Object[][])var0[0]);
      }

      ++c;
      int var5 = po.a(var0, Class_v.a, new int[]{var4}, -118, var1, var3);
      int var6 = 0;

      for(int var7 = 0; var5 > var7; ++var7) {
         int var8 = ob.a(var0, Class_v.a[var7], false, var3);
         if(var8 > var6) {
            var6 = var8;
         }
      }

      return var6;
   }

   static final void a(int var0, Object[] var1) {
      ++b;
      var1[2] = sj.a(var0, new Object[3], (byte)-70);
   }

}
