import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

final class eoa extends RuntimeException {

   static int a;
   String f;
   static Object[] g;
   static int e = 0;
   Throwable c;
   static Object[] b;
   static int h;
   static int d;


   static final boolean a(boolean var0) {
      if(!var0) {
         return true;
      } else {
         ++a;
         return hp.a((byte)-66, "jaclib");
      }
   }

   static final int a(int var0, Object[] var1) {
      if(var0 != -19129) {
         return -40;
      } else {
         ++d;
         return ag.a(var1, false);
      }
   }

   eoa(Throwable var1, String var2) {
      this.f = var2;
      this.c = var1;
      this.initCause(var1);
   }

   static final void a(int var0) {
      ++h;
      if(gf.b == null) {
         int var1 = pa.f_i;
         int var2 = mr.e;
         if(var0 <= -69) {
            int var3 = -var1 + -wr.n + rp.a;
            int var4 = -var2 + (jma.h - nma.a);
            if(var1 > 0 || var3 > 0 || 0 < var2 || var4 > 0) {
               try {
                  Object var5;
                  if(null != opa.g) {
                     var5 = opa.g;
                  } else {
                     var5 = kqa.h;
                  }

                  int var6 = 0;
                  int var7 = 0;
                  if(opa.g == var5) {
                     Insets var8 = opa.g.getInsets();
                     var6 = var8.left;
                     var7 = var8.top;
                  }

                  Graphics var10 = ((Container)var5).getGraphics();
                  var10.setColor(Color.black);
                  if(var1 > 0) {
                     var10.fillRect(var6, var7, var1, jma.h);
                  }

                  if(0 < var2) {
                     var10.fillRect(var6, var7, rp.a, var2);
                  }

                  if(0 < var3) {
                     var10.fillRect(-var3 + var6 + rp.a, var7, var3, jma.h);
                  }

                  if(0 < var4) {
                     var10.fillRect(var6, var7 + jma.h + -var4, rp.a, var4);
                  }
               } catch (Exception var9) {
                  ;
               }
            }

         }
      }
   }

}
