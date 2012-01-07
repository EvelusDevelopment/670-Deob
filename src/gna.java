
final class gna {

   static Object[] a;
   static int f;
   static Object[] c = ed.a(2, new Object[1], (byte)-107, 52);
   static int e;
   static int b;
   static int d;


   static final int a(byte var0, Object[] var1) {
      ++f;
      if(var0 >= -118) {
         ((byte[])((byte[])var1[21]))[0] = 49;
      }

      return ((int[])((int[])var1[1]))[0];
   }

   static final ii a(Object[] var0, Object[] var1, byte var2, boolean var3) {
      ++d;
      int var4;
      int var5;
      if(!var3) {
         if(var1 != null && null != var1[3]) {
            var4 = ((int[])((int[])var1[3]))[0];
            var5 = ((int[])((int[])var1[3]))[1];
         } else {
            var4 = ((int[])((int[])var0[1]))[38];
            var5 = ((int[])((int[])var0[1]))[39];
         }
      } else if(var1 != null && null != var1[2]) {
         var5 = ((int[])((int[])var1[2]))[1];
         var4 = ((int[])((int[])var1[2]))[0];
      } else {
         var5 = ((int[])((int[])var0[1]))[16];
         var4 = ((int[])((int[])var0[1]))[10];
      }

      if(~var4 != 0) {
         int var6 = 37 / ((var2 + 4) / 57);
         ii var7 = ii.a((Object[])((Object[])((Object[])((Object[])var0[7]))[7]), var4, (int)0);
         if(13 > var7.a) {
            var7.a(2);
         }

         if(-1 != var5) {
            ii var8 = ii.a((Object[])((Object[])((Object[])((Object[])var0[7]))[7]), var5, (int)0);
            if(-14 < ~var8.a) {
               var8.a(2);
            }

            ii[] var9 = new ii[]{var7, var8};
            var7 = new ii(var9, 2);
         }

         if(var0 != null && 1 == var0.length) {
            up.a((Object[])null, (int[])null, 64, -83);
         }

         short[] var10;
         int var11;
         if(var0[14] != null) {
            if(var1 != null && var1[5] != null) {
               var10 = (short[])((short[])var1[5]);
            } else {
               var10 = (short[])((short[])var0[0]);
            }

            for(var11 = 0; var11 < ((short[])((short[])var0[14])).length; ++var11) {
               var7.b(((short[])((short[])var0[14]))[var11], var10[var11]);
            }

            if(var0 != null && 3 == var0.length && var0[1].equals(Integer.valueOf(2)) && var0[1].equals(Integer.valueOf(2))) {
               la.b = null;
            }
         }

         if(var0[5] != null) {
            if(var0 != null && var0.length == 35 && var0[1].equals(Integer.valueOf(1)) && var0[1].equals(Integer.valueOf(1))) {
               it.a((Object[])null, (byte)19);
            }

            if(null != var1 && var1[0] != null) {
               var10 = (short[])((short[])var1[0]);
            } else {
               var10 = (short[])((short[])var0[13]);
            }

            for(var11 = 0; ~var11 > ~((short[])((short[])var0[5])).length; ++var11) {
               var7.a(((short[])((short[])var0[5]))[var11], var10[var11]);
            }
         }

         return var7;
      } else {
         return null;
      }
   }

   static final int a(Object[] var0, int var1) {
      ++b;
      return !se.a((Object[])((Object[])var0[var1]), (byte)-122)?0:1;
   }

   static final tha b(byte var0, Object[] var1) {
      if(var0 < 22) {
         return (tha)null;
      } else {
         ++e;
         if(null == var1[3]) {
            return null;
         } else {
            for(tha var2 = ((tha[])((tha[])var1[2]))[(int)(((long[])((long[])var1[0]))[0] & (long)(-1 + ((int[])((int[])var1[1]))[0]))]; var1[3] != var2; var1[3] = ((tha)var1[3]).s) {
               if(((tha)var1[3]).m == ((long[])((long[])var1[0]))[0]) {
                  tha var3 = (tha)var1[3];
                  var1[3] = ((tha)var1[3]).s;
                  return var3;
               }
            }

            if(null != var1 && var1.length == 30) {
               return null;
            } else {
               var1[3] = null;
               return null;
            }
         }
      }
   }

}
