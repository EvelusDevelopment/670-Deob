
final class tr {

   static int d;
   static int a;
   static int b;
   static Object[] c = sl.a("23", 0, new Object[1], "23");
   static hsa e = null;
   static int f = 0;


   static final Object[] a(Object[] var0, int var1, Object[] var2) {
      if(var0[1] == null) {
         var0[1] = new int[6];
      }

      if(null == var0[0]) {
         var0[0] = new boolean[3];
      }

      if(var1 != -12933) {
         return (Object[])((Object[])var0[0]);
      } else {
         ++d;
         ((boolean[])((boolean[])var0[0]))[0] = true;
         ((int[])((int[])var0[1]))[4] = 4;
         var0[5] = null;
         ((boolean[])((boolean[])var0[0]))[1] = true;
         var0[4] = null;
         ((int[])((int[])var0[1]))[2] = 3;
         ((boolean[])((boolean[])var0[0]))[2] = true;
         ((int[])((int[])var0[1]))[5] = -1;
         ((int[])((int[])var0[1]))[0] = 2;
         byte[] var3 = fd.a(-2, 3, var2);
         Object[] var4 = jta.a((byte)-128, var3, new Object[3]);
         boolean var5 = false;

         while(true) {
            int var6 = fh.a(var4, false);
            if(var6 == 0) {
               if(!var5) {
                  if(null != var2 && (2 == var2.length || 7 == var2.length)) {
                     return new Object[0][];
                  }

                  if(null == var0[4]) {
                     ((int[])((int[])var0[1]))[4] = 4;
                     var0[5] = new int[4];
                     var0[4] = new int[4];
                  }

                  for(var6 = 0; var6 < ((int[])((int[])var0[4])).length; ++var6) {
                     ((int[])((int[])var0[4]))[var6] = 0;
                     ((int[])((int[])var0[5]))[var6] = 20 * var6;
                  }
               }

               return var0;
            }

            int var7;
            if(1 == var6) {
               if(var0[4] == null) {
                  ((int[])((int[])var0[1]))[4] = 4;
                  var0[5] = new int[4];
                  var0[4] = new int[4];
               }

               for(var7 = 0; ((int[])((int[])var0[4])).length > var7; ++var7) {
                  ((int[])((int[])var0[4]))[var7] = jia.c(var1 + 4767, var4);
                  ((int[])((int[])var0[5]))[var7] = jia.c(-8166, var4);
               }

               if(null != var2 && 2 == var2.length && var2[0].equals(Integer.valueOf(1))) {
                  return null;
               }

               var5 = true;
            } else if(2 == var6) {
               ((int[])((int[])var0[1]))[5] = fma.c(-17126, var4);
            } else if(3 == var6) {
               ((int[])((int[])var0[1]))[4] = fh.a(var4, false);
               var0[4] = new int[((int[])((int[])var0[1]))[4]];
               var0[5] = new int[((int[])((int[])var0[1]))[4]];
            } else if(var6 == 4) {
               ((boolean[])((boolean[])var0[0]))[2] = false;
            } else if(var6 == 5) {
               ((int[])((int[])var0[1]))[1] = td.a(var4, 85);
            } else if(var6 == 6) {
               ((int[])((int[])var0[1]))[3] = td.a(var4, var1 ^ -13016);
            } else if(7 != var6) {
               if(8 != var6) {
                  if(var6 != 9) {
                     if(10 == var6) {
                        ((boolean[])((boolean[])var0[0]))[1] = false;
                     } else if(11 == var6) {
                        ((int[])((int[])var0[1]))[2] = fh.a(var4, false);
                     }
                  } else {
                     ((int[])((int[])var0[1]))[0] = fh.a(var4, false);
                  }
               } else {
                  ((boolean[])((boolean[])var0[0]))[0] = false;
               }
            } else {
               var0[2] = new short[10][4][];
               var0[3] = new short[10][4];

               for(var7 = 0; var7 < 10; ++var7) {
                  for(int var8 = 0; 4 > var8; ++var8) {
                     int var9 = de.a((int)0, var4);
                     if('\uffff' == var9) {
                        var9 = -1;
                     }

                     ((short[][])((short[][])var0[3]))[var7][var8] = (short)var9;
                     int var10 = de.a((int)0, var4);
                     ((short[][][])((short[][][])var0[2]))[var7][var8] = new short[var10];

                     for(int var11 = 0; var10 > var11; ++var11) {
                        int var12 = de.a((int)0, var4);
                        if('\uffff' == var12) {
                           var12 = -1;
                        }

                        ((short[][][])((short[][][])var0[2]))[var7][var8][var11] = (short)var12;
                     }

                     if(null != var0 && -3 == ~var0.length && var0[1].equals(Integer.valueOf(0))) {
                        return new Object[3][];
                     }
                  }

                  if(var2 != null && -4 == ~var2.length && var2[0].equals(Integer.valueOf(1)) && var2[0].equals(Integer.valueOf(2))) {
                     a((Object[])null, var1 ^ 0, (Object[])null);
                  }
               }
            }
         }
      }
   }

   static final bk b(Object[] var0, int var1) {
      if(var1 <= 10) {
         c[0] = (Object)null;
      }

      ++a;
      return new bk(var0);
   }

   static final void a(Object[] var0, int var1) {
      var0[0] = sj.a(64, new Object[3], (byte)-37);
      ++b;
      if(var1 > -94) {
         e = (hsa)null;
      }

   }

}
