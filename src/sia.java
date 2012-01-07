
final class sia {

   static Object[] d = pa.a("WIP", false, 2, new Object[2]);
   static int a;
   static int c;
   static int e;
   static int[] b;


   static final void a(Object[] var0, byte var1) {
      if(var1 == -114) {
         if(var0[0] == null) {
            var0[0] = new float[4];
         }

         ++c;
      }
   }

   static final void a(lua var0, Object[] var1, byte var2) {
      try {
         ++a;
         Object[] var3;
         if(var0 instanceof oa) {
            var3 = ((oa)var0).m;
         } else if(var0 instanceof oha) {
            var3 = ((oha)var0).e;
         } else {
            var3 = null;
         }

         int var5 = -74 / ((var2 - 46) / 41);
         if(var0 == null) {
            var1[4] = null;
            ((int[])((int[])var1[3]))[1] &= -17;
            if(((boolean[])((boolean[])var1[5]))[0]) {
               ica.a(var1, (byte)-82, 0L);
            }

            if(((int[])((int[])var1[3]))[1] == 0) {
               ((int[])((int[])var1[3]))[2] = 0;
               ((int[])((int[])var1[3]))[0] = 0;
            }
         } else {
            if(((int[])((int[])var1[3]))[1] != 0) {
               if(((int[])((int[])var1[3]))[2] != pga.b(var3, 0).c() || ~((int[])((int[])var1[3]))[0] != ~pga.b(var3, 0).b()) {
                  throw new RuntimeException();
               }
            } else {
               ((int[])((int[])var1[3]))[0] = pga.b(var3, 0).b();
               ((int[])((int[])var1[3]))[2] = pga.b(var3, 0).c();
               il.b((byte)125, var1);
            }

            ((int[])((int[])var1[3]))[1] |= 16;
            var1[4] = var3;
            if(((boolean[])((boolean[])var1[5]))[0]) {
               ica.a(var1, (byte)-120, du.a((int)-117, var3));
            }
         }

      } catch (RuntimeException var6) {
         throw vt.a(var6, "sia.C(" + (var0 != null?"{...}":"null") + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ')');
      }
   }

   static final void a(byte var0) {
      if(0 > ln.b) {
         rd.s = -1;
         ln.b = 0;
         dq.f = -1;
      }

      ++e;
      if(eka.f < ln.b) {
         dq.f = -1;
         rd.s = -1;
         ln.b = eka.f;
      }

      if(var0 != -68) {
         a((lua)null, (Object[])null, (byte)69);
      }

      if(jw.c < 0) {
         rd.s = -1;
         dq.f = -1;
         jw.c = 0;
      }

      if(jw.c > eka.K) {
         dq.f = -1;
         jw.c = eka.K;
         rd.s = -1;
      }

   }

}
