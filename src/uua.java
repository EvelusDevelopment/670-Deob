
final class uua {

   static int c;
   static int a;
   static int e;
   static int b;
   static int d;


   static final void a(Object[] var0, int var1, Object[] var2) {
      ++e;
      ((boolean[])((boolean[])var2[8]))[3] = true;
      synchronized(var0[3]) {
         gt.a((Object[])((Object[])var0[var1]), -128, (nj)(null == var2?null:var2[0]));
         ++((int[])((int[])var0[1]))[0];
      }

      if(null != var0[2]) {
         synchronized(var0[2]) {
            var0[2].notify();
         }
      }

   }

   static final void a(va var0, Object[] var1, byte var2) {
      if(var0.k != null) {
         var0.a((byte)-98);
      }

      ++b;
      var0.k = ((va)var1[1]).k;
      int var3 = 76 / ((var2 - 3) / 47);
      var0.p = (va)var1[1];
      var0.k.p = var0;
      var0.p.k = var0;
   }

   static final void a(ta var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      mpa.b = var0;
      bq.e = var1;
      et.a = bq.e > 1 && mpa.b.y();
      qqa.e = var2;
      iia.n = 1 << qqa.e;
      iba.b = iia.n >> 1;
      Math.sqrt((double)(iba.b * iba.b + iba.b * iba.b));
      ri.n = var3;
      eja.c = var4;
      me.c = var5;
      vt.d = var6;
      ui.a = Class_k.a(1);
      taa.a((byte)-99);
      fo.f_i = new Object[var3][eja.c][me.c][];
      bf.f_l = new aa[var3];
      if(var7) {
         rb.d = new int[eja.c][me.c];
         wk.e = new byte[eja.c][me.c];
         esa.g = new short[eja.c][me.c];
         jaa.f_i = new byte[eja.c][me.c];
         mf.e = new byte[eja.c][me.c];
         mca.d = new byte[eja.c][me.c];
         sr.e = new Object[1][eja.c][me.c][];
         wd.a = new aa[1];
      } else {
         rb.d = (int[][])null;
         wk.e = (byte[][])null;
         esa.g = (short[][])null;
         mf.e = (byte[][])null;
         mca.d = (byte[][])null;
         jaa.f_i = (byte[][])null;
         sr.e = (Object[][][][])null;
         wd.a = null;
      }

      if(var8) {
         nba.e = new long[var3][var4][var5];
         qd.c = new Object['\uff98'][];
         jta.j = new boolean['\uff98'];
         rga.e = 0;
      } else {
         nba.e = (long[][][])null;
         qd.c = (Object[][])null;
         jta.j = null;
         rga.e = 0;
      }

      bs.b(false);
      ri.f_l = new Object[2][];
      usa.e = new Object[2][];
      sfa.g = new Object[2][];
      sca.a = new Object[10089][];
      jia.Bc = 0;
      hja.f = new Object[5000][];
      oia.y = 0;
      mqa.g = new Object[5019][];
      aha.b = 0;
      ju.e = new boolean[vt.d + vt.d + 1][vt.d + vt.d + 1];
      uq.k = new boolean[vt.d + vt.d + 2][vt.d + vt.d + 2];
      mta.b = new int[vt.d + vt.d + 2];
      gu.b = gu.h;
      if(et.a) {
         rka.e = new boolean[var3][vt.d + vt.d + 1][vt.d + vt.d + 1];
         qj.a = new boolean[var3][][];
         if(sc.b != null) {
            oq.a();
         }

         sc.b = new lsa[bq.e];
         mpa.b.g(sc.b.length + 1);
         mpa.b.h(0);

         for(int var9 = 0; var9 < sc.b.length; ++var9) {
            sc.b[var9] = new lsa(var9 + 1, mpa.b);
            (new Thread(sc.b[var9], "" + var9)).start();
         }

         byte var17;
         if(bq.e == 2) {
            var17 = 4;
            ofa.a = 2;
         } else if(bq.e == 3) {
            var17 = 6;
            ofa.a = 3;
         } else {
            var17 = 8;
            ofa.a = 4;
         }

         ar.b = new Object[var17][];
         int var10 = 0;

         for(int var11 = 0; var11 < var17; ++var11) {
            Object[][] var12 = ar.b;
            Object[] var15 = new Object[4];
            String var16 = "" + var10++;
            pg.a((byte)-58, var15);
            eva.a(var15, 11);
            var15[0] = var16;
            var12[var11] = var15;
         }
      } else {
         ofa.a = 1;
      }

      ima.g = new int[ofa.a - 1];
      cu.a = new int[ofa.a - 1];
   }

   static final void a(boolean var0, int var1, int var2, int var3, int var4, int var5) {
      if(1 > var2) {
         var2 = 1;
      }

      if(1 > var1) {
         var1 = 1;
      }

      ++d;
      int var6 = -334 + var1;
      if(var6 < 0) {
         var6 = 0;
      } else if(100 < var6) {
         var6 = 100;
      }

      int var7 = (-Class_a.k + nn.H) * var6 / 100 + Class_a.k;
      int var8 = var1 * var7 * 512 / (var2 * 334);
      int var9;
      int var10;
      short var11;
      if(var8 >= mi.f_i) {
         if(var8 > ai.b) {
            var11 = ai.b;
            var7 = var2 * var11 * 334 / (var1 * 512);
            if(var7 < gba.o) {
               var7 = gba.o;
               var9 = var11 * var2 * 334 / (512 * var7);
               var10 = (-var9 + var1) / 2;
               if(var0) {
                  lna.g.a();
                  lna.g.d(var10, var4, var2, var3, -16777216, 14851);
                  lna.g.d(var10, -var10 + var4 + var1, var2, var3, -16777216, 14851);
               }

               var1 -= var10 * 2;
               var4 += var10;
            }
         }
      } else {
         var11 = mi.f_i;
         var7 = var2 * var11 * 334 / (512 * var1);
         if(var7 > OutputStreamWorker.e) {
            var7 = OutputStreamWorker.e;
            var9 = 512 * var1 * var7 / (var11 * 334);
            var10 = (-var9 + var2) / 2;
            if(var0) {
               lna.g.a();
               lna.g.d(var1, var4, var10, var3, -16777216, 14851);
               lna.g.d(var1, var4, var10, var3 + var2 - var10, -16777216, 14851);
            }

            var3 += var10;
            var2 -= var10 * 2;
         }
      }

      gg.e = (short)var2;
      cda.f = (short)var1;
      pka.b = var4;
      dca.g = var1 * var7 / 334;
      np.h = var3;
      if(var5 > -106) {
         a((va)null, (Object[])null, (byte)57);
      }

   }

   static final void a(Object[] var0, Object[] var1, int var2) {
      while(true) {
         int var3 = fh.a(var0, false);
         if(var3 == 0) {
            ++a;
            if(null != var1 && (var1.length == 3 && var1[1].equals(Integer.valueOf(1)) && var1[1].equals(Integer.valueOf(1)) || -18 == ~var1.length)) {
               pm.a(2, new Object[1][]);
            }

            if(var2 >= -12) {
               a((va)var0[0], (Object[])null, ((byte[])((byte[])var1[16]))[11]);
            }

            return;
         }

         iu.a(var1, var3, var0, 2);
      }
   }

   static final int a(Object[] var0, int var1) {
      ++c;
      if(var1 != -23879) {
         a((Object[])null, 70);
      }

      return 1;
   }

}
