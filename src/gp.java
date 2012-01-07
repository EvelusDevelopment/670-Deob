import jaggl.OpenGL;

final class gp extends lm {

   static int p;
   private static char[] j = new char[64];
   static int m;
   static int f_l;
   static int o;
   static int n;
   Object[] q;
   static Object[] k;


   static final Object[] a(byte var0, Object[] var1) {
      int var2 = 35 / ((var0 + 76) / 50);
      ++o;
      Object[] var4 = new Object[2];
      Object[] var5 = (Object[])((Object[])var1[35]);
      tra.a(var4, (byte)21);
      var4[1] = mj.a(0, var4);
      lg.a(var4, var5, -18072);
      return var4;
   }

   static final void a(Object[] var0, int var1) {
      if(null == var0[1]) {
         var0[1] = new int[3];
      }

      if(null == var0[4]) {
         var0[4] = new boolean[1];
      }

      if(var1 <= -49) {
         ++p;
      }
   }

   static final long a(Object[] var0, int var1, int var2, int var3) {
      ++m;
      int var4 = 126 / ((var2 + 73) / 47);
      if(var0 != null && 8 == var0.length) {
         return rea.a(1, var1, var3, var0);
      } else if(null != var0 && var0.length == 9) {
         long var5 = rpa.a(var3, var1, var0, 84);
         return var5;
      } else {
         return rpa.a(var3, var1, var0, 101);
      }
   }

   gp(Object[] var1) {
      this.q = var1;
   }

   static final void a(Object[] var0, boolean var1, int var2) {
      ++f_l;
      Object[] var4 = (Object[])((Object[])var0[var2]);
      Object[] var3 = var4[57] != null?jna.a((byte)127, (Object[])((Object[])var4[57])):null;
      if(((boolean[])((boolean[])var0[5]))[1] && var3 != null) {
         float var6 = (1.0F - Math.abs(((float[])((float[])((Object[])((Object[])var0[0]))[5]))[1])) * 2.0F + 1.0F;
         nha.a((Object[])((Object[])var0[0]), 18806, 1);
         moa.a((byte)114, var3, (Object[])((Object[])var0[0]));
         nha.a((Object[])((Object[])var0[0]), var2 + 18806, 0);
         moa.a((byte)109, (Object[])((Object[])((Object[])((Object[])var0[3]))[2]), (Object[])((Object[])var0[0]));
         int var7 = ((int[])((int[])((Object[])((Object[])var0[1]))[1]))[0];
         OpenGL.glUseProgram(var7);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var7, "normalSampler"), 0);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var7, "envMapSampler"), 1);
         OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var7, "sunDir"), -((float[])((float[])((Object[])((Object[])var0[0]))[5]))[0], -((float[])((float[])((Object[])((Object[])var0[0]))[5]))[1], -((float[])((float[])((Object[])((Object[])var0[0]))[5]))[2]);
         OpenGL.glUniform4f(OpenGL.glGetUniformLocation(var7, "sunColour"), var6 * ((float[])((float[])((Object[])((Object[])var0[0]))[25]))[7], var6 * ((float[])((float[])((Object[])((Object[])var0[0]))[25]))[17], var6 * ((float[])((float[])((Object[])((Object[])var0[0]))[25]))[15], 1.0F);
         if(var3 != null && 13 == var3.length && var3[4].equals(Boolean.valueOf(false))) {
            return;
         }

         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var7, "sunExponent"), 64.0F + Math.abs(((float[])((float[])((Object[])((Object[])var0[0]))[5]))[1]) * 928.0F);
         ((boolean[])((boolean[])var0[5]))[0] = true;
      }

   }

   static final int[] a(Object[] var0, byte var1, int var2) {
      ++n;
      if(var1 < 98) {
         return (int[])null;
      } else {
         int[] var3 = od.a(-1704, var2, (Object[])((Object[])var0[5]));
         if(((boolean[])((boolean[])((Object[])((Object[])var0[5]))[4]))[0]) {
            for(int var4 = 0; var4 < fo.b; ++var4) {
               int var5 = ((int[])((int[])var0[1]))[2] + (wra.d[var4] << 12) / ((int[])((int[])var0[1]))[4];
               int var6 = ((int[])((int[])var0[1]))[1] + (bv.b[var2] << 12) / ((int[])((int[])var0[1]))[4];
               int var7 = var5;
               if(var0 != null && 28 == var0.length && var0[6].equals(Boolean.valueOf(false)) && var0[6].equals(Integer.valueOf(0))) {
                  loa.a((Object[])null, (byte)5);
               }

               int var8 = var6;
               int var9 = var5;
               int var10 = var6;
               int var11 = var5 * var5 >> 12;
               int var12 = var6 * var6 >> 12;

               int var13;
               for(var13 = 0; -16385 < ~(var11 + var12) && ~var13 > ~((int[])((int[])var0[1]))[3]; var12 = var10 * var10 >> 12) {
                  var10 = 2 * (var9 * var10 >> 12) + var8;
                  var9 = var11 + -var12 + var7;
                  ++var13;
                  var11 = var9 * var9 >> 12;
               }

               var3[var4] = -1 + ((int[])((int[])var0[1]))[3] <= var13?0:(var13 << 12) / ((int[])((int[])var0[1]))[3];
            }

            if(null != var0 && -3 == ~var0.length) {
               a((Object[])null, (byte)115, -106);
            }
         }

         return var3;
      }
   }

   static {
      int var0;
      for(var0 = 0; var0 < 26; ++var0) {
         j[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         j[var0] = (char)(97 + var0 - 26);
      }

      for(var0 = 52; 62 > var0; ++var0) {
         j[var0] = (char)(-4 + var0);
      }

      j[63] = 45;
      j[62] = 42;
      k = ho.a(3, 44, new Object[1], true);
   }
}
