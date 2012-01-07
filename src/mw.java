import jaggl.OpenGL;

final class mw {

   static int c;
   private Object[] d;
   static int f_i;
   static int f;
   static int b;
   static int h;
   static int g;
   static Object[] a = sj.a(4, new Object[3], (byte)-67);
   static Object[] e = ed.a(-1, new Object[1], (byte)-104, 92);


   static final void a(byte var0) {
      if(var0 != -117) {
         a(((int[])((int[])e[0]))[2], (byte)-5);
      }

      ++b;
      if(kfa.e) {
         while(~tca.d > ~ft.n.length) {
            Object[] var1 = ft.n[tca.d];
            if(var1 != null && 0 == ~((int[])((int[])var1[0]))[4]) {
               if(js.h == null) {
                  js.h = oea.a(os.k, (String)var1[2], var0 + 118);
               }

               int var2 = ((int[])((int[])js.h[1]))[0];
               if(-1 == var2) {
                  return;
               }

               ((int[])((int[])var1[0]))[4] = var2;
               ++tca.d;
               js.h = null;
            } else {
               ++tca.d;
            }
         }

      }
   }

   protected final void finalize() throws Throwable {
      ++f_i;
      oja.a((byte)47, this.d);
   }

   final void a(int var1) throws Throwable {
      ++f;
      if(var1 != 10) {
         a((byte)93);
      }

      super.finalize();
   }

   static final boolean a(int var0, int var1, boolean var2, boolean var3, int var4, int var5, int var6, int var7, int var8) {
      ++c;
      int var9 = ((int[])((int[])uta.g[33]))[0];
      int var10 = ((int[])((int[])uta.g[14]))[0];
      if(var9 >= 0 && rp.c > var9 && var10 >= 0 && var10 < wpa.a) {
         if(var8 >= 0 && var8 < rp.c && var6 >= 0 && var6 < wpa.a) {
            int var11 = wta.a(ega.a, var8, var6, rba.c, var10, hj.f_i[((byte[])((byte[])uta.g[10]))[0]], -1, var7, var1, gn.a(uta.g, (byte)-121), var0, var5, var4, var3, var9);
            if(var11 < 1) {
               return false;
            } else {
               em.c = ega.a[var11 - 1];
               if(!var2) {
                  return false;
               } else {
                  qs.g = rba.c[var11 - 1];
                  uh.d = false;
                  Object[] var12 = la.a(0, 0L, 15);
                  aia.a(var12, 1);
                  return true;
               }
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   static final float a(int var0, byte var1) {
      var0 &= 16383;
      if(var1 < 33) {
         e = new Object[2];
      }

      ++g;
      return (float)(6.283185307179586D * (double)((float)var0 / 16384.0F));
   }

   static final Object[] a(Object[] var0, String var1, int var2, int var3) {
      ++h;
      int var4 = OpenGL.glGenProgramARB();
      OpenGL.glBindProgramARB(var2, var4);
      OpenGL.glProgramStringARB(var2, var3, var1);
      OpenGL.glGetIntegerv('\u864b', nra.a, 0);
      if(-1 != nra.a[0]) {
         OpenGL.glBindProgramARB(var2, 0);
         return null;
      } else {
         OpenGL.glBindProgramARB(var2, 0);
         return ip.a(var2, 17, new Object[3], var4, var0);
      }
   }

   mw(Object[] var1) {
      this.d = var1;
   }

}
