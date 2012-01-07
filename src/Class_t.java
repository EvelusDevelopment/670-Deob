
final class Class_t {

   static int e;
   static int d;
   static Object[] c = nea.a((byte)-73, new Object[1], 2);
   static int a;
   static int b;


   static final void a(boolean var0, Object[] var1) {
      ++e;
      if(!var0) {
         c = (Object[])null;
      }

      if(0 < ((int[])((int[])var1[1]))[1]) {
         Object[] var2 = (Object[])((Object[])var1[3]);
         int var3 = ((int[])((int[])var1[1]))[1];
         int var4 = ((int[])((int[])var1[1]))[2];
         synchronized(var2) {
            Object[] var8 = ps.a((byte)-21, var4, new Object[2]);
            ((lm)(null == var8?null:var8[0])).e = (long)var3;
            client.a(-99, (Object[])((Object[])var2[56]), (lm)(var8 != null?var8[0]:null));
         }

         ((int[])((int[])var1[1]))[1] = 0;
      }

   }

   static final char a(Object[] var0, int var1) {
      if(var1 != 0) {
         c = (Object[])null;
      }

      ++a;
      if(var0 == null) {
         throw new IllegalStateException();
      } else {
         return wsa.a(var1 - 3055, var0);
      }
   }

   static final boolean a(int var0, Object[] var1) {
      if(var0 != 0) {
         c = (Object[])null;
      }

      ++b;
      return true;
   }

   static final void a(Object[] var0, byte var1) {
      int var2 = 105 / ((19 - var1) / 49);
      ++d;
      if(null != var0[7]) {
         ((boolean[])((boolean[])var0[13]))[0] = true;
         if(var0[9] == null) {
            var0[9] = ura.a(-114, new Object[2]);
         }

      }
   }

}
