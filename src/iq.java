import jaggl.OpenGL;

final class iq {

   static int b;
   static int d;
   static int[] c = new int[1];
   static Object[] e = sd.a(new Object[1], 14, (byte)113);
   static int f;
   static int a;


   static final ni a(Object[] var0, byte var1) {
      ++b;
      int var2 = -94 / ((82 - var1) / 35);
      return new ni(var0);
   }

   static final boolean a(ta var0, byte var1, Object[] var2) {
      int var3 = -50 % ((var1 + 71) / 49);
      ++d;
      Object[] var4 = (Object[])((Object[])woa.a(5, var2)[1]);
      return ala.a((int)((float[])((float[])var4[1]))[1] >> qqa.e, (int)((float[])((float[])var4[1]))[2] >> qqa.e, 125, ((byte[])((byte[])var2[10]))[1], dca.a(true, var2));
   }

   static final boolean a(byte var0, Object[] var1) {
      if(var0 >= -70) {
         a((ta)e[16], (byte)39, (Object[])((Object[])e[2]));
      }

      ++a;
      return null != var1[33] && bia.a((byte)57, (Object[])((Object[])var1[33]));
   }

   static final Object[] a(boolean var0, int var1, Object[] var2, byte[] var3, int var4, byte var5, Object[] var6) {
      if(null == var6[3]) {
         var6[3] = new boolean[2];
      }

      if(var6[1] == null) {
         var6[1] = new int[3];
      }

      ++f;
      if(var6 != null && var6.length == 26 && var6[6].equals(Integer.valueOf(1)) && var6[6].equals(Integer.valueOf(1))) {
         return null;
      } else {
         wea.c(-6574, var6);
         var6[0] = oc.b(var6, (byte)24);
         var6[2] = var2;
         ((boolean[])((boolean[])var6[3]))[0] = var0;
         ((int[])((int[])var6[1]))[0] = var4;
         ((int[])((int[])var6[1]))[2] = var1;
         OpenGL.glGenBuffersARB(1, mda.d, 0);
         ((int[])((int[])var6[1]))[1] = mda.d[0];
         lta.b(-32356, var6);
         OpenGL.glBufferDataARBub(var1, ((int[])((int[])var6[1]))[0], var3, 0, !((boolean[])((boolean[])var6[3]))[0]?'\u88e4':'\u88e0');
         ((int[])((int[])((Object[])((Object[])var6[2]))[1]))[19] += ((int[])((int[])var6[1]))[0];
         if(var5 <= 52) {
            c = (int[])null;
         }

         return var6;
      }
   }

}
