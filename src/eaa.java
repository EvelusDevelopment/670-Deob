import jagdx.IDirect3DDevice;

final class eaa {

   static int b;
   static int e;
   static int a;
   static Object[] c = ho.a(4, 80, new Object[1], true);
   static boolean d = false;


   static final void a(Object[] var0, lua var1, byte var2) {
      try {
         ++e;
         Object[] var7 = wk.a((byte)121, (re)var1);
         if(null != var1) {
            if(16 == (((int[])((int[])var0[1]))[3] | 16)) {
               ((int[])((int[])var0[1]))[1] = mma.a(var7, 102).b();
               ((int[])((int[])var0[1]))[2] = mma.a(var7, 124).c();
               Object[] var4;
               if((var0 == null?null:var0[3]) == ((ta)((var4 = (Object[])((Object[])var0[2])) == null?null:var4[55])).e(var2 ^ 30642)) {
                  Class_f.a((byte)90, (Object[])((Object[])var0[2]));
               }
            } else if(~((int[])((int[])var0[1]))[2] != ~mma.a(var7, -103).c() || ((int[])((int[])var0[1]))[1] != mma.a(var7, -104).b()) {
               throw new RuntimeException();
            }

            ((int[])((int[])var0[1]))[3] |= 16;
            var0[0] = var7;
         } else {
            ((int[])((int[])var0[1]))[3] &= -17;
            var0[0] = null;
            if(0 == ((int[])((int[])var0[1]))[3]) {
               ((int[])((int[])var0[1]))[2] = 0;
               ((int[])((int[])var0[1]))[1] = 0;
            }
         }

         if(var2 == 16) {
            Object[] var6;
            if((null != var0?var0[3]:null) == ((ta)(null == (var6 = (Object[])((Object[])var0[2]))?null:var6[55])).e(30626)) {
               lo.a(var0, var2 ^ '\u8d10');
            } else {
               ((int[])((int[])var0[1]))[0] |= 16;
            }

         }
      } catch (RuntimeException var8) {
         throw vt.a(var8, "eaa.B(" + (var0 != null?"{...}":"null") + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ')');
      }
   }

   static final void a(Object[] var0, boolean var1, int var2, int var3) {
      ++a;
      if(var1) {
         IDirect3DDevice.Clear(((long[])((long[])var0[50]))[5], var3, var2, 1.0F, 0);
      }
   }

   static final boolean a(int var0, int var1, int var2) {
      int var3 = 45 / ((42 - var0) / 46);
      ++b;
      return 0 != (1024 & var2);
   }

}
