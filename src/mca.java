
final class mca {

   static int e;
   static int h;
   static int f;
   static Object[] c = ed.a(0, new Object[1], (byte)-100, 141);
   static int a;
   static int b;
   static byte[][] d;
   static Object[] g;


   static final void a(int var0, Object[] var1) {
      ++h;
      if(null == var1[1]) {
         var1[1] = new int[2];
      }

      if(null == var1[8]) {
         var1[8] = new boolean[1];
      }

      if(var0 != 4971) {
         ((byte[])((byte[])((Object[])((Object[])g[6]))[18]))[1] = 82;
      }

   }

   static final Object[] a(boolean var0, int var1, Object[] var2) {
      ++f;
      Object[] var3;
      synchronized(var2[4]) {
         var3 = (Object[])((Object[])dna.a((byte)34, (Object[])((Object[])var2[4]), (long)var1));
      }

      if(var3 != null) {
         return var3;
      } else {
         byte[] var4;
         synchronized(var2[0]) {
            Object[] var6 = (Object[])((Object[])var2[0]);
            int var7 = var1 >>> 8;
            var4 = qn.a(var7, od.a((byte)116, var1), var6, 91);
         }

         var3 = wj.a(-101, new Object[19]);
         var3[7] = var2;
         ((int[])((int[])var3[1]))[13] = var1;
         if(null != var2 && 6 == var2.length && var2[1].equals(Integer.valueOf(0)) && var2[1].equals(Integer.valueOf(1))) {
            return null;
         } else {
            var3[3] = ((Object[])((Object[])var2[9])).clone();
            if(var4 != null) {
               qg.a(var3, jta.a((byte)-118, var4, new Object[3]), -92);
            }

            if(0 == ~((int[])((int[])var3[1]))[11]) {
               if(var2 != null && -6 == ~var2.length) {
                  return null;
               }

               ((int[])((int[])var3[1]))[11] = 0;
               if(null != var3[2] && 1 == ((byte[])((byte[])var3[2])).length && -11 == ~((byte[])((byte[])var3[2]))[0]) {
                  ((int[])((int[])var3[1]))[11] = 1;
               }

               for(int var5 = 0; 5 > var5; ++var5) {
                  if(((String[])((String[])var3[3]))[var5] != null) {
                     ((int[])((int[])var3[1]))[11] = 1;
                     break;
                  }
               }
            }

            if(((int[])((int[])var3[1]))[7] == -1) {
               ((int[])((int[])var3[1]))[7] = -1 != ~((int[])((int[])var3[1]))[2]?1:0;
            }

            if(es.b(-1019, var3) || ((boolean[])((boolean[])var3[0]))[5] || null != var3[11]) {
               ((boolean[])((boolean[])var3[0]))[12] = true;
            }

            if(!((boolean[])((boolean[])var2[5]))[1] && ((boolean[])((boolean[])var3[0]))[3]) {
               var3[6] = null;
               var3[3] = null;
            }

            if(((boolean[])((boolean[])var3[0]))[2]) {
               ((boolean[])((boolean[])var3[0]))[7] = false;
               ((int[])((int[])var3[1]))[2] = 0;
            }

            synchronized(var2[4]) {
               il.a((long)var1, var3, var0, (Object[])((Object[])var2[4]));
               return var3;
            }
         }
      }
   }

   static final void b(int var0, Object[] var1) {
      if(var0 == -25563) {
         if(var1[1] == null) {
            var1[1] = new int[1];
         }

         ++b;
      }
   }

   static final cga a(int var0, int var1, byte var2, boolean var3, int var4, int var5, Object[] var6) {
      if(var2 > -28) {
         return (cga)null;
      } else {
         ++e;
         Object[] var7;
         return (cga)(null == (var7 = lta.a(new Object[6], var4, var6, var1, var5, var0, -92))?null:var7[2]);
      }
   }

   static final int a(byte var0, Object[] var1) {
      if(var0 != 60) {
         a((byte)53, (Object[])null);
      }

      ++a;
      return ((int[])((int[])var1[3]))[2];
   }

}
