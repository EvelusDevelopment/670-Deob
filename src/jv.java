
final class jv {

   static int a;
   static int c;
   static int e;
   static int f;
   static Object[] g;
   static int d;
   static int b;


   static final void a(int var0, Object[] var1) {
      var1[4] = null;
      int var2 = 60 % ((-53 - var0) / 50);
      var1[2] = null;
      var1[1] = null;
      var1[6] = null;
      var1[3] = null;
      ++d;
   }

   static final void a(byte var0, Object[] var1) {
      if(var1[1] == null) {
         var1[1] = new int[4];
      }

      if(var0 != -11) {
         ((long[])((long[])g[1]))[2] = 54L;
      }

      ++f;
   }

   static final void a(int var0, Object[] var1, boolean var2) {
      ++c;
      synchronized(var1) {
         if(var2) {
            g = (Object[])null;
         }

         Object[] var5 = ps.a((byte)-9, var0, new Object[2]);
         client.a(125, (Object[])((Object[])var1[77]), (lm)(var5 != null?var5[0]:null));
      }
   }

   static final void a(int var0, int var1, Object[] var2, byte var3) {
      ++b;
      int var4 = var1 * 2;
      int var5 = 255 & var3;
      ((byte[])((byte[])var2[var0]))[var4++] = (byte)(3 * var5 >> 5);
      ((byte[])((byte[])var2[5]))[var4] = (byte)(var5 * 3 >> 5);
   }

   static final void b(Object[] var0, byte var1) {
      if(var1 == -88) {
         ++a;
         if(var0[0] == null) {
            var0[0] = new int[1];
         }

      }
   }

   static final int a(Object[] var0, byte var1) {
      ++e;
      if(null != var0 && var0.length == 8) {
         return bsa.b(-41, var0);
      } else if(var0 != null && var0.length >= 8) {
         return rh.a(var0, (byte)117);
      } else {
         if(var1 > -50) {
            a((byte)-38, (Object[])null);
         }

         if(var0 != null && var0.length == 9) {
            return fw.a(1, var0);
         } else if(null != var0 && -7 == ~var0.length) {
            return uga.a((byte)104, var0);
         } else if(null != var0 && 7 == var0.length) {
            return rda.a(-23383, var0);
         } else {
            throw new IllegalStateException();
         }
      }
   }

}
