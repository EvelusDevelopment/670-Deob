import jaggl.OpenGL;

final class Class_h implements re, lua {

   static int e;
   static int g;
   static int j;
   static int n;
   static boolean[] h = new boolean[200];
   static int d;
   static int m;
   static int k;
   Object[] a;
   static int b;
   static int f;
   static int c;
   static int f_i;
   static int f_l;


   static final void b(Object[] var0, int var1) {
      if(var1 != 1) {
         ((boolean[])((boolean[])var0[11]))[6] = ((boolean[])((boolean[])var0[1]))[2];
      }

      ++f_l;
   }

   public final int c() {
      ++g;
      return cva.b(this.a, false);
   }

   static final Object[] a(Object[] var0, int var1, int var2) {
      if(var2 < 62) {
         return (Object[])null;
      } else {
         ++d;
         Object[] var3;
         synchronized(var0[0]) {
            var3 = (Object[])((Object[])dna.a((byte)34, (Object[])((Object[])var0[0]), (long)var1));
         }

         if(var3 == null) {
            byte[] var4;
            synchronized(var0[2]) {
               var4 = qn.a(32, var1, (Object[])((Object[])var0[2]), -57);
            }

            if(var0 != null && (var0.length == 2 || var0.length == 5)) {
               return null;
            } else {
               var3 = mpa.a(1, new Object[10]);
               var3[6] = var0;
               if(null != var4) {
                  Object[] var5 = jta.a((byte)-101, var4, new Object[3]);

                  while(true) {
                     int var6 = fh.a(var5, false);
                     if(0 == var6) {
                        if(null != var0 && 1 == var0.length && var0[0].equals(Integer.valueOf(0))) {
                           return (Object[])((Object[])np.f[0]);
                        }
                        break;
                     }

                     kna.a(var5, var3, 1, var6);
                  }
               }

               synchronized(var0[0]) {
                  il.a((long)var1, var3, true, (Object[])((Object[])var0[0]));
                  return var3;
               }
            }
         } else {
            return var3;
         }
      }
   }

   static final void b(byte var0, Object[] var1) {
      ++f;
      if(var0 >= 81) {
         if(!kea.c) {
            ((lm)(var1 == null?null:var1[6])).a((byte)126);
            --nma.h;
            if(null != var1 && (var1.length == 3 || 6 == var1.length)) {
               joa.a(3, (Object[])null);
            }

            Object[] var11;
            if(((boolean[])((boolean[])var1[4]))[1]) {
               if(var1 != null && var1.length == 6) {
                  ooa.a(109);
               }

               nq var5;
               nq var6;
               for(Object[] var9 = null == (var5 = (nq)gm.a(rpa.b, 0))?null:var5.u; null != var9; var9 = (var6 = (nq)dka.a(rpa.b, (byte)21)) == null?null:var6.u) {
                  if(((String)var9[3]).equals(var1[5])) {
                     if(var9 != null && -9 == ~var9.length) {
                        vk.g = 90;
                     }

                     boolean var10 = false;

                     ni var7;
                     ni var8;
                     for(var11 = null == (var7 = (ni)gm.a((Object[])((Object[])var9[0]), 0))?null:var7.t; var11 != null; var11 = null == (var8 = (ni)dka.a((Object[])((Object[])var9[0]), (byte)42))?null:var8.t) {
                        if(var1 == var11) {
                           var10 = true;
                           if(fta.a(var9, var1, (byte)-107)) {
                              nma.a(var9, (int)7);
                           }
                           break;
                        }
                     }

                     if(var10) {
                        break;
                     }
                  }
               }
            } else {
               long var12 = ((long[])((long[])var1[2]))[0];
               nq var3;
               var11 = null == (var3 = (nq)pm.a(var12, ov.a, false))?null:var3.u;
               if(null != var11 && -8 == ~var11.length) {
                  voa.a(false);
               }

               while(null != var11 && !((String)var11[3]).equals(var1[5])) {
                  nq var4;
                  var11 = null == (var4 = (nq)mla.b(ov.a, (byte)123))?null:var4.u;
               }

               if(var11 != null && fta.a(var11, var1, (byte)-125)) {
                  nma.a(var11, (int)7);
               }
            }

         }
      }
   }

   static final void a(boolean var0, boolean var1, Object[] var2) {
      ++j;
      if(!var0) {
         if(((boolean[])((boolean[])var2[3]))[1]) {
            if(-1 < ~((int[])((int[])var2[1]))[2] || osa.a(((int[])((int[])var2[1]))[7], ((int[])((int[])var2[1]))[2], false)) {
               if(!var1) {
                  oga.a(((int[])((int[])var2[1]))[0], -1, ((int[])((int[])var2[1]))[4], 75, ((int[])((int[])var2[1]))[5], ((int[])((int[])var2[1]))[3], ((int[])((int[])var2[1]))[2], ((int[])((int[])var2[1]))[7], ((int[])((int[])var2[1]))[9]);
               } else {
                  eia.a(((int[])((int[])var2[1]))[3], ((int[])((int[])var2[1]))[0], ((int[])((int[])var2[1]))[5], ((int[])((int[])var2[1]))[9], -14733, (Object[])null);
               }

               ((lm)(null == var2?null:var2[2])).a((byte)118);
            }
         } else if(((boolean[])((boolean[])var2[3]))[0] && -2 >= ~((int[])((int[])var2[1]))[5] && ((int[])((int[])var2[1]))[0] >= 1 && ~(-2 + rp.c) <= ~((int[])((int[])var2[1]))[5] && wpa.a - 2 >= ((int[])((int[])var2[1]))[0] && (((int[])((int[])var2[1]))[8] < 0 || osa.a(((int[])((int[])var2[1]))[6], ((int[])((int[])var2[1]))[8], false))) {
            if(var1) {
               eia.a(((int[])((int[])var2[1]))[3], ((int[])((int[])var2[1]))[0], ((int[])((int[])var2[1]))[5], ((int[])((int[])var2[1]))[9], -14733, (Object[])((Object[])var2[0]));
            } else {
               oga.a(((int[])((int[])var2[1]))[0], -1, ((int[])((int[])var2[1]))[1], 123, ((int[])((int[])var2[1]))[5], ((int[])((int[])var2[1]))[3], ((int[])((int[])var2[1]))[8], ((int[])((int[])var2[1]))[6], ((int[])((int[])var2[1]))[9]);
            }

            ((boolean[])((boolean[])var2[3]))[0] = false;
            if(!var1 && ((int[])((int[])var2[1]))[2] == ((int[])((int[])var2[1]))[8] && ~((int[])((int[])var2[1]))[2] == 0) {
               ((lm)(null == var2?null:var2[2])).a((byte)18);
            } else if(!var1 && ((int[])((int[])var2[1]))[2] == ((int[])((int[])var2[1]))[8] && ~((int[])((int[])var2[1]))[4] == ~((int[])((int[])var2[1]))[1] && ((int[])((int[])var2[1]))[6] == ((int[])((int[])var2[1]))[7]) {
               ((lm)(null != var2?var2[2]:null)).a((byte)118);
            }
         }

      }
   }

   static final void a(Object[] var0, int var1, int var2, int var3, int var4, int var5) {
      boolean var6 = true;
      int var7 = var2;
      int var8 = var2 + var4;
      int var9 = var3 - 1;
      int var10 = var3 + var5;

      for(int var11 = var1; var11 <= var1 + 1; ++var11) {
         if(var11 != ri.n) {
            for(int var12 = var7; var12 <= var8; ++var12) {
               if(var12 >= 0 && var12 < eja.c) {
                  for(int var13 = var9; var13 <= var10; ++var13) {
                     if(var13 >= 0 && var13 < me.c && (!var6 || var12 >= var8 || var13 >= var10 || var13 < var3 && var12 != var2)) {
                        Object[] var14 = ju.g[var11][var12][var13];
                        if(var14 != null) {
                           int var15 = (jp.o[var11].b(-48, var13, var12) + jp.o[var11].b(-76, var13, var12 + 1) + jp.o[var11].b(-36, var13 + 1, var12) + jp.o[var11].b(-52, var13 + 1, var12 + 1)) / 4 - (jp.o[var1].b(-103, var3, var2) + jp.o[var1].b(-56, var3, var2 + 1) + jp.o[var1].b(-31, var3 + 1, var2) + jp.o[var1].b(-128, var3 + 1, var2 + 1)) / 4;
                           Object[] var16 = (Object[])((Object[])var14[4]);
                           Object[] var17 = (Object[])((Object[])var14[2]);
                           if(var16 != null && fja.a(9, var16)) {
                              wfa.a((var13 - var3) * iia.n + (1 - var5) * iba.b, 1, var6, (var12 - var2) * iia.n + (1 - var4) * iba.b, mpa.b, var15, var16, var0);
                           }

                           if(var17 != null && fja.a(9, var17)) {
                              wfa.a((var13 - var3) * iia.n + (1 - var5) * iba.b, 1, var6, (var12 - var2) * iia.n + (1 - var4) * iba.b, mpa.b, var15, var17, var0);
                           }

                           for(Object[] var18 = (Object[])((Object[])var14[3]); var18 != null; var18 = (Object[])((Object[])var18[0])) {
                              Object[] var19 = (Object[])((Object[])var18[1]);
                              if(var19 != null && fja.a(9, var19) && (var12 == ((short[])((short[])var19[13]))[1] || var12 == var7) && (var13 == ((short[])((short[])var19[13]))[3] || var13 == var9)) {
                                 int var20 = ((short[])((short[])var19[13]))[0] - ((short[])((short[])var19[13]))[1] + 1;
                                 int var21 = ((short[])((short[])var19[13]))[2] - ((short[])((short[])var19[13]))[3] + 1;
                                 wfa.a((((short[])((short[])var19[13]))[3] - var3) * iia.n + (var21 - var5) * iba.b, 1, var6, (((short[])((short[])var19[13]))[1] - var2) * iia.n + (var20 - var4) * iba.b, mpa.b, var15, var19, var0);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var7;
            var6 = false;
         }
      }

   }

   Class_h(Object[] var1) {
      this.a = var1;
   }

   static final void a(Object[] var0, int var1, ta var2) {
      ++b;
      ec.a((Object[])((Object[])var0[var1]), (byte)34, var2);
   }

   public final void a() {
      nk.a(false, this.a);
      ++f_i;
   }

   static final void a(byte var0, int var1, Object[] var2, byte[] var3, int var4) {
      if(var0 != -71) {
         h = (boolean[])((boolean[])((Object[])((Object[])var2[5]))[1]);
      }

      ++k;
      if(var2 != null && var2.length == 5) {
         sda.a(var0 ^ -85, new Object[6][]);
      }

      for(int var5 = var4; var4 + var1 > var5; ++var5) {
         byte[] var10002 = (byte[])((byte[])var2[2]);
         int[] var10003 = (int[])((int[])var2[1]);
         int var10006 = ((int[])((int[])var2[1]))[0];
         var10003[0] = ((int[])((int[])var2[1]))[0] + 1;
         var3[var5] = var10002[var10006];
      }

   }

   static final void a(Object[] var0, int var1) {
      ++n;
      an.a(vqa.a((Object[])((Object[])var0[8]), (byte)52), (Object[])((Object[])var0[8]), true);
      rsa.a(var1 ^ -12421, (Object[])((Object[])var0[8]));
      mn.a((Object[])((Object[])var0[var1]), (Object[])((Object[])var0[8]), (byte)74, 0, (Object[])((Object[])var0[5]));
      vla.a((Object[])((Object[])var0[7]), true, (Object[])((Object[])var0[9]), (Object[])((Object[])var0[8]));
      kaa.a((Object[])((Object[])var0[0]), (Object[])((Object[])var0[8]), 93, (Object[])((Object[])var0[6]));
      Object[] var2 = (Object[])((Object[])var0[8]);
      Object[] var3 = (Object[])((Object[])var0[4]);
      int var4 = ((int[])((int[])var0[1]))[0];
      float var5 = (float)((16740321 & var4) >> 16) / 255.0F;
      float var6 = (float)(255 & var4 >> 8) / 255.0F;
      float var7 = (float)(255 & var4) / 255.0F;
      float var8 = (float)(var4 >> 24 & 255) / 255.0F;
      fta.a(var2, var8, var3, var7, var5, (byte)21, var6);
   }

   static final void a(byte var0, Object[] var1) {
      synchronized(var1[4]) {
         dq.a(61, (Object[])((Object[])var1[4]));
         if(var0 != 22) {
            h = (boolean[])null;
         }
      }

      ++e;
   }

   static final int[] a(int var0, int var1, int var2, Object[] var3, int var4, int var5) {
      if(var0 != -30937) {
         h = (boolean[])null;
      }

      ++c;
      if(null == ((ta)var3[55]).E) {
         return null;
      } else {
         if(null != var3 && (var3.length == 10 || var3.length == 2)) {
            dma.f = null;
         }

         int[] var6 = new int[var5 * var4];
         int var7 = ((ta)var3[55]).E.d();

         for(int var8 = 0; var5 > var8; ++var8) {
            OpenGL.glReadPixelsi(var2, -1 + -var8 + -var1 + var7, var4, 1, '\u80e1', ((int[])((int[])var3[1]))[37], var6, var8 * var4);
         }

         return var6;
      }
   }

   public final int b() {
      ++m;
      Object[] var2 = this.a;
      Object[] var4 = (Object[])((Object[])var2[0]);
      int var3 = ((int[])((int[])var4[1]))[3];
      return var3;
   }

}
