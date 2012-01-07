import jaggl.OpenGL;
import java.awt.Canvas;

final class fta extends ta {

   static float[] P = new float[16];
   static long W;
   static int U;
   static int T;
   static int R;
   private Object[] Q;
   static int V;
   static int K;
   static Object[] S = ed.a(29, new Object[1], (byte)-98, 144);
   static int M;
   static int N;
   static int L;
   static Object[] O = im.a(new Object[2], (int)-16365);


   final hsa f() {
      return ui.B(this.Q);
   }

   final void b(int var1) {
      ui.i(this.Q, var1);
   }

   final boolean u() {
      return ui.b(this.Q);
   }

   final int a(int var1, int var2, int var3, int var4, int var5, int var6) {
      return ui.b(this.Q, var1, var2, var3, var4, var5, var6);
   }

   final void b(float var1, float var2, float var3, float[] var4) {
      ui.a(this.Q, var1, var2, var3, var4);
   }

   final Object[] c(int var1, int var2, int var3, int var4, int var5, int var6) {
      return ui.e(this.Q, var1, var2, var3, var4, var5, var6);
   }

   final boolean n() {
      return ui.r(this.Q);
   }

   final void PA(int[] var1) {
      ui.a(this.Q, var1);
   }

   final void b(int var1, Object[] var2) {
      ui.b(this.Q, var1, var2);
   }

   final void T(int var1, int var2, int var3, int var4, int var5) {
      ui.c(this.Q, var1, var2, var3, var4, var5);
   }

   final Class_s a(int var1, int var2, int[] var3, int[] var4) {
      return ui.a(this.Q, var1, var2, var3, var4);
   }

   final void b(int var1, int var2, int var3, int var4, int var5, int var6) {
      ui.d(this.Q, var1, var2, var3, var4, var5, var6);
   }

   final void a(int var1, int var2, float var3, int var4, int var5, float var6, int var7, int var8, float var9, int var10, int var11, int var12, int var13) {
      ui.a(this.Q, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
   }

   final za a(int var1) {
      return ui.g(this.Q, var1);
   }

   final void c(float var1, float var2, float var3, float[] var4) {
      ui.c(this.Q, var1, var2, var3, var4);
   }

   final int XA() {
      return ui.o(this.Q);
   }

   final void r(int var1, int var2, int var3, int var4, int var5, int var6) {
      ui.a(this.Q, var1, var2, var3, var4, var5, var6);
   }

   final cga a(int var1, int var2, boolean var3, boolean var4) {
      return ui.a(this.Q, var1, var2, var3, var4);
   }

   final void JA(int var1, int var2, int var3, int var4) {
      ui.d(this.Q, var1, var2, var3, var4);
   }

   final Object[] c() {
      return ui.g(this.Q);
   }

   final int[] Y(int var1, int var2, int var3, int var4) {
      return ui.e(this.Q, var1, var2, var3, var4);
   }

   final void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      ui.a(this.Q, var1, var2, var3, var4, var5, var6);
   }

   final boolean m() {
      return ui.k(this.Q);
   }

   final void d(int var1) {
      ui.e(this.Q, var1);
   }

   final void g(int var1, int var2) {
      ui.g(this.Q, var1, var2);
   }

   final void S(int var1, int var2, int var3, int var4, int var5) {
      ui.a(this.Q, var1, var2, var3, var4, var5);
   }

   final void t() {
      ui.y(this.Q);
   }

   static final void a(byte var0, Object[] var1) {
      ++L;
      if(var0 > 70) {
         OpenGL.glEndList();
      }
   }

   final void e() {
      ui.j(this.Q);
   }

   final void oa(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9) {
      ui.a(this.Q, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   final lua e(int var1, int var2) {
      return ui.b(this.Q, var1, var2);
   }

   static final boolean a(Object[] var0, byte var1) {
      int var2 = -23 % ((6 - var1) / 56);
      ++T;
      return true;
   }

   final void B() {
      ui.K(this.Q);
   }

   final boolean w() {
      return ui.c(this.Q);
   }

   final void a(za var1) {
      ui.a(this.Q, var1);
   }

   final void a(int var1, Object[][] var2) {
      ui.a(this.Q, var1, var2);
   }

   static final void a(boolean var0, boolean var1, Object[] var2) {
      ++K;
      Object[] var4 = (Object[])((Object[])var2[0]);
      Object[] var3 = null == var4[57]?null:jna.a((byte)127, (Object[])((Object[])var4[57]));
      if(!var0) {
         if(null != var2[2] && var3 != null && var1) {
            efa.a((Object[])((Object[])var2[2]), '\u0000', 0);
            nha.a((Object[])((Object[])var2[0]), 18806, 1);
            moa.a((byte)121, var3, (Object[])((Object[])var2[0]));
            OpenGL.glMatrixMode(5890);
            Object[] var7 = (Object[])((Object[])((Object[])((Object[])var2[0]))[11]);
            float[] var8 = (float[])((float[])((Object[])((Object[])var2[0]))[21]);
            System.arraycopy(var7[0], 0, var8, 0, 16);
            var8[13] = 0.0F;
            var8[14] = 0.0F;
            var8[12] = 0.0F;
            var8[7] = 0.0F;
            var8[3] = 0.0F;
            var8[11] = 0.0F;
            var8[15] = 1.0F;
            OpenGL.glLoadMatrixf(var8, 0);
            OpenGL.glMatrixMode(5888);
            nha.a((Object[])((Object[])var2[0]), 18806, 0);
            ((boolean[])((boolean[])var2[1]))[0] = true;
         } else {
            db.a(770, (Object[])((Object[])var2[0]), (byte)-68, 0, '\u8578');
         }

      }
   }

   final void c(boolean var1) {
      ui.c(this.Q, var1);
   }

   final void C() {
      ui.h(this.Q);
   }

   final void ka(float var1) {
      ui.a(this.Q, var1);
   }

   final void d(Object[] var1) {
      ui.d(this.Q, var1);
   }

   final cga a(int[] var1, int var2, int var3, int var4, int var5, boolean var6) {
      return ui.a(this.Q, var1, var2, var3, var4, var5, var6);
   }

   final void a(int var1, int var2, int var3, int var4) {
      ui.b(this.Q, var1, var2, var3, var4);
   }

   final void EA(int var1, Class_s var2, int var3, int var4) {
      ui.a(this.Q, var1, var2, var3, var4);
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      ui.a(this.Q, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   final void g(int var1) {
      ui.m(this.Q, var1);
   }

   final void UA(float var1, float var2) {
      ui.a(this.Q, var1, var2);
   }

   final void a(int var1, Object[] var2) {
      ui.a(this.Q, var1, var2);
   }

   final void i() {
      ui.t(this.Q);
   }

   final boolean A() {
      return ui.d(this.Q);
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      ui.a(this.Q, var1, var2, var3, var4, var5, var6, var7);
   }

   final Object[] a(int var1, int var2, int var3, int var4, int var5, float var6) {
      return ui.a(this.Q, var1, var2, var3, var4, var5, var6);
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, Class_s var7, int var8, int var9, int var10, int var11, int var12) {
      ui.a(this.Q, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   final void h(int var1) {
      ui.c(this.Q, var1);
   }

   final void c(Object[] var1) {
      ui.b(this.Q, var1);
   }

   final boolean r() {
      return ui.p(this.Q);
   }

   final boolean q() {
      return ui.e(this.Q);
   }

   final boolean j() {
      return ui.f(this.Q);
   }

   final void a() {
      ui.q(this.Q);
   }

   final cga a(aea var1, boolean var2) {
      return ui.a(this.Q, var1, var2);
   }

   final int a(int var1, int var2) {
      return ui.e(this.Q, var1, var2);
   }

   static final void c(int var0, Object[] var1) {
      ++N;
      if(var0 != -17112) {
         d(83, (Object[])null);
      }

      if(null == var1[0]) {
         var1[0] = new int[1];
      }

   }

   final void a(int[] var1) {
      ui.b(this.Q, var1);
   }

   final void a(boolean var1) {
      ui.a(this.Q, var1);
   }

   final void p(int var1, int var2, int var3) {
      ui.a(this.Q, var1, var2, var3);
   }

   final int x() {
      return ui.w(this.Q);
   }

   static final void b(byte var0, Object[] var1) {
      ++U;
      iv.a(0, ((int[])((int[])var1[0]))[2], 0, ((int[])((int[])var1[0]))[1], ((int[])((int[])var1[0]))[3], ((int[])((int[])var1[0]))[4]);
      if(var0 != 126) {
         ((long[])((long[])((Object[])((Object[])S[1]))[4]))[1] = 35L;
      }

   }

   final re b(int var1, int var2) {
      return ui.d(this.Q, var1, var2);
   }

   final void b(Object[] var1) {
      ui.f(this.Q, var1);
   }

   final void b() {
      ui.n(this.Q);
   }

   final boolean d() {
      return ui.A(this.Q);
   }

   static final boolean a(Object[] var0, Object[] var1, byte var2) {
      ++M;
      int var5 = wia.a(0, var0);
      if(var2 >= -59) {
         return true;
      } else {
         ((tha)(null != var1?var1[6]:null)).a(8192);
         --((int[])((int[])var0[1]))[0];
         if(((int[])((int[])var0[1]))[0] != 0) {
            return wia.a(0, var0) != var5;
         } else {
            ((lm)var0[2]).a((byte)92);
            ((tha)var0[2]).a(8192);
            --fka.c;
            il.a(((long[])((long[])var1[2]))[0], var0 == null?null:var0[2], true, dla.c);
            return false;
         }
      }
   }

   final void j(int var1) {
      ui.l(this.Q, var1);
   }

   fta(Object[] var1, qa var2) {
      super(var2);
      this.Q = var1;
   }

   final boolean y() {
      return ui.E(this.Q);
   }

   final void c(int var1) {
      ui.j(this.Q, var1);
   }

   final cga a(int var1, int var2, int var3, int var4, boolean var5) {
      return ui.a(this.Q, var1, var2, var3, var4, var5);
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, Class_s var7, int var8, int var9) {
      ui.a(this.Q, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   final ja a(Object[] var1, aea[] var2, boolean var3) {
      return ui.a(this.Q, var1, var2, var3);
   }

   final ka a(ii var1, int var2, int var3, int var4, int var5) {
      return ui.a(this.Q, var1, var2, var3, var4, var5);
   }

   final Object[] a(Object[] var1, Object[] var2, float var3, Object[] var4) {
      return ui.a(this.Q, var1, var2, var3, var4);
   }

   final boolean p() {
      return ui.H(this.Q);
   }

   final void b(boolean var1) {
      ui.b(this.Q, var1);
   }

   final void FA(int var1, float var2, float var3, float var4, float var5, float var6) {
      ui.a(this.Q, var1, var2, var3, var4, var5, var6);
   }

   final void Z(int var1, int var2) {
      ui.a(this.Q, var1, var2);
   }

   final void e(int var1, int var2, int var3, int var4, int var5, int var6) {
      ui.c(this.Q, var1, var2, var3, var4, var5, var6);
   }

   final gv a(Canvas var1, int var2, int var3) {
      return ui.a(this.Q, var1, var2, var3);
   }

   final void TA(int[] var1) {
      ui.c(this.Q, var1);
   }

   final void a(float var1, float var2, float var3, float[] var4) {
      ui.b(this.Q, var1, var2, var3, var4);
   }

   final boolean g() {
      return ui.D(this.Q);
   }

   static final void d(int var0, Object[] var1) {
      ++R;
      if(var0 != 1504631792) {
         d(91, (Object[])null);
      }

      int var2 = 0;

      int var3;
      for(var3 = 0; 8 > var2; ++var2) {
         ((long[])((long[])var1[3]))[var2] = ((long)((byte[])((byte[])var1[2]))[var3 + 6] & 255L) << 8 ^ (255L & (long)((byte[])((byte[])var1[2]))[3 + var3]) << 32 ^ (long)((byte[])((byte[])var1[2]))[var3] << 56 ^ ((long)((byte[])((byte[])var1[2]))[var3 + 1] & 255L) << 48 ^ (255L & (long)((byte[])((byte[])var1[2]))[var3 + 2]) << 40 ^ (255L & (long)((byte[])((byte[])var1[2]))[4 + var3]) << 24 ^ ((long)((byte[])((byte[])var1[2]))[5 + var3] & 255L) << 16 ^ (long)((byte[])((byte[])var1[2]))[7 + var3] & 255L;
         var3 += 8;
      }

      for(var2 = 0; 8 > var2; ++var2) {
         ((long[])((long[])var1[6]))[var2] = ((long[])((long[])var1[3]))[var2] ^ (((long[])((long[])var1[7]))[var2] = ((long[])((long[])var1[0]))[var2]);
      }

      for(var2 = 1; var2 <= 10; ++var2) {
         int var4;
         int var5;
         for(var3 = 0; var3 < 8; ++var3) {
            if(var1 != null && -8 == ~var1.length) {
               pc.f = null;
            }

            ((long[])((long[])var1[5]))[var3] = 0L;
            var4 = 0;

            for(var5 = 56; var4 < 8; ++var4) {
               ((long[])((long[])var1[5]))[var3] ^= pc.g[var4][255 & (int)(((long[])((long[])var1[7]))[-var4 + var3 & 7] >>> var5)];
               var5 -= 8;
            }
         }

         if(null != var1 && var1.length == 11) {
            gu.a((Object[])null, var0 + -1504631665, (byte[])null, 92L);
         }

         for(var3 = 0; var3 < 8; ++var3) {
            ((long[])((long[])var1[7]))[var3] = ((long[])((long[])var1[5]))[var3];
         }

         ((long[])((long[])var1[7]))[0] ^= pc.f[var2];

         for(var3 = 0; 8 > var3; ++var3) {
            ((long[])((long[])var1[5]))[var3] = ((long[])((long[])var1[7]))[var3];
            if(null != var1 && var1.length == 14) {
               pc.f = null;
            }

            var4 = 0;

            for(var5 = 56; var4 < 8; var5 -= 8) {
               ((long[])((long[])var1[5]))[var3] ^= pc.g[var4][255 & (int)(((long[])((long[])var1[6]))[7 & -var4 + var3] >>> var5)];
               ++var4;
            }
         }

         for(var3 = 0; var3 < 8; ++var3) {
            ((long[])((long[])var1[6]))[var3] = ((long[])((long[])var1[5]))[var3];
         }
      }

      for(var2 = 0; var2 < 8; ++var2) {
         ((long[])((long[])var1[0]))[var2] ^= ((long[])((long[])var1[6]))[var2] ^ ((long[])((long[])var1[3]))[var2];
      }

   }

   static final void a(Object[] var0, float var1, Object[] var2, float var3, float var4, byte var5, float var6) {
      if(var5 != 21) {
         b((byte)117, (Object[])null);
      }

      gv.a(var1, -56, var4, ((Object[][])((Object[][])var0[3]))[((int[])((int[])var0[1]))[2]], var2, var3, var6);
      ++V;
   }

   final int d(int var1, int var2) {
      return ui.f(this.Q, var1, var2);
   }

   final void a(Object[] var1) {
      ui.i(this.Q, var1);
   }

   final void ra() {
      ui.i(this.Q);
   }

   final Object[] k() {
      return ui.C(this.Q);
   }

   final Object[] v() {
      return ui.F(this.Q);
   }

   final void V(int var1, int var2, int var3, int var4) {
      ui.c(this.Q, var1, var2, var3, var4);
   }

   final Object[] E() {
      return ui.z(this.Q);
   }

   final void b(int var1, int var2, int var3, int var4) {
      ui.a(this.Q, var1, var2, var3, var4);
   }

   final void s() {
      ui.J(this.Q);
   }

   final boolean o() {
      return ui.l(this.Q);
   }

   final boolean D() {
      return ui.v(this.Q);
   }

   final void HA(int var1, int var2, int var3, int var4, int var5) {
      ui.b(this.Q, var1, var2, var3, var4, var5);
   }

   final Object[] h() {
      return ui.u(this.Q);
   }

   final aa a(int var1, int var2, int[][] var3, int[][] var4, int var5, int var6, int var7) {
      return ui.a(this.Q, var1, var2, var3, var4, var5, var6, var7);
   }

   final void c(int var1, int var2) throws cr {
      ui.c(this.Q, var1, var2);
   }

   final boolean z() {
      return ui.I(this.Q);
   }

}
