
final class vm {

   static int c;
   static int e;
   static Object[] f = sd.a(new Object[1], 71, (byte)120);
   static int h;
   static int f_i;
   static int d;
   static Object[] b = ho.a(-1, 27, new Object[1], true);
   static int g;
   static Object[] a = ed.a(25, new Object[1], (byte)-117, 112);


   static final void a(int var0, ta var1, byte var2, int var3, boolean var4, int var5, Object[] var6, Object[] var7) {
      ++g;
      if(var2 <= 8) {
         a((Object[])((Object[])var7[15]), (Object[])null, ((int[])((int[])b[4]))[4], (Object[])null);
      }

      throw new IllegalStateException();
   }

   static final void a(Object[] var0, Object[] var1, int var2, Object[] var3) {
      if(var2 != 29600) {
         a = (Object[])null;
      }

      ++h;
      gv.a(((float[])((float[])var0[0]))[0], -81, ((float[])((float[])var0[0]))[2], ((Object[][])((Object[][])var1[3]))[((int[])((int[])var1[1]))[2]], var3, ((float[])((float[])var0[0]))[1], ((float[])((float[])var0[0]))[3]);
   }

   static final Object[] a(Object[] var0, int var1, Object[] var2) {
      ++e;
      var2[1] = oea.a(var1 - 16501, var2);
      var2[0] = var0;
      if(var1 != 16502) {
         a(((byte[])((byte[])f[7]))[1], (Object[])null);
      }

      return var2;
   }

   static final int a(byte var0, Object[] var1) {
      ++d;
      int var2;
      if(var1 != null && -17 == ~var1.length) {
         var2 = ((int[])((int[])((Object[])((Object[])var1[14]))[1]))[5];
         return var2;
      } else if(var1 != null && var1.length == 20 && -7 == ~((boolean[])((boolean[])var1[8])).length) {
         var2 = ((int[])((int[])((Object[])((Object[])var1[17]))[1]))[5];
         return var2;
      } else if(null != var1 && 22 == var1.length) {
         var2 = ((int[])((int[])((Object[])((Object[])var1[18]))[1]))[5];
         return var2;
      } else if(var1 != null && 18 == var1.length) {
         return ft.a(var1, (byte)-128);
      } else {
         byte var3;
         if(var1 != null && var1.length == 23) {
            var3 = ((byte[])((byte[])var1[10]))[2];
            return var3;
         } else if(var1 != null && 17 == var1.length) {
            return io.a((byte)-126, var1);
         } else if(var1 != null && var1.length == 20 && 8 == ((boolean[])((boolean[])var1[8])).length) {
            var3 = ((byte[])((byte[])var1[10]))[2];
            return var3;
         } else if(var1 != null && var1.length == 20 && 7 == ((boolean[])((boolean[])var1[8])).length) {
            var2 = ((int[])((int[])((Object[])((Object[])var1[19]))[1]))[5];
            return var2;
         } else {
            if(var0 != 20) {
               ((byte[])((byte[])var1[1]))[6] = -61;
            }

            throw new IllegalStateException();
         }
      }
   }

   static final void a(byte[] var0, int var1, int var2, int var3, Object[] var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      ++c;
      if(var9 != 112) {
         a(((int[])((int[])b[1]))[21], (ta)null, (byte)-34, 105, false, ((int[])((int[])var4[9]))[0], (Object[])null, (Object[])null);
      }

   }

   static final byte[] a(Object[] var0, int var1, int var2, int var3, int var4) {
      if(var1 != 5) {
         ((boolean[])((boolean[])var0[4]))[12] = true;
      }

      var0[4] = new byte[var4 * var3 * var2 * 2];
      ++f_i;
      dba.a(var0, var2, var4, -124, var3);
      return (byte[])((byte[])var0[4]);
   }

}
