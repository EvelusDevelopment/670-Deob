
final class lsa implements Runnable {

   private ta e;
   private volatile boolean f = true;
   private int g;
   private Object[] f_i;
   private Object[][] a = new Object[8][];
   private float[] c = new float[3];
   private long h;
   private volatile boolean b = false;
   private volatile boolean d = true;


   public final void run() {
      while(this.f) {
         this.a();
      }

   }

   final void a(Object[] var1) {
      if(this.f_i != null) {
         ra.a(2, this.f_i, (lsa)null);
      }

      this.f_i = var1;
      if(this.f_i != null) {
         ra.a(2, this.f_i, this);
      }

   }

   private final void a() {
      this.e.h(this.g);

      label136:
      while(!this.d && this.f) {
         if(this.f_i != null) {
            Object[] var6 = this.f_i;
            boolean var5 = -1 == ~((int[])((int[])var6[1]))[0];
            if(!var5) {
               this.b = true;
               Object[] var8 = this.f_i;
               nj var9 = null;
               synchronized(var8[3]) {
                  var9 = om.a((Object[])((Object[])var8[3]), false);
                  var9.a(1);
                  --((int[])((int[])var8[1]))[0];
               }

               if(var9 instanceof fe) {
                  fe var2;
                  Object[] var10000 = (var2 = (fe)var9) == null?null:var2.m;
                  Object[] var10 = var10000;
                  if(var10000 != null && var10.length != 9) {
                     fe var3;
                     Object[] var24 = (var3 = (fe)var9) == null?null:var3.m;
                     if(((boolean[])((boolean[])var24[8]))[3]) {
                        tja.a(mpa.b, (byte)108, var24);
                     } else {
                        lra.a(var24, this.a);
                        if(fo.e != null) {
                           fo.e.a(112, -256, ((int[])((int[])var24[12]))[2], (String)this.f_i[0], ((int[])((int[])var24[12]))[1], -16777216);
                        }
                     }
                     continue;
                  }
               }

               cva var4;
               int var11 = ((int[])((int[])((var4 = (cva)var9) == null?null:var4.m)[1]))[0];
               if(var11 < 1 || var11 > 4) {
                  continue;
               }

               aa var12 = jp.o[var11 - 1];
               int var13 = 0;

               while(true) {
                  if(var13 >= vt.d + vt.d) {
                     continue label136;
                  }

                  for(int var14 = 0; var14 < vt.d + vt.d; ++var14) {
                     if(rka.e[var11 - 1][var13][var14]) {
                        int var15 = bd.h - vt.d + var13;
                        int var16 = oaa.a - vt.d + var14;
                        if(var15 >= 0 && var15 < var12.f_i && var16 >= 0 && var16 < var12.h) {
                           mpa.b.b((float)(var15 << qqa.e), (float)var12.b(-59, var16, var15), (float)(var16 << qqa.e), this.c);
                           if(ioa.a((int)this.c[0]) == this.g - 1) {
                              var12.a(var15, var16);
                           }
                        }
                     }
                  }

                  ++var13;
               }
            }
         }

         this.b = false;
         this.h = mt.a(10, ui.a);
         synchronized(this) {
            try {
               this.wait();
            } catch (InterruptedException var21) {
               ;
            }
         }
      }

      this.e.c(this.g);

      while(this.d && this.f) {
         synchronized(this) {
            try {
               this.wait();
            } catch (InterruptedException var19) {
               ;
            }
         }
      }

   }

   final long f() {
      return this.h;
   }

   final void e() {
      this.d = true;
      synchronized(this) {
         this.notify();
      }
   }

   final boolean b() {
      boolean var1 = this.f_i == null;
      if(!var1) {
         boolean var2 = !this.b;
         if(var2) {
            Object[] var4 = this.f_i;
            boolean var3 = 0 == ((int[])((int[])var4[1]))[0];
            var2 = var3;
         }

         var1 = var2;
      }

      return var1;
   }

   final void d() {
      this.d = false;
      this.f = false;
      synchronized(this) {
         this.notify();
      }
   }

   final void c() {
      this.d = false;
      synchronized(this) {
         this.notify();
      }
   }

   lsa(int var1, ta var2) {
      this.g = var1;
      this.e = var2;
   }
}
