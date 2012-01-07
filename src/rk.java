import java.io.OutputStream;

final class rk {

   static int e;
   static int d;
   static Object[] c = ed.a(28, new Object[1], (byte)-124, 59);
   static int b;
   static int a;


   static final void a(Object[] var0, float var1, byte var2) {
      ((float[])((float[])var0[0]))[0] *= var1;
      ++e;
      ((float[])((float[])var0[0]))[3] *= var1;
      ((float[])((float[])var0[0]))[1] *= var1;
      ((float[])((float[])var0[0]))[2] *= var1;
      if(var2 < 32) {
         a((byte)117, (OutputStream)((Object[])((Object[])var0[1]))[0], (Object[])null, -71);
      }

   }

   static final Object[] a(byte var0, OutputStream var1, Object[] var2, int var3) {
      ana.newIAS3I1Wrapper(var2);
      ++a;
      lu.setWrapperI1S0V0$I1S2P0(0, var2);
      if(null != var2 && (-10 == ~var2.length || -24 == ~var2.length || var2.length == 2 && var2[0].equals(Boolean.valueOf(false)) && var2[0].equals(Boolean.valueOf(false)))) {
         a((byte)-59, (OutputStream)null, (Object[])null, -60);
      }

      OutputStreamWorker var6 = new OutputStreamWorker(var2);
      ((int[])((int[])var2[1]))[1] = var3 + 1;
      var2[0] = var6;
      var2[4] = var1;
      var2[2] = new byte[((int[])((int[])var2[1]))[1]];
      var2[5] = new Thread((Runnable)(var2 != null? var2[0]:null));
      ((Thread)var2[5]).setDaemon(true);
      ((Thread)var2[5]).start();
      return var2;
   }

   static final void a(boolean var0) {
      ++b;
      ro.a();
      if(!var0) {
         for(int var1 = 0; var1 < 4; ++var1) {
            kh.a(-69, hj.f_i[var1]);
         }

         pc.d = null;
         mqa.j = -1;
         pa.a(0);
         il.a(-96);
         System.gc();
         lna.g.Z(2, 0);
      }
   }

}
