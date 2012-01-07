import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

final class aoa {

   static int e;
   static int f;
   static boolean b = true;
   static int[] c = new int[5];
   static int d;
   static Object[] a = Class_fs.a(4, (byte)-81, new Object[1], 1, 14, 0);


   static final void a(byte var0, boolean var1, Object[] var2, int var3) {
      ++d;
      int var4 = 2 * var3;
      ((byte[])((byte[])var2[4]))[var4++] = -1;
      int var5 = 255 & var0;
      ((byte[])((byte[])var2[4]))[var4] = (byte)(var5 * 3 >> 5);
      if(var1) {
         b = false;
      }

   }

   static final void a(byte var0, Object[] var1) {
      ++f;

      try {
         int var2 = mka.g == po.f_i?80:((int[])((int[])vha.a[1]))[0] + 7000;
         if(var0 <= 71) {
            return;
         }

         BufferedReader var3 = new BufferedReader(new InputStreamReader(new DataInputStream((new URL("http://" + (String)vha.a[0] + ":" + var2 + "/news.ws?game=" + ((int[])((int[])fsa.g[1]))[0])).openStream())));
         String var4 = var3.readLine();

         Object[] var5;
         for(var5 = nga.a(true); null != var4; var4 = var3.readLine()) {
            int var6 = ((int[])((int[])var5[1]))[0] + 1;
            if(var6 > ((int[])((int[])var5[1]))[0]) {
               ((int[])((int[])var5[1]))[0] = var6;
            }

            if(~var6 <= ~((Object[])((Object[])var5[0])).length) {
               int var8 = ((Object[])((Object[])var5[0])).length;

               while(var6 >= var8) {
                  if(!((boolean[])((boolean[])var5[2]))[0]) {
                     var8 += ((int[])((int[])var5[1]))[1];
                  } else if(var8 != 0) {
                     var8 *= ((int[])((int[])var5[1]))[1];
                  } else {
                     var8 = 1;
                  }
               }

               String[] var18 = new String[var8];
               System.arraycopy(var5[0], 0, var18, 0, ((Object[])((Object[])var5[0])).length);
               var5[0] = var18;
            }

            ((String[])((String[])var5[0]))[var6] = var4;
         }

         if(null != var1 && (17 == var1.length || -7 == ~var1.length && var1[4].equals(Integer.valueOf(2)))) {
            return;
         }

         String[] var17 = si.b(var5, 25);
         if(-1 != ~(var17.length % 3)) {
            return;
         }

         var1[3] = new Object[var17.length / 3][];

         for(int var7 = 0; ~var7 > ~var17.length; var7 += 3) {
            Object[][] var19 = (Object[][])((Object[][])var1[3]);
            int var9 = var7 / 3;
            Object[] var11 = new Object[3];
            String var12 = var17[var7];
            String var13 = var17[var7 + 1];
            String var14 = var17[var7 + 2];
            var11[0] = var13;
            var11[2] = var14;
            var11[1] = var12;
            var19[var9] = var11;
         }
      } catch (IOException var16) {
         ;
      }

      ((boolean[])((boolean[])var1[2]))[0] = true;
   }

   static final Object[] a(Object[] var0, int var1, Object[] var2, Object[] var3) {
      ++e;
      if(var1 != 16) {
         c = (int[])((int[])var2[2]);
      }

      if(null != var2 && -9 == ~var2.length) {
         Object[] var4 = qqa.a(false, var3, new Object[16], var0, var2);
         return var4;
      } else if(null != var2 && 9 == var2.length) {
         return lia.a(12, var2, var3, var0);
      } else {
         throw new IllegalStateException();
      }
   }

}
