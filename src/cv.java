import jagdx.D3DCAPS;
import jagdx.D3DLIGHT;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.IDirect3DDevice;
import jaggl.OpenGL;

final class cv {

   static int b;
   static int f_i;
   static int h;
   static Object[] a = sd.a(new Object[1], 41, (byte)122);
   static int g;
   static int d = 0;
   static int f;
   static int e;
   static int j;
   static int c;


   static final void a(boolean var0, Object[] var1) {
      ++b;
      if(var0) {
         a((Object[])null, new Object[7], ((float[])((float[])a[11]))[9], (Object[])null, ((byte[])((byte[])a[10]))[4]);
      }

      if(((boolean[])((boolean[])var1[3]))[0]) {
         nl.a((Object[])((Object[])var1[5]), (byte)-113);
         var1[5] = null;
      } else {
         nr.a((Object[])((Object[])var1[4]), 3);
         var1[4] = null;
      }

   }

   static final Object[] a(int var0, long var1, qa var3, D3DCAPS var4, Object[] var5, byte var6, int var7, D3DPRESENT_PARAMETERS var8, int var9, Object[] var10, long var11) {
      try {
         if(null == var5[63]) {
            var5[63] = new boolean[25];
         }

         if(null == var5[1]) {
            var5[1] = new int[44];
         }

         if(null == var5[50]) {
            var5[50] = new long[7];
         }

         ++h;
         ssa.a(var10, 0, var3, var7, var5, true);
         wsa.a(var5, -7);

         try {
            var5[77] = var4;
            ((long[])((long[])var5[50]))[6] = var1;
            if(var6 < 53) {
               return (Object[])null;
            }

            ((int[])((int[])var5[1]))[41] = var9;
            var5[83] = var8;
            ((int[])((int[])var5[1]))[39] = var0;
            ((long[])((long[])var5[50]))[5] = var11;
            ((long[])((long[])var5[50]))[3] = D3DLIGHT.Create();
            ((long[])((long[])var5[50]))[2] = D3DLIGHT.Create();
            if(var5 != null && var5.length == 1 && var5[0].equals(Integer.valueOf(2)) && var5[0].equals(Boolean.valueOf(false))) {
               return null;
            }

            ((long[])((long[])var5[50]))[4] = D3DLIGHT.Create();
            ((int[])((int[])var5[1]))[12] = ((D3DCAPS)var5[77]).MaxActiveLights <= 0?8:((D3DCAPS)var5[77]).MaxActiveLights;
            ((boolean[])((boolean[])var5[63]))[22] = (65536 & ((D3DCAPS)var5[77]).TextureCaps) != 0;
            ((boolean[])((boolean[])var5[63]))[19] = true;
            ((int[])((int[])var5[1]))[8] = ((D3DCAPS)var5[77]).MaxSimultaneousTextures;
            ((boolean[])((boolean[])var5[63]))[23] = (16384 & ((D3DCAPS)var5[77]).TextureCaps) != 0;
            ((boolean[])((boolean[])var5[63]))[17] = -1 != ~(((D3DCAPS)var5[77]).TextureCaps & 8192);
            ((boolean[])((boolean[])var5[63]))[24] = -1 == ~(2 & ((D3DCAPS)var5[77]).TextureCaps);
            ((boolean[])((boolean[])var5[63]))[7] = 0 < ((int[])((int[])var5[1]))[10] || 0 == IDirect3D.CheckDeviceMultiSampleType(((long[])((long[])var5[50]))[6], ((int[])((int[])var5[1]))[41], ((int[])((int[])var5[1]))[39], ((D3DPRESENT_PARAMETERS)var5[83]).BackBufferFormat, true, 2);
            var5[84] = new boolean[((int[])((int[])var5[1]))[8]];
            var5[76] = new Object[((int[])((int[])var5[1]))[8]][];
            var5[85] = new boolean[((int[])((int[])var5[1]))[8]];
            var5[80] = new boolean[((int[])((int[])var5[1]))[8]];
            var5[81] = new int[((int[])((int[])var5[1]))[8]];
            var5[78] = new boolean[((int[])((int[])var5[1]))[8]];
            Object[] var13 = im.a(new Object[2], (int)-16365);
            mq.a(1.0F, (byte)-128, var13, 0.5F, -1.0F);
            cq.a((byte)81, 0.0F, 0.0F, 0.5F, var13);
            var5[79] = ab.a(new Object[2], (byte)-99);
            aqa.a(true, var13, (Object[])((Object[])var5[79]));
            IDirect3DDevice.BeginScene(((long[])((long[])var5[50]))[5]);
         } catch (Throwable var14) {
            var14.printStackTrace();
            ((ta)var5[38]).a((byte)17);
            throw new RuntimeException("");
         }

         return var5;
      } catch (RuntimeException var15) {
         throw vt.a(var15, "cv.D(" + var0 + ',' + var1 + ',' + (var3 != null?"{...}":"null") + ',' + (var4 != null?"{...}":"null") + ',' + (var5 != null?"{...}":"null") + ',' + var6 + ',' + var7 + ',' + (var8 != null?"{...}":"null") + ',' + var9 + ',' + (var10 != null?"{...}":"null") + ',' + var11 + ')');
      }
   }

   static final boolean a(Object[] var0, Object[] var1, float var2, Object[] var3, byte var4) {
      ++e;
      boolean var9 = true;
      Object[] var10 = (Object[])((Object[])((Object[])((Object[])var3[0]))[30]);
      uba.a(wl.e, -78, (Object[])((Object[])var3[0]));
      dh.a((Object[])((Object[])var3[0]), (int)106);
      kr.a((Object[])((Object[])var3[0]), (int)125);
      OpenGL.glMatrixMode(5889);
      OpenGL.glLoadIdentity();
      OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
      OpenGL.glMatrixMode(5888);
      OpenGL.glLoadIdentity();
      OpenGL.glPushAttrib(2048);
      OpenGL.glViewport(0, 0, ((int[])((int[])((Object[])((Object[])var3[1]))[1]))[3], ((int[])((int[])((Object[])((Object[])var3[1]))[1]))[3]);
      cka.a(var4 ^ 64, (Object[])((Object[])var3[0]), false);
      pda.a((Object[])((Object[])var3[0]), -21342, false);
      if(var4 != 84) {
         ((byte[])((byte[])a[1]))[0] = -91;
      }

      if(null != var10 && (4 == var10.length || var10.length == 1)) {
         cw.a((int)1, (Object[])null);
      }

      wma.a(-1000, (Object[])((Object[])var3[0]), false);
      jma.a(var4 + 35, false, (Object[])((Object[])var3[0]));
      jia.a((Object[])((Object[])var3[0]), 0, -2);
      nha.a((Object[])((Object[])var3[0]), 18806, 1);
      moa.a((Object[])((Object[])var3[0]), 0.0F, var2, 0.0F, 2481, 0.0F);
      el.a('\u8575', 30862, '\u8575', (Object[])((Object[])var3[0]));
      moa.a((byte)110, var0, (Object[])((Object[])var3[0]));
      nha.a((Object[])((Object[])var3[0]), 18806, 0);
      za.a(1, var4 ^ -20885, (Object[])((Object[])var3[0]));
      moa.a((byte)127, var1, (Object[])((Object[])var3[0]));
      Object[] var5;
      ((ta)(null != (var5 = (Object[])((Object[])var3[0]))?var5[55]:null)).a((hsa)(var10 != null?var10[3]:null), 59);

      for(int var11 = 0; 6 > var11; ++var11) {
         int var12 = var11 + '\u8515';
         Object[] var15 = (Object[])((Object[])var3[1]);
         Object[] var18 = new Object[3];
         if(var18[1] == null) {
            var18[1] = new int[2];
         }

         var18[0] = dma.a(var18, var4 ^ 212);
         var18[2] = var15;
         ((int[])((int[])var18[1]))[1] = 0;
         ((int[])((int[])var18[1]))[0] = var12;
         Object[] var16;
         re var14 = (re)(null == (var16 = var18)?null:var16[0]);
         nn.a(false, 0, var10, var14);
         Class_ds.a(false, 0, var10);
         if(!nd.a(var10, (int)-94)) {
            var9 = false;
            break;
         }

         OpenGL.glBegin(7);
         if(var12 == '\u8516') {
            OpenGL.glTexCoord3i(-65535, '\ufffe', -65534);
            OpenGL.glMultiTexCoord3i('\u84c1', -65535, '\ufffe', -65534);
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i(-65535, '\ufffe', '\ufffe');
            OpenGL.glMultiTexCoord3i('\u84c1', -65535, '\ufffe', '\ufffe');
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i(-65535, -65534, '\ufffe');
            OpenGL.glMultiTexCoord3i('\u84c1', -65535, -65534, '\ufffe');
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i(-65535, -65534, -65534);
            OpenGL.glMultiTexCoord3i('\u84c1', -65535, -65534, -65534);
            OpenGL.glVertex2f(0.0F, 1.0F);
         } else if('\u851a' == var12) {
            OpenGL.glTexCoord3i('\ufffe', '\ufffe', -65535);
            OpenGL.glMultiTexCoord3i('\u84c1', '\ufffe', '\ufffe', -65535);
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i(-65534, '\ufffe', -65535);
            OpenGL.glMultiTexCoord3i('\u84c1', -65534, '\ufffe', -65535);
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i(-65534, -65534, -65535);
            OpenGL.glMultiTexCoord3i('\u84c1', -65534, -65534, -65535);
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i('\ufffe', -65534, -65535);
            OpenGL.glMultiTexCoord3i('\u84c1', '\ufffe', -65534, -65535);
            OpenGL.glVertex2f(0.0F, 1.0F);
         } else if('\u8518' == var12) {
            OpenGL.glTexCoord3i(-65534, -65535, '\ufffe');
            OpenGL.glMultiTexCoord3i('\u84c1', -65534, -65535, '\ufffe');
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i('\ufffe', -65535, '\ufffe');
            OpenGL.glMultiTexCoord3i('\u84c1', '\ufffe', -65535, '\ufffe');
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i('\ufffe', -65535, -65534);
            OpenGL.glMultiTexCoord3i('\u84c1', '\ufffe', -65535, -65534);
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i(-65534, -65535, -65534);
            OpenGL.glMultiTexCoord3i('\u84c1', -65534, -65535, -65534);
            OpenGL.glVertex2f(0.0F, 1.0F);
         } else if('\u8515' == var12) {
            OpenGL.glTexCoord3i('\uffff', '\ufffe', '\ufffe');
            OpenGL.glMultiTexCoord3i('\u84c1', '\uffff', '\ufffe', '\ufffe');
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i('\uffff', '\ufffe', -65534);
            OpenGL.glMultiTexCoord3i('\u84c1', '\uffff', '\ufffe', -65534);
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i('\uffff', -65534, -65534);
            OpenGL.glMultiTexCoord3i('\u84c1', '\uffff', -65534, -65534);
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i('\uffff', -65534, '\ufffe');
            OpenGL.glMultiTexCoord3i('\u84c1', '\uffff', -65534, '\ufffe');
            OpenGL.glVertex2f(0.0F, 1.0F);
         } else if('\u8517' == var12) {
            OpenGL.glTexCoord3i(-65534, '\uffff', -65534);
            OpenGL.glMultiTexCoord3i('\u84c1', -65534, '\uffff', -65534);
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i('\ufffe', '\uffff', -65534);
            OpenGL.glMultiTexCoord3i('\u84c1', '\ufffe', '\uffff', -65534);
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i('\ufffe', '\uffff', '\ufffe');
            OpenGL.glMultiTexCoord3i('\u84c1', '\ufffe', '\uffff', '\ufffe');
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i(-65534, '\uffff', '\ufffe');
            OpenGL.glMultiTexCoord3i('\u84c1', -65534, '\uffff', '\ufffe');
            OpenGL.glVertex2f(0.0F, 1.0F);
         } else if('\u8519' == var12) {
            OpenGL.glTexCoord3i(-65534, '\ufffe', '\uffff');
            OpenGL.glMultiTexCoord3i('\u84c1', -65534, '\ufffe', '\uffff');
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i('\ufffe', '\ufffe', '\uffff');
            OpenGL.glMultiTexCoord3i('\u84c1', '\ufffe', '\ufffe', '\uffff');
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i('\ufffe', -65534, '\uffff');
            OpenGL.glMultiTexCoord3i('\u84c1', '\ufffe', -65534, '\uffff');
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i(-65534, -65534, '\uffff');
            OpenGL.glMultiTexCoord3i('\u84c1', -65534, -65534, '\uffff');
            OpenGL.glVertex2f(0.0F, 1.0F);
         }

         OpenGL.glEnd();
      }

      nn.a(false, 0, var10, (re)null);
      Object[] var7;
      ((ta)((var7 = (Object[])((Object[])var3[0])) != null?var7[55]:null)).a(true, (hsa)(var10 != null?var10[3]:null));
      nha.a((Object[])((Object[])var3[0]), 18806, 1);
      moa.a((byte)127, (Object[])null, (Object[])((Object[])var3[0]));
      el.a(8448, var4 + 30778, 8448, (Object[])((Object[])var3[0]));
      nha.a((Object[])((Object[])var3[0]), 18806, 0);
      moa.a((byte)111, (Object[])null, (Object[])((Object[])var3[0]));
      OpenGL.glPopAttrib();
      ena.a(wl.e[3], wl.e[0], (Object[])((Object[])var3[0]), wl.e[1], (byte)-112, wl.e[2]);
      if(var9 && !((boolean[])((boolean[])((Object[])((Object[])var3[0]))[17]))[12]) {
         sja.a((Object[])((Object[])var3[1]), -102);
      }

      return var9;
   }

   static final int a(Object[] var0, boolean var1) {
      ++g;
      if(var1) {
         ((Object[])((Object[])((Object[])((Object[])var0[16]))[1]))[10] = ((Object[])((Object[])a[1]))[7];
      }

      return or.a((byte)-31, (Object[])((Object[])var0[5])) + or.a((byte)89, (Object[])((Object[])var0[4]));
   }

   static final void a(int[] var0, byte var1, long[] var2) {
      ++f;
      int var3 = 35 / ((-66 - var1) / 60);
      vea.a(0, var2, -9634, var0, -1 + var2.length);
   }

   static final void a(int var0, byte var1) {
      cb.n[var0] = false;
      ++f_i;
      nl.a(11, var0);
      if(var1 < 44) {
         ((Object[])((Object[])a[7]))[26] = a[12];
      }

   }

   static final void a(Object[] var0, int var1) {
      ((int[])((int[])var0[1]))[15] = (16772372 & ((int[])((int[])var0[1]))[36]) >> 16;
      ((int[])((int[])var0[1]))[37] = ((int[])((int[])var0[1]))[3] >> 16 & 255;
      ++j;
      if(((int[])((int[])var0[1]))[0] > -2 || ((int[])((int[])var0[1]))[44] > -2) {
         ((boolean[])((boolean[])var0[0]))[1] = true;
      }

      ((int[])((int[])var0[1]))[41] = ((int[])((int[])var0[1]))[3] >> 8 & 255;
      ((int[])((int[])var0[1]))[23] = ((int[])((int[])var0[1]))[36] >> 8 & 255;
      ((int[])((int[])var0[1]))[32] = ((int[])((int[])var0[1]))[37] - ((int[])((int[])var0[1]))[15];
      ((int[])((int[])var0[1]))[6] = 255 & ((int[])((int[])var0[1]))[3];
      ((int[])((int[])var0[1]))[8] = -((int[])((int[])var0[1]))[23] + ((int[])((int[])var0[1]))[41];
      ((int[])((int[])var0[1]))[21] = ((int[])((int[])var0[1]))[36] & 255;
      ((int[])((int[])var0[1]))[1] = -((int[])((int[])var0[1]))[21] + ((int[])((int[])var0[1]))[6];
      ((int[])((int[])var0[1]))[16] = 255 & ((int[])((int[])var0[1]))[3] >> 24;
      ((int[])((int[])var0[1]))[38] = 255 & ((int[])((int[])var0[1]))[36] >> 24;
      ((int[])((int[])var0[1]))[27] = -((int[])((int[])var0[1]))[38] + ((int[])((int[])var0[1]))[16];
      if(0 != ((int[])((int[])var0[1]))[30]) {
         ((int[])((int[])var0[1]))[13] = ((int[])((int[])var0[1]))[19] * ((int[])((int[])var0[1]))[28] / 100;
         ((int[])((int[])var0[1]))[10] = ((int[])((int[])var0[1]))[25] * ((int[])((int[])var0[1]))[28] / 100;
         if(((int[])((int[])var0[1]))[10] == 0) {
            ((int[])((int[])var0[1]))[10] = 1;
         }

         ((int[])((int[])var0[1]))[9] = (((((int[])((int[])var0[1]))[30] & 16715664) >> 16) - (((int[])((int[])var0[1]))[32] / 2 + ((int[])((int[])var0[1]))[15]) << 8) / ((int[])((int[])var0[1]))[10];
         ((int[])((int[])var0[1]))[7] = (-((int[])((int[])var0[1]))[21] - ((int[])((int[])var0[1]))[1] / 2 + (((int[])((int[])var0[1]))[30] & 255) << 8) / ((int[])((int[])var0[1]))[10];
         ((int[])((int[])var0[1]))[31] = (-(((int[])((int[])var0[1]))[8] / 2) + -((int[])((int[])var0[1]))[23] + (((int[])((int[])var0[1]))[30] >> 8 & 255) << 8) / ((int[])((int[])var0[1]))[10];
         if(((int[])((int[])var0[1]))[13] == 0) {
            ((int[])((int[])var0[1]))[13] = 1;
         }

         ((int[])((int[])var0[1]))[9] += -1 > ~((int[])((int[])var0[1]))[9]?-4:4;
         ((int[])((int[])var0[1]))[48] = ((((int[])((int[])var0[1]))[30] >> 24 & 255) - (((int[])((int[])var0[1]))[27] / 2 + ((int[])((int[])var0[1]))[38]) << 8) / ((int[])((int[])var0[1]))[13];
         ((int[])((int[])var0[1]))[7] -= ((int[])((int[])var0[1]))[7] <= 0?4:4;
         ((int[])((int[])var0[1]))[31] -= 0 >= ((int[])((int[])var0[1]))[31]?4:4;
         ((int[])((int[])var0[1]))[48] -= ((int[])((int[])var0[1]))[48] <= 0?4:4;
      }

      if(var1 != -19219) {
         a((int[])null, (byte)-104, (long[])null);
      }

      if(~((int[])((int[])var0[1]))[46] != 0) {
         ((int[])((int[])var0[1]))[34] = ((int[])((int[])var0[1]))[20] * ((int[])((int[])var0[1]))[28] / 100;
         if(((int[])((int[])var0[1]))[34] == 0) {
            ((int[])((int[])var0[1]))[34] = 1;
         }

         ((int[])((int[])var0[1]))[24] = (((int[])((int[])var0[1]))[46] - ((((int[])((int[])var0[1]))[47] + -((int[])((int[])var0[1]))[40]) / 2 + ((int[])((int[])var0[1]))[40])) / ((int[])((int[])var0[1]))[34];
      }

      if(((int[])((int[])var0[1]))[4] != -1) {
         ((int[])((int[])var0[1]))[29] = ((int[])((int[])var0[1]))[28] * ((int[])((int[])var0[1]))[22] / 100;
         if(((int[])((int[])var0[1]))[29] == 0) {
            ((int[])((int[])var0[1]))[29] = 1;
         }

         ((int[])((int[])var0[1]))[35] = (((int[])((int[])var0[1]))[4] + -((int[])((int[])var0[1]))[33] + -((((int[])((int[])var0[1]))[11] - ((int[])((int[])var0[1]))[33]) / 2)) / ((int[])((int[])var0[1]))[29];
      }

   }

}
