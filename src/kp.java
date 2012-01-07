
abstract class kp extends lm {

   int j;
   vj k;
   kp m;
   volatile boolean f_l = true;


   abstract int d();

   abstract kp b();

   abstract void b(int[] var1, int var2, int var3);

   abstract kp a();

   abstract void a(int var1);

   int c() {
      return 255;
   }

   final void a(int[] var1, int var2, int var3) {
      if(this.f_l) {
         this.b(var1, var2, var3);
      } else {
         this.a(var3);
      }

   }
}
