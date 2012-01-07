
final class tga {

   static Object[] e = sd.a(new Object[1], 47, (byte)127);
   static int[] c = new int[]{0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4};
   static int f;
   static int d;
   static int a;
   static int b;


   static final void a(byte var0, Object[] var1, int var2) {
      ++d;
      int var3 = -38 / ((-60 - var0) / 46);
      aha.a(0.003921569F * (float)(('\uff0a' & var2) >> 8), (float)(var2 >> 24 & 255) * 0.003921569F, 0.003921569F * (float)((var2 & 16772266) >> 16), (float)((var2 & 255) >> 0) * 0.003921569F, var1, (byte)-74);
   }

   static final void a(Object[] var0, byte var1) {
      ((boolean[])((boolean[])var0[8]))[4] = true;
      ++f;
      if(var1 > -116) {
         e = (Object[])null;
      }

   }

   static final int a(int var0, Object[] var1) {
      ++b;
      int var2 = ((byte[])((byte[])var1[2]))[((int[])((int[])var1[var0]))[0]] & 255;
      return var2 >= 128?de.a((int)0, var1) - '\u8000':fh.a(var1, false);
   }

   static final int a(byte var0, Object[] var1) {
      ++a;
      int var2 = 124 % ((-80 - var0) / 37);
      return ((int[])((int[])var1[12]))[3];
   }

}
