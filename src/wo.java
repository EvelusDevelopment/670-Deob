import java.nio.ByteBuffer;

final class wo {

   static int c;
   static Object[] b;
   static int e;
   static boolean d;
   static int a;


   static final Object[] a(int var0, Object[] var1, int var2) {
      ++c;
      if(var2 != -22081) {
         a(((int[])((int[])((Object[])((Object[])((Object[])((Object[])b[1]))[1]))[3]))[5], 11, 95, (Object[])null, (Object[])null, (byte)43, ((int[])((int[])var1[8]))[9], (Object[])null, ((int[])((int[])var1[3]))[4], (Object[])null);
      }

      int var3 = 15 & (int)(((long[])((long[])var1[0]))[0] >> eba.b * var0);
      return eba.a(-101, var3);
   }

   static final int a(int var0, Object[] var1) {
      ++a;
      int var2 = 35 % ((-51 - var0) / 46);
      return var1 != null?sga.a(30431, var1):wea.a(var1, (int)31819);
   }

   static final Object[] a(int var0, int var1, int var2, Object[] var3, Object[] var4, byte var5, int var6, Object[] var7, int var8, Object[] var9) {
      if(null == var3[0]) {
         var3[0] = new boolean[1];
      }

      if(var3[1] == null) {
         var3[1] = new int[6];
      }

      ++e;
      ((boolean[])((boolean[])var3[0]))[0] = true;
      ((int[])((int[])var3[1]))[4] = -1;
      if(null != var4 && var4.length == 8) {
         sha.a(-30, (Object[])null, 29, 43, new Object[6][], (Object[])null);
      }

      ((int[])((int[])var3[1]))[1] = var6;
      var3[2] = var4;
      var3[4] = var7;
      ((int[])((int[])var3[1]))[2] = var2;
      int var12 = 1 << var0;
      int var13 = 0;
      if(var5 > -98) {
         b = (Object[])null;
      }

      int var14 = var1 << var0;
      int var15 = var8 << var0;

      int var17;
      int var18;
      for(int var16 = 0; var16 < var12; ++var16) {
         if(null != var4 && var4.length == 21) {
            bqa.b((Object[])null, 81);
         }

         var17 = ((aa)(null == var9?null:var9[2])).f_i * (var16 + var15) + var14;

         for(var18 = 0; var12 > var18; ++var18) {
            short[] var19 = ((short[][])((short[][])var9[4]))[var17++];
            if(var19 != null) {
               var13 += var19.length;
            }
         }
      }

      if(0 < var13) {
         if(null != var7 && (-2 == ~var7.length && var7[0].equals(Integer.valueOf(1)) && var7[0].equals(Boolean.valueOf(false)) || 6 == var7.length)) {
            bqa.b((Object[])null, 100);
         }

         ((int[])((int[])var3[1]))[0] = Integer.MIN_VALUE;
         ((int[])((int[])var3[1]))[3] = Integer.MAX_VALUE;
         var3[3] = rta.a((byte)127, (Object[])((Object[])var3[4]), false);
         bj.a(4, (Object[])((Object[])var3[3]), var13);
         ByteBuffer var23 = (ByteBuffer)((Object[])((Object[])var3[4]))[57];
         var23.clear();

         for(var17 = 0; var12 > var17; ++var17) {
            var18 = var14 + ((aa)(null == var9?null:var9[2])).f_i * (var15 + var17);
            if(var4 != null && var4.length == 18 && var4[0].equals(Integer.valueOf(2)) && var4[0].equals(Integer.valueOf(2))) {
               as.f = null;
            }

            for(int var24 = 0; var24 < var12; ++var24) {
               short[] var20 = ((short[][])((short[][])var9[4]))[var18++];
               if(var20 != null) {
                  for(int var21 = 0; var21 < var20.length; ++var21) {
                     int var22 = var20[var21] & '\uffff';
                     if(var22 < ((int[])((int[])var3[1]))[3]) {
                        ((int[])((int[])var3[1]))[3] = var22;
                     }

                     if(~var22 < ~((int[])((int[])var3[1]))[0]) {
                        ((int[])((int[])var3[1]))[0] = var22;
                     }

                     var23.putShort((short)var22);
                  }

                  if(var7 != null && var7.length == 11) {
                     as.f = null;
                  }
               }
            }
         }

         nda.a(-18243, (Object[])((Object[])var3[3]), var23.position(), 0, ((long[])((long[])((Object[])((Object[])var3[4]))[50]))[0]);
         ((int[])((int[])var3[1]))[5] = var13 / 3;
      } else {
         var3[5] = null;
         ((int[])((int[])var3[1]))[5] = 0;
      }

      return var3;
   }

}
