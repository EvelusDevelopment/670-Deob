
final class nka {

   private km[] c = new km[10];
   private int b;
   private int a;


   final hb a() {
      byte[] var1 = this.b();
      return new hb(22050, var1, 22050 * this.b / 1000, 22050 * this.a / 1000);
   }

   final int c() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if(this.c[var2] != null && this.c[var2].g / 20 < var1) {
            var1 = this.c[var2].g / 20;
         }
      }

      if(this.b < this.a && this.b / 20 < var1) {
         var1 = this.b / 20;
      }

      if(var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if(this.c[var2] != null) {
               this.c[var2].g -= var1 * 20;
            }
         }

         if(this.b < this.a) {
            this.b -= var1 * 20;
            this.a -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   static final nka a(Object[] var0, int var1, int var2) {
      byte[] var3 = qn.a(var1, var2, var0, -79);
      return var3 == null?null:new nka(jta.a((byte)-102, var3, new Object[3]));
   }

   private final byte[] b() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if(this.c[var2] != null && this.c[var2].d + this.c[var2].g > var1) {
            var1 = this.c[var2].d + this.c[var2].g;
         }
      }

      if(var1 == 0) {
         return new byte[0];
      } else {
         var2 = 22050 * var1 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if(this.c[var4] != null) {
               int var5 = this.c[var4].d * 22050 / 1000;
               int var6 = this.c[var4].g * 22050 / 1000;
               int[] var7 = this.c[var4].a(var5, this.c[var4].d);

               for(int var8 = 0; var8 < var5; ++var8) {
                  int var9 = var3[var8 + var6] + (var7[var8] >> 8);
                  if((var9 + 128 & -256) != 0) {
                     var9 = var9 >> 31 ^ 127;
                  }

                  var3[var8 + var6] = (byte)var9;
               }
            }
         }

         return var3;
      }
   }

   private nka(Object[] var1) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = fh.a(var1, false);
         if(var3 != 0) {
            --((int[])((int[])var1[1]))[0];
            this.c[var2] = new km();
            this.c[var2].a(var1);
         }
      }

      this.b = de.a((int)0, var1);
      this.a = de.a((int)0, var1);
   }
}
