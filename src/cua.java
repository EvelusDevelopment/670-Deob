
final class cua {

   static int d;
   static int a;
   static int e;
   static Object[] c = ura.a(-68, new Object[2]);
   static Object[] b = ho.a(-2, 63, new Object[1], true);


   static final void b(Object[] var0, int var1) {
      if(var1 != 5) {
         c = (Object[])null;
      }

      ++d;
      if(var0 != null && var0.length == 4) {
         hd.a(var0, (byte)-124);
      } else if(null != var0 && var0.length == 5) {
         bja.a(var0, -125);
      } else {
         throw new IllegalStateException();
      }
   }

   static final int a(boolean var0, Object[] var1) {
      ++e;
      int var2;
      if(null != var1 && -9 == ~var1.length) {
         var2 = ((int[])((int[])var1[1]))[3];
         return var2;
      } else if(var1 != null && var1.length == 11) {
         var2 = ((int[])((int[])var1[1]))[3];
         return var2;
      } else if(null != var1 && var1.length == 15) {
         return eoa.a(-19129, var1);
      } else {
         if(!var0) {
            b = (Object[])((Object[])var1[13]);
         }

         if(var1 != null && (-11 == ~var1.length || var1.length == 15)) {
            if(var1 != null && -16 == ~var1.length) {
               var2 = eoa.a(-19129, var1);
            } else {
               var2 = ag.a(var1, false);
            }

            return var2;
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final int a(Object[] var0, int var1) {
      ++a;
      if(var1 != 0) {
         a(((boolean[])((boolean[])b[3]))[8], (Object[])null);
      }

      return var0[6] != null?((int[])((int[])var0[6])).length:0;
   }

}
