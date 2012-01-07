import jagdx.IDirect3DDevice;
import java.math.BigInteger;

final class cr extends Exception {

   static int b;
   static int e;
   static BigInteger a = new BigInteger("b084a6d3f60db3aa4a1bd02c4ab6f9d072407833fe8afe004d39c3220ce73304edb4b9c4ec25df8a933564cb9f514ff56263db8b138c8ace41e34b73884b6ae381e2150dc2510b286cb7a07fe034c3624e49e10d833f2bcbbe094fe8aab35d789dc8f7119b56ff7aba2dc734613420c5b7f60badf1c7140031ea7e610d5b0efd9e27ff7d8a16aa679f4d722b49e45b7077dcade17f6f2df75c53911ca920281c4f8282307e6f908653124baeb0cac07f26f36a853b554674347bce2eedc71ed28fe0aaee02ef76e4ec51cc9a09667733b29e0863c7101a9dc3038927d4a2585b60c2c1023234e2cfd1910f4f6de9a44c45ed179175396ad51bae14c6bc3ed24e62ed6598d361ad9f4c658ddfaae996116b1fb0b9578550fdc3d0c843344248e1908228a121aaee94282b07c6d80203e686c16b85b3e21d00d5e1c9c23f8326d9964c20c7d8c4b3b54352622128de48e844f436ac85b6a0d2c0b32e1849bd5e3a108873e3548eea900f53cfdcc5b3cfe808935182acbff239b3d84b62b1b0f3fd0837b6b3e21fc33afd569151562cba307e24b9e73edbe896c9ac66d25d9d62fc3712aeeb47974a34aa0f544a480a5a19ac364b0a33cc95c62a636effa40317e16085c5230e78ead6cb769d9f10e973dba6fdf1d602a5b10ae4d5d0c503079682e30c3dbfc8bd249a79a5a4f487bc40901e96234862210ebeb93b240385e5e885", 16);
   static long[] f = new long[32];
   static int d;
   static Object[] c;


   static final int a(Object[] var0, byte var1) {
      ++e;
      if(var1 != -78) {
         a(new Object[14], (byte)9);
      }

      int var2 = ((int[])((int[])var0[0]))[0];
      if(3 == var2) {
         return 2;
      } else if(var2 != 1) {
         if(2 == var2) {
            return 0;
         } else if(var2 != 0) {
            throw new IllegalArgumentException();
         } else {
            return 3;
         }
      } else {
         return 1;
      }
   }

   static final void a(Object[] var0, int var1) {
      bba.a((Object[])((Object[])var0[0]), -19425);
      ++b;
      ona.a((Object[])((Object[])var0[2]), -64);
      ((int[])((int[])var0[1]))[var1] = ((int[])((int[])var0[1]))[0];
   }

   static final Object[] a(int var0, Object[] var1, int var2, int var3, Object[] var4, int var5, Object[] var6, int var7, Object[] var8) {
      dka.a(var5 ^ 2, var6);
      ++d;
      qb.a(var4, var6, var8, false, var3 * var2, var5 - 31470, var1);
      if(((boolean[])((boolean[])((Object[])((Object[])var6[0]))[63]))[24]) {
         ((int[])((int[])var6[9]))[0] = var3;
         ((int[])((int[])var6[9]))[1] = var2;
      } else {
         ((int[])((int[])var6[9]))[1] = fda.a(var2, (byte)81);
         ((int[])((int[])var6[9]))[0] = fda.a(var3, (byte)81);
      }

      ((long[])((long[])var6[2]))[var5] = IDirect3DDevice.CreateTexture(((long[])((long[])((Object[])((Object[])var6[0]))[50]))[5], var2, var3, 0, var7, wg.a((byte)78, (Object[])((Object[])var6[4]), (Object[])((Object[])var6[1])), var0);
      return var6;
   }

}
