
final class ob {

   static Object[] d = ed.a(1, new Object[1], (byte)-115, 28);
   static int f;
   static int a;
   static int b;
   static int c;
   static ta e;


   static final void a(byte var0) {
      ++b;
      Object[] var1 = bca.F;
      synchronized(var1[0]) {
         lga.b(0, (Object[])((Object[])var1[0]));
      }

      Object[] var2 = tfa.d;
      synchronized(var2[0]) {
         lga.b(var0 ^ 82, (Object[])((Object[])var2[0]));
      }

      mna.a((byte)-14, im.a);
      Object[] var3 = lja.d;
      synchronized(var3[4]) {
         lga.b(0, (Object[])((Object[])var3[4]));
      }

      synchronized(var3[2]) {
         lga.b(0, (Object[])((Object[])var3[2]));
      }

      synchronized(var3[3]) {
         lga.b(0, (Object[])((Object[])var3[3]));
      }

      synchronized(var3[8]) {
         lga.b(0, (Object[])((Object[])var3[8]));
      }

      Object[] var4 = nt.f_i;
      synchronized(var4[6]) {
         lga.b(var0 ^ 82, (Object[])((Object[])var4[6]));
      }

      synchronized(var4[4]) {
         lga.b(0, (Object[])((Object[])var4[4]));
      }

      synchronized(var4[7]) {
         lga.b(0, (Object[])((Object[])var4[7]));
      }

      eq.b(cqa.a, -3557);
      mm.a((byte)-19, he.b);
      Object[] var5 = dfa.a;
      synchronized(var5[0]) {
         lga.b(0, (Object[])((Object[])var5[0]));
      }

      synchronized(var5[4]) {
         lga.b(0, (Object[])((Object[])var5[4]));
      }

      Class_ls.a(-53, fv.d);
      Object[] var6 = nb.g;
      synchronized(var6[2]) {
         lga.b(var0 - 82, (Object[])((Object[])var6[2]));
      }

      mi.a((byte)16, jv.g);
      sd.a(et.c, 8465);
      Object[] var7 = cr.c;
      synchronized(var7[0]) {
         lga.b(0, (Object[])((Object[])var7[0]));
      }

      pp.a((byte)120, kw.b);
      Object[] var8 = cq.f_i;
      synchronized(var8[0]) {
         lga.b(0, (Object[])((Object[])var8[0]));
      }

      if(var1 != null && var1.length == 2) {
         tsa.a(((int[])((int[])eq.f_l[0]))[1], -16857, (String)ht.a[3]);
      }

      Object[] var9 = rka.d;
      synchronized(var9[2]) {
         lga.b(0, (Object[])((Object[])var9[2]));
      }

      synchronized(var9[0]) {
         lga.b(0, (Object[])((Object[])var9[0]));
      }

      Object[] var10 = oe.g;
      synchronized(var10[1]) {
         lga.b(0, (Object[])((Object[])var10[1]));
      }

      synchronized(var10[3]) {
         lga.b(var0 ^ 82, (Object[])((Object[])var10[3]));
      }

      Object[] var11 = ib.g;
      synchronized(var11[0]) {
         lga.b(0, (Object[])((Object[])var11[0]));
      }

      if(var0 != 82) {
         e = (ta)d[2];
      }

      gd.a(bm.c, (int)-66);
      eb.a(-60, ura.a);
      Object[] var12 = ira.f;
      synchronized(var12[0]) {
         lga.b(0, (Object[])((Object[])var12[0]));
      }

      im.a(qja.f_l, (byte)111);
      fpa.a(ena.e, (byte)-111);
      dh.a(lw.d, (byte)-108);
      ofa.a(-61, lv.w);
      Object[] var13 = id.f;
      synchronized(id.f) {
         lga.b(0, id.f);
      }

      var13 = kg.a;
      synchronized(kg.a) {
         lga.b(0, kg.a);
      }

      lga.b(var0 ^ 82, fr.g);
      lga.b(var0 ^ 82, ic.f);
      lga.b(0, jl.b);
      lga.b(var0 - 82, Class_ls.m);
      lga.b(var0 ^ 82, np.f_i);
      ev.a(1);
      var13 = vi.e;
      synchronized(vi.e) {
         lga.b(0, vi.e);
      }

      lga.b(0, lha.h);
      lga.b(0, gs.d);
      lga.b(0, gg.b);
      lga.b(var0 ^ 82, rw.x);
      lga.b(var0 ^ 82, mw.a);
   }

   static final Object[] a(Object[] var0, byte var1, Object[] var2, Object[] var3, Object[] var4) {
      if(null == var4[1]) {
         var4[1] = new int[1];
      }

      if(var4[4] == null) {
         var4[4] = new long[1];
      }

      ++c;
      var4[2] = var3;
      if(var1 < 70) {
         a((byte)88);
      }

      var4[3] = var0;
      var4[5] = var2;
      return var4;
   }

   static final int a(Object[] var0, String var1, boolean var2, cga[] var3) {
      ++a;
      if(var1 == null) {
         return 0;
      } else {
         if(var2) {
            a((Object[])null, 119);
         }

         int var4 = -1;
         int var5 = -1;
         int var6 = 0;
         int var7 = var1.length();

         for(int var8 = 0; var7 > var8; ++var8) {
            char var9 = var1.charAt(var8);
            if(60 != var9) {
               if(var9 == 62 && -1 != var4) {
                  String var10 = var1.substring(var4 + 1, var8);
                  var4 = -1;
                  if(var10.equals("lt")) {
                     var9 = 60;
                  } else if(!var10.equals("gt")) {
                     if(!var10.equals("nbsp")) {
                        if(!var10.equals("shy")) {
                           if(var10.equals("times")) {
                              var9 = 215;
                           } else if(!var10.equals("euro")) {
                              if(!var10.equals("copy")) {
                                 if(!var10.equals("reg")) {
                                    if(var10.startsWith("img=") && null != var3) {
                                       try {
                                          int var11 = bca.a((byte)-126, var10.substring(4));
                                          var5 = -1;
                                          var6 += var3[var11].f();
                                       } catch (Exception var12) {
                                          ;
                                       }
                                    }
                                    continue;
                                 }

                                 var9 = 174;
                              } else {
                                 var9 = 169;
                              }
                           } else {
                              var9 = 8364;
                           }
                        } else {
                           var9 = 173;
                        }
                     } else {
                        var9 = 160;
                     }
                  } else {
                     var9 = 62;
                  }
               }

               if(var4 == -1) {
                  var6 += ((byte[])((byte[])var0[0]))[255 & so.a((byte)-102, var9)] & 255;
                  if(null != var0[2] && -1 != var5) {
                     var6 += ((byte[][])((byte[][])var0[2]))[var5][var9];
                  }

                  var5 = var9;
               }
            } else {
               var4 = var8;
            }
         }

         return var6;
      }
   }

   static final int a(Object[] var0, int var1) {
      ++f;
      int var2 = -24 / ((var1 + 10) / 33);
      return ((int[])((int[])var0[1]))[2] + ((int[])((int[])var0[1]))[4] + ((int[])((int[])var0[1]))[5];
   }

}
