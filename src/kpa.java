
final class kpa {

   static int b;
   static cga[] e;
   static int f;
   static int a;
   static int c;
   static int d;


   static final void a(int var0) {
      Object[] var2;
      byte[] var4;
      if(mda.g == null) {
         var2 = new Object[5];
         jfa.a(0.55F, 5, 8, 8, 2, var2, 0.1F, (byte)-52, 3.0F, 8);
         var4 = vm.a(var2, 5, 16, 128, 128);
         mda.g = fja.a(-137, var4, false);
      }

      ++c;
      if(var0 == 16) {
         if(null == kia.h) {
            var2 = new Object[8];
            hba.a(16, 12, var2, 2, 2, 5, 0.45F, var0 ^ -18);
            var4 = bsa.a(128, 16, 128, (byte)-107, var2);
            kia.h = fja.a(-137, var4, false);
         }

      }
   }

   static final void a(Object[] var0, int var1) {
      if(var1 <= -24) {
         if(null == var0[1]) {
            var0[1] = new boolean[1];
         }

         ++f;
      }
   }

   static final void a(byte var0, Object[] var1) {
      ++b;
      if(null != var1) {
         vt.b(0, var1);
      } else {
         int var2 = -78 % ((27 - var0) / 48);
         throw new IllegalStateException();
      }
   }

   static final boolean a(int var0, Object[] var1, byte var2) {
      ++a;
      if(dea.a(((int[])((int[])var1[0]))[var0], 1528, ((int[])((int[])var1[7]))[var0], ((int[])((int[])var1[4]))[var0])) {
         ((short[])((short[])var1[6]))[var0] = (short)((int)vea.g[0]);
         ((short[])((short[])var1[3]))[var0] = (short)((int)vea.g[1]);
         if(var2 <= 26) {
            ((boolean[])((boolean[])var1[0]))[5] = ((boolean[])((boolean[])var1[0]))[12];
         }

         ((short[])((short[])var1[5]))[var0] = (short)((int)vea.g[2]);
         return true;
      } else {
         return false;
      }
   }

   static final int a(int var0, int var1, int var2, int var3) {
      int var4 = -54 / ((var1 - 12) / 52);
      if(var2 <= 243) {
         if(var2 <= 217) {
            if(192 >= var2) {
               if(var2 > 179) {
                  var0 >>= 1;
               }
            } else {
               var0 >>= 2;
            }
         } else {
            var0 >>= 3;
         }
      } else {
         var0 >>= 4;
      }

      ++d;
      return ((var3 & 255) >> 2 << 10) + (var0 >> 5 << 7) + (var2 >> 1);
   }

}
