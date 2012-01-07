import jaggl.OpenGL;

final class cma extends cga {

   static int f_l;
   static int o;
   static int g;
   static int e;
   static int v;
   static int h;
   static int p;
   static int u;
   private Object[] a;
   static int m;
   static int r;
   static int c;
   static int w;
   static int q;
   static int j;
   static int k;
   static int d;
   static int y;
   static int s;
   static int f;
   static int b;
   static int n;
   static Object[] t = ho.a(1, 31, new Object[1], true);
   static int x;
   static int f_i;


   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      ++g;
      Object[] var8 = this.a;
      el.a(122, (Object[])((Object[])var8[0]));
      aqa.a(var7, (Object[])((Object[])var8[0]), 89);
      Object[] var11 = (Object[])((Object[])((Object[])((Object[])var8[0]))[10]);
      var11[8] = var8[4];
      if(null == var11 || var11.length != 2 || !var11[0].equals(Integer.valueOf(1))) {
         sca.a(var5, var11, var6, 16);
         Object[] var9;
         float var12 = (float)((ta)((var9 = (Object[])((Object[])var8[0])) == null?null:var9[38])).e(30626).e();
         Object[] var10;
         float var13 = (float)((ta)((var10 = (Object[])((Object[])var8[0])) != null?var10[38]:null)).e(30626).d();
         var11[2] = ((Object[])((Object[])var8[0]))[17];
         var11[3] = ((Object[])((Object[])var8[0]))[23];
         ((int[])((int[])var11[1]))[0] = 0;
         boolean var14 = ((boolean[])((boolean[])var8[5]))[3] && ((int[])((int[])var8[1]))[0] == 0 && ((int[])((int[])var8[1]))[1] == 0;
         boolean var15 = ((boolean[])((boolean[])var8[5]))[0] && 0 == ((int[])((int[])var8[1]))[2] && ((int[])((int[])var8[1]))[5] == 0;
         if(var15 & var14) {
            vt.a(2.0F * (float)var3 / var12, (byte)-81, (Object[])((Object[])var11[4]), (float)var4 * 2.0F / var13, 1.0F, 1.0F);
            ((float[])((float[])((Object[])((Object[])var11[4]))[0]))[12] = ((float)var1 + ck.a(87, (Object[])((Object[])var8[0]))) * 2.0F / var12 - 1.0F;
            ((float[])((float[])((Object[])((Object[])var11[4]))[0]))[13] = -1.0F + (ck.a(87, (Object[])((Object[])var8[0])) + (float)var2) * 2.0F / var13;
            ((float[])((float[])((Object[])((Object[])var11[4]))[0]))[14] = -1.0F;
            vt.a(wv.a((byte)-126, (float)var3, (Object[])((Object[])var8[4])), (byte)-30, (Object[])((Object[])var11[6]), rra.a((Object[])((Object[])var8[4]), (float)var4, (byte)-103), 1.0F, 1.0F);
            Class_ss.a(var11, (int)5);
         } else {
            int var17;
            int var16;
            int var19;
            int var18;
            int var20;
            if(!var15) {
               if(var14) {
                  var16 = var3 + var1;
                  var17 = ob.a(var8, 94);
                  vt.a(wv.a((byte)-128, (float)((int[])((int[])var8[1]))[4], (Object[])((Object[])var8[4])), (byte)127, (Object[])((Object[])var11[6]), rra.a((Object[])((Object[])var8[4]), (float)var4, (byte)-103), 1.0F, 1.0F);
                  if(null != var11 && (-16 == ~var11.length && var11[1].equals(Integer.valueOf(1)) || 5 == var11.length)) {
                     this.a((int[])((int[])this.a[2]));
                  }

                  var18 = var1 + ((int[])((int[])var8[1]))[2];
                  var19 = var18 + ((int[])((int[])var8[1]))[4];

                  while(var19 <= var16) {
                     vt.a((float)((int[])((int[])var8[1]))[4] * 2.0F / var12, (byte)-78, (Object[])((Object[])var11[4]), (float)var4 * 2.0F / var13, 1.0F, 1.0F);
                     ((float[])((float[])((Object[])((Object[])var11[4]))[0]))[12] = 2.0F * ((float)var18 + ck.a(87, (Object[])((Object[])var8[0]))) / var12 - 1.0F;
                     ((float[])((float[])((Object[])((Object[])var11[4]))[0]))[13] = ((float)var2 + ck.a(87, (Object[])((Object[])var8[0]))) * 2.0F / var13 - 1.0F;
                     ((float[])((float[])((Object[])((Object[])var11[4]))[0]))[14] = -1.0F;
                     var18 += var17;
                     var19 += var17;
                     Class_ss.a(var11, (int)5);
                  }

                  if(var18 < var16) {
                     var20 = -var18 + var16;
                     vt.a(wv.a((byte)-126, (float)var20, (Object[])((Object[])var8[4])), (byte)-97, (Object[])((Object[])var11[6]), rra.a((Object[])((Object[])var8[4]), (float)var4, (byte)-84), 1.0F, 1.0F);
                     vt.a((float)var20 * 2.0F / var12, (byte)125, (Object[])((Object[])var11[4]), (float)var4 * 2.0F / var13, 1.0F, 1.0F);
                     ((float[])((float[])((Object[])((Object[])var11[4]))[0]))[12] = 2.0F * (ck.a(87, (Object[])((Object[])var8[0])) + (float)var18) / var12 - 1.0F;
                     ((float[])((float[])((Object[])((Object[])var11[4]))[0]))[13] = -1.0F + 2.0F * (ck.a(87, (Object[])((Object[])var8[0])) + (float)var2) / var13;
                     ((float[])((float[])((Object[])((Object[])var11[4]))[0]))[14] = -1.0F;
                     Class_ss.a(var11, (int)5);
                  }
               } else {
                  var16 = var4 + var2;
                  var17 = var3 + var1;
                  var18 = ob.a(var8, 42);
                  var19 = jt.a((byte)88, var8);
                  var20 = ((int[])((int[])var8[1]))[0] + var2;
                  if(null != var8 && -24 == ~var8.length && var8[7].equals(Integer.valueOf(1))) {
                     this.a(-0.5058091F, 1.2657595F, ((float[])((float[])((Object[])((Object[])this.a[0]))[11]))[2], -0.07485799F, ((float[])((float[])this.a[5]))[0], ((float[])((float[])((Object[])((Object[])this.a[1]))[1]))[28], 111, 74, ((int[])((int[])this.a[2]))[3], ((int[])((int[])((Object[])((Object[])this.a[2]))[2]))[3]);
                  }

                  int var23;
                  int var22;
                  int var24;
                  for(int var21 = var20 + ((int[])((int[])var8[1]))[3]; var21 <= var16; var20 += var19) {
                     vt.a(wv.a((byte)-126, (float)((int[])((int[])var8[1]))[4], (Object[])((Object[])var8[4])), (byte)127, (Object[])((Object[])var11[6]), rra.a((Object[])((Object[])var8[4]), (float)((int[])((int[])var8[1]))[3], (byte)-122), 1.0F, 1.0F);
                     var22 = ((int[])((int[])var8[1]))[2] + var1;
                     if(null != var11 && -6 == ~var11.length) {
                        this.a(((float[])((float[])this.a[1]))[2], 1.2703867F, ((float[])((float[])this.a[4]))[7], 0.79630697F, ((float[])((float[])((Object[])((Object[])this.a[12]))[0]))[23], -1.987673F, 115, (Class_s)this.a[0], 20, -14);
                     }

                     var23 = var22 + ((int[])((int[])var8[1]))[4];

                     while(var17 >= var23) {
                        vt.a(2.0F * (float)((int[])((int[])var8[1]))[4] / var12, (byte)1, (Object[])((Object[])var11[4]), 2.0F * (float)((int[])((int[])var8[1]))[3] / var13, 1.0F, 1.0F);
                        ((float[])((float[])((Object[])((Object[])var11[4]))[0]))[12] = 2.0F * (ck.a(87, (Object[])((Object[])var8[0])) + (float)var22) / var12 - 1.0F;
                        ((float[])((float[])((Object[])((Object[])var11[4]))[0]))[13] = (ck.a(87, (Object[])((Object[])var8[0])) + (float)var20) * 2.0F / var13 - 1.0F;
                        ((float[])((float[])((Object[])((Object[])var11[4]))[0]))[14] = -1.0F;
                        var23 += var18;
                        var22 += var18;
                        Class_ss.a(var11, (int)5);
                     }

                     if(var22 < var17) {
                        var24 = -var22 + var17;
                        vt.a(wv.a((byte)-127, (float)var24, (Object[])((Object[])var8[4])), (byte)125, (Object[])((Object[])var11[6]), rra.a((Object[])((Object[])var8[4]), (float)((int[])((int[])var8[1]))[3], (byte)-105), 1.0F, 1.0F);
                        vt.a((float)var24 * 2.0F / var12, (byte)127, (Object[])((Object[])var11[4]), (float)((int[])((int[])var8[1]))[3] * 2.0F / var13, 1.0F, 1.0F);
                        ((float[])((float[])((Object[])((Object[])var11[4]))[0]))[12] = 2.0F * (ck.a(87, (Object[])((Object[])var8[0])) + (float)var22) / var12 - 1.0F;
                        ((float[])((float[])((Object[])((Object[])var11[4]))[0]))[13] = 2.0F * (ck.a(87, (Object[])((Object[])var8[0])) + (float)var20) / var13 - 1.0F;
                        ((float[])((float[])((Object[])((Object[])var11[4]))[0]))[14] = -1.0F;
                        Class_ss.a(var11, (int)5);
                     }

                     var21 += var19;
                  }

                  if(var20 < var16) {
                     var22 = -var20 + var16;
                     vt.a(wv.a((byte)-128, (float)((int[])((int[])var8[1]))[4], (Object[])((Object[])var8[4])), (byte)125, (Object[])((Object[])var11[6]), rra.a((Object[])((Object[])var8[4]), (float)var22, (byte)-112), 1.0F, 1.0F);
                     var23 = ((int[])((int[])var8[1]))[2] + var1;

                     for(var24 = var23 + ((int[])((int[])var8[1]))[4]; var17 >= var24; var24 += var18) {
                        vt.a(2.0F * (float)((int[])((int[])var8[1]))[4] / var12, (byte)-89, (Object[])((Object[])var11[4]), (float)var22 * 2.0F / var13, 1.0F, 1.0F);
                        ((float[])((float[])((Object[])((Object[])var11[4]))[0]))[12] = -1.0F + (ck.a(87, (Object[])((Object[])var8[0])) + (float)var23) * 2.0F / var12;
                        ((float[])((float[])((Object[])((Object[])var11[4]))[0]))[13] = ((float)var20 + ck.a(87, (Object[])((Object[])var8[0]))) * 2.0F / var13 - 1.0F;
                        ((float[])((float[])((Object[])((Object[])var11[4]))[0]))[14] = -1.0F;
                        Class_ss.a(var11, (int)5);
                        var23 += var18;
                     }

                     if(var23 < var17) {
                        int var25 = -var23 + var17;
                        vt.a(wv.a((byte)-128, (float)var25, (Object[])((Object[])var8[4])), (byte)-29, (Object[])((Object[])var11[6]), rra.a((Object[])((Object[])var8[4]), (float)var22, (byte)-101), 1.0F, 1.0F);
                        vt.a((float)var25 * 2.0F / var12, (byte)127, (Object[])((Object[])var11[4]), (float)var22 * 2.0F / var13, 1.0F, 1.0F);
                        ((float[])((float[])((Object[])((Object[])var11[4]))[0]))[12] = -1.0F + (ck.a(87, (Object[])((Object[])var8[0])) + (float)var23) * 2.0F / var12;
                        ((float[])((float[])((Object[])((Object[])var11[4]))[0]))[13] = ((float)var20 + ck.a(87, (Object[])((Object[])var8[0]))) * 2.0F / var13 - 1.0F;
                        ((float[])((float[])((Object[])((Object[])var11[4]))[0]))[14] = -1.0F;
                        Class_ss.a(var11, (int)5);
                     }

                     if(var8 != null && (-6 == ~var8.length && var8[2].equals(Integer.valueOf(2)) || var8.length == 5)) {
                        this.f();
                     }
                  }
               }
            } else {
               if(var11 != null && (14 == var11.length || -9 == ~var11.length)) {
                  this.g();
               }

               var16 = var4 + var2;
               var17 = jt.a((byte)59, var8);
               vt.a(wv.a((byte)-128, (float)var3, (Object[])((Object[])var8[4])), (byte)126, (Object[])((Object[])var11[6]), rra.a((Object[])((Object[])var8[4]), (float)((int[])((int[])var8[1]))[3], (byte)-109), 1.0F, 1.0F);
               var18 = ((int[])((int[])var8[1]))[0] + var2;

               for(var19 = ((int[])((int[])var8[1]))[3] + var18; var19 <= var16; var18 += var17) {
                  vt.a((float)var3 * 2.0F / var12, (byte)126, (Object[])((Object[])var11[4]), 2.0F * (float)((int[])((int[])var8[1]))[3] / var13, 1.0F, 1.0F);
                  ((float[])((float[])((Object[])((Object[])var11[4]))[0]))[12] = ((float)var1 + ck.a(87, (Object[])((Object[])var8[0]))) * 2.0F / var12 - 1.0F;
                  ((float[])((float[])((Object[])((Object[])var11[4]))[0]))[13] = -1.0F + ((float)var18 + ck.a(87, (Object[])((Object[])var8[0]))) * 2.0F / var13;
                  ((float[])((float[])((Object[])((Object[])var11[4]))[0]))[14] = -1.0F;
                  Class_ss.a(var11, (int)5);
                  var19 += var17;
               }

               if(var18 < var16) {
                  var20 = var16 + -var18;
                  vt.a(wv.a((byte)-126, (float)var3, (Object[])((Object[])var8[4])), (byte)-57, (Object[])((Object[])var11[6]), rra.a((Object[])((Object[])var8[4]), (float)var20, (byte)-78), 1.0F, 1.0F);
                  vt.a((float)var3 * 2.0F / var12, (byte)125, (Object[])((Object[])var11[4]), 2.0F * (float)var20 / var13, 1.0F, 1.0F);
                  ((float[])((float[])((Object[])((Object[])var11[4]))[0]))[12] = 2.0F * (ck.a(87, (Object[])((Object[])var8[0])) + (float)var1) / var12 - 1.0F;
                  ((float[])((float[])((Object[])((Object[])var11[4]))[0]))[13] = (ck.a(87, (Object[])((Object[])var8[0])) + (float)var18) * 2.0F / var13 - 1.0F;
                  ((float[])((float[])((Object[])((Object[])var11[4]))[0]))[14] = -1.0F;
                  Class_ss.a(var11, (int)5);
               }
            }
         }

      }
   }

   static final int a(Object[] var0, int var1, int var2) {
      ++q;
      return se.a((Object[])((Object[])var0[0]), (byte)-122)?3:(fpa.a((int)0, (Object[])((Object[])((Object[])((Object[])var0[0]))[24])) != 0?(var2 >= -36?((int[])((int[])((Object[])((Object[])var0[0]))[32]))[12]:1):3);
   }

   final int d() {
      ++r;
      return jt.a((byte)100, this.a);
   }

   final void a(int var1, int var2, int var3, int var4, int var5) {
      ++j;
      eo.a(var1, this.a, var5, 1, var3, var4, var2);
   }

   final void a(int var1, int var2, int var3) {
      ++x;
      Object[] var4 = this.a;
      Object[] var5;
      int[] var6 = ((ta)((var5 = (Object[])((Object[])var4[0])) != null?var5[38]:null)).Y(var1, var2, ((int[])((int[])var4[1]))[4], ((int[])((int[])var4[1]))[3]);
      if(null == var4 || -12 != ~var4.length || !var4[0].equals(Integer.valueOf(0))) {
         int[] var7 = new int[((int[])((int[])var4[1]))[3] * ((int[])((int[])var4[1]))[4]];
         Object[] var8 = (Object[])((Object[])var4[4]);
         int var9 = ((int[])((int[])var4[1]))[4];
         int var10 = ((int[])((int[])var4[1]))[3];
         int var12;
         if(null != var8 && 8 == var8.length) {
            ah.a(var7, var10, var8, 0, 0, 0, var9, 0);
         } else if(var8 != null && 11 == var8.length) {
            if(var4 != null && var4.length == 7) {
               this.d();
            }

            int[] var11 = new int[((int[])((int[])var8[1]))[3] * ((int[])((int[])var8[1]))[4]];
            ah.a((Object[])((Object[])var8[5]), var8, (byte)105);
            OpenGL.glGetTexImagei(((int[])((int[])var8[1]))[2], 0, '\u80e1', 5121, var11, 0);

            for(var12 = 0; var12 < var10; ++var12) {
               System.arraycopy(var11, ((int[])((int[])var8[1]))[4] * (-var12 + -1 + var10), var7, 0 + var12 * var9, var9);
            }
         } else if(var8 != null && var8.length == 15) {
            kk.a(var10, var8, 0, var9, (byte)-51, 0, 0, var7);
         } else {
            if(null == var8 || -11 != ~var8.length && 15 != var8.length) {
               throw new IllegalStateException();
            }

            nk.a(var10, 0, var7, var8, var9, 0, 0, 15);
         }

         int var13;
         int var15;
         if(0 == var3) {
            if(null != var8 && (var8.length == 3 && var8[0].equals(Boolean.valueOf(false)) || -2 == ~var8.length)) {
               return;
            }

            for(var15 = 0; var15 < ((int[])((int[])var4[1]))[3]; ++var15) {
               var12 = var15 * ((int[])((int[])var4[1]))[4];
               if(var4 != null && (var4.length == 17 && var4[0].equals(Boolean.valueOf(false)) || -2 == ~var4.length && var4[0].equals(Integer.valueOf(2)))) {
                  this.a((int[])((int[])this.a[14]));
               }

               for(var13 = 0; ((int[])((int[])var4[1]))[4] > var13; ++var13) {
                  var7[var12 + var13] = (922681344 & var6[var12 + var13]) << 8 | 16777215 & var7[var13 + var12];
               }
            }
         } else if(var3 == 1) {
            for(var15 = 0; var15 < ((int[])((int[])var4[1]))[3]; ++var15) {
               var12 = var15 * ((int[])((int[])var4[1]))[4];
               if(var4 != null && 2 == var4.length && var4[0].equals(Integer.valueOf(0)) && var4[0].equals(Integer.valueOf(1))) {
                  this.a(((int[])((int[])this.a[2]))[7], 29, -127, ((int[])((int[])((Object[])((Object[])this.a[4]))[10]))[0], -12, 98, ((int[])((int[])this.a[16]))[1]);
               }

               for(var13 = 0; ~var13 > ~((int[])((int[])var4[1]))[4]; ++var13) {
                  var7[var12 + var13] = var7[var13 + var12] & 16777215 | var6[var12 + var13] << 16 & -16757258;
               }
            }
         } else if(var3 != 2) {
            if(3 == var3) {
               for(var15 = 0; ((int[])((int[])var4[1]))[3] > var15; ++var15) {
                  var12 = var15 * ((int[])((int[])var4[1]))[4];

                  for(var13 = 0; ~var13 > ~((int[])((int[])var4[1]))[4]; ++var13) {
                     var7[var12 + var13] = (var6[var13 + var12] == 0?0:-16777216) | var7[var12 + var13] & 16777215;
                  }
               }

               if(null != var4 && (-9 == ~var4.length || 8 == var4.length && var4[3].equals(Integer.valueOf(2)) || -38 == ~var4.length)) {
                  this.h();
               }
            }
         } else {
            for(var15 = 0; ~var15 > ~((int[])((int[])var4[1]))[3]; ++var15) {
               var12 = ((int[])((int[])var4[1]))[4] * var15;
               if(null != var8 && (-13 == ~var8.length || -18 == ~var8.length)) {
                  this.e();
               }

               for(var13 = 0; ((int[])((int[])var4[1]))[4] > var13; ++var13) {
                  var7[var13 + var12] = -6341915 & var6[var13 + var12] << 24 | 16777215 & var7[var12 + var13];
               }
            }

            if(null != var4 && -13 == ~var4.length) {
               this.e();
            }
         }

         var15 = ((int[])((int[])var4[1]))[4];
         var12 = ((int[])((int[])var4[1]))[3];
         var13 = ((int[])((int[])var4[1]))[4];
         lma.a((Object[])((Object[])var4[4]), (byte)-83, 0, 0, var15, 0, var7, var13, var12);
      }
   }

   final void a(int var1, int var2, int var3, int var4) {
      ++b;
      Object[] var5 = this.a;
      ((int[])((int[])var5[1]))[2] = var1;
      ((int[])((int[])var5[1]))[5] = var3;
      ((int[])((int[])var5[1]))[0] = var2;
      ((int[])((int[])var5[1]))[1] = var4;
      ((boolean[])((boolean[])var5[5]))[2] = ((int[])((int[])var5[1]))[2] != 0 || 0 != ((int[])((int[])var5[1]))[0] || ((int[])((int[])var5[1]))[5] != 0 || ((int[])((int[])var5[1]))[1] != 0;
   }

   static final void a(int var0, Object[] var1, boolean var2, int var3, int var4, int var5) {
      ++s;
      if(!var2) {
         Object[] var6 = (Object[])((Object[])var1[34]);
         if(null != var6[7] && !kj.a(24510, (Object[])((Object[])var6[3]))) {
            if(~var5 != ~((int[])((int[])var6[1]))[1] || var4 != ((int[])((int[])var6[1]))[4]) {
               ((int[])((int[])var6[1]))[4] = var4;
               ((int[])((int[])var6[1]))[1] = var5;

               for(lm var11 = dda.a((Object[])((Object[])var6[3]), 2); var11 != ((Object[])((Object[])var6[3]))[0]; var11 = var11.f) {
                  ica var7;
                  Object[] var12 = (var7 = (ica)var11) == null?null:var7.m;
                  int var13 = ((int[])((int[])var6[1]))[1];
                  int var14 = ((int[])((int[])var6[1]))[4];
                  if(null == var12) {
                     throw new IllegalStateException();
                  }

                  ((int[])((int[])var12[4]))[0] = var14;
                  ((int[])((int[])var12[4]))[1] = var13;
                  int var15 = uma.a(-32125, ((int[])((int[])var12[4]))[1]);
                  int var16 = uma.a(-32125, ((int[])((int[])var12[4]))[0]);
                  if(((int[])((int[])var12[4]))[2] != var15 || ((int[])((int[])var12[4]))[3] != var16) {
                     int var17;
                     if(null != var12[7]) {
                        for(var17 = 0; ((Object[])((Object[])var12[7])).length > var17; ++var17) {
                           kla.a((byte)-58, ((Object[][])((Object[][])var12[7]))[var17]);
                        }

                        var12[7] = null;
                     }

                     if(256 >= var15 && var16 <= 256) {
                        var12[8] = null;
                     } else {
                        var17 = var15;
                        int var18 = var16;
                        if(null != var6 && (5 == var6.length || 1 == var6.length && var6[0].equals(Integer.valueOf(2)) && var6[0].equals(Boolean.valueOf(false)))) {
                           mra.b(13, (Object[])null);
                        }

                        int var19 = 0;

                        while(256 < var17 || 256 < var18) {
                           ++var19;
                           if(256 < var17) {
                              var17 >>= 1;
                           }

                           if(256 < var18) {
                              var18 >>= 1;
                           }
                        }

                        if(null == var12[8]) {
                           var12[8] = el.a(true, (Object[])((Object[])var12[1]), new Object[5]);
                        }

                        var12[7] = new Object[var19][];
                        var18 = var16;
                        var17 = var15;
                        var19 = 0;

                        while(256 < var17 || var18 > 256) {
                           ((Object[][])((Object[][])var12[7]))[var19++] = kaa.a(3553, var17, ah.f, new Object[6], var18, vk.f_i, (Object[])((Object[])var12[1]), 2);
                           if(256 < var17) {
                              var17 >>= 1;
                           }

                           if(var18 > 256) {
                              var18 >>= 1;
                           }
                        }
                     }

                     ((int[])((int[])var12[4]))[3] = var16;
                     ((int[])((int[])var12[4]))[2] = var15;
                  }
               }

               ((boolean[])((boolean[])var6[0]))[1] = true;
               ((boolean[])((boolean[])var6[0]))[4] = true;
               if(null != var1 && 1 == var1.length && var1[0].equals(Integer.valueOf(1)) && var1[0].equals(Integer.valueOf(0))) {
                  jma.a(122, false, (Object[])null);
               }

               ((boolean[])((boolean[])var6[0]))[0] = true;
            }

            if(dna.a((int)0, var6)) {
               ((boolean[])((boolean[])var6[0]))[5] = true;
               ((int[])((int[])var6[1]))[0] = var3;
               ((int[])((int[])var6[1]))[3] = var0;
               Object[] var8;
               be.a(((int[])((int[])var6[1]))[4] + (((int[])((int[])var6[1]))[0] - ((ta)((var8 = (Object[])((Object[])var6[11])) == null?null:var8[55])).e(30626).d()), (Object[])((Object[])var6[11]), 22927, -((int[])((int[])var6[1]))[3]);
               Object[] var9;
               Object[] var10;
               ((ta)((var9 = (Object[])((Object[])var6[11])) == null?null:var9[55])).a((hsa)(null == (var10 = (Object[])((Object[])var6[7]))?null:var10[3]), 59);
               rv.a(3, 0, 128, (Object[])((Object[])var6[11]));
               Class_ds.a(var2, 0, (Object[])((Object[])var6[7]));
            }
         }

      }
   }

   final int e() {
      ++o;
      return fi.a((byte)113, this.a);
   }

   final void a(int[] var1) {
      ++m;
      Object[] var2 = this.a;
      var1[2] = ((int[])((int[])var2[1]))[5];
      var1[1] = ((int[])((int[])var2[1]))[0];
      var1[0] = ((int[])((int[])var2[1]))[2];
      var1[3] = ((int[])((int[])var2[1]))[1];
   }

   static final void a(float var0, float var1, float var2, float var3, byte var4, float var5, float var6, Object[] var7, float var8, float var9, float var10) {
      ++f_l;
      ((float[])((float[])var7[0]))[0] = var9;
      ((float[])((float[])var7[0]))[8] = 0.0F;
      ((float[])((float[])var7[0]))[3] = var2;
      ((float[])((float[])var7[0]))[5] = var6;
      ((float[])((float[])var7[0]))[6] = var8;
      ((float[])((float[])var7[0]))[10] = var3;
      if(null == var7 || var7.length != 10) {
         ((float[])((float[])var7[0]))[1] = 0.0F;
         ((float[])((float[])var7[0]))[2] = var1;
         ((float[])((float[])var7[0]))[11] = var5;
         int var11 = 108 / ((-60 - var4) / 60);
         ((float[])((float[])var7[0]))[7] = 0.0F;
         ((float[])((float[])var7[0]))[9] = var10;
         ((float[])((float[])var7[0]))[4] = var0;
      }
   }

   static final void b(int var0, Object[] var1) {
      ((int[])((int[])var1[1]))[1] = -1;
      if(var0 <= -7) {
         ++k;
      }
   }

   static final long a(Object[] var0, byte var1) {
      ++w;
      return var1 != 89?-63L:((rqa)var0[0]).a.b();
   }

   static final void a(int var0, byte[] var1, byte var2, int var3, Object[] var4) {
      if(var2 < 37) {
         a((Object[])((Object[])var4[11]), ((boolean[])((boolean[])var4[2]))[0]);
      }

      ((rqa)var4[0]).a(var1, var3);
      ++f_i;
   }

   final int f() {
      ++f;
      return ob.a(this.a, -122);
   }

   final void a(int var1, int var2, Class_s var3, int var4, int var5) {
      ++d;
      ki.a(var5, (byte)97, this.a, var3, var4, var2, var1);
   }

   cma(Object[] var1) {
      this.a = var1;
   }

   final void a(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10) {
      gca.a(var4, var9, var1, var8, var6, var3, this.a, (byte)-64, var2, var5, var10, var7);
      ++u;
   }

   static final void a(int var0, Object[] var1) {
      ++h;
      if(var0 > ~((int[])((int[])var1[1]))[0]) {
         int[] var2 = new int[]{((int[])((int[])var1[1]))[0]};
         OpenGL.glDeleteRenderbuffersEXT(1, var2, 0);
         ((int[])((int[])var1[1]))[0] = 0;
      }

   }

   final void a(float var1, float var2, float var3, float var4, float var5, float var6, int var7, Class_s var8, int var9, int var10) {
      Object[] var11;
      Object[] var15;
      float var17;
      float var16;
      label41: {
         ++e;
         var11 = this.a;
         el.a(125, (Object[])((Object[])var11[0]));
         var15 = (Object[])((Object[])((Object[])((Object[])var11[0]))[10]);
         var15[8] = var11[4];
         sca.a(1, var15, -1, 16);
         Object[] var12;
         var16 = (float)((ta)((var12 = (Object[])((Object[])var11[0])) == null?null:var12[38])).e(30626).e();
         Object[] var13;
         var17 = (float)((ta)(null == (var13 = (Object[])((Object[])var11[0]))?null:var13[38])).e(30626).d();
         Class_ds.a((Object[])((Object[])var15[4]), (byte)115);
         if(((boolean[])((boolean[])var11[5]))[2]) {
            float var18 = (float)((int[])((int[])var11[1]))[4] / (float)ob.a(var11, -92);
            float var19 = (float)((int[])((int[])var11[1]))[3] / (float)jt.a((byte)112, var11);
            ((float[])((float[])((Object[])((Object[])var15[4]))[0]))[5] = var19 * (-var2 + var6);
            ((float[])((float[])((Object[])((Object[])var15[4]))[0]))[1] = var18 * (var4 - var2);
            ((float[])((float[])((Object[])((Object[])var15[4]))[0]))[0] = var18 * (-var1 + var3);
            ((float[])((float[])((Object[])((Object[])var15[4]))[0]))[4] = var19 * (var5 - var1);
            ((float[])((float[])((Object[])((Object[])var15[4]))[0]))[12] = (var1 + (float)((int[])((int[])var11[1]))[2]) * var18 + ck.a(87, (Object[])((Object[])var11[0]));
            ((float[])((float[])((Object[])((Object[])var15[4]))[0]))[13] = var19 * ((float)((int[])((int[])var11[1]))[0] + var2) + ck.a(87, (Object[])((Object[])var11[0]));
            if(client.f_vb == 0) {
               break label41;
            }
         }

         ((float[])((float[])((Object[])((Object[])var15[4]))[0]))[0] = var3 - var1;
         ((float[])((float[])((Object[])((Object[])var15[4]))[0]))[1] = var4 - var2;
         ((float[])((float[])((Object[])((Object[])var15[4]))[0]))[4] = -var1 + var5;
         ((float[])((float[])((Object[])((Object[])var15[4]))[0]))[5] = -var2 + var6;
         ((float[])((float[])((Object[])((Object[])var15[4]))[0]))[12] = ck.a(87, (Object[])((Object[])var11[0])) + var1;
         ((float[])((float[])((Object[])((Object[])var15[4]))[0]))[13] = var2 + ck.a(87, (Object[])((Object[])var11[0]));
      }

      Object[] var21 = (Object[])((Object[])((Object[])((Object[])var11[0]))[42]);
      Class_ds.a(var21, (byte)98);
      ((float[])((float[])var21[0]))[12] = -1.0F;
      ((float[])((float[])var21[0]))[5] = 2.0F / var17;
      ((float[])((float[])var21[0]))[14] = -1.0F;
      ((float[])((float[])var21[0]))[0] = 2.0F / var16;
      ((float[])((float[])var21[0]))[13] = -1.0F;
      vta.a(var21, (Object[])((Object[])var15[4]), 102);
      vt.a(wv.a((byte)-127, (float)((int[])((int[])var11[1]))[4], (Object[])((Object[])var11[4])), (byte)127, (Object[])((Object[])var15[6]), rra.a((Object[])((Object[])var11[4]), (float)((int[])((int[])var11[1]))[3], (byte)-116), 1.0F, 1.0F);
      var15[2] = ((Object[])((Object[])var11[0]))[17];
      ((int[])((int[])var15[1]))[0] = 0;
      var15[3] = ((Object[])((Object[])var11[0]))[23];
      fg var14;
      Object[] var20 = (Object[])((Object[])(null != (var14 = (fg)var8)?var14.m:null)[0]);
      var15[7] = var20;
      Class_ds.a((Object[])((Object[])var15[5]), (byte)111);
      ((float[])((float[])((Object[])((Object[])var15[5]))[0]))[0] = (var3 - var1) * wv.a((byte)-126, 1.0F, var20);
      ((float[])((float[])((Object[])((Object[])var15[5]))[0]))[1] = (-var2 + var4) * wv.a((byte)-128, 1.0F, var20);
      ((float[])((float[])((Object[])((Object[])var15[5]))[0]))[4] = (var5 - var1) * rra.a(var20, 1.0F, (byte)-59);
      if(null == var11 || var11.length != 5 && (-12 != ~var11.length || !var11[1].equals(Integer.valueOf(2)))) {
         ((float[])((float[])((Object[])((Object[])var15[5]))[0]))[5] = rra.a(var20, 1.0F, (byte)-95) * (-var2 + var6);
         ((float[])((float[])((Object[])((Object[])var15[5]))[0]))[12] = wv.a((byte)-126, 1.0F, var20) * (var1 - (float)var9);
         ((float[])((float[])((Object[])((Object[])var15[5]))[0]))[13] = rra.a(var20, 1.0F, (byte)-83) * ((float)(-var10) + var2);
         Class_a.a((byte)114, var15);
      }
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      jo.a(var1, -4, var5, var6, this.a, var4, var3, var2);
      ++y;
   }

   static final void a(Object[] var0, boolean var1) {
      if(var0[1] == null) {
         var0[1] = new boolean[1];
      }

      ++n;
      if(var1) {
         t = (Object[])((Object[])((Object[])((Object[])((Object[])((Object[])var0[8]))[2]))[6]);
      }

   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      qaa.a(var1, this.a, var8, var3, var2, var6, var4, var7, var5, 0);
      ++p;
   }

   final re h() {
      ++v;
      Object[] var2 = this.a;
      re var1 = (re)var2[3];
      return var1;
   }

   final int g() {
      ++c;
      return ro.a((byte)-115, this.a);
   }

}
