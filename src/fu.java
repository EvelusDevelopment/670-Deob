import java.applet.Applet;
import netscape.javascript.JSObject;

final class fu {

   static final void a(byte var0, String var1, Applet var2) throws Throwable {
      if(var0 == -56) {
         JSObject.getWindow(var2).eval(var1);
      }
   }

   static final Object a(String var0, boolean var1, Applet var2) throws Throwable {
      return var1?(Object)null:JSObject.getWindow(var2).call(var0, (Object[])null);
   }

   static final Object a(Applet var0, Object[] var1, int var2, String var3) throws Throwable {
      return var2 >= -46?var1[0]:JSObject.getWindow(var0).call(var3, var1);
   }
}
