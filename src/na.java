
final class na extends aa implements Class_w {

   long nativeid;
   private ia p;
   private Object[] o = ura.a(-79, new Object[2]);


   final void a(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, Object[] var14, boolean var15) {
      boolean var16 = false;
      if(var10 != null) {
         int[] var17 = var10;

         for(int var18 = 0; var18 < var17.length; ++var18) {
            int var19 = var17[var18];
            if(var19 != -1) {
               var16 = true;
               break;
            }
         }
      }

      int var31 = var10.length;
      int[] var33 = new int[var31 * 3];
      int[] var32 = new int[var31 * 3];
      int[] var20 = new int[var31 * 3];
      int[] var21 = new int[var31 * 3];
      int[] var22 = new int[var31 * 3];
      int[] var23 = var11 != null?new int[var31 * 3]:null;
      int[] var24 = var4 != null?new int[var31 * 3]:null;
      int[] var25 = var6 != null?new int[var31 * 3]:null;
      int var26 = 0;

      for(int var27 = 0; var27 < var31; ++var27) {
         int var28 = var7[var27];
         int var29 = var8[var27];
         int var30 = var9[var27];
         var33[var26] = var3[var28];
         var32[var26] = var5[var28];
         var20[var26] = var10[var27];
         var21[var26] = var12[var27];
         var22[var26] = var13[var27];
         if(var11 != null) {
            var23[var26] = var11[var27];
         }

         if(var4 != null) {
            var24[var26] = var4[var28];
         }

         if(var6 != null) {
            var25[var26] = var6[var28];
         }

         ++var26;
         var33[var26] = var3[var29];
         var32[var26] = var5[var29];
         var20[var26] = var10[var27];
         var21[var26] = var12[var27];
         var22[var26] = var13[var27];
         if(var11 != null) {
            var23[var26] = var11[var27];
         }

         if(var4 != null) {
            var24[var26] = var4[var29];
         }

         if(var6 != null) {
            var25[var26] = var6[var29];
         }

         ++var26;
         var33[var26] = var3[var30];
         var32[var26] = var5[var30];
         var20[var26] = var10[var27];
         var21[var26] = var12[var27];
         var22[var26] = var13[var27];
         if(var11 != null) {
            var23[var26] = var11[var27];
         }

         if(var4 != null) {
            var24[var26] = var4[var30];
         }

         if(var6 != null) {
            var25[var26] = var6[var30];
         }

         ++var26;
      }

      if(var16 || var23 != null) {
         this.NA(var1, var2, var33, var24, var32, var25, var20, var23, var21, var22, ((int[])((int[])var14[0]))[1], ((int[])((int[])var14[0]))[5], ((int[])((int[])var14[0]))[0], var15);
      }

   }

   private final native void O(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7);

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      this.p.F().a(this, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public final native void o(boolean var1);

   final void a(int var1, int var2) {
      this.p.F().a(this, var1, var2);
   }

   private final native void b(ia var1, fa var2, int var3, int var4, int[][] var5, int[][] var6, int var7, int var8, int var9);

   protected final void finalize() {
      if(this.nativeid != 0L) {
         lla.a(-110, this);
      }

   }

   final native ya h(int var1, int var2, ya var3);

   private final native void NA(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int var11, int var12, int var13, boolean var14);

   na(ia var1, fa var2, int var3, int var4, int[][] var5, int[][] var6, int var7, int var8, int var9) {
      super(var3, var4, var7, var5);
      this.p = var1;
      this.b(this.p, var2, var3, var4, this.f, var6, var7, var8, var9);
   }

   final void a(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      int var9 = 0;
      float[] var10 = new float[wg.a(this.o, 1)];

      cra var7;
      cra var8;
      for(Object[] var11 = (var7 = (cra)dda.a(this.o, 2)) == null?null:var7.k; var11 != null; var11 = (var8 = (cra)client.a(this.o, -28280)) == null?null:var8.k) {
         var10[var9++] = sba.a(0, var11);
      }

      this.i(var10);

      for(int var15 = 0; var15 < var3 + var3; ++var15) {
         for(int var12 = 0; var12 < var3 + var3; ++var12) {
            if(var4[var15][var12]) {
               int var13 = var1 - var3 + var15;
               int var14 = var2 - var3 + var12;
               if(var13 >= 0 && var13 < this.f_i && var14 >= 0 && var14 < this.h) {
                  this.a(var13, var14);
               }
            }
         }
      }

   }

   final boolean a(ya var1, int var2, int var3, int var4, int var5, boolean var6) {
      return true;
   }

   final native void ja(ya var1, int var2, int var3, int var4, int var5, boolean var6);

   final void a(Object[] var1, int[] var2) {
      client.a(120, this.o, (lm)(var1 == null?null:var1[3]));
      this.O((var1 == null?null:var1[3]).hashCode(), lba.a(var1, -25699), sla.a(var1, false), fn.a(var1, 3), mc.a(false, var1), gaa.a(var1, (byte)-69), var2);
   }

   private final native void i(float[] var1);

   final void a(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Object[] var11, boolean var12) {
      this.NA(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, ((int[])((int[])var11[0]))[1], ((int[])((int[])var11[0]))[5], ((int[])((int[])var11[0]))[0], var12);
   }

   final native void l();

   final native void GA(ya var1, int var2, int var3, int var4, int var5, boolean var6);

   final native void DA(int var1, int var2, int var3);
}
