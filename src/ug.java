import java.io.File;
import java.io.IOException;

final class ug {

   static int e;
   static int d;
   static Object[] a = dqa.a(new Object[1], 1, 24322);
   static int c;
   static boolean f;
   static boolean b;
   static int g;


   static final void a(Object[] var0, Object[] var1, byte var2) {
      ++d;
      int var3 = de.a((int)0, var0);
      int var4 = jia.c(-8166, var0);
      int var5 = jia.c(-8166, var0);
      int var6 = jia.c(-8166, var0);
      int var7 = de.a((int)0, var0);
      uga.m = var7;
      if(var2 != 101) {
         ((int[])((int[])var0[5]))[12] = -20;
      }

      long var10 = (65535L & (long)var6) << 16 | (65535L & (long)var4) << 48 | (long)var5 << 32 & 281470681743360L | (long)var3 & 65535L;
      Object[] var12 = (Object[])((Object[])dna.a((byte)34, sb.b, var10));
      if(null == var12) {
         var12 = lga.a(var2 - 208, var3, var4, ura.a, var5, var6, ira.f);
         il.a(var10, var12, true, sb.b);
      }

      var1[0] = var12;
   }

   static final void a(Object[] var0, byte var1) {
      var0[2] = null;
      ++e;
      if(var1 > -23) {
         b = false;
      }

      ((long[])((long[])var0[5]))[0] = -1L;
   }

   static final void a(boolean var0, Object[] var1, int var2, int var3) {
      if(var3 != ((int[])((int[])var1[3]))[var2]) {
         ((int[])((int[])var1[3]))[var2] = var3;

         for(int var4 = 0; 128 > var4; ++var4) {
            ((Object[][][])((Object[][][])var1[21]))[var2][var4] = null;
         }

         if(var1 != null && var1.length == 3) {
            br.a((Object[])null, (Object[])null, 1);
         }
      }

      ++c;
      if(!var0) {
         a((Object[])null, (Object[])null, (byte)-95);
      }

   }

   static final Object[] a(String var0, String var1, int var2, boolean var3) {
      try {
         ++g;
         if(var2 != 3) {
            a((String)a[4], (String)null, ((int[])((int[])a[7]))[5], ((boolean[])((boolean[])a[0]))[5]);
         }

         File var4 = new File(av.c, "preferences" + var0 + ".dat");
         if(var4.exists()) {
            try {
               Object[] var12 = es.a(new Object[3], 10000L, "rw", (byte)-36, var4);
               return var12;
            } catch (IOException var10) {
               ;
            }
         }

         String var5 = "";
         if(so.a != 33) {
            if(so.a == 34) {
               var5 = "_wip";
            }
         } else {
            var5 = "_rc";
         }

         File var6 = new File(ts.e, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
         Object[] var7;
         if(!var3 && var6.exists()) {
            try {
               var7 = es.a(new Object[3], 10000L, "rw", (byte)-36, var6);
               return var7;
            } catch (IOException var9) {
               ;
            }
         }

         try {
            var7 = es.a(new Object[3], 10000L, "rw", (byte)-36, var4);
            return var7;
         } catch (IOException var8) {
            throw new RuntimeException();
         }
      } catch (RuntimeException var11) {
         throw vt.a(var11, "ug.A(" + (var0 != null?"{...}":"null") + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ',' + var3 + ')');
      }
   }

}
