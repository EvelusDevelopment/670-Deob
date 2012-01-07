
final class maa {

   static int e;
   static int d;
   static int a;
   static int[] csk;
   static int b;


   static final void a(Object[] var0, Object[] var1, int var2, int var3) {
      ++a;
      if(var0[var3] != null) {
         if(var0 != null && 7 == var0.length && var0[0].equals(Integer.valueOf(1))) {
            return;
         }

         Object[] var5 = (Object[])((Object[])var0[0]);
         Object[] var4;
         if(var5[24] == bsa.b) {
            var4 = (Object[])((Object[])var5[3]);
         } else {
            var4 = ota.z;
         }

         float[] var7 = new float[]{((float[])((float[])var4[0]))[12], ((float[])((float[])var4[0]))[13], ((float[])((float[])var4[0]))[14]};
         float[] var8 = new float[]{0.0F, 0.0F, 0.0F};
         float var9 = var8[0];
         float var10 = var8[1];
         float var11 = var8[2];
         var8[0] = ((float[])((float[])var4[0]))[12] + var11 * ((float[])((float[])var4[0]))[8] + var10 * ((float[])((float[])var4[0]))[4] + ((float[])((float[])var4[0]))[0] * var9;
         var8[2] = ((float[])((float[])var4[0]))[14] + ((float[])((float[])var4[0]))[10] * var11 + var9 * ((float[])((float[])var4[0]))[2] + ((float[])((float[])var4[0]))[6] * var10;
         var8[1] = ((float[])((float[])var4[0]))[13] + var11 * ((float[])((float[])var4[0]))[9] + ((float[])((float[])var4[0]))[1] * var9 + var10 * ((float[])((float[])var4[0]))[5];
         float[] var13 = new float[]{0.0F, 0.0F, 0.0F};
         pl.a(poa.a((Object[])((Object[])var0[0]), (byte)125), 0.0F, 0.0F, 0.0F, 7, var13);
         var10 = var7[0] - ((float[])((float[])var1[0]))[8];
         var11 = -((float[])((float[])var1[0]))[1] + var7[1];
         float var12 = -((float[])((float[])var1[0]))[7] + var7[2];
         var7[0] = (float)((int)(((float[])((float[])var1[0]))[5] * var11 + var10 * ((float[])((float[])var1[0]))[10] + var12 * ((float[])((float[])var1[0]))[9]));
         var7[2] = (float)((int)(var10 * ((float[])((float[])var1[0]))[6] + var11 * ((float[])((float[])var1[0]))[11] + var12 * ((float[])((float[])var1[0]))[4]));
         var7[1] = (float)((int)(((float[])((float[])var1[0]))[0] * var10 + var11 * ((float[])((float[])var1[0]))[3] + ((float[])((float[])var1[0]))[2] * var12));
         eea.a(var7[2], var7[0], false, (Object[])((Object[])var0[13]), (Object[])((Object[])var0[17]), var7[1]);
      }

   }

   static final boolean a(int var0, int var1) {
      int var2 = -87 / ((var1 + 57) / 58);
      ++d;
      return 1 == var0 || var0 == 3 || var0 == 5;
   }

   static final void a(Object[] var0, int var1, int var2, int var3) {
      if(var2 >= -120) {
         a((Object[])null, (Object[])null, -17, -6);
      }

      ++b;
      gv.a(var0, false, var3, var1);
      if(((int[])((int[])var0[1]))[3] >= 0 && null != wga.f) {
         int var4 = !((boolean[])((boolean[])wga.f.a(((int[])((int[])var0[1]))[3], (byte)80)[3]))[4]?128:64;
         var0[13] = wga.f.a(var4, 1.0F, false, -6300, var4, ((int[])((int[])var0[1]))[3]);
         ((int[])((int[])var0[1]))[2] = var4;
         ((int[])((int[])var0[1]))[1] = var4;
      }

   }

   static final Object[] a(Object[] var0, Object[] var1, boolean var2) {
      ++e;
      if(var0[0] == null) {
         var0[0] = new int[5];
      }

      sea.b(var1, var0, (byte)-121);
      ((int[])((int[])var0[0]))[2] = de.a((int)0, var1);
      ((int[])((int[])var0[0]))[3] = fh.a(var1, var2);
      ((int[])((int[])var0[0]))[1] = fh.a(var1, false);
      ((int[])((int[])var0[0]))[4] = fh.a(var1, false);
      return var0;
   }

}
