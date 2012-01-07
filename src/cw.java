
final class cw {

   static int b;
   static int c;
   static int a;
   static int e;
   static int d;


   static final Object[] a(int var0, int var1, Object[] var2) {
      int var4 = -113 / ((var0 + 34) / 50);
      ++c;
      Object[] var3;
      synchronized(var2[0]) {
         var3 = (Object[])((Object[])dna.a((byte)34, (Object[])((Object[])var2[0]), (long)var1));
      }

      if(null == var3) {
         byte[] var5;
         synchronized(var2[1]) {
            var5 = qn.a(1, var1, (Object[])((Object[])var2[1]), -45);
         }

         Object[] var7 = new Object[2];
         dia.b(var7, 0);
         ((boolean[])((boolean[])var7[0]))[0] = true;
         ((int[])((int[])var7[1]))[5] = 0;
         ((int[])((int[])var7[1]))[4] = 512;
         ((int[])((int[])var7[1]))[2] = -1;
         ((boolean[])((boolean[])var7[0]))[1] = true;
         if(null != var2 && var2.length == 1) {
            return null;
         } else {
            var3 = var7;
            if(var5 != null) {
               Object[] var8 = jta.a((byte)-109, var5, new Object[3]);
               if(var7 != null && (var7.length == 27 || -11 == ~var7.length && var7[3].equals(Integer.valueOf(1)) || var7.length == 3)) {
                  return null;
               }

               while(true) {
                  int var9 = fh.a(var8, false);
                  if(0 == var9) {
                     break;
                  }

                  vr.a(var3, 40, var8, var9);
               }
            }

            synchronized(var2[0]) {
               il.a((long)var1, var3, true, (Object[])((Object[])var2[0]));
               return var3;
            }
         }
      } else {
         return var3;
      }
   }

   static final Object[] a(int var0, Object[] var1) {
      if(var0 != 1) {
         return (Object[])null;
      } else {
         ++b;
         return (Object[])((Object[])var1[1]);
      }
   }

   static final jqa a(byte var0, Object[] var1) {
      if(var0 <= 83) {
         return (jqa)null;
      } else {
         ++d;
         return new baa(var1);
      }
   }

   static final Object[] a(Object[] var0, int var1, Object[] var2, ch var3) {
      if(var2[1] == null) {
         var2[1] = new int[3];
      }

      if(null == var2[3]) {
         var2[3] = new float[2];
      }

      ++e;
      var2[2] = wt.a((byte)-66, var2);
      var2[0] = var0;
      var2[4] = lma.a((Object[])((Object[])var2[0]), (byte)-126);
      kfa.a(4562, var2);
      return var1 != 1?(Object[])null:var2;
   }

   static final Object[] a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var5 >= -36) {
         return (Object[])null;
      } else {
         ++a;
         long var7 = (long)var0 * 32147369L ^ (long)var2 * 986053L ^ 475427L * (long)var4 ^ 67481L * (long)var6 ^ 97549L * (long)var1 ^ 76724863L * (long)var3;
         Object[] var9 = (Object[])((Object[])dna.a((byte)34, nq.x, var7));
         if(var9 != null) {
            return var9;
         } else {
            var9 = br.e.c(var6, var1, var4, var2, var0, var3);
            il.a(var7, var9, true, nq.x);
            return var9;
         }
      }
   }

}
