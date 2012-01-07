import jagdx.IDirect3DDevice;

final class qga {

   static short[] n = new short[256];
   static int j = 503;
   static Object[] o = sd.a(new Object[1], 36, (byte)116);
   static int m;
   static int f;
   static int d;
   static int b;
   static int g;
   static int k;
   static int f_i;
   static int e;
   static int a;
   static int c;
   static int f_l;
   static Object[] h = ed.a(-2, new Object[1], (byte)-104, 74);


   static final Object[] a(Object[] var0, int var1, int var2) {
      if(null == var0[1]) {
         var0[1] = new int[1];
      }

      ++b;
      if(var1 != 15846) {
         a((Object[])((Object[])h[0]), (Object[])((Object[])var0[0]), ((int[])((int[])h[10]))[0]);
      }

      ((int[])((int[])var0[1]))[0] = var2;
      return var0;
   }

   static final oga a(Object[] var0, int var1) {
      int var2 = -55 % ((51 - var1) / 38);
      ++f_l;
      return new oga(var0);
   }

   static final boolean a(Object[] var0, byte var1) {
      ++c;
      if(((boolean[])((boolean[])var0[8]))[0]) {
         return true;
      } else {
         if(var1 < 99) {
            a(-94, (Object[])((Object[])o[44]), 2);
         }

         ((long[])((long[])var0[6]))[0] = null != var0[9]?IDirect3DDevice.CreateVertexShader(((long[])((long[])((Object[])((Object[])var0[11]))[50]))[5], (byte[])((byte[])var0[9])):0L;
         ((long[])((long[])var0[6]))[1] = var0[4] != null?IDirect3DDevice.CreatePixelShader(((long[])((long[])((Object[])((Object[])var0[11]))[50]))[5], (byte[])((byte[])var0[4])):0L;
         if(((long[])((long[])var0[6]))[0] == 0L && -1L == ~((long[])((long[])var0[6]))[1]) {
            return false;
         } else {
            int var2 = -1;

            int var3;
            for(var3 = 0; var3 < qsa.a((byte)-9, (Object[])((Object[])var0[10])); ++var3) {
               if(var0 == sm.a(3, var3, (Object[])((Object[])var0[10]))) {
                  var2 = var3;
                  break;
               }
            }

            Object[] var4 = (Object[])((Object[])var0[10]);
            if(var4 != null && -19 == ~var4.length && var4[7].equals(Integer.valueOf(0)) && var4[7].equals(Boolean.valueOf(false))) {
               return false;
            } else {
               var3 = ((int[])((int[])var4[1]))[1];
               int var5 = var3;
               int var6 = nla.a((byte)-35, (Object[])((Object[])var0[10]));

               int var7;
               Object[] var8;
               for(var7 = 0; var7 < var5; ++var7) {
                  Object[] var9 = (Object[])((Object[])var0[10]);
                  var8 = vi.a((Object[])((Object[])var9[5]), true, var7);
                  jq.a(var8, var2, 1);
               }

               for(var7 = 0; var6 > var7; ++var7) {
                  var8 = vfa.a((Object[])((Object[])var0[10]), false, var7);
                  jq.a(var8, var2, 1);
               }

               var7 = 0;
               int var16 = 0;
               int var17 = Class_cs.a((Object[])((Object[])var0[10]), 3, var0);

               for(int var10 = 0; ~var10 > ~(var5 + var6); ++var10) {
                  Object[] var11;
                  Object[] var13;
                  if(var10 >= var5) {
                     var11 = vfa.a((Object[])((Object[])var0[10]), false, -var5 + var10);
                  } else {
                     var13 = (Object[])((Object[])var0[10]);
                     Object[] var12 = vi.a((Object[])((Object[])var13[5]), true, var10);
                     var11 = var12;
                  }

                  var13 = eva.b(-36, var11);
                  int var14 = 1;
                  if(rna.f_i == var13) {
                     Object[] var15 = (Object[])((Object[])var11[6]);
                     var14 = ao.a(var11, (byte)-96);
                     var13 = var15;
                  }

                  int var18 = ((int[])((int[])var13[0]))[0];
                  if(43 != var18 && var18 != 76 && var18 != 101 && 17 != var18) {
                     if(var18 != 67 && 53 != var18 && 28 != var18 && var18 != 1) {
                        if(var18 != 62 && 55 != var18 && var18 != 110 && 8 != var18) {
                           if(121 != var18 && var18 != 10 && 114 != var18 && var18 != 12) {
                              var14 = 0;
                           } else {
                              var14 *= 4;
                           }
                        }
                     } else {
                        var14 *= 2;
                     }
                  } else {
                     var14 *= 3;
                  }

                  if(0 <= ((int[])((int[])var11[7]))[var17]) {
                     var18 = var14 + ((int[])((int[])var11[7]))[var17];
                     if(var7 < var18) {
                        var7 = var18;
                     }
                  }

                  if(((int[])((int[])var11[9]))[var17] >= 0) {
                     var18 = ((int[])((int[])var11[9]))[var17] + var14;
                     if(var18 > var16) {
                        var16 = var18;
                     }
                  }
               }

               var0[7] = new float[var16 * 4];
               ((boolean[])((boolean[])var0[8]))[0] = true;
               var0[5] = new float[var7 * 4];
               return true;
            }
         }
      }
   }

   static final void a(int var0, int var1, boolean var2, int var3, int var4) {
      ++k;
      Object[] var5 = la.a(0, (long)var4 | (long)var1 << 32, 19);
      jqa.a((byte)95, var5);
      ((int[])((int[])var5[0]))[1] = var3;
      if(!var2) {
         ((int[])((int[])var5[0]))[2] = var0;
      }
   }

   static final int b(boolean var0, Object[] var1) {
      if(var0) {
         ((int[])((int[])h[3]))[0] = 5;
      }

      ++g;
      return !kna.a(-112, (Object[])((Object[])var1[0]))?rl.a((Object[])((Object[])var1[0]), (byte)-61):100;
   }

   static final int b(Object[] var0, int var1) {
      ++e;
      return var1 != 13687?((int[])((int[])h[0]))[2]:((int[])((int[])var0[1]))[0];
   }

   static final Object[] a(int var0, Object[] var1, int var2) {
      if(var2 >= -126) {
         a(((int[])((int[])((Object[])((Object[])var1[3]))[0]))[1], ((byte[])((byte[])var1[0]))[0]);
      }

      ++f;
      Object[] var3;
      synchronized(var1[0]) {
         var3 = (Object[])((Object[])dna.a((byte)34, (Object[])((Object[])var1[0]), (long)var0));
      }

      if(null == var3) {
         byte[] var4;
         synchronized(var1[1]) {
            var4 = qn.a(29, var0, (Object[])((Object[])var1[1]), -122);
         }

         var3 = hia.a((byte)95, new Object[2]);
         if(var4 != null) {
            Object[] var5 = jta.a((byte)-85, var4, new Object[3]);

            while(true) {
               int var6 = fh.a(var5, false);
               if(var6 == 0) {
                  break;
               }

               if(var6 == 1) {
                  ((int[])((int[])var3[1]))[0] = de.a((int)0, var5);
               } else if(var6 == 2) {
                  var3[0] = new int[fh.a(var5, false)];
                  if(null != var1 && var1.length == 5) {
                     return null;
                  }

                  for(int var7 = 0; var7 < ((int[])((int[])var3[0])).length; ++var7) {
                     ((int[])((int[])var3[0]))[var7] = de.a((int)0, var5);
                  }
               } else if(var6 == 3) {
                  ((int[])((int[])var3[1]))[1] = fh.a(var5, false);
               } else if(var6 != 4) {
                  if(5 == var6) {
                     ((int[])((int[])var3[1]))[2] = fma.c(-17126, var5);
                  }
               } else {
                  ((int[])((int[])var3[1]))[3] = fh.a(var5, false);
               }
            }
         }

         synchronized(var1[0]) {
            il.a((long)var0, var3, true, (Object[])((Object[])var1[0]));
            return var3;
         }
      } else {
         return var3;
      }
   }

   static final boolean a(int var0, byte var1) {
      ++m;

      ni var2;
      ni var3;
      for(Object[] var4 = null == (var2 = (ni)dda.a(ssa.d, var1 - 125))?null:var2.t; null != var4; var4 = (var3 = (ni)client.a(ssa.d, var1 ^ -28169)) == null?null:var3.t) {
         if(Class_m.a(((int[])((int[])var4[1]))[1], -59) && ~((long[])((long[])var4[2]))[1] == ~((long)var0)) {
            return true;
         }
      }

      if(var1 != 127) {
         n = (short[])null;
      }

      return false;
   }

   static final int a(Object[] var0, byte var1, Object[] var2) {
      ++f_i;
      int var3 = ((int[])((int[])var2[0]))[((int[])((int[])var0[1]))[3]];
      if(var1 != 122) {
         j = 0;
      }

      return var3 >= 8192?16384 - (32 + (128 + -((int[])((int[])var0[1]))[7]) * (-var3 + 16384) >> 6):32 + var3 * ((int[])((int[])var0[1]))[7] >> 6;
   }

   static final void a(Object[] var0, Object[] var1, int var2) {
      ++a;
      int var3 = -13 % ((var2 + 66) / 52);
      var1[1] = dv.a(var0, (byte)-30);
      if(var1[1] != null) {
         fh.a(var0, false);
         ((byte[])((byte[])var1[3]))[0] = ipa.a(var0, (int)-93);
         ((byte[])((byte[])var1[3]))[1] = ipa.a(var0, (int)-112);
      }

   }

   static final void a(boolean var0, Object[] var1) {
      ioa.a[rq.g++] = wra.a((byte)-127, var1);
      ++d;
      mj.a[bj.e++] = ad.a((int)0, var1);
      mj.a[bj.e++] = pba.a(var1, (byte)95);
      String[] var2 = mj.a;
      if(!var0) {
         j = 13;
      }

      int var3 = bj.e++;
      String var4;
      if(!kea.c && null != var1) {
         int[] var5 = bua.a(var1, (int)9);
         if(var5 == null) {
            var4 = "";
         } else {
            var4 = jla.a(var5, 11557);
         }
      } else {
         var4 = "";
      }

      var2[var3] = var4;
   }

}
