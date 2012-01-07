import java.awt.event.KeyEvent;

final class kba {

   static int c = 0;
   static int b;
   static int d;
   static int a;


   static final Object[] a(int var0, int var1, int var2, int var3, int var4, Object[] var5, int var6, int var7, Object[] var8) {
      if(var8[1] == null) {
         var8[1] = new int[6];
      }

      ++b;
      uf.a(var8, true);
      ((int[])((int[])var8[1]))[var7] = var2;
      var8[0] = var5;
      ((int[])((int[])var8[1]))[1] = var1;
      if(null != var8 && var8.length == 4 && var8[0].equals(Boolean.valueOf(false))) {
         uf.a(true, (Object[])null);
      }

      ((int[])((int[])var8[1]))[2] = var0;
      ((int[])((int[])var8[1]))[5] = var3;
      ((int[])((int[])var8[1]))[4] = var4;
      ((int[])((int[])var8[1]))[3] = var6;
      return var8;
   }

   static final void a(byte var0, Object[] var1) throws Throwable {
      ((po)var1[0]).a((byte)111);
      if(var0 != 19) {
         a((Object[])null, ((int[])((int[])((Object[])((Object[])var1[3]))[11]))[2], (KeyEvent)var1[2]);
      }

      ++a;
   }

   static final void a(Object[] var0, int var1, KeyEvent var2) {
      synchronized(var0) {
         kma.a((byte)26, var2, var1, var0);
      }

      ++d;
   }

}
