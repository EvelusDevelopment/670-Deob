import java.awt.Point;

final class jb {

   static int c;
   static int a;
   static Object[] b;


   static final Object[] a(int var0, Object[] var1) {
      ++c;
      return null != var1[var0] && null == ((Object[])((Object[])var1[21]))[0]?null:(Object[])((Object[])var1[21]);
   }

   static final void a(int var0, byte var1) {
      if(var1 == -43) {
         if(-1 == ~coa.a((Object[])((Object[])tu.d[31]), 11)) {
            var0 = -1;
         }

         ++a;
         if(var0 != sga.c) {
            if(~var0 != 0) {
               Object[] var2 = en.a(var0, ena.e, (byte)-115);
               aea var3;
               synchronized(var2) {
                  aea var5 = (aea)dna.a((byte)34, (Object[])((Object[])((Object[])((Object[])var2[0]))[2]), (long)((int[])((int[])var2[1]))[1]);
                  if(null != var5) {
                     var3 = var5;
                  } else {
                     var5 = aea.b((Object[])((Object[])((Object[])((Object[])var2[0]))[1]), ((int[])((int[])var2[1]))[1], 0);
                     if(null != var5) {
                        il.a((long)((int[])((int[])var2[1]))[1], var5, true, (Object[])((Object[])((Object[])((Object[])var2[0]))[2]));
                     }

                     var3 = var5;
                  }
               }

               if(null == var3) {
                  var0 = -1;
               } else {
                  wta.c.setcustomcursor(ru.d, var3.f(), var3.g(), var3.a(), new Point(((int[])((int[])var2[1]))[0], ((int[])((int[])var2[1]))[2]));
                  sga.c = var0;
               }
            }

            if(-1 == var0 && -1 != sga.c) {
               wta.c.setcustomcursor(ru.d, (int[])null, -1, -1, new Point());
               sga.c = -1;
            }

         }
      }
   }

   static {
      Object[] var1 = new Object[0];
      b = var1;
   }
}
