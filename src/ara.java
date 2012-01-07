
final class ara {

   static int c;
   static int a;
   static float[] b = new float[4];


   static final String b(byte var0, Object[] var1) {
      ++c;
      int var2 = ((int[])((int[])var1[1]))[0];
      if(var0 != 61) {
         a((byte)-39, (Object[])null);
      }

      int var10004;
      byte[] var10000;
      do {
         var10000 = (byte[])((byte[])var1[2]);
         int[] var10001 = (int[])((int[])var1[1]);
         var10004 = ((int[])((int[])var1[1]))[0];
         var10001[0] = ((int[])((int[])var1[1]))[0] + 1;
      } while(var10000[var10004] != 0);

      int var3 = -var2 + (((int[])((int[])var1[1]))[0] - 1);
      if(0 == var3) {
         return "";
      } else {
         if(null != var1 && -2 == ~var1.length && var1[0].equals(Boolean.valueOf(false))) {
            ph.d = null;
         }

         return bta.a(var2, (byte)-112, (byte[])((byte[])var1[2]), var3);
      }
   }

   static final void a(byte var0, Object[] var1) {
      ++a;
      if(var1 != null) {
         hk.a((byte)125, var1);
      } else {
         if(var0 != 99) {
            ((byte[])((byte[])var1[2]))[2] = ((byte[])((byte[])var1[8]))[4];
         }

         throw new IllegalStateException();
      }
   }

}
