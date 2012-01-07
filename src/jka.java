
final class jka {

   static int b;
   static Object[] a;


   static final void a(int var0) {
      try {
         oc.a(-7850, noa.a((Object[])((Object[])tu.d[19]), var0 + 7715));
         ++b;
         int var1 = (woa.M >> 12) + (rs.f >> 3);
         ((byte[])((byte[])uta.g[10]))[0] = 0;
         if(var0 != -7679) {
            a(((int[])((int[])a[13]))[41]);
         }

         jca.n = 0;
         int var2 = (qm.d >> 3) + (pta.f >> 12);
         ul.a(var0 + 7679, 8, uta.g, 8);
         byte var3 = 18;
         pv.b = new int[var3];
         cf.h = new byte[var3][];
         gn.p = new int[var3][4];
         vla.h = new int[var3];
         mja.j = new byte[var3][];
         sia.b = new int[var3];
         du.d = new int[var3];
         tqa.b = new byte[var3][];
         epa.d = new int[var3];
         ft.b = new byte[var3][];
         Class_f.d = new int[var3];
         wu.n = new byte[var3][];
         int var9 = 0;

         int var4;
         for(var4 = (var1 - (rp.c >> 4)) / 8; ((rp.c >> 4) + var1) / 8 >= var4; ++var4) {
            for(int var5 = (var2 - (wpa.a >> 410618468)) / 8; ~var5 >= ~(((wpa.a >> 4) + var2) / 8); ++var5) {
               int var6 = var5 + (var4 << 8);
               Class_f.d[var9] = var6;
               du.d[var9] = dla.a(oe.f, var0 ^ -7569, bg.a(true, var4, false, var5, (byte)127));
               epa.d[var9] = dla.a(oe.f, 77, bg.a(false, var4, false, var5, (byte)-80));
               sia.b[var9] = dla.a(oe.f, var0 ^ -7610, "n" + var4 + "_" + var5);
               pv.b[var9] = dla.a(oe.f, 90, bg.a(true, var4, true, var5, (byte)-122));
               vla.h[var9] = dla.a(oe.f, 124, bg.a(false, var4, true, var5, (byte)-91));
               if(sia.b[var9] == -1) {
                  du.d[var9] = -1;
                  epa.d[var9] = -1;
                  pv.b[var9] = -1;
                  vla.h[var9] = -1;
               }

               ++var9;
            }
         }

         for(var4 = var9; ~var4 > ~sia.b.length; ++var4) {
            sia.b[var4] = -1;
            du.d[var4] = -1;
            epa.d[var4] = -1;
            pv.b[var4] = -1;
            vla.h[var4] = -1;
         }

         byte var10;
         if(ipa.d != 9) {
            if(15 == ipa.d) {
               var10 = 7;
            } else {
               if(5 != ipa.d) {
                  throw new RuntimeException("" + ipa.d);
               }

               var10 = 0;
            }
         } else {
            var10 = 8;
         }

         mia.a(false, var10, var1, false, var2);
      } catch (RuntimeException var8) {
         throw vt.a(var8, "jka.A(" + var0 + ')');
      }
   }

}
