import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

final class qea {

   static int d;
   static int a;
   static int b;
   static int c;


   static final void a(byte var0, Object[] var1) {
      ++c;
      wba.a((int)-16671, var1);
      DataBufferInt var2 = new DataBufferInt((int[])((int[])var1[6]), ((int[])((int[])var1[6])).length);
      DirectColorModel var3 = new DirectColorModel(32, 16711680, '\uff00', 255);
      if(var0 <= 52) {
         a((byte)-67, (Object[])null);
      }

      WritableRaster var4 = Raster.createWritableRaster(var3.createCompatibleSampleModel(((int[])((int[])var1[1]))[0], ((int[])((int[])var1[1]))[1]), var2, (Point)null);
      var1[7] = new BufferedImage(var3, var4, false, new Hashtable());
   }

   static final void a(Object[] var0, int var1) {
      ++a;
      ((int[])((int[])var0[1]))[var1] = -1;
      ((boolean[])((boolean[])var0[2]))[0] = false;
      var0[0] = new String[0];
   }

   static final Object[] a(Object[] var0, byte var1) {
      ++d;
      int var2 = -26 % ((54 - var1) / 61);
      if(null == var0[1]) {
         var0[1] = new int[5];
      }

      if(null == var0[0]) {
         var0[0] = new byte[1];
      }

      return var0;
   }

   static final int b(Object[] var0, byte var1) {
      if(var1 != 50) {
         return -80;
      } else {
         ++b;
         if(((int[])((int[])var0[1]))[3] == 0) {
            fg.d(var1 - 49, var0);
            ((int[])((int[])var0[1]))[3] = 256;
         }

         return ((int[])((int[])var0[2]))[-1 + ((int[])((int[])var0[1]))[3]];
      }
   }

}
