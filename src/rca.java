import java.awt.Canvas;
import java.lang.reflect.Method;

final class rca {

   static int g = 0;
   static int e;
   static Object[] b = ed.a(8, new Object[1], (byte)-108, 2);
   private Object[] d;
   static int h;
   static int c;
   static int f;
   static int a;


   static final void a(Object[] var0, int var1, int var2, Object[] var3) {
      if(0 == var1) {
         ((int[])((int[])var0[1]))[2] = de.a(var2 ^ 2, var3) << 4;
      } else if(var1 == 1) {
         ((boolean[])((boolean[])var0[3]))[0] = -2 == ~fh.a(var3, false);
      }

      ++f;
      if(var2 != 2) {
         ((int[])((int[])b[2]))[12] = ((int[])((int[])b[0]))[6];
      }

   }

   public final String toString() {
      ++c;
      return rpa.a((byte)-98, this.d);
   }

   rca(Object[] var1) {
      this.d = var1;
   }

   static final void a(int var0, Canvas var1) {
      if(var0 <= 8) {
         ((long[])((long[])((Object[])((Object[])b[18]))[21]))[0] = 71L;
      }

      try {
         Class var2 = Class.forName("java.awt.Canvas");
         Method var3 = var2.getMethod("setIgnoreRepaint", new Class[]{Boolean.TYPE});
         var3.invoke(var1, new Object[]{Boolean.TRUE});
      } catch (Exception var4) {
         ;
      }

      ++h;
   }

   static final cma a(Object[] var0, byte var1) {
      if(var1 != 113) {
         b = (Object[])((Object[])var0[1]);
      }

      ++e;
      return new cma(var0);
   }

   static final Object[] a(byte var0) {
      int var1 = 23 % ((var0 + 72) / 41);
      ++a;
      return cl.a(0, new Object[1]);
   }

}
