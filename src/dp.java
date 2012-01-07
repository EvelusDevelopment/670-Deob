import jaggl.OpenGL;

final class dp extends hsa {

   static int z;
   static int v;
   static int C;
   static int u;
   static int D;
   static int s;
   static int o;
   static int p;
   static int n;
   static int B;
   static int r = -1;
   private Object[] x;
   static int w;
   static int t;
   static int q = 0;
   static int m;
   static int A;
   static int y = 0;
   static int f_l = 0;


   dp(Object[] var1) {
      this.x = var1;
   }

   final void a(lua var1) {
      try {
         ++z;
         Object[] var2 = this.x;
         if(null != var2 && 6 == var2.length) {
            Object[] var5 = ng.a((re)var1, 58);
            if(null != var1) {
               if(-1 == ~((int[])((int[])var2[5]))[0]) {
                  ((int[])((int[])var2[5]))[4] = pc.a((byte)-123, var5).b();
                  ((int[])((int[])var2[5]))[3] = pc.a((byte)-85, var5).c();
                  il.b((byte)97, var2);
               } else if(~((int[])((int[])var2[5]))[3] != ~pc.a((byte)-104, var5).c() || ~((int[])((int[])var2[5]))[4] != ~pc.a((byte)-68, var5).b()) {
                  throw new RuntimeException();
               }

               var2[3] = var5;
               ((int[])((int[])var2[5]))[0] |= 16;
            } else {
               var2[3] = null;
               ((int[])((int[])var2[5]))[0] &= -17;
               if(((int[])((int[])var2[5]))[0] == 0) {
                  ((int[])((int[])var2[5]))[3] = 0;
                  ((int[])((int[])var2[5]))[4] = 0;
               }
            }

            Object[] var4;
            if((null != var2?var2[1]:null) != ((ta)(null == (var4 = (Object[])((Object[])var2[4]))?null:var4[38])).e(30626)) {
               ((int[])((int[])var2[5]))[1] |= 16;
            } else {
               ada.a(3, var2);
            }
         } else {
            if(null == var2 || 7 != var2.length) {
               throw new IllegalStateException();
            }

            sia.a(var1, var2, (byte)-98);
         }

      } catch (RuntimeException var7) {
         throw vt.a(var7, "dp.J(" + (var1 != null?"{...}":"null") + ')');
      }
   }

   final void b(byte var1) throws Throwable {
      if(var1 != -65) {
         a((float[])((float[])((Object[])((Object[])this.x[4]))[5]), -50, (Object[])null);
      }

      ++B;
      super.finalize();
   }

   final int d() {
      ++o;
      Object[] var2 = this.x;
      int var1;
      if(var2 != null && -7 == ~var2.length) {
         var1 = hp.a(var2, (byte)-26);
      } else {
         if(null == var2 || var2.length != 7) {
            throw new IllegalStateException();
         }

         var1 = rga.a(var2, (byte)114);
      }

      return var1;
   }

   static final float[] a(float[] var0, int var1, Object[] var2) {
      int var3 = 10 / ((var1 + 23) / 44);
      ++m;
      float var4 = ((float[])((float[])var2[0]))[2] + ((float[])((float[])var2[0]))[3];
      float var5 = ((float[])((float[])var2[0]))[6] + ((float[])((float[])var2[0]))[7];
      float var6 = ((float[])((float[])var2[0]))[11] + ((float[])((float[])var2[0]))[10];
      double var7 = Math.sqrt((double)(var5 * var5 + var4 * var4 + var6 * var6));
      var0[3] = (float)((double)(((float[])((float[])var2[0]))[15] + ((float[])((float[])var2[0]))[14]) / var7);
      var0[2] = (float)((double)var6 / var7);
      var0[1] = (float)((double)var5 / var7);
      var0[0] = (float)((double)var4 / var7);
      return var0;
   }

   final void a(int var1, re var2) {
      try {
         ++C;
         Object[] var3 = this.x;
         if(null != var3 && 6 == var3.length) {
            ft.a(var1, var3, 127, var2);
         } else {
            if(null == var3 || -8 != ~var3.length) {
               throw new IllegalStateException();
            }

            int var4 = 1 << var1;
            Object[] var5 = ts.a(-7865, var2);
            if(var2 == null) {
               ((int[])((int[])var3[3]))[1] &= ~var4;
               ((Object[][])((Object[][])var3[6]))[var1] = null;
               if(((boolean[])((boolean[])var3[5]))[0]) {
                  ks.a(var1, var3, 0L, (byte)-114);
               }

               if(0 == ((int[])((int[])var3[3]))[1]) {
                  ((int[])((int[])var3[3]))[2] = 0;
                  ((int[])((int[])var3[3]))[0] = 0;
               }
            } else {
               if(((int[])((int[])var3[3]))[1] == 0) {
                  ((int[])((int[])var3[3]))[0] = iea.b(6, var5).b();
                  ((int[])((int[])var3[3]))[2] = iea.b(6, var5).c();
                  il.b((byte)114, var3);
               } else if(~((int[])((int[])var3[3]))[2] != ~iea.b(6, var5).c() || ((int[])((int[])var3[3]))[0] != iea.b(6, var5).b()) {
                  throw new RuntimeException();
               }

               ((int[])((int[])var3[3]))[1] |= var4;
               ((Object[][])((Object[][])var3[6]))[var1] = var5;
               if(((boolean[])((boolean[])var3[5]))[0]) {
                  ks.a(var1, var3, dca.b(var5, 6), (byte)-57);
               }
            }
         }

      } catch (RuntimeException var7) {
         throw vt.a(var7, "dp.B(" + var1 + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

   final int e() {
      ++p;
      return ft.a((byte)-125, this.x);
   }

   static final void a(lm var0, Object[] var1, byte var2) {
      ++w;
      if(var2 != 88) {
         r = -23;
      }

      if(var0.d != null) {
         var0.a((byte)56);
      }

      var0.d = (lm)var1[0];
      var0.f = ((lm)var1[0]).f;
      var0.d.f = var0;
      var0.f.d = var0;
   }

   protected final void finalize() throws Throwable {
      ++n;
      Object[] var1 = this.x;
      if(null != var1 && -7 == ~var1.length) {
         ((dp)var1[1]).b((byte)-65);
         if(0 != ((int[])((int[])var1[5]))[2]) {
            jv.a(((int[])((int[])var1[5]))[2], (Object[])((Object[])var1[4]), false);
            ((int[])((int[])var1[5]))[2] = 0;
         }
      } else if(var1 != null && -8 == ~var1.length) {
         if(null != var1[4]) {
            Object[] var2 = (Object[])((Object[])var1[4]);
            if(null != var2 && -5 == ~var2.length) {
               lb.a((byte)-100, var2);
            } else {
               if(var2 == null || -6 != ~var2.length) {
                  throw new IllegalStateException();
               }

               if(((long[])((long[])var2[4]))[0] != 0L) {
                  el.a((Object[])((Object[])var2[0]), 122, ((long[])((long[])var2[4]))[0]);
                  ((long[])((long[])var2[4]))[0] = 0L;
               }
            }
         }

         for(int var4 = 0; ~var4 > ~((Object[])((Object[])var1[6])).length; ++var4) {
            if(null != ((Object[][])((Object[][])var1[6]))[var4]) {
               ib.a(((Object[][])((Object[][])var1[6]))[var4], (byte)-114);
            }
         }

         ((dp)var1[1]).b((byte)-65);
      } else {
         mj.b(1, var1);
      }

   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      ++A;
      Object[] var9 = this.x;
      if(null != var9 && 6 == var9.length) {
         nt.a(var8, var3, var5, var2, var7, -18714, var4, var6, var1, var9);
      } else {
         if(null == var9 || -8 != ~var9.length) {
            throw new IllegalStateException();
         }

         uma.a(var7, var5, var8, var2, var9, var3, var1, -27857, var4, var6);
      }

   }

   final boolean f() {
      ++D;
      return tsa.a((byte)91, this.x);
   }

   final boolean b() {
      ++u;
      Object[] var2 = this.x;
      boolean var1;
      if(null != var2 && var2.length == 6) {
         OpenGL.glBindFramebufferEXT('\u8d40', 0);
         boolean var3 = true;
         var1 = var3;
      } else {
         if(var2 == null || var2.length != 7) {
            throw new IllegalStateException();
         }

         var1 = jea.a(var2, (int)6);
      }

      return var1;
   }

   final void c() {
      ++s;
      gh.a(true, this.x);
   }

   final boolean a() {
      ++t;
      return hh.b(this.x, 123);
   }

}
