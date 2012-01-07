
final class ql implements Runnable {

   static int b;
   static int d;
   static boolean e = false;
   static int c;
   private Object[] f;
   static int a;


   static final void a(int var0, int var1, Object[] var2, int var3) {
      var0 -= ((int[])((int[])var2[var1]))[2];
      var3 -= ((int[])((int[])var2[1]))[0];
      ++c;
      ((int[][])((int[][])var2[0]))[var0][var3] &= -262145;
   }

   ql(Object[] var1) {
      this.f = var1;
   }

   public final void run() {
      ++d;
      Object[] var1 = this.f;

      while(!((boolean[])((boolean[])var1[2]))[1]) {
         long var3 = he.a(64);
         synchronized(null != var1?var1[0]:null) {
            try {
               ++((int[])((int[])var1[1]))[1];
               Object[] var6;
               if(null != (var6 = (Object[])((Object[])var1[4])) && var6.length == 15) {
                  sv.a(2, ((boolean[])((boolean[])var1[2]))[0], (Object[])((Object[])var1[4]));
               } else {
                  long var7 = he.a(-111);
                  Object[] var9;
                  if(lna.g != null && null != var1[7] && 0 != vea.a(false, (Object[])((Object[])var1[7])) && ((long[])((long[])var1[6]))[0] >= -((long)vea.a(false, (Object[])((Object[])var1[7]))) + var7) {
                     int var20 = (int)(255L * (var7 - ((long[])((long[])var1[6]))[0]) / (long)vea.a(false, (Object[])((Object[])var1[7])));
                     int var10 = 255 + -var20;
                     var10 = var10 << 24 | 16777215;
                     eoa.a(-109);
                     var20 = 16777215 | var20 << 24;
                     lna.g.Z(1, 0);
                     cga var11 = lna.g.a(73, nma.a, wr.n, true);
                     hsa var12 = lna.g.f();
                     var12.a(0, var11.h());
                     lna.g.a(var12, 59);
                     sv.a(2, true, (Object[])((Object[])var1[7]));
                     lna.g.a(true, var12);
                     var11.a(0, 0, 0, var10, 1);
                     lna.g.a(var12, 59);
                     lna.g.Z(1, 0);
                     sv.a(2, true, (Object[])((Object[])var1[4]));
                     if(var1 != null && 4 == var1.length && var1[3].equals(Boolean.valueOf(false))) {
                        this.run();
                     }

                     lna.g.a(true, var12);
                     var11.a(0, 0, 0, var20, 1);
                  } else {
                     if(var1[7] != null) {
                        ((boolean[])((boolean[])var1[2]))[0] = true;
                        var9 = (Object[])((Object[])var1[7]);
                        if(null != var9 && 4 == var9.length) {
                           ffa.a(false, var9);
                        } else {
                           if(var9 == null || 15 != var9.length) {
                              throw new IllegalStateException();
                           }

                           pj.b((byte)122, var9);
                        }

                        var1[7] = null;
                     }

                     if(((boolean[])((boolean[])var1[2]))[0]) {
                        eoa.a(-92);
                        if(null != lna.g) {
                           lna.g.Z(1, 0);
                        }
                     }

                     sv.a(2, ((boolean[])((boolean[])var1[2]))[0] || lna.g != null && lna.g.q(), (Object[])((Object[])var1[4]));
                  }

                  try {
                     if(lna.g != null && (null == (var9 = (Object[])((Object[])var1[4])) || var9.length != 15)) {
                        lna.g.f(71);
                     }
                  } catch (cr var15) {
                     taa.a(var15, 32, var15.getMessage() + kqa.h.a((byte)86));
                     lg.a(true, 0, (byte)-85);
                  }
               }

               ((boolean[])((boolean[])var1[2]))[0] = false;
               Object[] var18;
               if(lna.g != null && ((var18 = (Object[])((Object[])var1[4])) == null || var18.length != 15) && ((int[])((int[])ec.f_i[1]))[0] > ((int[])((int[])((Object[])((Object[])var1[5]))[1]))[0]) {
                  va.b(-32144);
               }
            } catch (Exception var16) {
               continue;
            }
         }

         long var5 = he.a(86);
         int var19 = (int)(var3 + -var5 + 20L);
         if(var19 > 0) {
            qs.a((long)var19, 24);
         }
      }

      if(var1 != null && var1.length == 4) {
         this.run();
      }

   }

   static final Object[] a(int var0, Object[] var1, byte var2, int var3) {
      ++a;
      if(var1[1] == null) {
         var1[1] = new int[2];
      }

      if(var2 != -88) {
         return (Object[])null;
      } else {
         var1[0] = hja.a(var1, false);
         ((int[])((int[])var1[1]))[1] = var3;
         ((int[])((int[])var1[1]))[0] = var0;
         return var1;
      }
   }

   static final void a(Object[] var0, int var1) {
      ++b;
      if(null != var0 && var0.length == 87) {
         Class_s.c(var1 ^ -28, var0);
      } else if(null != var0 && 91 == var0.length) {
         kua.b((byte)120, var0);
      } else {
         if(var1 != 0) {
            a(98, (Object[])null, (byte)89, -6);
         }

         throw new IllegalStateException();
      }
   }

}
