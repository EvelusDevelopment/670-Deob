
final class lpa extends nj {

   int f_i;
   int j;
   int f_l;
   int n;
   int m;
   boolean k = false;


   final boolean a(int var1, int var2) {
      if(!this.k) {
         return false;
      } else {
         int var3 = this.n - this.f_i;
         int var4 = this.m - this.f_l;
         int var5 = var3 * var3 + var4 * var4;
         int var6 = var1 * var3 + var2 * var4 - (this.f_i * var3 + this.f_l * var4);
         int var7;
         int var8;
         if(var6 <= 0) {
            var7 = this.f_i - var1;
            var8 = this.f_l - var2;
            return var7 * var7 + var8 * var8 < this.j * this.j;
         } else if(var6 > var5) {
            var7 = this.n - var1;
            var8 = this.m - var2;
            return var7 * var7 + var8 * var8 < this.j * this.j;
         } else {
            var6 = (var6 << 10) / var5;
            var7 = this.f_i + (var3 * var6 >> 10) - var1;
            var8 = this.f_l + (var4 * var6 >> 10) - var2;
            return var7 * var7 + var8 * var8 < this.j * this.j;
         }
      }
   }

}
