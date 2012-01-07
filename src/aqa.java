import jagdx.IDirect3DDevice;
import jaggl.OpenGL;
import java.util.Vector;

final class aqa {

   static int k;
   static int f_i;
   static int h;
   static int c;
   static int b;
   static int j;
   static int g;
   static int f;
   static int a;
   static Object[] m = sd.a(new Object[1], 62, (byte)111);
   static Object[] e = sd.a(new Object[1], 15, (byte)122);
   static int[] f_l;
   static Object[] d;
   static int[] n;


   static final void b(Object[] var0, int var1) {
      ++b;
      ((int[])((int[])var0[1]))[1] = 8 * ((int[])((int[])var0[1]))[0];
      if(var1 != -22852) {
         m = (Object[])((Object[])m[11]);
      }

   }

   static final void a(Object[] var0, boolean var1) {
      var0[56] = new Object[((int[])((int[])var0[1]))[8]][];
      var0[64] = new Object[((int[])((int[])var0[1]))[8]][];
      var0[22] = new Object[((int[])((int[])var0[1]))[8]][];
      var0[59] = new Object[((int[])((int[])var0[1]))[8]][];
      ++c;
      var0[67] = new Object[((int[])((int[])var0[1]))[8]][];

      for(int var3 = 0; var3 < ((int[])((int[])var0[1]))[8]; ++var3) {
         ((Object[][])((Object[][])var0[22]))[var3] = Class_t.c;
         ((Object[][])((Object[][])var0[56]))[var3] = Class_t.c;
         ((Object[][])((Object[][])var0[64]))[var3] = eb.m;
         ((Object[][])((Object[][])var0[59]))[var3] = ab.a(new Object[2], (byte)-73);
      }

      var0[30] = new Object[((int[])((int[])var0[1]))[12] - 2][];
      int[] var19 = new int[]{-1};
      if(null != var0 && var0.length == 10) {
         ((boolean[])((boolean[])ota.z[7]))[8] = true;
      }

      var0[37] = fg.a(var19, var0, 35, false, 1, 1, 0, 0);
      Object[] var2;
      hp.a((za)(null != (var2 = sha.a(new Object[2], (int)1, 262144))?var2[1]:null), var1, var0);
      var0[41] = ao.a(new Object[][]{vg.a((byte)15, new Object[2], new Object[][]{eba.a, eba.e})}, var0, false);
      ao.a(new Object[][]{vg.a((byte)15, new Object[2], new Object[][]{eba.a, eba.d})}, var0, var1);
      var0[54] = ao.a(new Object[][]{sv.a(31675, new Object[2], eba.a), sv.a(31675, new Object[2], eba.d), sv.a(31675, new Object[2], eba.e), sv.a(31675, new Object[2], eba.h)}, var0, false);
      var0[21] = ao.a(new Object[][]{sv.a(31675, new Object[2], eba.a), sv.a(31675, new Object[2], eba.d), sv.a(31675, new Object[2], eba.e)}, var0, var1);

      for(int var4 = 0; var4 < 7; ++var4) {
         ((hu[])((hu[])var0[11]))[var4] = new hu(var0, 0, 0, false, false);
         ((hu[])((hu[])var0[44]))[var4] = new hu(var0, 0, 0, true, true);
      }

      Object[] var6 = new Object[7];
      if(var6[0] == null) {
         var6[0] = new boolean[1];
      }

      jv.a((int)89, var6);
      var6[5] = var0;
      ((boolean[])((boolean[])var6[0]))[0] = ((boolean[])((boolean[])((Object[])((Object[])var6[5]))[63]))[17];
      Object[] var9;
      Object[] var10;
      if(((boolean[])((boolean[])var6[0]))[0]) {
         Object[] var8 = (Object[])((Object[])var6[5]);
         var9 = lna.f;
         var10 = vk.f;
         boolean var7;
         if(var8 != null && -88 == ~var8.length) {
            var7 = InputStreamWorker.a(var9, var8, var10, -27840);
         } else {
            if(null == var8 || -92 != ~var8.length) {
               throw new IllegalStateException();
            }

            var7 = jba.a(var10, (byte)66, var8, var9);
         }

         if(!var7) {
            ((boolean[])((boolean[])var6[0]))[0] = false;
         }
      }

      Object[] var5;
      int var21;
      if(!((boolean[])((boolean[])var6[0]))[0] && !oa.a((Object[])((Object[])var6[5]), vk.f, (byte)-127, lna.f)) {
         var5 = var6;
      } else {
         kpa.a(16);
         var5 = var6;
         if(((boolean[])((boolean[])var6[0]))[0]) {
            byte[] var20 = ad.a(false, mda.g, -115);
            var6[6] = jga.a(128, var20, 128, 16, lna.f, 10206, (Object[])((Object[])var6[5]), true);
            var20 = ad.a(false, kia.h, -112);
            var6[3] = jga.a(128, var20, 128, 16, lna.f, 10206, (Object[])((Object[])var6[5]), true);
         } else {
            var6[4] = new Object[16][];
            if(null != var0 && var0.length == 6 && var0[1].equals(Integer.valueOf(0))) {
               ela.a(1, (Object[])((Object[])((Object[])((Object[])((Object[])((Object[])ota.z[4]))[4]))[2]));
            }

            byte[] var22;
            for(var21 = 0; var21 < 16; ++var21) {
               var22 = qn.a(0, mda.g, 128 * 128 * var21 * 2, '\u8000');
               ((Object[][])((Object[][])var6[4]))[var21] = vh.a(-121, true, (Object[])((Object[])var6[5]), lna.f, var22, 128, 128);
            }

            var6[1] = new Object[16][];

            for(var21 = 0; 16 > var21; ++var21) {
               var22 = qn.a(0, kia.h, 2 * 128 * var21 * 128, '\u8000');
               ((Object[][])((Object[][])var6[1]))[var21] = vh.a(-127, true, (Object[])((Object[])var6[5]), lna.f, var22, 128, 128);
            }
         }
      }

      ((boolean[])((boolean[])var0[63]))[16] = false;
      var0[31] = var5;

      try {
         var0[58] = tpa.a(var0, (byte)-57, new Object[39]);
         var9 = new Object[21];
         Class_ds.a(!var1, var9, var0);
         var9[16] = kja.a(1.0F, 1.0F, 1.0F, new Object[2], 12, 1.0F);
         var9[14] = kja.a(0.0F, 0.0F, 0.0F, new Object[2], 12, 0.0F);
         uj.a(29207, var9);
         if(var0 != null && 7 == var0.length) {
            ((byte[])((byte[])ota.z[5]))[1] = 94;
         }

         var0[10] = var9;
         var0[40] = ola.a(new Object[10], (byte)122, var0);
         var0[27] = hq.a(new Object[47], var0, (Object[])((Object[])var0[31]), true, true);
         Object[] var12 = new Object[36];
         Object[] var13 = (Object[])((Object[])var0[31]);
         fra.a((byte)6, var12);
         sla.a(var12, true, var0);
         var12[28] = ab.a(new Object[2], (byte)-49);
         var12[27] = ab.a(new Object[2], (byte)-115);
         var12[30] = new float[4];
         var12[34] = new float[4];
         var12[25] = var13;
         Object[] var15 = (Object[])((Object[])var12[25]);
         boolean var14 = !((boolean[])((boolean[])var15[0]))[0]?var15[4] != null:null != var15[6];
         if(var14) {
            boolean var16;
            if(null != var0 && var0.length == 87) {
               var16 = ida.a(var0, (int)23201);
            } else {
               if(var0 == null || var0.length != 91) {
                  throw new IllegalStateException();
               }

               boolean var17 = ((boolean[])((boolean[])var0[63]))[26];
               var16 = var17;
            }

            if(var16) {
               ji.a(true, "Waterfall", var12);
            }
         }

         var0[55] = var12;
      } catch (oqa var18) {
         var18.printStackTrace();
         var0[58] = usa.a(new Object[17], var0, (byte)-93);
         var0[10] = bva.a(new Object[9], -7818, var0);
         var0[40] = bga.a(new Object[5], var0, -117);
         var0[27] = null;
         var0[55] = null;
         ((boolean[])((boolean[])var0[63]))[16] = true;
      }

      int var23;
      if(((ta)var0[38]).E != null) {
         var21 = ((ta)var0[38]).E.e();
         var23 = ((ta)var0[38]).E.d();
      } else {
         var21 = 0;
         var23 = 0;
      }

      var0[4] = oma.a(var0, var23, var21, new Object[15], (byte)113);
      if(null != var6 && (var6.length == 1 && var6[0].equals(Boolean.valueOf(false)) || 4 == var6.length)) {
         ((long[])((long[])ota.z[5]))[3] = ((long[])((long[])((Object[])((Object[])ota.z[4]))[4]))[0];
      }

      int var11;
      if(!((boolean[])((boolean[])var0[63]))[16]) {
         ((Object[][])((Object[][])var0[12]))[1] = pe.a(-85, new Object[14], var0);
         var9 = (Object[])((Object[])var0[4]);
         var10 = ((Object[][])((Object[][])var0[12]))[1];
         var11 = ((Vector)var9[14]).size();
         if(!pda.b(-110, var10) && !bc.a(var10, (byte)74)) {
            if(null == var10) {
               throw new IllegalStateException();
            }

            ((boolean[])((boolean[])var10[1]))[0] = false;
            ((Vector)var9[14]).removeElement(var10);
         } else {
            ((Vector)var9[14]).insertElementAt(var10, var11);
            mia.a(var10, ((int[])((int[])var9[1]))[0], ((int[])((int[])var9[1]))[2], -74);
            int var26;
            if(null == var10) {
               var26 = ho.a(var10, (byte)117);
            } else {
               byte var27 = 1;
               var26 = var27;
            }

            ((boolean[])((boolean[])var10[1]))[0] = true;
            if(((int[])((int[])var9[1]))[1] < var26) {
               ((int[])((int[])var9[1]))[1] = var26;
            }
         }
      }

      if(null != var0[70]) {
         kpa.a((byte)-112, (Object[])((Object[])var0[70]));
         var0[70] = null;
      }

      if(null != var0 && var0.length == 87) {
         fea.a(var0, (byte)83);
      } else {
         ml.a((byte)94, var0);
      }

      var0[71] = rta.a((byte)-25, var0, true);
      rq.a((byte)47, var0);
      ((ta)var0[38]).f();
      loa.a((byte)-120, var0);
      ((ta)var0[38]).B();
      var6 = new Object[6];
      Object[] var24 = (Object[])((Object[])var0[37]);
      int var25 = il.c((byte)-108, var24);
      var11 = cua.a(true, var24);
      aa.a(var6, 1);
      lga.a((byte)37, var6);
      if(null == var24 || -2 != ~var24.length || !var24[0].equals(Boolean.valueOf(false))) {
         var6[2] = rca.a(var6, (byte)113);
         var6[4] = var24;
         ((int[])((int[])var6[1]))[3] = var11;
         ((int[])((int[])var6[1]))[4] = var25;
         var6[0] = var0;
         var6[3] = null;
         ((boolean[])((boolean[])var6[5]))[1] = ~var25 != ~il.c((byte)-92, (Object[])((Object[])var6[4]));
         ((boolean[])((boolean[])var6[5]))[4] = cua.a(true, (Object[])((Object[])var6[4])) != var11;
         ((boolean[])((boolean[])var6[5]))[0] = !((boolean[])((boolean[])var6[5]))[1] && Class_i.a((int)117, (Object[])((Object[])var6[4]));
         ((boolean[])((boolean[])var6[5]))[3] = !((boolean[])((boolean[])var6[5]))[4] && Class_i.a((int)85, (Object[])((Object[])var6[4]));
         ul.a((Object[])((Object[])var6[0]), 12, -99);
         var0[65] = var6;
         ((ta)var0[38]).Z(3, 0);
      }
   }

   static final void a(boolean var0, Object[] var1, Object[] var2) {
      ((float[])((float[])var2[0]))[8] = ((float[])((float[])var1[0]))[6];
      ((float[])((float[])var2[0]))[6] = ((float[])((float[])var1[0]))[2];
      ((float[])((float[])var2[0]))[10] = ((float[])((float[])var1[0]))[4];
      ((float[])((float[])var2[0]))[1] = ((float[])((float[])var1[0]))[5];
      ((float[])((float[])var2[0]))[2] = ((float[])((float[])var1[0]))[9];
      ((float[])((float[])var2[0]))[9] = ((float[])((float[])var1[0]))[11];
      ((float[])((float[])var2[0]))[7] = 0.0F;
      ((float[])((float[])var2[0]))[12] = ((float[])((float[])var1[0]))[8];
      ++g;
      ((float[])((float[])var2[0]))[13] = ((float[])((float[])var1[0]))[1];
      ((float[])((float[])var2[0]))[3] = 0.0F;
      ((float[])((float[])var2[0]))[5] = ((float[])((float[])var1[0]))[3];
      ((float[])((float[])var2[0]))[4] = ((float[])((float[])var1[0]))[0];
      ((float[])((float[])var2[0]))[11] = 0.0F;
      ((float[])((float[])var2[0]))[0] = ((float[])((float[])var1[0]))[10];
      ((float[])((float[])var2[0]))[14] = ((float[])((float[])var1[0]))[7];
      if(null != var2 && var2.length == 7) {
         kc.a(0, (float[])null, (Object[])null);
      }

      ((float[])((float[])var2[0]))[15] = 1.0F;
      if(!var0) {
         f_l = (int[])((int[])var2[10]);
      }

   }

   static final Object[] a(int var0, byte var1, Object[] var2, Object[] var3, int var4, Object[] var5, Object[] var6, int var7) {
      ++h;
      int var8 = -34 % ((-78 - var1) / 45);
      if(null == var6[1]) {
         var6[1] = new int[4];
      }

      var6[4] = ne.a(14938, var6);
      ((int[])((int[])var6[1]))[0] = var0;
      ((int[])((int[])var6[1]))[3] = var4;
      var6[3] = var5;
      if(null != var5 && var5.length == 31) {
         return null;
      } else {
         var6[2] = var2;
         var6[0] = var3;
         OpenGL.glGenRenderbuffersEXT(1, tda.o, 0);
         ((int[])((int[])var6[1]))[1] = tda.o[0];
         OpenGL.glBindRenderbufferEXT('\u8d41', ((int[])((int[])var6[1]))[1]);
         OpenGL.glRenderbufferStorageMultisampleEXT('\u8d41', var7, bu.a(55, (Object[])((Object[])var6[0]), (Object[])((Object[])var6[2])), ((int[])((int[])var6[1]))[3], ((int[])((int[])var6[1]))[0]);
         ((int[])((int[])var6[1]))[2] = ((int[])((int[])((Object[])((Object[])var6[0]))[0]))[1] * ((int[])((int[])var6[1]))[0] * ((int[])((int[])var6[1]))[3] * ((int[])((int[])((Object[])((Object[])var6[2]))[0]))[0];
         return var6;
      }
   }

   static final Object[] a(Object[] var0, Object[] var1, Object[] var2, int var3, int var4) {
      ++j;
      if(var3 != 3) {
         return new Object[3];
      } else {
         var2[0] = sj.a(64, new Object[3], (byte)-121);
         var2[1] = var1;
         jla.a((Object[])((Object[])var2[1]), (byte)-99, 5);
         return var2;
      }
   }

   static final void a(int var0, Object[] var1, int var2) {
      ++f;
      if(var2 <= 37) {
         d = (Object[])null;
      }

      if(var0 != ((int[])((int[])var1[1]))[29]) {
         Object[] var3;
         boolean var4;
         boolean var5;
         if(1 == var0) {
            var4 = true;
            var3 = ib.e;
            var5 = true;
         } else if(2 == var0) {
            var3 = wma.f;
            var5 = false;
            var4 = true;
         } else if(var0 == 128) {
            var3 = ssa.f_i;
            var5 = true;
            var4 = true;
         } else {
            var5 = false;
            var3 = sn.b;
            var4 = false;
         }

         if(((boolean[])((boolean[])var1[63]))[20] == !var5) {
            ((boolean[])((boolean[])var1[63]))[20] = var5;
            if(null != var1 && 87 == var1.length) {
               IDirect3DDevice.a(((long[])((long[])var1[50]))[5], 15, ((boolean[])((boolean[])var1[63]))[20]);
            } else {
               if(var1 == null || 91 != var1.length) {
                  throw new IllegalStateException();
               }

               uka.a(var1, (int)3008);
            }
         }

         if(var4 != ((boolean[])((boolean[])var1[63]))[8]) {
            ((boolean[])((boolean[])var1[63]))[8] = var4;
            if(var1 != null && var1.length == 87) {
               tua.a((byte)8, var1);
            } else {
               if(var1 == null || var1.length != 91) {
                  throw new IllegalStateException();
               }

               if(!((boolean[])((boolean[])var1[63]))[8]) {
                  OpenGL.glDisable(3042);
               } else {
                  OpenGL.glEnable(3042);
               }
            }
         }

         if(var1[72] != var3) {
            var1[72] = var3;
            wm.a(var1, -21452);
         }

         ((int[])((int[])var1[1]))[29] = var0;
         ((int[])((int[])var1[1]))[23] &= -13;
      }

   }

   static final void a(int var0, Object[] var1) {
      if(-2 != ~((int[])((int[])var1[1]))[0] && ((int[])((int[])var1[1]))[0] != 0) {
         int[] var2 = (int[])((int[])var1[1]);
         byte var3 = 1;
         var2[0] = var3;
      }

      if(var0 <= 116) {
         b((Object[])null, ((int[])((int[])var1[12]))[9]);
      }

      ++f_i;
   }

   static final int c(Object[] var0, int var1) throws Exception {
      ++a;
      if(null != var0 && var0.length == 10) {
         return us.b((byte)55, var0);
      } else {
         int var2 = ((int[])((int[])var0[1]))[1];
         int var3 = -119 / ((0 - var1) / 45);
         return var2;
      }
   }

   static final Object[] a(Object[] var0, int var1) {
      if(var1 <= 12) {
         return (Object[])null;
      } else {
         ++k;
         var0[0] = new nj();
         ((nj)var0[0]).b = (nj)var0[0];
         ((nj)var0[0]).f = (nj)var0[0];
         return var0;
      }
   }

   static {
      iha.a(0, (int)0, new Object[1]);
      f_l = new int[4];
      n = null;
   }
}
