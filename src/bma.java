import jagdx.IDirect3DDevice;
import sun.misc.Unsafe;

final class bma extends oqa {

   static int f_i;
   static int j;
   static int f_l;
   static int k;
   static int m = 0;
   static int n;
   static int o;


   static final gn b(Object[] var0, int var1) {
      if(var1 != 8) {
         a(true, (Object[])((Object[])((Object[])((Object[])var0[0]))[3]));
      }

      ++n;
      return new gn(var0);
   }

   static final Object[] a(Object[] var0, int var1) {
      ++o;
      loa.a(var0, (byte)5);
      uca.a(var1, var0, false, true);
      np.a(46, var0);
      return var0;
   }

   static final void b(int var0, Object[] var1) {
      ++f_i;
      int var2;
      if(((boolean[])((boolean[])var1[8]))[1]) {
         for(var2 = 0; var2 < ((float[])((float[])var1[5])).length; ++var2) {
            ((Unsafe)((Object[])((Object[])var1[11]))[36]).putFloat((long)(var2 * 4) + ((long[])((long[])((Object[])((Object[])var1[11]))[50]))[0], ((float[])((float[])var1[5]))[var2]);
         }

         IDirect3DDevice.SetVertexShaderConstantF(((long[])((long[])((Object[])((Object[])var1[11]))[50]))[5], 0, ((long[])((long[])((Object[])((Object[])var1[11]))[50]))[0], ((float[])((float[])var1[5])).length / 4);
         if(null != var1 && var1.length == 13 && var1[2].equals(Integer.valueOf(0)) && var1[2].equals(Integer.valueOf(0))) {
            return;
         }

         ((boolean[])((boolean[])var1[8]))[1] = false;
      }

      if(((boolean[])((boolean[])var1[8]))[2]) {
         for(var2 = 0; var2 < ((float[])((float[])var1[7])).length; ++var2) {
            ((Unsafe)((Object[])((Object[])var1[11]))[36]).putFloat(((long[])((long[])((Object[])((Object[])var1[11]))[50]))[0] - -((long)(4 * var2)), ((float[])((float[])var1[7]))[var2]);
         }

         IDirect3DDevice.SetPixelShaderConstantF(((long[])((long[])((Object[])((Object[])var1[11]))[50]))[5], 0, ((long[])((long[])((Object[])((Object[])var1[11]))[50]))[0], ((float[])((float[])var1[7])).length / 4);
         ((boolean[])((boolean[])var1[8]))[2] = false;
         if(null != var1 && -2 == ~var1.length) {
            return;
         }
      }

      if(var0 != 0) {
         k = 50;
      }

   }

   static final void a(boolean var0, Object[] var1) {
      ((boolean[])((boolean[])var1[8]))[4] = var0;
      ((int[])((int[])var1[12]))[8] = 0;
      ++j;
      ((int[])((int[])var1[12]))[6] = -1;
      ((int[])((int[])var1[12]))[9] = -1;
      ((int[])((int[])var1[12]))[3] = 0;
   }

   private bma(String var1, boolean var2) {
      super(var1);
   }

   bma(String var1) {
      this(var1, false);
   }

}
