
final class koa {

   private int d;
   private int[] e = new int[2];
   private int h;
   int b;
   int k;
   private int g = 2;
   private int f_i;
   int c;
   private int f;
   private int a;
   private int[] j = new int[2];


   final void a(Object[] var1) {
      this.g = fh.a(var1, false);
      this.e = new int[this.g];
      this.j = new int[this.g];

      for(int var2 = 0; var2 < this.g; ++var2) {
         this.e[var2] = de.a((int)0, var1);
         this.j[var2] = de.a((int)0, var1);
      }

   }

   final int a(int var1) {
      if(this.d >= this.f) {
         this.h = this.j[this.a++] << 15;
         if(this.a >= this.g) {
            this.a = this.g - 1;
         }

         this.f = (int)((double)this.e[this.a] / 65536.0D * (double)var1);
         if(this.f > this.d) {
            this.f_i = ((this.j[this.a] << 15) - this.h) / (this.f - this.d);
         }
      }

      this.h += this.f_i;
      ++this.d;
      return this.h - this.f_i >> 15;
   }

   final void b(Object[] var1) {
      this.k = fh.a(var1, false);
      this.c = lr.a(1, var1);
      this.b = lr.a(1, var1);
      this.a(var1);
   }

   final void a() {
      this.f = 0;
      this.a = 0;
      this.f_i = 0;
      this.h = 0;
      this.d = 0;
   }

   koa() {
      this.e[0] = 0;
      this.e[1] = '\uffff';
      this.j[0] = 0;
      this.j[1] = '\uffff';
   }
}
