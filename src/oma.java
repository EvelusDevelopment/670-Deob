
final class oma {

   static Object[] b = ed.a(0, new Object[1], (byte)-107, 109);
   static int g;
   static int h;
   static int d;
   static int c;
   static int a;
   static Object[] f;
   static int e;


   static final Object[] a(Object[] var0, int var1, int var2, Object[] var3, byte var4) {
      bua.a(var3, (byte)-23);
      ++g;
      tra.a((byte)-92, var3);
      var3[4] = vk.f;
      ((int[])((int[])var3[1]))[0] = var2;
      var3[10] = var0;
      ((int[])((int[])var3[1]))[2] = var1;
      if(var4 <= 64) {
         f = (Object[])null;
      }

      return var3;
   }

   static final Object[] a(Object[] var0, byte var1) {
      ++a;
      lca.a(var0, (byte)-112);
      int var2 = -22 % ((var1 - 7) / 61);
      return var0;
   }

   static final int a(Object[] var0, int var1, int var2) {
      ++e;
      if(var2 != 9111) {
         a((Object[])null, 32, 70, (Object[])null, (byte)12);
      }

      return 1;
   }

   static final void a(int var0, int var1, Object[] var2, int var3) {
      ++h;
      if(var2 != null && (var2.length == 5 && -8 == ~((int[])((int[])var2[1])).length || var2.length == 6 || 8 == var2.length)) {
         ((int[])((int[])var2[1]))[5] += ((int[])((int[])var2[4]))[var1] * var0 >> 12;
      } else if(var2 != null && (var2.length == 7 || -5 == ~var2.length || 5 == var2.length && ((int[])((int[])var2[1])).length == 13)) {
         lg.a(var1, var2, var0, 4095);
      } else {
         if(var3 <= 27) {
            f = (Object[])null;
         }

         throw new IllegalStateException();
      }
   }

   static final Object[] a(int var0, int var1, int var2) {
      ++d;
      Object[] var4 = new Object[2];
      if(var4[1] == null) {
         var4[1] = new int[4];
      }

      if(var4 != null && 15 == var4.length && var4[1].equals(Integer.valueOf(0))) {
         return null;
      } else {
         ((int[])((int[])var4[1]))[3] = 1 + var1 + 5;
         ((int[])((int[])var4[1]))[var2] = 1 + var0 + 5;
         ((int[])((int[])var4[1]))[0] = -1;
         ((int[])((int[])var4[1]))[2] = -1;
         var4[0] = new int[((int[])((int[])var4[1]))[1]][((int[])((int[])var4[1]))[3]];
         kh.a(89, var4);
         return var4;
      }
   }

   static final void a(byte var0, Object[] var1) {
      int var2 = 124 % ((54 - var0) / 58);
      ++c;
      ((int[])((int[])var1[1]))[0] = -1;
   }

}
