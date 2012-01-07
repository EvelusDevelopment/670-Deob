
final class dja {

   static int e;
   static int g;
   static Object[] c;
   static int a;
   static Object[] f;
   static int h;
   static int d;
   static Object[] b;


   static final boolean c(int var0, Object[] var1) {
      if(var0 <= 82) {
         c(44, (Object[])null);
      }

      ++e;
      return false;
   }

   static final void b(int var0, Object[] var1) {
      if(null == var1[1]) {
         var1[1] = new int[2];
      }

      if(var1[6] == null) {
         var1[6] = new long[1];
      }

      if(null == var1[3]) {
         var1[3] = new boolean[1];
      }

      ++g;
      if(var0 != 32019) {
         f = (Object[])null;
      }

   }

   static final Object[] a(Object[] var0, byte var1, int var2) {
      ++h;
      Object[] var3;
      synchronized(var0[0]) {
         var3 = (Object[])((Object[])dna.a((byte)34, (Object[])((Object[])var0[0]), (long)var2));
      }

      if(null != var3) {
         return var3;
      } else {
         int var4 = 82 % ((var1 - 64) / 62);
         byte[] var5 = qn.a(24, var2, (Object[])((Object[])var0[1]), -118);
         if(null != var0 && 3 == var0.length && var0[2].equals(Boolean.valueOf(false))) {
            wb.a(true, new Object[5][]);
         }

         Object[] var7 = new Object[1];
         sn.a((byte)126, var7);
         var3 = var7;
         if(var5 != null) {
            Object[] var8 = jta.a((byte)-102, var5, new Object[3]);

            while(true) {
               int var9 = fh.a(var8, false);
               if(0 == var9) {
                  break;
               }

               ur.a(var9, var3, 0, var8);
            }
         }

         synchronized(var0[0]) {
            il.a((long)var2, var3, true, (Object[])((Object[])var0[0]));
            return var3;
         }
      }
   }

   static final void a(int var0, Object[] var1) {
      if(var1[44] == null) {
         var1[44] = new boolean[1];
      }

      if(var1[var0] == null) {
         var1[1] = new int[6];
      }

      ++a;
      if(null == var1[34]) {
         var1[34] = new float[1];
      }

   }

   static final Object[] a(int var0, Object[] var1, int var2, int var3) {
      try {
         ++d;
         int var10 = var3 << 10 | ((int[])((int[])var1[0]))[0];
         if(var2 != 8860) {
            c(61, (Object[])null);
         }

         coa var4;
         Object[] var11 = null == (var4 = (coa)uh.a(dqa.b, (long)var10 << 16, (byte)87))?null:var4.D;
         if(var11 != null) {
            return var11;
         } else {
            byte[] var12 = fd.a(var2 - 8862, vn.a(ht.a, 3, var10), ht.a);
            if(var12 == null) {
               var10 = var0 + 65536 << 10 | ((int[])((int[])var1[0]))[0];
               coa var6;
               var11 = null == (var6 = (coa)uh.a(dqa.b, (long)var10 << 16, (byte)87))?null:var6.D;
               if(var11 != null) {
                  return var11;
               } else {
                  var12 = fd.a(-2, vn.a(ht.a, 3, var10), ht.a);
                  if(null != var12) {
                     if(1 < var12.length) {
                        try {
                           var11 = hd.a((byte)95, var12);
                        } catch (Exception var14) {
                           throw new RuntimeException(var14.getMessage() + " " + var10);
                        }

                        var11[4] = var1;
                        hj.a(dqa.b, 0, (tha)(var11 == null?null:var11[8]), (long)var10 << 16);
                        return var11;
                     } else {
                        return null;
                     }
                  } else {
                     var10 = 67107840 | ((int[])((int[])var1[0]))[0];
                     coa var8;
                     var11 = (var8 = (coa)uh.a(dqa.b, (long)var10 << 16, (byte)87)) == null?null:var8.D;
                     if(null != var11) {
                        return var11;
                     } else {
                        var12 = fd.a(-2, vn.a(ht.a, 3, var10), ht.a);
                        if(null == var12) {
                           return null;
                        } else if(var12.length <= 1) {
                           return null;
                        } else {
                           try {
                              var11 = hd.a((byte)95, var12);
                           } catch (Exception var15) {
                              throw new RuntimeException(var15.getMessage() + " " + var10);
                           }

                           var11[4] = var1;
                           hj.a(dqa.b, 0, (tha)(var11 != null?var11[8]:null), (long)var10 << 16);
                           return var11;
                        }
                     }
                  }
               }
            } else if(-2 <= ~var12.length) {
               return null;
            } else {
               try {
                  var11 = hd.a((byte)95, var12);
               } catch (Exception var16) {
                  throw new RuntimeException(var16.getMessage() + " " + var10);
               }

               var11[4] = var1;
               hj.a(dqa.b, 0, (tha)(var11 != null?var11[8]:null), (long)var10 << 16);
               return var11;
            }
         }
      } catch (RuntimeException var17) {
         throw vt.a(var17, "dja.A(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   static {
      Object[] var1 = new Object[1];
      f = var1;
   }
}
