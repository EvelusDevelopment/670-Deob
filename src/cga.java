
abstract class cga {

   final void b(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.a(var1, var2, var3, var4, var5, var6, var7, 1);
   }

   final void b(int var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4, 1, 0, 1);
   }

   abstract void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

   final void a(float var1, float var2, int var3, int var4) {
      this.a(var1, var2, (float)this.f() / 2.0F, (float)this.d() / 2.0F, var3, var4, 1, 0, 1);
   }

   final void a(int var1, int var2) {
      this.a(var1, var2, 1, 0, 1);
   }

   private final void a(float var1, float var2, float var3, float var4, int var5, int var6, int var7, int var8, int var9) {
      if(var5 != 0) {
         double var10 = (double)(var6 & '\uffff') * 9.587379924285257E-5D;
         float var12 = (float)Math.sin(var10) * (float)var5;
         float var13 = (float)Math.cos(var10) * (float)var5;
         float var14 = (-var3 * var13 + -var4 * var12) / 4096.0F + var1;
         float var15 = (-(-var3) * var12 + -var4 * var13) / 4096.0F + var2;
         float var16 = (((float)this.f() - var3) * var13 + -var4 * var12) / 4096.0F + var1;
         float var17 = (-((float)this.f() - var3) * var12 + -var4 * var13) / 4096.0F + var2;
         float var18 = (-var3 * var13 + ((float)this.d() - var4) * var12) / 4096.0F + var1;
         float var19 = (-(-var3) * var12 + ((float)this.d() - var4) * var13) / 4096.0F + var2;
         this.a(var14, var15, var16, var17, var18, var19, var7, var8, var9);
      }
   }

   abstract void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

   abstract void a(int var1, int var2, int var3);

   abstract int d();

   abstract void a(int var1, int var2, int var3, int var4, int var5);

   private final void a(float var1, float var2, float var3, float var4, float var5, float var6, Class_s var7, int var8, int var9) {
      this.a(var1, var2, var3, var4, var5, var6, 1, var7, var8, var9);
   }

   abstract int e();

   abstract void a(float var1, float var2, float var3, float var4, float var5, float var6, int var7, Class_s var8, int var9, int var10);

   abstract void a(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10);

   final void c(int var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4, 1, 0, 1, 1);
   }

   final void a(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9) {
      this.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, 1);
   }

   abstract void a(int var1, int var2, int var3, int var4);

   abstract void a(int var1, int var2, Class_s var3, int var4, int var5);

   abstract void a(int var1, int var2, int var3, int var4, int var5, int var6);

   final void a(float var1, float var2, int var3, int var4, int var5, int var6, int var7) {
      this.a(var1, var2, (float)this.f() / 2.0F, (float)this.d() / 2.0F, var3, var4, var5, var6, var7);
   }

   final void a(float var1, float var2, float var3, float var4, int var5, int var6, Class_s var7, int var8, int var9) {
      if(var5 != 0) {
         double var10 = (double)(var6 & '\uffff') * 9.587379924285257E-5D;
         float var12 = (float)Math.sin(var10) * (float)var5;
         float var13 = (float)Math.cos(var10) * (float)var5;
         float var14 = (-var3 * var13 + -var4 * var12) / 4096.0F + var1;
         float var15 = (-(-var3) * var12 + -var4 * var13) / 4096.0F + var2;
         float var16 = (((float)this.f() - var3) * var13 + -var4 * var12) / 4096.0F + var1;
         float var17 = (-((float)this.f() - var3) * var12 + -var4 * var13) / 4096.0F + var2;
         float var18 = (-var3 * var13 + ((float)this.d() - var4) * var12) / 4096.0F + var1;
         float var19 = (-(-var3) * var12 + ((float)this.d() - var4) * var13) / 4096.0F + var2;
         this.a(var14, var15, var16, var17, var18, var19, var7, var8, var9);
      }
   }

   final void a(float var1, float var2, int var3, int var4, Class_s var5, int var6, int var7) {
      this.a(var1, var2, (float)this.f() / 2.0F, (float)this.d() / 2.0F, var3, var4, var5, var6, var7);
   }

   abstract int f();

   abstract void a(int[] var1);

   abstract re h();

   abstract int g();
}
