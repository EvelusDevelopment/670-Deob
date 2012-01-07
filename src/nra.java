
final class nra {

   static boolean d = false;
   static int[] a = new int[1];
   static int c;
   static int e;
   static int b;


   static final String a(String var0, int var1, Object[] var2, int var3) {
      if(var1 != 0) {
         a((Object[])((Object[])var2[8]), -128, (ta)null);
      }

      ++e;
      if(null == var2[5]) {
         return var0;
      } else {
         ns var4;
         Object[] var5 = null != (var4 = (ns)pm.a((long)var3, (Object[])((Object[])var2[5]), false))?var4.n:null;
         return null == var5?var0:(String)var5[0];
      }
   }

   static final void a(int var0, Object[] var1, int var2) {
      if(var0 != -8305) {
         a = (int[])null;
      }

      ++c;
      synchronized(var1) {
         Object[] var5 = ps.a((byte)114, var2, new Object[2]);
         client.a(var0 ^ -8198, (Object[])((Object[])var1[31]), (lm)(var5 != null?var5[0]:null));
      }
   }

   static final void a(Object[] var0, int var1, ta var2) {
      fla.a((Object[])((Object[])var0[var1]), -77, var2);
      ++b;
   }

}
