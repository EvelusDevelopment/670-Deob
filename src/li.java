import jagdx.IDirect3DDevice;
import jaggl.OpenGL;

final class li extends tha {

   static int z;
   static int A;
   static int y;
   static int x;
   static int w;
   static Object[] u = ho.a(7, 81, new Object[1], true);
   Object[] B;
   static int v;
   static int t;


   static final Object[] a(int var0, byte var1, int var2, int var3, int var4, int var5, int[][] var6, Object[] var7, Object[] var8, int[][] var9) {
      ++z;
      if(null == var7[23]) {
         var7[23] = new float[2];
      }

      if(var7[1] == null) {
         var7[1] = new int[8];
      }

      ((float[])((float[])var7[23]))[1] = Float.MAX_VALUE;
      ((float[])((float[])var7[23]))[0] = -3.4028235E38F;
      var7[8] = ura.a(-99, new Object[2]);
      var7[2] = mf.a(var5, var9, var7, var4, (byte)-46, var2);
      ((int[])((int[])var7[1]))[0] = -2 + ((aa)var7[2]).a;
      var7[12] = var8;
      var7[6] = new float[1 + ((aa)var7[2]).f_i][1 + ((aa)var7[2]).h];
      var7[5] = new int[var2][var5][];
      var7[17] = new byte[var2 + 1][var5 + 1];
      var7[4] = new short[var5 * var2][];
      var7[13] = new Object[var2][var5][][];
      var7[10] = new int[var2][var5][];
      var7[7] = new byte[var2][var5];
      var7[21] = new int[var2][var5][];
      if(var1 < 121) {
         a((byte)-31, (Object[])null, -0.4539884F, (Object[])null, -0.4644334F);
      }

      var7[0] = new int[var2][var5][];
      var7[20] = new int[var2][var5][];
      ((int[])((int[])var7[1]))[6] = var0;
      ((int[])((int[])var7[1]))[2] = var3;
      var7[19] = new float[((aa)var7[2]).f_i + 1][((aa)var7[2]).h + 1];
      ((int[])((int[])var7[1]))[4] = 1 << ((int[])((int[])var7[1]))[0];
      var7[15] = new float[1 + ((aa)var7[2]).f_i][((aa)var7[2]).h + 1];

      for(int var10 = 0; ~var10 >= ~((aa)var7[2]).h; ++var10) {
         if(var7 != null && var7.length == 5) {
            lta.a(-45, -16, 17, (Object[])null, new Object[11][]);
         }

         for(int var11 = 0; ((aa)var7[2]).f_i >= var11; ++var11) {
            int var12 = ((aa)var7[2]).f[var11][var10];
            if((float)var12 > ((float[])((float[])var7[23]))[0]) {
               ((float[])((float[])var7[23]))[0] = (float)var12;
            }

            if(((float[])((float[])var7[23]))[1] > (float)var12) {
               ((float[])((float[])var7[23]))[1] = (float)var12;
            }

            if(0 < var11 && var10 > 0 && ~var11 > ~((aa)var7[2]).f_i && ((aa)var7[2]).h > var10) {
               int var13 = var6[1 + var11][var10] - var6[var11 - 1][var10];
               int var14 = -var6[var11][-1 + var10] + var6[var11][1 + var10];
               float var15 = (float)(1.0D / Math.sqrt((double)(var4 * 4 * var4 + var13 * var13 + var14 * var14)));
               ((float[][])((float[][])var7[15]))[var11][var10] = var15 * (float)var13;
               ((float[][])((float[][])var7[6]))[var11][var10] = var15 * (float)(2 * -var4);
               ((float[][])((float[][])var7[19]))[var11][var10] = (float)var14 * var15;
            }
         }
      }

      --((float[])((float[])var7[23]))[1];
      ++((float[])((float[])var7[23]))[0];
      var7[22] = nb.a((byte)118, 128, new Object[5]);
      if(0 != (((int[])((int[])var7[1]))[6] & 16)) {
         var7[16] = gpa.a(var7, -10942, new Object[5], (Object[])((Object[])var7[12]));
      }

      if(var7 != null && var7.length == 2) {
         ur.f = -19;
      }

      return var7;
   }

   li(Object[] var1) {
      this.B = var1;
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, byte var6, int var7) {
      if(var3 >= hla.g && td.r >= var4 && sea.k <= var0 && var1 <= sda.c) {
         wra.a(var1, 0, var3, var4, var5, var7, var0, var2);
      } else {
         it.a(var4, true, var1, var5, var7, var3, var0, var2);
      }

      int var8 = -79 / ((var6 + 58) / 50);
      ++w;
   }

   static final void a(Object[] var0, byte var1, Object[] var2) {
      if(var1 != -82) {
         u = (Object[])null;
      }

      dba.a(((int[])((int[])var2[5]))[3], 1, ((int[])((int[])var2[5]))[2], var0, ((int[])((int[])var2[5]))[1], ((int[])((int[])var2[5]))[0]);
      ++v;
   }

   static final rda a(boolean var0, Object[] var1) {
      ++x;
      return !var0?(rda)u[19]:new rda(var1);
   }

   static final void a(int var0, int var1, int var2, Object[] var3, int var4, Object[] var5, int var6) {
      ++t;
      if(var1 == 31961) {
         if(var5[82] != null) {
            bma.b(0, (Object[])((Object[])var5[82]));
         }

         IDirect3DDevice.DrawIndexedPrimitive(((long[])((long[])var5[50]))[5], Class_k.a(true, var3), 0, var2, var0, var6, var4);
      }
   }

   static final void a(byte var0, Object[] var1, float var2, Object[] var3, float var4) {
      ++A;
      Object[] var5 = ((Object[][])((Object[][])var1[3]))[((int[])((int[])var1[1]))[2]];
      if(var5 != null && 16 == var5.length) {
         int var6 = tea.a(false, var3);
         if(-1 != var6 && (((float[])((float[])var5[14]))[var6] != var2 || var4 != ((float[])((float[])var5[8]))[var6])) {
            ((float[])((float[])var5[14]))[var6] = var2;
            ((float[])((float[])var5[8]))[var6] = var4;
            if(eva.b(102, var3) != us.a) {
               throw new bba(var3, "");
            }

            OpenGL.glUniform2f(var6, var2, var4);
         }
      } else {
         if(null == var5 || var5.length != 12) {
            throw new IllegalStateException();
         }

         iea.a(var3, var2, 1, var4, var5);
      }

      if(var0 != -56) {
         a((byte)15, (Object[])null, 1.4330369F, (Object[])null, -0.1362592F);
      }

   }

}
