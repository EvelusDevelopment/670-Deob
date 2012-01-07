import jagdx.IUnknown;

final class gh {

   static int g;
   static int e;
   static int b;
   static int a;
   static int c;
   static int f;
   static int h;
   static int d;


   static final Object[] a(byte var0, Object[] var1) {
      int var2 = 1 / ((83 - var0) / 39);
      ++c;
      return var1;
   }

   static final char a(char var0, int var1) {
      ++e;
      if(198 != var0) {
         if(230 == var0) {
            return 'e';
         } else if(var0 == 223) {
            return 's';
         } else if(338 != var0) {
            int var2 = 116 / ((var1 + 16) / 46);
            return (char)(var0 != 339?'\u0000':'e');
         } else {
            return 'E';
         }
      } else {
         return 'E';
      }
   }

   static final void a(Object[] var0, byte var1) {
      if(var1 >= -5) {
         a(((int[])((int[])var0[4]))[21], (Object[])((Object[])var0[0]));
      }

      if(var0[1] == null) {
         var0[1] = new int[4];
      }

      ++h;
   }

   static final int a(int var0, Object[] var1) {
      if(var0 != -15) {
         ((long[])((long[])((Object[])((Object[])((Object[])((Object[])var1[3]))[16]))[5]))[0] = ((long[])((long[])((Object[])((Object[])((Object[])((Object[])var1[31]))[6]))[20]))[11];
      }

      ++b;
      return (int)(255L & ((lm)var1[1]).e >>> 56);
   }

   static final void a(byte var0, Object[] var1, Object[] var2, int var3) {
      ++g;
      if(0 != var3) {
         if(1 != var3) {
            if(var3 == 2) {
               ((boolean[])((boolean[])var2[3]))[0] = -2 == ~fh.a(var1, false);
            }
         } else {
            ((int[])((int[])var2[1]))[1] = de.a((int)0, var1);
         }
      } else {
         ((int[])((int[])var2[1]))[3] = de.a((int)0, var1);
      }

      if(var0 != 34) {
         a(((int[])((int[])((Object[])((Object[])var2[2]))[2]))[3], (Object[])((Object[])var1[0]));
      }

   }

   static final void a(boolean var0, Object[] var1) {
      ++f;
      if(null != var1 && var1.length == 6) {
         if(-1 != ~((int[])((int[])var1[5]))[2]) {
            jv.a(((int[])((int[])var1[5]))[2], (Object[])((Object[])var1[4]), false);
            ((int[])((int[])var1[5]))[2] = 0;
         }

      } else if(var0) {
         if(var1 != null && var1.length == 7) {
            if(null != var1[4]) {
               cua.b((Object[])((Object[])var1[4]), 5);
            }

            if(null == var1 || 10 != var1.length && var1.length != 3) {
               for(int var2 = 0; ((Object[])((Object[])var1[6])).length > var2; ++var2) {
                  if(null != ((Object[][])((Object[][])var1[6]))[var2]) {
                     Object[] var3 = ((Object[][])((Object[][])var1[6]))[var2];
                     if(null != var3 && var3.length == 6) {
                        if(((long[])((long[])var3[3]))[0] != 0L) {
                           IUnknown.Release(((long[])((long[])var3[3]))[0]);
                           ((long[])((long[])var3[3]))[0] = 0L;
                        }
                     } else {
                        if(var3 == null || var3.length != 4) {
                           throw new IllegalStateException();
                        }

                        hd.a(var3, (byte)-124);
                     }
                  }
               }

            }
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final boolean a(int var0, int var1, Object[][] var2, Object[] var3, Object[] var4, Object[] var5) {
      ++a;
      int[] var6 = (int[])((int[])var3[0]);
      if(var0 <= 119) {
         ((byte[])((byte[])var3[0]))[5] = 51;
      }

      for(int var7 = 0; var6.length > var7; ++var7) {
         int var8 = var6[var7];
         if(!oc.a(var4, var8, (byte)-33)) {
            return false;
         }
      }

      if(null != var3 && (-15 == ~var3.length || 10 == var3.length)) {
         hj.a((Object[])null, (byte)-96);
      }

      return true;
   }

   static final void a(int var0, Object[] var1, Object[] var2, int var3) {
      ++d;
      if(var3 != 0) {
         mh.a(false, var2);
         moa.a((byte)111, (Object[])((Object[])var2[3]), (Object[])((Object[])var2[5]));
         kna.a(var0, var1, var3, (Object[])((Object[])var2[5]), -49, 0);
      }
   }

}
