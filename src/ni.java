
final class ni extends tha {

   Object[] t;
   static Object[] w = sd.a(new Object[1], 102, (byte)118);
   static Object[] v = ab.a(new Object[2], (byte)-88);
   static int u;


   ni(Object[] var1) {
      this.t = var1;
   }

   static final void a(boolean var0, Object[] var1) {
      if(null != var1 && var1.length == 1) {
         a(true, (Object[])((Object[])id.f[0]));
      }

      ++u;
      long[] var2 = ph.d;
      ((long[])((long[])var1[0]))[0] = -1L;
      ((long[])((long[])var1[0]))[0] = var2[(int)(((long)(((int[])((int[])var1[1]))[0] >> 8) ^ ((long[])((long[])var1[0]))[0]) & 255L)] ^ ((long[])((long[])var1[0]))[0] >>> 8;
      ((long[])((long[])var1[0]))[0] = ((long[])((long[])var1[0]))[0] >>> 8 ^ var2[(int)((((long[])((long[])var1[0]))[0] ^ (long)((int[])((int[])var1[1]))[0]) & 255L)];

      int var3;
      for(var3 = 0; ((int[])((int[])var1[2])).length > var3; ++var3) {
         ((long[])((long[])var1[0]))[0] = ((long[])((long[])var1[0]))[0] >>> 8 ^ var2[(int)((((long[])((long[])var1[0]))[0] ^ (long)(((int[])((int[])var1[2]))[var3] >> 24)) & 255L)];
         ((long[])((long[])var1[0]))[0] = var2[(int)((((long[])((long[])var1[0]))[0] ^ (long)(((int[])((int[])var1[2]))[var3] >> 16)) & 255L)] ^ ((long[])((long[])var1[0]))[0] >>> 8;
         ((long[])((long[])var1[0]))[0] = ((long[])((long[])var1[0]))[0] >>> 8 ^ var2[(int)(((long)(((int[])((int[])var1[2]))[var3] >> 8) ^ ((long[])((long[])var1[0]))[0]) & 255L)];
         ((long[])((long[])var1[0]))[0] = var2[(int)(((long)((int[])((int[])var1[2]))[var3] ^ ((long[])((long[])var1[0]))[0]) & 255L)] ^ ((long[])((long[])var1[0]))[0] >>> 8;
      }

      if(null != var1[3]) {
         if(null != var1 && var1.length == 23) {
            rsa.b = (short[][])null;
         }

         for(var3 = 0; ((Object[])((Object[])var1[3])).length > var3; ++var3) {
            if(((Object[][])((Object[][])var1[3]))[var3] != null) {
               int[] var4;
               int[] var5;
               if(!((boolean[])((boolean[])var1[4]))[0]) {
                  var5 = (int[])((int[])((Object[][])((Object[][])var1[3]))[var3][3]);
                  var4 = (int[])((int[])((Object[][])((Object[][])var1[3]))[var3][4]);
               } else {
                  var5 = (int[])((int[])((Object[][])((Object[][])var1[3]))[var3][2]);
                  var4 = (int[])((int[])((Object[][])((Object[][])var1[3]))[var3][1]);
               }

               int var6;
               if(null != var4) {
                  if(null != var1 && (var1.length == 1 && var1[0].equals(Integer.valueOf(0)) || var1.length == 4)) {
                     sfa.a = (short[][][])null;
                  }

                  for(var6 = 0; var4.length > var6; ++var6) {
                     ((long[])((long[])var1[0]))[0] = ((long[])((long[])var1[0]))[0] >>> 8 ^ var2[(int)((((long[])((long[])var1[0]))[0] ^ (long)(var4[var6] >> 8)) & 255L)];
                     ((long[])((long[])var1[0]))[0] = ((long[])((long[])var1[0]))[0] >>> 8 ^ var2[(int)(255L & (((long[])((long[])var1[0]))[0] ^ (long)var4[var6]))];
                  }
               }

               if(var5 != null) {
                  for(var6 = 0; var6 < var5.length; ++var6) {
                     ((long[])((long[])var1[0]))[0] = ((long[])((long[])var1[0]))[0] >>> 8 ^ var2[(int)((((long[])((long[])var1[0]))[0] ^ (long)(var5[var6] >> 8)) & 255L)];
                     ((long[])((long[])var1[0]))[0] = ((long[])((long[])var1[0]))[0] >>> 8 ^ var2[(int)(((long)var5[var6] ^ ((long[])((long[])var1[0]))[0]) & 255L)];
                  }

                  if(null != var1 && -26 == ~var1.length && var1[8].equals(Boolean.valueOf(false))) {
                     ola.a((int[])null, (Object[][])null, true, 4, 115, (int[])((int[])id.f[0]), (Object[])null, (byte)51);
                  }
               }

               if(null != ((Object[][])((Object[][])var1[3]))[var3][5]) {
                  for(var6 = 0; var6 < ((short[])((short[])((Object[][])((Object[][])var1[3]))[var3][5])).length; ++var6) {
                     ((long[])((long[])var1[0]))[0] = var2[(int)(255L & (((long[])((long[])var1[0]))[0] ^ (long)(((short[])((short[])((Object[][])((Object[][])var1[3]))[var3][5]))[var6] >> 8)))] ^ ((long[])((long[])var1[0]))[0] >>> 8;
                     ((long[])((long[])var1[0]))[0] = var2[(int)((((long[])((long[])var1[0]))[0] ^ (long)((short[])((short[])((Object[][])((Object[][])var1[3]))[var3][5]))[var6]) & 255L)] ^ ((long[])((long[])var1[0]))[0] >>> 8;
                  }

                  if(var1 != null && -5 == ~var1.length) {
                     ((boolean[])((boolean[])kg.a[25]))[0] = ((boolean[])((boolean[])id.f[0]))[4];
                  }
               }

               if(null != ((Object[][])((Object[][])var1[3]))[var3][0]) {
                  for(var6 = 0; ((short[])((short[])((Object[][])((Object[][])var1[3]))[var3][0])).length > var6; ++var6) {
                     ((long[])((long[])var1[0]))[0] = var2[(int)(255L & ((long)(((short[])((short[])((Object[][])((Object[][])var1[3]))[var3][0]))[var6] >> 8) ^ ((long[])((long[])var1[0]))[0]))] ^ ((long[])((long[])var1[0]))[0] >>> 8;
                     ((long[])((long[])var1[0]))[0] = var2[(int)(((long)((short[])((short[])((Object[][])((Object[][])var1[3]))[var3][0]))[var6] ^ ((long[])((long[])var1[0]))[0]) & 255L)] ^ ((long[])((long[])var1[0]))[0] >>> 8;
                  }

                  if(null != var1 && -13 == ~var1.length) {
                     rsa.b = (short[][])((short[][])((Object[])((Object[])((Object[])((Object[])kg.a[20]))[11]))[3]);
                  }
               }
            }
         }
      }

      var3 = 0;
      if(!var0) {
         v = (Object[])((Object[])v[2]);
      }

      while(var3 < 10) {
         ((long[])((long[])var1[0]))[0] = var2[(int)(((long)((int[])((int[])var1[5]))[var3] ^ ((long[])((long[])var1[0]))[0]) & 255L)] ^ ((long[])((long[])var1[0]))[0] >>> 8;
         ++var3;
      }

      ((long[])((long[])var1[0]))[0] = ((long[])((long[])var1[0]))[0] >>> 8 ^ var2[(int)(255L & ((long)(((boolean[])((boolean[])var1[4]))[0]?1:0) ^ ((long[])((long[])var1[0]))[0]))];
   }

}
