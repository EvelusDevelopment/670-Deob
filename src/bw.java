
final class bw {

   static int b = 4;
   static int d;
   static Object[] a = st.a(new Object[1], 7, 15, 19);
   static int e;
   static int c;
   static int g;
   static Object[][] f;
   static int h;


   static final void a(int var0, int var1, Object[] var2, int var3, int var4) {
      ++h;
      Object[] var7 = ((Object[][][])((Object[][][])var2[25]))[var1][var3];
      if(null != var7) {
         ((Object[][][])((Object[][][])var2[25]))[var1][var3] = null;
         if(~(((int[])((int[])var2[9]))[var1] & 2) == var0) {
            ((int[])((int[])var7[1]))[13] = 0;
         } else {
            mt var5;
            mt var6;
            for(Object[] var8 = null == (var5 = (mt)dda.a((Object[])((Object[])((Object[])((Object[])var2[4]))[0]), var0 ^ -3))?null:var5.n; null != var8; var8 = (var6 = (mt)client.a((Object[])((Object[])((Object[])((Object[])var2[4]))[0]), -28280)) == null?null:var6.n) {
               if(((int[])((int[])var7[1]))[3] == ((int[])((int[])var8[1]))[3] && ((int[])((int[])var8[1]))[13] < 0 && var7 != var8) {
                  ((int[])((int[])var7[1]))[13] = 0;
                  break;
               }
            }

            if(null != var2 && (7 == var2.length && var2[2].equals(Boolean.valueOf(false)) || var2.length == 20 && var2[6].equals(Integer.valueOf(0)))) {
               return;
            }
         }

      }
   }

   static final void a(String var0, byte var1, Object[] var2) {
      ++e;
      int var3 = var0.indexOf(0);
      if(0 <= var3) {
         throw new IllegalArgumentException("");
      } else {
         ((int[])((int[])var2[1]))[0] += nea.a(0, 4, (byte[])((byte[])var2[2]), var0.length(), ((int[])((int[])var2[1]))[0], var0);
         byte[] var10000 = (byte[])((byte[])var2[2]);
         int[] var10001 = (int[])((int[])var2[1]);
         int var10004 = ((int[])((int[])var2[1]))[0];
         var10001[0] = ((int[])((int[])var2[1]))[0] + 1;
         var10000[var10004] = var1;
      }
   }

   static final boolean a(int var0, int var1, byte var2) {
      ++g;
      int var3 = 88 % ((var2 - 20) / 52);
      return -1 != ~(2048 & var1);
   }

   static final Object[] a(boolean var0, Object[] var1, Object[] var2, Object[] var3, Object[] var4) {
      var3[1] = var4;
      ++c;
      var3[0] = var2;
      if(var0) {
         b = -116;
      }

      var3[2] = var1;
      return var3;
   }

   static final void a(Object[] var0, int var1) {
      var0[2] = new float[16];
      ++d;
      var0[5] = new float[16];
      var0[9] = ab.a(new Object[2], (byte)-118);
      var0[4] = nj.a(3, new Object[2]);
      var0[10] = tja.a(1, new Object[2]);
      var0[15] = nj.a(var1 ^ 0, new Object[2]);
      if(null != var0 && 3 == var0.length) {
         a((Object[])null, 3);
      }

      var0[12] = tja.a(var1 - 2, new Object[2]);
      var0[var1] = nj.a(3, new Object[2]);
      var0[16] = nj.a(3, new Object[2]);
      var0[11] = nj.a(3, new Object[2]);
      var0[13] = nj.a(3, new Object[2]);
      var0[14] = nj.a(3, new Object[2]);
      var0[0] = ab.a(new Object[2], (byte)94);
   }

}
