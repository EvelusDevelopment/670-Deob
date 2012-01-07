
final class aj {

   static int d;
   static int c;
   static int b;
   static int a;


   static final void a(Object[] var0, int[] var1, int var2, int var3, boolean var4) {
      ++c;
      boolean var5;
      int var6;
      if(var0[31] != null) {
         if(var0 != null && (var0.length == 16 || 3 == var0.length && var0[0].equals(Integer.valueOf(1)) && var0[0].equals(Boolean.valueOf(false)))) {
            rw.b(-27);
         }

         var5 = true;

         for(var6 = 0; var6 < ((int[])((int[])var0[31])).length; ++var6) {
            if(var1[var6] != ((int[])((int[])var0[31]))[var6]) {
               var5 = false;
               break;
            }
         }

         Object[] var9 = (Object[])((Object[])var0[25]);
         if(var5 && wna.a(var9, 4)) {
            Object[] var7 = nc.a(false, (Object[])((Object[])var0[25]));
            int var8 = ((int[])((int[])var7[1]))[4];
            if(var8 == 1) {
               rf.a(var2, 84, var9);
            }

            if(var8 == 2) {
               ei.a(var9, (byte)104);
            }
         }
      }

      if(var3 < -88) {
         if(var0 != null && var0.length == 4) {
            hn.b = null;
         }

         var5 = true;

         for(var6 = 0; ~var6 > ~var1.length; ++var6) {
            if(-1 != var1[var6]) {
               var5 = false;
            }

            if(null == var0[31] || -1 == ((int[])((int[])var0[31]))[var6] || ~((int[])((int[])bs.a(he.b, -15, var1[var6])[1]))[1] <= ~((int[])((int[])bs.a(he.b, -15, ((int[])((int[])var0[31]))[var6])[1]))[1]) {
               var0[31] = var1;
               Class_is.a(var2, (Object[])((Object[])var0[25]), (byte)101);
               if(var4) {
                  ((int[])((int[])var0[12]))[20] = ((int[])((int[])var0[12]))[18];
               }
            }
         }

         if(var5) {
            var0[31] = var1;
            Class_is.a(var2, (Object[])((Object[])var0[25]), (byte)121);
            if(var4) {
               ((int[])((int[])var0[12]))[20] = ((int[])((int[])var0[12]))[18];
            }
         }

      }
   }

   static final void a(Object[] var0, int var1) {
      ++b;
      if(var0 != null && 15 == var0.length) {
         jda.a(var0, (byte)-94);
      } else {
         int var2 = -114 / ((-18 - var1) / 63);
         jda.a(var0, (byte)-94);
      }
   }

   static final int[] a(int var0, Object[] var1, int var2) {
      if(var2 > -71) {
         return (int[])null;
      } else {
         ++d;
         int[] var3 = od.a(-1704, var0, (Object[])((Object[])var1[5]));
         if(((boolean[])((boolean[])((Object[])((Object[])var1[5]))[4]))[0]) {
            int[] var4 = vea.a(var1, 0, var0, (byte)-8);
            if(null != var1 && var1.length == 7 && var1[2].equals(Integer.valueOf(1)) && var1[2].equals(Integer.valueOf(0))) {
               return null;
            }

            for(int var5 = 0; var5 < fo.b; ++var5) {
               var3[var5] = ((int[])((int[])var1[1]))[3] + (var4[var5] * ((int[])((int[])var1[1]))[2] >> 12);
            }
         }

         return var3;
      }
   }

}
