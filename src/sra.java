import java.awt.Component;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;

final class sra {

   static Object[] a = sl.a("25", 0, new Object[1], "25");
   static int d;
   static int g;
   static int f;
   static int c;
   static int b;
   static int e;


   static final void a(int var0, int var1, int var2, ja var3, Object[] var4, int var5, int var6, byte var7, int var8, int var9, Object[] var10, int var11, int var12) {
      ++f;
      if(var7 == -73) {
         if(var6 < var5 && ~var5 > ~(var11 + var6) && var12 + (-((int[])((int[])var10[1]))[0] - 1) < var1 && var1 < var12 + ((int[])((int[])var10[1]))[2] && ((boolean[])((boolean[])var4[4]))[0]) {
            var2 = var8;
         }

         int[] var13 = bua.a(var4, (int)9);
         String var14 = joa.a(3, var4);
         if(null != var13) {
            var14 = var14 + jla.a(var13, 11557);
         }

         var3.a(var14, rj.c, 0, sf.g, var2, var12, var7 + 15320, var6 + 3);
         if(((boolean[])((boolean[])var4[4]))[2]) {
            iaa.b.a(var6 + 5 + uga.a(var14, var10, (byte)-114), var12 - ((int[])((int[])var10[1]))[0]);
         }

      }
   }

   static final byte[] a(String var0, Object[] var1, String var2, boolean var3) {
      ++g;
      if(ev.a((int)4120, var1)) {
         if(!var3) {
            return (byte[])null;
         } else {
            var0 = var0.toLowerCase();
            var2 = var2.toLowerCase();
            int var4 = pe.a((Object[])((Object[])((Object[])((Object[])var1[3]))[4]), false, hp.a(var0, (int)1));
            if(!sda.a(var4, var1, 37)) {
               return null;
            } else {
               int var5 = pe.a(((Object[][])((Object[][])((Object[])((Object[])var1[3]))[6]))[var4], false, hp.a(var2, (int)1));
               return qn.a(var4, var5, var1, 108);
            }
         }
      } else {
         return null;
      }
   }

   static final Object[] a(Component var0, int var1, boolean var2, boolean var3) {
      ++b;
      Object[] var5 = new Object[5];
      Object var7;
      if(null != var5) {
         ne var8 = new ne(var5);
         var7 = var8;
      } else {
         gia var12 = new gia(var5);
         var7 = var12;
      }

      var5[0] = var7;
      lt.b(var5, -84);
      ld.a(520, var3);
      fea.a(var5, (int)53);
      var5[3] = var0;
      if(var2) {
         Method var11 = vc.c;
         if(null != var11) {
            try {
               var11.invoke(var5[3], new Object[]{Boolean.FALSE});
            } catch (Throwable var10) {
               ;
            }
         }
      }

      ((Component)var5[3]).addKeyListener((KeyListener)(var5 != null?var5[0]:null));
      ((Component)var5[3]).addFocusListener((FocusListener)(var5 == null?null:var5[0]));
      return var1 != 0?(Object[])((Object[])a[0]):var5;
   }

   static final void a(int var0, Object[] var1, byte var2) {
      ++d;
      if(var2 >= -15) {
         a(((int[])((int[])((Object[])((Object[])var1[0]))[13]))[0], (Object[])null, (byte)-124);
      }

      ((int[])((int[])var1[1]))[0] = var0;
   }

   static final boolean a(int var0, int var1, int var2) {
      ++c;
      if(var1 != 55) {
         a = (Object[])null;
      }

      if(!(0 != (65536 & var0) | rr.a(var0, var2, 0))) {
         boolean var4 = rr.a(var0, var2, var1 - 55) | 0 != (var0 & 8192) | ira.a(var0, -72, var2);
         boolean var5 = (2048 & var0) != 0 && 0 != (55 & var2);
         boolean var3 = var4 & var5;
         if(!var3) {
            return (55 & var2) == 0 && ev.a(var0, true, var2);
         }
      }

      return true;
   }

   static final void a(Object[] var0, Object[] var1, int var2) {
      rna.a(var1, (Object[])((Object[])((Object[])((Object[])var0[6]))[1]), true);
      ++e;
      uh.a(var0, 2);
      if(null != var0[var2]) {
         wv.a(10588, (Object[])((Object[])var0[1]));
      }

   }

}
