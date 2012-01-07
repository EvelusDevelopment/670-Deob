import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;
import java.awt.Canvas;

final class jia extends ta {

   static int Cc;
   static int S;
   static int f_tb;
   static int Dc;
   static int f_fb;
   static int M;
   static int f_gb;
   static int f_hc;
   static int Ac;
   static int zc;
   static int f_pb;
   static int f_lc;
   static int Vb;
   static int f_tc;
   static int Hc;
   static int Zb;
   private Object[] V;
   static int f_vb;
   static int Db;
   static int f_kb;
   static int zb;
   static int f_bb;
   static int Bc;
   static int yb;
   static int Yb;
   static int f_cb;
   static int Eb;
   static int f_bc;
   static int Nb;
   static int Y;
   static int Ib;
   static Object[] R = ura.a(-95, new Object[2]);
   static int Hb;
   static int f_fc;
   static int Kc;
   static int Ic;
   static int f_cc;
   static int f_dc;
   static int f_ob;
   static int f_lb;
   static int f_nc;
   static int N;
   static int gc;
   static int f_ub;
   static int Cb;
   static int f_rb;
   static int L;
   static int f_oc;
   static int Tb;
   static int f_mc;
   static int xc;
   static int Fb;
   static int P;
   static int Mb;
   static int U;
   static int Gc;
   static int f_sc;
   static int Xb;
   static int f_mb;
   static int f_jb;
   static int f_wb;
   static int Qb;
   static int xb;
   static int Bb;
   static int Ab;
   static int f_qc;
   static int Fc;
   static int f_jc;
   static int f_kc;
   static int f_rc;
   static int f_pc;
   static int Ub;
   static int X;
   static int Lb;
   static int T;
   static int Q;
   static int f_hb;
   static int Sb;
   static int f_sb;
   static int f_wc;
   static int f_ec;
   static int f_uc;
   static int f_ab;
   static int f_db;
   static int f_eb;
   static int Ob;
   static int Jb;
   static int f_ic;
   static int f_nb;
   static int Wb;
   static int Ec;
   static int f_qb;
   static int K;
   static int f_vc;
   static int O;
   static int W;
   static int Pb;
   static int Kb;
   static int Rb;
   static Object[] Gb = sd.a(new Object[1], 107, (byte)124);
   static int f_ac;
   static int f_ib;
   static int Jc;
   static int yc;
   static int Z;


   final void d(int var1) {
      ++f_qc;
   }

   final void a(int var1, int var2, float var3, int var4, int var5, float var6, int var7, int var8, float var9, int var10, int var11, int var12, int var13) {
      dt.a(var12, var2, var13, var1, var8, var4, var3, var5, var6, (byte)-119, var10, this.V, var9, var11, var7);
      ++Zb;
   }

   final boolean u() {
      ++K;
      Object[] var2 = this.V;
      boolean var1;
      if(var2[33] == null) {
         var1 = false;
      } else {
         if(!bia.a((byte)52, (Object[])((Object[])var2[33]))) {
            if(!ou.a((Object[])((Object[])var2[33]), (Object[])((Object[])var2[34]), -11)) {
               var1 = false;
               return var1;
            }

            wk.b((Object[])((Object[])var2[49]), -6550);
         }

         var1 = true;
      }

      return var1;
   }

   final void c(int var1) {
      ++S;
      Object[] var2 = this.V;
      ((OpenGL)var2[27]).a();
   }

   final void b(int var1, Object[] var2) {
      ++Dc;
      Object[] var3 = this.V;
      var3[3] = var2;
      ((int[])((int[])var3[1]))[36] = var1;
      ((boolean[])((boolean[])var3[17]))[8] = true;
   }

   final void c(boolean var1) {
      ++f_uc;
      pea.a(var1, this.V, false);
   }

   final void S(int var1, int var2, int var3, int var4, int var5) {
      ++Eb;
      Object[] var6 = this.V;
      int var7 = var3;
      if(var3 < 0) {
         var7 = -var3;
      }

      if(var7 + var1 >= ((int[])((int[])var6[1]))[28] && ~((int[])((int[])var6[1]))[25] <= ~(-var7 + var1) && ~((int[])((int[])var6[1]))[10] >= ~(var7 + var2) && ((int[])((int[])var6[1]))[15] >= -var7 + var2) {
         td.a((byte)-23, var6);
         kd.a(3042, var6, var5);
         OpenGL.glColor4ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4, (byte)(var4 >> 24));
         if(null != var6 && var6.length == 15 && var6[14].equals(Integer.valueOf(0))) {
            this.e(((int[])((int[])this.V[19]))[0], 125);
         }

         float var8 = 0.35F + (float)var1;
         float var9 = (float)var2 + 0.35F;
         int var10 = var7 << 1;
         if((float)var10 < ((float[])((float[])var6[25]))[8]) {
            OpenGL.glBegin(7);
            OpenGL.glVertex2f(var8 + 1.0F, var9 + 1.0F);
            OpenGL.glVertex2f(var8 + 1.0F, var9 - 1.0F);
            OpenGL.glVertex2f(var8 - 1.0F, -1.0F + var9);
            OpenGL.glVertex2f(var8 - 1.0F, var9 + 1.0F);
            OpenGL.glEnd();
         } else if((float)var10 > ((float[])((float[])var6[25]))[12]) {
            OpenGL.glBegin(6);
            OpenGL.glVertex2f(var8, var9);
            int var11 = 262144 / (var7 * 6);
            if(var11 > 64) {
               if(512 < var11) {
                  var11 = 512;
               }
            } else {
               var11 = 64;
            }

            var11 = uma.a(-32125, var11);
            OpenGL.glVertex2f(var8 + (float)var7, var9);

            for(int var12 = -var11 + 16384; 0 < var12; var12 -= var11) {
               OpenGL.glVertex2f(var8 + (float)var7 * eda.g[var12], var9 + (float)var7 * eda.h[var12]);
            }

            OpenGL.glVertex2f((float)var7 + var8, var9);
            OpenGL.glEnd();
            if(null != var6 && 3 == var6.length) {
               this.a((Object[])((Object[])this.V[3]));
            }
         } else {
            OpenGL.glEnable(2832);
            OpenGL.glPointSize((float)var10);
            OpenGL.glBegin(0);
            OpenGL.glVertex2f(var8, var9);
            OpenGL.glEnd();
            OpenGL.glDisable(2832);
         }
      }

   }

   final void r(int var1, int var2, int var3, int var4, int var5, int var6) {
      ++Ic;
      rt.a(var5, var6, this.V, var2, var1, -14773, var3, var4);
   }

   final cga a(int[] var1, int var2, int var3, int var4, int var5, boolean var6) {
      ++L;
      return en.a(var6, var5, var3, (byte)44, this.V, var4, var1, var2);
   }

   final void h(int var1) {
      ++Tb;
      Object[] var2 = this.V;
      gr.a((byte)111, var2);
   }

   final boolean r() {
      ++f_gb;
      return hia.a(this.V, (int)1429);
   }

   final void a(float var1, float var2, float var3, float[] var4) {
      ++f_ab;
      Object[] var5 = this.V;
      float var6 = ((float[])((float[])((Object[])((Object[])var5[13]))[0]))[10] * var3 + ((float[])((float[])((Object[])((Object[])var5[13]))[0]))[2] * var1 + ((float[])((float[])((Object[])((Object[])var5[13]))[0]))[14] + var2 * ((float[])((float[])((Object[])((Object[])var5[13]))[0]))[6];
      float var7 = ((float[])((float[])((Object[])((Object[])var5[13]))[0]))[11] * var3 + ((float[])((float[])((Object[])((Object[])var5[13]))[0]))[15] + var1 * ((float[])((float[])((Object[])((Object[])var5[13]))[0]))[3] + var2 * ((float[])((float[])((Object[])((Object[])var5[13]))[0]))[7];
      if(var6 >= -var7 && var6 <= var7) {
         float var8 = ((float[])((float[])((Object[])((Object[])var5[13]))[0]))[8] * var3 + ((float[])((float[])((Object[])((Object[])var5[13]))[0]))[4] * var2 + var1 * ((float[])((float[])((Object[])((Object[])var5[13]))[0]))[0] + ((float[])((float[])((Object[])((Object[])var5[13]))[0]))[12];
         if(-var7 <= var8 && var8 <= var7) {
            float var9 = var1 * ((float[])((float[])((Object[])((Object[])var5[13]))[0]))[1] + ((float[])((float[])((Object[])((Object[])var5[13]))[0]))[13] + var2 * ((float[])((float[])((Object[])((Object[])var5[13]))[0]))[5] + ((float[])((float[])((Object[])((Object[])var5[13]))[0]))[9] * var3;
            if(-var7 <= var9 && var7 >= var9) {
               if(null != var5 && -6 == ~var5.length) {
                  this.V[2] = null;
               }

               float var10 = ((float[])((float[])((Object[])((Object[])var5[46]))[0]))[14] + var1 * ((float[])((float[])((Object[])((Object[])var5[46]))[0]))[2] + var2 * ((float[])((float[])((Object[])((Object[])var5[46]))[0]))[6] + var3 * ((float[])((float[])((Object[])((Object[])var5[46]))[0]))[10];
               var4[2] = var10;
               var4[1] = ((float[])((float[])var5[25]))[9] * var9 / var7 + ((float[])((float[])var5[25]))[4];
               var4[0] = ((float[])((float[])var5[25]))[3] + var8 * ((float[])((float[])var5[25]))[0] / var7;
            } else {
               var4[2] = Float.NaN;
               var4[0] = Float.NaN;
               var4[1] = Float.NaN;
            }
         } else {
            var4[2] = Float.NaN;
            var4[1] = Float.NaN;
            var4[0] = Float.NaN;
         }
      } else {
         var4[2] = Float.NaN;
         var4[0] = Float.NaN;
         var4[1] = Float.NaN;
      }

   }

   final void p(int var1, int var2, int var3) {
      lr.a(var3, this.V, var2, false, var1);
      ++f_ac;
   }

   static final Object[] a(Object[] var0, byte var1) {
      if(var1 != 39) {
         return (Object[])((Object[])var0[1]);
      } else {
         ++Vb;
         Object[] var2;
         Object[] var4;
         if(null != var0) {
            var4 = new Object[26];
            de.a(var4, 2);
            mq.a((byte)51, var4);
            var4[19] = bja.a((byte)-127, var4);
            var4[2] = var0[2];
            uka.a(-1, -63, 256, var4);
            jba.a(-5, var4, true);
            var2 = var4;
         } else {
            var4 = new Object[26];
            de.a(var4, 2);
            mq.a((byte)51, var4);
            var4[19] = bja.a((byte)-119, var4);
            var4[2] = nb.a((byte)105, 128, new Object[5]);
            uka.a(-1, 3, 256, var4);
            jba.a(-5, var4, true);
            var2 = var4;
         }

         am.a(9, var2, 128, (byte)-126);
         return var2;
      }
   }

   final boolean w() {
      ++Ub;
      Object[] var2 = this.V;
      boolean var1 = pm.a(3, (Object[])((Object[])var2[12]), -1361);
      return var1;
   }

   final cga a(int var1, int var2, boolean var3, boolean var4) {
      ++Kb;
      return iqa.a(var2, var4, var3, var1, 118, this.V);
   }

   final void c(int var1, int var2) throws cr {
      op.a(19587, this.V, var2, var1);
      ++Pb;
   }

   final void b() {
      ++f_kb;
      sea.a(-21614, this.V);
   }

   final void a(int var1, int var2, int var3, int var4) {
      ++Yb;
      hca.a(-2925, var3, this.V, var2, var1, var4);
   }

   final void b(int var1) {
      ++f_db;
      Object[] var2 = this.V;
      int var3 = var1;
      synchronized(var2) {
         if(var2 != null && 11 == var2.length && var2[8].equals(Boolean.valueOf(false))) {
            this.b(-117, (Object[])null);
         }

         var3 &= Integer.MAX_VALUE;
         int var16 = 0;

         Object[] var17;
         while(!kj.a(24510, (Object[])((Object[])var2[53]))) {
            ma var5;
            var17 = (var5 = (ma)jca.b((byte)85, (Object[])((Object[])var2[53]))) == null?null:var5.s;
            dma.f[var16++] = (int)((lm)(null != var17?var17[0]:null)).e;
            ((int[])((int[])var2[1]))[19] -= ((int[])((int[])var17[1]))[0];
            if(var16 == 1000) {
               OpenGL.glDeleteBuffersARB(var16, dma.f, 0);
               var16 = 0;
            }
         }

         if(var16 > 0) {
            OpenGL.glDeleteBuffersARB(var16, dma.f, 0);
            var16 = 0;
         }

         while(!kj.a(24510, (Object[])((Object[])var2[24]))) {
            ma var7;
            var17 = (var7 = (ma)jca.b((byte)-124, (Object[])((Object[])var2[24]))) == null?null:var7.s;
            dma.f[var16++] = (int)((lm)(var17 == null?null:var17[0])).e;
            ((int[])((int[])var2[1]))[26] -= ((int[])((int[])var17[1]))[0];
            if(var16 == 1000) {
               OpenGL.glDeleteTextures(var16, dma.f, 0);
               var16 = 0;
            }
         }

         if(var16 > 0) {
            OpenGL.glDeleteTextures(var16, dma.f, 0);
            var16 = 0;
         }

         while(!kj.a(24510, (Object[])((Object[])var2[31]))) {
            ma var9;
            var17 = (var9 = (ma)jca.b((byte)110, (Object[])((Object[])var2[31]))) != null?var9.s:null;
            dma.f[var16++] = ((int[])((int[])var17[1]))[0];
            if(1000 == var16) {
               OpenGL.glDeleteFramebuffersEXT(var16, dma.f, 0);
               var16 = 0;
            }
         }

         if(0 < var16) {
            OpenGL.glDeleteFramebuffersEXT(var16, dma.f, 0);
            var16 = 0;
         }

         while(!kj.a(24510, (Object[])((Object[])var2[56]))) {
            ma var10;
            var17 = null == (var10 = (ma)jca.b((byte)91, (Object[])((Object[])var2[56])))?null:var10.s;
            dma.f[var16++] = (int)((lm)(var17 != null?var17[0]:null)).e;
            ((int[])((int[])var2[1]))[17] -= ((int[])((int[])var17[1]))[0];
            if(var16 == 1000) {
               OpenGL.glDeleteRenderbuffersEXT(var16, dma.f, 0);
               var16 = 0;
            }
         }

         if(var16 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var16, dma.f, 0);
            boolean var23 = false;
         }

         while(!kj.a(24510, (Object[])((Object[])var2[38]))) {
            ma var12;
            var17 = null != (var12 = (ma)jca.b((byte)-120, (Object[])((Object[])var2[38])))?var12.s:null;
            OpenGL.glDeleteLists((int)((lm)(null == var17?null:var17[0])).e, ((int[])((int[])var17[1]))[0]);
         }

         lm var22;
         while(!kj.a(24510, (Object[])((Object[])var2[15]))) {
            var22 = jca.b((byte)-114, (Object[])((Object[])var2[15]));
            OpenGL.glDeleteProgramARB((int)var22.e);
         }

         while(!kj.a(24510, (Object[])((Object[])var2[50]))) {
            var22 = jca.b((byte)-118, (Object[])((Object[])var2[50]));
            OpenGL.glDeleteShader((int)var22.e);
         }

         while(!kj.a(24510, (Object[])((Object[])var2[38]))) {
            ma var14;
            var17 = null != (var14 = (ma)jca.b((byte)64, (Object[])((Object[])var2[38])))?var14.s:null;
            OpenGL.glDeleteLists((int)((lm)(null == var17?null:var17[0])).e, ((int[])((int[])var17[1]))[0]);
         }

         var17 = (Object[])((Object[])var2[49]);
         fua.a(-69, (Object[])((Object[])var17[2]), 5);
         int var18 = ((int[])((int[])var2[1]))[17] + ((int[])((int[])var2[1]))[26] + ((int[])((int[])var2[1]))[19];
         if(var18 > 100663296 && ~(((long[])((long[])var2[41]))[0] - -60000L) > ~he.a(127)) {
            System.gc();
            ((long[])((long[])var2[41]))[0] = he.a(-92);
         }

         ((int[])((int[])var2[1]))[33] = var3;
      }
   }

   final int d(int var1, int var2) {
      ++Sb;
      int var3 = var2 ^ var1 & var2;
      return var3;
   }

   final int XA() {
      ++f_lc;
      Object[] var2 = this.V;
      int var1 = ((int[])((int[])var2[1]))[19] + ((int[])((int[])var2[1]))[26] + ((int[])((int[])var2[1]))[17];
      return var1;
   }

   final void HA(int var1, int var2, int var3, int var4, int var5) {
      ++f_ec;
      es.a(this.V, -128, var4, var1, var5, var3, var2);
   }

   final void a(int var1, Object[][] var2) {
      ++Nb;
      Object[] var3 = this.V;

      for(int var4 = 0; var1 > var4; ++var4) {
         ((Object[][])((Object[][])var3[14]))[var4] = var2[var4];
      }

      ((int[])((int[])var3[1]))[7] = var1;
      if(-2 != ~((int[])((int[])var3[1]))[12]) {
         sea.a(var3, (byte)-28);
      }

   }

   final void PA(int[] var1) {
      ++W;
      Object[] var2 = this.V;
      var1[3] = ((int[])((int[])var2[1]))[0];
      var1[2] = ((int[])((int[])var2[1]))[1];
      var1[0] = ((int[])((int[])var2[1]))[4];
      var1[1] = ((int[])((int[])var2[1]))[39];
   }

   final boolean p() {
      ++f_vb;
      boolean var1 = true;
      return var1;
   }

   final void s() {
      ++U;
      ota.a(105, this.V);
   }

   final void Z(int var1, int var2) {
      rv.a(var1, var2, 128, this.V);
      ++f_nc;
   }

   final boolean D() {
      ++f_sb;
      return qh.a((int)17, this.V);
   }

   final void ka(float var1) {
      rea.a(14033, var1, this.V);
      ++f_pb;
   }

   final void b(int var1, int var2, int var3, int var4, int var5, int var6) {
      ama.a(var4, var6, var3, var5, var2, -125, var1, this.V);
      ++f_rb;
   }

   final hsa f() {
      ++Fc;
      return oja.a(this.V, 0);
   }

   final void UA(float var1, float var2) {
      ++f_fc;
      Object[] var3 = this.V;
      ((float[])((float[])var3[25]))[6] = var2;
      ((float[])((float[])var3[25]))[11] = var1;
      kja.a(var3, 121);
   }

   final void C() {
      ++f_oc;
      Object[] var1 = this.V;
      if(null != var1 && (var1.length == 2 || 1 == var1.length && var1[0].equals(Integer.valueOf(0)) && var1[0].equals(Integer.valueOf(1)))) {
         ((long[])((long[])this.V[0]))[6] = -112L;
      }

      for(lm var3 = dda.a((Object[])((Object[])var1[22]), 2); null != var3; var3 = client.a((Object[])((Object[])var1[22]), -28280)) {
         gba var2;
         mna.c(null == (var2 = (gba)var3)?null:var2.p, -123);
      }

      if(var1[34] != null) {
         Object[] var7 = (Object[])((Object[])var1[34]);
         var7[10] = null;
         var7[8] = null;
         var7[5] = null;
         var7[7] = null;
         var7[2] = null;
         var7[9] = null;
         var7[6] = null;
         if(var7 != null && (var7.length == 3 || 6 == var7.length || var7.length == 5)) {
            this.FA(125, ((float[])((float[])((Object[])((Object[])this.V[2]))[0]))[2], 0.21406001F, ((float[])((float[])this.V[1]))[0], 0.7174865F, -0.26612532F);
         }

         if(!kj.a(24510, (Object[])((Object[])var7[3]))) {
            for(lm var5 = dda.a((Object[])((Object[])var7[3]), 2); ((Object[])((Object[])var7[3]))[0] != var5; var5 = var5.f) {
               ica var4;
               un.b((byte)94, null == (var4 = (ica)var5)?null:var4.m);
            }

            if(var7 != null && 7 == var7.length) {
               this.f();
            }
         }

         ((int[])((int[])var7[1]))[1] = 1;
         ((int[])((int[])var7[1]))[4] = 1;
      }

      if(((boolean[])((boolean[])var1[17]))[29]) {
         dla.a(false, 32396, true);
         ((boolean[])((boolean[])var1[17]))[29] = false;
      }

   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, Class_s var7, int var8, int var9, int var10, int var11, int var12) {
      al.a(var6, var8, var12, var2, var11, var5, var3, var7, var9, var4, 13, var1, this.V, var10);
      ++zb;
   }

   final void t() {
      qda.b(this.V, 110);
      ++Cc;
   }

   final Object[] k() {
      ++f_sc;
      Object[] var2 = this.V;
      Object[] var1 = (Object[])((Object[])var2[4]);
      return var1;
   }

   final boolean n() {
      ++Ec;
      boolean var1 = true;
      return var1;
   }

   final void b(int var1, int var2, int var3, int var4) {
      ++Fb;
      cma.a(var1, this.V, false, var2, var4, var3);
   }

   final void JA(int var1, int var2, int var3, int var4) {
      ena.a(var4, var1, this.V, var2, (byte)-121, var3);
      ++f_pc;
   }

   final boolean j() {
      ++f_vc;
      boolean var1 = true;
      return var1;
   }

   final gv a(Canvas var1, int var2, int var3) {
      ++f_cc;
      Object[] var5 = this.V;
      Object[] var8 = new Object[7];
      rb.a(var8, (byte)37, ((OpenGL)var5[27]).prepareSurface(var1), var1, var5);
      Object[] var6;
      gv var4 = (gv)((var6 = var8) != null?var6[4]:null);
      return var4;
   }

   final void d(Object[] var1) {
      ++f_wc;
      op.a(var1, this.V, (byte)67);
   }

   final int a(int var1, int var2) {
      ++Hb;
      int var3 = var2 | var1;
      return var3;
   }

   final void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      ++Z;
      vfa.a(var2, (byte)106, var4, this.V, var6, var3, var5, var1);
   }

   final void oa(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9) {
      Object[] var10;
      float var11;
      float var12;
      label28: {
         ++Wb;
         var10 = this.V;
         if(var10[40] == null || var3 > ((int[])((int[])((Object[])((Object[])var10[40]))[1]))[3] || ~var4 < ~((int[])((int[])((Object[])((Object[])var10[40]))[1]))[4]) {
            var10[40] = lp.a(false, br.f, var4, var7, var10, (byte)-114, var3, br.f, vk.f);
            pda.a(false, false, (Object[])((Object[])var10[40]), false);
            var11 = ((float[])((float[])((Object[])((Object[])var10[40]))[6]))[1];
            var12 = ((float[])((float[])((Object[])((Object[])var10[40]))[6]))[0];
            if(client.f_vb == 0) {
               break label28;
            }
         }

         hr.a(var3, var7, false, (byte)94, br.f, 0, 0, (Object[])((Object[])var10[40]), 0, var4, 0);
         var12 = ((float[])((float[])((Object[])((Object[])var10[40]))[6]))[0] * (float)var3 / (float)((int[])((int[])((Object[])((Object[])var10[40]))[1]))[3];
         var11 = (float)var4 * ((float[])((float[])((Object[])((Object[])var10[40]))[6]))[1] / (float)((int[])((int[])((Object[])((Object[])var10[40]))[1]))[4];
      }

      sm.a(var10, 122);
      moa.a((byte)117, (Object[])((Object[])var10[40]), var10);
      kd.a(3042, var10, var9);
      OpenGL.glColor4ub((byte)(var5 >> 16), (byte)(var5 >> 8), (byte)var5, (byte)(var5 >> 24));
      fd.a(var6, var10, -117);
      el.a('\u8575', 30862, '\u8575', var10);
      af.a(768, var10, 30579, '\u8576', 0);
      af.a(770, var10, 30579, 5890, 2);
      db.a(770, var10, (byte)-68, 0, '\u8576');
      db.a(770, var10, (byte)-68, 2, 5890);
      float var13 = (float)var1;
      float var14 = (float)var2;
      float var15 = (float)var3 + var13;
      OpenGL.glBegin(7);
      float var16 = (float)var4 + var14;
      OpenGL.glTexCoord2f(0.0F, 0.0F);
      OpenGL.glVertex2f(var13, var14);
      if(var10 == null || -7 != ~var10.length || !var10[4].equals(Integer.valueOf(1))) {
         OpenGL.glTexCoord2f(0.0F, var12);
         OpenGL.glVertex2f(var13, var16);
         OpenGL.glTexCoord2f(var11, var12);
         OpenGL.glVertex2f(var15, var16);
         OpenGL.glTexCoord2f(var11, 0.0F);
         OpenGL.glVertex2f(var15, var14);
         OpenGL.glEnd();
         af.a(768, var10, 30579, 5890, 0);
         af.a(770, var10, 30579, '\u8576', 2);
         db.a(770, var10, (byte)-68, 0, 5890);
         db.a(770, var10, (byte)-68, 2, '\u8576');
      }
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, Class_s var7, int var8, int var9) {
      ++f_tc;
      vja.a((byte)92, var9, var2, this.V, var6, var8, var7, var1, var5, var3, var4);
   }

   final boolean m() {
      ++Lb;
      return fta.a(this.V, (byte)90);
   }

   final void a(Object[] var1) {
      qs.a(var1, this.V, (byte)-1);
      ++yb;
   }

   final lua e(int var1, int var2) {
      ++xc;
      Object[] var4 = this.V;
      Object[] var5;
      lua var3 = (lua)((var5 = ib.a(vk.b, op.b, new Object[5], var1, var4, 1, var2)) == null?null:var5[4]);
      return var3;
   }

   final boolean y() {
      ++f_hb;
      return tja.a(this.V, (byte)-123);
   }

   final void g(int var1) {
      ++f_ub;
      if(1 != var1) {
         throw new IllegalArgumentException("");
      }
   }

   final boolean z() {
      ++yc;
      return gsa.a(6, this.V);
   }

   final void B() {
      ++f_hc;
      vl.a((byte)-33, this.V);
   }

   final boolean o() {
      ++f_mc;
      boolean var1 = true;
      return var1;
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      ++f_bb;
      Object[] var10 = this.V;
      if(var3 != var1 || var4 != var2) {
         td.a((byte)123, var10);
         kd.a(3042, var10, var6);
         if(null != var10 && 35 == var10.length) {
            this.c(((int[])((int[])this.V[23]))[0]);
         }

         float var12 = (float)(-var1) + (float)var3;
         float var13 = (float)(-var2) + (float)var4;
         float var14 = (float)(1.0D / Math.sqrt((double)(var13 * var13 + var12 * var12)));
         int var11 = var9 % (var7 + var8);
         var13 *= var14;
         OpenGL.glColor4ub((byte)(var5 >> 16), (byte)(var5 >> 8), (byte)var5, (byte)(var5 >> 24));
         var12 *= var14;
         float var15 = var12 * (float)var7;
         float var16 = var13 * (float)var7;
         float var17 = 0.0F;
         float var18 = 0.0F;
         float var19 = var15;
         float var20 = var16;
         if(var7 < var11) {
            var18 = (float)(var8 + var7 - var11) * var13;
            var17 = (float)(-var11 + var7 + var8) * var12;
         } else {
            var19 = var12 * (float)(var7 - var11);
            var20 = var13 * (float)(-var11 + var7);
         }

         float var21 = 0.35F + (float)var1 + var17;
         float var22 = (float)var2 + 0.35F + var18;
         float var23 = var12 * (float)var8;
         float var24 = (float)var8 * var13;

         while(true) {
            if(var1 >= var3) {
               if(var21 < 0.35F + (float)var3) {
                  break;
               }

               if(var21 + var19 < (float)var3) {
                  var19 = -var21 + (float)var3;
               }
            } else {
               if(var21 > (float)var3 + 0.35F) {
                  break;
               }

               if(var19 + var21 > (float)var3) {
                  var19 = -var21 + (float)var3;
               }
            }

            if(var2 >= var4) {
               if(var22 < (float)var4 + 0.35F) {
                  break;
               }

               if((float)var4 > var22 + var20) {
                  var20 = (float)var4 - var22;
               }
            } else {
               if(var22 > (float)var4 + 0.35F) {
                  break;
               }

               if(var20 + var22 > (float)var4) {
                  var20 = -var22 + (float)var4;
               }
            }

            OpenGL.glBegin(1);
            if(null != var10 && (var10.length == 5 || var10.length == 8 && var10[7].equals(Integer.valueOf(1)) || var10.length == 2 && var10[1].equals(Integer.valueOf(0)))) {
               this.A();
            }

            OpenGL.glVertex2f(var21, var22);
            OpenGL.glVertex2f(var21 + var19, var20 + var22);
            OpenGL.glEnd();
            var22 += var24 + var20;
            var21 += var23 + var19;
            var20 = var16;
            var19 = var15;
         }
      }

   }

   final void c(float var1, float var2, float var3, float[] var4) {
      ffa.a(var3, var2, this.V, var4, true, var1);
      ++f_jb;
   }

   final cga a(int var1, int var2, int var3, int var4, boolean var5) {
      ++f_mb;
      return mca.a(var3, var2, (byte)-97, var5, var4, var1, this.V);
   }

   jia(Object[] var1, qa var2) {
      super(var2);
      this.V = var1;
   }

   final Object[] c(int var1, int var2, int var3, int var4, int var5, int var6) {
      ++f_bc;
      return pe.a(var4, var1, false, var2, this.V, var6, var5, var3);
   }

   final void j(int var1) {
      ++Gc;
      Object[] var2 = this.V;
      int var3 = var1;

      for(((int[])((int[])var2[1]))[9] = 0; var3 > 1; var3 >>= 1) {
         ++((int[])((int[])var2[1]))[9];
      }

      ((int[])((int[])var2[1]))[11] = 1 << ((int[])((int[])var2[1]))[9];
   }

   static final void a(Object[] var0, int var1, int var2) {
      if(var1 != 0) {
         b((Object[])null, ((int[])((int[])var0[27]))[20], -81);
      }

      kka.a(var2, (byte)126, true, var0);
      ++Db;
   }

   final void FA(int var1, float var2, float var3, float var4, float var5, float var6) {
      joa.a(var1, var3, this.V, var5, var4, var2, false, var6);
      ++Ob;
   }

   final boolean A() {
      ++Jc;
      return iq.a((byte)-91, this.V);
   }

   final boolean d() {
      ++f_dc;
      return np.a(this.V, (byte)-119);
   }

   final Object[] v() {
      ++Q;
      Object[] var2 = this.V;
      Object[] var1 = (Object[])((Object[])var2[23]);
      return var1;
   }

   final void g(int var1, int var2) {
      try {
         ++Bb;
         throw new RuntimeException("");
      } catch (RuntimeException var4) {
         throw vt.a(var4, "jia.g(" + var1 + ',' + var2 + ')');
      }
   }

   final void a(boolean var1) {
      ++X;
   }

   final void a(int var1, Object[] var2) {
      ++Cb;
      gj.a(var1, var2, this.V, true);
   }

   final za a(int var1) {
      ++xb;
      Object[] var3 = this.V;
      Object[] var7 = new Object[2];
      gba var9 = new gba(var7);
      var7[0] = var9;
      var7[1] = new NativeHeap(var1);
      client.a(122, (Object[])((Object[])var3[22]), (lm)(var7 != null?var7[0]:null));
      za var2 = (za)(null != var7?var7[0]:null);
      return var2;
   }

   final re b(int var1, int var2) {
      ++Qb;
      Object[] var4 = this.V;
      Object[] var5;
      re var3 = (re)(null == (var5 = ib.a(vk.f, hf.d, new Object[5], var1, var4, 1, var2))?null:var5[4]);
      return var3;
   }

   final void a(za var1) {
      Class_b.a(112, this.V, var1);
      ++f_nb;
   }

   final cga a(aea var1, boolean var2) {
      ++N;
      Object[] var4 = this.V;
      int[] var5 = new int[var1.a * var1.h];
      int var6 = 0;
      int var7 = 0;
      int var8;
      int var9;
      if(null != var1.e) {
         if(var4 != null && var4.length == 8) {
            return (cga)((Object[])((Object[])this.V[5]))[0];
         }

         for(var8 = 0; var1.h > var8; ++var8) {
            for(var9 = 0; var9 < var1.a; ++var9) {
               var5[var7++] = var1.f_i[var1.c[var6] & 255] | var1.e[var6] << 24;
               ++var6;
            }

            if(var4 != null && -21 == ~var4.length) {
               return (cga)((Object[])((Object[])this.V[1]))[5];
            }
         }
      } else {
         if(var4 != null && var4.length == 4) {
            this.FA(-120, -0.31109565F, ((float[])((float[])this.V[4]))[11], ((float[])((float[])this.V[1]))[4], ((float[])((float[])this.V[11]))[1], 0.058664843F);
         }

         for(var8 = 0; var1.h > var8; ++var8) {
            for(var9 = 0; var1.a > var9; ++var9) {
               int var10 = var1.f_i[var1.c[var6++] & 255];
               var5[var7++] = var10 == 0?0:var10 | -16777216;
            }
         }
      }

      cga var12 = ((ta)var4[55]).a(var1.a, -7343, 0, var5, var1.h, var1.a);
      var12.a(var1.f, var1.b, var1.d, var1.g);
      return var12;
   }

   final ja a(Object[] var1, aea[] var2, boolean var3) {
      ++f_rc;
      return qua.a(var3, 3, var1, this.V, var2);
   }

   final void b(boolean var1) {
      ++f_fb;
      gla.a(var1, this.V, true);
   }

   final void a() {
      ++O;
      dh.a(this.V, (int)25);
   }

   static final void b(Object[] var0, int var1, int var2) {
      ++Hc;
      if(var2 != 6431) {
         R = (Object[])null;
      }

      if(var1 != ((int[])((int[])var0[1]))[31]) {
         ((int[])((int[])var0[1]))[31] = var1;
         ki.a(var0, (byte)125);
      }

   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      lt.a(var3, var2, var5, var4, 3, var7, var1, var6, this.V);
      ++f_jc;
   }

   final void e(int var1, int var2, int var3, int var4, int var5, int var6) {
      lha.a(var3, var5, 88, var1, var2, var4, var6, this.V);
      ++f_cb;
   }

   final void T(int var1, int var2, int var3, int var4, int var5) {
      oaa.a(var1, var2, var3, 28, var5, var4, this.V);
      ++Ac;
   }

   final void TA(int[] var1) {
      uba.a(var1, 119, this.V);
      ++Ib;
   }

   final ka a(ii var1, int var2, int var3, int var4, int var5) {
      ++f_ib;
      return bk.a(this.V, var2, var4, var5, var3, false, var1);
   }

   final Class_s a(int var1, int var2, int[] var3, int[] var4) {
      ++zc;
      Object[] var6 = this.V;
      Object[] var7;
      Class_s var5 = (Class_s)((var7 = dn.a(var2, 97, var4, var6, var3, var1)) != null?var7[1]:null);
      return var5;
   }

   final void b(Object[] var1) {
      ++M;
      Object[] var2 = this.V;
      var2[57] = var1;
   }

   final int x() {
      ++f_kc;
      return jra.b(-112, this.V);
   }

   final Object[] c() {
      ++gc;
      return gp.a((byte)48, this.V);
   }

   final Object[] h() {
      ++T;
      Object[] var2 = this.V;
      Object[] var1 = ona.a(new Object[2], (Object[])((Object[])var2[45]), (byte)125);
      return var1;
   }

   final void i() {
      ++f_tb;
      nja.a(20390, this.V);
   }

   final aa a(int var1, int var2, int[][] var3, int[][] var4, int var5, int var6, int var7) {
      ++f_eb;
      return aga.a(var7, this.V, var6, var5, var2, var3, 14769, var1, var4);
   }

   static final int c(int var0, Object[] var1) {
      ++Jb;
      ((int[])((int[])var1[1]))[0] += 2;
      int var2 = ('\uff00' & ((byte[])((byte[])var1[2]))[-2 + ((int[])((int[])var1[1]))[0]] << 8) + (255 & ((byte[])((byte[])var1[2]))[-1 + ((int[])((int[])var1[1]))[0]]);
      if(var0 != -8166) {
         Gb = (Object[])null;
      }

      if(var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   final boolean g() {
      ++f_ob;
      return al.a((int)-14419, this.V);
   }

   final void b(float var1, float var2, float var3, float[] var4) {
      ++Xb;
      rl.a(this.V, var2, 10, var1, var3, var4);
   }

   final void c(Object[] var1) {
      coa.a(this.V, 2, var1);
      ++f_ic;
   }

   final boolean q() {
      ++Kc;
      return pj.a(this.V, true);
   }

   final void e() {
      ++f_wb;
      Object[] var1 = this.V;
      if(null != var1[33] && bia.a((byte)99, (Object[])((Object[])var1[33]))) {
         ko.a((Object[])((Object[])var1[33]), (Object[])((Object[])var1[34]), 10080);
         wk.b((Object[])((Object[])var1[49]), -6550);
      }

   }

   final int[] Y(int var1, int var2, int var3, int var4) {
      ++Y;
      return Class_h.a(-30937, var2, var1, this.V, var3, var4);
   }

   final Object[] E() {
      ++Ab;
      Object[] var2 = this.V;
      int var3 = -1;
      if(((String)var2[47]).indexOf("nvidia") != -1) {
         var3 = 4318;
      } else if(~((String)var2[47]).indexOf("intel") != 0) {
         var3 = '\u8086';
      } else if(~((String)var2[47]).indexOf("ati") != 0) {
         var3 = 4098;
      }

      Object[] var1 = dda.a(((int[])((int[])var2[1]))[24], 0L, new Object[4], 57, (String)var2[16], "OpenGL", var3);
      return var1;
   }

   final void V(int var1, int var2, int var3, int var4) {
      ++P;
      rv.a(var1, var2, var3, 1, this.V, var4);
   }

   final void ra() {
      ++Mb;
      Object[] var1 = this.V;
      ((boolean[])((boolean[])var1[17]))[8] = false;
   }

   final int a(int var1, int var2, int var3, int var4, int var5, int var6) {
      ++f_qb;
      return mga.a(var6, -105, var5, var4, this.V, var1, var2, var3);
   }

   final void EA(int var1, Class_s var2, int var3, int var4) {
      ++f_lb;
      Object[] var5 = this.V;
      if(var5 == null || (-2 != ~var5.length || !var5[0].equals(Boolean.valueOf(false))) && var5.length != 8 && 5 != var5.length) {
         tg var6;
         Object[] var7 = (var6 = (tg)var2) == null?null:var6.f_l;
         Object[] var8 = (Object[])((Object[])var7[0]);
         sm.a(var5, 126);
         moa.a((byte)126, (Object[])((Object[])var7[0]), var5);
         kd.a(3042, var5, 1);
         el.a(8448, 30862, 7681, var5);
         af.a(768, var5, 30579, '\u8577', 0);
         float var9 = ((float[])((float[])var8[6]))[0] / (float)((int[])((int[])var8[1]))[6];
         float var10 = ((float[])((float[])var8[6]))[1] / (float)((int[])((int[])var8[1]))[5];
         OpenGL.glColor4ub((byte)(var1 >> 16), (byte)(var1 >> 8), (byte)var1, (byte)(var1 >> 24));
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(var9 * (float)(((int[])((int[])var5[1]))[28] + -var3), (float)(((int[])((int[])var5[1]))[10] + -var4) * var10);
         OpenGL.glVertex2i(((int[])((int[])var5[1]))[28], ((int[])((int[])var5[1]))[10]);
         OpenGL.glTexCoord2f(var9 * (float)(((int[])((int[])var5[1]))[28] + -var3), (float)(((int[])((int[])var5[1]))[15] - var4) * var10);
         OpenGL.glVertex2i(((int[])((int[])var5[1]))[28], ((int[])((int[])var5[1]))[15]);
         OpenGL.glTexCoord2f(var9 * (float)(((int[])((int[])var5[1]))[25] + -var3), (float)(((int[])((int[])var5[1]))[15] + -var4) * var10);
         OpenGL.glVertex2i(((int[])((int[])var5[1]))[25], ((int[])((int[])var5[1]))[15]);
         OpenGL.glTexCoord2f(var9 * (float)(-var3 + ((int[])((int[])var5[1]))[25]), (float)(((int[])((int[])var5[1]))[10] + -var4) * var10);
         OpenGL.glVertex2i(((int[])((int[])var5[1]))[25], ((int[])((int[])var5[1]))[10]);
         OpenGL.glEnd();
         af.a(768, var5, 30579, 5890, 0);
      }
   }

   final Object[] a(Object[] var1, Object[] var2, float var3, Object[] var4) {
      ++Rb;
      return gd.a(var4, var1, this.V, var3, var2, -126);
   }

}
