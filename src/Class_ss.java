
final class Class_ss {

   static Object[] c = sd.a(new Object[1], 124, (byte)118);
   static int e;
   static int d;
   static int b;
   static int f = 0;
   static int a;


   static final bh a(Object[] var0, byte var1) {
      ++b;
      return var1 > -102?(bh)c[0]:new bh(var0);
   }

   static final boolean a(int var0, int var1, Object[] var2, int var3) {
      ++e;
      if(isa.a((byte)92, var0, var3, var2)) {
         if(null != ((Object[][])((Object[][])var2[4]))[var3] && ((Object[][])((Object[][])var2[4]))[var3][var0] != null) {
            return true;
         } else if(((Object[])((Object[])var2[5]))[var3] != null) {
            return true;
         } else {
            td.a(var3, var2, 5);
            return null != ((Object[])((Object[])var2[var1]))[var3];
         }
      } else {
         return false;
      }
   }

   static final int b(Object[] var0, int var1) {
      if(var1 != 0) {
         c[2] = (Object)null;
      }

      ++d;
      return ((int[])((int[])var0[1]))[0];
   }

   static final void a(Object[] var0, int var1) {
      ++a;
      if(null != var0 && -22 == ~var0.length) {
         bm.a(var0, -87);
      } else {
         if(var1 != 5) {
            a((Object[])((Object[])var0[1]), ((byte[])((byte[])var0[1]))[1]);
         }

         if(var0 != null && 9 == var0.length) {
            ns.a(var0, true);
         } else {
            throw new IllegalStateException();
         }
      }
   }

}
