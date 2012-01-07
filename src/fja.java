
final class fja {

   static Object[] b = sd.a(new Object[1], 44, (byte)127);
   static float d = 0.0F;
   static int e;
   static int a;
   static int c;


   static final int b(int var0, Object[] var1) {
      if(var0 != 8) {
         return ((int[])((int[])((Object[])((Object[])((Object[])((Object[])b[3]))[7]))[1]))[0];
      } else {
         ++e;
         return ((int[])((int[])var1[12]))[8];
      }
   }

   static final Object a(int var0, byte[] var1, boolean var2) {
      ++c;
      if(null == var1) {
         return null;
      } else if(var0 > ~var1.length) {
         Object[] var6 = new Object[26];
         nh.a(var6, var0 + 141);
         fpa.c(var0 + 55, var6);
         wn.a(var6, var1, var0 ^ -139);
         return var6;
      } else if(!var2) {
         return var1;
      } else {
         int var4 = var1.length;
         byte[] var5 = new byte[var4];
         System.arraycopy(var1, 0, var5, 0, var4);
         return var5;
      }
   }

   static final boolean a(int var0, Object[] var1) {
      ++a;
      if(null != var1 && (-5 == ~var1.length || -3 == ~var1.length)) {
         return true;
      } else if(null != var1 && 16 == var1.length && 3 == ((byte[])((byte[])var1[10])).length) {
         return ws.a(1, var1);
      } else {
         boolean var2;
         if(var1 != null && var1.length == 20 && -4 == ~((byte[])((byte[])var1[10])).length) {
            var2 = false;
            return var2;
         } else if(var1 != null && (var1.length == 18 || var1.length == 20 && -3 == ~((byte[])((byte[])var1[10])).length && 6 == ((boolean[])((boolean[])var1[8])).length)) {
            var2 = false;
            return var2;
         } else if(var0 != 9) {
            return ((boolean[])((boolean[])b[8]))[8];
         } else if(null != var1 && var1.length == 22) {
            return dja.c(119, var1);
         } else if(null != var1 && -44 == ~var1.length && ((boolean[])((boolean[])var1[8])).length == 10) {
            return wj.c(var1, 0);
         } else if(var1 != null && 16 == var1.length && 2 == ((byte[])((byte[])var1[10])).length) {
            return qaa.b(1, var1);
         } else if(var1 != null && -24 == ~var1.length) {
            return foa.a(var1, (byte)111);
         } else if(null != var1 && var1.length == 17) {
            return dn.a(var0 ^ -96, var1);
         } else if(var1 != null && 24 == var1.length) {
            return bf.b(17, var1);
         } else if(var1 != null && 20 == var1.length && ((byte[])((byte[])var1[10])).length == 4) {
            return mla.a(var1, (byte)126);
         } else if(var1 != null && -21 == ~var1.length && 7 == ((boolean[])((boolean[])var1[8])).length) {
            var2 = false;
            return var2;
         } else if(var1 != null && 43 == var1.length && 9 == ((byte[])((byte[])var1[10])).length) {
            var2 = false;
            return var2;
         } else {
            throw new IllegalStateException();
         }
      }
   }

}
