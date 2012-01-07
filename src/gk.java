import java.math.BigInteger;

final class gk {

   static int a;
   static int e;
   static int d;
   static int b;
   static int c;


   static final void b(Object[] var0, int var1) {
      ++d;
      if(var0[1] == null) {
         var0[1] = new int[1];
      }

      if(null == var0[3]) {
         var0[3] = new char[1];
      }

      if(null == var0[var1]) {
         var0[2] = new boolean[1];
      }

   }

   static final void b(int var0, Object[] var1) {
      if(null == var1[var0]) {
         var1[5] = new boolean[2];
      }

      ++b;
      if(null == var1[1]) {
         var1[1] = new int[2];
      }

   }

   static final boolean c(Object[] var0, int var1) {
      ++e;
      if(var1 >= -2) {
         a(-31, (Object[])null);
      }

      return !se.a((Object[])((Object[])var0[0]), (byte)-122);
   }

   static final int a(Object[] var0, int var1) {
      ++a;
      if(var1 != -16356) {
         return ((int[])((int[])((Object[])((Object[])((Object[])((Object[])var0[0]))[18]))[12]))[18];
      } else {
         int var2;
         if(null != var0[7]) {
            Object[] var4 = (Object[])((Object[])var0[7]);
            int var3;
            synchronized(var4) {
               var3 = ((int[])((int[])var4[1]))[1];
            }

            var2 = var3;
            if(client.f_vb == 0) {
               return var2;
            }
         }

         var2 = 0;
         return var2;
      }
   }

   static final boolean a(int var0, Object[] var1) {
      try {
         ++c;
         if(null != var1[4]) {
            return true;
         } else {
            if(null == var1[1]) {
               if(rs.a(12, (Object[])((Object[])var1[2]))) {
                  return false;
               }

               var1[1] = vla.a(255, true, 255, (Object[])((Object[])var1[2]), -116, (byte)0);
            }

            if(((boolean[])((boolean[])((Object[])((Object[])var1[1]))[0]))[0]) {
               return false;
            } else {
               Object[] var2 = jta.a((byte)-108, vv.a((byte)-28, (Object[])((Object[])var1[1])), new Object[3]);
               ((int[])((int[])var2[1]))[0] = 5;
               int var3 = fh.a(var2, false);
               ((int[])((int[])var2[1]))[0] += var3 * 72;
               byte[] var4 = new byte[((byte[])((byte[])var2[2])).length + -((int[])((int[])var2[1]))[0]];
               Class_h.a((byte)-71, var4.length, var2, var4, 0);
               byte[] var5;
               if(var1[5] != null && null != var1[3]) {
                  BigInteger var6 = new BigInteger(var4);
                  BigInteger var7 = var6.modPow((BigInteger)var1[5], (BigInteger)var1[3]);
                  var5 = var7.toByteArray();
               } else {
                  var5 = var4;
               }

               if(-66 != ~var5.length) {
                  throw new RuntimeException();
               } else {
                  byte[] var9 = vja.a(77, -5 + -var4.length + ((int[])((int[])var2[1]))[0], (byte[])((byte[])var2[2]), 5);

                  for(int var10 = 0; 64 > var10; ++var10) {
                     if(~var5[var10 + 1] != ~var9[var10]) {
                        throw new RuntimeException();
                     }
                  }

                  if(var0 <= 100) {
                     return true;
                  } else {
                     var1[6] = new Object[var3][];
                     if(null != var1 && 9 == var1.length) {
                        a(103, new Object[8][]);
                     }

                     var1[4] = var2;
                     return true;
                  }
               }
            }
         }
      } catch (RuntimeException var8) {
         throw vt.a(var8, "gk.B(" + var0 + ',' + (var1 != null?"{...}":"null") + ')');
      }
   }

}
