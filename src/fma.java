import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IUnknown;
import jagdx.fna;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.util.Vector;

final class fma extends ta {

   static int N;
   static int f_uc;
   static int f_db;
   static int zb;
   static int Ib;
   static int Sb;
   static int f_cc;
   static int zc;
   static int f_ac;
   static int L;
   static int Zb;
   static int Jb;
   static int Bb;
   static int Db;
   static int f_lb;
   static int f_rb;
   static int V;
   static int f_oc;
   static int K;
   static int Cb;
   static int Hc;
   static int f_lc;
   static int f_ic;
   static int Tb;
   static int Ic;
   static int Ec;
   static int f_qc;
   static int f_fc;
   static int f_pc;
   static int f_tb;
   static int R;
   static int yb;
   static int Ac;
   static int gc;
   static int f_sc;
   static int Ab;
   static int f_kb;
   static int xb;
   static int W;
   static int Ob;
   static int Nb;
   static int f_ob;
   static int f_dc;
   static int f_jb;
   static int f_gb;
   static int Qb;
   static int Mb;
   static int Wb;
   static int f_qb;
   static int f_eb;
   static int f_kc;
   static int xc;
   static int f_mc;
   static int Y;
   static int Cc;
   static int f_mb;
   static int Yb;
   static int Fb;
   static int Eb;
   static int f_bc;
   static int f_ib;
   static int f_pb;
   static Object[] f_wb = ab.a(new Object[2], (byte)-109);
   static int Gc;
   static int Lb;
   static int P;
   static int Pb;
   static int Kb;
   static int O;
   static int Ub;
   static int Rb;
   static int f_jc;
   static int f_rc;
   static int yc;
   static int T;
   static int f_ub;
   static int f_bb;
   static int f_cb;
   static int Fc;
   static int Dc;
   static int f_ec;
   static int f_sb;
   static int f_wc;
   static int f_nc;
   static int f_tc;
   static int f_nb;
   static int Gb;
   static int Xb;
   static int Hb;
   private Object[] S;
   static int f_ab;
   static int Z;
   static int Q;
   static int Vb;
   static int f_hb;
   static int M;
   static int f_vb;
   static int U;
   static Rectangle[] X = new Rectangle[104];
   static int f_fb;
   static int f_hc;
   static int Bc;
   static int f_vc;
   static int Jc;


   final void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      ++Ab;
      jc.a(var2, var1, var3, var5, var6, -13, this.S, var4);
   }

   final void c(float var1, float var2, float var3, float[] var4) {
      ++Bc;
      Object[] var5 = this.S;
      float var6 = ((float[])((float[])((Object[])((Object[])var5[33]))[0]))[15] + var1 * ((float[])((float[])((Object[])((Object[])var5[33]))[0]))[3] + ((float[])((float[])((Object[])((Object[])var5[33]))[0]))[7] * var2 + ((float[])((float[])((Object[])((Object[])var5[33]))[0]))[11] * var3;
      float var7 = ((float[])((float[])((Object[])((Object[])var5[33]))[0]))[8] * var3 + ((float[])((float[])((Object[])((Object[])var5[33]))[0]))[12] + ((float[])((float[])((Object[])((Object[])var5[33]))[0]))[0] * var1 + var2 * ((float[])((float[])((Object[])((Object[])var5[33]))[0]))[4];
      float var8 = var3 * ((float[])((float[])((Object[])((Object[])var5[33]))[0]))[9] + ((float[])((float[])((Object[])((Object[])var5[33]))[0]))[13] + var1 * ((float[])((float[])((Object[])((Object[])var5[33]))[0]))[1] + ((float[])((float[])((Object[])((Object[])var5[33]))[0]))[5] * var2;
      var4[0] = ((float[])((float[])var5[0]))[4] + var7 * ((float[])((float[])var5[0]))[9] / var6;
      var4[2] = var3;
      var4[1] = ((float[])((float[])var5[0]))[15] + ((float[])((float[])var5[0]))[10] * var8 / var6;
   }

   final void ra() {
      ++f_hc;
      Object[] var1 = this.S;
      ((boolean[])((boolean[])var1[63]))[11] = false;
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, Class_s var7, int var8, int var9) {
      ++Hc;
   }

   final void c(int var1, int var2) throws cr {
      eia.a(this.S, var1, -42, var2);
      ++f_mc;
   }

   final boolean q() {
      ++f_vc;
      boolean var1 = true;
      return var1;
   }

   final Object[] h() {
      ++Fb;
      return mr.a(this.S, (int)0);
   }

   final cga a(int var1, int var2, int var3, int var4, boolean var5) {
      ++f_oc;
      Object[] var7 = this.S;
      Object[] var9 = gga.a(var3, new Object[6], 12, false, var5, var4, var7);
      jo.a(0, -4, var1, var2, var9, var4, var3, 0);
      cga var6 = (cga)(var9 == null?null:var9[2]);
      return var6;
   }

   final boolean j() {
      ++Eb;
      return qt.b(0, this.S);
   }

   final void JA(int var1, int var2, int var3, int var4) {
      ++f_bb;
      dfa.a(var1, 82, var2, var3, this.S, var4);
   }

   final boolean r() {
      ++Db;
      boolean var1 = false;
      return var1;
   }

   final Object[] v() {
      ++Z;
      Object[] var2 = this.S;
      Object[] var1 = (Object[])((Object[])var2[48]);
      return var1;
   }

   final Object[] c(int var1, int var2, int var3, int var4, int var5, int var6) {
      ++f_qb;
      Object[] var8 = this.S;
      Object[] var7 = kba.a(var5, var4, var3, var2, var1, var8, var6, 0, new Object[3]);
      return var7;
   }

   final void b(float var1, float var2, float var3, float[] var4) {
      ++W;
      Object[] var5 = this.S;
      float var6 = ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[15] + var1 * ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[3] + ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[7] * var2 + ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[11] * var3;
      float var7 = var2 * ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[4] + ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[12] + ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[0] * var1 + ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[8] * var3;
      float var8 = var3 * ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[9] + ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[13] + ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[1] * var1 + var2 * ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[5];
      float var9 = ((float[])((float[])((Object[])((Object[])var5[28]))[0]))[2] * var1 + ((float[])((float[])((Object[])((Object[])var5[28]))[0]))[14] + ((float[])((float[])((Object[])((Object[])var5[28]))[0]))[6] * var2 + ((float[])((float[])((Object[])((Object[])var5[28]))[0]))[10] * var3;
      var4[1] = var8 * ((float[])((float[])var5[0]))[10] / var6 + ((float[])((float[])var5[0]))[15];
      var4[0] = ((float[])((float[])var5[0]))[4] + ((float[])((float[])var5[0]))[9] * var7 / var6;
      var4[2] = var9;
   }

   final void a(za var1) {
      hp.a(var1, false, this.S);
      ++Jc;
   }

   final Object[] E() {
      ++f_wc;
      Object[] var2 = this.S;
      Object[] var1;
      if(null != var2 && var2.length == 87) {
         var1 = sja.a(true, var2);
      } else {
         if(null == var2 || var2.length != 91) {
            throw new IllegalStateException();
         }

         var1 = qra.a((byte)97, var2);
      }

      return var1;
   }

   final void p(int var1, int var2, int var3) {
      mfa.a(var3, var1, this.S, -83, var2);
      ++zb;
   }

   final void a(float var1, float var2, float var3, float[] var4) {
      ++Ob;
      fj.a(10, var4, var2, var1, this.S, var3);
   }

   final boolean y() {
      ++Wb;
      return gma.a(this.S, -85);
   }

   final za a(int var1) {
      ++f_kc;
      return tv.a(this.S, var1, false);
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, Class_s var7, int var8, int var9, int var10, int var11, int var12) {
      ++f_ob;
      joa.a(this.S, var6, var12, var7, var8, var2, (byte)61, var3, var5, var11, var10, var9, var4, var1);
   }

   final void a(int var1, Object[] var2) {
      ++f_ab;
      Class_is.a(-6991, var1, this.S, var2);
   }

   final void t() {
      ++f_pb;
      Object[] var1 = this.S;
      if(null != var1 && 87 == var1.length) {
         long var2 = IDirect3DDevice.CreateEventQuery(((long[])((long[])var1[50]))[5]);
         if(fna.a(IDirect3DEventQuery.Issue(var2), (byte)-117)) {
            if(var1 != null && (var1.length == 14 || var1.length == 4 && var1[1].equals(Integer.valueOf(0)) && var1[1].equals(Integer.valueOf(2)))) {
               this.c();
            }

            while(true) {
               int var4 = IDirect3DEventQuery.IsSignaled(var2);
               if(1 != var4) {
                  break;
               }

               Thread.yield();
            }
         }

         IUnknown.Release(var2);
      } else {
         if(null == var1 || 91 != var1.length) {
            throw new IllegalStateException();
         }

         OpenGL.glFinish();
      }

   }

   final gv a(Canvas var1, int var2, int var3) {
      ++f_nc;
      Object[] var5 = this.S;
      gv var4;
      if(null != var5 && var5.length == 87) {
         var4 = vr.a(var2, -106, var1, var5, var3);
      } else {
         if(var5 == null || 91 != var5.length) {
            throw new IllegalStateException();
         }

         var4 = hpa.a(var5, var2, var1, var3, -108);
      }

      return var4;
   }

   final boolean u() {
      ++R;
      Object[] var2 = this.S;
      boolean var1;
      if(((Object[][])((Object[][])var2[12]))[1] != null && !ji.a((int)18845, ((Object[][])((Object[][])var2[12]))[1])) {
         Object[] var4 = (Object[])((Object[])var2[4]);
         Object[] var5 = ((Object[][])((Object[][])var2[12]))[1];
         int var7 = ((Vector)var4[14]).size();
         boolean var6;
         if(!pda.b(94, var5) && !bc.a(var5, (byte)100)) {
            if(var5 == null) {
               throw new IllegalStateException();
            }

            ((boolean[])((boolean[])var5[1]))[0] = false;
            ((Vector)var4[14]).removeElement(var5);
            var6 = true;
         } else {
            ((Vector)var4[14]).insertElementAt(var5, var7);
            mia.a(var5, ((int[])((int[])var4[1]))[0], ((int[])((int[])var4[1]))[2], -93);
            int var8;
            if(var5 == null) {
               var8 = ho.a(var5, (byte)123);
            } else {
               byte var9 = 1;
               var8 = var9;
            }

            var6 = true;
            if(~var8 < ~((int[])((int[])var4[1]))[1]) {
               ((int[])((int[])var4[1]))[1] = var8;
            }

            ((boolean[])((boolean[])var5[1]))[0] = true;
         }

         var1 = var6;
      } else {
         var1 = false;
      }

      return var1;
   }

   final void d(Object[] var1) {
      rna.a(this.S, var1, 37);
      ++Tb;
   }

   final void UA(float var1, float var2) {
      ++f_pc;
      ur.a(this.S, var1, var2, false);
   }

   final boolean n() {
      ++Kb;
      boolean var1 = true;
      return var1;
   }

   final void b(int var1) {
      tna.a(this.S, var1, (byte)120);
      ++f_hb;
   }

   final re b(int var1, int var2) {
      ++Qb;
      Object[] var4 = this.S;
      re var3;
      if(null != var4 && var4.length == 87) {
         Object[] var6;
         re var5 = (re)(null != (var6 = lp.a((byte)-100, var2, var1, vk.f, hf.d, new Object[6], var4))?var6[4]:null);
         var3 = var5;
      } else {
         if(var4 == null || var4.length != 91) {
            throw new IllegalStateException();
         }

         var3 = fi.a(var2, 5, var1, var4);
      }

      return var3;
   }

   final void TA(int[] var1) {
      ++f_jc;
      Object[] var2 = this.S;
      var1[0] = ((int[])((int[])var2[1]))[16];
      var1[1] = ((int[])((int[])var2[1]))[1];
      var1[3] = ((int[])((int[])var2[1]))[26];
      var1[2] = ((int[])((int[])var2[1]))[2];
   }

   final void a() {
      ++L;
      loa.a((byte)-97, this.S);
   }

   final boolean p() {
      ++Mb;
      return mka.a((byte)-118, this.S);
   }

   final void c(Object[] var1) {
      aia.a(93, this.S, var1);
      ++f_rb;
   }

   final void b(Object[] var1) {
      ju.a(var1, (byte)-17, this.S);
      ++f_cb;
   }

   static final float a(int var0, byte var1, float var2, float var3, float var4) {
      ++Ib;
      float[] var5 = tka.p[var0];
      int var6 = 36 % ((-7 - var1) / 52);
      return var4 * var5[2] + var3 * var5[1] + var2 * var5[0];
   }

   final aa a(int var1, int var2, int[][] var3, int[][] var4, int var5, int var6, int var7) {
      ++yb;
      Object[] var9 = this.S;
      Object[] var10;
      aa var8 = (aa)((var10 = li.a(var7, (byte)126, var1, var6, var5, var2, var4, new Object[24], var9, var3)) == null?null:var10[2]);
      return var8;
   }

   final int XA() {
      ++Bb;
      Object[] var2 = this.S;
      int var1 = ((int[])((int[])var2[1]))[34] + ((int[])((int[])var2[1]))[17] + ((int[])((int[])var2[1]))[32];
      return var1;
   }

   final cga a(int var1, int var2, boolean var3, boolean var4) {
      ++f_mb;
      Object[] var6 = this.S;
      Object[] var7;
      cga var5 = (cga)(null == (var7 = gga.a(var1, new Object[6], 12, var4, var3, var2, var6))?null:var7[2]);
      return var5;
   }

   final void e() {
      ++f_ec;
      Object[] var1 = this.S;
      if(((Object[][])((Object[][])var1[12]))[1] != null && ji.a((int)18845, ((Object[][])((Object[][])var1[12]))[1])) {
         Object[] var2 = (Object[])((Object[])var1[4]);
         Object[] var3 = ((Object[][])((Object[][])var1[12]))[1];
         if(var3 == null) {
            throw new IllegalStateException();
         }

         ((boolean[])((boolean[])var3[1]))[0] = false;
         ((Vector)var2[14]).removeElement(var3);
      }

   }

   final hsa f() {
      ++f_jb;
      return vi.a((byte)116, this.S);
   }

   final void d(int var1) {
      ++f_vb;
   }

   final int x() {
      ++Sb;
      Object[] var2 = this.S;
      int var1 = ((int[])((int[])var2[1]))[12] - 2;
      return var1;
   }

   final void PA(int[] var1) {
      cja.a(this.S, var1, (byte)102);
      ++f_lb;
   }

   final void B() {
      ++Lb;
      Object[] var1 = this.S;
      if(var1 != null && 87 == var1.length) {
         db.b((byte)-64, var1);
      } else {
         if(var1 == null || var1.length != 91) {
            throw new IllegalStateException();
         }

         nfa.a(var1, -115);
      }

   }

   final Object[] k() {
      ++f_dc;
      Object[] var2 = this.S;
      Object[] var1 = (Object[])((Object[])var2[47]);
      return var1;
   }

   final void b(int var1, int var2, int var3, int var4, int var5, int var6) {
      ++K;
      Object[] var7 = this.S;
      gl.a(var2, var2, var5, var7, (byte)87, var1, var3 + var1, var6);
      gl.a(var2 + var4, var2 + var4, var5, var7, (byte)-113, var1, var1 + var3, var6);
      gl.a(var4 + var2, var2, var5, var7, (byte)-71, var1, var1, var6);
      gl.a(var4 + var2, var2, var5, var7, (byte)90, var3 + var1, var3 + var1, var6);
   }

   final int a(int var1, int var2) {
      ++f_sb;
      int var3 = var2 | var1;
      return var3;
   }

   final void a(boolean var1) {
      ++f_cc;
      Object[] var2 = this.S;
      if((var2 == null || var2.length != 87) && (null == var2 || var2.length != 91 || client.f_vb != 0)) {
         throw new IllegalStateException();
      }
   }

   final void ka(float var1) {
      ++O;
      rg.a(var1, this.S, 0);
   }

   final boolean d() {
      ++f_ic;
      return kt.b(-121, this.S);
   }

   final void c(int var1) {
      ++Q;
   }

   final void c(boolean var1) {
      ++Ic;
      av.a(var1, this.S, 0);
   }

   final ka a(ii var1, int var2, int var3, int var4, int var5) {
      ++f_gb;
      return dfa.a(var3, var5, this.S, var4, var2, 27856, var1);
   }

   final void Z(int var1, int var2) {
      ++f_fc;
      rka.a((byte)-84, var2, this.S, var1);
   }

   final void a(Object[] var1) {
      ++Gb;
      Object[] var2 = this.S;
      sea.a(var1, (Object[])((Object[])var2[33]), (byte)103);
      mf.b((byte)-83, var2);
      if(var2[24] == bsa.b) {
         gpa.a(var2, (int)120);
      }

   }

   final void r(int var1, int var2, int var3, int var4, int var5, int var6) {
      ld.a(var4, 61, var2, var3, this.S, var5, var6, var1);
      ++Xb;
   }

   final int a(int var1, int var2, int var3, int var4, int var5, int var6) {
      ++Ac;
      return fi.a(true, var2, var3, var5, var1, this.S, var6, var4);
   }

   final lua e(int var1, int var2) {
      ++P;
      return om.a(-31525, var1, var2, this.S);
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      pma.a(this.S, var1, var3, var7, var6, var5, 83, var4, var2);
      ++xc;
   }

   final void V(int var1, int var2, int var3, int var4) {
      qda.a((byte)96, var3, this.S, var2, var4, var1);
      ++Vb;
   }

   final void S(int var1, int var2, int var3, int var4, int var5) {
      rea.a(var5, this.S, var4, -10640, var3, var2, var1);
      ++Fc;
   }

   final boolean m() {
      ++f_lc;
      return wha.a(this.S, (int)2);
   }

   final Object[] c() {
      ++f_ib;
      return poa.a(this.S, (byte)124);
   }

   final int d(int var1, int var2) {
      ++f_uc;
      int var3 = var2 ^ var2 & var1;
      return var3;
   }

   final void b(int var1, int var2, int var3, int var4) {
      ++Ec;
      Object[] var5 = this.S;
      bta.a(var2, var3, var4, var1, -23920, (Object[])((Object[])var5[4]));
   }

   final void a(int var1, Object[][] var2) {
      ++T;
      Object[] var3 = this.S;

      for(int var4 = 0; var1 > var4; ++var4) {
         ((Object[][])((Object[][])var3[30]))[var4] = var2[var4];
      }

      ((int[])((int[])var3[1]))[37] = var1;
      if(var3[24] == bsa.b) {
         no.a(var3, 63);
      }

      if(var3 != null && -2 == ~var3.length) {
         this.p();
      }

   }

   final Object[] a(Object[] var1, Object[] var2, float var3, Object[] var4) {
      ++Y;
      return up.a(var1, var4, -30180, var2, this.S, var3);
   }

   final void g(int var1) {
      iw.a(var1, 125, this.S);
      ++Dc;
   }

   final void C() {
      ++N;
      Class_k.a(this.S, (int)9);
   }

   final Class_s a(int var1, int var2, int[] var3, int[] var4) {
      ++f_fb;
      Object[] var6 = this.S;
      Object[] var8;
      int var10;
      int var11;
      int var12;
      if(oa.a(var6, vk.f, (byte)-92, br.f)) {
         byte[] var9 = new byte[var1 * var2];
         var10 = 0;

         while(true) {
            if(var10 >= var2) {
               if(var6 != null && var6.length == 15) {
                  return (Class_s)((Object[])((Object[])this.S[8]))[1];
               }

               var8 = sga.a(new Object[2], (byte)-47, var2, var9, var1, var6);
               break;
            }

            if(var6 != null && (var6.length == 3 || var6.length == 14 || -6 == ~var6.length)) {
               return null;
            }

            var11 = var3[var10] + var10 * var1;

            for(var12 = 0; var12 < var4[var10]; ++var12) {
               var9[var11++] = -1;
            }

            ++var10;
         }
      } else {
         int[] var14 = new int[var1 * var2];

         for(var10 = 0; var10 < var2; ++var10) {
            var11 = var3[var10] + var1 * var10;
            if(null != var6 && (-3 == ~var6.length || var6.length == 13 || var6.length == 13)) {
               this.a(67, -120);
            }

            for(var12 = 0; var12 < var4[var10]; ++var12) {
               var14[var11++] = -16777216;
            }
         }

         var8 = dua.a(var6, var1, var14, (byte)12, var2, new Object[2]);
         if(var6 != null && var6.length == 6) {
            return null;
         }
      }

      Class_s var5 = (Class_s)(null != var8?var8[1]:null);
      return var5;
   }

   final void T(int var1, int var2, int var3, int var4, int var5) {
      pma.a((byte)-111, var4, this.S, var3, var1, var2, var5);
      ++Nb;
   }

   final void a(int var1, int var2, float var3, int var4, int var5, float var6, int var7, int var8, float var9, int var10, int var11, int var12, int var13) {
      ++U;
   }

   final void i() {
      ++Zb;
      Object[] var1 = this.S;
      Object[] var2 = (Object[])((Object[])var1[4]);
      if(((boolean[])((boolean[])var2[8]))[0]) {
         qn.a(var2, (byte)35);
         ((boolean[])((boolean[])var2[8]))[0] = false;
      }

   }

   final boolean g() {
      ++zc;
      Object[] var2 = this.S;
      boolean var1 = ((boolean[])((boolean[])var2[63]))[7];
      return var1;
   }

   fma(Object[] var1, qa var2) {
      super(var2);
      this.S = var1;
   }

   static final int c(int var0, Object[] var1) {
      ++Gc;
      if(((byte[])((byte[])var1[2]))[((int[])((int[])var1[1]))[0]] >= 0) {
         int var2 = de.a(var0 ^ var0, var1);
         return 32767 == var2?-1:var2;
      } else {
         return lr.a(1, var1) & Integer.MAX_VALUE;
      }
   }

   final void b(boolean var1) {
      gj.a(this.S, 127, var1);
      ++yc;
   }

   final cga a(int[] var1, int var2, int var3, int var4, int var5, boolean var6) {
      ++f_nb;
      Object[] var8 = this.S;
      Object[] var11 = new Object[6];
      aa.a(var11, 1);
      lga.a((byte)103, var11);
      var11[2] = rca.a(var11, (byte)113);
      var11[3] = null;
      var11[0] = var8;
      ((int[])((int[])var11[1]))[3] = var5;
      ((int[])((int[])var11[1]))[4] = var4;
      var11[4] = fg.a(var1, var8, 51, false, var4, var5, var2, var3);
      pa.a(false, true, (Object[])((Object[])var11[4]), true);
      ((boolean[])((boolean[])var11[5]))[1] = il.c((byte)-120, (Object[])((Object[])var11[4])) != var4;
      if(var8 != null && var8.length == 11) {
         this.g(-14);
      }

      ((boolean[])((boolean[])var11[5]))[4] = cua.a(true, (Object[])((Object[])var11[4])) != var5;
      ((boolean[])((boolean[])var11[5]))[0] = !((boolean[])((boolean[])var11[5]))[1] && Class_i.a((int)84, (Object[])((Object[])var11[4]));
      ((boolean[])((boolean[])var11[5]))[3] = !((boolean[])((boolean[])var11[5]))[4] && Class_i.a((int)65, (Object[])((Object[])var11[4]));
      ul.a((Object[])((Object[])var11[0]), 12, -122);
      cga var7 = (cga)(var11 == null?null:var11[2]);
      return var7;
   }

   final int[] Y(int var1, int var2, int var3, int var4) {
      ++Jb;
      Object[] var6 = this.S;
      int[] var5;
      if(null != var6 && var6.length == 87) {
         var5 = kja.a(0, var4, var1, var6, var3, var2);
      } else {
         if(null == var6 || var6.length != 91) {
            throw new IllegalStateException();
         }

         int[] var8 = new int[var3 * var4];
         int var9 = ((ta)var6[38]).E.d();

         for(int var10 = 0; var10 < var4; ++var10) {
            OpenGL.glReadPixelsi(var1, -1 + -var10 + (var9 - var2), var3, 1, '\u80e1', ((int[])((int[])var6[1]))[40], var8, var3 * var10);
         }

         if(var6 != null && (var6.length == 9 || -10 == ~var6.length)) {
            this.a((aea)this.S[1], false);
         }

         var5 = var8;
      }

      return var5;
   }

   final void a(int var1, int var2, int var3, int var4) {
      dd.a(var1, var4, (byte)-65, var3, var2, this.S);
      ++Hb;
   }

   final void FA(int var1, float var2, float var3, float var4, float var5, float var6) {
      ++Yb;
      Object[] var7 = this.S;
      boolean var8 = ~var1 != ~((int[])((int[])var7[1]))[3];
      if(var8 || var2 != ((float[])((float[])var7[0]))[8] || ((float[])((float[])var7[0]))[0] != var3) {
         ((float[])((float[])var7[0]))[0] = var3;
         ((int[])((int[])var7[1]))[3] = var1;
         ((float[])((float[])var7[0]))[8] = var2;
         if(var8) {
            ((float[])((float[])var7[0]))[3] = (float)(255 & ((int[])((int[])var7[1]))[3]) / 255.0F;
            ((float[])((float[])var7[0]))[2] = (float)('\uff00' & ((int[])((int[])var7[1]))[3]) / 65280.0F;
            ((float[])((float[])var7[0]))[11] = (float)(16711680 & ((int[])((int[])var7[1]))[3]) / 1.671168E7F;
            eg.a((byte)-100, var7);
         }

         cna.a((byte)48, var7);
      }

      if(((float[])((float[])var7[60]))[0] != var4 || var5 != ((float[])((float[])var7[60]))[1] || ((float[])((float[])var7[60]))[2] != var6) {
         ((float[])((float[])var7[60]))[0] = var4;
         ((float[])((float[])var7[60]))[1] = var5;
         ((float[])((float[])var7[60]))[2] = var6;
         ((float[])((float[])var7[5]))[0] = -var4;
         ((float[])((float[])var7[5]))[2] = -var6;
         ((float[])((float[])var7[5]))[1] = -var5;
         float var9 = (float)(1.0D / Math.sqrt((double)(var5 * var5 + var4 * var4 + var6 * var6)));
         ((float[])((float[])var7[53]))[1] = var9 * var5;
         ((float[])((float[])var7[53]))[2] = var9 * var6;
         ((float[])((float[])var7[53]))[0] = var9 * var4;
         ((float[])((float[])var7[62]))[0] = -((float[])((float[])var7[53]))[0];
         ((float[])((float[])var7[62]))[1] = -((float[])((float[])var7[53]))[1];
         ((float[])((float[])var7[62]))[2] = -((float[])((float[])var7[53]))[2];
         dw.a(false, var7);
         ((int[])((int[])var7[1]))[27] = (int)(256.0F * var4 / var5);
         if(var7 != null && (var7.length == 1 || 2 == var7.length)) {
            ((boolean[])((boolean[])this.S[2]))[0] = true;
         }

         ((int[])((int[])var7[1]))[6] = (int)(256.0F * var6 / var5);
      }

      ql.a(var7, 0);
   }

   final void s() {
      ++f_rc;
      qe.a((byte)-112, this.S);
   }

   final boolean A() {
      ++f_qc;
      return gka.a((byte)123, this.S);
   }

   final void j(int var1) {
      ++f_bc;
      Object[] var2 = this.S;
      int var3 = var1;

      for(((int[])((int[])var2[1]))[5] = 0; var3 > 1; ++((int[])((int[])var2[1]))[5]) {
         var3 >>= 1;
      }

      ((int[])((int[])var2[1]))[38] = 1 << ((int[])((int[])var2[1]))[5];
      if(null == var2 || 5 != var2.length || !var2[0].equals(Integer.valueOf(2))) {
         ;
      }
   }

   final void e(int var1, int var2, int var3, int var4, int var5, int var6) {
      gl.a(var4, var2, var5, this.S, (byte)84, var1, var3, var6);
      ++V;
   }

   final boolean o() {
      ++M;
      return hca.a(this.S, (int)28069);
   }

   final void b(int var1, Object[] var2) {
      ++Cc;
      mga.a(this.S, var2, var1, (byte)-90);
   }

   final ja a(Object[] var1, aea[] var2, boolean var3) {
      ++f_tb;
      return ksa.a(var2, var3, var1, this.S, -21);
   }

   final void g(int var1, int var2) {
      ++Rb;
      kk.a(var1, 0, this.S, var2);
   }

   final cga a(aea var1, boolean var2) {
      ++f_ub;
      Object[] var4 = this.S;
      cga var5;
      if(var1.a != 0 && var1.h != 0) {
         int[] var6 = new int[var1.a * var1.h];
         int var7 = 0;
         int var8 = 0;
         int var9;
         int var10;
         if(null == var1.e) {
            for(var9 = 0; var9 < var1.h; ++var9) {
               for(var10 = 0; var1.a > var10; ++var10) {
                  int var11 = var1.f_i[255 & var1.c[var7++]];
                  var6[var8++] = 0 != var11?var11 | -16777216:0;
               }

               if(null != var4 && -12 == ~var4.length && var4[6].equals(Integer.valueOf(1))) {
                  ((byte[])((byte[])this.S[0]))[16] = 70;
               }
            }

            if(var4 != null && (var4.length == 9 || var4.length == 9 && var4[7].equals(Integer.valueOf(1)))) {
               this.S[2] = ((Object[])((Object[])this.S[3]))[7];
            }
         } else {
            if(null != var4 && var4.length == 2) {
               this.a(30, 116, -90, ((int[])((int[])this.S[6]))[2], 97, -8, (Class_s)null, ((int[])((int[])this.S[0]))[6], -106, 59, -32, -100);
            }

            for(var9 = 0; ~var9 > ~var1.h; ++var9) {
               if(var4 != null && var4.length == 8) {
                  this.a(((int[])((int[])this.S[2]))[1], -61, (int[])null, (int[])null);
               }

               for(var10 = 0; ~var10 > ~var1.a; ++var10) {
                  var6[var8++] = var1.e[var7] << 24 | var1.f_i[var1.c[var7] & 255];
                  ++var7;
               }
            }
         }

         var5 = ((ta)var4[38]).a(var1.a, -7343, 0, var6, var1.h, var1.a);
      } else {
         var5 = ((ta)var4[38]).a(1, -7343, 0, new int[]{0}, 1, 1);
      }

      var5.a(var1.f, var1.b, var1.d, var1.g);
      return var5;
   }

   final void HA(int var1, int var2, int var3, int var4, int var5) {
      ++f_sc;
      tha.a(var1, var2, var3, var4, -1, this.S, var5);
   }

   final void EA(int var1, Class_s var2, int var3, int var4) {
      fe.a(2, this.S, var1, var4, var2, var3);
      ++f_kb;
   }

   final boolean z() {
      ++Cb;
      boolean var1 = true;
      return var1;
   }

   static final int a(boolean var0, Object[] var1) {
      ++Pb;
      if(var0) {
         a(-105, ((byte[])((byte[])var1[1]))[0], ((float[])((float[])var1[3]))[4], 2.035789F, ((float[])((float[])var1[13]))[4]);
      }

      ((int[])((int[])var1[1]))[0] += 2;
      int var2 = (((byte[])((byte[])var1[2]))[-2 + ((int[])((int[])var1[1]))[0]] - 128 & 255) + (((byte[])((byte[])var1[2]))[((int[])((int[])var1[1]))[0] - 1] << 8 & '\uff00');
      if(var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   final void h(int var1) {
      bua.a(this.S, 40, var1);
      ++f_eb;
   }

   final void b() {
      ag.b(-7145, this.S);
      ++f_tc;
   }

   final void oa(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9) {
      vm.a(var7, var3, var5, var4, this.S, var2, var6, var8, var1, 112, var9);
      ++Ub;
   }

   static final int a(Object[] var0, int var1, int var2) {
      if(var2 != 3) {
         return -7;
      } else {
         ++gc;
         return ((int[])((int[])var0[40]))[var1];
      }
   }

   final boolean D() {
      ++f_ac;
      Object[] var2 = this.S;
      boolean var1 = null != ((Object[][])((Object[][])var2[12]))[1];
      return var1;
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      jo.a(var3, var9, var8, var5, var2, var6, var1, (byte)-64, var7, var4, this.S);
      ++f_db;
   }

   final boolean w() {
      ++xb;
      return op.b(0, this.S);
   }

   static {
      for(int var0 = 0; var0 < 104; ++var0) {
         X[var0] = new Rectangle();
      }

   }
}
