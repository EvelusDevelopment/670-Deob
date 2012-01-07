import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

final class taa {

   static Object[] b;
   static int h;
   static int d;
   static int a;
   static int f;
   static int c;
   static int e;
   static Object[] g = st.a(new Object[1], 7, 22, 14);


   static final void a(byte var0) {
      kga.j = 0;
      so.f = new int[ri.n][eja.c + 1][me.c + 1];
      ji.g = iia.n;
      lna.h = new Object[537][];
      id.a = new Object[2021][];
      rw.t = 0;
      if(var0 == -99) {
         bf.b = iia.n;
         tra.f = false;
         pt.a = new Object[513][];
         ++h;
         gj.O = new Object[1042][];
         ru.b = 0;
         caa.d = 0;
         if(mpa.b instanceof ia) {
            cq.h = false;
         } else {
            cq.h = true;
         }

      }
   }

   static final void a(Object[] var0, byte var1, Object[] var2, int[] var3) {
      ++d;
      if(var0[6] != null) {
         int var5 = -105 / ((7 - var1) / 51);

         for(int var4 = 0; ((int[])((int[])var0[6])).length > var4 && var3.length > var4; ++var4) {
            int var6 = ((int[])((int[])msa.a(var4, (byte)-45, var0)[0]))[2];
            if(var6 > 0) {
               long var7 = (long)var3[var4];
               int var9 = var6 - 1;
               if(var9 < 0 || 7 < var9) {
                  throw new IllegalArgumentException();
               }

               if(var2 != null && -2 == ~var2.length) {
                  wr.a(91, (Object[])null);
               }

               for(int var10 = var9 * 8; 0 <= var10; var10 -= 8) {
                  byte[] var10000 = (byte[])((byte[])var2[2]);
                  int[] var10001 = (int[])((int[])var2[1]);
                  int var10004 = ((int[])((int[])var2[1]))[0];
                  var10001[0] = ((int[])((int[])var2[1]))[0] + 1;
                  var10000[var10004] = (byte)((int)(var7 >> var10));
               }
            }
         }

         if(var0 == null || -2 != ~var0.length || !var0[0].equals(Boolean.valueOf(false)) || !var0[0].equals(Integer.valueOf(0))) {
            ;
         }
      }
   }

   static final void a(Throwable var0, int var1, String var2) {
      ++a;

      try {
         String var3 = "";
         if(var0 != null) {
            Throwable var5 = var0;
            String var6;
            if(!(var0 instanceof eoa)) {
               var6 = "";
            } else {
               eoa var7 = (eoa)var0;
               var5 = var7.c;
               var6 = var7.f + " | ";
            }

            StringWriter var20 = new StringWriter();
            PrintWriter var8 = new PrintWriter(var20);
            var5.printStackTrace(var8);
            var8.close();
            String var9 = var20.toString();
            BufferedReader var10 = new BufferedReader(new StringReader(var9));
            String var11 = var10.readLine();

            while(true) {
               String var12 = var10.readLine();
               if(null == var12) {
                  var6 = var6 + "| " + var11;
                  var3 = var6;
                  break;
               }

               int var13 = var12.indexOf(40);
               int var14 = var12.indexOf(41, 1 + var13);
               String var15;
               if(-1 != var13) {
                  var15 = var12.substring(0, var13);
               } else {
                  var15 = var12;
               }

               var15 = var15.trim();
               var15 = var15.substring(1 + var15.lastIndexOf(32));
               var15 = var15.substring(var15.lastIndexOf(9) + 1);
               var6 = var6 + var15;
               if(-1 != var13 && ~var14 != 0) {
                  int var16 = var12.indexOf(".java:", var13);
                  if(var16 >= 0) {
                     var6 = var6 + var12.substring(var16 + 5, var14);
                  }
               }

               var6 = var6 + ' ';
            }
         }

         if(null != var2) {
            if(null != var0) {
               var3 = var3 + " | ";
            }

            var3 = var3 + var2;
         }

         tpa.a(24, var3);
         var3 = rla.a(false, "%3a", ":", var3);
         var3 = rla.a(false, "%40", "@", var3);
         var3 = rla.a(false, "%26", "&", var3);
         var3 = rla.a(false, "%23", "#", var3);
         if(rta.d == null) {
            return;
         }

         if(var1 != 32) {
            a(92, (Object[])null);
         }

         String var4 = "Unknown";
         String var19 = "1.1";

         try {
            var4 = System.getProperty("java.vendor");
            var19 = System.getProperty("java.version");
         } catch (Exception var17) {
            ;
         }

         URL var24;
         if(vda.b == null) {
            var24 = new URL(rta.d.getCodeBase(), "clienterror.ws?c=" + qd.e + "&cs=" + mda.e + "&u=" + (null == tsa.e?"" + fta.W:tsa.e) + "&v1=" + var4 + "&v2=" + var19 + "&e=" + var3);
            DataInputStream var22 = new DataInputStream(var24.openStream());
            var22.read();
            var22.close();
         } else {
            var24 = new URL(rta.d.getCodeBase(), "clienterror.ws?c=" + qd.e + "&cs=" + mda.e + "&u=" + (tsa.e == null?"" + fta.W:tsa.e) + "&v1=" + var4 + "&v2=" + var19 + "&e=" + var3);
            vba var21 = vda.b.a(var24, var1 ^ 36);

            while(0 == var21.b) {
               qs.a(1L, 95);
            }

            if(-2 == ~var21.b) {
               DataInputStream var23 = (DataInputStream)var21.c;
               var23.read();
               var23.close();
            }
         }
      } catch (Exception var18) {
         var18.printStackTrace();
      }

   }

   static final void a(int var0, Object[] var1) {
      if(null == var1[12]) {
         var1[12] = new int[15];
      }

      if(null == var1[14]) {
         var1[14] = new double[5];
      }

      if(var1[8] == null) {
         var1[8] = new boolean[8];
      }

      ++e;
      if(var0 != 5) {
         a((byte)40);
      }

   }

   static final byte[] a(int var0, String var1, Object[] var2) {
      if(var0 != 9) {
         b = (Object[])null;
      }

      ++c;
      byte[] var3 = sra.a("gl", (Object[])((Object[])var2[9]), var1, true);
      return var3;
   }

   static final boolean a(Object[] var0, byte var1) {
      ++f;
      if(var1 > -28) {
         a(-10, (String)null, (Object[])null);
      }

      return ((boolean[])((boolean[])var0[8]))[4];
   }

}
