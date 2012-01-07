
final class ng {

   static int h;
   static int b;
   static int f_i;
   static int e;
   static int j;
   static int d;
   static int f;
   static Object[] c = vra.a(536870911, 15, "", new Object[1]);
   static Object[] a = Class_fs.a(2, (byte)-73, new Object[1], 0, 1, 2);
   static boolean g = false;


   static final void a(ka var0, byte var1, Object[] var2) {
      ++f;
      if(var1 != -30) {
         a(-73, ((int[])((int[])((Object[])((Object[])var2[5]))[1]))[2], (Object[])((Object[])var2[0]), (Object[])null);
      }

      int var3 = ((int[])((int[])((Object[])((Object[])var2[24]))[0]))[1];
      int var4 = ((int[])((int[])((Object[])((Object[])var2[28]))[0]))[1];
      if(var3 != 0 || var4 != 0) {
         int var5 = var0.pa() / 2;
         var0.K(0, -var5, 0);
         var0.fa(var3 & 16383);
         var0.UA(var4 & 16383);
         var0.K(0, var5, 0);
      }

   }

   static final void a(int var0, int var1, Object[] var2, Object[] var3) {
      ++b;
      if(5 != var0) {
         if(6 != var0) {
            if(3 != var0) {
               if(4 == var0) {
                  ((int[])((int[])var3[1]))[5] = fh.a(var2, false);
               } else if(var0 == 1) {
                  ((int[])((int[])var3[1]))[4] = fh.a(var2, false);
               } else if(var0 == 2) {
                  ((int[])((int[])var3[1]))[3] = jia.c(-8166, var2);
                  if(0 > ((int[])((int[])var3[1]))[3]) {
                     var3[6] = new short[((int[])((int[])var3[1]))[4]];

                     for(int var4 = 0; ((int[])((int[])var3[1]))[4] > var4; ++var4) {
                        ((short[])((short[])var3[6]))[var4] = (short)jia.c(-8166, var2);
                     }

                     if(var2 != null && -8 == ~var2.length && var2[1].equals(Boolean.valueOf(false))) {
                        return;
                     }
                  }
               } else if(0 == var0) {
                  ((boolean[])((boolean[])var3[3]))[1] = fh.a(var2, false) == 1;
               }
            } else {
               ((int[])((int[])var3[1]))[1] = ((int[])((int[])var3[1]))[2] = fh.a(var2, false);
            }
         } else {
            ((int[])((int[])var3[1]))[2] = fh.a(var2, false);
         }
      } else {
         ((int[])((int[])var3[1]))[1] = fh.a(var2, false);
      }

      if(var1 < 67) {
         a((Object[])null, ((boolean[])((boolean[])c[7]))[2], ((boolean[])((boolean[])c[0]))[1], false);
      }

   }

   static final long b(int var0, Object[] var1) {
      ++h;
      if(null != var1 && 2 == var1.length) {
         return 30L;
      } else {
         long var2 = System.nanoTime();
         if(var0 <= 74) {
            c = (Object[])null;
         }

         long var4 = -((long[])((long[])var1[0]))[0] + var2;
         ((long[])((long[])var1[0]))[0] = var2;
         if(4999999999L > ~var4 && var4 < 5000000000L) {
            ((long[])((long[])var1[2]))[((int[])((int[])var1[1]))[1]] = var4;
            ((int[])((int[])var1[1]))[1] = (((int[])((int[])var1[1]))[1] + 1) % 10;
            if(((int[])((int[])var1[1]))[0] < 1) {
               ++((int[])((int[])var1[1]))[0];
            }
         }

         long var6 = 0L;

         for(int var8 = 1; ~var8 >= ~((int[])((int[])var1[1]))[0]; ++var8) {
            var6 += ((long[])((long[])var1[2]))[(10 + -var8 + ((int[])((int[])var1[1]))[1]) % 10];
         }

         return var6 / (long)((int[])((int[])var1[1]))[0];
      }
   }

   static final void a(int var0, Object[] var1) {
      if(var0 != 28566) {
         a((re)c[0], -9);
      }

      ++e;
      if(var1[1] == null) {
         var1[1] = new int[2];
      }

   }

   static final Object[] a(re var0, int var1) {
      if(var1 <= 1) {
         a((ka)null, (byte)-62, (Object[])null);
      }

      ++d;
      return var0 instanceof kk?((kk)var0).j:(var0 instanceof Class_h?((Class_h)var0).a:(var0 instanceof jc?((jc)var0).c:null));
   }

   static final void a(Object[] var0, boolean var1, boolean var2, boolean var3) {
      ++j;
      if(var0 != null && var0.length == 15) {
         tq.a(var3, var1, true, var0);
      } else {
         tq.a(var3, var1, true, var0);
         if(var2) {
            b(108, (Object[])null);
         }

      }
   }

   static final int a(ta var0, int var1, Object[] var2) {
      ++f_i;
      if(~((int[])((int[])var2[1]))[5] == 0) {
         if(((int[])((int[])var2[1]))[6] != -1) {
            Object[] var3 = var0.k.a(((int[])((int[])var2[1]))[6], (byte)37);
            if(!((boolean[])((boolean[])var3[3]))[7]) {
               return ((short[])((short[])var3[2]))[0];
            }
         }

         int var4 = -27 / ((-52 - var1) / 44);
         return ((int[])((int[])var2[1]))[2];
      } else {
         return ((int[])((int[])var2[1]))[5];
      }
   }

}
