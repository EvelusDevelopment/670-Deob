
final class Class_i {

   static int a;
   static int f;
   static int c;
   static int e;
   static int b;
   static int g;
   static int d;


   static final void a(Object[] var0, int var1, int var2) {
      ++e;

      mt var3;
      mt var4;
      for(Object[] var5 = null == (var3 = (mt)dda.a((Object[])((Object[])((Object[])((Object[])var0[4]))[0]), 2))?null:var3.n; var5 != null; var5 = (var4 = (mt)client.a((Object[])((Object[])((Object[])((Object[])var0[4]))[0]), -28280)) != null?var4.n:null) {
         if((0 > var2 || ((int[])((int[])var5[1]))[3] == var2) && -1 < ~((int[])((int[])var5[1]))[13]) {
            ((Object[][][])((Object[][][])var0[25]))[((int[])((int[])var5[1]))[3]][((int[])((int[])var5[1]))[16]] = null;
            ((int[])((int[])var5[1]))[13] = 0;
         }
      }

      int var6 = -1 / ((var1 + 27) / 61);
   }

   static final void b(byte var0, Object[] var1) {
      var1[13] = new int[13];
      ((boolean[])((boolean[])var1[9]))[0] = false;
      int var2 = -110 / ((-81 - var0) / 40);
      ((int[])((int[])var1[4]))[0] = 0;
      ++c;
      ((int[])((int[])var1[4]))[2] = 0;
      ((int[])((int[])var1[4]))[1] = 0;
   }

   static final boolean a(byte var0, Object[] var1) {
      ++g;
      if(null != var1[42]) {
         int var2 = 52 % ((17 - var0) / 50);
         return true;
      } else {
         return false;
      }
   }

   static final long a(boolean var0, Object[] var1) {
      ++a;
      long var2 = 4294967295L & (long)lr.a(1, var1);
      if(var0) {
         return ((long[])((long[])((Object[])((Object[])var1[6]))[7]))[22];
      } else {
         long var4 = 4294967295L & (long)lr.a(1, var1);
         return (var2 << 32) + var4;
      }
   }

   static final boolean a(int var0, Object[] var1) {
      ++b;
      if(var1 != null && var1.length == 8) {
         return wn.a((byte)2, var1);
      } else {
         boolean var2;
         if(null != var1 && var1.length == 11) {
            var2 = true;
            return var2;
         } else if(var1 != null && -16 == ~var1.length) {
            return iia.a(var1, (byte)121);
         } else if(var0 <= 46) {
            return true;
         } else if(var1 != null && (var1.length == 10 || var1.length == 15)) {
            if(var1 != null && var1.length == 15) {
               var2 = iia.a(var1, (byte)120);
            } else {
               boolean var3 = true;
               var2 = var3;
            }

            return var2;
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final boolean b(int var0, Object[] var1) {
      if(var0 >= -102) {
         return ((boolean[])((boolean[])var1[25]))[37];
      } else {
         ++f;
         return ((boolean[])((boolean[])var1[8]))[6];
      }
   }

   static final void a(Object[][][][] var0, int var1) {
      ++d;
      if(var1 == 16) {
         for(int var2 = 0; var2 < var0.length; ++var2) {
            Object[][][] var3 = var0[var2];

            for(int var4 = 0; var3.length > var4; ++var4) {
               for(int var5 = 0; var5 < var3[var4].length; ++var5) {
                  Object[] var6 = var3[var4][var5];
                  if(null != var6) {
                     Object[] var7;
                     if((var7 = (Object[])((Object[])var6[6])) != null) {
                        tl.a((byte)4, (Object[])((Object[])var6[6]));
                     }

                     Object[] var8;
                     if(null != (var8 = (Object[])((Object[])var6[8]))) {
                        tl.a((byte)4, (Object[])((Object[])var6[8]));
                     }

                     if(null != var6 && -12 == ~var6.length) {
                        ms.b(14);
                     }

                     Object[] var9;
                     if(null != (var9 = (Object[])((Object[])var6[0]))) {
                        tl.a((byte)4, (Object[])((Object[])var6[0]));
                     }

                     Object[] var10;
                     if((var10 = (Object[])((Object[])var6[4])) != null) {
                        tl.a((byte)4, (Object[])((Object[])var6[4]));
                     }

                     Object[] var11;
                     if((var11 = (Object[])((Object[])var6[2])) != null) {
                        tl.a((byte)4, (Object[])((Object[])var6[2]));
                     }

                     for(Object[] var12 = (Object[])((Object[])var6[3]); var12 != null; var12 = (Object[])((Object[])var12[0])) {
                        Object[] var13 = (Object[])((Object[])var12[1]);
                        if(var13 != null && var13.length <= 17) {
                           tl.a((byte)4, var13);
                        }
                     }
                  }
               }
            }
         }

      }
   }

}
