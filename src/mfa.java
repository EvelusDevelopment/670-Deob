import java.math.BigInteger;

final class mfa {

   static int f;
   static Object[] d;
   static int c;
   static int e;
   static Object[] a;
   static hsa g;
   static int[] b;


   static final void a(int var0, int var1, Object[] var2, int var3, int var4) {
      int var5 = 31 / ((var3 - 30) / 54);
      ++e;
      if(((int[])((int[])var2[1]))[15] != var1 || ((int[])((int[])var2[1]))[4] != var4 || ((int[])((int[])var2[1]))[22] != var0) {
         ((int[])((int[])var2[1]))[4] = var4;
         ((int[])((int[])var2[1]))[15] = var1;
         ((int[])((int[])var2[1]))[22] = var0;
         if(var2[70] != null) {
            Object[] var6 = (Object[])((Object[])var2[70]);
            if(null != var6) {
               tea.b(false, var6);
            }
         }

         Class_s.a(var2, (byte)126);
         hoa.a(2912, var2);
      }

   }

   static final void a(Object[] var0, int var1, int var2, lua var3, Object[] var4, Object[] var5, hsa var6) {
      ++f;
      if(var1 <= -101) {
         if(var4 != null) {
            dg.a(var3, var4, var2, var5, var6, var0, (byte)106);
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final boolean a(Object[] var0, int var1) {
      ++c;
      if(var1 != -470) {
         a((Object[])((Object[])var0[40]), 79, ((int[])((int[])var0[1]))[4], (lua)var0[0], new Object[0], (Object[])((Object[])d[2]), (hsa)null);
      }

      return gs.a((Object[])((Object[])var0[18]), (int)17683);
   }

   static {
      new BigInteger("10001", 16);
      d = ho.a(-1, 2, new Object[1], true);
      a = sd.a(new Object[1], 83, (byte)123);
      g = null;
      b = new int[1];
   }
}
