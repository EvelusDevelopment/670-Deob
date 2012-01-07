import jagdx.IDirect3DIndexBuffer;
import jagdx.fna;

final class ava extends lm {

   static int k;
   static int j;
   static int f_l;
   static int o;
   static int q;
   static Object[] p = ed.a(-2, new Object[1], (byte)-126, 23);
   Object[] m;
   static int n;
   static int r;


   static final boolean a(int var0, long var1, Object[] var3, int var4, int var5) {
      ++r;
      return var0 < 36?true:fna.a(IDirect3DIndexBuffer.Upload(((long[])((long[])var3[6]))[0], var5, var4, !((boolean[])((boolean[])var3[3]))[0]?0:8192, var1), (byte)-53);
   }

   static final void a(Object[] var0, int var1, int var2) {
      ++j;
      if(null == var0 || 9 != var0.length || !var0[2].equals(Integer.valueOf(0))) {
         if(var1 != 8) {
            p = (Object[])((Object[])var0[1]);
         }

         lb var4;
         if(bu.f != null) {
            lb var3;
            for(Object[] var14 = (var3 = (lb)gm.a((Object[])((Object[])var0[0]), 0)) == null?null:var3.x; null != var14; var14 = (var4 = (lb)dka.a((Object[])((Object[])var0[0]), (byte)117)) != null?var4.x:null) {
               if(!mia.a(var1 + 30247, var14)) {
                  if(~((long)var2) > ~(++((tha)(var14 != null?var14[2]:null)).m)) {
                     Object[] var16 = bu.f;
                     if(var16 == null) {
                        throw new IllegalStateException();
                     }

                     Object[] var18 = new Object[5];
                     Object[] var19 = (Object[])((Object[])var14[0]);
                     Object var22 = gb.a(var14, (byte)57);
                     Object[] var17 = eg.a(((int[])((int[])var14[1]))[0], var19, var18, -80, var22);
                     di.a((Object[])((Object[])var0[2]), true, (lm)(var17 != null?var17[2]:null), ((lm)(null == var14?null:var14[2])).e);
                     mh.a((tha)(null == var14?null:var14[2]), (byte)-75, (tha)(var17 == null?null:var17[2]));
                     ((lm)(null == var14?null:var14[2])).a((byte)99);
                     ((tha)(null == var14?null:var14[2])).a(var1 + 8184);
                  }
               } else if(null == gb.a(var14, (byte)57)) {
                  ((lm)(var14 != null?var14[2]:null)).a((byte)41);
                  ((tha)(var14 != null?var14[2]:null)).a(8192);
                  ((int[])((int[])var0[1]))[1] += ((int[])((int[])var14[1]))[0];
               }
            }
         }

      }
   }

   static final void a(boolean var0, int var1, Object[] var2, long var3, Object var5) {
      ++q;
      if(~var1 < ~((int[])((int[])var2[1]))[1]) {
         throw new IllegalStateException();
      } else {
         su.a(var2, 118, var3);
         ((int[])((int[])var2[1]))[0] -= var1;

         while(0 > ((int[])((int[])var2[1]))[0]) {
            wg var6;
            Object[] var10 = null != (var6 = (wg)hia.b((byte)127, (Object[])((Object[])var2[2])))?var6.t:null;
            bua.a(var2, var0, var10);
         }

         if(var0) {
            p = (Object[])null;
         }

         Object[] var11 = new Object[4];
         lha.a(var11, true, var1);
         var11[2] = var5;
         di.a((Object[])((Object[])var2[0]), true, (lm)(var11 != null?var11[0]:null), var3);
         ama.a((tha)(null != var11?var11[0]:null), (byte)-107, (Object[])((Object[])var2[2]));
         ((tha)(var11 != null?var11[0]:null)).m = 0L;
      }
   }

   static final void a(byte var0, Object[] var1) {
      int var2 = 45 % ((46 - var0) / 45);
      ++f_l;
      if(null == var1[4]) {
         var1[4] = new int[1];
      }

   }

   static final int a(int var0, int var1, int var2, int var3) {
      ++o;
      if(var3 >= -102) {
         p = (Object[])null;
      }

      var1 &= 3;
      return var1 == 0?var2:(var1 == 1?4095 + -var0:(2 != var1?var0:4095 + -var2));
   }

   static final long a(int var0, int var1, Object[] var2, int var3) {
      if(var3 != 2) {
         return ((long[])((long[])var2[1]))[1];
      } else {
         ++n;
         return IDirect3DIndexBuffer.Lock(((long[])((long[])var2[6]))[0], var0, var1, ((boolean[])((boolean[])var2[3]))[0]?8192:0);
      }
   }

   ava(Object[] var1) {
      this.m = var1;
   }

   static final Object[] a(byte[] var0, int var1, int var2, Object[] var3, byte[] var4) {
      try {
         if(var3[1] == null) {
            var3[1] = new int[4];
         }

         int var5 = 104 / ((var1 - 73) / 35);
         ++k;
         ((int[])((int[])var3[1]))[3] = bo.a(19, var4, var4.length);
         if(~var2 != ~((int[])((int[])var3[1]))[3]) {
            throw new RuntimeException();
         } else {
            if(null != var0) {
               if(var0.length != 64) {
                  throw new RuntimeException();
               }

               var3[10] = vja.a(47, var4.length, var4, 0);

               for(int var6 = 0; var6 < 64; ++var6) {
                  if(~((byte[])((byte[])var3[10]))[var6] != ~var0[var6]) {
                     throw new RuntimeException();
                  }
               }

               if(var3 != null && (-19 == ~var3.length && var3[4].equals(Integer.valueOf(2)) || var3.length == 3)) {
                  a((byte[])null, -125, 69, (Object[])null, (byte[])null);
               }
            }

            Object[] var20 = jta.a((byte)-118, gta.a(var4, 9), new Object[3]);
            int var7 = fh.a(var20, false);
            if(var7 >= 5 && 7 >= var7) {
               if(6 > var7) {
                  ((int[])((int[])var3[1]))[0] = 0;
               } else {
                  ((int[])((int[])var3[1]))[0] = lr.a(1, var20);
               }

               int var8 = fh.a(var20, false);
               boolean var9 = (var8 & 1) != 0;
               if(var7 < 7) {
                  ((int[])((int[])var3[1]))[2] = de.a((int)0, var20);
               } else {
                  ((int[])((int[])var3[1]))[2] = qj.a(var20, 49);
               }

               boolean var10 = (var8 & 2) != 0;
               int var11 = 0;
               int var12 = -1;
               var3[12] = new int[((int[])((int[])var3[1]))[2]];
               int var13;
               if(7 <= var7) {
                  for(var13 = 0; ~var13 > ~((int[])((int[])var3[1]))[2]; ++var13) {
                     ((int[])((int[])var3[12]))[var13] = var11 += qj.a(var20, 98);
                     if(var12 < ((int[])((int[])var3[12]))[var13]) {
                        var12 = ((int[])((int[])var3[12]))[var13];
                     }
                  }
               } else {
                  for(var13 = 0; var13 < ((int[])((int[])var3[1]))[2]; ++var13) {
                     ((int[])((int[])var3[12]))[var13] = var11 += de.a((int)0, var20);
                     if(~var12 > ~((int[])((int[])var3[12]))[var13]) {
                        var12 = ((int[])((int[])var3[12]))[var13];
                     }
                  }

                  if(null != var20 && -9 == ~var20.length && var20[0].equals(Integer.valueOf(2))) {
                     return null;
                  }
               }

               ((int[])((int[])var3[1]))[1] = var12 + 1;
               if(null != var20 && 2 == var20.length) {
                  a((byte[])null, 120, 40, (Object[])null, (byte[])null);
               }

               var3[7] = new int[((int[])((int[])var3[1]))[1]];
               var3[5] = new int[((int[])((int[])var3[1]))[1]];
               var3[2] = new int[((int[])((int[])var3[1]))[1]][];
               var3[11] = new int[((int[])((int[])var3[1]))[1]];
               if(var10) {
                  var3[0] = new byte[((int[])((int[])var3[1]))[1]][];
               }

               var3[9] = new int[((int[])((int[])var3[1]))[1]];
               if(var9) {
                  if(null != var20 && var20.length == 13) {
                     return null;
                  }

                  var3[3] = new int[((int[])((int[])var3[1]))[1]];

                  for(var13 = 0; var13 < ((int[])((int[])var3[1]))[1]; ++var13) {
                     ((int[])((int[])var3[3]))[var13] = -1;
                  }

                  for(var13 = 0; var13 < ((int[])((int[])var3[1]))[2]; ++var13) {
                     ((int[])((int[])var3[3]))[((int[])((int[])var3[12]))[var13]] = lr.a(1, var20);
                  }

                  var3[4] = bg.a(new Object[1], (byte)89, (int[])((int[])var3[3]));
               }

               for(var13 = 0; var13 < ((int[])((int[])var3[1]))[2]; ++var13) {
                  ((int[])((int[])var3[9]))[((int[])((int[])var3[12]))[var13]] = lr.a(1, var20);
               }

               if(var10) {
                  for(var13 = 0; ((int[])((int[])var3[1]))[2] > var13; ++var13) {
                     byte[] var14 = new byte[64];
                     Class_h.a((byte)-71, 64, var20, var14, 0);
                     ((byte[][])((byte[][])var3[0]))[((int[])((int[])var3[12]))[var13]] = var14;
                  }

                  if(null != var20 && -9 == ~var20.length) {
                     a((byte[])null, -19, 126, (Object[])null, (byte[])null);
                  }
               }

               for(var13 = 0; ~var13 > ~((int[])((int[])var3[1]))[2]; ++var13) {
                  ((int[])((int[])var3[11]))[((int[])((int[])var3[12]))[var13]] = lr.a(1, var20);
               }

               int var15;
               int var17;
               int var16;
               int var18;
               int var21;
               if(var7 < 7) {
                  for(var13 = 0; ~var13 > ~((int[])((int[])var3[1]))[2]; ++var13) {
                     ((int[])((int[])var3[7]))[((int[])((int[])var3[12]))[var13]] = de.a((int)0, var20);
                  }

                  for(var13 = 0; ((int[])((int[])var3[1]))[2] > var13; ++var13) {
                     var21 = ((int[])((int[])var3[12]))[var13];
                     var15 = ((int[])((int[])var3[7]))[var21];
                     var11 = 0;
                     if(null != var20 && (var20.length == 19 || 1 == var20.length || -17 == ~var20.length)) {
                        a((byte[])null, 36, -117, (Object[])null, (byte[])null);
                     }

                     var16 = -1;
                     ((int[][])((int[][])var3[2]))[var21] = new int[var15];

                     for(var17 = 0; var15 > var17; ++var17) {
                        var18 = ((int[][])((int[][])var3[2]))[var21][var17] = var11 += de.a((int)0, var20);
                        if(var16 < var18) {
                           var16 = var18;
                        }
                     }

                     ((int[])((int[])var3[5]))[var21] = var16 + 1;
                     if(var15 == var16 + 1) {
                        ((int[][])((int[][])var3[2]))[var21] = null;
                     }
                  }
               } else {
                  if(null != var20 && 8 == var20.length) {
                     return null;
                  }

                  for(var13 = 0; ((int[])((int[])var3[1]))[2] > var13; ++var13) {
                     ((int[])((int[])var3[7]))[((int[])((int[])var3[12]))[var13]] = qj.a(var20, 126);
                  }

                  for(var13 = 0; ~var13 > ~((int[])((int[])var3[1]))[2]; ++var13) {
                     var21 = ((int[])((int[])var3[12]))[var13];
                     var15 = ((int[])((int[])var3[7]))[var21];
                     var11 = 0;
                     if(null != var20 && (-3 == ~var20.length || var20.length == 11)) {
                        return null;
                     }

                     var16 = -1;
                     ((int[][])((int[][])var3[2]))[var21] = new int[var15];

                     for(var17 = 0; var15 > var17; ++var17) {
                        var18 = ((int[][])((int[][])var3[2]))[var21][var17] = var11 += qj.a(var20, 112);
                        if(var18 > var16) {
                           var16 = var18;
                        }
                     }

                     ((int[])((int[])var3[5]))[var21] = 1 + var16;
                     if(var16 + 1 == var15) {
                        ((int[][])((int[][])var3[2]))[var21] = null;
                     }
                  }
               }

               if(var9) {
                  var3[8] = new int[1 + var12][];
                  if(null != var20 && var20.length == 1) {
                     a((byte[])null, -7, -50, (Object[])null, (byte[])null);
                  }

                  var3[6] = new Object[var12 + 1][];

                  for(var13 = 0; var13 < ((int[])((int[])var3[1]))[2]; ++var13) {
                     var21 = ((int[])((int[])var3[12]))[var13];
                     var15 = ((int[])((int[])var3[7]))[var21];
                     ((int[][])((int[][])var3[8]))[var21] = new int[((int[])((int[])var3[5]))[var21]];

                     for(var16 = 0; ~var16 > ~((int[])((int[])var3[5]))[var21]; ++var16) {
                        ((int[][])((int[][])var3[8]))[var21][var16] = -1;
                     }

                     for(var16 = 0; var15 > var16; ++var16) {
                        if(((int[][])((int[][])var3[2]))[var21] != null) {
                           var17 = ((int[][])((int[][])var3[2]))[var21][var16];
                        } else {
                           var17 = var16;
                        }

                        ((int[][])((int[][])var3[8]))[var21][var17] = lr.a(1, var20);
                     }

                     ((Object[][])((Object[][])var3[6]))[var21] = bg.a(new Object[1], (byte)89, ((int[][])((int[][])var3[8]))[var21]);
                  }
               }

               return var3;
            } else {
               throw new RuntimeException();
            }
         }
      } catch (RuntimeException var19) {
         throw vt.a(var19, "ava.G(" + (var0 != null?"{...}":"null") + ',' + var1 + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ',' + (var4 != null?"{...}":"null") + ')');
      }
   }

}
