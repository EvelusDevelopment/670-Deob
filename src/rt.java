import jaggl.OpenGL;

final class rt {

   static Object[] c = sl.a("7", 0, new Object[1], "7");
   static int a;
   static int h;
   static int e;
   static int d;
   static String f = "";
   static Object[][] g = (Object[][])null;
   static int b;


   static final void a(int[] var0, int[] var1, int var2, int var3, int var4) {
      ++d;
      if(var4 != 12042) {
         a(37, -59, 22);
      }

      if(var2 < var3) {
         int var5 = (var2 + var3) / 2;
         int var6 = var2;
         int var7 = var0[var5];
         var0[var5] = var0[var3];
         var0[var3] = var7;
         int var8 = var1[var5];
         var1[var5] = var1[var3];
         var1[var3] = var8;
         int var9 = var7 != Integer.MAX_VALUE?1:0;

         for(int var10 = var2; var10 < var3; ++var10) {
            if(var0[var10] < var7 + (var10 & var9)) {
               int var11 = var0[var10];
               var0[var10] = var0[var6];
               var0[var6] = var11;
               int var12 = var1[var10];
               var1[var10] = var1[var6];
               var1[var6++] = var12;
            }
         }

         var0[var3] = var0[var6];
         var0[var6] = var7;
         var1[var3] = var1[var6];
         var1[var6] = var8;
         a(var0, var1, var2, -1 + var6, 12042);
         a(var0, var1, 1 + var6, var3, var4 + 0);
      }

   }

   static final void a(int var0, int var1, int var2, int var3, Object[] var4, boolean var5, int var6, int var7, boolean var8, int var9) {
      ++h;
      if(var1 != '\u8ca8') {
         ((int[])((int[])((Object[])((Object[])c[15]))[26]))[8] = -39;
      }

      if(var5 | var8) {
         int var11 = ((int[])((int[])var4[1]))[1];
         Object[] var10;
         int var12 = ((ta)(null != (var10 = (Object[])((Object[])var4[2]))?var10[55]:null)).e(30626).d();
         int var13 = 0;
         if(var5) {
            var13 |= 256;
         }

         OpenGL.glBindFramebufferEXT('\u8ca8', ((int[])((int[])var4[1]))[4]);
         if(var8) {
            var13 |= 16384;
         }

         OpenGL.glBlitFramebufferEXT(var9, -var0 + var11 - var3, var2 + var9, -var0 + var11, var6, var12 + -var7 - var3, var6 + var2, -var7 + var12, var13, 9728);
         OpenGL.glBindFramebufferEXT('\u8ca8', 0);
      }

   }

   static final void a(int var0, int var1, Object[] var2, int var3, int var4, int var5, int var6, int var7) {
      ++a;
      float var8 = 0.35F + (float)var4;
      float var9 = 0.35F + (float)var3;
      float var10 = (float)var6 + var8;
      td.a((byte)-71, var2);
      float var11 = (float)var7 + var9;
      kd.a(var5 + 17815, var2, var1);
      OpenGL.glColor4ub((byte)(var0 >> 16), (byte)(var0 >> 8), (byte)var0, (byte)(var0 >> 24));
      if(((boolean[])((boolean[])var2[17]))[13]) {
         OpenGL.glDisable('\u809d');
      }

      OpenGL.glBegin(7);
      if(var2 != null && 17 == var2.length) {
         dma.f = null;
      }

      OpenGL.glVertex2f(var8, var9);
      OpenGL.glVertex2f(var8, var11);
      OpenGL.glVertex2f(var10, var11);
      if(var5 != -14773) {
         a((int[])null, (int[])null, 49, 125, ((int[])((int[])((Object[])((Object[])((Object[])((Object[])c[7]))[11]))[4]))[10]);
      }

      OpenGL.glVertex2f(var10, var9);
      OpenGL.glEnd();
      if(((boolean[])((boolean[])var2[17]))[13]) {
         OpenGL.glEnable('\u809d');
      }

   }

   static final void a(int var0, int var1, int var2) {
      ++e;
      Object[] var3 = la.a(var0 - 5, (long)var2, var0);
      jqa.a((byte)89, var3);
      ((int[])((int[])var3[0]))[1] = var1;
   }

   static final float[] a(Object[] var0, float[] var1, byte var2) {
      ++b;
      float var3 = -((float[])((float[])var0[0]))[2] + ((float[])((float[])var0[0]))[3];
      float var4 = ((float[])((float[])var0[0]))[7] - ((float[])((float[])var0[0]))[6];
      if(var2 != 90) {
         return (float[])((float[])c[0]);
      } else {
         float var5 = ((float[])((float[])var0[0]))[11] - ((float[])((float[])var0[0]))[10];
         double var6 = Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
         var1[2] = (float)((double)var5 / var6);
         var1[3] = (float)((double)(-((float[])((float[])var0[0]))[14] + ((float[])((float[])var0[0]))[15]) / var6);
         var1[0] = (float)((double)var3 / var6);
         var1[1] = (float)((double)var4 / var6);
         return var1;
      }
   }

}
