import java.util.Calendar;
import java.util.TimeZone;

final class ot {

   static int c;
   static Object[] f = ho.a(-1, 93, new Object[1], true);
   static Calendar b = Calendar.getInstance();
   static Calendar e = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
   static int[] a = new int[2048];
   static Object[] d = ed.a(1, new Object[1], (byte)-126, 143);


   static final boolean a(boolean var0, int var1, byte[] var2, int var3, Object[] var4) {
      ++c;
      if(var0) {
         return ((boolean[])((boolean[])f[12]))[13];
      } else {
         synchronized(var4[3]) {
            if(0 <= var1 && var1 <= ((int[])((int[])var4[1]))[0]) {
               boolean var6 = nsa.a(var3, true, 4, var2, var1, var4);
               if(!var6) {
                  var6 = nsa.a(var3, false, 4, var2, var1, var4);
               }

               return var6;
            } else {
               throw new IllegalArgumentException();
            }
         }
      }
   }

}
