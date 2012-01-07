
final class wda {

   static int c = -1;
   static Object[] d = ho.a(-1, 56, new Object[1], true);
   static int a;
   static int b;


   static final int a(Object[] var0, byte var1) {
      ++b;
      return var1 >= -57?-58:(var0[16] != null?((ka)var0[16]).ra():0);
   }

   static final Object[] a(int var0, int var1, int var2, int var3, int var4, Object[] var5, int var6, byte var7, int var8, int var9, int var10, int var11, boolean var12) {
      if(var5[13] == null) {
         var5[13] = new short[4];
      }

      if(var5[10] == null) {
         var5[10] = new byte[3];
      }

      if(var5[8] == null) {
         var5[8] = new boolean[5];
      }

      ++a;
      ct.a(var5, true);
      ((byte[])((byte[])var5[var4]))[0] = (byte)var1;
      ((byte[])((byte[])var5[10]))[1] = (byte)var0;
      sra.a(var5, bl.a((byte)-103, (float)var6, new Object[2], (float)var2, (float)var8), 1);
      ((short[])((short[])var5[13]))[3] = (short)var11;
      ((short[])((short[])var5[13]))[0] = (short)var10;
      ((short[])((short[])var5[13]))[1] = (short)var9;
      if(null != var5 && (-6 == ~var5.length && var5[0].equals(Integer.valueOf(2)) && var5[0].equals(Integer.valueOf(1)) || var5.length == 7)) {
         return null;
      } else {
         ((byte[])((byte[])var5[10]))[2] = var7;
         ((boolean[])((boolean[])var5[8]))[4] = var12;
         ((short[])((short[])var5[13]))[2] = (short)var3;
         return var5;
      }
   }

}
