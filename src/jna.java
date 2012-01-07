import jagdx.IDirect3DDevice;

final class jna {

   static int g;
   static int h;
   static int c;
   static Object[] d = ho.a(3, 48, new Object[1], true);
   static int e;
   static int b;
   static int f;
   static int a = 328;
   static boolean f_i;


   static final void a(boolean var0, Object[] var1) {
      ++c;
      int var2 = lu.a(rpa.a((Object[])((Object[])var1[0]), (byte)127), (byte)-3);
      if(!var0) {
         if(var2 < 96) {
            ((int[])((int[])var1[1]))[0] = 0;
         }

         if(-2 > ~((int[])((int[])var1[1]))[0] && 128 > var2) {
            ((int[])((int[])var1[1]))[0] = 1;
         }

         if(((int[])((int[])var1[1]))[0] > 2 && 192 > var2) {
            ((int[])((int[])var1[1]))[0] = 2;
         }

         if(((int[])((int[])var1[1]))[0] < 0 || 3 < ((int[])((int[])var1[1]))[0]) {
            ((int[])((int[])var1[1]))[0] = vs.a((byte)-117, var1);
         }

      }
   }

   static final void a(Object[] var0, int var1, Object[] var2, byte var3) {
      ++h;
      IDirect3DDevice.SetStreamSource(((long[])((long[])var0[50]))[5], var1, ((long[])((long[])var2[4]))[0], 0, caa.a(-73, var2));
      if(var3 < 20) {
         a(((byte[])((byte[])d[1]))[17], (Object[])((Object[])var0[0]));
      }

   }

   static final Object[] a(byte var0, Object[] var1) {
      if(var0 != 127) {
         a(false, (byte)-120, 91, ((int[])((int[])d[1]))[27], (Object[])null, 85);
      }

      ++b;
      if(null != var1 && -3 == ~var1.length) {
         return cw.a(var0 - 126, var1);
      } else if(null != var1 && 3 == var1.length) {
         return nt.b(var1, 109);
      } else {
         throw new IllegalStateException();
      }
   }

   static final void a(int var0, int var1, Object[] var2, int[] var3) {
      if(var2 != null && var2.length == 2) {
         isa.b(22, (Object[])null);
      }

      if(var1 != 4538) {
         d = (Object[])((Object[])var2[1]);
      }

      ++e;

      for(int var4 = 31; var4 > 0; --var4) {
         int var5 = 36 * var4;

         for(int var6 = 35; var6 > 0; --var6) {
            if(var3[var6 + var5] == 0 && 0 != var3[-1 + var6 + (var5 - 36)]) {
               var3[var6 + var5] = var0;
            }
         }
      }

   }

   static final Object[] a(boolean var0, byte var1, int var2, int var3, Object[] var4, int var5) {
      nk.a(var4, true);
      ++g;
      Object[] var6 = bca.F;
      Object[] var7 = tfa.d;
      if(var4 != null && 1 == var4.length) {
         lfa.a(71, (byte[])null, 6, 8, 53, 12357);
      }

      jta.a(21978, var4);
      dia.a(var4, -92);
      ((int[])((int[])var4[1]))[0] = var3;
      ((boolean[])((boolean[])var4[3]))[0] = var0;
      var4[9] = var7;
      ((int[])((int[])var4[1]))[1] = var2;
      ((int[])((int[])var4[1]))[2] = var5;
      var4[0] = var6;
      var4[10] = new byte[((int[])((int[])var4[1]))[1]][((int[])((int[])var4[1]))[0]][((int[])((int[])var4[1]))[2]];
      var4[5] = new byte[((int[])((int[])var4[1]))[1]][((int[])((int[])var4[1]))[0]][((int[])((int[])var4[1]))[2]];
      var4[6] = new byte[((int[])((int[])var4[1]))[1]][((int[])((int[])var4[1]))[0]][((int[])((int[])var4[1]))[2]];
      var4[11] = new byte[((int[])((int[])var4[1]))[1]][((int[])((int[])var4[1]))[0]][((int[])((int[])var4[1]))[2]];
      var4[8] = new byte[((int[])((int[])var4[1]))[1]][1 + ((int[])((int[])var4[1]))[0]][((int[])((int[])var4[1]))[2] + 1];
      var4[4] = new int[((int[])((int[])var4[1]))[1]][1 + ((int[])((int[])var4[1]))[0]][1 + ((int[])((int[])var4[1]))[2]];
      int var8 = 88 % ((var1 - 18) / 55);
      ((int[])((int[])var4[1]))[3] = 99;
      return var4;
   }

}
