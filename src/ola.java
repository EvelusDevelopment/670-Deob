
final class ola {

   static int g;
   static int h;
   static int f_i;
   static int c = 0;
   static int a;
   static int d;
   static int e;
   static int f;
   static int b;


   static final void a(int[] var0, Object[][] var1, boolean var2, int var3, int var4, int[] var5, Object[] var6, byte var7) {
      var6[3] = var1;
      var6[2] = var0;
      ((int[])((int[])var6[1]))[1] = var4;
      ((boolean[])((boolean[])var6[4]))[0] = var2;
      if(~var3 != ~((int[])((int[])var6[1]))[0]) {
         ((int[])((int[])var6[1]))[0] = var3;
      }

      ++f_i;
      var6[5] = var5;
      ni.a(true, var6);
      if(var7 != 51) {
         a(40, (String)null);
      }

   }

   static final long a(int var0, String var1) {
      ++g;
      if(var0 > -39) {
         a((int[])null, (Object[][])((Object[][])null), false, 54, -14, (int[])null, (Object[])null, (byte)-1);
      }

      long var2 = 0L;
      int var4 = var1.length();

      for(int var5 = 0; var4 > var5; ++var5) {
         var2 *= 37L;
         char var6 = var1.charAt(var5);
         if(var6 >= 65 && 90 >= var6) {
            var2 += (long)(-65 + 1 + var6);
         } else if(97 <= var6 && var6 <= 122) {
            var2 += (long)(-97 + 1 + var6);
         } else if(48 <= var6 && var6 <= 57) {
            var2 += (long)(-21 + var6);
         }

         if(~var2 <= -177917621779460414L) {
            break;
         }
      }

      while(var2 % 37L == 0L && var2 != 0L) {
         var2 /= 37L;
      }

      return var2;
   }

   static final Object[] a(byte var0, Object[] var1, Object[] var2, Object[] var3) {
      ++e;
      if(var1[1] == null) {
         var1[1] = new int[5];
      }

      int var9 = 57 / ((var0 + 2) / 56);
      if(null != var2 && (var2.length == 9 || var2.length == 11)) {
         return null;
      } else {
         var1[3] = var3;
         var1[4] = var2;
         Object[] var6;
         Object[] var7;
         ((int[])((int[])var1[1]))[3] = 2 + (((aa)((var7 = (Object[])((Object[])var1[3])) != null?var7[6]:null)).g * ((aa)(null == (var6 = (Object[])((Object[])var1[3]))?null:var6[6])).h >> ((int[])((int[])((Object[])((Object[])var1[4]))[1]))[9]);
         Object[] var4;
         Object[] var5;
         ((int[])((int[])var1[1]))[0] = (((aa)((var5 = (Object[])((Object[])var1[3])) == null?null:var5[6])).g * ((aa)((var4 = (Object[])((Object[])var1[3])) != null?var4[6]:null)).f_i >> ((int[])((int[])((Object[])((Object[])var1[4]))[1]))[9]) + 2;
         var1[0] = new byte[((int[])((int[])var1[1]))[0] * ((int[])((int[])var1[1]))[3]];
         Object[] var8;
         ((int[])((int[])var1[1]))[4] = -((aa)((var8 = (Object[])((Object[])var1[3])) != null?var8[6]:null)).a + 7 + ((int[])((int[])((Object[])((Object[])var1[4]))[1]))[9];
         Object[] var10;
         ((int[])((int[])var1[1]))[1] = ((aa)(null != (var10 = (Object[])((Object[])var1[3]))?var10[6]:null)).f_i >> ((int[])((int[])var1[1]))[4];
         Object[] var11;
         ((int[])((int[])var1[1]))[2] = ((aa)(null == (var11 = (Object[])((Object[])var1[3]))?null:var11[6])).h >> ((int[])((int[])var1[1]))[4];
         return var1;
      }
   }

   static final void a(int var0, Object[] var1) {
      cg.a(var1, (byte)-107);
      ++d;
      Object[] var2 = (Object[])((Object[])var1[2]);
      var1[6] = ib.a((Object[])((Object[])var1[5]), var0 + 9, ((int[])((int[])var2[1]))[9]);
      var1[11] = ib.a((Object[])((Object[])var1[5]), var0 + 9, ((int[])((int[])var2[1]))[10]);
      var1[10] = ib.a((Object[])((Object[])var1[5]), var0 ^ 23, ((int[])((int[])var2[1]))[var0]);
      var1[7] = ib.a((Object[])((Object[])var1[5]), 16, ((int[])((int[])var2[1]))[11]);
      var1[8] = ib.a((Object[])((Object[])var1[5]), 16, ((int[])((int[])var2[1]))[12]);
      var1[9] = ib.a((Object[])((Object[])var1[5]), 16, ((int[])((int[])var2[1]))[8]);
   }

   static final Object[] a(Object[] var0, byte var1, Object[] var2) throws oqa {
      ++f;
      if(var1 != 122) {
         a(-52, (Object[])((Object[])var2[0]));
      }

      if(null == var0[1]) {
         var0[1] = new int[1];
      }

      var0[0] = ab.a(new Object[2], (byte)109);
      var0[3] = var2;
      saa.a((byte)30, var0);
      pu.a((byte)109, var0);
      return var0;
   }

   static final int a(Object[] var0, int var1) {
      ++a;
      if(var1 != -28642) {
         return -107;
      } else {
         Object[] var3 = (Object[])((Object[])var0[14]);
         int var2 = -cba.a(var1 ^ -1703, var3);
         return var2;
      }
   }

}
