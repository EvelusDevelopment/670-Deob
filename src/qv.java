
final class qv {

   static int g;
   static Object[] k = iha.a(1, (int)0, new Object[1]);
   static Object[] c;
   static int b;
   static int e;
   static int f;
   static Object[] h = sl.a("11", 0, new Object[1], "11");
   static int j;
   static float f_i = 1107.0F;
   static int[] a = new int[2];
   static int d;


   static final void a(int var0) {
      ++f;
      Object[] var1 = null;

      try {
         var1 = ug.a("2", (String)fsa.g[2], 3, true);
         Object[] var2 = hi.newByteBufferWrapper(3 + sga.d * 6);
         int var3 = 1 % ((31 - var0) / 39);
         ek.putByte(var2, 1);
         eda.a((byte)115, var2, sga.d);

         for(int var4 = 0; var4 < hg.f.length; ++var4) {
            if(nt.e[var4]) {
               eda.a((byte)119, var2, var4);
               op.putInt(var2, hg.f[var4]);
            }
         }

         mr.a(0, var1, 19444, (byte[])((byte[])var2[2]), ((int[])((int[])var2[1]))[0]);
         if(var2 != null && -2 == ~var2.length) {
            ((byte[])((byte[])pi.y[1]))[1] = 47;
         }
      } catch (Exception var6) {
         ;
      }

      try {
         if(null != var1) {
            it.a(var1, false);
         }
      } catch (Exception var5) {
         ;
      }

      jsa.c = he.a(82);
      dn.d = false;
   }

   static final Object[] a(byte var0, Object[] var1) {
      ++d;
      if(var0 != -12) {
         return (Object[])((Object[])h[4]);
      } else {
         Object[] var2 = fpa.a(-101)[fh.a(var1, false)];
         Object[] var3 = iw.a((byte)-121)[fh.a(var1, false)];
         int var4 = jia.c(-8166, var1);
         int var5 = jia.c(-8166, var1);
         int var6 = de.a(var0 + 12, var1);
         int var7 = de.a(var0 + 12, var1);
         int var8 = jia.c(-8166, var1);
         if(var3 != null && (var3.length == 2 && var3[1].equals(Integer.valueOf(2)) || var3.length == 2 && var3[1].equals(Integer.valueOf(1)))) {
            return null;
         } else {
            int var9 = fma.c(-17126, var1);
            int var10 = lr.a(var0 + 13, var1);
            return lka.a(var5, var8, var10, var6, var7, var2, var9, 13965, var3, var4, new Object[3]);
         }
      }
   }

   static final void a(int var0, int var1, boolean var2, int var3, int var4, int var5, int var6, Object[] var7) {
      ++g;
      Object[] var8 = ((Object[][])((Object[][])var7[18]))[var6];
      int var9 = ((int[])((int[])var8[1]))[1];
      if(-1 != var5 && var9 != -1) {
         Object[] var10;
         Object[] var11;
         if(var5 != var9) {
            var10 = qda.a(var5, (byte)-64, dfa.a);
            var11 = qda.a(var9, (byte)-64, dfa.a);
            if(~((int[])((int[])var10[1]))[4] != 0 && ((int[])((int[])var11[1]))[4] != -1) {
               Object[] var12 = bs.a(he.b, -15, ((int[])((int[])var10[1]))[4]);
               Object[] var13 = bs.a(he.b, -15, ((int[])((int[])var11[1]))[4]);
               if(~((int[])((int[])var12[1]))[1] > ~((int[])((int[])var13[1]))[1]) {
                  return;
               }
            }
         } else {
            var10 = qda.a(var5, (byte)-64, dfa.a);
            if(((boolean[])((boolean[])var10[6]))[0] && 0 != ~((int[])((int[])var10[1]))[4]) {
               var11 = bs.a(he.b, -15, ((int[])((int[])var10[1]))[4]);
               int var15 = ((int[])((int[])var11[1]))[4];
               if(var15 == 0) {
                  return;
               }

               if(2 == var15) {
                  ei.a((Object[])((Object[])var8[0]), (byte)104);
                  return;
               }
            }
         }
      }

      byte var14 = 0;
      if(var5 != -1 && !((boolean[])((boolean[])qda.a(var5, (byte)-64, dfa.a)[6]))[0]) {
         var14 = 2;
      }

      if(-1 != var5 && var2) {
         var14 = 1;
      }

      ((int[])((int[])var8[1]))[2] = var0 >> 16;
      ((int[])((int[])var8[1]))[3] = var3;
      ((int[])((int[])var8[1]))[1] = var5;
      ((int[])((int[])var8[1]))[0] = var1;
      if(var4 > -45) {
         a(100, -61, ((boolean[])((boolean[])c[2]))[4], ((int[])((int[])c[4]))[6], 125, -126, 50, (Object[])null);
      }

      tma.a(119, '\uffff' & var0, (Object[])((Object[])var8[0]), var14, false, -1 == var5?-1:((int[])((int[])qda.a(var5, (byte)-64, dfa.a)[1]))[4]);
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      ++e;
      if(var3 != 23439) {
         a = (int[])null;
      }

      if(0 <= var1 && 0 <= var7 && -1 + rp.c > var1 && -1 + wpa.a > var7) {
         if(null == ju.g) {
            return;
         }

         Object[] var8;
         if(var6 != 0) {
            if(1 != var6) {
               if(var6 != 2) {
                  if(var6 == 3) {
                     var8 = cba.a(var5, var1, var7);
                     if(var8 != null) {
                        if(var8 != null && -23 == ~var8.length) {
                           oqa.a((Object[])((Object[])var8[18]), var4, 66);
                        } else {
                           oga.a(var7, var4, var2, 109, var1, var5, uaa.a(var8, 121), var0, var6);
                        }
                     }
                  }
               } else {
                  var8 = InputStreamWorker.a(var5, var1, var7, ke.f);
                  if(var8 != null) {
                     if(11 == var0) {
                        var0 = 10;
                     }

                     if(var8 != null && var8.length == 16) {
                        oqa.a((Object[])((Object[])var8[14]), var4, 102);
                     } else {
                        oga.a(var7, var4, var2, 121, var1, var5, uaa.a(var8, 114), var0, var6);
                     }
                  }
               }
            } else {
               var8 = kaa.a(var5, var1, var7);
               if(var8 != null) {
                  if(null != var8 && var8.length == 20 && ((boolean[])((boolean[])var8[8])).length == 6) {
                     oqa.a((Object[])((Object[])var8[17]), var4, var3 - 23327);
                  } else {
                     int var9 = uaa.a(var8, 117);
                     if(4 != var0 && var0 != 5) {
                        if(var0 == 6) {
                           oga.a(var7, var4, var2 + 4, var3 - 23318, var1, var5, var9, 4, var6);
                        } else if(var0 == 7) {
                           oga.a(var7, var4, (3 & 2 + var2) + 4, 81, var1, var5, var9, 4, var6);
                        } else if(var0 == 8) {
                           oga.a(var7, var4, var2 + 4, var3 - 23351, var1, var5, var9, 4, var6);
                           oga.a(var7, var4, (2 + var2 & 3) + 4, 67, var1, var5, var9, 4, var6);
                        }
                     } else {
                        oga.a(var7, var4, var2, 69, var1, var5, var9, 4, var6);
                     }
                  }
               }
            }
         } else {
            var8 = cu.a(var5, var1, var7);
            Object[] var10 = tka.a(var5, var1, var7);
            if(var8 != null && 2 != var0) {
               if(var8 != null && 20 == var8.length && 7 == ((boolean[])((boolean[])var8[8])).length) {
                  oqa.a((Object[])((Object[])var8[19]), var4, 21);
               } else {
                  oga.a(var7, var4, var2, 82, var1, var5, uaa.a(var8, 127), var0, var6);
               }
            }

            if(var10 != null) {
               if(var10 != null && -21 == ~var10.length && ((boolean[])((boolean[])var10[8])).length == 7) {
                  oqa.a((Object[])((Object[])var10[19]), var4, var3 ^ 23480);
               } else {
                  oga.a(var7, var4, var2, 59, var1, var5, uaa.a(var10, 122), var0, var6);
               }
            }
         }
      }

   }

   static final int a(int var0, Object[] var1) {
      ++b;
      if(null != var1 && var1.length == 16 && ((boolean[])((boolean[])var1[8])).length == 7) {
         return ola.a(var1, -28642);
      } else if(null != var1 && var1.length == 43) {
         return pq.b(var1, -7);
      } else if(null != var1 && var1.length == 20 && ((int[])((int[])var1[12])).length == 3 && 6 == ((boolean[])((boolean[])var1[8])).length) {
         return lga.c(126, var1);
      } else {
         int var2;
         if(var1 != null && -17 == ~var1.length && ((boolean[])((boolean[])var1[8])).length == 5) {
            var2 = ((int[])((int[])var1[12]))[8] - gda.a(-117, var1);
            return var2;
         } else if(null != var1 && 22 == var1.length) {
            var2 = oga.a((Object[])((Object[])var1[18]), true);
            return var2;
         } else {
            if(var0 != 2) {
               a(((int[])((int[])h[1]))[6], -106, ((boolean[])((boolean[])c[3]))[24], ((int[])((int[])((Object[])((Object[])((Object[])((Object[])k[6]))[4]))[0]))[0], ((int[])((int[])k[4]))[12], -14, 93, (Object[])null);
            }

            if(var1 != null && 20 == var1.length && ((boolean[])((boolean[])var1[8])).length == 7) {
               Object[] var4 = (Object[])((Object[])var1[19]);
               int var3 = -cba.a(26951, var4);
               return var3;
            } else {
               var2 = -dca.a(true, var1);
               return var2;
            }
         }
      }
   }

   static final void a(int var0, lh var1) {
      ++j;
      Object[] var3 = qs.h;
      synchronized(var3) {
         gma.a(31708, false, var3, true, var1);
      }

      if(qf.b != null) {
         Object[] var2 = qs.h;
         rna.a((kp)(null == qs.h?null:var2[19]), -20224, qf.b);
      }

      dl.d = var0;
      gta.a = null;
      rua.a = null;
      gma.d = null;
      bp.c = null;
   }

}
