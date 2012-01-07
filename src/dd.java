
final class dd {

   static int c;
   static int b;
   static int e;
   static int d;
   static int a;


   static final Object[] a(boolean var0, Object[] var1, Object[] var2, int var3) {
      ++c;
      if(var1 != null && var1.length == 21) {
         return null;
      } else {
         Object[] var7 = daa.a(24, new Object[6]);
         ((int[])((int[])var7[4]))[0] = 1;
         synchronized(var2[3]) {
            if(var1 != null && (-36 == ~var1.length && var1[13].equals(Integer.valueOf(1)) || var1.length == 1)) {
               return null;
            }

            rw var4;
            rw var5;
            for(Object[] var9 = null != (var4 = (rw)gm.a((Object[])((Object[])var2[3]), 0))?var4.y:null; null != var9; var9 = (var5 = (rw)dka.a((Object[])((Object[])var2[3]), (byte)102)) == null?null:var5.y) {
               if(~((long)var3) == ~((tha)(null == var9?null:var9[1])).m && var9[2] == var1 && 2 == ((int[])((int[])var9[4]))[0]) {
                  ((boolean[])((boolean[])var7[0]))[0] = false;
                  var7[5] = var9[5];
                  return var7;
               }
            }
         }

         var7[5] = rc.a(var1, var3, 15);
         ((boolean[])((boolean[])var7[0]))[1] = var0;
         ((boolean[])((boolean[])var7[0]))[0] = false;
         return var7;
      }
   }

   static final void a(int var0, int var1, byte var2, int var3, int var4, Object[] var5) {
      ((int[])((int[])var5[1]))[18] = var1;
      ((int[])((int[])var5[1]))[11] = var0;
      ((int[])((int[])var5[1]))[13] = var4;
      int var6 = 29 % ((var2 - 59) / 60);
      ((int[])((int[])var5[1]))[14] = var3;
      ++a;
      loa.b((byte)-123, var5);
   }

   static final Object[] a(Object[] var0, int var1) {
      gq.a((byte)-120, var0);
      ++b;
      kj.a(var0, -127);
      return var1 != 2?(Object[])((Object[])var0[5]):var0;
   }

   static final void a(byte var0, boolean var1, int var2, Object[] var3) {
      ++d;
      Object[] var4 = ro.a((int)3, var3);
      if(var0 == 0) {
         if(var1 || ((int[])((int[])var4[1]))[17] != 0 || ((int[])((int[])var3[12]))[27] != 0) {
            ((int[])((int[])var3[12]))[31] = var2 & 16383;
            dfa.a(1, (Object[])((Object[])var3[35]), ((int[])((int[])var3[12]))[31]);
         }
      }
   }

   static final Object[] a(Object[] var0, boolean var1, Object[] var2, Object[] var3, Object[] var4, int var5) {
      ++e;
      sm.b(var4, 124);
      var4[1] = var3;
      if(var1) {
         return (Object[])null;
      } else {
         var4[3] = var0;
         jla.a((Object[])((Object[])var4[3]), (byte)-82, 33);
         return var4;
      }
   }

}
