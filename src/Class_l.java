import com.ms.awt.WComponentPeer;
import com.ms.com.IUnknown;
import com.ms.directX.DDSurfaceDesc;
import com.ms.directX.DirectDraw;
import com.ms.directX.IEnumModesCallback;
import com.ms.win32.User32;
import java.awt.Frame;

final class Class_l implements IEnumModesCallback {

   private DirectDraw a;
   private static int[] c;
   private static int b;


   final void a(Frame var1, int var2) {
      this.a.restoreDisplayMode();
      this.a.setCooperativeLevel(var1, 8);
      if(var2 != -31839) {
         this.a(-54);
      }

   }

   private Class_l() throws Throwable {
      throw new Error();
   }

   final int[] a(int var1) {
      this.a.enumDisplayModes(0, (DDSurfaceDesc)null, (IUnknown)null, this);
      c = new int[b];
      b = 0;
      this.a.enumDisplayModes(0, (DDSurfaceDesc)null, (IUnknown)null, this);
      int[] var2 = c;
      c = null;
      if(var1 != -21223) {
         this.callbackEnumModes((DDSurfaceDesc)null, (IUnknown)null);
      }

      b = 0;
      return var2;
   }

   public final void callbackEnumModes(DDSurfaceDesc var1, IUnknown var2) {
      if(c == null) {
         b += 4;
      } else {
         c[b++] = var1.width;
         c[b++] = var1.height;
         c[b++] = var1.rgbBitCount;
         c[b++] = var1.refreshRate;
      }

   }

   final void a(int var1, int var2, Frame var3, int var4, int var5, int var6) {
      var3.setVisible(true);
      WComponentPeer var7 = (WComponentPeer)var3.getPeer();
      int var8 = var7.getHwnd();
      User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
      User32.SetWindowLong(var8, -20, 8);
      this.a.setCooperativeLevel(var3, 17);
      if(var1 <= -56) {
         this.a.setDisplayMode(var4, var5, var2, var6, 0);
         var3.setBounds(0, 0, var4, var5);
         var3.toFront();
         var3.requestFocus();
      }
   }
}
