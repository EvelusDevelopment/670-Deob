
final class kia implements lua {

   static int j;
   Object[] f;
   static Object[] k = rh.a(false, new Object[0]);
   static int c;
   static int e;
   static int a;
   static int d;
   static Object h;
   static long g;
   static int f_i;
   static int b;


   static final void b(Object[] var0, int var1) {
      if(var0[var1] == null) {
         var0[1] = new int[6];
      }

      ++c;
   }

   static final void a(Object[] var0, int var1, int var2, int var3) {
      if(-1 != ~((byte[])((byte[])var0[45]))[0]) {
         if(1 == ((byte[])((byte[])var0[45]))[0]) {
            ((int[])((int[])var0[1]))[27] = ((int[])((int[])var0[1]))[53] + (var1 - ((int[])((int[])var0[1]))[2]) / 2;
         } else if(2 == ((byte[])((byte[])var0[45]))[0]) {
            ((int[])((int[])var0[1]))[27] = -((int[])((int[])var0[1]))[53] + -((int[])((int[])var0[1]))[2] + var1;
         } else if(((byte[])((byte[])var0[45]))[0] == 3) {
            ((int[])((int[])var0[1]))[27] = var1 * ((int[])((int[])var0[1]))[53] >> 14;
         } else if(((byte[])((byte[])var0[45]))[0] == 4) {
            ((int[])((int[])var0[1]))[27] = (var1 - ((int[])((int[])var0[1]))[2]) / 2 + (((int[])((int[])var0[1]))[53] * var1 >> 14);
         } else {
            ((int[])((int[])var0[1]))[27] = -(var1 * ((int[])((int[])var0[1]))[53] >> 14) + var1 + -((int[])((int[])var0[1]))[2];
         }
      } else {
         ((int[])((int[])var0[1]))[27] = ((int[])((int[])var0[1]))[53];
      }

      ++a;
      if(var3 < -27) {
         if(((byte[])((byte[])var0[45]))[1] == 0) {
            ((int[])((int[])var0[1]))[20] = ((int[])((int[])var0[1]))[15];
         } else if(1 != ((byte[])((byte[])var0[45]))[1]) {
            if(((byte[])((byte[])var0[45]))[1] == 2) {
               ((int[])((int[])var0[1]))[20] = -((int[])((int[])var0[1]))[15] + -((int[])((int[])var0[1]))[70] + var2;
            } else if(((byte[])((byte[])var0[45]))[1] != 3) {
               if(((byte[])((byte[])var0[45]))[1] != 4) {
                  ((int[])((int[])var0[1]))[20] = -(var2 * ((int[])((int[])var0[1]))[15] >> 14) + -((int[])((int[])var0[1]))[70] + var2;
               } else {
                  ((int[])((int[])var0[1]))[20] = (var2 * ((int[])((int[])var0[1]))[15] >> 14) + (-((int[])((int[])var0[1]))[70] + var2) / 2;
               }
            } else {
               ((int[])((int[])var0[1]))[20] = var2 * ((int[])((int[])var0[1]))[15] >> 14;
            }
         } else {
            ((int[])((int[])var0[1]))[20] = (var2 + -((int[])((int[])var0[1]))[70]) / 2 + ((int[])((int[])var0[1]))[15];
         }

         if(jp.j && (((int[])((int[])client.c(var0)[1]))[0] != 0 || ((int[])((int[])var0[1]))[18] == 0)) {
            if(-1 >= ~((int[])((int[])var0[1]))[20]) {
               if(((int[])((int[])var0[1]))[20] + ((int[])((int[])var0[1]))[70] > var2) {
                  ((int[])((int[])var0[1]))[20] = -((int[])((int[])var0[1]))[70] + var2;
               }
            } else {
               ((int[])((int[])var0[1]))[20] = 0;
            }

            if(-1 < ~((int[])((int[])var0[1]))[27]) {
               ((int[])((int[])var0[1]))[27] = 0;
            } else if(var1 < ((int[])((int[])var0[1]))[2] + ((int[])((int[])var0[1]))[27]) {
               ((int[])((int[])var0[1]))[27] = -((int[])((int[])var0[1]))[2] + var1;
            }
         }

      }
   }

   public final int b() {
      ++e;
      Object[] var2 = this.f;
      int var1 = ((int[])((int[])var2[1]))[0];
      return var1;
   }

   public final void a() {
      ++j;
   }

   static final void a(int var0, Object[] var1) {
      ((int[])((int[])var1[1]))[3] = -1;
      ++d;
      int var2 = 107 % ((var0 - 58) / 61);
   }

   public final int c() {
      ++f_i;
      Object[] var2 = this.f;
      int var1 = ((int[])((int[])var2[1]))[1];
      return var1;
   }

   kia(Object[] var1) {
      this.f = var1;
   }

   static final void a(Object[] var0, int var1) {
      if(var1 == 16863) {
         ((float[])((float[])var0[0]))[11] = 0.0F;
         ((float[])((float[])var0[0]))[3] = 1.0F;
         ((float[])((float[])var0[0]))[0] = 0.0F;
         ((float[])((float[])var0[0]))[10] = 1.0F;
         ((float[])((float[])var0[0]))[9] = 0.0F;
         ((float[])((float[])var0[0]))[7] = 0.0F;
         ((float[])((float[])var0[0]))[6] = 0.0F;
         ((float[])((float[])var0[0]))[4] = 1.0F;
         ((float[])((float[])var0[0]))[2] = 0.0F;
         ((float[])((float[])var0[0]))[1] = 0.0F;
         ((float[])((float[])var0[0]))[5] = 0.0F;
         ++b;
         ((float[])((float[])var0[0]))[8] = 0.0F;
         if(var0 != null && (var0.length == 1 && var0[0].equals(Integer.valueOf(2)) || -7 == ~var0.length && var0[3].equals(Integer.valueOf(0)) && var0[3].equals(Integer.valueOf(2)) || 15 == var0.length)) {
            mj.a(0, (Object[])((Object[])bg.h[18]));
         }

      }
   }

}
