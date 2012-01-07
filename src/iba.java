
final class iba {

   static Object[] f = ho.a(0, 0, new Object[1], true);
   static int e;
   static int a;
   static boolean d;
   static int c;
   static int b;
   static int g;


   static final long a(byte var0, Object[] var1) {
      ++a;
      if(var0 != 76) {
         a((Object[])null, 89, -103);
      }

      return ((long[])((long[])var1[4]))[0];
   }

   static final void a(int var0, Object[] var1, int var2) {
      ++g;
      ((jua)var1[2]).a(var0);
      if(var2 > -24) {
         a((byte)104, (Object[])null);
      }

      mt var3;
      mt var4;
      for(Object[] var6 = null != (var3 = (mt)dda.a((Object[])((Object[])var1[0]), 2))?var3.n:null; null != var6; var6 = (var4 = (mt)client.a((Object[])((Object[])var1[0]), -28280)) == null?null:var4.n) {
         if(!se.a((Object[])((Object[])var1[3]), var6, 126)) {
            if(var6 != null && -3 == ~var6.length) {
               uba.a((Object[])null, (byte)80);
            }

            int var5 = var0;

            while(true) {
               if(((int[])((int[])var6[1]))[5] < var5) {
                  of.a(((int[])((int[])var6[1]))[5], 1, var1, var6);
                  var5 -= ((int[])((int[])var6[1]))[5];
                  if(!kb.a(var5, var6, (int[])null, (Object[])((Object[])var1[3]), 0, 32)) {
                     continue;
                  }
                  break;
               }

               of.a(var5, 1, var1, var6);
               ((int[])((int[])var6[1]))[5] -= var5;
               break;
            }
         }
      }

   }

   static final void a(int var0, Object[] var1) {
      ++e;
      if(var1[24] != bsa.b) {
         var1[24] = bsa.b;
         uda.a((int)24796, var1);
         gu.a(var1, 255);
         var1[29] = var1[33];
         gpa.a(var1, (int)-98);
         loa.b((byte)35, var1);
         ((int[])((int[])var1[1]))[23] &= -8;
      }

      if(var0 != 5556) {
         ((int[])((int[])f[10]))[5] = -31;
      }

   }

   static final Object[] a(Object[] var0, int var1, int var2) {
      rc.a(var0, true);
      ++c;
      epa.a(-87, var0);
      ((int[])((int[])var0[1]))[1] = var1;
      ((int[])((int[])var0[1]))[var2] = var1;
      int var3 = 1;
      if(var0 != null && (-37 == ~var0.length || 8 == var0.length)) {
         return null;
      } else {
         while(~var1 < ~(var3 + var3)) {
            var3 += var3;
         }

         var0[3] = nb.a((byte)126, var3, new Object[5]);
         return var0;
      }
   }

}
