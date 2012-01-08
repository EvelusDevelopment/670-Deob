import jaggl.OpenGL;

final class eda {

   static float[] h = new float[16384];
   static int a;
   static float[] g = new float[16384];
   static int e;
   static Object[] c;
   static int f;
   static int b;
   static Object[] d;


   static final void putShort(Object[] var1, int value) {
      byte[] var10000 = (byte[])((byte[])var1[2]);
      int[] var10001 = (int[])((int[])var1[1]);
      int var10004 = ((int[])((int[])var1[1]))[0];
      var10001[0] = ((int[])((int[])var1[1]))[0] + 1;
      var10000[var10004] = (byte)(value >> 8);
      ++a;
      var10000 = (byte[])((byte[])var1[2]);
      var10001 = (int[])((int[])var1[1]);
      var10004 = ((int[])((int[])var1[1]))[0];
      var10001[0] = ((int[])((int[])var1[1]))[0] + 1;
      var10000[var10004] = (byte)value;
   }

   static final void a(byte var0, byte[] var1) {
      if(var0 != 53) {
         ((long[])((long[])((Object[])((Object[])((Object[])((Object[])d[1]))[6]))[0]))[3] = 16L;
      }

      ++e;
      Object[] var2 = jta.a((byte)-123, var1, new Object[3]);

      while(true) {
         int var3 = fh.a(var2, false);
         if(0 == var3) {
            if(var2 != null && (var2.length == 1 || -2 == ~var2.length || var2.length == 17)) {
               ((long[])((long[])wga.g[0]))[1] = ((long[])((long[])aqa.d[4]))[2];
            }

            return;
         }

         if(var3 == 1) {
            int var4 = de.a((int)0, var2);
            if(-1 == nu.b) {
               nu.b = var4;
            }
         }
      }
   }

   static final Object[] a(Object[] var0, boolean var1, int[][] var2, int var3, byte var4, Object[] var5) {
      ++f;
      if(var4 >= -126) {
         c = (Object[])null;
      }

      bca.a((byte)127, vk.f, ah.f, 6 * var3 * var3, var0, var5, '\u8513', var1);
      ah.a((Object[])((Object[])var0[5]), var0, (byte)126);
      int var6;
      if(var1) {
         if(var5 != null && (var5.length == 1 || -3 == ~var5.length && var5[1].equals(Integer.valueOf(1)) && var5[1].equals(Integer.valueOf(2)))) {
            return null;
         }

         for(var6 = 0; var6 < 6; ++var6) {
            jq.a(var0, var6 + '\u8515', 0, var2[var6], var3, var3);
         }
      } else {
         if(null != var5 && var5.length == 1) {
            sua.a((Object[])null, (byte)-17);
         }

         for(var6 = 0; 6 > var6; ++var6) {
            OpenGL.glTexImage2Di('\u8515' + var6, 0, vb.a(-126, (Object[])((Object[])var0[3]), (Object[])((Object[])var0[6])), var3, var3, 0, fv.a((Object[])((Object[])var0[6]), (int)0), ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[40], var2[var6], 0);
         }
      }

      return var0;
   }

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; 16384 > var2; ++var2) {
         h[var2] = (float)Math.sin((double)var2 * var0);
         g[var2] = (float)Math.cos((double)var2 * var0);
      }

      c = sd.a(new Object[1], 121, (byte)119);
      b = -1;
      d = sd.a(new Object[1], 113, (byte)118);
   }
}
