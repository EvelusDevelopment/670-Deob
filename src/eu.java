
final class eu extends kp {

   private Object[] t;
   static int p;
   static int u;
   static int r;
   static int o;
   static int v;
   static int n;
   static int q;
   static int s;


   final int d() {
      ++p;
      return ufa.a(this.t, 5890);
   }

   static final void b(int var0) {
      gha.c = ura.a(var0 ^ -72, new Object[var0]);
      ++o;
   }

   final void b(int[] var1, int var2, int var3) {
      jsa.a((byte)-24, var1, this.t, var2, var3);
      ++v;
   }

   final void a(int var1) {
      ++u;
      Object[] var2 = this.t;
      int var3 = var1;
      synchronized(var2) {
         if(((tf)var2[12]).a()) {
            int var5 = ((int[])((int[])var2[1]))[2] * ((tf)var2[12]).b / mc.a;

            do {
               long var6 = (long)var5 * (long)var3 + ((long[])((long[])var2[18]))[0];
               if(0L <= ((long[])((long[])var2[18]))[1] + -var6) {
                  ((long[])((long[])var2[18]))[0] = var6;
                  break;
               }

               int var8 = (int)((-1L + (long)var5 + -((long[])((long[])var2[18]))[0] + ((long[])((long[])var2[18]))[1]) / (long)var5);
               ((long[])((long[])var2[18]))[0] += (long)var5 * (long)var8;
               var3 -= var8;
               iba.a(var8, (Object[])((Object[])var2[4]), -88);
               ka.a(12, var2);
            } while(((tf)var2[12]).a());

            if(null != var2 && var2.length == 11) {
               this.t[6] = null;
            }
         }

         iba.a(var3, (Object[])((Object[])var2[4]), -66);
      }
   }

   final kp a() {
      ++n;
      return rja.a(this.t, (int)2);
   }

   static final int a(int var0, int var1, boolean var2) {
      ++r;
      if(var0 == -2) {
         return 12345678;
      } else if(-1 != var0) {
         var1 = var1 * (var0 & 127) >> 7;
         if(!var2) {
            b(-74);
         }

         if(var1 >= 2) {
            if(var1 > 126) {
               var1 = 126;
            }
         } else {
            var1 = 2;
         }

         return var1 + (var0 & '\uff80');
      } else {
         if(var1 >= 2) {
            if(var1 > 126) {
               var1 = 126;
            }
         } else {
            var1 = 2;
         }

         return var1;
      }
   }

   final kp b() {
      ++s;
      return rna.a((int)4, this.t);
   }

   eu(Object[] var1) {
      this.t = var1;
   }

}
