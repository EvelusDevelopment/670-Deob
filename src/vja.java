import jaggl.OpenGL;

final class vja {

   static int c = 0;
   static int e;
   static Object[] f_i = aqa.a(new Object[2], 13);
   static int b;
   static ja f;
   static int g;
   static int d;
   static int h;
   static int a;
   static int j;


   static final boolean a(int var0, Object[] var1, boolean var2) {
      ++b;
      return var2?false:(-1 <= ~(var0 -= ((int[])((int[])var1[1]))[0]) | var1[4] == null?false:~(((int[])((int[])var1[1]))[3] + var0) < ~((int[])((int[])((Object[])((Object[])var1[4]))[5]))[((int[])((int[])var1[1]))[4]] | ((boolean[])((boolean[])((Object[])((Object[])var1[4]))[4]))[0]);
   }

   static final Object[] a(byte var0, Object[] var1, Object[] var2) {
      if(var0 != -41) {
         return (Object[])((Object[])var2[25]);
      } else {
         aa.a(15022, var2, var1);
         ++e;
         return var1;
      }
   }

   static final void a(byte var0, int var1, int var2, Object[] var3, int var4, int var5, Class_s var6, int var7, int var8, int var9, int var10) {
      ++h;
      if(var0 <= 59) {
         c = 70;
      }

      tg var11;
      Object[] var12 = (var11 = (tg)var6) != null?var11.f_l:null;
      Object[] var13 = (Object[])((Object[])var12[0]);
      sm.a(var3, 126);
      moa.a((byte)115, (Object[])((Object[])var12[0]), var3);
      kd.a(3042, var3, var4);
      el.a(8448, 30862, 7681, var3);
      af.a(768, var3, 30579, '\u8577', 0);
      float var14 = ((float[])((float[])var13[6]))[0] / (float)((int[])((int[])var13[1]))[6];
      float var15 = ((float[])((float[])var13[6]))[1] / (float)((int[])((int[])var13[1]))[5];
      float var16 = (float)(-var7) + (float)var9;
      float var17 = (float)var10 - (float)var2;
      float var18 = (float)(1.0D / Math.sqrt((double)(var16 * var16 + var17 * var17)));
      var16 *= var18;
      OpenGL.glColor4ub((byte)(var8 >> 16), (byte)(var8 >> 8), (byte)var8, (byte)(var8 >> 24));
      var17 *= var18;
      OpenGL.glBegin(1);
      OpenGL.glTexCoord2f((float)(-var5 + var7) * var14, var15 * (float)(-var1 + var2));
      OpenGL.glVertex2f((float)var7 + 0.35F, 0.35F + (float)var2);
      OpenGL.glTexCoord2f(var14 * (float)(-var5 + var9), (float)(var10 - var1) * var15);
      OpenGL.glVertex2f((float)var9 + var16 + 0.35F, (float)var10 + var17 + 0.35F);
      OpenGL.glEnd();
      if(var13 != null && var13.length == 4) {
         uc.b((Object[])null, -127);
      }

      af.a(768, var3, 30579, 5890, 0);
   }

   static final void a(Object[] var0, int var1, Object[] var2) {
      if(var1 != -13754) {
         a((byte)-91, (Object[])null, (Object[])null);
      }

      ++g;
      aka.a((Object[])((Object[])var0[17]), var2, -29358);
   }

   static final Object[] a(int var0, Object[] var1, ta var2) {
      ++a;
      if(var0 != 1976) {
         f = (ja)((Object[])((Object[])var1[10]))[2];
      }

      return (Object[])((Object[])var1[18]);
   }

   static final void a(int var0, float var1, boolean var2, float var3, float var4, int var5, float var6, Object[] var7, float var8, int var9) {
      if(var5 != 12243) {
         c = -106;
      }

      ++j;
      int var10 = gea.v;
      int var11 = qja.k;
      if(Class_n.a) {
         if(var2) {
            var10 <<= 1;
            var11 = -var10;
         }

         nr.a((float)var11, var1, var4, (float)var10, var7, (byte)-121, var3, var8, var6, (float)var9, (float)var0);
      } else {
         pq.a(var1, (float)var9, (float)var0, var3, var4, var6, (float)var10, (float)var11, false, var7);
      }

   }

   static final byte[] a(int var0, int var1, byte[] var2, int var3) {
      if(var0 < 8) {
         a((byte)-82, ((int[])((int[])((Object[])((Object[])f_i[2]))[3]))[0], 15, (Object[])null, 48, 75, (Class_s)null, ((int[])((int[])f_i[28]))[3], ((int[])((int[])f_i[20]))[3], ((int[])((int[])f_i[6]))[9], 41);
      }

      ++d;
      byte[] var4;
      if(0 < var3) {
         var4 = new byte[var1];

         for(int var5 = 0; var1 > var5; ++var5) {
            var4[var5] = var2[var3 + var5];
         }
      } else {
         var4 = var2;
      }

      Object[] var6 = new Object[8];
      qfa.a((int)10, var6);
      var6[3] = new long[8];
      ((int[])((int[])var6[1]))[0] = 0;
      var6[2] = new byte[64];
      var6[7] = new long[8];
      var6[4] = new byte[32];
      var6[0] = new long[8];
      ((int[])((int[])var6[1]))[1] = 0;
      var6[5] = new long[8];
      var6[6] = new long[8];
      Object[] var8 = var6;
      if(null != var6 && var6.length == 1) {
         a(68, 47, (byte[])null, -77);
      }

      int var9;
      for(var9 = 0; var9 < 32; ++var9) {
         ((byte[])((byte[])var8[4]))[var9] = 0;
      }

      ((int[])((int[])var8[1]))[1] = 0;
      ((int[])((int[])var8[1]))[0] = 0;
      ((byte[])((byte[])var8[2]))[0] = 0;

      for(var9 = 0; 8 > var9; ++var9) {
         ((long[])((long[])var8[0]))[var9] = 0L;
      }

      gu.a(var6, -92, var4, (long)(var1 * 8));
      byte[] var10 = new byte[64];
      jh.a(0, (byte)-59, var6, var10);
      return var10;
   }

}
