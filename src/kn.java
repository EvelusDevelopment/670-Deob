import jagex3.jagmisc.jagmisc;

final class kn extends cq {

   private long n = 0L;
   private long[] o = new long[10];
   private int f_l = 0;
   private long m = 0L;
   private int k = 1;
   private long j = 0L;


   private final long c(int var1) {
      long var2 = jagmisc.nanoTime();
      long var4 = var2 - this.m;
      this.m = var2;
      if(var1 != 10) {
         this.f_l = -118;
      }

      if(var4 > -5000000000L && -5000000001L < ~var4) {
         this.o[this.f_l] = var4;
         this.f_l = (this.f_l + 1) % 10;
         if(-2 < ~this.k) {
            ++this.k;
         }
      }

      long var6 = 0L;

      for(int var8 = 1; this.k >= var8; ++var8) {
         var6 += this.o[(10 + this.f_l - var8) % 10];
      }

      return var6 / (long)this.k;
   }

   final void a(byte var1) {
      if(var1 == -41) {
         this.m = 0L;
         if(~this.j > ~this.n) {
            this.j += -this.j + this.n;
         }

      }
   }

   final long a(int var1) {
      if(var1 != 15) {
         this.b((byte)-80, -28L);
      }

      return this.j;
   }

   final long b(int var1) {
      if(var1 > -66) {
         return -70L;
      } else {
         this.j += this.c(10);
         return this.n <= this.j?0L:(-this.j + this.n) / 1000000L;
      }
   }

   final int b(byte var1, long var2) {
      int var4 = -74 / ((91 - var1) / 33);
      if(this.j < this.n) {
         this.m += this.n - this.j;
         this.j += this.n - this.j;
         this.n += var2;
         return 1;
      } else {
         int var5 = 0;

         do {
            ++var5;
            this.n += var2;
         } while(10 > var5 && ~this.n > ~this.j);

         if(~this.j < ~this.n) {
            this.n = this.j;
         }

         return var5;
      }
   }

   public kn() {
      try {
         this.n = this.j = jagmisc.nanoTime();
         if(-1L == ~this.j) {
            throw new RuntimeException();
         }
      } catch (RuntimeException var2) {
         throw var2;
      }
   }
}
