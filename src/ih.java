
final class ih {

   static long e = 0L;
   static int g;
   static int d;
   static int a;
   static int f;
   static int c;
   static int b;


   static final void a(boolean var0, Object[] var1) {
      if(!var0) {
         ((long[])((long[])var1[0]))[7] = -6L;
      }

      if(null == var1[0]) {
         var1[0] = new int[3];
      }

      ++a;
   }

   static final boolean a(Object[] var0, int var1) {
      ++b;
      if(var1 != 0) {
         var0[19] = (Object)null;
      }

      if(null != var0[4]) {
         boolean var2 = je.a((Object[])((Object[])var0[4]), (int[])((int[])((Object[])((Object[])var0[4]))[7]), ((int[])((int[])var0[1]))[5], (byte)-85, ((int[])((int[])var0[1]))[4], (Object[])((Object[])var0[2]), kaa.f);
         if(var2 && ((boolean[])((boolean[])var0[3]))[1] && ((Object[])((Object[])var0[4]))[3] != null) {
            je.a((Object[])((Object[])var0[4]), (int[])((int[])((Object[])((Object[])var0[4]))[3]), ((int[])((int[])var0[1]))[5], (byte)-107, ((int[])((int[])var0[1]))[4], (Object[])((Object[])var0[0]), kaa.f);
         }

         return var2;
      } else {
         return false;
      }
   }

   static final long a(int var0, Object[] var1, int var2, byte var3) {
      ++d;
      int var4 = 7 / ((-25 - var3) / 62);
      if(null != var1 && 8 == var1.length) {
         return rea.a(1, var2, var0, var1);
      } else if(var1 != null && -9 >= ~var1.length) {
         return gp.a(var1, var2, -120, var0);
      } else if(var1 != null && var1.length == 9) {
         long var5 = rpa.a(var0, var2, var1, 93);
         return var5;
      } else if(var1 != null && -7 == ~var1.length) {
         return wfa.a(var2, var1, var0, 4);
      } else if(var1 != null && var1.length == 7) {
         return ava.a(var0, var2, var1, 2);
      } else {
         throw new IllegalStateException();
      }
   }

   static final void a(int var0, int var1) {
      ++c;
      if(0 > var0 || var0 > 2) {
         var0 = 0;
      }

      dq.h = var0;
      cia.g = new ch[1 + rha.j[dq.h]];
      gia.c = 0;
      Class_ss.f = 0;
      if(var1 != 15596) {
         e = 3L;
      }

   }

   static final void a(Object[] var0, Object[] var1, int var2, int var3) {
      ++g;
      Class_v.a(var2, 2, var1);
      if(var3 > -32) {
         e = 32L;
      }

      nta.a(22695, var0);
   }

   static final uda a(int var0, Object[] var1) {
      if(var0 > -15) {
         return (uda)null;
      } else {
         ++f;
         return new uda(var1);
      }
   }

}
