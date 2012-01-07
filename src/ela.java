import java.io.File;
import java.nio.Buffer;
import java.nio.ByteBuffer;

final class ela {

   static int e;
   static int c;
   static String b;
   static int h;
   static String f;
   static Object[] g;
   static int j;
   static int a;
   static int f_i;
   static qa d;


   static final Object[] a(byte var0, int var1, Object[] var2, int var3, byte[] var4, Object[] var5) {
      if(var0 != -25) {
         a((Object[])null, -10);
      }

      ++j;
      var2[1] = pqa.a(var2, var0 + 128);
      var2[0] = lp.a(false, br.f, var1, var4, var5, (byte)-127, var3, br.f, vk.f);
      pda.a(false, false, (Object[])((Object[])var2[0]), false);
      return var2;
   }

   static final boolean a(int var0, byte var1, int var2) {
      ++a;
      if(var1 >= -17) {
         f = (String)g[1];
      }

      boolean var3 = false;
      boolean var5 = 0 != (var0 & 2048);
      return var3 & var5;
   }

   static final boolean a(int var0, String var1) {
      ++c;
      if(null != var1) {
         for(int var2 = 0; kl.k > var2; ++var2) {
            if(var1.equalsIgnoreCase(toa.j[var2])) {
               return true;
            }

            if(var1.equalsIgnoreCase(jpa.c[var2])) {
               return true;
            }
         }

         if(var0 != 1) {
            d = (qa)null;
         }

         return false;
      } else {
         return false;
      }
   }

   static final void a(int var0, Object[] var1) {
      var1[17] = mc.a(var0 - 70, var1, false);
      ++h;
      short var2 = 160;
      lm.a(32, (Object[])((Object[])var1[17]), var2, -26241);
      ((Buffer)var1[57]).clear();
      ((ByteBuffer)var1[57]).putFloat(0.0F);
      ((ByteBuffer)var1[57]).putFloat(0.0F);
      ((ByteBuffer)var1[57]).putFloat(0.0F);
      ((ByteBuffer)var1[57]).putInt(-1);
      ((ByteBuffer)var1[57]).putFloat(0.0F);
      ((ByteBuffer)var1[57]).putFloat(0.0F);
      ((ByteBuffer)var1[57]).putFloat(0.0F);
      ((ByteBuffer)var1[57]).putFloat(0.0F);
      ((ByteBuffer)var1[57]).putFloat(0.0F);
      ((ByteBuffer)var1[57]).putFloat(1.0F);
      ((ByteBuffer)var1[57]).putFloat(0.0F);
      ((ByteBuffer)var1[57]).putInt(-1);
      ((ByteBuffer)var1[57]).putFloat(0.0F);
      ((ByteBuffer)var1[57]).putFloat(1.0F);
      ((ByteBuffer)var1[57]).putFloat(0.0F);
      ((ByteBuffer)var1[57]).putFloat(1.0F);
      ((ByteBuffer)var1[57]).putFloat(1.0F);
      ((ByteBuffer)var1[57]).putFloat(1.0F);
      ((ByteBuffer)var1[57]).putFloat(0.0F);
      ((ByteBuffer)var1[57]).putInt(-1);
      ((ByteBuffer)var1[57]).putFloat(1.0F);
      ((ByteBuffer)var1[57]).putFloat(1.0F);
      ((ByteBuffer)var1[57]).putFloat(1.0F);
      ((ByteBuffer)var1[57]).putFloat(1.0F);
      ((ByteBuffer)var1[57]).putFloat(1.0F);
      ((ByteBuffer)var1[57]).putFloat(0.0F);
      ((ByteBuffer)var1[57]).putFloat(0.0F);
      ((ByteBuffer)var1[57]).putInt(-1);
      ((ByteBuffer)var1[57]).putFloat((float)var0);
      ((ByteBuffer)var1[57]).putFloat(0.0F);
      ((ByteBuffer)var1[57]).putFloat(1.0F);
      ((ByteBuffer)var1[57]).putFloat(0.0F);
      ((ByteBuffer)var1[57]).putFloat(0.0F);
      ((ByteBuffer)var1[57]).putFloat(0.0F);
      ((ByteBuffer)var1[57]).putFloat(0.0F);
      ((ByteBuffer)var1[57]).putInt(-1);
      ((ByteBuffer)var1[57]).putFloat(0.0F);
      ((ByteBuffer)var1[57]).putFloat(0.0F);
      ((ByteBuffer)var1[57]).putFloat(0.0F);
      ((ByteBuffer)var1[57]).putFloat(0.0F);
      nda.a(-18243, (Object[])((Object[])var1[17]), ((Buffer)var1[57]).position(), 0, ((long[])((long[])var1[50]))[0]);
      var1[23] = ao.a(new Object[][]{vg.a((byte)15, new Object[2], new Object[][]{eba.a, eba.d, eba.e, eba.e})}, var1, false);
   }

   static final boolean a(Object[] var0, int var1) {
      if(var1 != 3) {
         ((byte[])((byte[])((Object[])((Object[])g[1]))[3]))[8] = 16;
      }

      ++e;
      return ((boolean[])((boolean[])var0[3]))[0];
   }

   static final void a(boolean var0) {
      mha.e = (Object[][])null;
      ++f_i;
      rma.a(nma.a, 0, bqa.j, 0, 0, -1, wr.n, 0, -16694);
      if(!var0) {
         if(mha.e != null) {
            sqa.a(nma.a, true, -1412584499, woa.B, 0, 12, ((int[])((int[])gn.k[1]))[42], mha.e, 0, tm.b, wr.n);
            mha.e = (Object[][])null;
         }

      }
   }

   static {
      String var0 = "Unknown";

      try {
         var0 = System.getProperty("java.vendor").toLowerCase();
      } catch (Exception var7) {
         ;
      }

      var0.toLowerCase();
      var0 = "Unknown";

      try {
         var0 = System.getProperty("java.version").toLowerCase();
      } catch (Exception var6) {
         ;
      }

      var0.toLowerCase();
      var0 = "Unknown";

      try {
         var0 = System.getProperty("os.name").toLowerCase();
      } catch (Exception var5) {
         ;
      }

      b = var0.toLowerCase();
      var0 = "Unknown";

      try {
         var0 = System.getProperty("os.arch").toLowerCase();
      } catch (Exception var4) {
         ;
      }

      f = var0.toLowerCase();
      var0 = "Unknown";

      try {
         var0 = System.getProperty("os.version").toLowerCase();
      } catch (Exception var3) {
         ;
      }

      var0.toLowerCase();
      var0 = "~/";

      try {
         var0 = System.getProperty("user.home").toLowerCase();
      } catch (Exception var2) {
         ;
      }

      new File(var0);
   }
}
