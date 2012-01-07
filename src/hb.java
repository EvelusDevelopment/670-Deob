
final class hb extends vj {

   int o;
   int f_l;
   int m;
   byte[] k;
   boolean n;


   final hb a(Object[] var1) {
      this.k = wfa.a(this.k, true, var1);
      int var3 = this.f_l;
      if(var1[0] != null) {
         var3 = (int)((long)((int[])((int[])var1[1]))[1] * (long)var3 / (long)((int[])((int[])var1[1]))[0]);
      }

      this.f_l = var3;
      if(this.m == this.o) {
         this.m = this.o = lqa.a(var1, this.m, 5);
      } else {
         this.m = lqa.a(var1, this.m, 5);
         this.o = lqa.a(var1, this.o, 5);
         if(this.m == this.o) {
            --this.m;
         }
      }

      return this;
   }

   hb(int var1, byte[] var2, int var3, int var4) {
      this.f_l = var1;
      this.k = var2;
      this.m = var3;
      this.o = var4;
   }

   hb(int var1, byte[] var2, int var3, int var4, boolean var5) {
      this.f_l = var1;
      this.k = var2;
      this.m = var3;
      this.o = var4;
      this.n = var5;
   }
}
