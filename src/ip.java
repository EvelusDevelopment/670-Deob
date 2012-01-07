import jagtheora.misc.SimplePeer;

final class ip {

   static int b = -1;
   static int c;
   static int a;
   static int d;


   static final Object[] a(int var0, int var1, Object[] var2, int var3, Object[] var4) {
      jm.a((byte)122, var2);
      ++d;
      kt var6 = new kt(var2);
      var2[0] = var4;
      var2[2] = var6;
      int var7 = 44 / ((var1 + 69) / 43);
      ((int[])((int[])var2[1]))[0] = var3;
      return var2;
   }

   static final void a(int var0, Object[] var1) {
      ++c;
      if(var1[4] != null) {
         ((SimplePeer)var1[4]).a();
      }

      if(null != var1[9]) {
         ((SimplePeer)var1[9]).a();
      }

      ((SimplePeer)var1[8]).a();
      ((SimplePeer)var1[6]).a();
      if(var0 != 1) {
         a(65, (Object[])null);
      }

      if(null != var1[7]) {
         foa.a((byte)-60, (Object[])((Object[])var1[7]));
      }

   }

   static final boolean a(int var0, int var1, Object[] var2, int var3, ya var4, byte var5, boolean var6, int var7) {
      ++a;
      if(null != var2[22] && var4 != null) {
         int var8 = var7 - (var0 * ((int[])((int[])((Object[])((Object[])var2[11]))[1]))[30] >> 8) >> ((int[])((int[])((Object[])((Object[])var2[11]))[1]))[9];
         int var9 = -(((int[])((int[])((Object[])((Object[])var2[11]))[1]))[31] * var0 >> 8) + var1 >> ((int[])((int[])((Object[])((Object[])var2[11]))[1]))[9];
         Object[] var11 = (Object[])((Object[])var2[22]);
         if(var5 <= 113) {
            a(109, (Object[])((Object[])var2[0]));
         }

         uma var14;
         Object[] var15 = (var14 = (uma)var4) != null?var14.A:null;
         int var12 = var8 + ((int[])((int[])var15[1]))[0] + 1;
         int var13 = var9 + ((int[])((int[])var15[1]))[2] + 1;
         int var16 = var13 * ((int[])((int[])var11[1]))[0] + var12;
         if(var2 != null && -4 == ~var2.length) {
            return true;
         } else {
            int var17 = ((int[])((int[])var15[1]))[1];
            int var18 = ((int[])((int[])var15[1]))[3];
            int var19 = -var18 + ((int[])((int[])var11[1]))[0];
            int var20;
            if(var13 <= 0) {
               var20 = -var13 + 1;
               var16 += ((int[])((int[])var11[1]))[0] * var20;
               var17 -= var20;
               var13 = 1;
            }

            if(~((int[])((int[])var11[1]))[3] >= ~(var17 + var13)) {
               var20 = -((int[])((int[])var11[1]))[3] + var17 + var13 + 1;
               var17 -= var20;
            }

            if(var12 <= 0) {
               var20 = -var12 + 1;
               var16 += var20;
               var12 = 1;
               var19 += var20;
               var18 -= var20;
            }

            if(var12 + var18 >= ((int[])((int[])var11[1]))[0]) {
               var20 = var18 + (var12 - (-1 + ((int[])((int[])var11[1]))[0]));
               var18 -= var20;
               var19 += var20;
            }

            boolean var10;
            if(0 >= var18 || 0 >= var17) {
               var10 = false;
               if(client.f_vb == 0) {
                  return var10;
               }
            }

            byte var21 = 8;
            var19 += (-1 + var21) * ((int[])((int[])var11[1]))[0];
            var10 = ma.a(var16, var21, var18, (byte[])((byte[])var11[0]), -1, var17, var19);
            return var10;
         }
      } else {
         return false;
      }
   }

}
