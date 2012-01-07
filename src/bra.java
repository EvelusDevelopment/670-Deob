
final class bra {

   static int c;
   static int a;
   static boolean b;


   static final Object[] a(Object[] var0, boolean var1) {
      if(((boolean[])((boolean[])var0[8]))[0]) {
         ((boolean[])((boolean[])var0[8]))[0] = false;
         Object[] var2 = (Object[])((Object[])var0[7]);
         Object[] var3 = woa.a(5, var0);
         float var4 = ((float[])((float[])((Object[])((Object[])var3[2]))[0]))[1] * ((float[])((float[])((Object[])((Object[])var3[2]))[0]))[1];
         float var5 = ((float[])((float[])((Object[])((Object[])var3[2]))[0]))[2] * ((float[])((float[])((Object[])((Object[])var3[2]))[0]))[1];
         float var6 = ((float[])((float[])((Object[])((Object[])var3[2]))[0]))[1] * ((float[])((float[])((Object[])((Object[])var3[2]))[0]))[3];
         float var7 = ((float[])((float[])((Object[])((Object[])var3[2]))[0]))[0] * ((float[])((float[])((Object[])((Object[])var3[2]))[0]))[1];
         float var8 = ((float[])((float[])((Object[])((Object[])var3[2]))[0]))[2] * ((float[])((float[])((Object[])((Object[])var3[2]))[0]))[2];
         float var9 = ((float[])((float[])((Object[])((Object[])var3[2]))[0]))[3] * ((float[])((float[])((Object[])((Object[])var3[2]))[0]))[2];
         float var10 = ((float[])((float[])((Object[])((Object[])var3[2]))[0]))[0] * ((float[])((float[])((Object[])((Object[])var3[2]))[0]))[2];
         if(null != var0 && (1 == var0.length && var0[0].equals(Boolean.valueOf(false)) || -5 == ~var0.length)) {
            id.a(6, (Object[])null);
         }

         float var11 = ((float[])((float[])((Object[])((Object[])var3[2]))[0]))[3] * ((float[])((float[])((Object[])((Object[])var3[2]))[0]))[3];
         float var12 = ((float[])((float[])((Object[])((Object[])var3[2]))[0]))[3] * ((float[])((float[])((Object[])((Object[])var3[2]))[0]))[0];
         float var13 = ((float[])((float[])((Object[])((Object[])var3[2]))[0]))[0] * ((float[])((float[])((Object[])((Object[])var3[2]))[0]))[0];
         ((float[])((float[])var2[0]))[6] = var6 + var6 + var10 + var10;
         ((float[])((float[])var2[0]))[10] = -var11 + -var13 + var4 + var8;
         ((float[])((float[])var2[0]))[1] = ((float[])((float[])((Object[])((Object[])var3[1]))[1]))[0];
         ((float[])((float[])var2[0]))[5] = var9 + var7 + var9 + var7;
         ((float[])((float[])var2[0]))[4] = -var11 + var4 + var13 - var8;
         ((float[])((float[])var2[0]))[9] = -var6 + var10 - var6 + var10;
         ((float[])((float[])var2[0]))[8] = ((float[])((float[])((Object[])((Object[])var3[1]))[1]))[2];
         ((float[])((float[])var2[0]))[3] = var4 + var11 - var8 - var13;
         ((float[])((float[])var2[0]))[7] = ((float[])((float[])((Object[])((Object[])var3[1]))[1]))[1];
         ((float[])((float[])var2[0]))[0] = var9 + (var9 - var7 - var7);
         ((float[])((float[])var2[0]))[11] = var12 - var5 - var5 + var12;
         ((float[])((float[])var2[0]))[2] = var12 + var12 + var5 + var5;
      }

      ++c;
      return !var1?(Object[])((Object[])var0[11]):(Object[])((Object[])var0[7]);
   }

   static final void a(boolean var0, Object[] var1) {
      if(null == var1[1]) {
         var1[1] = new int[9];
      }

      ++a;
      if(var1[4] == null) {
         var1[4] = new boolean[3];
      }

      if(!var0) {
         a((Object[])null, true);
      }

   }

}
