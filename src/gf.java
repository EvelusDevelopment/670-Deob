import jaggl.OpenGL;
import java.awt.Frame;

final class gf {

   static short[] a;
   static int c;
   static Frame b;
   static int d;


   static final void a(int var0, Object[] var1, byte var2) {
      ++c;
      synchronized(var1[4]) {
         fua.a(var2 + 167, (Object[])((Object[])var1[4]), var0);
      }

      synchronized(var1[2]) {
         fua.a(-84, (Object[])((Object[])var1[2]), var0);
      }

      synchronized(var1[3]) {
         fua.a(127, (Object[])((Object[])var1[3]), var0);
      }

      if(var2 != -77) {
         ((boolean[])((boolean[])((Object[])((Object[])var1[0]))[3]))[4] = ((boolean[])((boolean[])var1[10]))[1];
      }

      synchronized(var1[8]) {
         fua.a(-105, (Object[])((Object[])var1[8]), var0);
      }
   }

   static final void a(Object[] var0, int var1, int var2, int var3, Object[] var4) {
      ++d;
      byte var5;
      int var6;
      if(var0 == rma.a) {
         var5 = 1;
         var6 = var3 * 2;
      } else if(qv.k == var0) {
         var6 = var3 + 1;
         var5 = 3;
      } else if(vqa.j != var0) {
         if(dw.a == var0) {
            var6 = var3 + 2;
            var5 = 6;
         } else if(var0 != ah.f_i) {
            var5 = 0;
            var6 = var3;
         } else {
            var5 = 5;
            var6 = 2 + var3;
         }
      } else {
         var6 = 3 * var3;
         var5 = 4;
      }

      OpenGL.glDrawArrays(var5, var1, var6);
      if(var2 <= 124) {
         a(122, (Object[])((Object[])var4[4]), (byte)-96);
      }

   }

}
