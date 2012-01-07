
final class pn {

   static int f;
   static Object[] c = sd.a(new Object[1], 105, (byte)122);
   static int d;
   static int e;
   static Object[] b;
   static int a;


   static final int a(int var0, Object[] var1, int var2) {
      ++f;
      if(var2 >= -1) {
         a((ta)null, ((byte[])((byte[])c[10]))[28]);
      }

      ma var3;
      Object[] var4 = null == (var3 = (ma)pm.a((long)var0, (Object[])((Object[])var1[0]), false))?null:var3.s;
      if(null == var4) {
         Object[] var5 = dja.a(jv.g, (byte)126, var0);
         return 105 == ((char[])((char[])var5[0]))[0]?0:-1;
      } else {
         return ((int[])((int[])var4[1]))[0];
      }
   }

   static final void a(Object[] var0, Object[] var1, Object[] var2, int var3) {
      var0[14] = var2[14];
      ((int[])((int[])var0[1]))[6] = ((int[])((int[])var2[1]))[6];
      ((int[])((int[])var0[1]))[26] = ((int[])((int[])var2[1]))[26];
      var0[12] = var1[12];
      var0[0] = var2[0];
      var0[4] = var2[4];
      ((int[])((int[])var0[1]))[var3] = ((int[])((int[])var2[1]))[17];
      ((int[])((int[])var0[1]))[3] = ((int[])((int[])var2[1]))[3];
      ((int[])((int[])var0[1]))[12] = ((int[])((int[])var2[1]))[12];
      ((int[])((int[])var0[1]))[8] = ((int[])((int[])var2[1]))[8];
      var0[5] = var2[5];
      ((int[])((int[])var0[1]))[25] = ((int[])((int[])var2[1]))[25];
      ++d;
      var0[13] = var2[13];
      if(var0 != null && (5 == var0.length && var0[1].equals(Integer.valueOf(0)) && var0[1].equals(Integer.valueOf(0)) || 2 == var0.length)) {
         la.b = null;
      }

      ((int[])((int[])var0[1]))[22] = ((int[])((int[])var1[1]))[22];
      ((boolean[])((boolean[])var0[10]))[0] = ((boolean[])((boolean[])var1[10]))[0];
      ((int[])((int[])var0[1]))[15] = 1;
   }

   static final void a(ta var0, byte var1) {
      int var2 = 18 % ((var1 + 1) / 53);
      ++e;
      if((nma.h >= 2 || ra.h) && null == dca.e) {
         String var3;
         if(ra.h && 2 > nma.h) {
            var3 = qp.b + gj.a(dp.y, -63, gj.f_sb) + kca.b + " " + iv.a;
         } else if(qc.a(-72) && nma.h > 2) {
            var3 = joa.a(3, nga.a);
         } else {
            Object[] var4 = nga.a;
            if(var4 == null) {
               return;
            }

            var3 = joa.a(3, var4);
            int[] var5 = bua.a(var4, (int)9);
            if(var5 != null) {
               var3 = var3 + jla.a(var5, 11557);
            }
         }

         if(nma.h > 2) {
            var3 = var3 + el.a(16777215, 0) + " / " + (nma.h - 2) + gj.a(dp.y, -118, gj.f_qb);
         }

         if(gg.a != null) {
            Object[] var7 = gg.a;
            ja var6 = ca.a(false, ((int[])((int[])var7[1]))[16], (byte)65, ((boolean[])((boolean[])var7[5]))[16], var0);
            lja.c = var6 == null;
            var6 = var6;
            if(null == var6) {
               var6 = wla.f;
            }

            var6.a(((int[])((int[])gg.a[1]))[54], ((int[])((int[])gg.a[1]))[11], ((int[])((int[])gg.a[1]))[70], ((int[])((int[])gg.a[1]))[14], gq.g, cea.b, 83, vla.g, var3, nc.a, sf.g, rj.c, wha.e, ((int[])((int[])gg.a[1]))[2], ((int[])((int[])gg.a[1]))[72]);
            ha.a(nc.a[1], nc.a[2], nc.a[3], nc.a[0], true);
         }

      }
   }

   static final Object a(boolean var0, Object[] var1, Object[] var2) {
      ++a;
      if(null != var2 && var2.length == 40 && var2[15].equals(Integer.valueOf(2))) {
         return null;
      } else {
         if(!var0) {
            ((int[])((int[])var2[3]))[12] = ((int[])((int[])b[1]))[5];
         }

         long var15 = mi.a((int)36, var1);

         lb var3;
         lb var4;
         for(Object[] var17 = (var3 = (lb)pm.a(var15, (Object[])((Object[])var2[2]), !var0)) != null?var3.x:null; null != var17; var17 = null == (var4 = (lb)mla.b((Object[])((Object[])var2[2]), (byte)123))?null:var4.x) {
            Object[] var19 = (Object[])((Object[])var17[0]);
            if(null == var19) {
               throw new IllegalStateException();
            }

            boolean var20;
            if(null != var1) {
               if(~((int[])((int[])var19[1]))[3] != ~((int[])((int[])var1[1]))[3]) {
                  var20 = false;
               } else if(((int[])((int[])var1[1]))[0] != ((int[])((int[])var19[1]))[0]) {
                  var20 = false;
               } else if(~((int[])((int[])var1[1]))[1] != ~((int[])((int[])var19[1]))[1]) {
                  var20 = false;
               } else if(~((int[])((int[])var19[1]))[2] == ~((int[])((int[])var1[1]))[2]) {
                  if(((int[])((int[])var19[1]))[5] != ((int[])((int[])var1[1]))[5]) {
                     var20 = false;
                  } else if(((int[])((int[])var19[1]))[4] == ((int[])((int[])var1[1]))[4]) {
                     if(!((boolean[])((boolean[])var1[0]))[0] != ((boolean[])((boolean[])var19[0]))[0]) {
                        if(var1 != null && 10 == var1.length) {
                           jm.a((Object[])null, 1, (Object[])null);
                        }

                        var20 = true;
                     } else {
                        var20 = false;
                     }
                  } else {
                     var20 = false;
                  }
               } else {
                  var20 = false;
               }
            } else {
               var20 = false;
            }

            if(var20) {
               Object var22 = gb.a(var17, (byte)57);
               if(var22 != null) {
                  if(!mia.a(30255, var17)) {
                     ama.a((tha)(var17 != null?var17[2]:null), (byte)-119, (Object[])((Object[])var2[0]));
                     ((tha)(var17 == null?null:var17[2])).m = 0L;
                  } else {
                     Object[] var21 = rh.a(var22, ((int[])((int[])var17[1]))[0], var1, new Object[4], (byte)87);
                     di.a((Object[])((Object[])var2[2]), true, (lm)(null == var21?null:var21[2]), ((lm)(var17 != null?var17[2]:null)).e);
                     ama.a((tha)(var21 == null?null:var21[2]), (byte)-117, (Object[])((Object[])var2[0]));
                     ((tha)(var21 == null?null:var21[2])).m = 0L;
                     ((lm)(var17 != null?var17[2]:null)).a((byte)46);
                     ((tha)(var17 != null?var17[2]:null)).a(8192);
                  }

                  return var22;
               }

               ((lm)(null != var17?var17[2]:null)).a((byte)98);
               ((tha)(null == var17?null:var17[2])).a(8192);
               ((int[])((int[])var2[1]))[1] += ((int[])((int[])var17[1]))[0];
            }
         }

         return null;
      }
   }

}
