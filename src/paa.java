
final class paa {

   static int b;
   static Object[] c = ed.a(-1, new Object[1], (byte)-123, 29);
   static Object[] a = vra.a(new Object[0], 33554431);


   static final ka a(Object[] var0, Object[] var1, ta var2, Object[] var3, int var4, int var5, Object[] var6) {
      ++b;
      if(null != var1[11]) {
         Object[] var23 = ria.a(var0, var1, -119);
         return null != var23?a(var0, var23, var2, var3, 95, var5, var6):null;
      } else if(var1[5] == null && (null == var6 || null == var6[1])) {
         return null;
      } else {
         if(var6 != null && -7 == ~var6.length) {
            qga.n = null;
         }

         int var7 = var5;
         if(var3 != null) {
            var7 = var5 | mo.a(true, var3);
         }

         long var9 = (long)(((int[])((int[])var1[1]))[17] | var2.G << 16);
         if(var6 != null) {
            var9 |= ((long[])((long[])var6[0]))[0] << 24;
         }

         ka var8;
         synchronized(((Object[])((Object[])var1[12]))[7]) {
            var8 = (ka)dna.a((byte)34, (Object[])((Object[])((Object[])((Object[])var1[12]))[7]), var9);
         }

         if(null == var8 || (var7 & var8.va()) != var7) {
            if(var8 != null) {
               var7 |= var8.va();
            }

            int var11 = var7;
            if(var1[4] != null) {
               var11 = var7 | 16384;
            }

            if(var1[6] != null) {
               var11 |= '\u8000';
            }

            if(0 != ((byte[])((byte[])var1[9]))[1]) {
               var11 |= 524288;
            }

            int[] var12 = (int[])(null != var6 && var6[1] != null?var6[1]:var1[5]);
            boolean var13 = false;
            int var15;
            synchronized(((Object[])((Object[])var1[12]))[5]) {
               if(null != var6 && var6.length == 18) {
                  qga.n = null;
               }

               var15 = 0;

               while(true) {
                  if(~var15 <= ~var12.length) {
                     break;
                  }

                  if(!Class_ss.a(0, 5, (Object[])((Object[])((Object[])((Object[])var1[12]))[5]), var12[var15])) {
                     var13 = true;
                  }

                  ++var15;
               }
            }

            if(var13) {
               return null;
            }

            ii[] var14 = new ii[var12.length];
            synchronized(((Object[])((Object[])var1[12]))[5]) {
               int var16 = 0;

               while(true) {
                  if(var12.length <= var16) {
                     if(var0 != null && (17 == var0.length && var0[7].equals(Integer.valueOf(1)) && var0[7].equals(Boolean.valueOf(false)) || var0.length == 6 && var0[3].equals(Boolean.valueOf(false)) && var0[3].equals(Integer.valueOf(2)))) {
                        ol.a((Object[])null, 18, 16383, new Object[1][]);
                     }
                     break;
                  }

                  var14[var16] = ii.a((Object[])((Object[])((Object[])((Object[])var1[12]))[5]), var12[var16], (int)0);
                  ++var16;
               }
            }

            for(var15 = 0; var12.length > var15; ++var15) {
               if(var14[var15] != null && var14[var15].a < 13) {
                  var14[var15].a(2);
               }
            }

            ii var25;
            if(1 != var14.length) {
               var25 = new ii(var14, var14.length);
            } else {
               var25 = var14[0];
            }

            var8 = var2.a(var25, var11, ((int[])((int[])((Object[])((Object[])var1[12]))[1]))[0], 64, 768);
            int var17;
            short[] var24;
            if(null != var1[4]) {
               if(var1 != null && (-2 == ~var1.length && var1[0].equals(Integer.valueOf(1)) || -12 == ~var1.length)) {
                  qga.n = null;
               }

               if(null != var6 && null != var6[3]) {
                  var24 = (short[])((short[])var6[3]);
               } else {
                  var24 = (short[])((short[])var1[3]);
               }

               for(var17 = 0; ~var17 > ~((short[])((short[])var1[4])).length; ++var17) {
                  if(var1[15] != null && ((byte[])((byte[])var1[15])).length > var17) {
                     var8.q(((short[])((short[])var1[4]))[var17], qga.n[255 & ((byte[])((byte[])var1[15]))[var17]]);
                  } else {
                     var8.q(((short[])((short[])var1[4]))[var17], var24[var17]);
                  }
               }
            }

            if(null != var1[6]) {
               if(null != var6 && null != var6[2]) {
                  var24 = (short[])((short[])var6[2]);
               } else {
                  var24 = (short[])((short[])var1[10]);
               }

               for(var17 = 0; ~var17 > ~((short[])((short[])var1[6])).length; ++var17) {
                  var8.DA(((short[])((short[])var1[6]))[var17], var24[var17]);
               }

               if(var0 != null && var0.length == 2) {
                  ita.a((Object[])null, 0, (int[])null, (Object[])null, 6, (Object[])null, (Object[][])null, (Object[])null, -49, (Object[])null, (ta)null, (Object[])null);
               }
            }

            if(((byte[])((byte[])var1[9]))[1] != 0) {
               var8.a(((byte[])((byte[])var1[9]))[5], ((byte[])((byte[])var1[9]))[2], ((byte[])((byte[])var1[9]))[4], ((byte[])((byte[])var1[9]))[1] & 255);
            }

            var8.G(var7);
            if(null != var6 && (var6.length == 5 && var6[2].equals(Boolean.valueOf(false)) && var6[2].equals(Integer.valueOf(0)) || var6.length == 3 && var6[0].equals(Integer.valueOf(0)))) {
               qga.n = null;
            }

            synchronized(((Object[])((Object[])var1[12]))[7]) {
               il.a(var9, var8, true, (Object[])((Object[])((Object[])((Object[])var1[12]))[7]));
            }
         }

         if(var4 < 1) {
            return (ka)var0[1];
         } else {
            if(var3 != null) {
               var8 = var8.a((byte)1, var7, true);
               bqa.a(0, 1, var8, var3);
            }

            var8.G(var5);
            return var8;
         }
      }
   }

}
