
final class gja {

   static Object[] a = ed.a(-1, new Object[1], (byte)-114, 82);
   static int b = -1;
   static int d;
   static Object[] c = ed.a(6, new Object[1], (byte)-105, 57);


   static final cga a(ta var0, boolean var1, int var2, Object[] var3) {
      ++d;
      int var4 = !var1?((int[])((int[])var3[1]))[21]:((int[])((int[])var3[1]))[13];
      if(var2 != 1) {
         return (cga)null;
      } else {
         int var5 = var4 | var0.G << 29;
         cga var6 = (cga)dna.a((byte)34, (Object[])((Object[])((Object[])((Object[])var3[0]))[3]), (long)var5);
         if(null != var6) {
            return var6;
         } else if(hp.a(-125, (Object[])((Object[])((Object[])((Object[])var3[0]))[0]), var4)) {
            aea var7 = aea.b((Object[])((Object[])((Object[])((Object[])var3[0]))[0]), var4, 0);
            if(var7 != null) {
               var6 = var0.a(var7, true);
               il.a((long)var5, var6, true, (Object[])((Object[])((Object[])((Object[])var3[0]))[3]));
            }

            return var6;
         } else {
            return null;
         }
      }
   }

}
