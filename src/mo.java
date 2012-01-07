import javax.sound.sampled.Line;

final class mo extends oqa {

   static int k;
   static int j;
   static int f_l;
   static int f_i;
   static int m;


   mo(String var1) {
      super(var1);
   }

   static final int a(boolean var0, Object[] var1) {
      ++j;
      if(!ih.a(var1, 0)) {
         return !var0?-87:0;
      } else {
         int var2 = 0;
         if(ih.a(var1, 0)) {
            var2 |= ((int[])((int[])((Object[])((Object[])var1[2]))[1]))[2];
            if(((boolean[])((boolean[])var1[3]))[1] && ((Object[])((Object[])var1[4]))[3] != null) {
               var2 |= ((int[])((int[])((Object[])((Object[])var1[0]))[1]))[2];
            }
         }

         return var2;
      }
   }

   static final void c(Object[] var0, int var1) {
      int var2 = -22 % ((7 - var1) / 34);
      if(var0[9] != null) {
         ((Line)var0[9]).close();
         var0[9] = null;
      }

      ++k;
   }

   static final int a(Object[] var0, int var1) {
      if(var1 != 3) {
         ((byte[])((byte[])var0[19]))[24] = 70;
      }

      ++m;
      return 0;
   }

   static final void b(Object[] var0, int var1) {
      if(var1 != -1511823029) {
         a((Object[])((Object[])var0[1]), -3);
      }

      ++f_i;
      if(null == var0[1]) {
         var0[1] = new int[1];
      }

   }

   static final void a(int var0, int var1, int[] var2, int var3, Object[] var4) {
      if(var0 != -7) {
         a((Object[])null, -91);
      }

      ++f_l;
      int var5 = ((int[])((int[])var4[1]))[0];
      ((int[])((int[])var4[1]))[0] = var3;
      int var6 = (-var3 + var1) / 8;
      if(var4 != null && (var4.length == 2 || var4.length == 6)) {
         bga.a((Object[])null, -790446368);
      }

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = lr.a(1, var4);
         int var9 = lr.a(1, var4);
         int var10 = 0;
         int var11 = -1640531527;

         for(int var12 = 32; -1 > ~(var12--); var9 += var10 + var2[(var10 & 6965) >>> 11] ^ (var8 >>> 5 ^ var8 << 4) + var8) {
            var8 += (var9 << 4 ^ var9 >>> 5) + var9 ^ var2[3 & var10] + var10;
            var10 += var11;
         }

         ((int[])((int[])var4[1]))[0] -= 8;
         op.putInt(var4, var8);
         if(var4 != null && -22 == ~var4.length) {
            kua.a((int)-113, new Object[4][]);
         }

         op.putInt(var4, var9);
      }

      ((int[])((int[])var4[1]))[0] = var5;
   }

}
