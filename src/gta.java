
final class gta {

   static lh a;
   static int b;
   static Object[] d = ho.a(9, 21, new Object[1], true);
   static Object[] c = sl.a("28", 0, new Object[1], "28");


   static final byte[] a(byte[] var0, int var1) {
      try {
         ++b;
         if(var1 != 9) {
            return (byte[])((byte[])d[0]);
         } else {
            Object[] var2 = jta.a((byte)-123, var0, new Object[3]);
            int var3 = fh.a(var2, false);
            int var4 = lr.a(1, var2);
            if(var4 >= 0 && (0 == he.g || he.g >= var4)) {
               if(var3 == 0) {
                  byte[] var11 = new byte[var4];
                  Class_h.a((byte)-71, var4, var2, var11, 0);
                  return var11;
               } else {
                  int var5 = lr.a(1, var2);
                  if(var5 >= 0 && (he.g == 0 || he.g >= var5)) {
                     byte[] var6 = new byte[var5];
                     if(1 != var3) {
                        Object[] var7 = dja.f;
                        synchronized(dja.f) {
                           wf.a(dja.f, var2, (byte)122, var6);
                        }
                     } else {
                        wja.a(var6, var5, var0, var4, 9);
                     }

                     return var6;
                  } else {
                     throw new RuntimeException();
                  }
               }
            } else {
               throw new RuntimeException();
            }
         }
      } catch (RuntimeException var10) {
         throw vt.a(var10, "gta.A(" + (var0 != null?"{...}":"null") + ',' + var1 + ')');
      }
   }

}
