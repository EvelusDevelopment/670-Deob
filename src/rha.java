import jaggl.OpenGL;

final class rha extends cga {

   static int n;
   static int u;
   static int s = 0;
   static int q;
   static int e;
   static int t;
   static int g;
   static int m;
   static int k;
   static int v;
   static int f;
   static int c;
   static int f_l;
   static int o;
   static int a;
   static int[] j = new int[]{3, 7, 15};
   static int f_i;
   static int d;
   static int r;
   private Object[] w;
   static int h;
   static int b;
   static int p;


   final void a(int[] var1) {
      ++u;
      Object[] var2 = this.w;
      var1[1] = ((int[])((int[])var2[1]))[3];
      var1[3] = ((int[])((int[])var2[1]))[2];
      var1[0] = ((int[])((int[])var2[1]))[0];
      var1[2] = ((int[])((int[])var2[1]))[4];
   }

   final void a(int var1, int var2, int var3, int var4) {
      oca.a(var1, this.w, 2, var4, var3, var2);
      ++c;
   }

   static final Object[] a(int var0, byte var1, Object[] var2, Object[] var3) {
      if(var1 > -108) {
         b(-65, (Object[])((Object[])((Object[])((Object[])var3[3]))[0]));
      }

      ++b;
      lra.a(var3, 16830, var0, var2);
      return var3;
   }

   static final void a(int var0, boolean var1, Object[] var2, Object[] var3) {
      ++o;
      tua.a(var2, var1, (byte)124, (Object[][])((Object[][])var3[var0]));
   }

   final void a(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10) {
      ++t;
      Object[] var11 = this.w;
      float var12 = var1;
      float var13 = var2;
      float var14 = var3;
      float var15 = var4;
      float var16 = var5;
      float var17 = var6;
      float var19;
      float var18;
      if(((boolean[])((boolean[])var11[5]))[0]) {
         var18 = (float)po.a(-17010, var11);
         var19 = (float)uka.a(var11, (byte)18);
         float var20 = (-var1 + var3) / var18;
         float var21 = (var4 - var2) / var18;
         float var22 = (-var1 + var5) / var19;
         float var23 = (-var2 + var6) / var19;
         float var24 = var22 * (float)((int[])((int[])var11[1]))[3];
         float var25 = (float)((int[])((int[])var11[1]))[3] * var23;
         float var26 = var20 * (float)((int[])((int[])var11[1]))[0];
         float var27 = var21 * (float)((int[])((int[])var11[1]))[0];
         float var28 = (float)((int[])((int[])var11[1]))[4] * -var20;
         float var29 = (float)((int[])((int[])var11[1]))[4] * -var21;
         float var30 = -var22 * (float)((int[])((int[])var11[1]))[2];
         float var31 = -var23 * (float)((int[])((int[])var11[1]))[2];
         var13 = var27 + var2 + var25;
         var14 = var28 + var3 + var24;
         var16 = var30 + var5 + var26;
         var15 = var29 + var4 + var25;
         var12 = var24 + var26 + var1;
         if(null != var11 && var11.length == 10) {
            return;
         }

         var17 = var31 + var6 + var27;
      }

      var18 = -var12 + var14 + var16;
      lta.a(-112, (Object[])((Object[])var11[3]), 0 != (var10 & 1));
      var19 = var17 - var13 + var15;
      sm.a((Object[])((Object[])var11[0]), 115);
      moa.a((byte)101, (Object[])((Object[])var11[3]), (Object[])((Object[])var11[0]));
      kd.a(3042, (Object[])((Object[])var11[0]), var9);
      za.a(var7, -20929, (Object[])((Object[])var11[0]));
      OpenGL.glColor4ub((byte)(var8 >> 16), (byte)(var8 >> 8), (byte)var8, (byte)(var8 >> 24));
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f(0.0F, ((float[])((float[])((Object[])((Object[])var11[3]))[6]))[1]);
      OpenGL.glVertex2f(var12, var13);
      OpenGL.glTexCoord2f(0.0F, 0.0F);
      OpenGL.glVertex2f(var16, var17);
      OpenGL.glTexCoord2f(((float[])((float[])((Object[])((Object[])var11[3]))[6]))[0], 0.0F);
      OpenGL.glVertex2f(var18, var19);
      OpenGL.glTexCoord2f(((float[])((float[])((Object[])((Object[])var11[3]))[6]))[0], ((float[])((float[])((Object[])((Object[])var11[3]))[6]))[1]);
      OpenGL.glVertex2f(var14, var15);
      OpenGL.glEnd();
      if(var11 != null && -5 == ~var11.length) {
         this.f();
      }

   }

   final void a(float var1, float var2, float var3, float var4, float var5, float var6, int var7, Class_s var8, int var9, int var10) {
      ++v;
      wea.a(var10, var9, var6, var7, var2, var3, var5, this.w, var8, 19237, var4, var1);
   }

   static final int b(int var0, Object[] var1) {
      if(var0 != 8) {
         s = 80;
      }

      ++f_l;
      int var2 = ((int[])((int[])var1[0]))[1];
      if(var2 == 7) {
         return 6408;
      } else if(9 == var2) {
         return 6407;
      } else if(4 == var2) {
         return 6406;
      } else if(8 == var2) {
         return 6402;
      } else if(1 != var2) {
         if(5 != var2) {
            throw new IllegalStateException();
         } else {
            return 6409;
         }
      } else {
         return 6410;
      }
   }

   final re h() {
      ++d;
      return qr.a(this.w, (byte)-126);
   }

   final int e() {
      ++h;
      return naa.a(this.w, 1);
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      ++f_i;
      Object[] var9 = this.w;
      lta.a(-29, (Object[])((Object[])var9[3]), (1 & var8) != 0);
      sm.a((Object[])((Object[])var9[0]), 122);
      kd.a(3042, (Object[])((Object[])var9[0]), var7);
      OpenGL.glColor4ub((byte)(var6 >> 16), (byte)(var6 >> 8), (byte)var6, (byte)(var6 >> 24));
      if(!((boolean[])((boolean[])var9[5]))[0]) {
         if(null != var9[4]) {
            et.a(0, var5, var9);
            lta.a(126, (Object[])((Object[])var9[4]), true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, ((float[])((float[])((Object[])((Object[])var9[3]))[6]))[1]);
            OpenGL.glTexCoord2f(0.0F, ((float[])((float[])((Object[])((Object[])var9[3]))[6]))[1]);
            OpenGL.glVertex2i(var1, var2);
            OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var1, var4 + var2);
            if(null != var9 && (-4 == ~var9.length || var9.length == 10 || -2 == ~var9.length)) {
               return;
            }

            OpenGL.glMultiTexCoord2f('\u84c1', ((float[])((float[])((Object[])((Object[])var9[3]))[6]))[0], 0.0F);
            OpenGL.glTexCoord2f(((float[])((float[])((Object[])((Object[])var9[3]))[6]))[0], 0.0F);
            OpenGL.glVertex2i(var3 + var1, var4 + var2);
            OpenGL.glMultiTexCoord2f('\u84c1', ((float[])((float[])((Object[])((Object[])var9[3]))[6]))[0], ((float[])((float[])((Object[])((Object[])var9[3]))[6]))[1]);
            OpenGL.glTexCoord2f(((float[])((float[])((Object[])((Object[])var9[3]))[6]))[0], ((float[])((float[])((Object[])((Object[])var9[3]))[6]))[1]);
            OpenGL.glVertex2i(var1 + var3, var2);
            OpenGL.glEnd();
            kha.a(770, var9);
         } else {
            moa.a((byte)110, (Object[])((Object[])var9[3]), (Object[])((Object[])var9[0]));
            za.a(var5, -20929, (Object[])((Object[])var9[0]));
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, ((float[])((float[])((Object[])((Object[])var9[3]))[6]))[1]);
            OpenGL.glVertex2i(var1, var2);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var1, var4 + var2);
            OpenGL.glTexCoord2f(((float[])((float[])((Object[])((Object[])var9[3]))[6]))[0], 0.0F);
            OpenGL.glVertex2i(var3 + var1, var2 + var4);
            OpenGL.glTexCoord2f(((float[])((float[])((Object[])((Object[])var9[3]))[6]))[0], ((float[])((float[])((Object[])((Object[])var9[3]))[6]))[1]);
            if(var9 != null && (var9.length == 5 && var9[3].equals(Integer.valueOf(0)) || -2 == ~var9.length)) {
               this.a(((int[])((int[])this.w[2]))[0], -105, 38, 106, -61);
            }

            OpenGL.glVertex2i(var3 + var1, var2);
            OpenGL.glEnd();
         }
      } else {
         float var10 = (float)var3 / (float)po.a(-17010, var9);
         float var11 = (float)var4 / (float)uka.a(var9, (byte)58);
         float var12 = (float)((int[])((int[])var9[1]))[0] * var10 + (float)var1;
         float var13 = (float)((int[])((int[])var9[1]))[3] * var11 + (float)var2;
         float var14 = (float)((int[])((int[])((Object[])((Object[])var9[3]))[1]))[6] * var10 + var12;
         float var15 = (float)((int[])((int[])((Object[])((Object[])var9[3]))[1]))[5] * var11 + var13;
         if(var9[4] != null) {
            et.a(0, var5, var9);
            lta.a(-91, (Object[])((Object[])var9[4]), true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, ((float[])((float[])((Object[])((Object[])var9[3]))[6]))[1]);
            OpenGL.glTexCoord2f(0.0F, ((float[])((float[])((Object[])((Object[])var9[3]))[6]))[1]);
            OpenGL.glVertex2f(var12, var13);
            OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2f(var12, var15);
            OpenGL.glMultiTexCoord2f('\u84c1', ((float[])((float[])((Object[])((Object[])var9[3]))[6]))[0], 0.0F);
            if(null != var9 && 4 == var9.length) {
               ((byte[])((byte[])this.w[6]))[43] = ((byte[])((byte[])this.w[30]))[1];
            }

            OpenGL.glTexCoord2f(((float[])((float[])((Object[])((Object[])var9[3]))[6]))[0], 0.0F);
            OpenGL.glVertex2f(var14, var15);
            OpenGL.glMultiTexCoord2f('\u84c1', ((float[])((float[])((Object[])((Object[])var9[3]))[6]))[0], ((float[])((float[])((Object[])((Object[])var9[3]))[6]))[1]);
            OpenGL.glTexCoord2f(((float[])((float[])((Object[])((Object[])var9[3]))[6]))[0], ((float[])((float[])((Object[])((Object[])var9[3]))[6]))[1]);
            OpenGL.glVertex2f(var14, var13);
            OpenGL.glEnd();
            kha.a(770, var9);
         } else {
            moa.a((byte)97, (Object[])((Object[])var9[3]), (Object[])((Object[])var9[0]));
            if(var9 != null && var9.length == 18) {
               this.a(-10, -29, ((int[])((int[])this.w[39]))[19]);
            }

            za.a(var5, -20929, (Object[])((Object[])var9[0]));
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, ((float[])((float[])((Object[])((Object[])var9[3]))[6]))[1]);
            OpenGL.glVertex2f(var12, var13);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2f(var12, var15);
            OpenGL.glTexCoord2f(((float[])((float[])((Object[])((Object[])var9[3]))[6]))[0], 0.0F);
            OpenGL.glVertex2f(var14, var15);
            OpenGL.glTexCoord2f(((float[])((float[])((Object[])((Object[])var9[3]))[6]))[0], ((float[])((float[])((Object[])((Object[])var9[3]))[6]))[1]);
            OpenGL.glVertex2f(var14, var13);
            OpenGL.glEnd();
         }
      }

   }

   final int d() {
      ++g;
      return uka.a(this.w, (byte)-105);
   }

   final void a(int var1, int var2, int var3) {
      ++k;
      Object[] var4 = this.w;
      OpenGL.glPixelTransferf(3348, 0.5F);
      OpenGL.glPixelTransferf(3349, 0.499F);
      OpenGL.glPixelTransferf(3352, 0.5F);
      OpenGL.glPixelTransferf(3353, 0.499F);
      OpenGL.glPixelTransferf(3354, 0.5F);
      OpenGL.glPixelTransferf(3355, 0.499F);
      var4[4] = fp.a((Object[])((Object[])var4[0]), ((int[])((int[])((Object[])((Object[])var4[3]))[1]))[5], var1, (byte)74, var2, ((int[])((int[])((Object[])((Object[])var4[3]))[1]))[6]);
      ((int[])((int[])var4[1]))[1] = var3;
      OpenGL.glPixelTransferf(3348, 1.0F);
      if(var4 != null && -2 == ~var4.length && var4[0].equals(Boolean.valueOf(false)) && var4[0].equals(Boolean.valueOf(false))) {
         this.e();
      }

      OpenGL.glPixelTransferf(3349, 0.0F);
      OpenGL.glPixelTransferf(3352, 1.0F);
      OpenGL.glPixelTransferf(3353, 0.0F);
      OpenGL.glPixelTransferf(3354, 1.0F);
      OpenGL.glPixelTransferf(3355, 0.0F);
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      cc.a(var5, (byte)125, this.w, var3, var2, var1, var4, var6);
      ++q;
   }

   final int g() {
      ++r;
      Object[] var2 = this.w;
      int var1 = ((int[])((int[])((Object[])((Object[])var2[3]))[1]))[5];
      return var1;
   }

   rha(Object[] var1) {
      this.w = var1;
   }

   static final ka a(byte var0, Object[] var1, int var2, int var3, Object[] var4, ta var5) {
      if(var3 < 55) {
         a(-41, (Object[])((Object[])((Object[])((Object[])var4[8]))[1]));
      }

      ++f;
      return mia.a(0, var2, 0, var4, false, var1, 71, 0, (aa)null, var5, (aa)null, var0);
   }

   final void a(int var1, int var2, Class_s var3, int var4, int var5) {
      ++n;
      aka.a(this.w, var1, var2, var3, var5, (byte)-47, var4);
   }

   final int f() {
      ++p;
      return po.a(-17010, this.w);
   }

   final void a(int var1, int var2, int var3, int var4, int var5) {
      ++m;
      Object[] var6 = this.w;
      lta.a(126, (Object[])((Object[])var6[3]), false);
      sm.a((Object[])((Object[])var6[0]), 120);
      kd.a(3042, (Object[])((Object[])var6[0]), var5);
      OpenGL.glColor4ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4, (byte)(var4 >> 24));
      int var8 = var2 + ((int[])((int[])var6[1]))[3];
      int var7 = var1 + ((int[])((int[])var6[1]))[0];
      if(null != var6[4]) {
         et.a(0, var3, var6);
         lta.a(-113, (Object[])((Object[])var6[4]), false);
         OpenGL.glBegin(7);
         OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, ((float[])((float[])((Object[])((Object[])var6[3]))[6]))[1]);
         OpenGL.glTexCoord2f(0.0F, ((float[])((float[])((Object[])((Object[])var6[3]))[6]))[1]);
         OpenGL.glVertex2i(var7, var8);
         OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 0.0F);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var7, ((int[])((int[])((Object[])((Object[])var6[3]))[1]))[5] + var8);
         OpenGL.glMultiTexCoord2f('\u84c1', ((float[])((float[])((Object[])((Object[])var6[3]))[6]))[0], 0.0F);
         if(null != var6 && var6.length == 5) {
            return;
         }

         OpenGL.glTexCoord2f(((float[])((float[])((Object[])((Object[])var6[3]))[6]))[0], 0.0F);
         OpenGL.glVertex2i(((int[])((int[])((Object[])((Object[])var6[3]))[1]))[6] + var7, ((int[])((int[])((Object[])((Object[])var6[3]))[1]))[5] + var8);
         OpenGL.glMultiTexCoord2f('\u84c1', ((float[])((float[])((Object[])((Object[])var6[3]))[6]))[0], ((float[])((float[])((Object[])((Object[])var6[3]))[6]))[1]);
         OpenGL.glTexCoord2f(((float[])((float[])((Object[])((Object[])var6[3]))[6]))[0], ((float[])((float[])((Object[])((Object[])var6[3]))[6]))[1]);
         OpenGL.glVertex2i(((int[])((int[])((Object[])((Object[])var6[3]))[1]))[6] + var7, var8);
         OpenGL.glEnd();
         kha.a(770, var6);
         if(client.f_vb == 0) {
            return;
         }
      }

      moa.a((byte)117, (Object[])((Object[])var6[3]), (Object[])((Object[])var6[0]));
      za.a(var3, -20929, (Object[])((Object[])var6[0]));
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f(0.0F, ((float[])((float[])((Object[])((Object[])var6[3]))[6]))[1]);
      OpenGL.glVertex2i(var7, var8);
      OpenGL.glTexCoord2f(0.0F, 0.0F);
      OpenGL.glVertex2i(var7, ((int[])((int[])((Object[])((Object[])var6[3]))[1]))[5] + var8);
      OpenGL.glTexCoord2f(((float[])((float[])((Object[])((Object[])var6[3]))[6]))[0], 0.0F);
      OpenGL.glVertex2i(((int[])((int[])((Object[])((Object[])var6[3]))[1]))[6] + var7, ((int[])((int[])((Object[])((Object[])var6[3]))[1]))[5] + var8);
      OpenGL.glTexCoord2f(((float[])((float[])((Object[])((Object[])var6[3]))[6]))[0], ((float[])((float[])((Object[])((Object[])var6[3]))[6]))[1]);
      OpenGL.glVertex2i(var7 + ((int[])((int[])((Object[])((Object[])var6[3]))[1]))[6], var8);
      OpenGL.glEnd();
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      ++e;
      Object[] var8 = this.w;
      int var9 = var1 + var3;
      int var10 = var2 + var4;
      lta.a(-121, (Object[])((Object[])var8[3]), false);
      sm.a((Object[])((Object[])var8[0]), 125);
      moa.a((byte)104, (Object[])((Object[])var8[3]), (Object[])((Object[])var8[0]));
      kd.a(3042, (Object[])((Object[])var8[0]), var7);
      za.a(var5, -20929, (Object[])((Object[])var8[0]));
      OpenGL.glColor4ub((byte)(var6 >> 16), (byte)(var6 >> 8), (byte)var6, (byte)(var6 >> 24));
      if(((boolean[])((boolean[])((Object[])((Object[])var8[3]))[3]))[3] && !((boolean[])((boolean[])var8[5]))[0]) {
         float var20 = (float)var4 * ((float[])((float[])((Object[])((Object[])var8[3]))[6]))[1] / (float)((int[])((int[])((Object[])((Object[])var8[3]))[1]))[5];
         float var21 = ((float[])((float[])((Object[])((Object[])var8[3]))[6]))[0] * (float)var3 / (float)((int[])((int[])((Object[])((Object[])var8[3]))[1]))[6];
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, var20);
         OpenGL.glVertex2i(var1, var2);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var1, var10);
         OpenGL.glTexCoord2f(var21, 0.0F);
         OpenGL.glVertex2i(var9, var10);
         if(var8 != null && var8.length == 3 && var8[1].equals(Integer.valueOf(0))) {
            this.g();
         }

         OpenGL.glTexCoord2f(var21, var20);
         OpenGL.glVertex2i(var9, var2);
         OpenGL.glEnd();
      } else {
         OpenGL.glPushMatrix();
         OpenGL.glTranslatef((float)((int[])((int[])var8[1]))[0], (float)((int[])((int[])var8[1]))[3], 0.0F);
         int var11 = po.a(-17010, var8);
         int var12 = uka.a(var8, (byte)109);
         if(null != var8 && var8.length == 3) {
            this.e();
         }

         int var14 = ((int[])((int[])((Object[])((Object[])var8[3]))[1]))[5] + var2;
         OpenGL.glBegin(7);
         int var13 = var2;

         while(true) {
            int var16;
            if(var10 < var14) {
               if(var13 < var10) {
                  if(var8 != null && var8.length == 9) {
                     ((long[])((long[])this.w[7]))[2] = -111L;
                  }

                  float var22 = ((float[])((float[])((Object[])((Object[])var8[3]))[6]))[1] * (float)(((int[])((int[])((Object[])((Object[])var8[3]))[1]))[5] + -var10 + var13) / (float)((int[])((int[])((Object[])((Object[])var8[3]))[1]))[5];
                  int var23 = ((int[])((int[])((Object[])((Object[])var8[3]))[1]))[6] + var1;

                  for(var16 = var1; var23 <= var9; var16 += var11) {
                     OpenGL.glTexCoord2f(0.0F, ((float[])((float[])((Object[])((Object[])var8[3]))[6]))[1]);
                     OpenGL.glVertex2i(var16, var13);
                     OpenGL.glTexCoord2f(0.0F, var22);
                     if(null != var8 && var8.length == 11) {
                        return;
                     }

                     OpenGL.glVertex2i(var16, var10);
                     OpenGL.glTexCoord2f(((float[])((float[])((Object[])((Object[])var8[3]))[6]))[0], var22);
                     OpenGL.glVertex2i(var23, var10);
                     OpenGL.glTexCoord2f(((float[])((float[])((Object[])((Object[])var8[3]))[6]))[0], ((float[])((float[])((Object[])((Object[])var8[3]))[6]))[1]);
                     OpenGL.glVertex2i(var23, var13);
                     var23 += var11;
                  }

                  if(var16 < var9) {
                     float var18 = (float)(var9 - var16) * ((float[])((float[])((Object[])((Object[])var8[3]))[6]))[0] / (float)((int[])((int[])((Object[])((Object[])var8[3]))[1]))[6];
                     OpenGL.glTexCoord2f(0.0F, ((float[])((float[])((Object[])((Object[])var8[3]))[6]))[1]);
                     OpenGL.glVertex2i(var16, var13);
                     OpenGL.glTexCoord2f(0.0F, var22);
                     OpenGL.glVertex2i(var16, var10);
                     OpenGL.glTexCoord2f(var18, var22);
                     OpenGL.glVertex2i(var9, var10);
                     OpenGL.glTexCoord2f(var18, ((float[])((float[])((Object[])((Object[])var8[3]))[6]))[1]);
                     OpenGL.glVertex2i(var9, var13);
                  }
               }

               OpenGL.glEnd();
               OpenGL.glPopMatrix();
               break;
            }

            var16 = ((int[])((int[])((Object[])((Object[])var8[3]))[1]))[6] + var1;

            int var15;
            for(var15 = var1; var16 <= var9; var16 += var11) {
               OpenGL.glTexCoord2f(0.0F, ((float[])((float[])((Object[])((Object[])var8[3]))[6]))[1]);
               if(var8 != null && (2 == var8.length && var8[0].equals(Integer.valueOf(0)) && var8[0].equals(Integer.valueOf(0)) || -2 == ~var8.length)) {
                  return;
               }

               OpenGL.glVertex2i(var15, var13);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(var15, var14);
               OpenGL.glTexCoord2f(((float[])((float[])((Object[])((Object[])var8[3]))[6]))[0], 0.0F);
               OpenGL.glVertex2i(var16, var14);
               OpenGL.glTexCoord2f(((float[])((float[])((Object[])((Object[])var8[3]))[6]))[0], ((float[])((float[])((Object[])((Object[])var8[3]))[6]))[1]);
               OpenGL.glVertex2i(var16, var13);
               var15 += var11;
            }

            if(null != var8 && -19 == ~var8.length && var8[14].equals(Integer.valueOf(0))) {
               return;
            }

            if(var9 > var15) {
               float var17 = ((float[])((float[])((Object[])((Object[])var8[3]))[6]))[0] * (float)(var9 - var15) / (float)((int[])((int[])((Object[])((Object[])var8[3]))[1]))[6];
               OpenGL.glTexCoord2f(0.0F, ((float[])((float[])((Object[])((Object[])var8[3]))[6]))[1]);
               OpenGL.glVertex2i(var15, var13);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(var15, var14);
               OpenGL.glTexCoord2f(var17, 0.0F);
               OpenGL.glVertex2i(var9, var14);
               OpenGL.glTexCoord2f(var17, ((float[])((float[])((Object[])((Object[])var8[3]))[6]))[1]);
               OpenGL.glVertex2i(var9, var13);
            }

            var13 += var12;
            var14 += var12;
         }
      }

   }

   static final void a(int var0, Object[] var1) {
      int var2 = -110 / ((var0 + 17) / 32);
      if(var1[1] == null) {
         var1[1] = new int[1];
      }

      ++a;
   }

}
