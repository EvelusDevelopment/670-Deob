import java.math.BigInteger;

final class mj {

   static int e;
   static int b;
   static String[] a = new String[1000];
   static int d;
   static int c;


   static final void b(int var0, Object[] var1) throws Throwable {
      ++b;
      ((dp)var1[var0]).b((byte)-65);
   }

   static final vda a(int var0, Object[] var1) {
      if(var0 != 0) {
         return (vda)null;
      } else {
         ++e;
         return new vda(var1);
      }
   }

   static final void a(Object[] var0, int var1) {
      ++d;
      if(var1 != 8505) {
         a((Object[])null, -73);
      }

      if(var0[1] == null) {
         var0[1] = new int[1];
      }

   }

   static final void a(boolean var0, BigInteger var1, BigInteger var2, Object[] var3) {
      ++c;
      int var4 = ((int[])((int[])var3[1]))[0];
      ((int[])((int[])var3[1]))[0] = 0;
      byte[] var5 = new byte[var4];
      Class_h.a((byte)-71, var4, var3, var5, 0);
      BigInteger var6 = new BigInteger(var5);
      BigInteger var7 = var6.modPow(var2, var1);
      if(var3 != null && (var3.length == 1 || var3.length == 9 && var3[7].equals(Boolean.valueOf(false)))) {
         vs.a((String)null, (byte)14);
      }

      byte[] var8 = var7.toByteArray();
      if(!var0) {
         ((int[])((int[])var3[1]))[0] = 0;
         eda.putShort(var3, var8.length);
         lr.a(var8.length, var8, 20244, 0, var3);
      }
   }

}
