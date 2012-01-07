import jagdx.IDirect3DDevice;
import java.awt.Frame;

final class opa {

   static int h;
   static int m;
   static int d;
   static int k;
   static int f_i;
   static Object[] j = ho.a(-1, 42, new Object[1], true);
   static int f_l;
   static Object[] f = st.a(new Object[1], 7, 51, 20);
   static int[] c = new int[32];
   static Frame g;
   static String a;
   static int e = 73;
   static int[] b = new int[1014];


   static final void a(int var0, int var1, int var2, int var3) {
      var2 <<= 3;
      var3 <<= var0;
      var1 <<= 3;
      ++k;
      qv.f_i = (float)var2;
      if(4 == ha.e) {
         qaa.r = var2;
         kk.f_l = var1;
         cp.a = var3;
      }

      sma.h = (float)var3;
      woa.a((byte)36);
      aoa.b = true;
   }

   static final void a(Object[] var0, int var1) {
      ++h;
      efa.a((Object[])((Object[])var0[3]), '\u0001', 0);
      nha.a((Object[])((Object[])var0[0]), 18806, 1);
      int var2 = 25 / ((-31 - var1) / 33);
      moa.a((byte)95, (Object[])null, (Object[])((Object[])var0[0]));
      nha.a((Object[])((Object[])var0[0]), 18806, 0);
   }

   static final void a(byte var0, Object[] var1, ta var2) {
      ++f_i;
      if(var0 > -47) {
         a((Object[])null, true);
      }

   }

   static final Object[] a(int var0, byte var1, Object[] var2) {
      if(var1 < 104) {
         return (Object[])null;
      } else {
         ++m;
         fra.a(var2, -110);
         mua.a((byte)107, var2);
         var2[2] = li.a(true, var2);
         ((int[])((int[])var2[1]))[3] = var0;
         return var2;
      }
   }

   static final boolean a(int var0) {
      ++f_l;
      if(var0 != -1) {
         j = (Object[])null;
      }

      return nma.h > 0;
   }

   static final void a(Object[] var0, boolean var1) {
      ++d;
      if(var0 != null && 87 == var0.length) {
         if(((boolean[])((boolean[])var0[78]))[((int[])((int[])var0[1]))[7]]) {
            ((boolean[])((boolean[])var0[78]))[((int[])((int[])var0[1]))[7]] = false;
            IDirect3DDevice.SetTexture(((long[])((long[])var0[50]))[5], ((int[])((int[])var0[1]))[7], 0L);
            eo.a(var0, (byte)-99);
            sn.a(var0, (byte)-83);
         }

      } else if(null != var0 && 91 == var0.length) {
         pka.a((int)1, var0);
      } else if(!var1) {
         throw new IllegalStateException();
      }
   }

}
