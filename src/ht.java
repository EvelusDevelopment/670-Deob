import jaggl.OpenGL;

final class ht {

   static int e;
   static Object[] a;
   static int b;
   static int f;
   static Object[] c = ho.a(8, 19, new Object[1], true);
   static int d;


   static final boolean a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      ++b;
      return var1 < 72?true:(var2 + var6 > var4 && var2 < var4 + var0?var3 + var8 > var5 && ~var8 > ~(var5 + var7):false);
   }

   static final boolean a(Object[] var0, boolean var1) {
      if(var0 != null && 1 == var0.length) {
         lo.a((Object[])null, (int)'\u8d00');
      }

      ++e;
      OpenGL.glBindFramebufferEXT('\u8d40', ((int[])((int[])var0[1]))[4]);
      int var2 = 0;
      if(!var1) {
         return false;
      } else {
         for(; 4 > var2; ++var2) {
            if(0 != (((int[])((int[])var0[1]))[0] & 1 << var2)) {
               gha.a(var0, var2, true);
            }
         }

         if(0 != (((int[])((int[])var0[1]))[0] & 16)) {
            lo.a(var0, (int)'\u8d00');
         }

         ((int[])((int[])var0[1]))[0] = 0;
         Object[] var4 = (Object[])((Object[])var0[2]);
         Class_f.a((byte)-52, var4);
         return true;
      }
   }

   static final void a(Object[] var0, boolean var1, Object[] var2) {
      ++d;
      if(!var1) {
         while(true) {
            int var3 = fh.a(var2, false);
            if(var3 == 0) {
               if(null != var0 && var0.length == 12) {
                  aba.a((Object[])null, (byte)48);
               }

               return;
            }

            if(var3 == 1) {
               ((char[])((char[])var0[3]))[1] = kf.a(true, ipa.a(var2, (int)-80));
            } else if(var3 == 2) {
               ((char[])((char[])var0[3]))[0] = kf.a(!var1, ipa.a(var2, (int)-104));
            } else if(var3 != 3) {
               if(var3 == 4) {
                  ((int[])((int[])var0[1]))[0] = lr.a(1, var2);
               } else {
                  int var8;
                  if(5 != var3 && var3 != 6) {
                     int var10;
                     int var13;
                     if(7 == var3) {
                        var10 = de.a((int)0, var2);
                        ((int[])((int[])var0[1]))[1] = de.a((int)0, var2);
                        String[] var11 = new String[var10];

                        for(var8 = 0; var8 < ((int[])((int[])var0[1]))[1]; ++var8) {
                           var13 = de.a((int)0, var2);
                           var11[var13] = ara.b((byte)61, var2);
                        }

                        var0[2] = var11;
                        if(null != var0 && (var0.length == 25 || var0.length == 9)) {
                           ca.a((String)null, (Object[])null, 4);
                        }
                     } else if(var3 == 8) {
                        if(var0 != null && var0.length == 28 && var0[3].equals(Integer.valueOf(1))) {
                           return;
                        }

                        var10 = de.a((int)0, var2);
                        ((int[])((int[])var0[1]))[1] = de.a((int)0, var2);
                        Integer[] var12 = new Integer[var10];

                        for(var8 = 0; ((int[])((int[])var0[1]))[1] > var8; ++var8) {
                           var13 = de.a((int)0, var2);
                           var12[var13] = new Integer(lr.a(1, var2));
                        }

                        var0[2] = var12;
                     }
                  } else {
                     ((int[])((int[])var0[1]))[1] = de.a((int)0, var2);
                     Object[] var6 = nb.a((byte)95, fda.a(((int[])((int[])var0[1]))[1], (byte)81), new Object[5]);
                     if(null != var6 && (var6.length == 4 && var6[3].equals(Integer.valueOf(2)) || var6.length == 1)) {
                        hla.b(26206, (Object[])null);
                     }

                     for(int var7 = 0; ((int[])((int[])var0[1]))[1] > var7; ++var7) {
                        var8 = lr.a(1, var2);
                        lm var9;
                        if(var3 != 5) {
                           Object[] var5;
                           var9 = (lm)((var5 = ps.a((byte)115, lr.a(1, var2), new Object[2])) != null?var5[0]:null);
                        } else {
                           Object[] var4;
                           var9 = (lm)((var4 = sg.a(ara.b((byte)61, var2), -19450, new Object[2])) == null?null:var4[1]);
                        }

                        di.a(var6, true, var9, (long)var8);
                     }

                     var0[2] = var6;
                  }
               }
            } else {
               var0[0] = ara.b((byte)61, var2);
            }
         }
      }
   }

   static final void a(boolean var0) {
      ++f;
      Object[] var1 = qs.h;
      synchronized(var1) {
         synchronized(var1) {
            ((tf)var1[12]).f();
            var1[16] = null;
            jba.a(-5, var1, true);
         }
      }

      dl.d = 1;
      if(!var0) {
         a((Object[])((Object[])c[6]), true, (Object[])null);
      }

      bp.c = null;
      rua.a = null;
   }

}
