import jagdx.IDirect3DDevice;

final class nga {

   static int o;
   static int j;
   static int k;
   static int m;
   static int n;
   static int b;
   static int f;
   static int f_l;
   static int d;
   static Object[] g = ura.a(-118, new Object[2]);
   static Object[] a;
   static int p;
   static int[] h = new int[]{7, 8, 9, 10, 11, 12, 13, 15};
   static cga e;
   static vp f_i;
   static int c;


   static final Object[] b(Object[] var0, byte var1) {
      if(var1 != 87) {
         ((int[])((int[])var0[8]))[7] = 33;
      }

      qia.a(var0, 1);
      ++o;
      bs var3 = new bs(var0);
      var0[2] = var3;
      return var0;
   }

   static final Object[] a(byte var0, Object[] var1) {
      ++n;
      int var2 = 61 / ((var0 - 65) / 44);
      return nsa.a;
   }

   static final void b(byte var0, Object[] var1) {
      ++c;
      IDirect3DDevice.a(((long[])((long[])var1[50]))[5], 14, ((boolean[])((boolean[])var1[63]))[3] && ((boolean[])((boolean[])var1[63]))[10]);
      int var2 = -108 % ((68 - var0) / 38);
   }

   static final int a(int var0, int var1, int var2, int var3, int var4) {
      ++f_l;
      int var5 = 15 & var4;
      int var6 = 8 <= var5?var0:var2;
      int var7 = 4 > var5?var0:(var5 != 12 && var5 != 14?var1:var2);
      if(var3 != -13) {
         g = (Object[])null;
      }

      return ((2 & var5) != 0?-var7:var7) + ((1 & var5) == 0?var6:-var6);
   }

   static final String a(int var0, String[] var1, int var2, int var3) {
      ++j;
      if(0 != var2) {
         if(var0 == ~var2) {
            String var9 = var1[var3];
            return null == var9?"null":var9.toString();
         } else {
            int var4 = var2 + var3;
            int var5 = 0;

            for(int var6 = var3; var4 > var6; ++var6) {
               String var7 = var1[var6];
               if(null != var7) {
                  var5 += var7.length();
               } else {
                  var5 += 4;
               }
            }

            StringBuffer var10 = new StringBuffer(var5);

            for(int var11 = var3; var11 < var4; ++var11) {
               String var8 = var1[var11];
               if(null != var8) {
                  var10.append(var8);
               } else {
                  var10.append("null");
               }
            }

            return var10.toString();
         }
      } else {
         return "";
      }
   }

   static final Object[] a(boolean var0) {
      ++d;
      if(!var0) {
         ((boolean[])((boolean[])a[17]))[1] = ((boolean[])((boolean[])g[3]))[10];
      }

      return roa.a(3, 1);
   }

   static final void a(byte var0, Object[] var1, int var2, byte var3) {
      ++b;
      if(var1 != null && var1.length == 5) {
         aoa.a(var0, false, var1, var2);
      } else {
         int var4 = -19 / ((var3 - 6) / 47);
         if(null != var1 && var1.length == 7) {
            jv.a(5, var2, var1, var0);
         } else {
            ((byte[])((byte[])var1[3]))[var2] = var0;
         }
      }
   }

   static final void a(int var0, Object[] var1) {
      int var2 = -55 % ((var0 - 48) / 50);
      if(var1[8] == null) {
         var1[8] = new boolean[7];
      }

      if(var1[12] == null) {
         var1[12] = new int[4];
      }

      ++k;
      if(null == var1[10]) {
         var1[10] = new byte[4];
      }

   }

   static final Object[] a(int var0, int var1, int var2, Object[] var3, int var4, Object[] var5, int var6, int var7, Object[] var8, int var9, int var10, byte var11, int var12, int var13) {
      ++m;
      if(var3[1] == null) {
         var3[1] = new int[9];
      }

      lka.a(var12, var1, var13, var2, var9, var5, var6, var11 + 13922, var8, var10, var3);
      ((int[])((int[])var3[1]))[7] = var0;
      ((int[])((int[])var3[1]))[8] = var4;
      if(var11 != 43) {
         f_i = (vp)var5[2];
      }

      return var3;
   }

   static final void a(Object[] var0, byte var1) {
      if(var1 >= -114) {
         ((long[])((long[])a[1]))[18] = ((long[])((long[])((Object[])((Object[])((Object[])((Object[])g[1]))[0]))[1]))[0];
      }

      ++f;
      if(var0[1] == null) {
         var0[1] = new int[7];
      }

   }

}
