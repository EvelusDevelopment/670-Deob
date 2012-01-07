
final class tf {

   private Object[] c = jta.a((byte)-105, (byte[])null, new Object[3]);
   private static byte[] g = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)0, (byte)1, (byte)2, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
   private int[] h;
   private int[] d;
   int[] e;
   int b;
   private long a;
   private int[] f;
   private int f_i;


   final int f(int var1) {
      int var2 = this.b(var1);
      return var2;
   }

   final void a(byte[] var1) {
      this.c[2] = var1;
      ((int[])((int[])this.c[1]))[0] = 10;
      int var2 = de.a((int)0, this.c);
      this.b = de.a((int)0, this.c);
      this.f_i = 500000;
      this.h = new int[var2];

      int var3;
      int var5;
      for(var3 = 0; var3 < var2; ((int[])((int[])this.c[1]))[0] += var5) {
         int var4 = lr.a(1, this.c);
         var5 = lr.a(1, this.c);
         if(var4 == 1297379947) {
            this.h[var3] = ((int[])((int[])this.c[1]))[0];
            ++var3;
         }
      }

      this.a = 0L;
      this.f = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.f[var3] = this.h[var3];
      }

      this.e = new int[var2];
      this.d = new int[var2];
   }

   final void a(int var1) {
      int var2 = nj.a(this.c, true);
      this.e[var1] += var2;
   }

   final int d() {
      int var1 = this.f.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if(this.f[var4] >= 0 && this.e[var4] < var3) {
            var2 = var4;
            var3 = this.e[var4];
         }
      }

      return var2;
   }

   final void a(long var1) {
      this.a = var1;
      int var3 = this.f.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.e[var4] = 0;
         this.d[var4] = 0;
         ((int[])((int[])this.c[1]))[0] = this.h[var4];
         this.a(var4);
         this.f[var4] = ((int[])((int[])this.c[1]))[0];
      }

   }

   final boolean b() {
      int var1 = this.f.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if(this.f[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   private final int b(int var1) {
      byte var2 = ((byte[])((byte[])this.c[2]))[((int[])((int[])this.c[1]))[0]];
      int var5;
      if(var2 < 0) {
         var5 = var2 & 255;
         this.d[var1] = var5;
         ++((int[])((int[])this.c[1]))[0];
      } else {
         var5 = this.d[var1];
      }

      if(var5 != 240 && var5 != 247) {
         return this.a(var1, var5);
      } else {
         int var3 = nj.a(this.c, true);
         if(var5 == 247 && var3 > 0) {
            int var4 = ((byte[])((byte[])this.c[2]))[((int[])((int[])this.c[1]))[0]] & 255;
            if(var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               ++((int[])((int[])this.c[1]))[0];
               this.d[var1] = var4;
               return this.a(var1, var4);
            }
         }

         ((int[])((int[])this.c[1]))[0] += var3;
         return 0;
      }
   }

   final boolean a() {
      return this.c[2] != null;
   }

   private final int a(int var1, int var2) {
      int var4;
      if(var2 == 255) {
         int var7 = fh.a(this.c, false);
         var4 = nj.a(this.c, true);
         if(var7 == 47) {
            ((int[])((int[])this.c[1]))[0] += var4;
            return 1;
         } else if(var7 == 81) {
            int var5 = td.a(this.c, 99);
            var4 -= 3;
            int var6 = this.e[var1];
            this.a += (long)var6 * (long)(this.f_i - var5);
            this.f_i = var5;
            ((int[])((int[])this.c[1]))[0] += var4;
            return 2;
         } else {
            ((int[])((int[])this.c[1]))[0] += var4;
            return 3;
         }
      } else {
         byte var3 = g[var2 - 128];
         var4 = var2;
         if(var3 >= 1) {
            var4 = var2 | fh.a(this.c, false) << 8;
         }

         if(var3 >= 2) {
            var4 |= fh.a(this.c, false) << 16;
         }

         return var4;
      }
   }

   final int c() {
      return this.f.length;
   }

   final void e() {
      ((int[])((int[])this.c[1]))[0] = -1;
   }

   final long d(int var1) {
      return this.a + (long)var1 * (long)this.f_i;
   }

   final void c(int var1) {
      this.f[var1] = ((int[])((int[])this.c[1]))[0];
   }

   final void f() {
      this.c[2] = null;
      this.h = null;
      this.f = null;
      this.e = null;
      this.d = null;
   }

   final void e(int var1) {
      ((int[])((int[])this.c[1]))[0] = this.f[var1];
   }

   tf() {}

   tf(byte[] var1) {
      this.a(var1);
   }

}
