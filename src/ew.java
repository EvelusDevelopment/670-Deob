import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.util.Date;

final class ew extends lm {

   static int m;
   static Object[] f_l;
   static int j;
   Object[] k;


   ew(Object[] var1) {
      this.k = var1;
   }

   static final int a(byte var0, Object[] var1, int var2, int var3) {
      ++j;
      Graphics var4 = ((Component)var1[5]).getGraphics();
      if(var0 < 71) {
         f_l = (Object[])null;
      }

      var4.drawImage((Image)var1[7], var3, var2, (ImageObserver)var1[5]);
      return 0;
   }

   static final void a(long var0, int var2) {
      if(var2 != 9921) {
         a(-111L, -8);
      }

      ot.b.setTime(new Date(var0));
      ++m;
   }

}
