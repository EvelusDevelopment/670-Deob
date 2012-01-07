
final class pba {

   static int a;
   static int h;
   static int f_i;
   static int f;
   static Object[] b = nea.a((byte)-53, new Object[1], 1);
   static int d;
   static Object[] g = dqa.a(new Object[1], 2, 24322);
   static Object[] e = ed.a(8, new Object[1], (byte)-101, 138);
   static Object[] c = ed.a(-1, new Object[1], (byte)-123, 42);


   static final void a(int var0, Object[] var1, Object[] var2) {
      ++a;
      int var3 = ((int[])((int[])var2[1]))[0];
      if(var0 != -1) {
         a(2, (Object[])null, (Object[])null);
      }

      int var4 = ((int[])((int[])var2[1]))[3];
      int var5 = ((int[])((int[])var2[1]))[2];
      int var6 = ((int[])((int[])var2[1]))[1];
      int var11 = -1 + (1 << var5);
      int var12 = 31 != var6?(1 << var6 + 1) - 1:-1;
      int var13 = var12 ^ var11;
      var4 <<= var5;
      var4 &= var13;
      if(var1[9] != null) {
         lm var14 = pm.a((long)var3, (Object[])((Object[])var1[9]), false);
         if(var14 != null) {
            ma var8;
            if(var14 instanceof ma && (null == (var8 = (ma)var14)?null:var8.s) != null) {
               ma var9;
               Object[] var16 = null == (var9 = (ma)var14)?null:var9.s;
               if((var13 & ((int[])((int[])var16[1]))[0]) != var4) {
                  ((int[])((int[])var16[1]))[0] &= ~var13;
                  ((int[])((int[])var16[1]))[0] |= var4;
               }

               return;
            }

            var14.a((byte)119);
         }
      } else {
         var1[9] = nb.a((byte)83, 4, new Object[5]);
      }

      Object[] var10;
      di.a((Object[])((Object[])var1[9]), true, (lm)((var10 = ps.a((byte)101, var4, new Object[2])) == null?null:var10[0]), (long)var3);
   }

   static final lua a(int var0, int var1, Object[] var2, int var3) {
      ++h;
      Object[] var4;
      return var3 > -110?(lua)b[1]:(lua)(null == (var4 = tca.a(false, var2, new Object[5], var0, op.b, vk.b, var1))?null:var4[4]);
   }

   static final String a(Object[] var0, byte var1) {
      if(var1 <= 67) {
         a(-62, (Object[])((Object[])b[17]));
      }

      ++f_i;
      return !kea.c && var0 != null?((var0[5] == null || ((String)var0[5]).length() == 0) && var0[3] != null && -1 > ~((String)var0[3]).length()?(String)var0[3]:(String)var0[5]):"";
   }

   static final lm a(Object[] var0, int var1, long var2) {
      if(null != var0 && var0.length == 8) {
         soa.a((Object[])null, (int)1);
      }

      ++f;
      lm var4 = ((lm[])((lm[])var0[2]))[(int)((long)(((int[])((int[])var0[1]))[0] - 1) & var2)];

      for(var0[0] = var4.f; var4 != var0[0]; var0[0] = ((lm)var0[0]).f) {
         if(~((lm)var0[0]).e == ~var2) {
            lm var5 = (lm)var0[0];
            var0[0] = ((lm)var0[0]).f;
            return var5;
         }
      }

      var0[0] = null;
      if(var1 != 27753) {
         b = new Object[14];
      }

      return null;
   }

   static final void a(int var0, Object[] var1) {
      if(var0 != 1) {
         a((Object[])((Object[])e[25]), ((int[])((int[])c[3]))[17], 115L);
      }

      if(null == var1[1]) {
         var1[1] = new int[1];
      }

      ++d;
   }

}
