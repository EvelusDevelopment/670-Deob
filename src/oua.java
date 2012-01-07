import java.io.IOException;

final class oua {

   static int[] g = new int[4096];
   static int b;
   static Object[] d = ho.a(-1, 69, new Object[1], true);
   static int c;
   static int h;
   static int f;
   static int e;
   static int a;


   static final void writeBytesToOutputStreamWorker(Object[] wrapper, byte[] src, int off, int len) throws IOException {
      ++c;
      ppa.writeBytesToOutputStreamWorker(wrapper, src, off, len);
   }

   static final int a(byte var0, Object[] var1) {
      ++a;
      if(var0 != -26) {
         a(57, 97, (Object[])null);
      }

      return ((int[])((int[])var1[1]))[0];
   }

   static final void a(Object[] var0, boolean var1) {
      ((boolean[])((boolean[])var0[63]))[1] = var1;
      ++f;
      gu.a(var0, 255);
      if(var0[24] == bsa.b) {
         gpa.a(var0, (int)-72);
      }

   }

   static final Object[] a(int var0, String var1, int var2, String var3, int var4, int var5, boolean var6, Object[] var7, int var8, int var9) {
      ++b;
      eha.a(false, var7);
      ((int[])((int[])var7[1]))[0] = 0;
      ((int[])((int[])var7[1]))[3] = 12800;
      ((int[])((int[])var7[1]))[4] = 0;
      ((int[])((int[])var7[1]))[7] = -1;
      ((int[])((int[])var7[1]))[5] = 12800;
      ((int[])((int[])var7[1]))[1] = -1;
      ((boolean[])((boolean[])var7[4]))[0] = true;
      if(null != var7 && 8 == var7.length) {
         toa.a((Object[])null, 33, 9, 25);
      }

      pi var11 = new pi(var7);
      ((int[])((int[])var7[1]))[6] = var0;
      ((int[])((int[])var7[1]))[var5] = var9;
      ((int[])((int[])var7[1]))[7] = var4;
      ((boolean[])((boolean[])var7[4]))[0] = var6;
      var7[2] = var3;
      var7[0] = var1;
      var7[5] = var11;
      ((int[])((int[])var7[1]))[2] = var2;
      if(((int[])((int[])var7[1]))[7] == 255) {
         ((int[])((int[])var7[1]))[7] = 0;
      }

      var7[3] = ura.a(var5 - 61, new Object[2]);
      return var7;
   }

   static final void a(int var0, int var1, Object[] var2) {
      if(var1 != 0) {
         a(((int[])((int[])d[2]))[0], -128, (Object[])null);
      }

      ++h;
      if(null != cj.d) {
         try {
            gla.a((byte)21, 0L, cj.d);
            rra.a((byte[])((byte[])var2[2]), 24, cj.d, 4, var0);
         } catch (Exception var4) {
            ;
         }
      }

   }

   static final void a() {
      ci.a(1, ri.n);
   }

   static final void a(Object[] var0, int var1, int var2) {
      ++e;
      Object[] var3 = (Object[])((Object[])var0[3]);
      int var4 = ((Integer)var3[0]).intValue();
      if(var1 == -2147483646) {
         Object[] var5 = fca.a(-74, var4);
         if(var5 != null) {
            nba.a = new int[((int[])((int[])var5[1]))[4]];
            int var6 = 0;
            sp.c = new String[((int[])((int[])var5[1]))[1]];
            int var7 = 0;
            if(null != var0 && -2 == ~var0.length) {
               rj.a(-121, 121);
            }

            dfa.s = new long[((int[])((int[])var5[1]))[0]];
            int var8 = 0;

            for(int var9 = 1; var9 < var3.length; ++var9) {
               if(!(var3[var9] instanceof Integer)) {
                  if(!(var3[var9] instanceof String)) {
                     if(var3[var9] instanceof Long) {
                        long var10 = ((Long)var3[var9]).longValue();
                        dfa.s[var8++] = var10;
                     }
                  } else {
                     String var13 = (String)var3[var9];
                     if(var13.equals("event_opbase")) {
                        var13 = (String)var0[4];
                     }

                     sp.c[var7++] = var13;
                  }
               } else {
                  if(null != var5 && -13 == ~var5.length) {
                     nta.b = null;
                  }

                  int var12 = ((Integer)var3[var9]).intValue();
                  if(var12 == -2147483647) {
                     var12 = ((int[])((int[])var0[1]))[1];
                  }

                  if(-2147483646 == var12) {
                     var12 = ((int[])((int[])var0[1]))[5];
                  }

                  if(-2147483645 == var12) {
                     var12 = var0[0] != null?((int[])((int[])((Object[])((Object[])var0[0]))[1]))[3]:-1;
                  }

                  if(-2147483644 == var12) {
                     var12 = ((int[])((int[])var0[1]))[0];
                  }

                  if(var12 == -2147483643) {
                     var12 = null != var0[0]?((int[])((int[])((Object[])((Object[])var0[0]))[1]))[47]:-1;
                  }

                  if(var12 == -2147483642) {
                     var12 = var0[5] == null?-1:((int[])((int[])((Object[])((Object[])var0[5]))[1]))[3];
                  }

                  if(var12 == -2147483641) {
                     var12 = null != var0[5]?((int[])((int[])((Object[])((Object[])var0[5]))[1]))[47]:-1;
                  }

                  if(-2147483640 == var12) {
                     var12 = ((int[])((int[])var0[1]))[4];
                  }

                  if(-2147483639 == var12) {
                     var12 = ((int[])((int[])var0[1]))[2];
                  }

                  nba.a[var6++] = var12;
               }
            }

            gt.e = ((int[])((int[])var0[1]))[3];
            wla.a(var5, var2, 16);
         }
      }
   }

}
