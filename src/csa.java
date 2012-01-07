
final class csa {

   static byte a;
   static int d;
   static int g;
   static int f_i;
   static Object[] c = nla.a(65, new Object[0], 7);
   static int e;
   static int h;
   static int b;
   static int f;


   static final void a(byte var0, int var1, int var2) {
      dq.f = var2 - eka.u;
      ++d;
      if(var0 == 45) {
         rd.s = var1 - eka.n;
      }
   }

   static final int a(boolean var0, char var1, Object[] var2) {
      ++h;
      if(var2[5] != null) {
         if(null != var2 && -2 == ~var2.length) {
            return -49;
         } else {
            for(int var3 = 0; ((int[])((int[])var2[5])).length > var3; ++var3) {
               if(((char[])((char[])var2[0]))[var3] == var1) {
                  return ((int[])((int[])var2[5]))[var3];
               }
            }

            if(!var0) {
               return 113;
            } else {
               return -1;
            }
         }
      } else {
         return -1;
      }
   }

   static final void a(int var0, Object[] var1, int var2) {
      ++e;
      if(null != var1 && 10 == var1.length) {
         rl.a(5, var1, var0);
      } else if(var1 != null && var1.length == 5) {
         mb.a((Object[])((Object[])var1[3]), 13195, pba.g, 1);
         roa.a(pba.g, var2 + 86, (Object[])((Object[])var1[3]), 1);
         qfa.a((byte)-112, var1);
         vw.a(vqa.j, (Object[])((Object[])var1[3]), var0 * 4, 0, 0, (byte)-124, var0 * 2);
      } else {
         if(var2 != 0) {
            c = (Object[])((Object[])c[4]);
         }

         throw new IllegalStateException();
      }
   }

   static final boolean a(Object[] var0, byte var1) {
      ++g;
      if(var1 < 88) {
         c = (Object[])null;
      }

      return ((boolean[])((boolean[])var0[8]))[5];
   }

   static final int a(Object[] var0, int var1) {
      ++b;
      if(var0 != null && var0.length == 16 && -3 == ~((byte[])((byte[])var0[10])).length) {
         Object[] var3 = us.a(((int[])((int[])var0[12]))[10], (byte)123, cqa.a);
         int var4 = ((int[])((int[])var3[1]))[33];
         Object[] var5;
         if(((int[])((int[])var0[12]))[6] != -1) {
            var5 = us.a(((int[])((int[])var0[12]))[6], (byte)123, cqa.a);
            if(((int[])((int[])var5[1]))[33] > var4) {
               var4 = ((int[])((int[])var5[1]))[33];
            }
         }

         if(((int[])((int[])var0[12]))[9] != -1) {
            var5 = us.a(((int[])((int[])var0[12]))[9], (byte)103, cqa.a);
            if(~var4 > ~((int[])((int[])var5[1]))[33]) {
               var4 = ((int[])((int[])var5[1]))[33];
            }
         }

         return var4;
      } else if(var1 <= 15) {
         return -20;
      } else if(null != var0 && -44 == ~var0.length && ((int[])((int[])var0[12])).length == 46) {
         return uia.a(var0, 5407);
      } else {
         byte var2 = 0;
         return var2;
      }
   }

   static final void b(Object[] var0, byte var1) {
      ((boolean[])((boolean[])var0[3]))[1] = false;
      if(var1 <= 76) {
         b((Object[])((Object[])c[24]), ((byte[])((byte[])c[10]))[14]);
      }

      ((boolean[])((boolean[])var0[3]))[0] = true;
      ++f_i;
   }

}
