import jaggl.OpenGL;

final class uf {

   static int b;
   static int d;
   static int g;
   static int e;
   static int h;
   static int a;
   static int c;
   static qa f;


   static final void b(int var0, Object[] var1) {
      nfa.a(((int[])((int[])var1[0]))[0], ((int[])((int[])var1[0]))[3], true, ((int[])((int[])var1[var0]))[5], ((int[])((int[])var1[0]))[2], tv.b[((int[])((int[])var1[0]))[3]], -1, ((int[])((int[])var1[0]))[4]);
      ++e;
   }

   static final void a(byte var0, int var1, Object[] var2, int var3, boolean var4) {
      lna.g.b(var3 - 2, var1, 4 + ((int[])((int[])((Object[])((Object[])var2[2]))[1]))[1], 2 + ((int[])((int[])((Object[])((Object[])var2[2]))[1]))[0], ((int[])((int[])((Object[])((Object[])var2[2]))[1]))[8], 0);
      ++h;
      lna.g.b(var3 - 1, var1 + 1, ((int[])((int[])((Object[])((Object[])var2[2]))[1]))[1] + 2, ((int[])((int[])((Object[])((Object[])var2[2]))[1]))[0], 0, 0);
      if(var0 != -12) {
         b(-54, (Object[])((Object[])var2[3]));
      }

   }

   static final Object[] a(boolean var0, Object[] var1) {
      if(!var0) {
         a((byte)-23, ((int[])((int[])var1[2]))[2], (Object[])((Object[])var1[1]), ((int[])((int[])((Object[])((Object[])var1[10]))[7]))[8], true);
      }

      ++a;
      if(var1[2] == null) {
         Object[] var2;
         qa var3 = ((ta)(null == (var2 = (Object[])((Object[])var1[0]))?null:var2[38])).k;
         si.d[1] = ((int[])((int[])var1[1]))[5];
         si.d[3] = ((int[])((int[])var1[1]))[1];
         si.d[0] = ((int[])((int[])var1[1]))[4];
         si.d[4] = ((int[])((int[])var1[1]))[2];
         si.d[5] = ((int[])((int[])var1[1]))[3];
         si.d[2] = ((int[])((int[])var1[1]))[0];
         boolean var4 = false;
         int var5 = 0;

         int var6;
         for(var6 = 0; var6 < 6; ++var6) {
            if(!var3.a(-20460, si.d[var6])) {
               return null;
            }

            Object[] var7 = var3.a(si.d[var6], (byte)49);
            int var8 = ((boolean[])((boolean[])var7[3]))[4]?64:128;
            if(((byte[])((byte[])var7[0]))[2] > 0) {
               var4 = true;
            }

            if(var8 > var5) {
               var5 = var8;
            }
         }

         if(null != var1 && -2 == ~var1.length && var1[0].equals(Integer.valueOf(1))) {
            return null;
         }

         for(var6 = 0; var6 < 6; ++var6) {
            lma.a[var6] = var3.a(var5, 1.0F, false, -6300, var5, si.d[var6]);
         }

         var1[2] = fea.a(var5, (Object[])((Object[])var1[0]), var4, lma.a, 91);
      }

      return (Object[])((Object[])var1[2]);
   }

   static final Object[] a(Object[] var0, boolean var1) {
      ei.a(-12397, var0);
      if(!var1) {
         a((Object[])null, (byte)-71);
      }

      ++c;
      return var0;
   }

   static final tda a(int var0, Object[] var1) {
      ++g;
      if(var0 != 25708) {
         b(33, (Object[])null);
      }

      return new tda(var1);
   }

   static final Object[] a(Object[] var0, byte var1) {
      ++d;
      if(null == var0) {
         if(var1 != -72) {
            ((int[])((int[])var0[1]))[2] = -17;
         }

         return ppa.a(var0, var1 ^ 76);
      } else {
         return qg.a(var0, -11771);
      }
   }

   static final void a(int var0, int var1, Object[] var2, int var3) {
      int var4 = 66 / ((var3 + 64) / 49);
      ++b;
      if(((boolean[])((boolean[])var2[5]))[0]) {
         int var5 = 1 << (3 & var1);
         float var6 = (float)(1 << ((60 & var1) >> 3)) / 32.0F;
         int var7 = '\uffff' & var0;
         float var8 = (float)((210041 & var0) >> 16) / 8.0F;
         float var9 = (float)(var0 >> 19 & 15) / 16.0F;
         float var10 = (float)(15 & var0 >> 23) / 16.0F;
         int var11 = var0 >> 27 & 15;
         if(null != var2 && 8 == var2.length) {
            return;
         }

         int var12 = ((int[])((int[])((Object[])((Object[])var2[1]))[1]))[0];
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var12, "time"), (float)(((int[])((int[])((Object[])((Object[])var2[0]))[1]))[33] * var5 % '\u9c40') / 40000.0F);
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var12, "scale"), var6);
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var12, "breakWaterDepth"), (float)var7);
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var12, "breakWaterOffset"), var8);
         OpenGL.glUniform2f(OpenGL.glGetUniformLocation(var12, "waveIntensity"), var10, var9);
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var12, "waveExponent"), (float)var11);
      }

   }

}
