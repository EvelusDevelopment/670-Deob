
final class lq extends lm {

   static int j;
   static int m;
   static int f_l;
   static int q = 0;
   static int k;
   Object[] r;
   static int p;
   static int n;
   static int o = 0;


   static final Object[] b(boolean var0, Object[] var1) {
      try {
         ++k;
         if(!var0) {
            q = 6;
         }

         if(null != var1[0]) {
            return (Object[])((Object[])var1[0]);
         } else {
            if(var1[11] == null) {
               if(rs.a(12, (Object[])((Object[])var1[6]))) {
                  return null;
               }

               var1[11] = vla.a(((int[])((int[])var1[1]))[3], true, 255, (Object[])((Object[])var1[6]), -110, (byte)0);
            }

            if(((boolean[])((boolean[])((Object[])((Object[])var1[11]))[0]))[0]) {
               return null;
            } else {
               byte[] var2 = sh.a((Object[])((Object[])var1[11]), (byte)69);
               Object[] var3;
               if(null != (var3 = (Object[])((Object[])var1[11])) && -7 == ~var3.length) {
                  try {
                     if(null == var2) {
                        throw new RuntimeException();
                     }

                     var1[0] = ava.a((byte[])((byte[])var1[8]), 116, ((int[])((int[])var1[1]))[4], new Object[13], var2);
                     if(~((int[])((int[])var1[1]))[2] != ~((int[])((int[])((Object[])((Object[])var1[0]))[1]))[0]) {
                        throw new RuntimeException();
                     }
                  } catch (RuntimeException var6) {
                     var1[0] = null;
                     if(!rs.a(12, (Object[])((Object[])var1[6]))) {
                        var1[11] = vla.a(((int[])((int[])var1[1]))[3], true, 255, (Object[])((Object[])var1[6]), -124, (byte)0);
                     } else {
                        var1[11] = null;
                     }

                     return null;
                  }
               } else {
                  try {
                     if(var2 == null) {
                        throw new RuntimeException();
                     }

                     var1[0] = ava.a((byte[])((byte[])var1[8]), 120, ((int[])((int[])var1[1]))[4], new Object[13], var2);
                  } catch (RuntimeException var7) {
                     Object[] var5 = (Object[])((Object[])var1[6]);
                     if(var5 == null) {
                        throw new IllegalStateException();
                     }

                     dg.a(var5, (byte)-54);
                     var1[0] = null;
                     if(rs.a(12, (Object[])((Object[])var1[6]))) {
                        var1[11] = null;
                     } else {
                        var1[11] = vla.a(((int[])((int[])var1[1]))[3], true, 255, (Object[])((Object[])var1[6]), -70, (byte)0);
                     }

                     return null;
                  }

                  if(var1[3] != null) {
                     ima.a(-10426, var2, (Object[])((Object[])var1[3]), (Object[])((Object[])var1[10]), ((int[])((int[])var1[1]))[3]);
                  }
               }

               if(var1[7] != null) {
                  ((int[])((int[])var1[1]))[0] = 0;
                  var1[12] = new byte[((int[])((int[])((Object[])((Object[])var1[0]))[1]))[1]];
               }

               var1[11] = null;
               return (Object[])((Object[])var1[0]);
            }
         }
      } catch (RuntimeException var8) {
         throw vt.a(var8, "lq.E(" + var0 + ',' + (var1 != null?"{...}":"null") + ')');
      }
   }

   static final String a(byte var0, Object[] var1, Object[] var2) {
      ++j;
      StringBuffer var3 = new StringBuffer(80);
      if(var1[6] != null) {
         if(null != var1 && var1.length == 6) {
            a((byte)74, (Object[])null, (Object[])null);
         }

         for(int var4 = 0; ~var4 > ~((int[])((int[])var1[6])).length; ++var4) {
            var3.append(((String[])((String[])var1[3]))[var4]);
            var3.append(esa.a(true, esa.a(0, var2, ((int[])((int[])ms.a(((int[])((int[])var1[6]))[var4], (byte)114)[0]))[0]), msa.a(var4, (byte)-45, var1), ((int[][])((int[][])var1[0]))[var4], (Object[])((Object[])var1[2])));
         }
      }

      if(var0 < 73) {
         a((byte)9, (Object[])null);
      }

      var3.append(((String[])((String[])var1[3]))[-1 + ((Object[])((Object[])var1[3])).length]);
      return var3.toString();
   }

   static final int a(byte var0, Object[] var1) {
      if(var0 != -60) {
         return 2;
      } else {
         ++f_l;
         return 1;
      }
   }

   lq(Object[] var1) {
      this.r = var1;
   }

   static final void a(boolean var0, Object[] var1) {
      ++n;
      if(!var0) {
         a((byte)82, (Object[])((Object[])var1[13]), (Object[])null);
      }

      if(var1[1] == null) {
         var1[1] = new int[1];
      }

      if(var1[3] == null) {
         var1[3] = new long[1];
      }

   }

   static final Object[] a(aa var0, int var1, int var2, boolean var3, int var4, int var5, int var6, ta var7, aa var8, Object[] var9, Object[] var10, int var11, int var12) {
      ++m;
      if(var4 != 15790) {
         return (Object[])null;
      } else {
         boolean var13 = 4 <= var11 && var11 <= 8;
         if(var13) {
            var11 = 4;
         }

         long var14 = (long)(var12 + (var11 << 3) + (((int[])((int[])var10[1]))[13] << 10));
         var14 |= (long)(var7.G << 29);
         if(null != var9) {
            var14 |= ((long[])((long[])var9[2]))[0] << 32;
         }

         int var16 = var1;
         if(3 == ((byte[])((byte[])var10[14]))[2]) {
            var16 = var1 | 7;
         } else {
            if(((byte[])((byte[])var10[14]))[2] != 0 || 0 != ((int[])((int[])var10[1]))[27]) {
               var16 = var1 | 2;
            }

            if(-1 != ~((int[])((int[])var10[1]))[26]) {
               var16 |= 1;
            }

            if(((int[])((int[])var10[1]))[1] != 0) {
               var16 |= 4;
            }
         }

         if(var3) {
            var16 |= 262144;
         }

         Object[] var17;
         synchronized(((Object[])((Object[])var10[7]))[3]) {
            var17 = (Object[])((Object[])dna.a((byte)34, (Object[])((Object[])((Object[])((Object[])var10[7]))[3]), var14));
         }

         ka var18 = (ka)(null != var17?var17[1]:null);
         if(var10 != null && (3 == var10.length && var10[1].equals(Integer.valueOf(2)) || 7 == var10.length)) {
            ona.a = null;
         }

         ya var19 = null;
         if(null != var18 && 0 == var7.d(var18.va(), var16)) {
            var18 = (ka)var17[1];
            var19 = (ya)var17[0];
            if(var3 && null == var19) {
               var19 = (ya)(var17[0] = var18.p((ya)null));
            }
         } else {
            if(var18 != null) {
               var16 = var7.a(var16, var18.va());
            }

            int var20 = var16;
            if(var11 == 10 && var12 > 3) {
               var20 = var16 | 5;
            }

            var18 = wi.a(var11, var7, var12, var9, (byte)97, var10, var20);
            if(var18 == null) {
               return null;
            }

            if(10 == var11 && var12 > 3) {
               var18.O(2048);
            }

            if(var3) {
               var19 = var18.p((ya)null);
            }

            var18.G(var16);
            var17 = uga.b(new Object[2], -119);
            var17[0] = var19;
            var17[1] = var18;
            if(null != var9 && var9.length == 1 && var9[0].equals(Boolean.valueOf(false)) && var9[0].equals(Boolean.valueOf(false))) {
               wi.a(112, (ta)null, 29, (Object[])((Object[])ria.a[0]), (byte)82, (Object[])null, -115);
            }

            synchronized(((Object[])((Object[])var10[7]))[3]) {
               il.a(var14, var17, true, (Object[])((Object[])((Object[])((Object[])var10[7]))[3]));
            }
         }

         boolean var25 = ((byte[])((byte[])var10[14]))[2] != 0 && (null != var8 || null != var0);
         boolean var21 = ((int[])((int[])var10[1]))[26] != 0 || -1 != ~((int[])((int[])var10[1]))[27] || ((int[])((int[])var10[1]))[1] != 0;
         if(!var25 && !var21) {
            var18 = var18.a((byte)0, var1, true);
         } else {
            var18 = var18.a((byte)0, var16, true);
            if(var25) {
               var18.ta(((byte[])((byte[])var10[14]))[2], ((int[])((int[])var10[1]))[17], var8, var0, var6, var2, var5);
            }

            if(var21) {
               var18.K(((int[])((int[])var10[1]))[26], ((int[])((int[])var10[1]))[27], ((int[])((int[])var10[1]))[1]);
            }

            var18.G(var1);
         }

         ria.a[0] = var19;
         ria.a[1] = var18;
         return ria.a;
      }
   }

   static final void a(int var0, Object[] var1) {
      var1[0] = null;
      if(var0 != 1) {
         q = -34;
      }

      ++p;
      if(sfa.c < 20) {
         gt.a(rd.q, -126, (nj)(var1 != null?var1[2]:null));
         ++sfa.c;
      }

   }

}
