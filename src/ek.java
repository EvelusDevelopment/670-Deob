
final class ek {

   static int e;
   static int b;
   static vp c;
   static Object[] a = vra.a(536870911, 18, "", new Object[1]);
   static int d;


   static final void putByte(Object[] var0, int var1) {
     byte[] var10000 = (byte[])((byte[])var0[2]);
     int[] var10001 = (int[])((int[])var0[1]);
     int var10004 = ((int[])((int[])var0[1]))[0];
     var10001[0] = ((int[])((int[])var0[1]))[0] + 1;
     var10000[var10004] = (byte)var1;
     ++e;
   }

   static final void a(int var0, Object[] var1) {
      if(((int[])((int[])var1[var0]))[3] > 0) {
         fo.a(((int[])((int[])var1[1]))[3], (Object[])((Object[])var1[3]), ((int[])((int[])var1[1]))[1], var0 ^ 48);
         ((int[])((int[])var1[1]))[3] = -1;
      }
      ++d;
   }

   static final void a(boolean var0, Object[] var1) {
      synchronized(var1[0]) {
         dq.a(-117, (Object[])((Object[])var1[0]));
      }

      ++b;
      if(var0) {
         ((long[])((long[])var1[0]))[0] = -46L;
      }

   }

}
