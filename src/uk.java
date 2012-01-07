
final class uk {

   static int a;
   static int c;
   static int g;
   static int f;
   static Object[] e = ed.a(17, new Object[1], (byte)-101, 103);
   static int b = 0;
   static boolean d = false;


   static final Object[] a(Object[] var0, boolean var1) {
      ++c;
      if(var1) {
         return (Object[])((Object[])((Object[])((Object[])e[32]))[11]);
      } else if(bsa.b == var0[24]) {
         if(!((boolean[])((boolean[])var0[63]))[9]) {
            lg.a((Object[])((Object[])var0[13]), (Object[])((Object[])var0[49]), -18072);
            mv.a((byte)99, (Object[])((Object[])var0[18]), (Object[])((Object[])var0[13]));
            aqa.a(true, (Object[])((Object[])var0[13]), (Object[])((Object[])var0[61]));
            ((boolean[])((boolean[])var0[63]))[9] = true;
         }

         return (Object[])((Object[])var0[13]);
      } else {
         return (Object[])((Object[])var0[49]);
      }
   }

   static final int[][] a(byte var0, int var1, Object[] var2) {
      ++f;
      int[][] var3 = loa.a((byte)-52, var1, (Object[])((Object[])var2[4]));
      if(((boolean[])((boolean[])((Object[])((Object[])var2[4]))[0]))[0]) {
         int[][] var4 = bsa.a(0, (byte)17, var1, var2);
         int[] var5 = var4[0];
         int[] var6 = var4[1];
         if(var2 != null && var2.length == 3 && var2[1].equals(Integer.valueOf(2)) && var2[1].equals(Integer.valueOf(1))) {
            return (int[][])null;
         }

         int[] var7 = var4[2];
         int[] var8 = var3[0];
         int[] var9 = var3[1];
         int[] var10 = var3[2];

         for(int var11 = 0; var11 < fo.b; ++var11) {
            int var12 = var5[var11];
            int var13 = var6[var11];
            int var14 = var7[var11];
            if(var12 >= ((int[])((int[])var2[1]))[2]) {
               if(var12 > ((int[])((int[])var2[1]))[1]) {
                  var8[var11] = ((int[])((int[])var2[1]))[1];
               } else {
                  var8[var11] = var12;
               }
            } else {
               var8[var11] = ((int[])((int[])var2[1]))[2];
            }

            if(((int[])((int[])var2[1]))[2] <= var13) {
               if(var13 <= ((int[])((int[])var2[1]))[1]) {
                  var9[var11] = var13;
               } else {
                  var9[var11] = ((int[])((int[])var2[1]))[1];
               }
            } else {
               var9[var11] = ((int[])((int[])var2[1]))[2];
            }

            if(((int[])((int[])var2[1]))[2] > var14) {
               var10[var11] = ((int[])((int[])var2[1]))[2];
            } else if(((int[])((int[])var2[1]))[1] < var14) {
               var10[var11] = ((int[])((int[])var2[1]))[1];
            } else {
               var10[var11] = var14;
            }
         }
      }

      if(var0 > -32) {
         b = 1;
      }

      return var3;
   }

   static final void a(byte var0) {
      ++a;
      Object[] var1 = null;

      try {
         var1 = ug.a("", (String)fsa.g[2], 3, true);
         if(var0 <= 42) {
            put40BitInteger((Object[])null, -85L);
         }

         Object[] var2 = db.a(tu.d, (int)84);
         mr.a(0, var1, 19444, (byte[])((byte[])var2[2]), ((int[])((int[])var2[1]))[0]);
      } catch (Exception var4) {
         ;
      }

      try {
         if(var1 != null) {
            it.a(var1, false);
         }
      } catch (Exception var3) {
         ;
      }

   }

   static final void put40BitInteger(Object[] var2, long value) {
      byte[] var10000 = (byte[])((byte[])var2[2]);
      int[] var10001 = (int[])((int[])var2[1]);
      int var10004 = ((int[])((int[])var2[1]))[0];
      var10001[0] = ((int[])((int[])var2[1]))[0] + 1;
      var10000[var10004] = (byte)((int)(value >> 32));
      ++g;
      var10000 = (byte[])((byte[])var2[2]);
      var10001 = (int[])((int[])var2[1]);
      var10004 = ((int[])((int[])var2[1]))[0];
      var10001[0] = ((int[])((int[])var2[1]))[0] + 1;
      var10000[var10004] = (byte)((int)(value >> 24));
      var10000 = (byte[])((byte[])var2[2]);
      var10001 = (int[])((int[])var2[1]);
      var10004 = ((int[])((int[])var2[1]))[0];
      var10001[0] = ((int[])((int[])var2[1]))[0] + 1;
      var10000[var10004] = (byte)((int)(value >> 16));
      var10000 = (byte[])((byte[])var2[2]);
      var10001 = (int[])((int[])var2[1]);
      var10004 = ((int[])((int[])var2[1]))[0];
      var10001[0] = ((int[])((int[])var2[1]))[0] + 1;
      var10000[var10004] = (byte)((int)(value >> 8));
      var10000 = (byte[])((byte[])var2[2]);
      var10001 = (int[])((int[])var2[1]);
      var10004 = ((int[])((int[])var2[1]))[0];
      var10001[0] = ((int[])((int[])var2[1]))[0] + 1;
      var10000[var10004] = (byte)((int)value);
   }

}
