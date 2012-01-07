import jaggl.OpenGL;

final class qj {

   static int c;
   static Object[] b = ve.a(new Object[1], (byte)3, 2);
   static int e;
   static int d;
   static boolean[][][] a;
   static int h;
   static int f;
   static int g;


   static final Object[] a(Object[] var0, Object[] var1, int var2, int var3, Object[] var4) {
      af.c(var1, 1);
      if(var3 <= 97) {
         return (Object[])null;
      } else {
         ++g;
         var1[1] = var4;
         if(null != var1[1]) {
            jla.a((Object[])((Object[])var1[1]), (byte)26, 35);
         }

         return var1;
      }
   }

   static final void a(int var0, Object[] var1) {
      ++e;
      if(null == var1[0]) {
         var1[0] = new int[7];
      }

      if(var0 != 19061) {
         ((Object[])((Object[])((Object[])((Object[])var1[5]))[22]))[6] = (Object)null;
      }

   }

   static final boolean a(int var0, int var1, Object[] var2) {
      if(var1 != 35) {
         ((int[])((int[])((Object[])((Object[])((Object[])((Object[])var2[14]))[0]))[1]))[5] = -94;
      }

      ++d;
      if(var2[7] == null) {
         var2[7] = new int[qsa.a((byte)-9, (Object[])((Object[])var2[8]))];
      }

      Object[] var3 = sm.a(var1 - 32, var0, (Object[])((Object[])var2[8]));
      ((int[])((int[])var2[7]))[var0] = OpenGL.glGetUniformLocation(((int[])((int[])var3[4]))[1], uda.a((byte)-103, var2));
      return ~((int[])((int[])var2[7]))[var0] != 0;
   }

   static final int a(Object[] var0, int var1) {
      ++h;
      if(var1 < 46) {
         a(((int[])((int[])((Object[])((Object[])b[21]))[4]))[0], (Object[])null);
      }

      return -1 < ~((byte[])((byte[])var0[2]))[((int[])((int[])var0[1]))[0]]?lr.a(1, var0) & Integer.MAX_VALUE:de.a((int)0, var0);
   }

   static final boolean a(int var0, Object[] var1, int var2) {
      ++c;
      if(var2 != Integer.MAX_VALUE) {
         b = (Object[])null;
      }

      if(((int[])((int[])var1[12]))[23] == var0) {
         return true;
      } else {
         var1[32] = dk.a((int[])null, (Object[])null, var0, (byte)58, true);
         if(var1[32] != null) {
            ((int[])((int[])var1[12]))[23] = var0;
            nl.a((Object[][])((Object[][])((Object[])((Object[])var1[32]))[2]), (int)72);
            return true;
         } else {
            return false;
         }
      }
   }

}
