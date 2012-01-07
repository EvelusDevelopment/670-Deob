
final class aua {

   static int a;
   static int[] e;
   static int d;
   static int[] b = new int[32];
   static int c;


   static final Object[] a(int var0, Object[] var1, int var2) {
      ++a;
      tha var5 = uh.a((Object[])((Object[])var1[4]), (long)var2, (byte)87);
      if(var0 != 23221) {
         ((long[])((long[])var1[8]))[5] = 31L;
      }

      if(null != var5) {
         vta var3;
         return (var3 = (vta)var5) != null?var3.w:null;
      } else {
         byte[] var6 = fd.a(-2, var2, (Object[])((Object[])var1[2]));
         if(null != var1 && var1.length == 4 && var1[3].equals(Integer.valueOf(2))) {
            return null;
         } else if(null == var6) {
            return null;
         } else {
            Object[] var8 = new Object[7];
            Object[] var9 = jta.a((byte)-123, var6, new Object[3]);
            var8[3] = jn.a((byte)-94, var8);
            int var10 = fh.a(var9, false);
            int var11 = 0;
            int var12 = 0;
            int[][] var13 = new int[var10][];
            var8[4] = new Object[var10][];

            int var14;
            int var16;
            int var19;
            byte var23;
            int var22;
            for(var14 = 0; var14 < var10; ++var14) {
               fh.a(var9, false);
               var16 = fh.a(var9, false);
               Object[] var17 = ms.a(var16, var0 - 23238);
               ((int[])((int[])var17[1]))[0] = fh.a(var9, false);
               int var18 = fh.a(var9, false);

               for(var19 = 0; var19 < var18; ++var19) {
                  int var20 = fh.a(var9, false);
                  kja.a(var17, var20, var9, (byte)-11);
               }

               if(null != var17 && var17.length == 4) {
                  client.b((int)1, (Object[])null);
               }

               ee.a(var17, (int)-958);
               if(var17 != null && (var17.length == 8 || var17.length == 11 && ((int[])((int[])var17[1])).length == 4)) {
                  var22 = tqa.a(var17, (int)1);
               } else {
                  var23 = -1;
                  var22 = var23;
               }

               if(0 <= var22) {
                  ++var11;
               }

               if(nba.a((byte)101, var17) >= 0) {
                  ++var12;
               }

               var18 = ((Object[])((Object[])var17[2])).length;
               var13[var14] = new int[var18];

               for(var19 = 0; var19 < var18; ++var19) {
                  var13[var14][var19] = fh.a(var9, false);
               }

               ((Object[][])((Object[][])var8[4]))[var14] = var17;
            }

            var8[5] = new int[var11];
            var11 = 0;
            var8[6] = new int[var12];
            var12 = 0;

            for(var14 = 0; var14 < var10; ++var14) {
               Object[] var15 = ((Object[][])((Object[][])var8[4]))[var14];
               var16 = ((Object[])((Object[])var15[2])).length;

               for(var22 = 0; var16 > var22; ++var22) {
                  ((Object[][])((Object[][])var15[2]))[var22] = ((Object[][])((Object[][])var8[4]))[var13[var14][var22]];
               }

               if(null != var15 && (-9 == ~var15.length || var15.length == 11 && 4 == ((int[])((int[])var15[1])).length)) {
                  var22 = tqa.a(var15, var0 ^ 23220);
               } else {
                  var23 = -1;
                  var22 = var23;
               }

               var19 = nba.a((byte)122, var15);
               if(null != var1 && -12 == ~var1.length) {
                  return null;
               }

               if(0 < var22) {
                  ((int[])((int[])var8[5]))[var11++] = var22;
               }

               if(var19 > 0) {
                  ((int[])((int[])var8[6]))[var12++] = var19;
               }

               var13[var14] = null;
            }

            var8[2] = ((Object[])((Object[])var8[4]))[fh.a(var9, false)];
            var8[1] = ((Object[])((Object[])var8[4]))[fh.a(var9, false)];
            var8[0] = ((Object[])((Object[])var8[4]))[fh.a(var9, false)];
            var13 = (int[][])null;
            Object[] var4;
            hj.a((Object[])((Object[])var1[4]), 0, (tha)(null != (var4 = var8)?var4[3]:null), (long)var2);
            return var8;
         }
      }
   }

   static final void a(Object[] var0, int var1) {
      if(var1 < 91) {
         b = (int[])null;
      }

      ++c;
      if(var0[1] == null) {
         var0[1] = new int[1];
      }

   }

   static final void b(Object[] var0, int var1) {
      ((boolean[])((boolean[])var0[5]))[0] = false;
      ++d;
      if(var1 >= -61) {
         a(117, (Object[])null, -18);
      }

   }

}
