import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;

final class cu implements Runnable {

   static int[] a;
   static Object[] c = st.a(new Object[1], 7, 61, 6);
   static int e = 0;
   private Object[] d;
   static int b;


   public final void run() {
      ++b;
      Object[] var1 = this.d;

      while(true) {
         Object[] var5;
         synchronized(var1[1]) {
            lm var7 = jca.b((byte)127, (Object[])((Object[])var1[1]));
            if(var1 != null && var1.length == 21) {
               return;
            }

            for(; null == var7; var7 = jca.b((byte)-116, (Object[])((Object[])var1[1]))) {
               try {
                  var1[1].wait();
               } catch (InterruptedException var11) {
                  ;
               }
            }

            iia var3;
            if(!(var7 instanceof iia) || ((var3 = (iia)var7) == null?null:var3.q) == null) {
               return;
            }

            iia var4;
            var5 = (var4 = (iia)var7) == null?null:var4.q;
         }

         int var6;
         try {
            byte[] var14 = InetAddress.getByName((String)var5[2]).getAddress();
            var6 = jagmisc.ping(var14[0], var14[1], var14[2], var14[3], 1000L);
         } catch (Throwable var12) {
            var6 = 1000;
         }

         ((int[])((int[])var5[1]))[0] = var6;
      }
   }

   static final Object[] a(int var0, int var1, int var2) {
      Object[] var3 = ju.g[var0][var1][var2];
      return var3 == null?null:(Object[])((Object[])var3[4]);
   }

   cu(Object[] var1) {
      this.d = var1;
   }

}
