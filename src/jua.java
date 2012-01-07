
final class jua extends kp {

   private Object[] o = ura.a(-104, new Object[2]);
   private Object[] n = ura.a(-84, new Object[2]);
   private int q = 0;
   private int p = -1;


   private final void a(lm var1, vua var2) {
      while(var1 != this.n[0] && ((vua)var1).j <= var2.j) {
         var1 = var1.f;
      }

      if(null != var2.d) {
         var2.a((byte)33);
      }

      var2.f = var1;
      var2.d = var1.d;
      var2.d.f = var2;
      var2.f.d = var2;
      this.p = ((vua)((lm)this.n[0]).f).j;
   }

   final synchronized void a(int var1) {
      do {
         if(this.p < 0) {
            this.b(var1);
            return;
         }

         if(this.q + var1 < this.p) {
            this.q += var1;
            this.b(var1);
            return;
         }

         int var2 = this.p - this.q;
         this.b(var2);
         var1 -= var2;
         this.q += var2;
         this.e();
         vua var3 = (vua)dda.a(this.n, 2);
         synchronized(var3) {
            int var5 = var3.a(this);
            if(var5 < 0) {
               var3.j = 0;
               this.a(var3);
            } else {
               var3.j = var5;
               this.a(var3.f, var3);
            }
         }
      } while(var1 != 0);

   }

   final kp b() {
      return (kp)dda.a(this.o, 2);
   }

   final synchronized void b(kp var1) {
      var1.a((byte)20);
   }

   final int d() {
      return 0;
   }

   final synchronized void b(int[] var1, int var2, int var3) {
      do {
         if(this.p < 0) {
            this.c(var1, var2, var3);
            return;
         }

         if(this.q + var3 < this.p) {
            this.q += var3;
            this.c(var1, var2, var3);
            return;
         }

         int var4 = this.p - this.q;
         this.c(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.q += var4;
         this.e();
         vua var5 = (vua)dda.a(this.n, 2);
         synchronized(var5) {
            int var7 = var5.a(this);
            if(var7 < 0) {
               var5.j = 0;
               this.a(var5);
            } else {
               var5.j = var7;
               this.a(var5.f, var5);
            }
         }
      } while(var3 != 0);

   }

   private final void e() {
      if(this.q > 0) {
         for(vua var1 = (vua)dda.a(this.n, 2); var1 != null; var1 = (vua)client.a(this.n, -28280)) {
            var1.j -= this.q;
         }

         this.p -= this.q;
         this.q = 0;
      }

   }

   private final void a(vua var1) {
      var1.a((byte)32);
      var1.a();
      lm var2 = ((lm)this.n[0]).f;
      if(var2 == this.n[0]) {
         this.p = -1;
      } else {
         this.p = ((vua)var2).j;
      }

   }

   private final void b(int var1) {
      for(kp var2 = (kp)dda.a(this.o, 2); var2 != null; var2 = (kp)client.a(this.o, -28280)) {
         var2.a(var1);
      }

   }

   final kp a() {
      return (kp)client.a(this.o, -28280);
   }

   private final void c(int[] var1, int var2, int var3) {
      for(kp var4 = (kp)dda.a(this.o, 2); var4 != null; var4 = (kp)client.a(this.o, -28280)) {
         var4.a(var1, var2, var3);
      }

   }

   final synchronized void a(kp var1) {
      dp.a(var1, this.o, (byte)88);
   }

}
