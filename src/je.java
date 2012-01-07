
final class je {

   static int e;
   static int h;
   static Object[] b = nla.a(-124, new Object[0], 5);
   static int a;
   static Object[] f;
   static int d;
   static int g;
   static int c;


   static final Object[] a(int var0, Object[] var1, int var2, byte var3) {
      ++e;
      if(var1[0] == null) {
         var1[0] = new int[2];
      }

      if(var3 >= -63) {
         return (Object[])null;
      } else {
         ((int[])((int[])var1[0]))[0] = var0;
         ((int[])((int[])var1[0]))[1] = var2;
         return var1;
      }
   }

   static final Object[] a(Object[] var0, boolean var1) {
      ++c;
      if(var0[1] == null) {
         var0[1] = new int[12];
      }

      wca.a(var1, var0);
      return var0;
   }

   static final boolean a(Object[] var0, int[] var1, int var2, byte var3, int var4, Object[] var5, Object[] var6) {
      ++g;
      if(var3 >= -43) {
         return ((boolean[])((boolean[])((Object[])((Object[])var0[5]))[1]))[5];
      } else if(!((boolean[])((boolean[])var5[0]))[0]) {
         if(var1.length <= var4) {
            return false;
         } else {
            ((int[])((int[])var5[1]))[0] = var1[var4];
            var5[2] = Class_fs.a(((int[])((int[])var5[1]))[0] >> 16, var6, 0);
            ((int[])((int[])var5[1]))[0] &= '\uffff';
            if(null == var5[2]) {
               return false;
            } else {
               if(((boolean[])((boolean[])var0[4]))[0] && -1 != var2 && ~var2 > ~var1.length) {
                  ((int[])((int[])var5[1]))[1] = var1[var2];
                  var5[3] = Class_fs.a(((int[])((int[])var5[1]))[1] >> 16, var6, 0);
                  ((int[])((int[])var5[1]))[1] &= '\uffff';
               }

               if(((boolean[])((boolean[])var0[4]))[1]) {
                  ((int[])((int[])var5[1]))[2] |= 512;
               }

               Object[] var8 = (Object[])((Object[])var5[2]);
               int var9 = ((int[])((int[])var5[1]))[0];
               boolean var7 = ((er[])((er[])var8[2]))[var9].f_l;
               if(var7) {
                  ((int[])((int[])var5[1]))[2] |= 128;
               }

               if(gi.a(((int[])((int[])var5[1]))[0], (byte)91, (Object[])((Object[])var5[2]))) {
                  ((int[])((int[])var5[1]))[2] |= 256;
               }

               if(pga.a((byte)-31, (Object[])((Object[])var5[2]), ((int[])((int[])var5[1]))[0])) {
                  ((int[])((int[])var5[1]))[2] |= 1024;
               }

               if(var5[3] != null) {
                  if(var6 != null && -3 == ~var6.length) {
                     return true;
                  }

                  Object[] var11 = (Object[])((Object[])var5[3]);
                  int var12 = ((int[])((int[])var5[1]))[1];
                  boolean var10 = ((er[])((er[])var11[2]))[var12].f_l;
                  if(var10) {
                     ((int[])((int[])var5[1]))[2] |= 128;
                  }

                  Object[] var14 = (Object[])((Object[])var5[3]);
                  int var15 = ((int[])((int[])var5[1]))[1];
                  boolean var13 = ((er[])((er[])var14[2]))[var15].f_i;
                  if(var13) {
                     ((int[])((int[])var5[1]))[2] |= 256;
                  }

                  if(pga.a((byte)124, (Object[])((Object[])var5[3]), ((int[])((int[])var5[1]))[1])) {
                     ((int[])((int[])var5[1]))[2] |= 1024;
                  }
               }

               ((boolean[])((boolean[])var5[0]))[0] = true;
               ((int[])((int[])var5[1]))[2] |= 32;
               return true;
            }
         }
      } else {
         return true;
      }
   }

   static final void a(int var0, int var1, Object[] var2, int var3) {
      if(var3 >= 104) {
         ++d;
      }
   }

}
