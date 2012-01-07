import jaggl.OpenGL;

final class qp {

   static String b = null;
   static int f;
   static int d;
   static boolean c = false;
   static int a;
   static int e;


   static final void a(int var0, Object[] var1) {
      ++e;
      float var2 = ((float[])((float[])var1[0]))[0];
      float var3 = ((float[])((float[])var1[0]))[var0];
      float var4 = ((float[])((float[])var1[0]))[8];
      float var5 = ((float[])((float[])var1[0]))[12];
      float var6 = ((float[])((float[])var1[0]))[1];
      float var7 = ((float[])((float[])var1[0]))[5];
      float var8 = ((float[])((float[])var1[0]))[9];
      float var9 = ((float[])((float[])var1[0]))[13];
      float var10 = ((float[])((float[])var1[0]))[2];
      float var11 = ((float[])((float[])var1[0]))[6];
      float var12 = ((float[])((float[])var1[0]))[10];
      float var13 = ((float[])((float[])var1[0]))[14];
      float var14 = ((float[])((float[])var1[0]))[3];
      float var15 = ((float[])((float[])var1[0]))[7];
      float var16 = ((float[])((float[])var1[0]))[11];
      ((float[])((float[])var1[0]))[0] = var2;
      float var17 = ((float[])((float[])var1[0]))[15];
      ((float[])((float[])var1[0]))[2] = var4;
      ((float[])((float[])var1[0]))[3] = var5;
      ((float[])((float[])var1[0]))[1] = var3;
      if(var1 == null || var1.length != 3 && var1.length != 4) {
         ((float[])((float[])var1[0]))[4] = var6;
         ((float[])((float[])var1[0]))[12] = var14;
         ((float[])((float[])var1[0]))[13] = var15;
         ((float[])((float[])var1[0]))[9] = var11;
         ((float[])((float[])var1[0]))[11] = var13;
         ((float[])((float[])var1[0]))[15] = var17;
         ((float[])((float[])var1[0]))[14] = var16;
         ((float[])((float[])var1[0]))[10] = var12;
         ((float[])((float[])var1[0]))[6] = var8;
         ((float[])((float[])var1[0]))[5] = var7;
         ((float[])((float[])var1[0]))[8] = var10;
         ((float[])((float[])var1[0]))[7] = var9;
      }
   }

   static final void a(Object[] var0, byte var1) {
      if(var1 > -27) {
         a(((int[])((int[])var0[5]))[18], (byte)60, (Object[])null, (Object[])((Object[])var0[9]));
      }

      ++f;
      if(null == var0 || var0.length != 3 || !var0[0].equals(Boolean.valueOf(false)) || !var0[0].equals(Integer.valueOf(0))) {
         while(true) {
            nj var2 = ((nj)var0[0]).f;
            if(var0[0] == var2) {
               var0[1] = null;
               return;
            }

            var2.a(1);
         }
      }
   }

   static final void a(byte var0, Object[] var1) {
      jia.a(var1, 0, -2);
      if(var0 < 79) {
         a(50, (byte)57, (Object[])null, (Object[])((Object[])var1[9]));
      }

      ++d;

      for(int var2 = ((int[])((int[])var1[1]))[22] - 1; var2 >= 0; --var2) {
         nha.a(var1, 18806, var2);
         moa.a((byte)118, (Object[])null, var1);
         OpenGL.glTexEnvi(8960, 8704, '\u8570');
      }

      el.a(8448, 30862, 8448, var1);
      af.a(770, var1, 30579, '\u8578', 2);
      wua.a(27349, var1);
      ((int[])((int[])var1[1]))[32] = 1;
      OpenGL.glEnable(3042);
      OpenGL.glBlendFunc(770, 771);
      ((int[])((int[])var1[1]))[3] = 1;
      OpenGL.glEnable(3008);
      OpenGL.glAlphaFunc(516, 0.0F);
      ((boolean[])((boolean[])var1[17]))[7] = true;
      OpenGL.glColorMask(true, true, true, true);
      ((boolean[])((boolean[])var1[17]))[20] = true;
      cka.a(20, var1, true);
      pda.a(var1, -21342, true);
      wma.a(-1000, var1, true);
      jma.a(127, true, var1);
      ((float[])((float[])var1[25]))[6] = 1.0F;
      ((float[])((float[])var1[25]))[11] = 0.0F;
      kja.a(var1, 116);
      kr.a(var1, (int)91);
      ((OpenGL)var1[27]).setSwapInterval(0);
      OpenGL.glShadeModel(7425);
      if(null != var1 && (2 == var1.length && var1[0].equals(Boolean.valueOf(false)) || var1.length == 6)) {
         esa.a = 26;
      }

      OpenGL.glClearDepth(1.0F);
      OpenGL.glDepthFunc(515);
      OpenGL.glPolygonMode(1028, 6914);
      OpenGL.glEnable(2884);
      OpenGL.glCullFace(1029);
      OpenGL.glMatrixMode(5888);
      OpenGL.glLoadIdentity();
      OpenGL.glColorMaterial(1028, 5634);
      OpenGL.glEnable(2903);
      float[] var5 = new float[]{0.0F, 0.0F, 0.0F, 1.0F};

      for(int var3 = 0; var3 < 8; ++var3) {
         int var4 = var3 + 16384;
         OpenGL.glLightfv(var4, 4608, var5, 0);
         OpenGL.glLightf(var4, 4615, 0.0F);
         OpenGL.glLightf(var4, 4616, 0.0F);
      }

      OpenGL.glEnable(16384);
      OpenGL.glEnable(16385);
      OpenGL.glFogf(2914, 0.95F);
      OpenGL.glFogi(2917, 9729);
      OpenGL.glHint(3156, 4353);
      ((int[])((int[])var1[1]))[29] = -1;
      ((int[])((int[])var1[1]))[34] = -1;
      sea.a(-21614, var1);
      dh.a(var1, (int)100);
   }

   static final void a(int var0, byte var1, Object[] var2, Object[] var3) {
      ++a;
      if(1 != var0) {
         if(3 == var0) {
            ((int[])((int[])var2[1]))[1] = de.a((int)0, var3);
            ((int[])((int[])var2[1]))[0] = fh.a(var3, false);
            ((int[])((int[])var2[1]))[2] = fh.a(var3, false);
         }
      } else {
         ((char[])((char[])var2[0]))[0] = kf.a(true, ipa.a(var3, (int)-121));
      }

      if(var1 > -101) {
         c = true;
      }

   }

}
