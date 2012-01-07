
final class Class_j extends ka implements Class_w {

   private fa r;
   long nativeid;
   Object[][] p;
   private ia s;
   Object[][] q;


   final native byte[] B();

   final native void S();

   final void a(Object[] var1) {
      this.a(ia.f_lb, var1);
      int var2 = 0;
      int var3;
      Object[] var4;
      if(this.q != null) {
         for(var3 = 0; var3 < this.q.length; ++var3) {
            var4 = this.q[var3];
            ((int[])((int[])var4[1]))[12] = ia.f_lb[var2++];
            ((int[])((int[])var4[1]))[5] = ia.f_lb[var2++];
            ((int[])((int[])var4[1]))[4] = ia.f_lb[var2++];
            ((int[])((int[])var4[1]))[2] = ia.f_lb[var2++];
            ((int[])((int[])var4[1]))[9] = ia.f_lb[var2++];
            ((int[])((int[])var4[1]))[7] = ia.f_lb[var2++];
            ((int[])((int[])var4[1]))[0] = ia.f_lb[var2++];
            ((int[])((int[])var4[1]))[8] = ia.f_lb[var2++];
            ((int[])((int[])var4[1]))[11] = ia.f_lb[var2++];
         }
      }

      if(this.p != null) {
         for(var3 = 0; var3 < this.p.length; ++var3) {
            var4 = this.p[var3];
            Object[] var5 = var4;
            if(var4[2] != null) {
               var5 = (Object[])((Object[])var4[2]);
            }

            if(var4[0] == null) {
               var4[0] = ab.a(new Object[2], (byte)103);
            }

            aqa.a(true, var1, (Object[])((Object[])var4[0]));
            ((int[])((int[])var5[1]))[2] = ia.f_lb[var2++];
            ((int[])((int[])var5[1]))[1] = ia.f_lb[var2++];
            ((int[])((int[])var5[1]))[3] = ia.f_lb[var2++];
         }
      }

   }

   final native void G(int var1);

   private final native void k(ia var1);

   final native boolean m();

   final native int da();

   final void f() {}

   final native void UA(int var1);

   final void c() {
      if(this.s.T > 1) {
         synchronized(this) {
            while(this.f) {
               try {
                  this.wait();
               } catch (InterruptedException var4) {
                  ;
               }
            }

            this.f = true;
         }
      }

   }

   final native void W(int var1);

   final native int ga();

   final native void TA();

   final native int pa();

   final void a(Object[] var1, lpa var2, int var3) {
      if(var2 == null) {
         this.s.F().a(this, var1, (int[])null, var3);
      } else {
         ia.W[5] = 0;
         this.s.F().a(this, var1, ia.W, var3);
         var2.f_i = ia.W[0];
         var2.f_l = ia.W[1];
         var2.n = ia.W[2];
         var2.m = ia.W[3];
         var2.j = ia.W[4];
         var2.k = ia.W[5] != 0;
      }

   }

   final native boolean XA();

   final native ya p(ya var1);

   final native int RA();

   final native int D();

   final boolean d() {
      return true;
   }

   final void a(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7) {
      this.J(this.nativeid, var1, var2, var3, var4, var5, var6, var7);
   }

   private final void a(int[] var1, Object[] var2) {
      this.s.F().a(this, var1, var2);
   }

   final boolean a(int var1, int var2, Object[] var3, boolean var4, int var5) {
      return this.s.F().a(this, var1, var2, var3, var4);
   }

   final native void fa(int var1);

   final native int ra();

   final native void EA(int var1);

   final native void i(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8);

   final void e() {
      if(this.s.T > 1) {
         synchronized(this) {
            this.f = false;
            this.notifyAll();
         }
      }

   }

   final ka a(byte var1, int var2, boolean var3) {
      return this.s.F().a(this, var1, var2, var3);
   }

   final Object[][] a() {
      return this.q;
   }

   final void a(int var1, int var2, int var3, int var4) {}

   final native void ta(int var1, int var2, aa var3, aa var4, int var5, int var6, int var7);

   final native int N();

   final native void YA(int var1, int var2, int var3, int var4);

   final native void v(int var1, int var2, int var3);

   final native int va();

   final native int BA();

   final native void I(byte var1, byte[] var2);

   final native void q(short var1, short var2);

   final void a(ka var1, int var2, int var3, int var4, boolean var5) {
      this.s.F().a(this, var1, var2, var3, var4, var5);
   }

   private final native void J(long var1, int var3, int[] var4, int var5, int var6, int var7, int var8, boolean var9);

   final native int MA();

   private final native void ZA(ia var1, fa var2, int var3, int var4, int[] var5, int[] var6, int[] var7, int[] var8, short[] var9, int var10, short[] var11, short[] var12, short[] var13, byte[] var14, byte[] var15, byte[] var16, byte[] var17, short[] var18, short[] var19, int[] var20, byte var21, short[] var22, int var23, byte[] var24, short[] var25, short[] var26, short[] var27, int[] var28, int[] var29, int[] var30, byte[] var31, byte[] var32, int[] var33, int[] var34, int[] var35, int[] var36, int var37, int var38, int var39, int var40, int var41, int var42, int[] var43);

   final native boolean QA();

   private final native void A(float[] var1, int var2, boolean var3);

   final native void DA(short var1, short var2);

   final Object[][] b() {
      return this.p;
   }

   final native void ua(Class_j var1, Class_j var2, int var3, boolean var4, boolean var5);

   final native void K(int var1, int var2, int var3);

   final native void C(int var1);

   final void a(Object[] var1, int var2, boolean var3) {
      Object[] var4 = this.s.F().d;
      aqa.a(true, var1, var4);
      this.A((float[])((float[])var4[0]), var2, var3);
   }

   public final native void o(boolean var1);

   final native int LA();

   final native void O(int var1);

   protected final void finalize() {
      if(this.nativeid != 0L) {
         lla.a(-57, this);
      }

   }

   Class_j(ia var1, fa var2, ii var3, int var4, int var5, int var6, int var7) {
      this.s = var1;
      this.r = var2;
      this.q = var3.s;
      this.p = var3.q;
      int var8 = var3.s == null?0:var3.s.length;
      int var9 = var3.q == null?0:var3.q.length;
      int var10 = 0;
      int[] var11 = new int[var8 * 3 + var9];

      int var12;
      for(var12 = 0; var12 < var8; ++var12) {
         var11[var10++] = ((int[])((int[])this.q[var12][1]))[10];
         var11[var10++] = ((int[])((int[])this.q[var12][1]))[3];
         var11[var10++] = ((int[])((int[])this.q[var12][1]))[6];
      }

      for(var12 = 0; var12 < var9; ++var12) {
         var11[var10++] = ((int[])((int[])this.p[var12][1]))[0];
      }

      var12 = var3.v == null?0:var3.v.length;
      int[] var13 = new int[var12 * 8];
      int var14 = 0;

      int var15;
      Object[] var16;
      for(var15 = 0; var15 < var12; ++var15) {
         var16 = var3.v[var15];
         Object[] var17 = hsa.a(((int[])((int[])var16[0]))[0], -84);
         var13[var14++] = ((int[])((int[])var16[0]))[3];
         var13[var14++] = ((int[])((int[])var17[1]))[2];
         var13[var14++] = ((int[])((int[])var17[1]))[0];
         var13[var14++] = ((int[])((int[])var17[1]))[1];
         var13[var14++] = ((int[])((int[])var17[1]))[4];
         var13[var14++] = ((int[])((int[])var17[1]))[3];
         var13[var14++] = ((boolean[])((boolean[])var17[0]))[0]?-1:0;
      }

      for(var15 = 0; var15 < var12; ++var15) {
         var16 = var3.v[var15];
         var13[var14++] = ((int[])((int[])var16[0]))[1];
      }

      this.ZA(this.s, this.r, var3.u, var3.g, var3.f_l, var3.h, var3.z, var3.f_i, var3.e, var3.I, var3.p, var3.b, var3.J, var3.C, var3.D, var3.d, var3.n, var3.A, var3.y, var3.m, var3.c, var3.x, var3.k, var3.G, var3.r, var3.F, var3.E, var3.H, var3.j, var3.t, var3.f, var3.K, var3.B, var3.w, var3.o, var11, var8, var9, var4, var5, var6, var7, var13);
   }

   Class_j(ia var1) {
      this.s = var1;
      this.r = null;
      this.k(var1);
   }
}
