
final class ila {

   static boolean b = false;
   static int c;
   static int a;


   static final int a(int var0, Object[] var1) {
      if(var0 != 0) {
         b = ((boolean[])((boolean[])var1[0]))[0];
      }

      ++c;
      return ((int[])((int[])var1[1]))[0];
   }

   static final boolean a(int var0, byte var1, int[] var2, Object[] var3, int var4) {
      ++a;
      if(var1 != 5) {
         b = ((boolean[])((boolean[])var3[1]))[1];
      }

      wr var5;
      wr var6;
      for(Object[] var7 = (var5 = (wr)dda.a((Object[])((Object[])var3[3]), 2)) != null?var5.f_l:null; null != var7; var7 = (var6 = (wr)client.a((Object[])((Object[])var3[3]), -28280)) != null?var6.f_l:null) {
         boolean var8;
         if(var0 >= ((int[])((int[])var7[1]))[2] && ~var0 >= ~((int[])((int[])var7[1]))[4] && ((int[])((int[])var7[1]))[8] <= var4 && ((int[])((int[])var7[1]))[6] >= var4) {
            var8 = true;
         } else {
            var8 = false;
         }

         if(var8) {
            br.a(var0, var2, false, var4, var7);
            return true;
         }
      }

      return false;
   }

   static {
      vra.a(536870911, 76, "", new Object[1]);
   }
}
