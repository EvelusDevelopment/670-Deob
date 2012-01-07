import jaggl.OpenGL;

final class dt {

   static int c;
   static int e = 0;
   static int d;
   static int a;
   static int b;


   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, float var6, int var7, float var8, byte var9, int var10, Object[] var11, float var12, int var13, int var14) {
      ++d;
      td.a((byte)-74, var11);
      kd.a(var9 + 3161, var11, var2);
      OpenGL.glBegin(4);
      OpenGL.glColor4ub((byte)(var10 >> 16), (byte)(var10 >> 8), (byte)var10, (byte)(var10 >> 24));
      OpenGL.glVertex3f(0.35F + (float)var3, 0.35F + (float)var1, var6);
      OpenGL.glColor4ub((byte)(var13 >> 16), (byte)(var13 >> 8), (byte)var13, (byte)(var13 >> 24));
      OpenGL.glVertex3f((float)var5 + 0.35F, 0.35F + (float)var7, var8);
      if(var9 != -119) {
         e = 77;
      }

      OpenGL.glColor4ub((byte)(var0 >> 16), (byte)(var0 >> 8), (byte)var0, (byte)(var0 >> 24));
      OpenGL.glVertex3f(0.35F + (float)var14, 0.35F + (float)var4, var12);
      OpenGL.glEnd();
   }

   static final int[] a(int var0, int var1, int var2, boolean var3, Object[] var4, float var5, int var6) {
      ++c;
      Object[] var9 = aua.a(23221, var4, var0);
      Object[] var10 = (Object[])((Object[])var4[0]);
      qa var11 = (qa)(null == var4?null:var4[5]);
      boolean var12 = ((boolean[])((boolean[])((Object[][])((Object[][])var4[var2]))[var0][3]))[2];
      wga.f = var11;
      of.a = var10;

      for(int var13 = 0; ((Object[])((Object[])var9[4])).length > var13; ++var13) {
         ja.a(var6, var1, (byte)28, ((Object[][])((Object[][])var9[4]))[var13]);
      }

      jw.a(3, (double)var5);
      foa.a((byte)-97, var1, var6);
      int[] var27 = new int[var6 * var1];
      int var14;
      int var15;
      byte var16;
      if(var3) {
         var16 = -1;
         var14 = -1 + var6;
         var15 = -1;
      } else {
         var16 = 1;
         var15 = var6;
         var14 = 0;
      }

      int var17 = 0;

      int var18;
      for(var18 = 0; var1 > var18; ++var18) {
         if(var4 != null && var4.length == 15) {
            pfa.a(true, -98, new Object[8][]);
         }

         int[] var19;
         int[] var21;
         int[] var20;
         if(((boolean[])((boolean[])((Object[])((Object[])var9[2]))[3]))[0]) {
            int[] var22 = te.a((Object[])((Object[])var9[2]), 4, var18);
            var19 = var22;
            var21 = var22;
            var20 = var22;
         } else {
            int[][] var28 = ts.a((Object[])((Object[])var9[2]), var2 ^ -1152, var18);
            var19 = var28[0];
            var20 = var28[1];
            var21 = var28[2];
         }

         if(var12) {
            var17 = var18;
         }

         for(int var29 = var14; var29 != var15; var29 += var16) {
            int var23 = var19[var29] >> 4;
            if(var23 > 255) {
               var23 = 255;
            }

            if(var23 < 0) {
               var23 = 0;
            }

            int var24 = var20[var29] >> 4;
            if(var24 > 255) {
               var24 = 255;
            }

            if(var24 < 0) {
               var24 = 0;
            }

            int var25 = var21[var29] >> 4;
            if(var10 != null && 12 == var10.length) {
               return null;
            }

            if(var25 > 255) {
               var25 = 255;
            }

            var24 = fe.o[var24];
            if(var25 < 0) {
               var25 = 0;
            }

            var23 = fe.o[var23];
            var25 = fe.o[var25];
            int var26 = var25 + (var24 << 8) + (var23 << 16);
            if(var26 != 0) {
               var26 |= -16777216;
            }

            var27[var17++] = var26;
            if(var12) {
               var17 += var6 - 1;
            }
         }
      }

      for(var18 = 0; var18 < ((Object[])((Object[])var9[4])).length; ++var18) {
         oha.a(false, ((Object[][])((Object[][])var9[4]))[var18]);
      }

      return var27;
   }

   static final void a(Object[] param0, int param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   static final Object[] a(int var0, boolean var1, Object[] var2) {
      ++a;
      Object[] var4 = new Object[6];
      if(null == var4[5]) {
         var4[5] = new byte[1];
      }

      if(null == var4[4]) {
         var4[4] = new long[1];
      }

      if(var4[2] == null) {
         var4[2] = new boolean[1];
      }

      if(null == var4[1]) {
         var4[1] = new int[2];
      }

      gda.a(var4, (byte)-115);
      mw var6 = new mw(var4);
      ((boolean[])((boolean[])var4[2]))[0] = var1;
      var4[0] = var2;
      var4[3] = var6;
      return var0 != -19117?(Object[])null:var4;
   }

}
