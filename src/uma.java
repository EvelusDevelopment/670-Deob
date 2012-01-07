import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

final class uma extends ya {

   static boolean C = false;
   static int B;
   Object[] A;
   static int F;
   static int G;
   static int E = 0;
   static int D;
   static int y;
   static int H;
   static int z;


   static final int b(int var0, Object[] var1) {
      ++B;
      return var0 != 12?-50:((int[])((int[])var1[1]))[0];
   }

   static final void a(boolean var0, int var1, boolean var2, int var3, Object[] var4, int var5, int var6, int var7, int var8, int var9) {
      if(var7 != -27857) {
         a((ta)null, (Object[])null, false);
      }

      ++z;
      if(var0) {
         long var10 = IDirect3DDevice.GetRenderTarget(((long[])((long[])((Object[])((Object[])var4[2]))[50]))[5], 0);
         IDirect3DDevice.StretchRect(((long[])((long[])((Object[])((Object[])var4[2]))[50]))[5], dca.b(((Object[][])((Object[][])var4[6]))[0], 6), var6, var3, var5, var8, var10, var1, var9, var5, var8, 0);
         IUnknown.Release(var10);
      }

   }

   static final void a(Object[] var0, boolean var1, byte var2) {
      ++y;
      if(nma.h < 404) {
         if(uta.g != var0) {
            String var5;
            if(((int[])((int[])var0[12]))[55] == 0) {
               boolean var6 = true;
               if(0 != ~((int[])((int[])uta.g[12]))[53] && 0 != ~((int[])((int[])var0[12]))[53]) {
                  int var7 = ((int[])((int[])uta.g[12]))[53] < ((int[])((int[])var0[12]))[53]?((int[])((int[])uta.g[12]))[53]:((int[])((int[])var0[12]))[53];
                  int var8 = -((int[])((int[])var0[12]))[45] + ((int[])((int[])uta.g[12]))[45];
                  if(var8 < 0) {
                     var8 = -var8;
                  }

                  if(var8 > var7) {
                     var6 = false;
                  }
               }

               String var11 = fsa.g != vw.e?gj.a(dp.y, 95, gj.f_db):gj.a(dp.y, -124, gj.t);
               if(((int[])((int[])var0[12]))[45] >= ((int[])((int[])var0[12]))[56]) {
                  var5 = tn.a(var0, true, (byte)55) + (!var6?el.a(16777215, 0):ui.a(((int[])((int[])uta.g[12]))[45], (byte)116, ((int[])((int[])var0[12]))[45])) + qla.d + var11 + ((int[])((int[])var0[12]))[45] + fv.f_i;
               } else {
                  var5 = tn.a(var0, true, (byte)55) + (!var6?el.a(16777215, 0):ui.a(((int[])((int[])uta.g[12]))[45], (byte)117, ((int[])((int[])var0[12]))[45])) + qla.d + var11 + ((int[])((int[])var0[12]))[45] + "+" + (((int[])((int[])var0[12]))[56] + -((int[])((int[])var0[12]))[45]) + fv.f_i;
               }
            } else if(((int[])((int[])var0[12]))[55] != -1) {
               var5 = tn.a(var0, true, (byte)55) + qla.d + gj.a(dp.y, 127, gj.E) + ((int[])((int[])var0[12]))[55] + fv.f_i;
            } else {
               var5 = tn.a(var0, true, (byte)55);
            }

            if(ra.h && !var1 && (kd.c & 8) != 0) {
               oja.a(0, kca.b + " " + iv.a + " " + el.a(16777215, 0) + var5, (long)((int[])((int[])var0[12]))[21], false, aj.a, false, 0, true, qp.b, -1, (byte)-23, 44, (long)((int[])((int[])var0[12]))[21]);
               ++jsa.b;
            }

            if(var1) {
               oja.a(0, "", (long)((int[])((int[])var0[12]))[21], true, -1, false, 0, false, el.a(13421772, 0) + var5, 0, (byte)-119, -1, 0L);
            } else {
               for(int var10 = 7; 0 <= var10; --var10) {
                  if(ps.f_i[var10] != null) {
                     short var13 = 0;
                     if(uha.g == fsa.g && ps.f_i[var10].equalsIgnoreCase(gj.a(dp.y, -122, gj.V))) {
                        if(ma.n && ~((int[])((int[])uta.g[12]))[45] > ~((int[])((int[])var0[12]))[45]) {
                           var13 = 2000;
                        }

                        if(((int[])((int[])uta.g[12]))[43] != 0 && ((int[])((int[])var0[12]))[43] != 0) {
                           if(~((int[])((int[])uta.g[12]))[43] == ~((int[])((int[])var0[12]))[43]) {
                              var13 = 2000;
                           } else {
                              var13 = 0;
                           }
                        } else if(((boolean[])((boolean[])var0[8]))[10]) {
                           var13 = 2000;
                        }
                     } else if(ld.d[var10]) {
                        var13 = 2000;
                     }

                     short var14 = (short)(cra.j[var10] + var13);
                     int var9 = -1 == mta.f[var10]?fha.t:mta.f[var10];
                     ++dia.d;
                     oja.a(0, el.a(16777215, 0) + var5, (long)((int[])((int[])var0[12]))[21], false, var9, false, 0, true, ps.f_i[var10], -1, (byte)91, var14, (long)((int[])((int[])var0[12]))[21]);
                  }
               }

               if(var0 != null && -30 == ~var0.length && var0[7].equals(Integer.valueOf(1)) && var0[7].equals(Integer.valueOf(2))) {
                  ij.f = null;
               }
            }

            if(var2 != -110) {
               a((ta)null, (Object[])null, false);
            }

            ni var4;
            if(!var1) {
               ni var3;
               for(Object[] var12 = null == (var3 = (ni)dda.a(ssa.d, 2))?null:var3.t; var12 != null; var12 = null != (var4 = (ni)client.a(ssa.d, -28280))?var4.t:null) {
                  if(-11 == ~((int[])((int[])var12[1]))[1]) {
                     var12[3] = el.a(16777215, 0) + var5;
                     break;
                  }
               }
            }

         } else {
            if(ra.h && 0 != (kd.c & 16)) {
               oja.a(0, kca.b + " " + iv.a + " " + el.a(16777215, 0) + gj.a(dp.y, 89, gj.f_bb), (long)((int[])((int[])var0[12]))[21], false, aj.a, false, 0, true, qp.b, -1, (byte)110, 8, 0L);
               ++Class_v.f;
            }

         }
      }
   }

   uma(Object[] var1) {
      this.A = var1;
   }

   static final uq a(Object[] var0, int var1) {
      ++F;
      return var1 <= 59?(uq)null:new uq(var0);
   }

   static final boolean b(byte var0, int var1, int var2) {
      ++H;
      if(var0 <= 52) {
         a((ta)null, (Object[])null, true);
      }

      return (var1 & 52) != 0;
   }

   static final void a(ta var0, Object[] var1, boolean var2) {
      if(!var2) {
         E = ((int[])((int[])var1[0]))[2];
      }

      ++D;
      ya var3 = null;
      Object[] var4;
      if(null == var1[15] && ((boolean[])((boolean[])var1[8]))[5]) {
         var4 = gha.a(262144, true, var0, 1, var1);
         var3 = (ya)(null != var4?var4[0]:null);
      } else {
         var3 = (ya)var1[15];
         var1[15] = null;
      }

      var4 = (Object[])((Object[])woa.a(5, var1)[1]);
      if(null != var3) {
         bi.a(var3, ((byte[])((byte[])var1[10]))[1], (int)((float[])((float[])var4[1]))[2], (int)((float[])((float[])var4[1]))[1], (boolean[])null);
      }

   }

   static final int a(int var0, int var1) {
      ++G;
      int var2 = var1 >>> 1;
      var2 |= var2 >>> 1;
      var2 |= var2 >>> 2;
      var2 |= var2 >>> 4;
      var2 |= var2 >>> 8;
      if(var0 != -32125) {
         a(true, -35, true, -127, (Object[])null, 22, -106, 79, -48, 101);
      }

      var2 |= var2 >>> 16;
      return ~var2 & var1;
   }

}
