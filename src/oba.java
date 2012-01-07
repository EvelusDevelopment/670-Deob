
final class oba {

   int a;
   int[] c;
   int b;
   int[] d;


   oba() {
      pr.a(16);
      this.a = pr.a() != 0?pr.a(4) + 1:1;
      if(pr.a() != 0) {
         pr.a(8);
      }

      pr.a(2);
      if(this.a > 1) {
         this.b = pr.a(4);
      }

      this.d = new int[this.a];
      this.c = new int[this.a];

      for(int var1 = 0; var1 < this.a; ++var1) {
         pr.a(8);
         this.d[var1] = pr.a(8);
         this.c[var1] = pr.a(8);
      }

   }
}
