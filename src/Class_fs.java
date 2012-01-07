
final class Class_fs {

   static int c;
   static int d;
   static Object[] f = ed.a(-2, new Object[1], (byte)-104, 0);
   static int b;
   static int e;
   static int h;
   static int g;
   static float[] a = new float[]{0.0F, 0.0F, 0.0F, 0.0F};


   static final void a(Object[] var0, int var1) {
      ++g;
      Class_g.a((byte)-128, (Object[])((Object[])var0[var1]), var0);
   }

   static final Object[] a(int var0, int var1, Object[] var2) {
      ++h;
      return var2[var1] != null && 0 <= var0 && var0 < ((Object[])((Object[])var2[3])).length?((Object[][])((Object[][])var2[3]))[var0]:null;
   }

   static final Object[] a(int var0, Object[] var1, int var2) {
      ++c;
      synchronized(var1[2]) {
         gea var3;
         Object[] var5 = (var3 = (gea)dna.a((byte)34, (Object[])((Object[])var1[2]), (long)var0)) != null?var3.t:null;
         if(var5 == null) {
            Object[] var8 = new Object[4];
            eta.a(var8, (int)-56);
            var8[3] = bd.a((int)-1, var8);
            ((int[])((int[])var8[1]))[0] = var0;
            var5 = var8;
            il.a((long)var0, null != var8?var8[3]:null, true, (Object[])((Object[])var1[2]));
         }

         if(var1 != null && (7 == var1.length || var1.length == 1)) {
            dga.a((byte)-69, (Object[])null);
         }

         boolean var7;
         if(var5[2] == null) {
            label258: {
               if(var5[0] == null) {
                  Object[] var11 = rja.f_i;
                  synchronized(rja.f_i) {
                     if(var1 != null && (var1.length == 1 || -2 == ~var1.length || 4 == var1.length)) {
                        return null;
                     }

                     if(!wl.a((byte)88, rja.f_i, ((int[])((int[])var5[1]))[0])) {
                        var7 = false;
                        break label258;
                     }

                     int[] var12 = nr.a(false, rja.f_i, ((int[])((int[])var5[1]))[0]);
                     var5[0] = new byte[var12.length][];

                     for(int var13 = 0; var12.length > var13; ++var13) {
                        ((byte[][])((byte[][])var5[0]))[var13] = qn.a(((int[])((int[])var5[1]))[0], var12[var13], rja.f_i, -93);
                     }
                  }
               }

               boolean var34 = true;

               Object[] var14;
               int var15;
               Object[] var16;
               for(int var35 = 0; ((Object[])((Object[])var5[0])).length > var35; ++var35) {
                  byte[] var36 = ((byte[][])((byte[][])var5[0]))[var35];
                  var14 = jta.a((byte)-108, var36, new Object[3]);
                  ((int[])((int[])var14[1]))[0] = 1;
                  var15 = de.a(var2 ^ 0, var14);
                  var16 = uh.f;
                  synchronized(uh.f) {
                     var34 &= hp.a(-125, uh.f, var15);
                  }
               }

               if(!var34) {
                  var7 = false;
               } else {
                  Object[] var38 = ura.a(var2 ^ -126, new Object[2]);
                  var14 = rja.f_i;
                  int[] var37;
                  synchronized(rja.f_i) {
                     var15 = jla.a(rja.f_i, (byte)-112, ((int[])((int[])var5[1]))[0]);
                     var5[2] = new er[var15];
                     var37 = nr.a(false, rja.f_i, ((int[])((int[])var5[1]))[0]);
                  }

                  for(int var39 = 0; ~var39 > ~var37.length; ++var39) {
                     byte[] var40 = ((byte[][])((byte[][])var5[0]))[var39];
                     if(var38 != null && var38.length == 21) {
                        bs.a(new Object[6][], -15, -12);
                     }

                     var16 = jta.a((byte)-119, var40, new Object[3]);
                     ((int[])((int[])var16[1]))[0] = 1;
                     int var17 = de.a((int)0, var16);
                     Object[] var18 = null;

                     td var9;
                     Object[] var19;
                     td var33;
                     for(var19 = null == (var33 = (td)dda.a(var38, 2))?null:var33.k; null != var19; var19 = null == (var9 = (td)client.a(var38, var2 ^ -28280))?null:var9.k) {
                        if(((int[])((int[])var19[1]))[1] == var17) {
                           var18 = var19;
                           break;
                        }
                     }

                     if(null == var18) {
                        var19 = uh.f;
                        synchronized(uh.f) {
                           Object[] var21 = new Object[6];
                           byte[] var22 = fd.a(-2, var17, uh.f);
                           if(null == var21[1]) {
                              var21[1] = new int[2];
                           }

                           var21[0] = hv.a((byte)71, var21);
                           ((int[])((int[])var21[1]))[1] = var17;
                           Object[] var23 = jta.a((byte)-125, var22, new Object[3]);
                           ((int[])((int[])var21[1]))[0] = fh.a(var23, false);
                           var21[5] = new int[((int[])((int[])var21[1]))[0]][];
                           var21[2] = new int[((int[])((int[])var21[1]))[0]];
                           var21[3] = new boolean[((int[])((int[])var21[1]))[0]];
                           var21[4] = new int[((int[])((int[])var21[1]))[0]];

                           int var24;
                           for(var24 = 0; ~var24 > ~((int[])((int[])var21[1]))[0]; ++var24) {
                              ((int[])((int[])var21[2]))[var24] = fh.a(var23, false);
                              if(6 == ((int[])((int[])var21[2]))[var24]) {
                                 ((int[])((int[])var21[2]))[var24] = 2;
                              }
                           }

                           for(var24 = 0; ((int[])((int[])var21[1]))[0] > var24; ++var24) {
                              ((boolean[])((boolean[])var21[3]))[var24] = -2 == ~fh.a(var23, false);
                           }

                           for(var24 = 0; var24 < ((int[])((int[])var21[1]))[0]; ++var24) {
                              ((int[])((int[])var21[4]))[var24] = de.a(var2 + 0, var23);
                           }

                           for(var24 = 0; ~var24 > ~((int[])((int[])var21[1]))[0]; ++var24) {
                              ((int[][])((int[][])var21[5]))[var24] = new int[fh.a(var23, false)];
                           }

                           for(var24 = 0; ~var24 > ~((int[])((int[])var21[1]))[0]; ++var24) {
                              for(int var25 = 0; ((int[][])((int[][])var21[5]))[var24].length > var25; ++var25) {
                                 ((int[][])((int[][])var21[5]))[var24][var25] = fh.a(var23, false);
                              }
                           }

                           if(var23 != null && 5 == var23.length && var23[4].equals(Integer.valueOf(1))) {
                              return null;
                           }

                           var18 = var21;
                        }

                        client.a(123, var38, (lm)(null == var18?null:var18[0]));
                     }

                     ((er[])((er[])var5[2]))[var37[var39]] = new er(var40, var18);
                  }

                  var7 = true;
                  var5[0] = null;
               }
            }
         } else {
            var7 = true;
         }

         if(!var7) {
            return null;
         } else {
            if(var2 != 0) {
               ((long[])((long[])var1[3]))[19] = ((long[])((long[])var1[0]))[14];
            }

            return var5;
         }
      }
   }

   static final int a(boolean var0, int var1) {
      if(var0) {
         f = (Object[])((Object[])f[3]);
      }

      ++e;
      return 127 & var1;
   }

   static final void a(float[] var0, int var1, boolean var2, Object[] var3, Object[] var4) {
      ++b;
      int var5 = va.a(var3, (byte)67);
      int var6 = nba.a(var3, (byte)-115);
      if(!var2) {
         f = (Object[])null;
      }

      if(eva.b(-74, var3) == rna.f_i) {
         if(0 <= var5) {
            gj.a(var4, var1, var0, (byte)121, var5);
         }

         if(0 <= var6) {
            gua.a(var1, var6, var0, -89, var4);
         }

      } else {
         throw new bba(var3, "");
      }
   }

   static final Object[] a(int var0, byte var1, Object[] var2, int var3, int var4, int var5) {
      ++d;
      mn.a(var2, (byte)79);
      ((int[])((int[])var2[0]))[3] = var3;
      ((int[])((int[])var2[0]))[1] = var4;
      if(var1 >= -58) {
         a(-61, -18, (Object[])null);
      }

      ((int[])((int[])var2[0]))[0] = var0;
      ((int[])((int[])var2[0]))[2] = var5;
      return var2;
   }

}
