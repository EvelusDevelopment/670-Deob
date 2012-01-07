import java.awt.Component;

final class mp {

   static char[] f_i = new char[]{'\u20ac', '\u0000', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\u0000', '\u017d', '\u0000', '\u0000', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\u0000', '\u017e', '\u0178'};
   static int b;
   static int c;
   static int f;
   static int d;
   static int h;
   static int g;
   static Object[] e = sd.a(new Object[1], 63, (byte)120);
   static cga[] a;


   static final boolean a(int var0, String var1, String var2, String var3, String var4) {
      ++d;
      if(var0 != 8364) {
         a(false, (Object[])null);
      }

      return var2 != null && null != var4?(!var2.startsWith("#") && !var4.startsWith("#")?var1.equals(var3):var2.equals(var4)):false;
   }

   static final Object[] a(boolean var0, Object[] var1) {
      ++b;
      if(var0) {
         ((Object[])((Object[])var1[1]))[2] = e[0];
      }

      Object[][] var2 = os.b;
      synchronized(os.b) {
         if(qqa.g != 0) {
            rna.a(var1, os.b[--qqa.g], true);
            return os.b[qqa.g];
         } else {
            return mha.a((byte)123, new Object[2], var1);
         }
      }
   }

   static final void a(Object[] var0, int var1) {
      dh.a((byte)90, var0);
      int var2 = -98 % ((45 - var1) / 42);
      ++f;
   }

   static final void a(int var0, int var1, Object[] var2) {
      ++c;
      byte[] var10000 = (byte[])((byte[])var2[2]);
      int[] var10001 = (int[])((int[])var2[1]);
      int var10004 = ((int[])((int[])var2[1]))[0];
      var10001[0] = ((int[])((int[])var2[1]))[0] + 1;
      var10000[var10004] = (byte)(var1 + ts.a((Object[])((Object[])var2[3]), var0 ^ -13821));
      if(var0 != -13822) {
         a(76, (String)e[1], (String)null, (String)null, (String)null);
      }

   }

   static final void a(Object[] var0, Component var1, int var2) throws Exception {
      ++h;
      if(var2 != -11) {
         e = new Object[21];
      }

      if(var0 != null && -11 == ~var0.length) {
         np.a(var1, (byte)92, var0);
      } else {
         aga.a(var0, var1, false);
      }
   }

}
