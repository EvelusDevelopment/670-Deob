
final class vma {

   static int d;
   static Object[] b;
   static int c;
   static int a;


   static final void a(boolean var0, int var1) {
      ++c;
      if(var0) {
         if(-1 != bqa.j) {
            cv.a(bqa.j, (byte)115);
         }

         oh var2;
         oh var3;
         for(Object[] var6 = (var2 = (oh)qt.a(0, lfa.c)) != null?var2.p:null; null != var6; var6 = (var3 = (oh)nda.a(1, lfa.c)) == null?null:var3.p) {
            if(!((lm)(null != var6?var6[0]:null)).a(false)) {
               oh var5;
               var6 = null == (var5 = (oh)qt.a(0, lfa.c))?null:var5.p;
               if(var6 == null) {
                  break;
               }
            }

            lba.a(false, 4, var6, true);
         }

         bqa.j = -1;
         lfa.c = nb.a((byte)50, 8, new Object[5]);
         kka.a((byte)125);
         bqa.j = ((int[])((int[])fk.j[1]))[1];
         kt.a(false, nma.a, (byte)-29, bqa.j, wr.n);
         mg.b(true);
         wl.a(bqa.j, (byte)-61, (int[])null);
      }

      tba.c = "";
      bm.f = "";
      ff.c = false;
      qba.a(0);
      jf.c = -1;
      jb.a(InputStreamWorker.c, (byte)-43);
      uta.g = gga.a(-96, new Object[43]);
      sra.a(uta.g, bl.a((byte)42, (float)(512 * rp.c / 2), new Object[2], (float)(wpa.a * 512 / 2), 0.0F), 1);
      ((int[])((int[])uta.g[33]))[0] = rp.c / 2;
      if(var1 <= 37) {
         a(true, -104);
      }

      woa.M = 0;
      ((int[])((int[])uta.g[14]))[0] = wpa.a / 2;
      pta.f = 0;
      if(ha.e != 4) {
         rd.a(2);
      } else {
         woa.M = ks.c << 9;
         pta.f = moa.g << 9;
      }

      tea.a((byte)-125);
   }

   static final Object[] a(Object[] var0, int var1, Object[] var2) {
      if(var2[0] == null) {
         var2[0] = new byte[1];
      }

      if(var2[1] == null) {
         var2[1] = new int[5];
      }

      ++d;
      ((byte[])((byte[])var2[0]))[0] = ipa.a(var0, (int)-82);
      ((int[])((int[])var2[1]))[2] = de.a((int)0, var0);
      ((int[])((int[])var2[1]))[1] = lr.a(1, var0);
      ((int[])((int[])var2[1]))[3] = lr.a(1, var0);
      ((int[])((int[])var2[1]))[0] = lr.a(1, var0);
      ((int[])((int[])var2[1]))[4] = lr.a(1, var0);
      int var3 = 38 % ((var1 + 48) / 52);
      return var2;
   }

}
