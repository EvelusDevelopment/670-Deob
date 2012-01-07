
final class nb {

   static int[] f_i = new int[1];
   static Object[] f = nla.a(92, new Object[0], 3);
   static int e;
   static int k;
   static int h;
   static int j;
   static int c;
   static int a;
   static int d;
   static int b = 1;
   static Object[] g;


   static final Object[] a(byte var0, int var1, Object[] var2) {
      wq.a(var2, 124);
      ++c;
      ((int[])((int[])var2[1]))[1] = var1;
      ((int[])((int[])var2[1]))[0] = 0;
      if(null != var2 && (var2.length == 6 || -4 == ~var2.length || var2.length == 11)) {
         mla.b((Object[])null, (byte)123);
      }

      var2[4] = new lm[var1];
      if(var0 < 46) {
         f_i = (int[])null;
      }

      for(int var3 = 0; var3 < var1; ++var3) {
         lm var4 = ((lm[])((lm[])var2[4]))[var3] = new lm();
         var4.f = var4;
         var4.d = var4;
      }

      return var2;
   }

   static final Object[] newPacket(int size, int opcode) {
      Object[] wrapper = new Object[1];
      wrapper[0] = new int[1];
      ++a;
      ((int[])((int[])wrapper[0]))[0] = opcode;
      return wrapper;
   }

   static final Object[] a(int var0) {
      if(var0 != -11269) {
         return (Object[])null;
      } else {
         ++d;
         fg.q = 0;
         Object[] var1;
         if(~fg.q <= ~ft.n.length) {
            var1 = null;
         } else {
            var1 = ft.n[fg.q++];
         }

         return var1;
      }
   }

   static final void b(Object[] var0, int var1) {
      while(true) {
         lm var2 = ((lm)var0[0]).f;
         if(var0[0] == var2) {
            ++k;
            var0[1] = null;
            if(null != var0 && var0.length == 3 && var0[2].equals(Integer.valueOf(1))) {
               dda.a((Object[])null, 2);
            }

            return;
         }

         var2.a((byte)32);
      }
   }

   static final void a(boolean var0, Object[] var1) {
      if(null == var1[1]) {
         var1[1] = new int[1];
      }

      if(null == var1[4]) {
         var1[4] = new float[1];
      }

      if(!var0) {
         ++h;
      }
   }

   static final void initISAAC(Object[] wrapper, int var1) {
      ++j;
      int var4 = -1640531527;
      int var3 = -1640531527;
      int var7 = -1640531527;
      int var5 = -1640531527;
      if(null != wrapper && 2 == wrapper.length && wrapper[0].equals(Boolean.valueOf(false)) && wrapper[0].equals(Integer.valueOf(0))) {
         fg.d(1, (Object[])null);
      }

      int var10 = -1640531527;
      int var9 = -1640531527;
      int var6 = -1640531527;
      int var8 = -1640531527;

      int var2;
      for(var2 = 0; var2 < 4; ++var2) {
         var3 ^= var4 << 11;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 >>> 2;
         var5 += var6;
         var7 += var4;
         var5 ^= var6 << 8;
         var6 += var7;
         var8 += var5;
         var6 ^= var7 >>> 16;
         var7 += var8;
         var9 += var6;
         var7 ^= var8 << 10;
         var8 += var9;
         var10 += var7;
         var8 ^= var9 >>> 4;
         var9 += var10;
         var3 += var8;
         var9 ^= var10 << 8;
         var10 += var3;
         var4 += var9;
         var10 ^= var3 >>> 9;
         var5 += var10;
         var3 += var4;
      }

      for(var2 = 0; 256 > var2; var2 += 8) {
         var5 += ((int[])((int[])wrapper[2]))[var2 + 2];
         var9 += ((int[])((int[])wrapper[2]))[6 + var2];
         var8 += ((int[])((int[])wrapper[2]))[var2 + 5];
         var10 += ((int[])((int[])wrapper[2]))[var2 + 7];
         var3 += ((int[])((int[])wrapper[2]))[var2];
         var6 += ((int[])((int[])wrapper[2]))[var2 + 3];
         var4 += ((int[])((int[])wrapper[2]))[var2 + 1];
         var7 += ((int[])((int[])wrapper[2]))[4 + var2];
         var3 ^= var4 << 11;
         if(wrapper != null && -15 == ~wrapper.length && wrapper[3].equals(Integer.valueOf(0))) {
            qea.b((Object[])null, (byte)50);
         }

         var6 += var3;
         var4 += var5;
         var4 ^= var5 >>> 2;
         var5 += var6;
         var7 += var4;
         var5 ^= var6 << 8;
         var6 += var7;
         var8 += var5;
         var6 ^= var7 >>> 16;
         var7 += var8;
         var9 += var6;
         var7 ^= var8 << 10;
         var10 += var7;
         var8 += var9;
         var8 ^= var9 >>> 4;
         var3 += var8;
         var9 += var10;
         var9 ^= var10 << 8;
         var10 += var3;
         var4 += var9;
         var10 ^= var3 >>> 9;
         var3 += var4;
         var5 += var10;
         ((int[])((int[])wrapper[0]))[var2] = var3;
         ((int[])((int[])wrapper[0]))[var2 + 1] = var4;
         ((int[])((int[])wrapper[0]))[var2 + 2] = var5;
         ((int[])((int[])wrapper[0]))[3 + var2] = var6;
         ((int[])((int[])wrapper[0]))[var2 + 4] = var7;
         ((int[])((int[])wrapper[0]))[5 + var2] = var8;
         ((int[])((int[])wrapper[0]))[6 + var2] = var9;
         ((int[])((int[])wrapper[0]))[var2 + 7] = var10;
      }

      for(var2 = var1; var2 < 256; var2 += 8) {
         var7 += ((int[])((int[])wrapper[0]))[var2 + 4];
         var3 += ((int[])((int[])wrapper[0]))[var2];
         var5 += ((int[])((int[])wrapper[0]))[2 + var2];
         var6 += ((int[])((int[])wrapper[0]))[var2 + 3];
         var9 += ((int[])((int[])wrapper[0]))[var2 + 6];
         var8 += ((int[])((int[])wrapper[0]))[var2 + 5];
         var4 += ((int[])((int[])wrapper[0]))[var2 + 1];
         var10 += ((int[])((int[])wrapper[0]))[7 + var2];
         var3 ^= var4 << 11;
         var4 += var5;
         var6 += var3;
         var4 ^= var5 >>> 2;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 << 8;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 >>> 16;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 << 10;
         var8 += var9;
         var10 += var7;
         var8 ^= var9 >>> 4;
         var9 += var10;
         var3 += var8;
         var9 ^= var10 << 8;
         var4 += var9;
         var10 += var3;
         var10 ^= var3 >>> 9;
         var3 += var4;
         var5 += var10;
         ((int[])((int[])wrapper[0]))[var2] = var3;
         ((int[])((int[])wrapper[0]))[var2 + 1] = var4;
         ((int[])((int[])wrapper[0]))[var2 + 2] = var5;
         ((int[])((int[])wrapper[0]))[3 + var2] = var6;
         ((int[])((int[])wrapper[0]))[4 + var2] = var7;
         ((int[])((int[])wrapper[0]))[5 + var2] = var8;
         ((int[])((int[])wrapper[0]))[6 + var2] = var9;
         ((int[])((int[])wrapper[0]))[var2 + 7] = var10;
      }

      fg.d(var1 + 1, wrapper);
      ((int[])((int[])wrapper[1]))[3] = 256;
   }

   static final void a(boolean var0, boolean var1, Object[] var2) {
      if(!var0) {
         ++e;
         if(!var1 == ((boolean[])((boolean[])var2[3]))[0]) {
            int var3 = qka.a(-23864, var2);
            ((boolean[])((boolean[])var2[3]))[0] = true;
            Class_b.a(var2, 22775);
            uia.a(var3, var2, -113);
         }

      }
   }

}
