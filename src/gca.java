
final class gca {

   static int a;
   static int d = 0;
   static int b;
   static int f;
   static Object[] e = ve.a(new Object[1], (byte)3, 1);
   static boolean c = false;


   static final void a(float var0, int var1, float var2, int var3, float var4, float var5, Object[] var6, byte var7, float var8, float var9, int var10, int var11) {
      ++a;
      el.a(99, (Object[])((Object[])var6[0]));
      aqa.a(var1, (Object[])((Object[])var6[0]), 75);
      float var15;
      float var16;
      if(((boolean[])((boolean[])var6[5]))[2]) {
         float var14 = (float)ob.a(var6, -119);
         var15 = (float)jt.a((byte)109, var6);
         if(var6 != null && 5 == var6.length) {
            return;
         }

         var16 = (var5 - var2) / var14;
         float var17 = (-var8 + var0) / var14;
         float var18 = (var9 - var2) / var15;
         float var19 = (-var8 + var4) / var15;
         float var20 = var18 * (float)((int[])((int[])var6[1]))[0];
         float var21 = var19 * (float)((int[])((int[])var6[1]))[0];
         float var22 = (float)((int[])((int[])var6[1]))[2] * var16;
         float var23 = (float)((int[])((int[])var6[1]))[2] * var17;
         float var24 = (float)((int[])((int[])var6[1]))[5] * -var16;
         float var25 = (float)((int[])((int[])var6[1]))[5] * -var17;
         float var26 = -var18 * (float)((int[])((int[])var6[1]))[1];
         var8 = var8 + var23 + var21;
         float var27 = -var19 * (float)((int[])((int[])var6[1]))[1];
         var9 = var9 + var22 + var26;
         var5 = var20 + var5 + var24;
         var2 = var20 + var2 + var22;
         var0 = var25 + var0 + var21;
         var4 = var27 + var4 + var23;
      }

      Object[] var28 = (Object[])((Object[])((Object[])((Object[])var6[0]))[10]);
      var28[8] = var6[4];
      sca.a(var11, var28, var3, 16);
      Object[] var12;
      var15 = (float)((ta)((var12 = (Object[])((Object[])var6[0])) == null?null:var12[38])).e(30626).e();
      Object[] var13;
      var16 = (float)((ta)(null == (var13 = (Object[])((Object[])var6[0]))?null:var13[38])).e(30626).d();
      Class_ds.a((Object[])((Object[])var28[4]), (byte)117);
      ((float[])((float[])((Object[])((Object[])var28[4]))[0]))[5] = (var4 - var8) * 2.0F / var16;
      ((float[])((float[])((Object[])((Object[])var28[4]))[0]))[0] = 2.0F * (var5 - var2) / var15;
      ((float[])((float[])((Object[])((Object[])var28[4]))[0]))[1] = 2.0F * (var0 - var8) / var16;
      ((float[])((float[])((Object[])((Object[])var28[4]))[0]))[4] = (-var2 + var9) * 2.0F / var15;
      if(var7 > -38) {
         e = (Object[])null;
      }

      ((float[])((float[])((Object[])((Object[])var28[4]))[0]))[12] = -1.0F + (var2 + ck.a(87, (Object[])((Object[])var6[0]))) * 2.0F / var15;
      ((float[])((float[])((Object[])((Object[])var28[4]))[0]))[13] = -1.0F + (ck.a(87, (Object[])((Object[])var6[0])) + var8) * 2.0F / var16;
      ((float[])((float[])((Object[])((Object[])var28[4]))[0]))[14] = -1.0F;
      vt.a(wv.a((byte)-128, (float)((int[])((int[])var6[1]))[4], (Object[])((Object[])var6[4])), (byte)-12, (Object[])((Object[])var28[6]), rra.a((Object[])((Object[])var6[4]), (float)((int[])((int[])var6[1]))[3], (byte)-104), 1.0F, 1.0F);
      if(var6 == null || 4 != var6.length && -9 != ~var6.length) {
         var28[3] = ((Object[])((Object[])var6[0]))[23];
         var28[2] = ((Object[])((Object[])var6[0]))[17];
         ((int[])((int[])var28[1]))[0] = 0;
         Class_ss.a(var28, (int)5);
      }
   }

   static final Object[] a(Object[] var0, int var1, Object[] var2, Object[] var3, int var4, int var5, byte var6, Object[] var7) {
      ++f;
      ne.a(var7, 106);
      kaa.a(var1, var5, var3, var7, var4, var0, var2, 2);
      ((int[])((int[])var7[1]))[6] = var5;
      ((int[])((int[])var7[1]))[5] = var4;
      if(var6 <= 23) {
         a(((int[])((int[])var2[1]))[0], (Object[])null);
      }

      ((boolean[])((boolean[])var7[3]))[2] = false;
      if(((int[])((int[])var7[1]))[2] == '\u84f5') {
         ((float[])((float[])var7[6]))[0] = (float)var5;
         ((float[])((float[])var7[6]))[1] = (float)var4;
         ((boolean[])((boolean[])var7[3]))[3] = false;
      } else {
         ((float[])((float[])var7[6]))[0] = 1.0F;
         ((boolean[])((boolean[])var7[3]))[3] = true;
         ((float[])((float[])var7[6]))[1] = 1.0F;
      }

      return var7;
   }

   static final void a(int var0, Object[] var1) {
      pma.a(1);
      ++b;
      if(var0 != 2) {
         a((Object[])null, 74, (Object[])null, (Object[])null, 37, 77, (byte)-91, (Object[])((Object[])e[0]));
      }

   }

}
