import java.util.Random;

final class lr {

   static int g;
   static int f;
   static Object[] e = ed.a(10, new Object[1], (byte)-124, 67);
   static int a;
   static int b;
   static int d;
   static int c;
   static int h;


   static final void a(int var0, byte[] var1, int var2, int var3, Object[] var4) {
      if(null != var4 && var4.length == 12) {
         dv.a(new Object[0][], (byte)-30);
      }

      ++a;
      if(var2 != 20244) {
         a(93, new Object[25], -29, true, -88);
      }

      for(int var5 = var3; var0 + var3 > var5; ++var5) {
         byte[] var10000 = (byte[])((byte[])var4[2]);
         int[] var10001 = (int[])((int[])var4[1]);
         int var10004 = ((int[])((int[])var4[1]))[0];
         var10001[0] = ((int[])((int[])var4[1]))[0] + 1;
         var10000[var10004] = var1[var5];
      }

   }

   static final void a(int var0, int var1) {
      ++d;
      int var3 = 44 % ((var0 + 15) / 39);
      Object[] var2 = la.a(0, (long)var1, 1);
      aia.a(var2, 1);
   }

   static final int a(int var0, Object[] var1) {
      ++g;
      ((int[])((int[])var1[var0]))[0] += 4;
      return (255 & ((byte[])((byte[])var1[2]))[-1 + ((int[])((int[])var1[1]))[0]]) + ((((byte[])((byte[])var1[2]))[((int[])((int[])var1[1]))[0] - 2] & 255) << 8) + ((((byte[])((byte[])var1[2]))[((int[])((int[])var1[1]))[0] - 3] & 255) << 16) + (((byte[])((byte[])var1[2]))[((int[])((int[])var1[1]))[0] - 4] << 24 & -16777216);
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, Object[] var5, int var6, int var7, int var8) {
      ++c;
      if(var7 >= 59) {
         if(bva.a(var5, (byte)-122)) {
            sqa.a(var2, false, -1, var1, var3, 12, var6, fb.a(false, (Object[])((Object[])var5[32])), var8, var0, var4);
         } else {
            if(-1 != var6) {
               qma.d[var6] = true;
            } else {
               for(int var9 = 0; 104 > var9; ++var9) {
                  qma.d[var9] = true;
               }

               if(var5 != null && 3 == var5.length) {
                  return;
               }
            }

         }
      }
   }

   static final Object[] a(int var0, Object[] var1, String var2) {
      if(var0 != -1) {
         e = (Object[])null;
      }

      es.a(24, var1);
      ++b;
      var1[2] = var2;
      return var1;
   }

   static final void a(int var0, Object[] var1, int var2, boolean var3, int var4) {
      ++h;
      if(((int[])((int[])var1[1]))[34] != var4 || ((int[])((int[])var1[1]))[23] != var2 || ((int[])((int[])var1[1]))[14] != var0) {
         ((int[])((int[])var1[1]))[14] = var0;
         ((int[])((int[])var1[1]))[23] = var2;
         ((int[])((int[])var1[1]))[34] = var4;
         pea.a(17, var1);
         kga.a(-102, var1);
      }

      if(var3) {
         a(((int[])((int[])e[0]))[16], (byte[])null, ((int[])((int[])((Object[])((Object[])e[18]))[12]))[0], -5, (Object[])((Object[])e[2]));
      }

   }

   static final int[] a(int var0, Object[] var1, byte var2) {
      ++f;
      if(var2 < 5) {
         a(((int[])((int[])((Object[])((Object[])e[0]))[6]))[22], ((int[])((int[])e[9]))[1], 77, 34, 19, (Object[])((Object[])e[4]), -107, -124, -89);
      }

      if(var0 >= 0 && ((Object[])((Object[])var1[0])).length > var0) {
         if(((boolean[])((boolean[])var1[3]))[var0] && ((int[][])((int[][])var1[0]))[var0].length > 1) {
            if(null != var1 && (var1.length == 1 && var1[0].equals(Integer.valueOf(0)) || var1.length == 1)) {
               return null;
            } else {
               int var3 = ((int[])((int[])var1[1]))[0] != -1?1:0;
               Random var4 = new Random();
               int[] var5 = new int[((int[][])((int[][])var1[0]))[var0].length];
               qo.a(((int[][])((int[][])var1[0]))[var0], 0, var5, 0, var5.length);

               for(int var6 = var3; var6 < var5.length; ++var6) {
                  int var7 = var3 + cl.a(37, var4, var5.length - var3);
                  int var8 = var5[var6];
                  var5[var6] = var5[var7];
                  var5[var7] = var8;
               }

               return var5;
            }
         } else {
            return ((int[][])((int[][])var1[0]))[var0];
         }
      } else {
         return -1 == ((int[])((int[])var1[1]))[0]?new int[0]:new int[]{((int[])((int[])var1[1]))[0]};
      }
   }

}
