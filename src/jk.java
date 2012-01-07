
final class jk {

   static int d;
   static int f;
   static int b;
   static int a;
   static int c;
   static int e;


   static final int a(Object[] var0, int var1) {
      if(var1 != 0) {
         a((Object[])((Object[])var0[6]), ((int[])((int[])((Object[])((Object[])((Object[])((Object[])var0[5]))[23]))[10]))[6]);
      }

      ++e;
      if(null != var0) {
         int var2 = ((int[])((int[])var0[1]))[2];
         return var2;
      } else {
         throw new IllegalStateException();
      }
   }

   static final Object[] a(boolean var0, Object[] var1, Object[] var2) {
      ++d;
      qm.a((byte)58, var2);
      sea.b(var1, var2, (byte)-125);
      if(!var0) {
         a(new Object[13], ((int[])((int[])var2[16]))[0]);
      }

      ((int[])((int[])var2[0]))[2] = de.a((int)0, var1);
      ((int[])((int[])var2[0]))[1] = fh.a(var1, !var0);
      return var2;
   }

   static final int[] a(int var0, Object[] var1, int var2) {
      ++a;
      if(var2 != -24112) {
         return (int[])null;
      } else {
         int[] var3 = od.a(-1704, var0, (Object[])((Object[])var1[5]));
         if(((boolean[])((boolean[])((Object[])((Object[])var1[5]))[4]))[0]) {
            int var4 = ((int[])((int[])var1[1]))[3] * bv.b[var0] + 2048;
            int var5 = var4 >> 12;
            int var6 = 1 + var5;

            for(int var14 = 0; var14 < fo.b; ++var14) {
               fr.f = Integer.MAX_VALUE;
               oo.b = Integer.MAX_VALUE;
               bia.h = Integer.MAX_VALUE;
               qr.d = Integer.MAX_VALUE;
               int var15 = ((int[])((int[])var1[1]))[1] * wra.d[var14] + 2048;
               int var16 = var15 >> 12;
               int var17 = var16 + 1;

               int var18;
               for(int var8 = var5 - 1; var8 <= var6; ++var8) {
                  int var12 = 255 & ((byte[])((byte[])var1[6]))[(((int[])((int[])var1[1]))[3] > var8?var8:var8 + -((int[])((int[])var1[1]))[3]) & 255];

                  for(int var7 = -1 + var16; var7 <= var17; ++var7) {
                     int var13 = 2 * (((byte[])((byte[])var1[6]))[var12 + (((int[])((int[])var1[1]))[1] > var7?var7:-((int[])((int[])var1[1]))[1] + var7) & 255] & 255);
                     int var9 = var15 + -((short[])((short[])var1[8]))[var13++] + -(var7 << 12);
                     int var10 = -(var8 << 12) - ((short[])((short[])var1[8]))[var13] + var4;
                     var18 = ((int[])((int[])var1[1]))[5];
                     int var11;
                     if(var18 == 1) {
                        var11 = var10 * var10 + var9 * var9 >> 12;
                     } else if(3 == var18) {
                        var10 = 0 <= var10?var10:-var10;
                        var9 = var9 < 0?-var9:var9;
                        var11 = var9 > var10?var9:var10;
                     } else if(2 != var18) {
                        if(var18 == 4) {
                           var9 = (int)(Math.sqrt((double)((float)(0 <= var9?var9:-var9) / 4096.0F)) * 4096.0D);
                           var10 = (int)(Math.sqrt((double)((float)(var10 < 0?-var10:var10) / 4096.0F)) * 4096.0D);
                           var11 = var10 + var9;
                           var11 = var11 * var11 >> 12;
                        } else if(var18 != 5) {
                           var11 = (int)(4096.0D * Math.sqrt((double)((float)(var9 * var9 + var10 * var10) / 1.6777216E7F)));
                        } else {
                           var10 *= var10;
                           var9 *= var9;
                           var11 = (int)(4096.0D * Math.sqrt(Math.sqrt((double)((float)(var10 + var9) / 1.6777216E7F))));
                        }
                     } else {
                        var11 = (var9 < 0?-var9:var9) + (0 <= var10?var10:-var10);
                     }

                     if(qr.d <= var11) {
                        if(fr.f <= var11) {
                           if(var11 < bia.h) {
                              oo.b = bia.h;
                              bia.h = var11;
                           } else if(oo.b > var11) {
                              oo.b = var11;
                           }
                        } else {
                           oo.b = bia.h;
                           bia.h = fr.f;
                           fr.f = var11;
                        }
                     } else {
                        oo.b = bia.h;
                        bia.h = fr.f;
                        fr.f = qr.d;
                        qr.d = var11;
                     }
                  }

                  if(null != var1 && var1.length == 1) {
                     rc.a(new Object[15][], 2048);
                  }
               }

               var18 = ((int[])((int[])var1[1]))[6];
               if(var18 == 2) {
                  var3[var14] = fr.f + -qr.d;
               } else if(var18 == 0) {
                  var3[var14] = qr.d;
               } else if(3 == var18) {
                  var3[var14] = bia.h;
               } else if(1 != var18) {
                  if(var18 == 4) {
                     var3[var14] = oo.b;
                  }
               } else {
                  var3[var14] = fr.f;
               }

               if(null != var1 && var1.length == 38) {
                  fr.f = 4;
               }
            }

            if(var1 != null && var1.length == 15) {
               oo.b = 0;
            }
         }

         return var3;
      }
   }

   static final void a(int var0, Object[] var1, Object[] var2) {
      if(var2[var0] != var1) {
         var2[2] = var1;
         df.a(var0 + 23058, var2);
      }

      ++f;
   }

   static final void a(int var0, int var1, Object[] var2) {
      ++c;
      synchronized(var2[0]) {
         dq.a(116, (Object[])((Object[])var2[0]));
         var2[0] = sj.a(var0, new Object[3], (byte)-76);
      }

      if(var1 != 12) {
         a(((int[])((int[])var2[5]))[0], (Object[])((Object[])var2[0]), ((int[])((int[])var2[3]))[5]);
      }

   }

   static final void a(int var0, Object[] var1) {
      if(var1[10] == null) {
         var1[10] = new byte[4];
      }

      if(var0 >= 126) {
         if(var1[12] == null) {
            var1[12] = new int[4];
         }

         if(null == var1[8]) {
            var1[8] = new boolean[8];
         }

         ++b;
      }
   }

}
