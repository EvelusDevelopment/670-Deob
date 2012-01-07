import java.awt.Component;
import java.awt.Graphics;

final class soa {

   static Object[] f = nb.a((byte)117, 8, new Object[5]);
   static int e;
   static int a;
   static int d;
   static int b;
   static int c;


   static final void a(Object[] var0, boolean var1, Object[] var2) {
      if(var1) {
         a((Object[])((Object[])var2[1]), ((byte[])((byte[])((Object[])((Object[])var2[8]))[1]))[0]);
      }

      ++d;
      jk.a(2, var0, var2);
   }

   static final void a(Object[] var0, int var1) {
      if(var0[var1] == null) {
         var0[1] = new int[1];
      }

      ++e;
   }

   static final hf a(Object[] var0, byte var1) {
      ++c;
      return var1 < 107?(hf)null:new hf(var0);
   }

   static final int a(Object[] var0, boolean var1) {
      ++a;
      if(var1) {
         a(((int[])((int[])var0[9]))[2], (Object[])((Object[])var0[0]), (Graphics)f[3]);
      }

      return (1845515 & ((int[])((int[])var0[1]))[0]) >> 18;
   }

   static final void a(int var0, Object[] var1, Graphics var2) {
      ((Component)var1[1]).update(var2);
      if(var0 == 8) {
         ++b;
      }
   }

}
