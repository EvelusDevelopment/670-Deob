
final class vo extends ja {

   static int D;
   static Object[][] E = new Object[2048][];
   static int A;
   private Object[] B;


   final void HA(char var1, int var2, int var3, int var4, boolean var5) {
      ib.a(this.B, var1, var2, var3, var4, var5);
   }

   final void a(char var1, int var2, int var3, int var4, boolean var5, Class_s var6, int var7, int var8) {
      ib.a(this.B, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   static final void a(float var0, float var1, Object[] var2, float var3, float var4, byte var5) {
      ++A;
      float var6 = (float)Math.sin((double)(var4 * 0.5F));
      float var7 = (float)Math.cos((double)(var4 * 0.5F));
      ((float[])((float[])var2[0]))[3] = var6 * var3;
      ((float[])((float[])var2[0]))[2] = var6 * var0;
      if(var5 != 7) {
         a(((float[])((float[])var2[0]))[17], 0.02182528F, (Object[])null, ((float[])((float[])var2[4]))[0], 2.3416479F, (byte)-84);
      }

      ((float[])((float[])var2[0]))[0] = var1 * var6;
      ((float[])((float[])var2[0]))[1] = var7;
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      ++D;
      if(var0 == -1341515444) {
         if(var8 == var6 && var2 == var7 && var1 == var3 && var5 == var4) {
            qi.a(var9, var1, var2, var8, 13429, var5);
         } else {
            int var10 = var8;
            int var11 = var2;
            int var12 = 3 * var8;
            int var13 = 3 * var2;
            int var14 = var6 * 3;
            int var15 = 3 * var7;
            int var16 = var3 * 3;
            int var17 = var4 * 3;
            int var18 = -var8 + var14 + var1 + -var16;
            int var19 = var15 + var5 + (-var17 - var2);
            int var20 = -var14 + -var14 + var16 + var12;
            int var21 = -var15 + var17 + -var15 + var13;
            int var22 = var14 - var12;
            int var23 = var15 - var13;

            for(int var24 = 128; 4096 >= var24; var24 += 128) {
               int var25 = var24 * var24 >> 12;
               int var26 = var24 * var25 >> 12;
               int var27 = var18 * var26;
               int var28 = var26 * var19;
               int var29 = var25 * var20;
               int var30 = var21 * var25;
               int var31 = var24 * var22;
               int var32 = var23 * var24;
               int var33 = (var27 + var29 + var31 >> 12) + var8;
               int var34 = var2 + (var30 + var28 + var32 >> 12);
               qi.a(var9, var33, var11, var10, var0 + 1341528873, var34);
               var11 = var34;
               var10 = var33;
            }
         }

      }
   }

   vo(Object[] var1, ta var2, Object[] var3) {
      super(var2, var3);
      this.B = var1;
   }

}
