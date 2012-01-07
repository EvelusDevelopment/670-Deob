
final class nv {

   static Object[][] c;
   static int d;
   static int b;
   static int a;


   static final void a(int var0) {
      nga.e = null;
      kpa.e = null;
      fb.c = null;
      iaa.b = null;
      ov.d = null;
      if(var0 != 23) {
         c = (Object[][])((Object[][])null);
      }

      wfa.d = null;
      jp.m = null;
      uj.b = null;
      gfa.c = null;
      fha.m = null;
      wla.f = null;
      mp.a = null;
      bna.g = null;
      fra.B = null;
      kv.f_i = null;
      ++b;
      naa.f = null;
      uda.n = null;
   }

   static final boolean a(ta var0, int var1, Object[] var2, int var3, int var4) {
      ++a;
      boolean var5;
      ka var6;
      if(var2 != null && 16 == var2.length && ((int[])((int[])var2[12])).length == 3) {
         var6 = qn.a(131072, var0, (Object[])((Object[])var2[14]), (byte)-55, false, false);
         if(var6 == null) {
            var5 = false;
         } else {
            var5 = var6.a(var1, var3, bra.a(var2, true), false, 0);
         }

         return var5;
      } else if(null != var2 && -21 == ~var2.length && ((int[])((int[])var2[12])).length == 3 && ((boolean[])((boolean[])var2[8])).length == 6) {
         return ge.a(var2, var3, (byte)48, var0, var1);
      } else if(null != var2 && 20 == var2.length && ((int[])((int[])var2[12])).length == 7) {
         return uja.a(var2, var3, var1, var0, (byte)40);
      } else if(null != var2 && var2.length == 16 && ((byte[])((byte[])var2[10])).length == 2) {
         return bpa.a(var0, var3, var1, var2, 25892);
      } else if(null != var2 && -23 == ~var2.length) {
         var6 = qn.a(131072, var0, (Object[])((Object[])var2[18]), (byte)-55, false, false);
         if(var6 != null) {
            var5 = var6.a(var1, var3, bra.a(var2, true), false, 0);
         } else {
            var5 = false;
         }

         return var5;
      } else {
         if(var4 != 3) {
            a((ta)null, -122, (Object[])null, ((int[])((int[])var2[0]))[6], ((int[])((int[])((Object[])((Object[])((Object[])((Object[])var2[0]))[7]))[0]))[0]);
         }

         if(null != var2 && var2.length == 43 && 10 == ((boolean[])((boolean[])var2[8])).length) {
            return cc.a(var3, var1, var0, var2, (byte)71);
         } else {
            Object[] var7;
            if(var2 != null && var2.length == 18) {
               var6 = ffa.a(var0, (byte)-76, var2, 131072);
               if(var6 != null) {
                  var7 = bra.a(var2, true);
                  var5 = var6.a(var1, var3, var7, false, 0);
               } else {
                  var5 = false;
               }

               return var5;
            } else if(null != var2 && var2.length == 23) {
               var6 = sda.a(var2, var0, var4 - 11124, 131072);
               if(null == var6) {
                  var5 = false;
               } else {
                  var7 = bra.a(var2, true);
                  var5 = var6.a(var1, var3, var7, false, 0);
               }

               return var5;
            } else if(null != var2 && var2.length == 17) {
               var6 = ar.a(true, 131072, var2, var0);
               if(null != var6) {
                  var7 = bra.a(var2, true);
                  var5 = var6.a(var1, var3, var7, false, 0);
               } else {
                  var5 = false;
               }

               return var5;
            } else if(null != var2 && 24 == var2.length) {
               var5 = false;
               return var5;
            } else if(var2 != null && var2.length == 20 && 4 == ((byte[])((byte[])var2[10])).length) {
               var6 = sda.a(var0, (byte)124, var2, 131072);
               if(null != var6) {
                  var7 = bra.a(var2, true);
                  var5 = var6.a(var1, var3, var7, false, 0);
               } else {
                  var5 = false;
               }

               return var5;
            } else if(var2 != null && -21 == ~var2.length && ((boolean[])((boolean[])var2[8])).length == 7) {
               var6 = qn.a(131072, var0, (Object[])((Object[])var2[19]), (byte)-55, false, false);
               if(var6 != null) {
                  var5 = var6.a(var1, var3, bra.a(var2, true), false, 0);
               } else {
                  var5 = false;
               }

               return var5;
            } else if(var2 != null && -44 == ~var2.length && ((boolean[])((boolean[])var2[8])).length == 16) {
               return fb.a(var1, var3, 119, var2, var0);
            } else {
               throw new IllegalStateException();
            }
         }
      }
   }

}
